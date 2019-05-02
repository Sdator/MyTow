/*     */ package kava.lang;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ public class Threak
/*     */   extends Thread implements Runnable
/*     */ {
/*   9 */   static boolean haveData = false;
/*     */   
/*  11 */   static int accType = 0;
/*     */   
/*  13 */   static long imin = 10L;
/*     */   
/*  15 */   static long ipara = 10L;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Threak() {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Threak(String name)
/*     */   {
/*  32 */     super(name);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Threak(Runnable rt)
/*     */   {
/*  44 */     super(rt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Threak(Runnable rt, String name)
/*     */   {
/*  56 */     super(rt, name);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void getData(InputStream is)
/*     */   {
/*     */     try
/*     */     {
/*  76 */       byte[] b = new byte[is.available()];
/*     */       
/*  78 */       is.read(b);
/*     */       
/*  80 */       String s = new String(b, 0, b.length, "utf8");
/*     */       
/*  82 */       System.out.println("测试" + s);
/*     */       
/*     */ 
/*     */ 
/*  86 */       int ip1 = s.indexOf("变速类型=");
/*     */       
/*  88 */       int ip2 = s.indexOf("变速参数=");
/*     */       
/*  90 */       int ip3 = s.indexOf("最小延迟=");
/*     */       
/*  92 */       accType = Integer.parseInt(s.substring(ip1 + 5, ip2));
/*     */       
/*  94 */       ipara = Integer.parseInt(s.substring(ip2 + 5, ip3));
/*     */       
/*  96 */       imin = Integer.parseInt(s.substring(ip3 + 5));
/*     */ 
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 101 */       e.printStackTrace();
/*     */       
/* 103 */       accType = 0;
/*     */       
/* 105 */       imin = 10L;
/*     */       
/* 107 */       ipara = 10L;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void sleep(long lt)
/*     */   {
/* 115 */     if (!haveData)
/*     */     {
/* 117 */       getData(new th().getRes());
/*     */       
/* 119 */       haveData = true;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 126 */       switch (accType)
/*     */       {
/*     */ 
/*     */       case 0: 
/* 130 */         if (ipara == 0L)
/*     */         {
/* 132 */           ipara = 1L;
/*     */         }
/*     */         
/* 135 */         lt = imin > lt - ipara ? imin : lt / ipara;
/*     */         
/* 137 */         break;
/*     */       
/*     */ 
/*     */ 
/*     */       case 1: 
/* 142 */         lt = imin > lt - ipara ? imin : lt - ipara;
/*     */         
/* 144 */         break;
/*     */       
/*     */ 
/*     */       case 2: 
/* 148 */         lt = ipara;
/*     */         
/* 150 */         break;
/*     */       
/*     */ 
/*     */ 
/*     */       case 3: 
/* 155 */         lt += ipara;
/*     */         
/* 157 */         break;
/*     */       
/*     */ 
/*     */       case 4: 
/* 161 */         lt *= ipara;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 168 */       Thread.sleep(lt);
/*     */     }
/*     */     catch (Exception localException) {}
/*     */   }
/*     */ }


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\kava\lang\Threak.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */