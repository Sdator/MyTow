import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import kava.lang.Threak;

public class y
  extends ap
  implements CommandListener, ItemStateListener, Runnable
{
  static boolean ay = true;
  static final short ac = 31;
  h l;
  boolean S;
  boolean aG;
  byte jdField_void = 0;
  byte n = 0;
  byte aC = 0;
  String[] jdField_goto;
  String[][] V;
  byte a9 = 0;
  byte[] g = null;
  byte I;
  byte jdField_long;
  static final byte ae = 0;
  public static int jdField_int = 0;
  short a5 = 0;
  short ak = 0;
  String aZ = null;
  String aJ = null;
  String ba;
  String aI;
  Command O;
  Command aS;
  Form aK;
  Form aY;
  Form H;
  TextField jdField_byte;
  TextField aM;
  ChoiceGroup ad;
  ChoiceGroup a4;
  ChoiceGroup a2;
  ChoiceGroup a0;
  ChoiceGroup aX;
  TextField aE;
  TextField aD;
  TextField ax;
  TextField ab;
  TextField jdField_case;
  TextField ag;
  Image bd = null;
  static final byte u = 0;
  static final byte p = 1;
  static final byte jdField_else = 2;
  static final byte Q = 3;
  static final byte r = 4;
  static final byte a1 = 5;
  static final byte L = 6;
  static final byte T = 7;
  static final byte t = 8;
  static final byte a3 = 9;
  static final byte an = 10;
  static final byte aO = 18;
  static final byte i = 11;
  static final byte f = 12;
  static final byte ap = 13;
  static final byte a6 = 14;
  static final byte D = 15;
  static final byte al = 16;
  static final byte aR = 17;
  static final byte G = 19;
  static final byte aH = 20;
  static final byte M = 21;
  static final byte b = 22;
  static final byte af = 23;
  byte e = 0;
  byte az = -1;
  byte h = -1;
  boolean aF = false;
  boolean aN;
  String am;
  String[] A = null;
  byte[] C = null;
  static String[] au = { "logo", "cover1", "frame", "cursor", "arrow" };
  Image[] y = new Image[5];
  byte F = 0;
  byte Y = 1;
  byte R = 2;
  byte as = 3;
  byte P = 4;
  String Z = null;
  static String[] a8 = null;
  byte B = (byte)((h.fp - 25) / 22);
  byte ar;
  byte d;
  byte a7;
  byte aj;
  byte jdField_null = (byte)(h.fp / 30);
  boolean ai;
  String ah;
  boolean aP = false;
  boolean q = false;
  static int W = 0;
  a2 j = null;
  byte jdField_try;
  int bc;
  String[] J = null;
  byte[] U = null;
  byte[] z = null;
  boolean[] K = null;
  byte[] aU = null;
  short[][] aQ = (short[][])null;
  int[][] x = (int[][])null;
  byte v;
  byte aB;
  private static final String[] X = { "快速进入", "登录游戏", "注册帐号", "网络设置", "游戏帮助", "游戏充值", "访问官网", "退出游戏" };
  private byte ao = 0;
  private static final byte[] m = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 14 };
  private byte aa = 0;
  private byte jdField_char = 0;
  private byte aT = 0;
  private byte aq = 0;
  private int[][] s = (int[][])null;
  short aw;
  short av;
  short k;
  short aL;
  short at = 5;
  short c = (short)(h.dU / 2 + 5);
  short[] aW = null;
  short[] aV = null;
  short aA;
  short w;
  byte o = 0;
  byte bb = 0;
  boolean N;
  byte E;
  
  public y()
  {
    jdMethod_try();
  }
  
  public void jdMethod_try()
  {
    try
    {
      for (int i1 = 0; i1 < 5; i1++) {
        this.y[i1] = Image.createImage("/" + au[i1] + ".png");
      }
    }
    catch (IOException localIOException) {}
  }
  
  public boolean a(String paramString)
  {
    RecordStore localRecordStore = null;
    try
    {
      localRecordStore = RecordStore.openRecordStore(paramString, false);
      boolean bool;
      return true;
    }
    catch (Exception localException2)
    {
      h.a(localException2);
      bool = false;
      return bool;
    }
    finally
    {
      try
      {
        if (localRecordStore != null)
        {
          localRecordStore.closeRecordStore();
          localRecordStore = null;
        }
      }
      catch (Exception localException4) {}
    }
  }
  
  public void a(h paramh)
  {
    this.l = paramh;
    a.V = h.jdMethod_if(a.ae / a.n, a.ae);
    W = 0;
    if (ay)
    {
      ay = false;
      a((byte)22);
    }
    else
    {
      a((byte)0);
    }
    this.l.bq = false;
    this.l.dl = 0;
    this.l.ey = 0;
    this.l.dl = 0;
  }
  
  public void jdMethod_byte()
  {
    this.O = new Command("确定", 4, 0);
    this.aS = new Command("返回", 3, 1);
    this.H = new Form("身份登记卡");
    this.jdField_byte = new TextField("角色昵称:", "", 10, 0);
    this.H.append(this.jdField_byte);
    this.H.addCommand(this.O);
    this.H.addCommand(this.aS);
    this.H.setCommandListener(this);
    Display.getDisplay(this.l.fG).setCurrent(this.H);
  }
  
  public void jdMethod_else()
  {
    this.O = new Command("确定", 4, 0);
    this.aS = new Command("返回", 3, 1);
    this.aK = new Form("删除角色");
    this.aM = new TextField("输入密保码:", "", 10, 65536);
    this.aK.append(this.aM);
    this.aK.addCommand(this.O);
    this.aK.addCommand(this.aS);
    this.aK.setCommandListener(this);
    Display.getDisplay(this.l.fG).setCurrent(this.aK);
  }
  
  public void jdMethod_if(boolean paramBoolean)
  {
    this.ai = paramBoolean;
    this.O = new Command("确定", 4, 0);
    this.aS = new Command("返回", 3, 1);
    this.aY = new Form("登录");
    this.jdField_byte = new TextField("帐号:", this.l.dv.trim(), 15, 0);
    this.aM = new TextField("密码:", "" + (this.l.F ? this.l.dw : ""), 10, 0);
    this.a4 = new ChoiceGroup("", 2);
    this.a4.append("记住密码", null);
    this.a4.setSelectedIndex(0, this.l.F);
    this.ad = new ChoiceGroup("", 2);
    this.ad.append("卡图复位", null);
    this.ad.setSelectedIndex(0, false);
    this.a2 = new ChoiceGroup("", 2);
    this.a2.append("修改密码", null);
    this.a2.setSelectedIndex(0, false);
    this.aE = new TextField("新密码:", "", 10, 65536);
    this.aD = new TextField("确认新密码:", "", 10, 65536);
    this.a0 = new ChoiceGroup("", 2);
    this.a0.append("找回密码", null);
    this.a0.setSelectedIndex(0, false);
    this.ag = new TextField("密保码:", "", 10, 65536);
    this.aX = new ChoiceGroup("", 2);
    this.aX.append("绑定手机号和密保码", null);
    this.aX.setSelectedIndex(0, false);
    this.ax = new TextField("手机号:", "", 22, 2);
    this.ab = new TextField("密保码:", "", 10, 65536);
    this.jdField_case = new TextField("再次输入密保码:", "", 10, 65536);
    this.aY.append(this.jdField_byte);
    this.aY.append(this.aM);
    this.aY.append(this.a4);
    if (!this.ai)
    {
      this.aY.append(this.ad);
      this.aY.append("      ");
      this.aY.append(this.a2);
      this.aY.append(this.aE);
      this.aY.append(this.aD);
      this.aY.append(this.a0);
      this.aY.append(this.ag);
      this.aY.append(this.aX);
    }
    else
    {
      this.aX.setSelectedIndex(0, true);
      this.aY.append("输入手机号和密保码:");
    }
    this.aY.append(this.ax);
    this.aY.append(this.ab);
    this.aY.append(this.jdField_case);
    this.aY.append("请您牢记密保码,它是您找回登陆密码和删除角色的唯一凭证,如泄露或遗忘可能导致帐号丢失等严重后果!");
    this.aY.addCommand(this.O);
    this.aY.addCommand(this.aS);
    this.aY.setCommandListener(this);
    this.aY.setItemStateListener(this);
    Display.getDisplay(this.l.fG).setCurrent(this.aY);
  }
  
  public void jdMethod_if(String paramString1, String paramString2)
  {
    Alert localAlert = new Alert(paramString1, paramString2, null, AlertType.WARNING);
    localAlert.setTimeout(2000);
    Display.getDisplay(this.l.fG).setCurrent(localAlert);
  }
  
  public void a(int paramInt1, int paramInt2, DataInputStream paramDataInputStream)
  {
    int i1 = 0;
    String str1 = null;
    try
    {
      if (paramInt2 == 1)
      {
        i1 = paramDataInputStream.readByte();
        str1 = paramDataInputStream.readUTF();
      }
      int i4;
      int i7;
      byte b2;
      short s2;
      short s9;
      short s10;
      short s11;
      switch (paramInt1)
      {
      case 3732: 
        int i2 = paramDataInputStream.readInt();
        int i3 = paramDataInputStream.readInt();
        byte b1 = paramDataInputStream.readByte();
        if (this.l.cZ.fL == i2)
        {
          this.l.cZ.ge = i3;
          this.l.cZ.gm = b1;
        }
        break;
      case 6705: 
        this.l.av = paramDataInputStream.readShort();
        this.l.fw = paramDataInputStream.readShort();
        if (this.l.av >= this.l.fw) {
          this.l.a((byte)0, false);
        } else {
          this.l.a((byte)0, true);
        }
        break;
      case 1013: 
        if (paramInt2 == 1)
        {
          this.aJ = str1;
          g.gf = 0;
          this.jdField_do = 3;
          return;
        }
        this.J[this.v] = null;
        this.aJ = "删除角色成功.";
        g.gf = 0;
        this.jdField_do = 3;
        this.aB = 1;
        break;
      case 1012: 
        if (paramInt2 == 1)
        {
          this.aJ = str1;
          g.gf = 0;
          this.jdField_do = 3;
          return;
        }
        for (i4 = 0; i4 < this.J.length; i4 = (byte)(i4 + 1)) {
          if (this.J[i4] == null)
          {
            this.J[i4] = this.jdField_byte.getString().trim();
            this.aU[i4] = 1;
            this.U[i4] = this.jdField_char;
            this.z[i4] = this.aT;
            this.K[i4] = false;
            for (int i5 = 0; i5 < 8; i5 = (byte)(i5 + 1)) {
              this.aQ[i4][i5] = -1;
            }
            break;
          }
        }
        this.aJ = "创建角色成功.";
        g.gf = 0;
        this.jdField_do = 3;
        this.aB = 0;
        break;
      case 1008: 
        if (paramInt2 == 0)
        {
          this.aJ = paramDataInputStream.readUTF();
          this.l.dv = this.ba;
          this.l.dw = "";
          this.l.jdField_do = "";
          this.l.D();
        }
        else
        {
          this.aJ = str1;
        }
        g.gf = 0;
        this.jdField_do = 1;
        break;
      case 9950: 
        i4 = paramDataInputStream.readByte();
        if (i4 == 2)
        {
          this.ah = paramDataInputStream.readUTF();
          this.jdField_do = 23;
        }
        else
        {
          int i9;
          if (i4 == 1)
          {
            String str2 = paramDataInputStream.readUTF();
            h.b9 = paramDataInputStream.readUTF();
            h.ea = paramDataInputStream.readUTF();
            h.bB = paramDataInputStream.readUTF();
            this.Z = paramDataInputStream.readUTF();
            if (!str2.equals(h.fY))
            {
              System.out.println("serverVersion:" + str2);
              this.jdField_do = 14;
            }
            else
            {
              this.Z = null;
              this.e = paramDataInputStream.readByte();
              h.aD = new String[this.e];
              h.fN = new String[this.e];
              h.aJ = new String[this.e];
              h.aO = new boolean[this.e];
              h.bz = new boolean[this.e];
              h.ce = new short[this.e];
              h.bw = new short[this.e];
              h.bX = new byte[this.e];
              for (i7 = 0; i7 < this.e; i7++)
              {
                h.aD[i7] = paramDataInputStream.readUTF();
                h.fN[i7] = paramDataInputStream.readUTF();
                h.aJ[i7] = paramDataInputStream.readUTF();
                h.aO[i7] = (paramDataInputStream.readByte() == 0 ? 1 : false);
                h.bz[i7] = (paramDataInputStream.readByte() == 0 ? 1 : false);
                h.ce[i7] = paramDataInputStream.readShort();
                h.bw[i7] = paramDataInputStream.readShort();
                h.bX[i7] = paramDataInputStream.readByte();
              }
              this.az = -1;
              this.h = paramDataInputStream.readByte();
              i7 = paramDataInputStream.readByte();
              if (i7 > 0)
              {
                this.aN = false;
                this.aF = true;
                h.cD = new String[i7];
                h.eh = new byte[i7][];
                for (int i8 = 0; i8 < i7; i9 = (byte)(i8 + 1))
                {
                  h.cD[i8] = paramDataInputStream.readUTF();
                  b2 = paramDataInputStream.readByte();
                  h.eh[i8] = new byte[b2];
                  for (byte b3 = 0; b3 < b2; b3 = (byte)(b3 + 1)) {
                    h.eh[i8][b3] = paramDataInputStream.readByte();
                  }
                }
              }
              q.c3 = paramDataInputStream.readUTF();
              q.dC = paramDataInputStream.readUTF();
              jdMethod_new();
              if (this.az == this.h) {
                this.h = -1;
              }
              a(false);
              this.aj = 0;
              this.a7 = 0;
              this.jdField_do = 16;
            }
          }
          else if (i4 == 0)
          {
            this.l.jdMethod_for(paramDataInputStream);
            this.l.jdMethod_if(paramDataInputStream);
            h.e5 = paramDataInputStream.readByte();
            this.l.jdMethod_char(paramDataInputStream);
            this.l.jdMethod_try(paramDataInputStream);
            this.l.a(paramDataInputStream);
            this.l.jdMethod_int(paramDataInputStream);
            int i6 = paramDataInputStream.readShort();
            this.l.cH = new byte[i6];
            this.l.d8 = new byte[i6];
            paramDataInputStream.readFully(this.l.d8);
            h.bm = paramDataInputStream.readByte();
            paramDataInputStream.readFully(this.l.cH);
            i7 = paramDataInputStream.readByte();
            h.eK = new String[i7];
            h.aA = new short[i7];
            h.es = new short[i7];
            for (i9 = 0; i9 < i7; s2 = (byte)(i9 + 1))
            {
              h.eK[i9] = paramDataInputStream.readUTF();
              h.es[i9] = paramDataInputStream.readShort();
              h.aA[i9] = paramDataInputStream.readShort();
            }
            h.fh = paramDataInputStream.readByte();
            h.e1 = paramDataInputStream.readByte();
            h.a1 = paramDataInputStream.readByte();
            h.cu = paramDataInputStream.readByte();
            h.aw = paramDataInputStream.readByte();
            if (!this.N)
            {
              if (this.E == 0)
              {
                g.gf = 0;
                this.jdField_do = 12;
              }
              else
              {
                jdMethod_case();
              }
            }
            else
            {
              this.q = false;
              a((byte)10);
            }
          }
        }
        break;
      case 1004: 
        if (paramInt2 == 1)
        {
          this.aJ = str1;
          g.gf = 0;
          this.jdField_do = 11;
          return;
        }
        this.aJ = ("密码为" + paramDataInputStream.readUTF());
        g.gf = 0;
        this.jdField_do = 11;
        break;
      case 1017: 
        if (paramInt2 == 1)
        {
          this.aJ = str1;
          g.gf = 0;
          this.jdField_do = 11;
          return;
        }
        this.l.D();
        this.l.aG.a(paramDataInputStream.readInt());
        this.l.aG.bQ = paramDataInputStream.readLong();
        this.l.cZ.dC = q.cB;
        this.l.cZ.O = paramDataInputStream.readUTF();
        this.l.cZ.m(paramDataInputStream.readByte());
        this.l.cZ.jdMethod_void(paramDataInputStream.readByte());
        this.l.cZ.fa = (paramDataInputStream.readByte() > 0);
        h.ek = paramDataInputStream.readByte() == 1;
        this.l.cZ.g4 = (paramDataInputStream.readByte() == 1);
        this.l.cZ.fY = paramDataInputStream.readShort();
        if (!h.ek) {
          h.dh = new String[] { "个人", "宠物", "交互", "聊天", "商城", "系统" };
        }
        byte[] arrayOfByte1 = new byte[54];
        paramDataInputStream.readFully(arrayOfByte1);
        this.l.cZ.a(arrayOfByte1);
        this.l.cZ.a7 = new short[a.ad];
        this.l.cZ.H = new int[a.ad];
        for (i7 = 0; i7 < a.ad; i7 = (byte)(i7 + 1))
        {
          this.l.cZ.a7[i7] = paramDataInputStream.readShort();
          this.l.cZ.H[i7] = a3.a(this.l.cZ.a7[i7], a.t);
        }
        this.l.cZ.a(paramDataInputStream);
        this.l.cZ.h6 = new byte[h.e5];
        for (i7 = 0; i7 < h.e5; i7 = (byte)(i7 + 1)) {
          this.l.cZ.h6[i7] = paramDataInputStream.readByte();
        }
        this.l.cZ.dF = new short[ag.f7][2];
        for (i7 = 0; i7 < ag.f7; s1 = (byte)(i7 + 1))
        {
          s2 = paramDataInputStream.readShort();
          b2 = paramDataInputStream.readByte();
          if (b2 == 0)
          {
            if (!this.l.cZ.j((byte)s2))
            {
              s2 = -1;
              b2 = -1;
            }
          }
          else if ((b2 == 1) && (this.l.cZ.a((byte)0, s2) < 0) && (this.l.cZ.a((byte)1, s2) < 0))
          {
            s2 = -1;
            b2 = -1;
          }
          this.l.cZ.jdMethod_if(i7, s2, b2);
        }
        short s1 = paramDataInputStream.readShort();
        for (s2 = 0; s2 < s1; s2++)
        {
          short s3 = paramDataInputStream.readShort();
          this.l.bR.jdMethod_for(s3);
        }
        s1 = paramDataInputStream.readShort();
        for (s2 = 0; s2 < s1; s2 = (byte)(s2 + 1))
        {
          paramDataInputStream.readShort();
          ao localao = new ao(paramDataInputStream);
          paramDataInputStream.readByte();
          if ((!localao.jdField_char) && (this.l.bR.jdMethod_case(localao.E)))
          {
            if (this.l.aG.jdMethod_int(5845))
            {
              this.l.aG.jdMethod_new(localao.E);
              this.l.aG.jdMethod_if();
            }
          }
          else {
            this.l.bR.jdMethod_do(localao);
          }
        }
        this.l.eb = paramDataInputStream.readShort();
        if (this.l.eb < 4) {
          this.l.eb = 4;
        }
        this.a5 = paramDataInputStream.readShort();
        this.l.aW = paramDataInputStream.readShort();
        this.l.aV = paramDataInputStream.readShort();
        this.l.bq = false;
        this.l.bD = paramDataInputStream.readInt();
        this.l.ey = paramDataInputStream.readInt();
        if ((this.l.bD > 0) && (this.l.ey > 0))
        {
          this.l.bq = true;
          this.l.dl = (this.l.bD * this.l.ey);
        }
        this.l.cZ.he = (paramDataInputStream.readByte() != 0);
        int i10 = paramDataInputStream.readInt();
        int i11 = paramDataInputStream.readByte();
        if (i10 != -1)
        {
          this.l.cZ.gz = i10;
          this.l.cZ.gE = true;
          if (i11 == 2) {
            this.l.cZ.dU = true;
          }
        }
        int i12 = paramDataInputStream.readInt();
        this.l.cZ.fL = i12;
        if (i12 != -1)
        {
          this.l.cZ.es = paramDataInputStream.readUTF();
          this.l.cZ.fj = paramDataInputStream.readByte();
          this.l.cZ.fx = paramDataInputStream.readByte();
          b4 = paramDataInputStream.readByte();
          b4 = (byte)Math.max(b4, 0);
          b4 = (byte)Math.min(12, b4);
          this.l.cZ.hq = b4;
          if (this.l.cZ.fx < 0) {
            this.l.cZ.fx = 0;
          }
        }
        byte b4 = paramDataInputStream.readByte();
        this.l.cZ.fc = new boolean[8];
        h.e8 = 0;
        for (int i13 = 0; i13 < b4; i13 = (byte)(i13 + 1))
        {
          short s4 = paramDataInputStream.readShort();
          short s5 = paramDataInputStream.readShort();
          localObject1 = paramDataInputStream.readUTF();
          boolean bool = paramDataInputStream.readByte() != 0;
          s7 = paramDataInputStream.readShort();
          s9 = paramDataInputStream.readShort();
          s10 = paramDataInputStream.readShort();
          s11 = paramDataInputStream.readShort();
          short s12 = paramDataInputStream.readShort();
          short s13 = paramDataInputStream.readShort();
          short s14 = paramDataInputStream.readShort();
          short s15 = paramDataInputStream.readShort();
          byte b5 = 0;
          this.l.a(s4, s5, (String)localObject1, bool, s7, s9, s10, s11, s12, s13, s14, s15, b5);
          if (bool) {
            for (int i16 = 0; i16 < this.l.cZ.a7.length; i16 = (byte)(i16 + 1)) {
              if (this.l.cZ.a7[i16] == s4)
              {
                this.l.cZ.fc[i16] = true;
                break;
              }
            }
          }
        }
        this.l.d5 = true;
        if (this.l.S != null) {
          this.l.S.ad = false;
        }
        this.l.cJ.kP.removeAllElements();
        this.l.cJ.bG = 0;
        this.l.cJ.mR = 0;
        i13 = paramDataInputStream.readShort();
        if (i13 > 0)
        {
          byte[] arrayOfByte2 = new byte[i13];
          paramDataInputStream.readFully(arrayOfByte2, 0, arrayOfByte2.length);
          this.l.cJ.gn = Image.createImage(arrayOfByte2, 0, arrayOfByte2.length);
          this.l.cZ.fi = true;
        }
        else
        {
          this.l.cJ.gn = null;
        }
        this.l.cZ.gR = null;
        h.f0 = paramDataInputStream.readByte();
        this.l.jdField_try = paramDataInputStream.readByte();
        this.l.b7 = new a3[h.f0];
        for (int i14 = 0; i14 < this.l.jdField_try; i14 = (byte)(i14 + 1))
        {
          String str3 = paramDataInputStream.readUTF();
          localObject1 = new byte[54];
          paramDataInputStream.readFully((byte[])localObject1);
          this.l.b7[i14] = new a3(this.l, null);
          this.l.b7[i14].O = str3;
          this.l.b7[i14].a((byte[])localObject1);
          if (this.l.b7[i14].a((byte)12) == 2) {
            this.l.cZ.gR = this.l.b7[i14];
          }
        }
        i14 = paramDataInputStream.readByte();
        this.l.cK = new int[i14];
        for (int i15 = 0; i15 < i14; i15 = (byte)(i15 + 1)) {
          this.l.cK[i15] = paramDataInputStream.readInt();
        }
        i15 = paramDataInputStream.readShort();
        Object localObject1 = new byte[i15];
        paramDataInputStream.readFully((byte[])localObject1);
        this.l.cP = Image.createImage((byte[])localObject1, 0, localObject1.length);
        short s6 = paramDataInputStream.readByte();
        h.dt = new int[s6];
        h.dC = new String[s6];
        for (short s7 = 0; s7 < s6; s7 = (byte)(s7 + 1))
        {
          h.dt[s7] = paramDataInputStream.readInt();
          h.dC[s7] = paramDataInputStream.readUTF();
        }
        this.l.G();
        this.l.cJ.jdField_if = this.a5;
        this.l.a(this, this.l.cJ);
        break;
      case 1003: 
        if (paramInt2 == 1)
        {
          this.I = paramDataInputStream.readByte();
          this.jdField_long = paramDataInputStream.readByte();
          this.S = false;
          this.aJ = str1;
          g.gf = 0;
          this.jdField_do = 13;
          return;
        }
        if (!this.S)
        {
          this.l.F = this.a4.isSelected(0);
          this.l.jdMethod_else();
          this.l.dv = this.ba;
          this.l.dw = this.aI;
          this.l.jdField_do = "";
          this.l.D();
        }
        h.b9 = paramDataInputStream.readUTF();
        h.ea = paramDataInputStream.readUTF();
        h.bB = paramDataInputStream.readUTF();
        q.ct = paramDataInputStream.readUTF();
        short s8 = paramDataInputStream.readByte();
        g.he = new String[s8];
        g.dM = new String[s8];
        g.eo = new String[s8];
        g.kv = new byte[s8];
        for (s9 = 0; s9 < s8; s9 = (byte)(s9 + 1))
        {
          g.he[s9] = paramDataInputStream.readUTF();
          g.dM[s9] = paramDataInputStream.readUTF();
          g.eo[s9] = paramDataInputStream.readUTF();
          g.kv[s9] = paramDataInputStream.readByte();
        }
        s8 = paramDataInputStream.readByte();
        e.try = new String[s8];
        e.int = new byte[s8];
        e.new = new byte[s8];
        e.a = new byte[s8];
        e.byte = new String[s8];
        for (s9 = 0; s9 < s8; s9 = (byte)(s9 + 1))
        {
          e.try[s9] = paramDataInputStream.readUTF();
          e.byte[s9] = paramDataInputStream.readUTF();
          e.int[s9] = paramDataInputStream.readByte();
          e.a[s9] = paramDataInputStream.readByte();
          e.new[s9] = paramDataInputStream.readByte();
        }
        this.jdField_try = paramDataInputStream.readByte();
        this.bc = paramDataInputStream.readInt();
        s9 = paramDataInputStream.readByte();
        s9 = (byte)Math.min(2, s9);
        this.J = new String[2];
        this.aU = new byte[2];
        this.U = new byte[2];
        this.z = new byte[2];
        this.K = new boolean[2];
        this.aQ = new short[2][8];
        this.x = new int[2][5];
        this.aG = false;
        for (s10 = 0; s10 < s9; s10 = (byte)(s10 + 1))
        {
          this.J[s10] = paramDataInputStream.readUTF();
          this.aU[s10] = paramDataInputStream.readByte();
          this.U[s10] = paramDataInputStream.readByte();
          this.z[s10] = paramDataInputStream.readByte();
          this.K[s10] = (paramDataInputStream.readByte() > 0 ? 1 : false);
          for (s11 = 0; s11 < 8; s11 = (byte)(s11 + 1)) {
            this.aQ[s10][s11] = paramDataInputStream.readShort();
          }
          if (this.l.jdField_do.equals(this.J[s10])) {
            this.aG = true;
          }
        }
        this.E = paramDataInputStream.readByte();
        if (this.l.aG.jdMethod_int(9950))
        {
          this.l.aG.jdMethod_do(0);
          this.l.aG.jdMethod_if(h.bL);
          this.l.aG.jdMethod_do(h.cz ? 1 : 0);
          this.l.aG.jdMethod_if(h.fY);
          this.l.aG.jdMethod_if();
        }
        this.aZ = "获取数据...";
        int = 0;
        this.jdField_do = 9;
      }
    }
    catch (Exception localException2)
    {
      h.a(localException2);
    }
    finally
    {
      try
      {
        if (paramDataInputStream != null) {
          paramDataInputStream.close();
        }
      }
      catch (Exception localException9) {}
      paramDataInputStream = null;
    }
  }
  
  public void itemStateChanged(Item paramItem)
  {
    if (paramItem == this.a2)
    {
      if (this.a2.isSelected(0))
      {
        this.a0.setSelectedIndex(0, false);
        this.aX.setSelectedIndex(0, false);
        this.ax.setString("");
      }
    }
    else if (paramItem == this.a0)
    {
      if (this.a0.isSelected(0))
      {
        this.a2.setSelectedIndex(0, false);
        this.aE.setString("");
        this.aD.setString("");
        this.aX.setSelectedIndex(0, false);
        this.ax.setString("");
      }
    }
    else if (paramItem == this.aX)
    {
      if (this.aX.isSelected(0))
      {
        this.a2.setSelectedIndex(0, false);
        this.aE.setString("");
        this.aD.setString("");
        this.a0.setSelectedIndex(0, false);
        this.ax.setString("");
        this.ab.setString("");
        this.jdField_case.setString("");
      }
    }
    else if ((paramItem == this.ax) || (paramItem == this.ab) || (paramItem == this.jdField_case))
    {
      if (!this.aX.isSelected(0))
      {
        this.ax.setString("");
        this.ab.setString("");
        this.jdField_case.setString("");
        Alert localAlert = new Alert("提示", "请激活找回密码功能.", null, AlertType.WARNING);
        localAlert.setTimeout(2000);
        Display.getDisplay(this.l.fG).setCurrent(localAlert);
      }
    }
    else if ((paramItem == this.aX) && (!this.aX.isSelected(0))) {
      this.ax.setString("");
    }
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramDisplayable == this.aY)
    {
      if (paramCommand == this.O)
      {
        if ((!this.ai) && (this.a2.isSelected(0)))
        {
          if (!this.aE.getString().trim().equals(this.aD.getString().trim()))
          {
            this.l.jdMethod_char("两次输入密码不同.");
            return;
          }
          if (!h.j(this.aE.getString().trim())) {
            this.l.jdMethod_char("密码长度不得低于4位.");
          }
        }
        else if ((!this.ai) && (this.a0.isSelected(0)))
        {
          if (!h.j(this.ag.getString())) {
            this.l.jdMethod_char("密保码长度不得低于4位.");
          }
        }
        else if (this.aX.isSelected(0))
        {
          if (!h.jdMethod_new(this.ax.getString()))
          {
            this.l.jdMethod_char("请输入有效手机号.");
            return;
          }
          if (!h.j(this.ab.getString()))
          {
            this.l.jdMethod_char("密保码长度不得低于4位.");
            return;
          }
          if (this.ab.getString().trim().equals(this.aM.getString().trim()))
          {
            this.l.jdMethod_char("密保码不能和登陆密码一样.");
            return;
          }
          if (!this.ab.getString().trim().equals(this.jdField_case.getString().trim())) {
            this.l.jdMethod_char("两次输入的密保码不同.");
          }
        }
        else if (!h.j(this.aM.getString()))
        {
          this.l.jdMethod_char("密码长度不得低于4位.");
          return;
        }
        this.aZ = "请稍候...";
        int = 0;
        this.jdField_do = 9;
        Display.getDisplay(this.l.fG).setCurrent(this.l);
        try
        {
          this.ba = this.jdField_byte.getString();
          this.aI = this.aM.getString();
          this.aP = this.ad.isSelected(0);
          if (this.l.aG.jdMethod_int(1003))
          {
            this.l.aG.jdMethod_if(h.bL);
            this.l.aG.jdMethod_if(this.ba.trim());
            this.l.aG.jdMethod_if(this.aI.trim());
            if ((!this.ai) && (this.a2.isSelected(0)))
            {
              this.l.aG.jdMethod_do(1);
              this.l.aG.jdMethod_if(this.aE.getString().trim());
            }
            else
            {
              this.l.aG.jdMethod_do(0);
            }
            if ((!this.ai) && (this.a0.isSelected(0)))
            {
              this.l.aG.jdMethod_do(1);
              this.l.aG.jdMethod_if(this.ag.getString().trim());
            }
            else
            {
              this.l.aG.jdMethod_do(0);
            }
            if (this.aX.isSelected(0))
            {
              this.l.aG.jdMethod_do(1);
              this.l.aG.a(Long.parseLong(this.ax.getString()));
              this.l.aG.jdMethod_if(this.ab.getString().trim());
            }
            else
            {
              this.l.aG.jdMethod_do(0);
            }
            this.l.aG.jdMethod_for(h.jdMethod_if(1, 5));
            this.l.aG.jdMethod_if();
          }
        }
        catch (Exception localException) {}
        return;
      }
      if (paramCommand == this.aS)
      {
        a((byte)0);
        Display.getDisplay(this.l.fG).setCurrent(this.l);
      }
    }
    else if (paramDisplayable == this.H)
    {
      if (paramCommand == this.O)
      {
        if (!h.jdMethod_try(this.jdField_byte.getString()))
        {
          this.l.jdMethod_char("角色昵称长度要求3-6位.");
          return;
        }
        this.aZ = "请稍候...";
        int = 0;
        this.jdField_do = 9;
        Display.getDisplay(this.l.fG).setCurrent(this.l);
        if (this.l.aG.jdMethod_int(1012))
        {
          this.l.aG.jdMethod_if(this.l.dv);
          this.l.aG.jdMethod_if(this.l.dw);
          this.l.aG.jdMethod_if(this.jdField_byte.getString().trim());
          this.l.aG.jdMethod_do(this.aT);
          this.l.aG.jdMethod_do(this.jdField_char);
          this.l.aG.jdMethod_if();
        }
      }
      if (paramCommand == this.aS)
      {
        a((byte)7);
        Display.getDisplay(this.l.fG).setCurrent(this.l);
      }
    }
    else if (paramDisplayable == this.aK)
    {
      if (paramCommand == this.O)
      {
        if (!h.j(this.aM.getString()))
        {
          this.l.jdMethod_char("密保码长度不得低于4位.");
          return;
        }
        if (this.l.aG.jdMethod_int(1013))
        {
          this.l.aG.jdMethod_if(this.l.dv);
          this.l.aG.jdMethod_if(this.l.dw);
          this.l.aG.jdMethod_if(this.aM.getString().trim());
          this.l.aG.jdMethod_if(this.J[this.v]);
          this.l.aG.jdMethod_if();
        }
        this.aZ = "请稍候...";
        int = 0;
        this.jdField_do = 9;
        Display.getDisplay(this.l.fG).setCurrent(this.l);
      }
      if (paramCommand == this.aS)
      {
        a((byte)7);
        Display.getDisplay(this.l.fG).setCurrent(this.l);
        return;
      }
    }
  }
  
  public void a()
  {
    if (this.y != null)
    {
      for (int i1 = 0; i1 < 5; i1++) {
        if (this.y[i1] != null) {
          this.y[i1] = null;
        }
      }
      this.y = null;
    }
    if (a8 != null) {
      a8 = null;
    }
    this.A = null;
    this.C = null;
    this.am = null;
    this.l.E();
  }
  
  public void jdMethod_if(int paramInt1, int paramInt2) {}
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void jdMethod_if(int paramInt)
  {
    switch (this.jdField_do)
    {
    case 8: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        jdMethod_else();
        break;
      case 7: 
        a((byte)7);
      }
      break;
    case 7: 
      switch (paramInt)
      {
      case 1: 
        if (this.J[this.v] != null) {
          this.aB = 0;
        }
        break;
      case 2: 
        this.aB = 1;
        break;
      case 3: 
        this.v = 0;
        if (this.J[this.v] != null) {
          this.aB = 0;
        } else {
          this.aB = 1;
        }
        break;
      case 4: 
        this.v = 1;
        if (this.J[this.v] != null) {
          this.aB = 0;
        } else {
          this.aB = 1;
        }
        break;
      case 5: 
      case 6: 
        if (this.J[this.v] != null)
        {
          if (this.aB == 0)
          {
            this.l.jdField_do = this.J[this.v];
            if (this.l.aG.jdMethod_int(1017))
            {
              this.l.aG.jdMethod_if(this.l.dv);
              this.l.aG.jdMethod_if(this.l.dw);
              this.l.aG.jdMethod_if(this.J[this.v]);
              this.l.aG.jdMethod_do(this.aP ? 1 : 0);
              this.l.aG.jdMethod_do(1);
              this.l.aG.jdMethod_if();
            }
            this.aZ = "请稍候...";
            int = 0;
            this.jdField_do = 9;
          }
          else if (this.aB == 1)
          {
            this.jdField_do = 8;
          }
        }
        else if ((this.aB != 0) && (this.aB == 1))
        {
          this.q = true;
          a((byte)10);
        }
        break;
      case 7: 
        a((byte)0);
      }
      break;
    case 1: 
      switch (paramInt)
      {
      case 1: 
        g.gf = (byte)(g.gf - 1);
        if (g.gf < 0) {
          g.gf = 0;
        }
        break;
      case 2: 
      case 5: 
      case 6: 
        g.gf = (byte)(g.gf + 1);
      }
      break;
    case 21: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        if (this.q)
        {
          jdMethod_byte();
        }
        else
        {
          this.l.cZ.jdMethod_void(this.jdField_char);
          this.l.cZ.m(this.aT);
          this.l.cZ.fa = false;
          this.l.cZ.at();
          this.l.d5 = true;
          this.l.cJ.jdField_if = 1;
          this.l.aW = 10;
          this.l.aV = 140;
          this.l.a(this, this.l.cJ);
        }
        break;
      case 7: 
        this.jdField_do = 18;
        break;
      case 3: 
      case 4: 
        if (int <= 4) {
          return;
        }
        this.aq = ((byte)paramInt);
        int = 0;
      }
      break;
    case 17: 
    case 23: 
      switch (paramInt)
      {
      case 2: 
      case 5: 
        a((byte)0);
      }
      break;
    case 4: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        a((byte)0);
      }
      break;
    case 16: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        if (this.C.length == 0) {
          return;
        }
        if ((!this.S) && (this.C[(this.a7 + this.aj)] == -1))
        {
          this.am = this.A[(this.a7 + this.aj)];
          a(true);
          this.aj = 0;
          this.a7 = 0;
          this.jdField_do = 16;
          return;
        }
        if (!this.S)
        {
          this.l.fA = this.C[(this.a7 + this.aj)];
          if (this.ao == 0)
          {
            this.ao = 2;
            this.S = false;
          }
        }
        else if ((this.l.dv.trim().length() == 0) && (this.l.dw.trim().length() == 0))
        {
          this.ao = 2;
          this.S = false;
        }
        if ((this.ao <= 2) && (h.aJ[this.l.fA].equals("维护")))
        {
          this.S = false;
          this.aJ = ("[" + h.aD[this.l.fA] + "]正在维护中,暂停使用.");
          g.gf = 0;
          this.jdField_do = 11;
          h.aJ = null;
          return;
        }
        this.l.aG.a(h.fN[this.l.fA]);
        q.if = h.ce[this.l.fA];
        q.bb = h.bw[this.l.fA];
        if (h.bz[this.l.fA] != 0)
        {
          this.l.aG.jdMethod_if(2);
          h.ff = true;
        }
        else
        {
          this.l.aG.jdMethod_if(this.l.ef);
          h.ff = false;
        }
        this.l.fl = h.aD[this.l.fA];
        h.f5 = h.aO[this.l.fA];
        switch (this.ao)
        {
        case 0: 
        case 1: 
          this.N = false;
          if (h.aJ[this.l.fA].equals("满员"))
          {
            this.S = false;
            int = 0;
            this.jdField_do = 17;
            h.aJ = null;
            return;
          }
          if (this.S)
          {
            this.aZ = "请稍候...";
            int = 0;
            this.jdField_do = 9;
            Display.getDisplay(this.l.fG).setCurrent(this.l);
            try
            {
              this.aP = false;
              if (this.l.aG.jdMethod_int(1003))
              {
                this.l.aG.jdMethod_if(h.bL);
                this.l.aG.jdMethod_if(this.l.dv);
                this.l.aG.jdMethod_if(this.l.dw);
                this.l.aG.jdMethod_do(0);
                this.l.aG.jdMethod_do(0);
                this.l.aG.jdMethod_do(0);
                this.l.aG.jdMethod_for(h.jdMethod_if(1, 5));
                this.l.aG.jdMethod_if();
              }
            }
            catch (Exception localException1)
            {
              h.a(localException1);
            }
          }
          else
          {
            jdMethod_if(false);
          }
          break;
        case 2: 
          this.N = true;
          if (this.l.aG.jdMethod_int(9950))
          {
            this.l.aG.jdMethod_do(0);
            this.l.aG.jdMethod_if(h.bL);
            this.l.aG.jdMethod_if(h.fY);
            this.l.aG.jdMethod_if();
          }
          this.aZ = "获取数据...";
          int = 0;
          this.jdField_do = 9;
        }
        break;
      case 7: 
        if (this.aN)
        {
          a(false);
          this.aj = 0;
          this.a7 = 0;
          this.jdField_do = 16;
        }
        else
        {
          a((byte)0);
        }
        break;
      case 1: 
        this.aj = ((byte)(this.aj - 1));
        if (this.aj < 0)
        {
          this.aj = 0;
          this.a7 = ((byte)(this.a7 - 1));
          if (this.a7 < 0) {
            this.a7 = 0;
          }
        }
        break;
      case 2: 
        if (this.a7 + this.aj + 1 >= this.A.length) {
          return;
        }
        this.aj = ((byte)(this.aj + 1));
        if (this.aj >= this.jdField_null)
        {
          this.aj = ((byte)(this.jdField_null - 1));
          if (this.a7 < this.A.length - this.jdField_null) {
            this.a7 = ((byte)(this.a7 + 1));
          }
        }
        break;
      }
      break;
    case 14: 
      switch (paramInt)
      {
      case 1: 
        g.gf = (byte)(g.gf - 1);
        if (g.gf < 0) {
          g.gf = 0;
        }
        break;
      case 2: 
      case 5: 
        g.gf = (byte)(g.gf + 1);
        break;
      case 6: 
        try
        {
          this.l.fG.platformRequest(h.b9);
        }
        catch (Exception localException2) {}finally
        {
          h.bi = true;
        }
        break;
      case 7: 
        h.bi = true;
      }
      break;
    case 12: 
      switch (paramInt)
      {
      case 1: 
        g.gf = (byte)(g.gf - 1);
        if (g.gf < 0) {
          g.gf = 0;
        }
        break;
      case 2: 
      case 5: 
        g.gf = (byte)(g.gf + 1);
        break;
      case 6: 
        jdMethod_if(true);
        break;
      case 7: 
        jdMethod_case();
      }
      break;
    case 3: 
    case 11: 
    case 13: 
      switch (paramInt)
      {
      case 1: 
        g.gf = (byte)(g.gf - 1);
        if (g.gf < 0) {
          g.gf = 0;
        }
        break;
      case 2: 
      case 5: 
      case 6: 
        g.gf = (byte)(g.gf + 1);
      }
      break;
    case 5: 
      int i1 = (byte)(this.jdField_void + this.aC);
      switch (paramInt)
      {
      case 1: 
        this.aC = ((byte)(this.aC - 1));
        if (this.aC < 0)
        {
          this.aC = (this.jdField_void <= 0 ? 0 : (byte)(this.n - 1));
          this.jdField_void = ((byte)(this.jdField_void - this.n));
          if (this.jdField_void < 0) {
            this.jdField_void = 0;
          }
        }
        break;
      case 2: 
        if (i1 < this.a9 - 1) {
          this.aC = ((byte)(this.aC + 1));
        }
        if (this.aC % this.n == 0)
        {
          this.aC = 0;
          this.jdField_void = ((byte)(this.jdField_void + this.n));
          if (this.jdField_void >= this.a9 - 1) {
            this.jdField_void = ((byte)(this.a9 - 1));
          }
        }
        break;
      case 3: 
        switch (i1)
        {
        case 0: 
          int tmp2437_2436 = 0;
          byte[] tmp2437_2433 = this.g;
          tmp2437_2433[tmp2437_2436] = ((byte)(tmp2437_2433[tmp2437_2436] - 1));
          if (this.g[0] < 0) {
            this.g[0] = 0;
          }
          break;
        }
        break;
      case 4: 
        switch (i1)
        {
        case 0: 
          int tmp2485_2484 = 0;
          byte[] tmp2485_2481 = this.g;
          tmp2485_2481[tmp2485_2484] = ((byte)(tmp2485_2481[tmp2485_2484] + 1));
          if (this.g[0] > this.V[0].length - 1) {
            this.g[0] = ((byte)(this.V[0].length - 1));
          }
          break;
        }
        break;
      case 5: 
      case 6: 
        this.aC = 0;
        this.l.ef = this.g[0];
        this.l.jdMethod_else();
        a((byte)0);
        break;
      case 7: 
        a((byte)0);
      }
      break;
    case 6: 
      switch (paramInt)
      {
      case 1: 
        this.ar = ((byte)(this.ar - 1));
        if (this.ar < 0) {
          this.ar = ((byte)(this.d - 1));
        }
        break;
      case 2: 
      case 5: 
      case 6: 
        this.ar = ((byte)(this.ar + 1));
        if (this.ar > this.d - 1) {
          this.ar = 0;
        }
        break;
      case 7: 
        a((byte)0);
      }
      break;
    case 10: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        this.jdField_do = 18;
        break;
      case 7: 
        a((byte)0);
        break;
      case 3: 
        this.jdField_char = 0;
        this.aa = 0;
        break;
      case 4: 
        this.jdField_char = 1;
        this.aa = 0;
      }
      break;
    case 18: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        a((byte)21);
        break;
      case 7: 
        a((byte)10);
      }
      break;
    case 0: 
      switch (paramInt)
      {
      case 5: 
        switch (this.ao)
        {
        case 0: 
        case 1: 
        case 2: 
          int i2 = (jdMethod_do(true)) || (jdMethod_do(false)) ? 1 : 0;
          if ((i2 != 0) && (this.ao == 0)) {
            this.S = true;
          }
          a((byte)15);
          break;
        case 3: 
          this.aC = 0;
          jdMethod_do();
          this.g[0] = this.l.ef;
          this.jdField_do = 5;
          break;
        case 4: 
          a8 = new String[] { "资费说明", "本联网游戏终身免费。因通讯产生的流量费用由中国移动收取，收费标准请咨询当地10086。", "连网说明", "如联网失败或连接超时，请进入主菜单的“网络设置”选项，尝试其它连接方式。", "联系客服", h.cz ? "客服电话：010-83027861 客服短信：13910317941 客服邮箱：kefu@suiqu.cn" : "客服邮箱：kf@gameta.cn  WAP官网：gameta.cn", "版权信息", "灰烬游戏版权所有  Copyright © 2006-2010 SilentFire Inc.  游戏版本：" };
          int tmp3059_3058 = (a8.length - 1);
          String[] tmp3059_3050 = a8;
          tmp3059_3050[tmp3059_3058] = (tmp3059_3050[tmp3059_3058] + h.gg);
          this.ar = 0;
          this.d = ((byte)(a8.length / 2));
          this.jdField_do = 6;
          break;
        case 5: 
          try
          {
            if (this.l.fG.platformRequest(h.ea)) {
              h.bi = true;
            }
          }
          catch (Exception localException3) {}
        case 6: 
          try
          {
            this.l.fG.platformRequest(h.bB);
          }
          catch (Exception localException4) {}finally
          {
            h.bi = true;
          }
          break;
        case 7: 
          h.bi = true;
        }
        break;
      case 2: 
        this.ao = ((byte)(this.ao + 1));
        if (this.ao >= X.length) {
          this.ao = 0;
        }
        int = 0;
        break;
      case 1: 
        this.ao = ((byte)(this.ao - 1));
        if (this.ao < 0) {
          this.ao = ((byte)(X.length - 1));
        }
        int = 0;
      }
      break;
    }
  }
  
  public void a(int paramInt) {}
  
  public boolean jdMethod_do(boolean paramBoolean)
  {
    RecordStore localRecordStore = null;
    boolean bool = false;
    try
    {
      localRecordStore = RecordStore.openRecordStore(paramBoolean ? "PLAYER1" : "PLAYER2", false);
      localRecordStore.closeRecordStore();
      bool = true;
    }
    catch (Exception localException)
    {
      h.a(localException);
    }
    return bool;
  }
  
  public boolean jdMethod_new()
  {
    RecordStore localRecordStore1 = null;
    RecordStore localRecordStore2 = null;
    boolean bool = false;
    try
    {
      localRecordStore1 = RecordStore.openRecordStore("PLAYER2", true);
      if (localRecordStore1.getNumRecords() == 0)
      {
        localRecordStore2 = RecordStore.openRecordStore("PLAYER1", true);
        if (localRecordStore2.getNumRecords() > 0)
        {
          arrayOfByte1 = localRecordStore2.getRecord(1);
          localObject1 = new ByteArrayInputStream(arrayOfByte1);
          localObject2 = new DataInputStream((InputStream)localObject1);
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
          localDataOutputStream.writeUTF(((DataInputStream)localObject2).readUTF());
          localDataOutputStream.writeUTF(((DataInputStream)localObject2).readUTF());
          localDataOutputStream.writeUTF(((DataInputStream)localObject2).readUTF());
          localDataOutputStream.writeUTF(h.aD[localObject2.readByte()]);
          byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
          localRecordStore1.addRecord(arrayOfByte2, 0, arrayOfByte2.length);
          localDataOutputStream.close();
          localByteArrayOutputStream.close();
          ((DataInputStream)localObject2).close();
          localObject2 = null;
          ((ByteArrayInputStream)localObject1).close();
          localObject1 = null;
        }
        else
        {
          localObject1 = new ByteArrayOutputStream();
          localObject2 = new DataOutputStream((OutputStream)localObject1);
          ((DataOutputStream)localObject2).writeUTF("");
          ((DataOutputStream)localObject2).writeUTF("");
          ((DataOutputStream)localObject2).writeUTF("");
          ((DataOutputStream)localObject2).writeUTF(h.aD[0]);
          arrayOfByte1 = ((ByteArrayOutputStream)localObject1).toByteArray();
          localRecordStore1.addRecord(arrayOfByte1, 0, arrayOfByte1.length);
          ((DataOutputStream)localObject2).close();
          ((ByteArrayOutputStream)localObject1).close();
        }
        localRecordStore2.closeRecordStore();
        RecordStore.deleteRecordStore("PLAYER1");
      }
      byte[] arrayOfByte1 = localRecordStore1.getRecord(1);
      Object localObject1 = new ByteArrayInputStream(arrayOfByte1);
      Object localObject2 = new DataInputStream((InputStream)localObject1);
      this.l.dv = ((DataInputStream)localObject2).readUTF().trim();
      this.l.dw = ((DataInputStream)localObject2).readUTF().trim();
      this.l.jdField_do = ((DataInputStream)localObject2).readUTF().trim();
      if (this.l.dw.length() > 1) {
        bool = true;
      }
      this.l.aM = ((DataInputStream)localObject2).readUTF();
      for (int i1 = 0; i1 < h.aD.length; i1 = (byte)(i1 + 1)) {
        if (h.aD[i1].equals(this.l.aM))
        {
          this.l.fA = i1;
          this.az = i1;
        }
      }
      ((DataInputStream)localObject2).close();
      ((ByteArrayInputStream)localObject1).close();
      arrayOfByte1 = null;
      localRecordStore1.closeRecordStore();
    }
    catch (Exception localException)
    {
      h.a(localException);
    }
    return bool;
  }
  
  public void a(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    jdMethod_goto();
    jdMethod_do(0);
    this.l.fj.setColor(h.b2[2][0]);
    this.l.fj.drawString(paramArrayOfString[(2 * paramInt1)], 14, 4, 20);
    this.l.a(paramArrayOfString[(2 * paramInt1 + 1)], 4, 25, h.dU - 8, 0, 6);
    this.l.fj.drawString(this.ar + 1 + "/" + paramInt2, h.dU / 2, h.fp - 4, 33);
    this.l.x();
    this.l.c();
  }
  
  public void jdMethod_if()
  {
    this.l.fK = false;
    int += 1;
    String str1;
    int i9;
    int i10;
    switch (this.jdField_do)
    {
    case 12: 
      jdMethod_goto();
      this.l.a("为了有效保护您的帐号安全,请您绑定手机号和密保码.因未绑定而造成的帐号被盗等严重后果,官方不予受理!", g.gf, this.P, false);
      a("绑定", "跳过");
      break;
    case 8: 
      jdMethod_goto();
      this.l.a("确定删除该角色?(一旦删除将永久不可恢复!)", -1, this.P, false);
      a("确认", "返回");
      break;
    case 7: 
      if (h.fZ != null) {
        for (int i1 = 0; i1 < h.fZ.length; i1 = (byte)(i1 + 1)) {
          h.a5.a(h.fZ[i1]);
        }
      }
      jdMethod_goto();
      jdMethod_do(0);
      str1 = "选择角色";
      this.l.fj.setColor(15724527);
      this.l.fj.drawString(str1, 14, 4, 0);
      this.aw = (this.v == 0 ? this.at : this.c);
      this.av = ((short)(h.fp / 2 - 15 - 20));
      this.k = 55;
      this.aL = ((short)(h.dU / 2 - 10));
      if (this.aB == 0)
      {
        this.l.fj.setColor(3355494);
        this.l.fj.fillRoundRect(this.aw, this.av, this.aL, 55, 20, 20);
        this.l.fj.setColor(13619151);
        this.l.fj.drawRoundRect(this.aw, this.av, this.aL, 55, 20, 20);
      }
      else
      {
        this.l.fj.setColor(3355494);
        this.l.fj.fillRoundRect(this.aw + this.aL / 2 - 20 - 5, this.av + this.k, 46, 24, 20, 8);
        this.l.fj.setColor(13619151);
        this.l.fj.drawRoundRect(this.aw + this.aL / 2 - 20 - 5, this.av + this.k, 46, 24, 20, 8);
      }
      String str3;
      for (int i2 = 0; i2 < this.J.length; i2 = (byte)(i2 + 1))
      {
        if (this.J[i2] != null)
        {
          this.l.b0.a((i2 == 0 ? this.at : this.c) + h.dU / 4 - 25, h.fp / 2 - 15, this.l.o, this.x[i2], 0, this.K[i2], this.z[i2]);
          this.l.a((i2 == 0 ? this.at : this.c) + h.dU / 4 - 25, h.fp / 2 - 15, this.U[i2], this.z[i2], this.aQ[i2][0], this.aQ[i2][1], this.aQ[i2][2], this.aQ[i2][3], this.aQ[i2][5], this.aQ[i2][6], this.aQ[i2][7], int);
          this.l.b0.a(this.x[i2]);
          this.l.a((i2 == 0 ? this.at : this.c) + h.dU / 4 - 25 + 20 - 3, h.fp / 2 - 20 + 24, 22, 11, 66, 0, this.l.aH[12], 0);
          this.l.a((i2 == 0 ? this.at : this.c) + h.dU / 4 - 25 + 44 - 6, h.fp / 2 - 17 + 24, this.aU[i2], 20);
          if (this.v == i2) {
            this.l.fj.setColor(16777164);
          } else {
            this.l.fj.setColor(11513775);
          }
          this.l.fj.drawString(this.J[i2], (i2 == 0 ? this.at : this.c) + this.aL / 2, h.fp / 2 - 15 - 2, 33);
        }
        if ((this.aB == 1) && (this.v == i2)) {
          this.l.fj.setColor(16777164);
        } else {
          this.l.fj.setColor(11513775);
        }
        str3 = null;
        if (this.J[i2] != null) {
          str3 = "删除";
        } else {
          str3 = "创建";
        }
        this.l.fj.drawString(str3, (i2 == 0 ? this.at : this.c) + this.aL / 2 - 20, this.av + this.k + 3, 0);
      }
      if (h.f5)
      {
        this.l.fj.setColor(16777164);
        String str2 = null;
        str3 = null;
        switch (this.jdField_try)
        {
        case 0: 
          str2 = "免费";
          str3 = "";
          break;
        case 1: 
          str2 = "计小时";
          str3 = this.bc + "分钟";
          break;
        case 2: 
          str2 = "包月";
          str3 = this.bc + "天";
        }
        this.l.fj.drawString(str2, h.dU / 2, h.fp - h.eA, 33);
        this.l.fj.drawString(str3, h.dU / 2, h.fp, 33);
      }
      a("确认", "返回");
      break;
    case 1: 
      this.l.fj.setColor(0);
      this.l.fj.fillRect(0, 0, h.dU, h.fp);
      if (this.l.a(this.aJ, g.gf, this.P, false)) {
        jdMethod_if(false);
      }
      this.l.x();
      break;
    case 21: 
      jdMethod_goto();
      jdMethod_do(0);
      this.l.fj.setColor(15724527);
      this.l.fj.drawString("选择职业", 14, 4, 0);
      int i3 = 0;
      int i4 = 0;
      for (int i5 = 3; i5 >= 0; i5 = (byte)(i5 - 1))
      {
        if (int <= 4)
        {
          i7 = 50;
          if (int == 1) {
            i7 = 50;
          } else if (int == 2) {
            i7 = 30;
          } else if (int == 3) {
            i7 = 20;
          } else if (int == 4) {
            i7 = 5;
          }
          if (this.aq == 3)
          {
            i9 = i5;
            if (i5 == 3) {
              i9 = 1;
            } else if (i5 == 1) {
              i9 = 3;
            }
            i7 = 90 - i7 + 90 * (i9 + 1);
          }
          else
          {
            i7 -= 90 * i5;
          }
          i9 = h.dU / 2 - 10;
          i10 = h.fp / 2 - this.w;
          i3 = i9 + this.aA * h.jdMethod_new(i7) / 256;
          i4 = i10 + this.w * h.jdMethod_do(i7) / 256;
        }
        else
        {
          i3 = this.aW[i5];
          i4 = this.aV[i5];
        }
        int i7 = 0;
        switch ((this.aT + i5) % 4)
        {
        case 0: 
          i7 = 0;
          break;
        case 1: 
          i7 = 1;
          break;
        case 2: 
          i7 = 2;
          break;
        case 3: 
          i7 = 3;
        }
        this.l.b0.a(i7, this.l.af, i3, i4, (this.aT + i5) % 4, 9, (byte)(i5 < 2 ? 0 : 2), (byte)(i5 < 2 ? 1 : 3), this.s[((this.aT + i5) % 4)], int);
        this.l.b0.a(i3, i4, this.l.o, this.s[((this.aT + i5) % 4)], i5 < 2 ? 0 : 2, false, (this.aT + i5) % 4);
      }
      if ((int > 4) && (this.s[this.aT][4] == 0))
      {
        this.o = ((byte)(this.o + 1));
        if (this.o > ag.e7[this.aT].length - 1) {
          this.o = 0;
        }
        this.l.b0.a(0, 0, this.s[this.aT]);
        this.l.b0.a((ag.e7[this.aT][this.o] >> 8) + this.bb, 0, this.s[this.aT]);
      }
      this.l.fj.setColor(15724527);
      if (int == 3)
      {
        this.l.fj.fillRect(h.dU / 2 - 6, h.fp - h.fp / 4 - 8, 12, 1);
      }
      else if (int == 4)
      {
        this.l.fj.fillRect(h.dU / 2 - 25, h.fp - h.fp / 4 - 8, 50, 1);
      }
      else if (int >= 5)
      {
        String str4 = null;
        switch (this.aT)
        {
        case 0: 
          str4 = "战士";
          break;
        case 1: 
          str4 = "法师";
          break;
        case 2: 
          str4 = "盗贼";
          break;
        case 3: 
          str4 = "枪手";
        }
        this.l.fj.drawString(str4, h.dU / 2, h.fp - h.fp / 4, 33);
      }
      a("确认", "返回");
      if (int == 4)
      {
        if (this.aq == 4)
        {
          this.aT = ((byte)(this.aT - 1));
          if (this.aT < 0) {
            this.aT = 3;
          }
        }
        else
        {
          this.aT = ((byte)(this.aT + 1));
          if (this.aT > 3) {
            this.aT = 0;
          }
        }
        jdMethod_int();
      }
      if (int > 4) {
        this.l.b0.a(this.s[this.aT]);
      } else {
        jdMethod_int();
      }
      break;
    case 10: 
    case 18: 
      jdMethod_goto();
      jdMethod_do(0);
      str1 = "选择性别";
      if (this.jdField_do == 18) {
        str1 = "个性化";
      }
      this.l.fj.setColor(15724527);
      this.l.fj.drawString(str1, 14, 4, 0);
      if ((this.jdField_char == 0) || (this.jdField_do == 18)) {
        this.aw = this.at;
      } else {
        this.aw = this.c;
      }
      int i6 = h.dU / 2 - 10;
      if (this.jdField_do == 18) {
        i6 = h.dU / 2 + 50;
      }
      this.l.fj.setColor(3355494);
      this.l.fj.fillRoundRect(this.aw, h.fp / 2 - 15 - 20, i6, 70, 20, 20);
      this.l.fj.setColor(13619151);
      this.l.fj.drawRoundRect(this.aw, h.fp / 2 - 15 - 20, i6, 70, 20, 20);
      int i8 = 0;
      if (this.jdField_do == 18) {
        i8 = this.jdField_char == 0 ? 0 : 1;
      }
      this.l.b0.a(this.at + h.dU / 4 - 25, h.fp / 2 - 15, this.l.o, this.s[i8], 0, false, 0);
      if (this.jdField_do == 10) {
        this.l.b0.a(this.c + h.dU / 4 - 15, h.fp / 2 - 15, this.l.o, this.s[1], 2, false, 0);
      }
      if (this.s[this.jdField_char][1] != m[this.aa] + (this.jdField_char == 1 ? 27 : 0)) {
        this.l.b0.a(m[this.aa] + (this.jdField_char == 1 ? 27 : 0), 0, this.s[this.jdField_char]);
      }
      this.l.b0.a(this.s[this.jdField_char]);
      if (this.s[this.jdField_char][4] == 0)
      {
        this.aa = ((byte)((this.aa + 1) % m.length));
        this.l.b0.a(m[this.aa] + (this.jdField_char == 1 ? 27 : 0), 0, this.s[this.jdField_char]);
      }
      this.l.b0.a(1 + (this.jdField_char == 0 ? 27 : 0), 0, this.s[((this.jdField_char + 1) % 2)]);
      if (this.jdField_do == 18)
      {
        this.l.fj.setColor(16777164);
        this.l.fj.drawString("发型:", h.dU / 4 + 8, h.fp / 2 - 30, 0);
        this.l.fj.drawString("肤色:", h.dU / 4 + 8, h.fp / 2 - 10, 0);
        this.l.fj.drawString("服饰:", h.dU / 4 + 8, h.fp / 2 + 10, 0);
        this.l.fj.setColor(11184810);
        this.l.fj.drawString("默认", h.dU / 4 + 54, h.fp / 2 - 30, 0);
        this.l.fj.drawString("默认", h.dU / 4 + 54, h.fp / 2 - 10, 0);
        this.l.fj.drawString("默认", h.dU / 4 + 54, h.fp / 2 + 10, 0);
      }
      a("确认", "返回");
      break;
    case 19: 
      this.l.fj.setColor(16777215);
      this.l.fj.fillRect(0, 0, h.dU, h.fp);
      this.l.fj.drawImage(this.bd, (h.dU - this.bd.getWidth()) / 2, h.fp / 10, 0);
      if (int > 30) {
        a((byte)2);
      }
      break;
    case 20: 
      this.l.k("初始化,请稍候...(请使用移动梦网或CMWAP连接)");
      break;
    case 22: 
      this.l.k("资源加载中,请耐心等待.(根据手机性能差异,约消耗1分钟)-" + W + "%");
      break;
    case 2: 
      this.l.fj.setColor(16777215);
      this.l.fj.fillRect(0, 0, h.dU, h.fp);
      this.l.fj.drawImage(this.y[this.F], (h.dU - this.y[this.F].getWidth()) / 2, h.fp / 10, 0);
      this.l.fj.setColor(0);
      this.l.fj.drawString("灰烬游戏出品", h.dU / 2, h.fp / 2, 17);
      this.l.fj.drawString("免费联网游戏", h.dU / 2, h.fp / 2 + h.eA + 2, 17);
      this.l.fj.drawString("© 2010 SilentFire Inc.", 2, h.fp - 1, 36);
      if (int == 30) {
        jdMethod_char();
      }
      break;
    case 23: 
      this.l.a(this.ah, -1, this.P, false);
      break;
    case 17: 
      this.l.a("该区人数已满,不能进入.", -1, this.P, false);
      break;
    case 4: 
      this.l.fj.setColor(h.b2[3][1]);
      this.l.fj.fillRect(0, 0, h.dU, h.fp);
      this.l.a("网络超时!请重试.", -1, this.P, false);
      break;
    case 15: 
      this.l.k("获取游戏区...");
      if (int > 360000 / h.bn)
      {
        int = 0;
        this.jdField_do = 4;
      }
      break;
    case 16: 
      if (this.S)
      {
        jdMethod_if(5);
        return;
      }
      this.l.fj.setColor(0);
      this.l.fj.fillRect(0, 0, h.dU, h.fp);
      this.l.a(this.R, 0, 20, h.dU, h.fp - 35, false);
      this.l.fj.setColor(h.b2[2][0]);
      this.l.fj.fillRect(3, 23 + this.aj * 22, h.dU - 6, 21);
      if ((this.aN) && (this.am != null)) {
        this.l.fj.drawString(this.am, 22, 1, 0);
      }
      for (i9 = 0; (i9 < this.jdField_null) && (this.a7 + i9 < this.A.length); i9++)
      {
        if (i9 == this.aj)
        {
          i10 = h.b2[4][1];
        }
        else
        {
          i10 = 8947848;
          if (this.C[(this.a7 + i9)] == -1) {
            i10 = 13421772;
          }
        }
        this.l.fj.setColor(i10);
        String str5 = this.A[(this.a7 + i9)];
        if (this.C[(this.a7 + i9)] != -1)
        {
          if (this.aN) {
            str5 = this.a7 + i9 + 1 + "." + str5;
          } else {
            str5 = this.C[(this.a7 + i9)] + 1 + "." + str5;
          }
          if (!this.aN) {
            if (this.C[(this.a7 + i9)] == this.az) {
              str5 = "[上]" + str5;
            } else if (this.C[(this.a7 + i9)] == this.h) {
              str5 = "[荐]" + str5;
            }
          }
          String str6 = h.aJ[this.C[(this.a7 + i9)]];
          this.l.fj.drawString(str6, h.dU - 5, 24 + i9 * 22, 24);
        }
        this.l.fj.drawString(str5, 5, 24 + i9 * 22, 0);
      }
      if (this.a7 > 0) {
        this.l.a(h.dU - 18, 25 + (int % 6 == 0 ? -1 : 1), this.y[this.P].getWidth(), this.y[this.P].getHeight(), 0, 0, this.y[this.P], 0);
      }
      if (this.a7 < h.aD.length - this.jdField_null) {
        this.l.a(h.dU - 18, h.fp - 30 + (int % 6 == 0 ? 1 : -1), this.y[this.P].getWidth(), this.y[this.P].getHeight(), 0, 0, this.y[this.P], 3);
      }
      this.l.x();
      this.l.c();
      break;
    case 14: 
      this.l.fj.setColor(h.b2[3][1]);
      this.l.fj.fillRect(0, 0, h.dU, h.fp);
      if (this.l.a(this.Z, g.gf, this.P, false)) {
        g.gf = 0;
      }
      this.l.fj.drawString("更新", 2, h.fp - 12, 36);
      this.l.fj.drawString("退出", h.dU - 2, h.fp - 12, 40);
      break;
    case 3: 
    case 11: 
    case 13: 
      this.l.fj.setColor(0);
      this.l.fj.fillRect(0, 0, h.dU, h.fp);
      if (this.l.a(this.aJ, g.gf, this.P, false)) {
        if (this.jdField_do == 13)
        {
          if (this.jdField_long == 0) {
            a((byte)0);
          } else {
            switch (this.I)
            {
            case 0: 
            case 1: 
            case 2: 
              if ((this.aY == null) || (this.ai == true)) {
                jdMethod_if(false);
              } else {
                Display.getDisplay(this.l.fG).setCurrent(this.aY);
              }
              break;
            case 3: 
              if ((this.aY == null) || (!this.ai)) {
                jdMethod_if(true);
              } else {
                Display.getDisplay(this.l.fG).setCurrent(this.aY);
              }
              break;
            }
          }
        }
        else if (this.jdField_do == 11) {
          a((byte)0);
        } else {
          a((byte)7);
        }
      }
      this.l.x();
      break;
    case 0: 
      jdMethod_goto();
      this.l.fj.drawImage(this.y[this.Y], (h.dU - this.y[this.Y].getWidth()) / 2, h.a9 == 2 ? 20 : h.a9 == 0 ? -60 : 8, 0);
      for (i9 = 0; i9 < 3; i9 = (byte)(i9 + 1))
      {
        i10 = this.ao + i9 - 1;
        if (i10 < 0) {
          i10 = X.length - 1;
        } else if (i10 >= X.length) {
          i10 = 0;
        }
        if ((h.a9 != 0) || (i9 != 0))
        {
          this.l.fj.setColor(4473924);
          if (i9 == 1)
          {
            this.l.fj.setColor(3355494 + (int < 4 ? int * 1118498 : 0));
            this.l.fj.drawLine(0, h.fp - 2 * (h.eA + 2) + h.eA / 2, h.dU, h.fp - 2 * (h.eA + 2) + h.eA / 2);
            this.l.fj.setColor(15724527);
          }
          this.l.fj.drawString(X[i10], h.dU / 2, h.fp - (3 - i9) * (h.eA + 2), 17);
        }
      }
      break;
    case 5: 
      this.l.fj.setColor(0);
      this.l.fj.fillRect(0, 0, h.dU, h.fp);
      this.l.a(this.R, 0, 0, h.dU, h.fp, true);
      this.l.fj.setColor(h.b2[2][0]);
      this.l.fj.fillRect(3, this.aC * 34 + 20, h.dU - 6, 17);
      this.l.a(this.jdField_void, this.n, this.a9, this.jdField_goto, this.V, this.g);
      this.l.fj.setColor(h.b2[4][1]);
      this.l.a("如联网失败或连接超时,请尝试其他连接方式.", 5, 40, h.dU - 5, 0, 4);
      this.l.x();
      this.l.c();
      break;
    case 6: 
      a(a8, this.ar, this.d);
      break;
    case 9: 
      this.l.k(this.aZ);
      if (int > 360000 / h.bn)
      {
        int = 0;
        this.jdField_do = 4;
      }
      break;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.aN = paramBoolean;
    int i1;
    int i2;
    if (this.aF)
    {
      if (paramBoolean)
      {
        i1 = (byte)(this.a7 + this.aj);
        i2 = 0;
        for (int i3 = 0; i3 < h.cD.length; i3 = (byte)(i3 + 1)) {
          if (h.cD[i3].equals(this.A[i1])) {
            i2 = i3;
          }
        }
        this.A = new String[h.eh[i2].length];
        this.C = new byte[h.eh[i2].length];
        for (i3 = 0; i3 < this.A.length; i3 = (byte)(i3 + 1))
        {
          this.A[i3] = h.aD[h.eh[i2][i3]];
          this.C[i3] = h.eh[i2][i3];
        }
      }
      else
      {
        i1 = 0;
        if (this.az != -1) {
          i1 = (byte)(i1 + 1);
        }
        if (this.h != -1) {
          i1 = (byte)(i1 + 1);
        }
        this.A = new String[h.cD.length + i1];
        this.C = new byte[h.cD.length + i1];
        i1 = 0;
        if (this.az != -1)
        {
          this.A[i1] = h.aD[this.az];
          this.C[i1] = this.az;
          i1 = (byte)(i1 + 1);
        }
        if (this.h != -1)
        {
          this.A[i1] = h.aD[this.h];
          this.C[i1] = this.h;
          i1 = (byte)(i1 + 1);
        }
        for (i2 = 0; i2 < h.cD.length; i2 = (byte)(i2 + 1))
        {
          this.A[i1] = h.cD[i2];
          this.C[i1] = -1;
          i1 = (byte)(i1 + 1);
        }
      }
    }
    else
    {
      this.A = new String[h.aD.length];
      this.C = new byte[h.aD.length];
      i1 = 0;
      if (this.az != -1)
      {
        this.A[i1] = h.aD[this.az];
        this.C[i1] = this.az;
        i1 = (byte)(i1 + 1);
      }
      if (this.h != -1)
      {
        this.A[i1] = h.aD[this.h];
        this.C[i1] = this.h;
        i1 = (byte)(i1 + 1);
      }
      for (i2 = 0; i2 < h.aD.length; i2 = (byte)(i2 + 1)) {
        if ((i2 != this.az) && (i2 != this.h))
        {
          this.A[i1] = h.aD[i2];
          this.C[i1] = i2;
          i1 = (byte)(i1 + 1);
        }
      }
    }
  }
  
  public void run()
  {
    W = 0;
    this.l.jdMethod_void();
    this.l.M();
    if (this.l.an) {
      a((byte)19);
    } else {
      a((byte)2);
    }
  }
  
  public void jdMethod_do()
  {
    this.a9 = 1;
    this.g = new byte[this.a9];
    this.jdField_goto = new String[this.a9];
    this.V = new String[this.a9][3];
    this.jdField_goto[0] = "网络连接方式";
    this.V[0] = { "代理", "直连", "高速" };
    this.jdField_void = 0;
    this.n = ((byte)(h.fp / 34));
  }
  
  public void jdMethod_for()
  {
    if (((h.cz) || (h.bL.equals("" + a.X + ""))) && (this.l.j) && (this.j.a))
    {
      this.l.j = false;
      this.l.jdMethod_else();
    }
    a((byte)0);
  }
  
  public void jdMethod_char()
  {
    if (((h.cz) || (h.bL.equals("" + a.X))) && (this.l.j))
    {
      a((byte)20);
      this.j = new a2(this.l.ef == 0, this);
      this.j.jdMethod_if();
    }
    else
    {
      jdMethod_for();
    }
  }
  
  public void a(byte paramByte)
  {
    switch (paramByte)
    {
    case 22: 
      new Threak(this).start();
      break;
    case 19: 
      int = 0;
      try
      {
        this.bd = Image.createImage("/logo/" + h.bL + "/pre.png");
      }
      catch (Exception localException) {}
    case 2: 
      this.bd = null;
      if (a("OPTION"))
      {
        this.l.Q();
      }
      else
      {
        this.l.U();
        this.l.jdMethod_else();
      }
      int = 0;
      break;
    case 0: 
      this.S = false;
      a8 = null;
      this.y[this.F] = null;
      this.l.a((short)10, h.dU, h.fp);
      this.ao = 0;
      break;
    case 10: 
      this.jdField_char = 0;
      this.aT = 0;
      this.aa = 0;
      this.s = new int[2][5];
      this.l.b0.a(m[this.aa] + (this.jdField_char == 1 ? 27 : 0), 0, this.s[this.jdField_char]);
      this.l.b0.a(1 + (this.jdField_char == 0 ? 27 : 0), 0, this.s[((this.jdField_char + 1) % 2)]);
      if (this.jdField_char == 0) {
        this.aw = this.at;
      } else {
        this.aw = this.c;
      }
      this.av = 35;
      break;
    case 21: 
      this.aA = ((short)(h.dU / 4));
      this.w = ((short)(h.fp / 7));
      this.aW = new short[] { (short)(h.dU / 2 - 10), (short)(h.dU / 2 - 10 + this.aA), (short)(h.dU / 2 - 10), (short)(h.dU / 2 - 10 - this.aA) };
      this.aV = new short[] { (short)(h.fp / 2), (short)(h.fp / 2 - this.w), (short)(h.fp / 2 - 2 * this.w), (short)(h.fp / 2 - this.w) };
      this.s = new int[4][5];
      jdMethod_int();
      int = 5;
      break;
    case 15: 
      h.ff = true;
      if (this.l.aG == null)
      {
        this.l.aG = new q(this.l, "/a", h.cc, h.ff ? 2 : this.l.ef);
      }
      else
      {
        q.if = 68;
        q.bb = 51;
        this.l.aG.jdMethod_if(2);
        this.l.aG.a(h.cc);
      }
      int = 0;
      if (h.cz)
      {
        aw localaw = new aw(this.l, false);
        localaw.jdField_do = 3;
        Threak localThreak = new Threak(localaw);
        localThreak.start();
        this.aZ = "请稍候...";
        this.jdField_do = 9;
      }
      else if (this.l.aG.jdMethod_int(9950))
      {
        this.l.aG.jdMethod_do(1);
        this.l.aG.jdMethod_if(h.bL);
        this.l.aG.jdMethod_do(h.cz ? 1 : 0);
        this.l.aG.jdMethod_if(h.fY);
        this.l.aG.jdMethod_if();
      }
      break;
    case 7: 
      this.v = 0;
      this.aB = ((byte)(this.J[this.v] == null ? 1 : 0));
      for (int i1 = 0; i1 < this.J.length; i1 = (byte)(i1 + 1)) {
        if (this.J[i1] != null) {
          this.l.b0.a(21 + (this.U[i1] == 1 ? 27 : 0), 0, this.x[i1]);
        }
      }
    }
    this.jdField_do = ((short)paramByte);
  }
  
  private void jdMethod_goto()
  {
    this.l.fj.setColor(0);
    this.l.fj.fillRect(0, 0, h.dU, h.fp);
    this.l.a(0, 0, h.dU, h.fp, int);
  }
  
  private void jdMethod_int()
  {
    if (this.jdField_char == 0) {
      this.bb = 0;
    } else {
      this.bb = 27;
    }
    this.o = 0;
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = 4;
    arrayOfInt[1] = 5;
    arrayOfInt[2] = 3;
    arrayOfInt[3] = 3;
    for (int i1 = 3; i1 >= 0; i1 = (byte)(i1 - 1))
    {
      this.l.b0.a(0, 0, this.s[((this.aT + i1) % 4)]);
      this.l.b0.a((this.aT + i1) % 4 + 9 + this.bb, arrayOfInt[((this.aT + i1) % 4)], this.s[((this.aT + i1) % 4)]);
    }
  }
  
  private void jdMethod_do(int paramInt)
  {
    int i1 = paramInt;
    this.l.fj.setColor(3355494);
    this.l.fj.drawLine(0, i1 + 12, h.dU, i1 + 12);
  }
  
  private void a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      this.l.fj.setColor(11513775);
      this.l.fj.drawString(paramString1, 1, h.fp - 1, 36);
    }
    if (paramString2 != null)
    {
      this.l.fj.setColor(11513775);
      this.l.fj.drawString(paramString2, h.dU - 1, h.fp - 1, 40);
    }
  }
  
  public void jdMethod_case()
  {
    if ((this.S) && (this.aG))
    {
      if (this.l.aG.jdMethod_int(1017))
      {
        this.l.aG.jdMethod_if(this.l.dv);
        this.l.aG.jdMethod_if(this.l.dw);
        this.l.aG.jdMethod_if(this.l.jdField_do);
        this.l.aG.jdMethod_do(0);
        this.l.aG.jdMethod_do(1);
        this.l.aG.jdMethod_if();
      }
      this.aZ = "请稍候...";
      int = 0;
      this.jdField_do = 9;
    }
    else
    {
      a((byte)7);
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\y.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */