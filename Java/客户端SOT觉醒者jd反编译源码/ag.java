import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public class ag
  extends a3
{
  public static final byte gx = 27;
  public static final byte hn = 1;
  public static final byte h3 = 1;
  public static final byte ff = 2;
  public static final byte g3 = 2;
  public static final byte ic = 3;
  public static final byte ia = 4;
  public static final byte h9 = 5;
  public static final byte h8 = 6;
  public static final byte h7 = 7;
  public static final byte h5 = 8;
  public static final byte hS = 9;
  public static final byte e4 = 10;
  public static final byte fy = 11;
  public static final byte hJ = 12;
  public static final byte el = 13;
  public static final byte d4 = 14;
  public static final byte eq = 15;
  public static final byte fh = 16;
  public static final byte hD = 17;
  public static final byte eg = 19;
  public static final byte ej = 20;
  public static final byte e8 = 21;
  public static final byte eD = 22;
  public static final byte eU = 5;
  public static final byte fk = 23;
  public static final byte ei = 24;
  public static final byte fC = 25;
  public static final byte gi = 26;
  public static final byte eL = 0;
  public static final byte eR = 1;
  public static final byte fo = 2;
  public static final byte fA = 3;
  public static byte ey = -1;
  public static byte hX = 0;
  public static byte dt = 23;
  public static byte ig = 99;
  public static byte eV = 4;
  public static byte d8 = 5;
  public static byte hI = 7;
  public static byte dV = 6;
  public static final String[] hC = { "挖掘", "诱捕", "剥取", "偷盗" };
  public static final String[] fr = { "地面上使用,可获得各种矿石材料.", "对怪物使用,可将其捕捉为宠物.", "怪物死亡闪烁状态下使用,可获得各种剥取类素材.", "对人和怪物都可使用,可从目标处偷取金钱和物品." };
  boolean fE;
  boolean hv;
  boolean eT;
  byte et;
  String d3;
  byte[] hT = new byte[4];
  boolean eW;
  public static final int[][] eo = { { 4, 11 * h.u, 1 * h.b8 }, { 6, 16 * h.u, 0 * h.b8 }, { 11, 5 * h.u, 0 * h.b8 }, { 12, 6 * h.u, 8 * h.b8 } };
  int dC;
  public static final short[][] e7 = { { 1801, 1546, 2304 }, { 1543, 1799, 1287, 2560 }, { 1288, 1029, 1029, 773, 2816 }, { 2053, 2053, 2055, 3072 } };
  public static final byte[][] fu = { { 3, 3 }, { 1, 1 } };
  public static final byte[][] eh = { { 3, 1, 3 }, { 1, 3, 1 } };
  public static final byte gt = 4;
  public static final byte hA = 6;
  public static final byte d5 = 10;
  public byte[] dY = new byte[3];
  public boolean hU = false;
  public byte f3 = 0;
  public byte fF = 0;
  public byte hw = 0;
  public boolean dv = false;
  public short hZ = 0;
  public boolean dZ = false;
  public short g8 = 0;
  public short gK = 100;
  public byte du = 5;
  public short gZ = -1;
  public int dI = -1;
  public short gM;
  public a3 gR;
  public byte eN = -1;
  String eB = null;
  public byte eC;
  public static int[] hR = new int[5];
  byte fm;
  String gc;
  byte ft;
  boolean fM;
  byte eZ;
  byte fB;
  byte gG;
  byte id;
  byte gd;
  byte[] fH;
  a3 ep;
  byte ed;
  byte hH;
  boolean e0;
  int fW;
  byte[] gN;
  byte dJ;
  boolean hW;
  byte fe;
  byte hK;
  byte dD;
  byte hi;
  byte h0;
  a3 g1;
  a3 eY;
  boolean gh = false;
  boolean ga = false;
  boolean hk = false;
  boolean hy = true;
  boolean gQ;
  boolean gk;
  boolean h4;
  boolean ek;
  short gb;
  byte fP;
  short dT;
  short dS;
  a3 fw;
  byte fv;
  byte d2;
  byte ib;
  public static final byte dB = 0;
  public static final byte dM = 1;
  public static final byte e1 = 2;
  public static final byte dx = 3;
  public static final byte hY = 4;
  public short eb;
  public short dz;
  public byte gf;
  public byte fV = 0;
  public boolean hB;
  public static final byte f2 = 5;
  int fn;
  boolean g4 = false;
  short fY = 0;
  byte gH = -1;
  int dP = 0;
  int gF = 0;
  byte dN = 0;
  byte gj = 0;
  public static final String[] ez = { "混乱", "缓慢", "中毒", "衰弱", "封力", "诅咒", "封魔", "定身" };
  public static final byte eM = 0;
  public static final byte ee = 1;
  public static final byte eu = 2;
  public static final byte ea = 3;
  public static final byte ef = 4;
  public static final byte gS = 5;
  public static final byte d1 = 6;
  public static final byte d9 = 7;
  public static final byte gP = 0;
  public static final byte f4 = 1;
  public static final byte hb = 2;
  public static final byte en = 3;
  public static final byte f1 = 4;
  public static final byte gY = 5;
  public static final byte gT = 6;
  public static final byte hL = 7;
  public static final byte fJ = 8;
  public static final byte f9 = 9;
  public static final byte d0 = 10;
  public static final byte dW = 11;
  public static final byte dQ = 12;
  public static final byte g7 = 13;
  public static final byte gv = 14;
  public static final byte fs = 15;
  public static final byte ha = 16;
  public static final byte hf = 20;
  public static final byte hl = 31;
  public static final byte hx = 6;
  boolean eE = false;
  a3 gV = null;
  public static short hF;
  public static short hE;
  public byte eO;
  public short d7;
  public short d6;
  public static final byte hG = 8;
  public boolean[] fc = new boolean[8];
  public byte gD;
  public boolean ie = false;
  public byte em = 0;
  public short e5;
  public short e2;
  public boolean fa;
  public byte fp;
  public String es = "";
  int fL = -1;
  byte fx;
  byte fj = -1;
  byte hq = 0;
  int gz = -1;
  boolean dU = false;
  boolean gE = false;
  boolean fi = false;
  boolean he = false;
  short ii;
  int dO = -1;
  public static int gL;
  boolean hu;
  boolean fZ = false;
  public static final byte eA = 0;
  public static final byte gy = 1;
  public static final byte hp = 2;
  public static final byte eH = 3;
  public boolean gq = true;
  public byte hd;
  public byte gO;
  public byte fq;
  public short f0;
  public byte hg;
  public a3 h2 = null;
  public byte gg;
  public static final byte gA = 0;
  public static final byte gW = 1;
  public static final byte e6 = 2;
  public static final byte f8 = 3;
  public byte hs;
  public byte ew;
  public short ht;
  public boolean g0;
  public short fS;
  public byte dy;
  public short gr;
  public short fQ;
  public short fO;
  int hh = a3.jdMethod_new(g2, a.t);
  static int g2 = a.aa;
  public static byte eK = 48;
  public static byte dH = 99;
  public boolean hr = true;
  public short fU;
  public short fT;
  ar hj = null;
  public short gp = 0;
  public static byte eJ = 0;
  public static byte eI = 0;
  public static byte eG = 0;
  public static int[][] g6 = { { 96, 99, 104 }, { 97, 101, 105 }, { 100, 102, 107 }, { 98, 103, 106 } };
  public byte hP = 1;
  public byte hO = 1;
  int dK;
  public byte fI = 0;
  public static byte g9 = 30;
  public byte[] dR = null;
  public short[] eQ = null;
  public String[] eP = null;
  public byte[] ex = null;
  public byte[] dG = null;
  public short[] hc = null;
  public byte[] er = null;
  public static byte fN = 30;
  byte eF;
  short gl;
  boolean hV;
  byte g5;
  ag dE;
  byte dA;
  byte eS;
  byte hM;
  byte fK;
  boolean go;
  byte fG;
  short gs;
  byte ih = 0;
  static byte f7 = 4;
  short[][] dF = (short[][])null;
  String hQ = "角色等级过低,不能使用该技能.";
  private static final byte[][] gu = { { 48, 49 }, { 50, 52 }, { 53, 55 }, { 57, 56 } };
  byte[] h6 = null;
  public static final byte e3 = -1;
  public static final byte fl = 0;
  public static final byte dL = 1;
  byte[] gJ = new byte[2];
  short[][] gw = (short[][])null;
  short[][] eX = (short[][])null;
  public int ge = -1;
  public byte gm;
  public static final byte fR = 0;
  public static final byte dw = 1;
  public static final byte fg = 2;
  public static final byte hm = 3;
  public static final byte gC = 4;
  public static final String[] f6 = { "正常", "扩招", "建设", "戒备", "战争" };
  public static final byte f5 = 0;
  public static final byte gn = 1;
  public static final byte gI = 17;
  public static final byte hN = 16;
  public static final byte fD = 15;
  public static final byte fX = 14;
  public static final byte gU = 13;
  public static final String[] gB = { "卫队长 ", "军团长 ", "执行官 ", "指挥官 ", "公会长 " };
  public static final byte gX = 0;
  public static final byte dX = 1;
  public static final byte hz = 2;
  public static final byte ho = 3;
  public static final byte ec = 4;
  public static final byte h1 = 5;
  public static final byte fz = 6;
  byte ev = 0;
  boolean fd;
  boolean fb;
  boolean e9;
  
  public short[] ak()
  {
    if (this != a3.bE.cZ) {
      return null;
    }
    if (!a3.bE.bR.a((short)1004)) {
      return null;
    }
    for (int i = 0; i < eo.length; i = (byte)(i + 1)) {
      if (a3.bE.cJ.jdField_if == eo[i][0])
      {
        short[] arrayOfShort = new short[2];
        arrayOfShort[0] = ((short)eo[i][1]);
        arrayOfShort[1] = ((short)eo[i][2]);
        return arrayOfShort;
      }
    }
    return null;
  }
  
  public void aa()
  {
    short[] arrayOfShort = ak();
    if (arrayOfShort != null)
    {
      int i = arrayOfShort[0] - this.aP;
      int j = arrayOfShort[1] - this.aM;
      int k = h.jdMethod_int(i * i + j * j);
      int m = i * 256 / k;
      int n = j * 256 / k;
      int i1 = this.aP + 10;
      int i2 = this.aM + 31 + 15;
      int i3 = a3.bE.cJ.jdField_int / 3 % 3 == 0 ? 16 : 12;
      int i4 = 4;
      int i5 = i1 + i3 * m / 256 - hF;
      int i6 = i2 + i3 * n / 256 - hE;
      int i7 = i1 - i4 * n / 256 - hF;
      int i8 = i2 + i4 * m / 256 - hE;
      int i9 = i1 + i4 * n / 256 - hF;
      int i10 = i2 - i4 * m / 256 - hE;
      a3.bE.fj.setColor(65280);
      a3.bE.fj.fillTriangle(i5, i6, i7, i8, i9, i10);
    }
  }
  
  public ag(h paramh)
  {
    super(paramh, paramh.b0);
    this.aP = 0;
    this.aM = 0;
    this.O = "";
    this.e5 = this.e5;
    this.e2 = this.e2;
    this.aK = 20;
    this.bA = 31;
    this.aI = ((byte)(this.bA - 8));
    this.bb = 6;
    this.jdField_try = 2;
    this.gV = null;
    ar();
    this.a7 = new short[a.ad];
    this.H = new int[a.ad];
    for (int i = 0; i < this.H.length; i++)
    {
      this.a7[i] = -1;
      this.H[i] = a3.a(-1, a.C);
    }
  }
  
  public void N()
  {
    jdMethod_if((byte)12, 0);
  }
  
  public void a(byte paramByte, boolean paramBoolean)
  {
    a(paramByte, paramBoolean, 100);
  }
  
  public void a(byte paramByte, boolean paramBoolean, int paramInt)
  {
    int i = a((byte)12);
    if (paramBoolean)
    {
      if (paramByte == 7) {
        this.gp = ((short)paramInt);
      }
      i |= 1 << paramByte;
    }
    else
    {
      int j = (byte)(i ^ 0xFFFFFFFF);
      j = (byte)(j | 1 << paramByte);
      i = (byte)(j ^ 0xFFFFFFFF);
    }
    jdMethod_if((byte)12, i);
  }
  
  public boolean n(byte paramByte)
  {
    return (a((byte)12) >> paramByte & 0x1) > 0;
  }
  
  public int jdMethod_int(byte paramByte, int paramInt)
  {
    int i = jdMethod_new(paramByte, paramInt);
    if (i == -1) {
      return 0;
    }
    if (i == 0) {
      return this.hP;
    }
    if (i == 1) {
      return this.hO;
    }
    return 0;
  }
  
  public int jdMethod_new(byte paramByte, int paramInt)
  {
    int i = -1;
    for (int j = 0; j < g6[paramByte].length; j++) {
      if (paramInt == g6[paramByte][j])
      {
        i = j;
        break;
      }
    }
    return i;
  }
  
  public void m(byte paramByte)
  {
    this.bo = paramByte;
  }
  
  public byte aj()
  {
    return this.bo;
  }
  
  public void jdMethod_void(byte paramByte)
  {
    this.gD = paramByte;
  }
  
  public byte W()
  {
    return this.gD;
  }
  
  public boolean T()
  {
    return false;
  }
  
  public void a(ag paramag, byte paramByte1, int paramInt, byte paramByte2, boolean paramBoolean)
  {
    int j;
    try
    {
      if (jdMethod_else()) {
        return;
      }
      if (((this.fE) || (this.hv)) && ((paramByte1 == hX) || (paramByte1 == ig))) {
        return;
      }
      if ((a3.bE.cJ.ki) && (paramByte1 == d8)) {
        return;
      }
      if ((this.eT) && (paramByte1 == dt)) {
        return;
      }
      if ((this.a8) || (this.dZ) || (this.hU) || (this.a4 == 5)) {
        return;
      }
      if (this.a4 == 112) {
        return;
      }
      if (paramBoolean) {
        return;
      }
      this.ao = false;
    }
    catch (Exception localException1)
    {
      j = a.new;
      a((byte)0, (short)1, 10, true);
      this.fd = true;
      j++;
    }
    finally
    {
      h.jdMethod_if(-a.J, a.J);
    }
    a3.bE.B.a(this, paramByte1);
    int i = 1;
    try
    {
      this.dI = paramInt;
      if ((this == a3.bE.cZ) && (a3.bE.cJ.jdField_if > 2))
      {
        if ((this.fm == d8) || (this.fm == eV))
        {
          if ((this.fm == d8) && ((g.dD == 0) || (g.dD == 3)))
          {
            a3.bE.cJ.a(0, (short)0, false, 30);
            return;
          }
          if (this.fm == eV)
          {
            j = 1;
            if ((g.dD != 2) && (g.dD != 1)) {
              j = 0;
            } else if ((g.jS == null) || (g.jS.length == 0)) {
              j = 0;
            }
            if (j == 0)
            {
              a3.bE.cJ.a(0, (short)0, false, 30);
              return;
            }
          }
          this.fW = ((short)Math.max(a((byte)24) / 2, 1));
          this.fW = a3.jdMethod_new(this.fW, a.C);
        }
        else if (az())
        {
          if ((this.fm == hI) && ((g.dD != 1) || (g.dZ != 0)))
          {
            a3.bE.cJ.a(0, (short)0, false, 30);
            return;
          }
          if (((this.fm == dV) || (this.fm == ey)) && ((g.dD == 0) || (g.dD == 3)))
          {
            a3.bE.cJ.a(0, (short)0, false, 30);
            return;
          }
          if (this.fm == hI)
          {
            this.fW = ((short)Math.max(a((byte)24) / 2, 1));
            this.fW = a3.jdMethod_new(this.fW, a.C);
          }
          else
          {
            this.fW = ((short)Math.max(a((byte)26) / 2, 1));
            this.fW = a3.jdMethod_new(this.fW, a.C);
          }
        }
        if (a3.bE.cJ.M())
        {
          ag();
          a3.bE.cJ.a(1, (short)0, false, 30);
          return;
        }
        if (a3.bE.cJ.O())
        {
          ag();
          a3.bE.cJ.a(2, (short)0, false, 30);
          return;
        }
        if (a3.bE.cJ.N())
        {
          ag();
          a3.bE.cJ.a(2, (short)0, false, 30);
          return;
        }
        if (aw())
        {
          i((byte)a.ac);
          return;
        }
        if (a3.bE.cJ.K()) {
          return;
        }
      }
    }
    catch (Exception localException2)
    {
      a(a((byte)24), true);
      this.fb = true;
    }
    finally
    {
      int m;
      if ((this == a3.bE.cZ) && (a3.bE.cJ.jdField_if > 2))
      {
        this.f = ((short)a((byte)24));
        m = jdMethod_else() ? a((byte)20) : a((byte)20);
        this.ak = ((short)a3.jdMethod_do(this.hh, a.t));
        m += h.jdMethod_if(-a((byte)24), a((byte)20));
        this.bx = ((short)this.fm);
        i = m > 0 ? 1 : 0;
      }
    }
    if ((this == a3.bE.cZ) && (a3.bE.cJ.jdField_if > 2)) {
      this.D = true;
    }
    boolean bool = false;
    try
    {
      a3.bE.S.a(this, true);
      i = bool = 1;
    }
    catch (Exception localException3)
    {
      int k = h.jdMethod_if(-5, 5);
      a3.bE.S.a(null, false);
      this.e9 = true;
      a(a((byte)20) + k, true);
    }
    finally
    {
      bool = a3.bE.eC;
      a3.bE.S.a(this, false);
      i = !bool ? 1 : 0;
    }
  }
  
  private boolean jdMethod_if(short paramShort1, short paramShort2)
  {
    if ((this.aP == paramShort1) && (this.aM == paramShort2))
    {
      if (!jdMethod_else()) {
        this.a4 = 0;
      }
      return true;
    }
    this.a4 = 1;
    if (Math.abs(this.aP - paramShort1) <= f())
    {
      this.aP = paramShort1;
    }
    else if (this.aP < paramShort1)
    {
      this.au = 1;
      this.aP = ((short)(this.aP + f()));
    }
    else if (this.aP > paramShort1)
    {
      this.au = 3;
      this.aP = ((short)(this.aP - f()));
    }
    if (Math.abs(this.aM - paramShort2) <= f()) {
      this.aM = paramShort2;
    } else if (this.aM < paramShort2) {
      this.aM = ((short)(this.aM + f()));
    } else if (this.aM > paramShort2) {
      this.aM = ((short)(this.aM - f()));
    }
    if ((this.aP == paramShort1) && (this.aM == paramShort2)) {
      this.fp = 0;
    }
    return false;
  }
  
  public void a(byte paramByte1, short paramShort1, String paramString, byte paramByte2, byte paramByte3, short paramShort2, byte paramByte4)
  {
    if (this.fI >= g9) {
      return;
    }
    if (this.eP == null)
    {
      this.dR = new byte[g9];
      this.eQ = new short[g9];
      this.eP = new String[g9];
      this.ex = new byte[g9];
      this.dG = new byte[g9];
      this.hc = new short[g9];
      this.er = new byte[g9];
    }
    synchronized (this.eP)
    {
      this.dR[this.fI] = paramByte1;
      this.eQ[this.fI] = paramShort1;
      this.eP[this.fI] = paramString;
      this.ex[this.fI] = paramByte2;
      this.dG[this.fI] = paramByte3;
      this.hc[this.fI] = paramShort2;
      this.er[this.fI] = paramByte4;
      this.fI = ((byte)(this.fI + 1));
    }
  }
  
  public void G()
  {
    synchronized (this.eP)
    {
      if (R())
      {
        for (int i = 0; i < this.fI - 1; i = (byte)(i + 1))
        {
          this.dR[i] = this.dR[(i + 1)];
          this.eQ[i] = this.eQ[(i + 1)];
          this.eP[i] = this.eP[(i + 1)];
          this.ex[i] = this.ex[(i + 1)];
          this.dG[i] = this.dG[(i + 1)];
          this.hc[i] = this.hc[(i + 1)];
          this.er[i] = this.er[(i + 1)];
        }
        this.fI = ((byte)(this.fI - 1));
      }
    }
  }
  
  public boolean R()
  {
    return this.fI > 0;
  }
  
  public void g(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      if (a((byte)16) > 0) {
        this.a4 = 0;
      } else {
        this.a4 = 10;
      }
      break;
    case 1: 
      this.a4 = 1;
      break;
    case 3: 
      this.a4 = 0;
      break;
    case 4: 
      this.a4 = 0;
    }
    this.fv = paramByte;
  }
  
  public void X()
  {
    this.dz = 0;
    this.gf = 0;
    this.fV = 0;
    this.hB = false;
  }
  
  public void D()
  {
    for (int i = 0; i < 5; i = (byte)(i + 1))
    {
      int j = h.jdMethod_if(10, a3.bE.ad - h.u - 10);
      int k = h.jdMethod_if(10, a3.bE.dz - h.b8 - 10);
      if ((a3.bE.fJ[a3.bE.cJ.jdMethod_for(j, k)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK / 2, k)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK, k)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j, k + this.bA)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK / 2, k + this.bA)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK, k + this.bA)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK, k + this.bA / 2)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j, k + this.bA / 2)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK / 2, k + this.bA / 2)] > 0))
      {
        this.dT = ((short)j);
        this.dS = ((short)k);
        return;
      }
    }
  }
  
  public void ab()
  {
    int i = (byte)h.jdMethod_if(1, 100);
    if (i < 50)
    {
      g((byte)0);
      if ((a3.bE.cJ.ki) && (this.aD == a3.bE.cZ) && (a3.bE.cZ.a(this.aD)))
      {
        a3.bE.cZ.d();
        a3.bE.cZ.ek = true;
        a3.bE.cZ.gb = 0;
      }
    }
    else
    {
      this.d2 = 1;
      this.ib = 0;
      g((byte)4);
    }
  }
  
  private void K()
  {
    switch (this.fv)
    {
    case 0: 
      if ((this.a4 == 112) && (this.bF != 4)) {
        return;
      }
      if (R()) {
        if (this.dR[0] == 0)
        {
          if (this.eP[0].equals(a3.bE.cZ.O))
          {
            this.fw = a3.bE.cZ;
            g((byte)1);
            a3.bE.cZ.ek = false;
          }
          else
          {
            int i = 0;
            for (int j = 0; j < a3.bE.cJ.kT; j = (byte)(j + 1)) {
              if ((g.hm[j].O.equals(this.eP[0])) && (!g.hm[j].jdMethod_else()))
              {
                this.fw = g.hm[j];
                i = 1;
                g((byte)1);
                if (g.hm[j].fv != 4) {
                  break;
                }
                g.hm[j].g((byte)0);
                break;
              }
            }
            if (i == 0) {
              G();
            }
          }
        }
        else
        {
          ar localar = a3.bE.jdMethod_goto(this.eQ[0]);
          if (localar != null)
          {
            this.fw = localar;
            g((byte)1);
          }
          else
          {
            G();
          }
        }
      }
      if (this.hB)
      {
        this.fV = ((byte)(this.fV + 1));
        if ((this.fV > 30) && (this.dz > 0))
        {
          if (a3.bE.aG.jdMethod_int(4502))
          {
            a3.bE.aG.jdMethod_new(a3.bE.cJ.jdField_if);
            a3.bE.aG.jdMethod_if(this.O);
            a3.bE.aG.jdMethod_do(3);
            a3.bE.aG.jdMethod_do(-1);
            a3.bE.aG.jdMethod_new(this.dz);
            a3.bE.aG.jdMethod_do((!a3.bE.cJ.e7) && (!a3.bE.cJ.ki) ? 1 : 0);
            a3.bE.aG.jdMethod_if();
          }
          X();
          this.d2 = 1;
          this.ib = 0;
          g((byte)4);
          return;
        }
      }
      if (a((byte)16) == 0)
      {
        this.a4 = 10;
        this.aP = this.dT;
        this.aM = this.dS;
      }
      else if ((this.a4 != 112) || (this.bF != 4))
      {
        jdMethod_if(this.dT, this.dS);
      }
      break;
    case 1: 
      if ((this.fw == null) || (this.fw.jdMethod_else()))
      {
        G();
        g((byte)0);
        return;
      }
      this.a4 = 1;
      if (this.aP + this.aK / 2 < this.fw.aP + this.fw.aK / 2)
      {
        this.au = 1;
        if (Math.abs(this.aP + this.aK / 2 - this.fw.aP - this.fw.aK / 2) > 20) {
          this.aP = ((short)(this.aP + f()));
        }
      }
      else if (this.aP + this.aK / 2 > this.fw.aP + this.fw.aK / 2)
      {
        this.au = 3;
        if (Math.abs(this.aP + this.aK / 2 - this.fw.aP - this.fw.aK / 2) > 20) {
          this.aP = ((short)(this.aP - f()));
        }
      }
      if (Math.abs(this.aM + this.bA - this.fw.aM - this.fw.bA) <= f()) {
        this.aM = ((short)(this.fw.aM + this.fw.bA - this.bA));
      } else if (this.aM + this.bA < this.fw.aM + this.fw.bA) {
        this.aM = ((short)(this.aM + f()));
      } else if (this.aM + this.bA > this.fw.aM + this.fw.bA) {
        this.aM = ((short)(this.aM - f()));
      }
      if ((Math.abs(this.aP + this.aK / 2 - this.fw.aP - this.fw.aK / 2) < 30) && (Math.abs(this.aM + this.bA - this.fw.aM - this.fw.bA) < 10))
      {
        if (this.aP + this.aK / 2 > this.fw.aP + this.fw.aK / 2) {
          this.au = 3;
        } else {
          this.au = 1;
        }
        if ((this.fw instanceof ag))
        {
          if ((((ag)this.fw).fw == this) && (((ag)this.fw).fv != 3))
          {
            g((byte)3);
          }
          else if ((this.fw.a4 == 0) || (this.fw == a3.bE.cZ))
          {
            a(this.ex[0], this.dG[0], this.hc[0], this.er[0]);
            g((byte)2);
          }
        }
        else
        {
          a(this.ex[0], this.dG[0], this.hc[0], (byte)-1);
          g((byte)2);
        }
      }
      break;
    case 4: 
      if (R()) {
        g((byte)0);
      } else if ((this.d2 == 1) && ((this.ib = (byte)(this.ib + 1)) > 80)) {
        g((byte)0);
      }
      break;
    }
  }
  
  public void jdMethod_case()
  {
    if (as())
    {
      K();
      return;
    }
    if (a3.bE.cZ == this)
    {
      if (this.ao)
      {
        jdMethod_long();
        jdMethod_if();
        b();
      }
    }
    else {
      switch (this.hd)
      {
      case 0: 
        if (this.h2 == null)
        {
          this.hd = 2;
          return;
        }
        if (this.h2 == a3.bE.cZ)
        {
          if (a3.bE.cZ.jdMethod_else()) {
            this.hd = 2;
          }
        }
        else if (this.h2.a((byte)16) <= 0)
        {
          this.hd = 2;
          return;
        }
        this.a4 = 1;
        if (this.aP + this.aK / 2 < this.h2.aP + this.h2.aK / 2)
        {
          this.au = 1;
          if (Math.abs(this.aP + this.aK / 2 - this.h2.aP - this.h2.aK / 2) > 20) {
            this.aP = ((short)(this.aP + f()));
          }
        }
        else if (this.aP + this.aK / 2 > this.h2.aP + this.h2.aK / 2)
        {
          this.au = 3;
          if (Math.abs(this.aP + this.aK / 2 - this.h2.aP - this.h2.aK / 2) > 20) {
            this.aP = ((short)(this.aP - f()));
          }
        }
        if (Math.abs(this.aM + this.bA - this.h2.aM - this.h2.bA) <= f()) {
          this.aM = ((short)(this.h2.aM + this.h2.bA - this.bA));
        } else if (this.aM + this.bA < this.h2.aM + this.h2.bA) {
          this.aM = ((short)(this.aM + f()));
        } else if (this.aM + this.bA > this.h2.aM + this.h2.bA) {
          this.aM = ((short)(this.aM - f()));
        }
        if ((Math.abs(this.aP + this.aK / 2 - this.h2.aP - this.h2.aK / 2) < 30) && (Math.abs(this.aM + this.bA - this.h2.aM - this.h2.bA) < 10))
        {
          if (this.aP + this.aK / 2 > this.h2.aP + this.h2.aK / 2) {
            this.au = 3;
          } else {
            this.au = 1;
          }
          if ((this.h2 instanceof ag))
          {
            if (((ag)this.h2).a(this))
            {
              a(this.gO, this.fq, this.f0, this.hg);
              this.hd = 1;
            }
          }
          else
          {
            a(this.gO, this.fq, this.f0, this.hg);
            this.hd = 1;
          }
        }
        break;
      case 1: 
        break;
      case 3: 
        break;
      case 2: 
        if (this.a4 != 112)
        {
          this.a4 = 0;
          synchronized (a3.bE.cJ.mX)
          {
            for (int i = 0; i < a3.bE.cJ.kT; i++) {
              if (a3.bE.cJ.iy[i].equals(this.O))
              {
                a3.bE.cJ.iG[i] = 70;
                a3.bE.cJ.mX[i] = this.aP;
                a3.bE.cJ.mW[i] = this.aM;
                a3.bE.cJ.jq[i] = this.aP;
                a3.bE.cJ.jo[i] = this.aM;
                a3.bE.cJ.dQ[i] = this.au;
                break;
              }
            }
          }
          this.eN = -1;
          this.es = null;
          this.fL = -1;
          this.eB = null;
          this.gq = true;
        }
        break;
      }
    }
  }
  
  public byte jdMethod_int(byte paramByte)
  {
    if (this.gD == 1) {
      paramByte = (byte)(paramByte + 27);
    }
    return paramByte;
  }
  
  public void ar()
  {
    if (this.dY == null) {
      this.dY = new byte[3];
    }
    for (int i = 0; i < this.dY.length; i = (byte)(i + 1)) {
      this.dY[i] = -1;
    }
  }
  
  public boolean a(byte[][] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i = (byte)(i + 1))
    {
      int j = (byte)(this.dY.length - paramArrayOfByte[i].length);
      int k = 1;
      for (int m = 0; m < paramArrayOfByte.length; m = (byte)(m + 1)) {
        if (this.dY[(j + m)] != paramArrayOfByte[i][m])
        {
          k = 0;
          break;
        }
      }
      if (k != 0) {
        return true;
      }
    }
    return false;
  }
  
  //读取了地图存档
  public void jdMethod_char(byte paramByte)
  {
    for (int i = 0; i < this.dY.length - 1; i = (byte)(i + 1)) {
      this.dY[i] = this.dY[(i + 1)];
    }
    this.dY[(this.dY.length - 1)] = paramByte;
  }
  
  public void a(boolean paramBoolean)
  {
    this.ao = false;
    if (paramBoolean)
    {
      if (a(eh))
      {
        this.a4 = 7;
        this.hU = true;
        this.ie = false;
      }
      else if (this.a4 == 5)
      {
        this.a4 = 4;
        this.hU = true;
        this.ie = false;
      }
      else if (this.hy)
      {
        x();
        this.hU = true;
      }
    }
    else if (!this.hy)
    {
      this.hU = true;
      if (this.hZ >= 10) {
        this.a4 = 6;
      } else {
        x();
      }
    }
    ar();
  }
  
  public void x()
  {
    if (this.fF <= 0) {
      this.f3 = 0;
    }
    a3.bE.b0.a(0, 0, this.al);
    a3.bE.b0.a(ao(), 0, this.al);
    this.a4 = 3;
    if (this.jdField_try == 2) {
      this.jdField_try = 3;
    } else if (this.jdField_try == 0) {
      this.jdField_try = 1;
    }
  }
  
  public void a(byte paramByte1, byte paramByte2, short paramShort, byte paramByte3)
  {
    this.jdField_for = a3.a(paramShort, 0);
    this.e = paramByte3;
    switch (paramByte1)
    {
    case 3: 
      this.f3 = 0;
      x();
      this.hU = true;
      break;
    case 4: 
      this.a4 = 4;
      this.hU = true;
      break;
    case 6: 
      this.a4 = 6;
      this.hU = true;
      break;
    case 2: 
      an();
      a(a.char, paramByte2, -1, this);
      break;
    case 7: 
      this.a4 = 7;
      this.hU = true;
    }
  }
  
  public void ag()
  {
    this.fm = -1;
    this.eZ = -1;
    this.fM = true;
    this.fB = -1;
    this.gG = 0;
    this.ed = -1;
    this.hH = -1;
    this.gd = 0;
    this.fH = null;
    this.e0 = false;
    this.gN = null;
    this.hW = false;
    this.dJ = -1;
    this.fe = -1;
    this.hK = -1;
    this.gh = false;
    this.id = 0;
    this.ep = null;
    this.dD = -1;
    this.fW = a3.jdMethod_new(a.ac, a.C);
    this.hi = -1;
    this.ga = false;
    this.hk = false;
    this.g1 = null;
    this.bD = false;
    this.eY = null;
  }
  
  public void C()
  {
    for (int i = 1; i >= 0; i = (byte)(i - 1))
    {
      if (i == 0) {
        a3.bE.fj.setColor(16777215);
      } else {
        a3.bE.fj.setColor(0);
      }
      int j = (byte)(3 * a3.bE.cJ.jdField_int / 5 % 2);
      for (int k = -10; k <= 260; k = (short)(k + 90)) {
        a3.bE.fj.drawArc(this.fU + i - fN / 2 - j, this.fT + i - fN / 2 - j, fN + j * 2, fN + j * 2, k, 20);
      }
      a3.bE.fj.fillRect(this.fU - 3 + i, this.fT + i, 6, 1);
      a3.bE.fj.fillRect(this.fU + i, this.fT - 3 + i, 1, 6);
    }
  }
  
  public void i(byte paramByte)
  {
    if (!this.gE)
    {
      a3.bE.cJ.a("组队状态下才可使用.", (short)0, false, 30);
      return;
    }
    if (a3.bE.cJ.g6.length == 0)
    {
      a3.bE.cJ.a("队伍中没有其他队员.", (short)0, false, 30);
      return;
    }
    this.eF = paramByte;
    a3.bE.cJ.eq = 0;
    a3.bE.cJ.a("选择要复活的队员", (short)92, false, 30);
  }
  
  private void ad()
  {
    if ((!this.fM) && (this == a3.bE.cZ))
    {
      int i = (short)((jdMethod_byte() + a3.jdMethod_do(this.b, a.C) / a.t) * h.jdMethod_if(80, 120) / 100);
      i = (short)Math.max(1, i);
      if (this.gE)
      {
        if ((this.dJ == 0) && (this.dD == 0) && (a3.bE.aG.jdMethod_int(3509)))
        {
          a3.bE.aG.jdMethod_for(this.gz);
          a3.bE.aG.jdMethod_do(this.fm);
          a3.bE.aG.jdMethod_do(0);
          a3.bE.aG.jdMethod_if("");
          a3.bE.aG.jdMethod_new(i);
          a3.bE.aG.jdMethod_if();
        }
        if ((this.dJ == 1) && (a3.bE.aG.jdMethod_int(3509)))
        {
          a3.bE.aG.jdMethod_for(this.gz);
          a3.bE.aG.jdMethod_do(this.fm);
          a3.bE.aG.jdMethod_do(1);
          a3.bE.aG.jdMethod_if(a3.bE.cJ.g6[a3.bE.cJ.eq]);
          a3.bE.aG.jdMethod_new(i);
          a3.bE.aG.jdMethod_if();
        }
      }
      if (this.dJ == 0)
      {
        if (i > a((byte)20) - a((byte)16)) {
          i = (short)(a((byte)20) - a((byte)16));
        }
        a3.bE.a(i, this.aP, this.aM, (byte)1);
        jdMethod_do((byte)16, i);
        a3.bE.cJ.a(this, false, i);
      }
    }
  }
  
  public boolean a(a3 parama3)
  {
    if (this.eT) {
      return false;
    }
    if ((as()) && (this.fv == 4)) {
      return false;
    }
    if ((this == a3.bE.cZ) && ((parama3 instanceof ar)) && (this.a4 == 14)) {
      return false;
    }
    if (((this.a4 == 2) || (this.a4 == 5)) && ((this != a3.bE.cZ) || ((this == a3.bE.cZ) && (!(parama3 instanceof ag))))) {
      return false;
    }
    if ((this.a4 == 112) && ((this.bF == 0) || (this.bF == 1) || (this.bF == 3) || (this.bF == 2))) {
      return false;
    }
    if (this.a8) {
      return false;
    }
    if (jdMethod_else()) {
      return false;
    }
    if (parama3 == a3.bE.cZ)
    {
      if ((parama3.a4 == 2) && (((ag)parama3).eZ == 2)) {
        return this.T;
      }
    }
    else if (this.T) {
      return false;
    }
    return true;
  }
  
  public void a(a3 parama3, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, short paramShort, boolean paramBoolean)
  {
    if ((paramShort > 0) && (this == a3.bE.cZ) && ((parama3 instanceof ag)) && (a3.bE.aG.jdMethod_int(4111)))
    {
      a3.bE.aG.jdMethod_for(a3.jdMethod_new(a3.bE.cZ.a((byte)16), 4));
      a3.bE.aG.jdMethod_for(a3.jdMethod_new(paramShort, 4));
      a3.bE.aG.jdMethod_if();
    }
    if (((this.fE) || (this.hv)) && (paramByte3 == 1))
    {
      paramByte3 = 4;
      paramByte4 = 3;
      paramBoolean = false;
    }
    if ((this == a3.bE.cZ) && (!a3.bE.cJ.ki) && (!a3.bE.cJ.e7) && ((parama3 instanceof ag))) {
      a3.bE.a(parama3, parama3.O);
    }
    if ((as()) && (parama3 == a3.bE.cZ))
    {
      if (paramShort != 55537) {
        this.dz = ((short)(this.dz + paramShort));
      }
      if (paramByte1 == 2)
      {
        if ((((ag)parama3).eZ != 3) || (((ag)parama3).id == ((ag)parama3).gd - 1))
        {
          this.gf = ((byte)(this.gf + 2));
          if (a3.bE.aG.jdMethod_int(4502))
          {
            a3.bE.aG.jdMethod_new(a3.bE.cJ.jdField_if);
            a3.bE.aG.jdMethod_if(this.O);
            a3.bE.aG.jdMethod_do(paramByte1);
            a3.bE.aG.jdMethod_do(paramByte2);
            a3.bE.aG.jdMethod_new(this.dz);
            a3.bE.aG.jdMethod_do((!a3.bE.cJ.e7) && (!a3.bE.cJ.ki) ? 1 : 0);
            a3.bE.aG.jdMethod_if();
          }
          this.dz = 0;
        }
      }
      else if ((paramByte1 == 6) || (paramByte1 == 4) || (paramByte1 == 7) || ((paramByte1 == 3) && (((ag)parama3).f3 == e7[((ag)parama3).bo].length - 1)))
      {
        this.gf = ((byte)(this.gf + 1));
        if (a3.bE.aG.jdMethod_int(4502))
        {
          a3.bE.aG.jdMethod_new(a3.bE.cJ.jdField_if);
          a3.bE.aG.jdMethod_if(this.O);
          a3.bE.aG.jdMethod_do(paramByte1);
          a3.bE.aG.jdMethod_do(paramByte2);
          a3.bE.aG.jdMethod_new(this.dz);
          a3.bE.aG.jdMethod_do((!a3.bE.cJ.e7) && (!a3.bE.cJ.ki) ? 1 : 0);
          a3.bE.aG.jdMethod_if();
        }
        this.dz = 0;
      }
      else if (!this.hB)
      {
        this.fV = 0;
        this.hB = true;
      }
    }
    this.hU = false;
    this.ao = false;
    this.dZ = false;
    jdMethod_if(parama3, paramByte1, paramByte2, paramByte3, paramByte4, paramByte5, paramShort, paramBoolean);
    this.a4 = 112;
    this.jdField_new = 0;
    this.fp = 0;
  }
  
  public void jdMethod_long(byte paramByte)
  {
    if (!this.hr) {
      return;
    }
    if ((this.a4 == 13) || (this.a4 == 16)) {
      return;
    }
    if (this.a8) {
      return;
    }
    if (this.hU) {
      return;
    }
    if (this.dZ) {
      return;
    }
    if (this.a4 == 14)
    {
      this.hV = true;
      this.g5 = paramByte;
      return;
    }
    if ((this.a4 != 1) && (this.a4 != 0)) {
      return;
    }
    if (jdMethod_else()) {
      return;
    }
    if (n((byte)0)) {
      paramByte = (byte)((paramByte + 2) % 4);
    }
    if (paramByte == 1) {
      this.au = 1;
    } else if (paramByte == 3) {
      this.au = 3;
    }
    this.hw = 6;
    jdMethod_char(paramByte);
    if (a(fu))
    {
      this.a4 = 5;
      ar();
    }
    else
    {
      this.a4 = 1;
    }
    this.jdField_try = paramByte;
    this.ao = true;
    this.fp = 0;
  }
  
  protected int f()
  {
    int i = (byte)(this.bb + (this.bo == 2 ? 1 : 0) - (this.bo == 1 ? 1 : 0));
    if (this != a3.bE.cZ) {
      return i * a.c / a.n;
    }
    i = (byte)(i + L());
    if (a3.bE.jdMethod_new((byte)1)) {
      i = (byte)(i + a.char);
    }
    if (n((byte)1)) {
      i = (byte)(i / a.t);
    }
    if (n((byte)7)) {
      return 0;
    }
    if (this.al[1] == jdMethod_int((byte)14)) {
      return i * a.t;
    }
    return i;
  }
  
  public void d()
  {
    this.hj = null;
    if (jdMethod_else()) {
      return;
    }
    if ((this.a4 == 2) && (this.hH == 1) && (!this.e0))
    {
      this.e0 = true;
      this.ao = false;
      if (this.eZ == 3) {
        a3.bE.b0.a(jdMethod_int(this.fH[this.id]), 0, this.al);
      }
    }
    else if (this.a4 != 5)
    {
      this.eY = null;
      this.T = false;
      this.ao = false;
      this.hU = false;
      this.dZ = false;
      this.a4 = 0;
      if (as()) {
        g((byte)0);
      } else if (this != a3.bE.cZ) {
        this.hd = 2;
      }
    }
  }
  
  public boolean as()
  {
    if ((this != a3.bE.cZ) && (a3.bE.cJ.ki)) {
      return true;
    }
    return a3.bE.cJ.bD == this;
  }
  
  private boolean jdMethod_else(byte paramByte)
  {
    boolean bool = false;
    int i = 0;
    if (this.eZ != 3)
    {
      if ((this.hH != 1) || (this.e0))
      {
        if (this.hk) {
          bool = jdMethod_null();
        } else {
          bool = false;
        }
        if (this.al[1] != jdMethod_int((byte)1)) {
          i = this.al[4] == 0 ? 1 : 0;
        } else {
          i = 1;
        }
      }
      return (bool) && (i != 0);
    }
    return (this.id == this.gd - 1) && (a3.bE.b0.jdMethod_if(this.al));
  }
  
  public int H()
  {
    int i = (short)a.ac;
    for (int j = 0; j < a.e; j = (byte)(j + 1))
    {
      short s = (short)a3.jdMethod_int(this.H[j], a.C);
      if (h.v(s)) {
        i = (short)(i + h.jdMethod_null(s));
      }
    }
    i = (short)(i / a.t);
    return (a((byte)38) + i) / a.i;
  }
  
  public int O()
  {
    int i = (short)a.ac;
    for (int j = 0; j < a.e; j = (byte)(j + 1))
    {
      short s = (short)a3.jdMethod_int(this.H[j], a.C);
      if (h.v(s)) {
        i = (short)(i + h.g(s));
      }
    }
    i = (short)(i / a.t);
    return a((byte)40) + i;
  }
  
  public int L()
  {
    return Math.min(a.char, O() / a.o);
  }
  
  public int Q()
  {
    int i = (short)a.ac;
    for (int j = 0; j < a.e; j = (byte)(j + 1))
    {
      short s = (short)a3.jdMethod_int(this.H[j], a.C);
      if (h.v(s)) {
        i = (short)(i + h.E(s));
      }
    }
    i = (short)(i / a.t);
    return (a((byte)42) + i) / a.i;
  }
  
  public int M()
  {
    int i = (short)a.ac;
    for (int j = 0; j < a.e; j = (byte)(j + 1))
    {
      short s = (short)a3.jdMethod_int(this.H[j], a.C);
      if (h.v(s)) {
        i = (short)(i + h.C(s));
      }
    }
    i = (short)(i / a.t);
    return (a((byte)44) + i) / a.i;
  }
  
  public int F()
  {
    int i = (short)a.ac;
    for (int j = 0; j < a.e; j = (byte)(j + 1))
    {
      short s = (short)a3.jdMethod_int(this.H[j], a.C);
      if (h.v(s)) {
        i = (short)(i + h.p(s));
      }
    }
    i = (short)(i / a.t);
    return Math.min(a.L, (a((byte)46) + i) / a.o);
  }
  
  public int ay()
  {
    int i = (short)a.ac;
    for (int j = 0; j < a.e; j = (byte)(j + 1))
    {
      short s = (short)a3.jdMethod_int(this.H[j], a.C);
      if (h.v(s)) {
        i = (short)(i + h.n(s));
      }
    }
    i = (short)(i / a.t);
    return Math.min(a.F, (a((byte)48) + i) / a.i);
  }
  
  public short ac()
  {
    short s1 = 0;
    for (int i = 0; i < 1; i = (byte)(i + 1))
    {
      short s2 = (short)a3.jdMethod_int(this.H[i], a.C);
      if (h.v(s2))
      {
        int j = h.f(s2);
        if (j > a.ac) {
          s1 = (short)(s1 + (short)Math.max(a.char, (a.char + h.z(s2)) * (a.char + h.j(s2)) * j / a.J));
        }
      }
    }
    return s1;
  }
  
  public short ai()
  {
    short s1 = 0;
    for (int i = 0; i < 1; i = (byte)(i + 1))
    {
      short s2 = (short)a3.jdMethod_int(this.H[i], a.C);
      if (h.v(s2))
      {
        int j = h.t(s2);
        if (j > a.ac) {
          s1 = (short)(s1 + (short)Math.max(a.char, (a.char + h.z(s2)) * (a.char + h.j(s2)) * j / a.o));
        }
      }
    }
    return s1;
  }
  
  private boolean ap()
  {
    if (this != a3.bE.cZ) {
      return false;
    }
    int i = a.C;
    switch (this.bo)
    {
    case 0: 
      i = a.ad;
    }
    i = Math.min(a.D, i + Q());
    return h.jdMethod_if(a.char, a.new) <= i;
  }
  
  private boolean av()
  {
    if (this != a3.bE.cZ) {
      return false;
    }
    int i = a.N;
    switch (this.bo)
    {
    case 2: 
      i = a.Z;
    }
    i = Math.min(a.byte, i + M());
    return h.jdMethod_if(a.char, a.new) >= i;
  }
  
  private boolean a(a3 parama3, byte paramByte)
  {
    if (this != a3.bE.cZ) {
      return false;
    }
    switch (paramByte)
    {
    case 3: 
      if (this.f3 != e7[this.bo].length - 1) {
        return false;
      }
      break;
    case 2: 
      if (!this.fM) {
        return false;
      }
      break;
    }
    if (this.a4 == 2) {
      return h.jdMethod_if(a.char, a.n) <= this.fe / ((parama3 instanceof ag) ? a.t : a.char);
    }
    int i = a.T;
    switch (this.bo)
    {
    case 2: 
      i = a.p;
    }
    i = Math.min(a.Z, i + H());
    return h.jdMethod_if(a.char, a.new) <= i / ((parama3 instanceof ag) ? a.t : a.char);
  }
  
  public short a(byte paramByte, a3 parama3)
  {
    int i = (short)a.char;
    if (paramByte == 2)
    {
      if (this.fm == ey)
      {
        int j = (short)h.jdMethod_if(hF + this.fU, parama3.aP + parama3.aK / a.t, hE + this.fT, parama3.aM + parama3.bA / a.t);
        int k = (short)a((byte)28);
        int m = (short)(k * a.t);
        if (j > Math.min(parama3.aK / a.t, parama3.bA / a.t))
        {
          i = (short)a.ac;
        }
        else
        {
          i = (short)Math.max(m, k * (a.e - j));
          i = (short)(i / h.jdMethod_if(a.char, a.t));
          int n = parama3.a((byte)14) - a((byte)14);
          if (n > a.T) {
            i = (short)(i / a.ad);
          } else if (n > a.ad) {
            i = (short)(i / a.C);
          } else if (n > a.i) {
            i = (short)(i / a.t);
          }
        }
      }
      else
      {
        i = (short)jdMethod_if(parama3);
        if (this.gG == a.ac)
        {
          if ((this.a5 != a.ac) && (this.a5 != a.char)) {
            if (this.a5 == a.J) {
              i = (short)(i / a.t);
            } else if (this.a5 == a.null) {
              i = (short)(i / a.C);
            }
          }
        }
        else if (this.gG == a.char)
        {
          if (this.a5 >= a.t) {
            i = (short)(i / a.t);
          }
        }
        else if (this.gG == a.i)
        {
          if (this.a5 > a.J) {
            i = (short)(i / a.t);
          }
        }
        else if (this.gG == a.C)
        {
          if (this.a5 >= a.c) {
            i = (short)(i / a.i);
          } else if (this.a5 >= a.ad) {
            i = (short)(i / a.t);
          }
        }
        else if ((this.gG == a.J) && (this.a5 >= a.C)) {
          i = (short)(i / a.t);
        }
        if (this.eZ == a.char) {
          i = (short)Math.max(a.char, i * this.g8 * a.C / (this.gK * a.i));
        }
      }
    }
    else
    {
      i = (short)jdMethod_do(parama3);
      switch (paramByte)
      {
      case 3: 
        if (this.f3 == e7[this.bo].length - 1) {
          i = (short)(i * a.t / (e7[this.bo].length + a.char));
        } else {
          i = (short)(i / (e7[this.bo].length + a.char));
        }
        break;
      case 7: 
        i = (short)(i / a.i);
        break;
      case 4: 
        i = (short)(i / a.t);
        break;
      case 6: 
        i = (short)(i * a.t / (e7[this.bo].length + a.char));
      }
      i = (short)Math.max(a.char, i);
      if (this.f3 == e7[this.bo].length - 1)
      {
        if (ap())
        {
          i = (short)(i * a.t);
          I();
        }
        else if (av())
        {
          i = (short)a.ac;
        }
      }
      else if ((paramByte == 4) && (ap()))
      {
        i = (short)(i * a.t);
        I();
      }
    }
    return i;
  }
  
  public void a(a3 parama3, byte paramByte1, byte paramByte2, byte paramByte3, boolean paramBoolean, byte paramByte4, short paramShort)
  {
    this.eE = a(parama3, paramByte1);
    if ((paramByte1 == 2) && (this.fm == ey))
    {
      paramByte1 = 6;
      paramByte2 = 0;
      paramByte3 = 0;
      paramBoolean = true;
      paramByte4 = 56;
    }
    if ((paramByte1 == 15) && ((parama3 instanceof ar)))
    {
      if ((this.eY == null) && (!parama3.bz))
      {
        this.eY = parama3;
        ((ar)parama3).b0 = 7;
        return;
      }
      if (parama3 != this.eY) {
        return;
      }
    }
    if ((paramByte1 == 2) && (this.eZ == 3) && (this.fm != hI))
    {
      if ((this.id == a.ac) && (this.ep == null) && (paramShort != a.ac))
      {
        this.gh = true;
        this.ep = parama3;
        this.gV = parama3;
        this.ep.a(this, paramByte1, this.fm, (byte)5, (byte)a.new, paramByte4, (short)-a.ae, false);
      }
      else if (this.ep == parama3)
      {
        if (this.id == this.gd - 1)
        {
          if (a(parama3, paramByte1))
          {
            this.ep.a(this, paramByte1, this.fm, (byte)5, this.hK, paramByte4, paramShort, false);
          }
          else
          {
            a3 tmp247_244 = this.ep;
            tmp247_244.bg = ((short)(tmp247_244.bg + 1));
            this.ep.a(this, paramByte1, this.fm, paramByte2, paramByte3, paramByte4, paramShort, paramBoolean);
          }
        }
        else {
          this.ep.a(this, paramByte1, this.fm, (byte)5, (byte)a.new, paramByte4, (short)-a.ae, false);
        }
      }
    }
    else
    {
      if ((paramByte1 == 2) && (this.fm == hI))
      {
        parama3.a(this, (byte)2, this.fm, (byte)3, (byte)0, (byte)55, (short)55537, false);
        return;
      }
      if ((paramByte1 == 2) && (this.eZ != a.i) && (this.dD == a.char)) {
        if (this.g1 == null) {
          this.g1 = parama3;
        } else if (this.g1 != parama3) {
          return;
        }
      }
      if ((this.eE) && ((this.gV == null) || (this.gV == parama3)))
      {
        this.gV = parama3;
        this.gV.a(this, paramByte1, this.fm, (byte)5, paramByte1 == 2 ? this.hK : this.bH, paramByte4, paramShort, false);
      }
      else if (this.gV == parama3)
      {
        if ((!this.eE) && ((paramByte1 != 3) || (this.f3 == e7[this.bo].length - 1)))
        {
          a3 tmp503_500 = this.gV;
          tmp503_500.bg = ((short)(tmp503_500.bg + 1));
          parama3.a(this, paramByte1, this.fm, paramByte2, paramByte3, paramByte4, paramShort, paramBoolean);
        }
        else if (paramByte2 == 4)
        {
          this.gV.a(this, paramByte1, this.fm, (byte)5, (byte)-(this.bo == 2 ? 3 : 5), paramByte4, paramShort, false);
        }
        else if ((paramByte2 == 0) || (paramByte2 == 1) || (paramByte2 == 3))
        {
          this.gV.a(this, paramByte1, this.fm, (byte)5, this.bH, paramByte4, paramShort, false);
        }
      }
      else
      {
        if ((this != a3.bE.cZ) && (this.a4 == 3) && (this.f3 != e7[this.bo].length - 1))
        {
          paramShort = (short)-a.ae;
          paramByte2 = 4;
          paramByte3 = (byte)a.o;
        }
        if ((as()) && (paramShort != -a.ae)) {
          G();
        }
        if ((this == a3.bE.cZ) && (!this.hv) && (!this.fE) && (!this.eT)) {
          A();
        }
        parama3.a(this, paramByte1, this.fm, paramByte2, paramByte3, paramByte4, paramShort, paramBoolean);
      }
    }
  }
  
  public void A()
  {
    try
    {
      this.hh = a3.jdMethod_new(a3.jdMethod_do(this.hh, a.t) + a.n, a.t);
      if (a3.jdMethod_do(this.hh, a.t) > g2) {
        this.hh = a3.jdMethod_new(g2, a.t);
      }
    }
    catch (Exception localException)
    {
      h.a(localException);
    }
  }
  
  private void jdMethod_goto(byte paramByte)
  {
    byte b1 = -1;
    int i = -1;
    boolean bool = false;
    byte b2 = 0;
    a(a3.bE.b0, this.al);
    switch (paramByte)
    {
    case 7: 
      b1 = 1;
      i = 0;
      bool = false;
      b2 = 55;
      break;
    case 6: 
      b1 = 3;
      i = 0;
      bool = false;
      b2 = 56;
      if (this.bo == 3)
      {
        b1 = 1;
        i = 1;
        bool = true;
      }
      break;
    case 4: 
      b1 = 0;
      i = 0;
      bool = true;
      b2 = 55;
      break;
    case 3: 
      if (this.f3 != e7[this.bo].length - 1)
      {
        b1 = 4;
        i = (byte)(e7[this.bo][this.f3] & 0xFF);
        if (this == a3.bE.cZ) {
          i = (byte)(i + F());
        }
        bool = false;
        this.eE = false;
        b2 = 55;
      }
      else
      {
        b1 = 3;
        bool = false;
        i = 0;
        b2 = 56;
      }
      break;
    case 2: 
      if (this.fM)
      {
        b1 = this.dJ;
        i = this.hi;
        bool = this.hW;
        b2 = 56;
        if (this.fm == ey)
        {
          this.an = new short[1][4];
          this.an[0][0] = ((short)(hF - this.aP + this.fU));
          this.an[0][1] = ((short)(hE - this.aM + this.fT));
          this.an[0][2] = ((short)a.t);
          this.an[0][3] = ((short)a.t);
        }
        else if (this.eZ != a.i)
        {
          a();
        }
        else if (this.id == a.ac)
        {
          a(a3.bE.b0, this.al);
        }
        else
        {
          a(a3.bE.b0, this.al);
          if (this.an != null) {
            a((byte)a.ac, (byte)-a.F, (byte)a.s, (byte)a.s);
          }
        }
      }
      else
      {
        a((byte)a.ac, (byte)a.ac, (byte)a.ac, (byte)a.ac);
      }
      break;
    }
    if (this.an != null)
    {
      int k;
      if ((!a3.bE.cJ.ki) && (!as()))
      {
        int j;
        if ((!a3.bE.cJ.e7) && (g.jS != null)) {
          for (j = 0; j < g.jS.length; j = (byte)(j + 1)) {
            if (jdMethod_if(g.jS[j]))
            {
              ar localar = g.jS[j];
              int n = (short)a.char;
              if (this != a3.bE.cZ)
              {
                if (this.h2 == a3.bE.cZ) {
                  n = a(paramByte, localar);
                } else {
                  n = (short)a3.jdMethod_int(this.jdField_for, 0);
                }
                if (paramByte == 2) {
                  if (this.gG == a.ac)
                  {
                    if ((this.a5 != a.ac) && (this.a5 != a.char)) {
                      if (this.a5 == a.J) {
                        n = (short)(n / (short)a.t);
                      } else if (this.a5 == a.null) {
                        n = (short)(n / (short)a.C);
                      }
                    }
                  }
                  else if (this.gG == a.char)
                  {
                    if (this.a5 >= a.t) {
                      n = (short)(n / (short)a.t);
                    }
                  }
                  else if (this.gG == a.i)
                  {
                    if (this.a5 > a.J) {
                      n = (short)(n / (short)a.t);
                    }
                  }
                  else if (this.gG == a.C)
                  {
                    if (this.a5 >= a.c) {
                      n = (short)(n / (short)a.i);
                    } else if (this.a5 >= a.ad) {
                      n = (short)(n / (short)a.t);
                    }
                  }
                  else if ((this.gG == a.J) && (this.a5 >= a.C)) {
                    n = (short)(n / (short)a.t);
                  }
                }
              }
              else
              {
                a3.bE.cJ.jdMethod_int(true);
                a3.bE.cJ.jdMethod_int(false);
                n = a(paramByte, localar);
                if (localar.a((byte)14) > a((byte)14) + 3) {
                  n = (short)Math.max(a.char, n / a.t);
                }
                if ((this.a4 == 2) && (this.fm == hI))
                {
                  n = (short)a.ac;
                  if (a3.bE.aG.jdMethod_int(4010))
                  {
                    a3.bE.aG.jdMethod_do(0);
                    a3.bE.aG.jdMethod_new(localar.t);
                    a3.bE.aG.jdMethod_new(localar.a((byte)14));
                    a3.bE.aG.jdMethod_if();
                  }
                  localar.a(this, (byte)2, this.fm, (byte)3, (byte)0, (byte)55, (short)-a.ae, false);
                  return;
                }
              }
              a(localar, paramByte, b1, i, bool, b2, n);
            }
          }
        }
        if ((a3.bE.cJ.bD != null) && (paramByte != 15) && (jdMethod_do(a3.bE.cJ.bD)))
        {
          j = a(paramByte, a3.bE.cJ.bD);
          if (j != a.ac) {
            j = (short)Math.max(a.char, j * a.t / a.i);
          }
          if ((this.a4 == 2) && (this.fm == hI))
          {
            j = (short)a.ac;
            if (Math.abs(a((byte)14) - a3.bE.cJ.bD.a((byte)14)) <= a.null)
            {
              if (a3.bE.aG.jdMethod_int(4010))
              {
                a3.bE.aG.jdMethod_do(1);
                a3.bE.aG.jdMethod_if(a3.bE.cJ.bD.O);
                a3.bE.aG.jdMethod_if();
              }
              a3.bE.cJ.bD.a(this, (byte)2, this.fm, (byte)3, (byte)0, (byte)55, (short)-a.ae, false);
            }
            else
            {
              a3.bE.cJ.jdMethod_do("由于级别相差过大,偷盗失败.");
            }
            return;
          }
          a(a3.bE.cJ.bD, paramByte, b1, i, bool, b2, j);
        }
        if (this.h2 == a3.bE.cZ)
        {
          if ((a3.bE.cZ.jdMethod_else()) || (a3.bE.cZ.a8)) {
            return;
          }
          if ((a3.bE.cZ.a4 == 112) && (a3.bE.cZ.aD != this))
          {
            if (a3.jdMethod_int(this.jdField_for, 0) == a.ac) {
              a3.bE.a((short)(a.ae - 1), a3.bE.cZ.aP, a3.bE.cZ.aM, (byte)a.ac);
            } else {
              a3.bE.a((short)-a3.jdMethod_int(this.jdField_for, 0), a3.bE.cZ.aP, a3.bE.cZ.aM, (byte)a.ac);
            }
            if (a3.jdMethod_int(this.jdField_for, 0) > a.ac)
            {
              a3.bE.cZ.jdMethod_for((byte)16, a3.jdMethod_int(this.jdField_for, 0));
              a3.bE.a(this, this.O);
            }
          }
          else if ((this.fm != hI) && (a3.bE.cZ.a(this)))
          {
            a(this.h2, paramByte, b1, i, bool, b2, (short)a3.jdMethod_int(this.jdField_for, 0));
          }
          if ((this.h2 == a3.bE.cZ) && (a3.bE.cZ.a((byte)16) > 0) && (this.e >= 0))
          {
            k = a.new;
            k = a.U + eG * jdMethod_int(this.bo, a.h);
            a3.bE.cZ.a(this.e, true, k);
            this.e = -1;
          }
          if ((paramByte == 2) && (this.eZ != a.i))
          {
            this.jdField_for = ((short)-a.ae);
            this.jdField_for = a3.a(this.jdField_for, 0);
          }
        }
      }
      else if (as())
      {
        if ((this.fw == null) || (this.fw.jdMethod_else()) || (((this.fw instanceof ag)) && (((ag)this.fw).a8))) {
          return;
        }
        if ((this.fw.a4 == 112) && (this.fw.aD != this))
        {
          if (a3.jdMethod_int(this.jdField_for, 0) == a.ac) {
            a3.bE.a((short)(a.ae - 1), a3.bE.cZ.aP, a3.bE.cZ.aM, (byte)a.ac);
          } else {
            a3.bE.a((short)-a3.jdMethod_int(this.jdField_for, 0), a3.bE.cZ.aP, a3.bE.cZ.aM, (byte)a.ac);
          }
          if (a3.jdMethod_int(this.jdField_for, 0) > a.ac)
          {
            if ((this == a3.bE.cJ.bD) && (this.fw == a3.bE.cZ)) {
              a3.bE.a(this, this.O);
            }
            this.fw.jdMethod_for((byte)16, a3.jdMethod_int(this.jdField_for, 0));
            G();
            this.fw = null;
          }
        }
        else if ((this.fm != hI) && (this.fw.a(this)))
        {
          a(this.fw, paramByte, b1, i, bool, b2, (short)a3.jdMethod_int(this.jdField_for, 0));
          if ((paramByte == 2) && (a3.jdMethod_int(this.jdField_for, 0) > a.ac)) {
            G();
          }
        }
        if ((this.fw == a3.bE.cZ) && (a3.bE.cZ.a((byte)16) > 0) && (this.e >= 0))
        {
          k = a.new;
          k = a.U + eG * jdMethod_int(this.bo, a.h);
          a3.bE.cZ.a(this.e, true, k);
          this.e = -1;
        }
        if ((paramByte == 2) && (this.eZ != a.i))
        {
          this.jdField_for = ((short)-a.ae);
          this.jdField_for = a3.a(this.jdField_for, 0);
        }
      }
      else
      {
        for (k = 0; k < a3.bE.cJ.kT; k = (byte)(k + 1)) {
          if (((a3.bE.cZ.fL < a.ac) || (g.hm[k].fL != a3.bE.cZ.fL)) && (this.fm != hI) && (jdMethod_do(g.hm[k])))
          {
            int m = a(paramByte, g.hm[k]);
            if (m != a.ac) {
              m = (short)Math.max(a.char, m * a.t / a.i);
            }
            a(g.hm[k], paramByte, b1, i, bool, b2, m);
          }
        }
      }
    }
  }
  
  public boolean a(ar paramar)
  {
    if ((paramar.cm) && (paramar.df) && (paramar.cf)) {
      if (paramar.c9 < (g.dD == 2 ? ar.bR : ar.cn)) {
        for (int i = 0; i < this.an.length; i = (byte)(i + 1)) {
          if ((this.an[i][2] != 0) && (this.an[i][3] != 0))
          {
            int j = 0;
            if ((this.a4 == 2) && (this.jdField_char >= 0) && (this.eZ != 3))
            {
              j = this.an[i][0];
            }
            else if ((this.a4 == 2) && (this.jdField_char < 0) && (this.eZ != 3))
            {
              int k = (short)a3.bE.dF.jdField_for[2];
              int m = (short)(this.w[0][0] - this.aP);
              j = this.au == 3 ? -this.an[i][0] - this.an[i][2] + k : this.an[i][0];
              j += m;
            }
            else
            {
              j = this.au == 3 ? -this.an[i][0] - this.an[i][2] + this.bh : this.an[i][0];
            }
            if ((h.a(paramar.aP + paramar.bj, paramar.aM + paramar.bi, paramar.bh, paramar.ac, this.aP + j, this.aM + this.an[i][1], this.an[i][2], this.an[i][3])) || ((this != a3.bE.cZ) && (this.h2 == paramar))) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  private boolean jdMethod_if(ar paramar)
  {
    if ((!paramar.cm) || (!paramar.a(this))) {
      return false;
    }
    if ((this.a4 == 15) && (paramar.bZ > 0)) {
      return false;
    }
    for (int i = 0; i < this.an.length; i = (byte)(i + 1)) {
      if ((this.an[i][2] != 0) && (this.an[i][3] != 0))
      {
        int j;
        int k;
        if (this.a4 == 14)
        {
          j = (short)(Math.min(paramar.aK, paramar.bA) / 2);
          k = (short)h.jdMethod_if(hF + this.fU, paramar.aP + paramar.aK / 2, hE + this.fT, paramar.aM + paramar.bA / 2);
          if (k <= j) {
            return true;
          }
        }
        else
        {
          j = 0;
          if ((this.a4 == 2) && (this.jdField_char >= 0) && (this.eZ != 3))
          {
            j = this.an[i][0];
          }
          else if ((this.a4 == 2) && (this.jdField_char < 0) && (this.eZ != 3))
          {
            k = (short)a3.bE.dF.jdField_for[2];
            int m = (short)(this.w[0][0] - this.aP);
            j = this.au == 3 ? -this.an[i][0] - this.an[i][2] + k : this.an[i][0];
            j += m;
          }
          else
          {
            j = this.au == 3 ? -this.an[i][0] - this.an[i][2] + this.bh : this.an[i][0];
          }
          if ((h.a(paramar.aP + paramar.bj, paramar.aM + paramar.bi, paramar.bh, paramar.ac, this.aP + j, this.aM + this.an[i][1], this.an[i][2], this.an[i][3])) || ((this != a3.bE.cZ) && (this.h2 == paramar))) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private boolean jdMethod_do(ag paramag)
  {
    if ((this == a3.bE.cZ) && (paramag.as()) && (paramag.fw == a3.bE.cZ) && (paramag.hU)) {
      return false;
    }
    if (!paramag.a(this)) {
      return false;
    }
    for (int i = 0; i < this.an.length; i = (byte)(i + 1)) {
      if ((this.an[i][2] != 0) && (this.an[i][3] != 0))
      {
        int j;
        int k;
        if (this.a4 == 14)
        {
          j = (short)(Math.min(paramag.aK, paramag.bA) / 2);
          k = (short)h.jdMethod_if(hF + this.fU, paramag.aP + paramag.aK / 2, hE + this.fT, paramag.aM + paramag.bA / 2);
          if (k <= j) {
            return true;
          }
        }
        else
        {
          j = 0;
          if ((this.a4 == 2) && (this.jdField_char >= 0) && (this.eZ != 3))
          {
            j = this.an[i][0];
          }
          else if ((this.a4 == 2) && (this.jdField_char < 0) && (this.eZ != 3))
          {
            k = (short)a3.bE.dF.jdField_for[2];
            int m = (short)(this.w[0][0] - this.aP);
            j = this.au == 3 ? -this.an[i][0] - this.an[i][2] + k : this.an[i][0];
            j += m;
          }
          else
          {
            j = this.au == 3 ? -this.an[i][0] - this.an[i][2] + this.bh : this.an[i][0];
          }
          if (h.a(paramag.aP + paramag.bj, paramag.aM + paramag.bi, paramag.bh, paramag.ac, this.aP + j, this.aM + this.an[i][1], this.an[i][2], this.an[i][3])) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public void E()
  {
    this.T = false;
    this.ao = false;
    this.hU = false;
    this.a4 = 0;
    N();
  }
  
  public void S()
  {
    if (!this.hr) {
      return;
    }
    if ((this.a4 == 13) || (this.a4 == 16))
    {
      d();
      return;
    }
    if (this.a4 == 10)
    {
      if ((a3.bE.cJ.ki) || (a3.bE.cJ.e7)) {
        return;
      }
      if (((g.dD == 1) || (g.dD == 0) || (g.dD == 4)) && (g.dZ == 0))
      {
        E();
        return;
      }
      if ((g.dD == 2) && (g.dZ == 0))
      {
        E();
        a3.bE.o();
        return;
      }
      if (!this.gE)
      {
        E();
      }
      else
      {
        a3.bE.cJ.A();
        a3.bE.o();
      }
      return;
    }
    if (this.a4 == 14)
    {
      jdMethod_goto((byte)2);
      this.fT = ((short)(this.fT + 4));
      d();
      return;
    }
    if (this.dZ) {
      return;
    }
    if (this.a4 == 112) {
      return;
    }
    if (this.a4 == 8) {
      return;
    }
    if (a3.bE.fs == 0)
    {
      this.ie = (!this.ie);
      if (this.ie)
      {
        this.em = 0;
        this.dv = true;
        a(true);
      }
      return;
    }
    if (this.hU) {
      return;
    }
    this.fp = 0;
    this.hZ = 0;
    this.dv = true;
    a(true);
  }
  
  public void ah()
  {
    if ((a3.bE.fs == 0) && (this.ie)) {
      return;
    }
    if (!this.hr) {
      return;
    }
    this.dv = false;
    if ((this.a4 == 13) || (this.a4 == 16)) {
      return;
    }
    if (this.a4 == 14) {
      return;
    }
    if (this.hU) {
      return;
    }
    if (this.dZ) {
      return;
    }
    if (jdMethod_else()) {
      return;
    }
    if (this.a4 == 112) {
      ar();
    } else {
      a(false);
    }
  }
  
  public void ae()
  {
    if (!this.hr) {
      return;
    }
    if (this.a4 == 14)
    {
      this.hV = false;
      return;
    }
    if ((this.a4 == 13) || (this.a4 == 16)) {
      return;
    }
    if (this.hU) {
      return;
    }
    if (this.dZ) {
      return;
    }
    if (this.a4 == 112) {
      return;
    }
    if (jdMethod_else()) {
      return;
    }
    d();
  }
  
  private byte ao()
  {
    return jdMethod_int((byte)(e7[this.bo][this.f3] >> 8));
  }
  
  private void jdMethod_byte(byte paramByte)
  {
    switch (paramByte)
    {
    case 3: 
      if ((this.aP - hF <= h.dU / 2 - 20) && (hF > 0)) {
        if (hF + a3.bq[paramByte] * f() > 0)
        {
          this.eO = 3;
          hF = (short)(hF + a3.bq[paramByte] * f());
        }
        else
        {
          hF = 0;
        }
      }
      break;
    case 1: 
      if ((this.aP - hF >= h.dU / 2 - 15) && (hF + h.dU <= a3.bE.ad)) {
        if (hF + f() <= a3.bE.ad - h.dU)
        {
          this.eO = 1;
          hF = (short)(hF + a3.bq[paramByte] * f());
        }
        else
        {
          hF = (short)(a3.bE.ad - h.dU);
        }
      }
      break;
    case 0: 
      if ((this.aM - hE <= h.fp / 2 - 15) && (hE > 0)) {
        if (hE - f() >= 0)
        {
          this.eO = 0;
          hE = (short)(hE + a3.bp[paramByte] * f());
        }
        else
        {
          hE = 0;
        }
      }
      break;
    case 2: 
      if ((this.aM - hE >= h.fp / 2) && (hE + h.fp <= a3.bE.dz)) {
        if (hE + f() <= a3.bE.dz - h.fp)
        {
          this.eO = 2;
          hE = (short)(hE + a3.bp[paramByte] * f());
        }
        else
        {
          hE = (short)(a3.bE.dz - h.fp);
        }
      }
      break;
    }
  }
  
  protected void g()
  {
    if (jdMethod_do((byte)3))
    {
      this.aP = ((short)(this.aP + a3.bq[this.jdField_try] * f()));
      jdMethod_byte((byte)3);
    }
  }
  
  protected void c()
  {
    if (jdMethod_do((byte)1))
    {
      this.aP = ((short)(this.aP + a3.bq[this.jdField_try] * f()));
      jdMethod_byte((byte)1);
    }
  }
  
  protected void jdMethod_new()
  {
    if (jdMethod_do((byte)0))
    {
      this.aM = ((short)(this.aM + a3.bp[this.jdField_try] * f()));
      jdMethod_byte((byte)0);
    }
  }
  
  protected void h()
  {
    if (jdMethod_do((byte)2))
    {
      this.aM = ((short)(this.aM + a3.bp[this.jdField_try] * f()));
      jdMethod_byte((byte)2);
    }
  }
  
  public void B()
  {
    hF = (short)(this.aP - 40);
    if (hF < 0)
    {
      hF = 0;
    }
    else if (hF + h.dU >= a3.bE.ad)
    {
      hF = (short)(a3.bE.ad - h.dU);
      if (hF < 0) {
        hF = 0;
      }
    }
    hE = (short)(this.aM - 60);
    if (hE < 0)
    {
      hE = 0;
    }
    else if (hE + h.fp > a3.bE.dz)
    {
      hE = (short)(a3.bE.dz - h.fp);
      if (hE < 0) {
        hE = 0;
      }
    }
    this.d7 = ((short)(this.aP - 3 * h.u));
    if (this.d7 < 0)
    {
      this.d7 = 0;
    }
    else if (this.d7 + h.eT > a3.bE.ad)
    {
      this.d7 = ((short)(a3.bE.ad - h.eT));
      if (this.d7 < 0) {
        this.d7 = 0;
      }
    }
    this.d6 = ((short)(this.aM - 4 * h.b8));
    if (this.d6 < 0)
    {
      this.d6 = 0;
    }
    else if (this.d6 + h.eS > a3.bE.dz)
    {
      this.d6 = ((short)(a3.bE.dz - h.eS));
      if (this.d6 < 0) {
        this.d6 = 0;
      }
    }
    h.f1 = true;
  }
  
  public void a(short paramShort1, short paramShort2)
  {
    this.e5 = ((short)(paramShort1 - 10 + 1));
    this.e2 = ((short)(paramShort2 - 15 + 1));
  }
  
  public void Z()
  {
    if (jdMethod_else()) {
      return;
    }
    if (a((byte)4) >= jdMethod_void())
    {
      if (a((byte)14) >= h.bm) {
        return;
      }
      jdMethod_if((byte)4, jdMethod_void());
      if (a3.bE.cJ.jdField_do == 0) {
        a3.bE.cJ.jdField_do = 21;
      }
      if (a3.bE.aG.jdMethod_int(1014))
      {
        a3.bE.aG.jdMethod_new(a((byte)14) + 1);
        a3.bE.aG.jdMethod_if();
      }
    }
  }
  
  public void aq()
  {
    N();
    this.eT = false;
    this.fE = false;
    this.hv = false;
    this.T = false;
    this.ao = false;
    this.hU = false;
    this.a4 = 8;
    a3.bE.b0.a(jdMethod_int((byte)20), 0, this.al);
  }
  
  public void jdMethod_char()
  {
    if ((n((byte)7)) && (a3.bE.cJ.jdField_do == 0)) {
      if (this.gp > 0)
      {
        this.gp = ((short)(this.gp - 1));
      }
      else
      {
        this.gp = 0;
        a((byte)7, false);
      }
    }
    if (((this.eT) || (this.fE) || (this.hv)) && (a3.bE.cJ.jdField_do == 0))
    {
      this.hh = a3.jdMethod_new(a3.jdMethod_do(this.hh, a.t) - a.char, a.t);
      if (a3.jdMethod_do(this.hh, a.t) <= 0)
      {
        if (this.eT) {
          this.eT = false;
        }
        if (this.fE) {
          this.fE = false;
        }
        if (this.hv) {
          this.hv = false;
        }
      }
      if ((this.et-- > 0) && (this.d3 != null) && (this.a4 != 2))
      {
        if ((this == a3.bE.cZ) || (a3.bE.cv == 0)) {
          a3.bE.a(this.d3, this.aP - hF, this.aM + this.bA - hE, 0, h.b2[2][0]);
        }
      }
      else {
        this.d3 = null;
      }
    }
    if (this.a4 == 14)
    {
      this.hh = a3.jdMethod_new(a3.jdMethod_do(this.hh, a.t) - a.i, a.t);
      if (a3.jdMethod_do(this.hh, a.t) <= 0) {
        d();
      }
      if (this.hV)
      {
        i = (byte)(6 + 2 * h.a9);
        switch (this.g5)
        {
        case 2: 
          this.fT = ((short)(this.fT + i));
          if (this.fT + fN / 2 > h.fp) {
            this.fT = ((short)(h.fp - fN / 2));
          }
          break;
        case 3: 
          this.fU = ((short)(this.fU - i));
          if (this.fU - fN / 2 < 0) {
            this.fU = ((short)(fN / 2));
          }
          break;
        case 1: 
          this.fU = ((short)(this.fU + i));
          if (this.fU + fN / 2 > h.dU) {
            this.fU = ((short)(h.dU - fN / 2));
          }
          break;
        case 0: 
          this.fT = ((short)(this.fT - i));
          if (this.fT - fN / 2 < 0) {
            this.fT = ((short)(fN / 2));
          }
          break;
        }
      }
    }
    if ((!this.hr) || (this.a4 == 14)) {
      return;
    }
    short s1;
    if ((this == a3.bE.cZ) && (a3.bE.cJ.jdField_do == 0) && (a3.bE.cJ.jdField_int % a.void == 0) && (n((byte)2)) && (this.a4 != 8) && (this.a4 != 10)) {
      if (a((byte)16) <= a((byte)20) / a.n)
      {
        a((byte)2, false);
      }
      else
      {
        i = (short)(a((byte)20) / a.o);
        a3.bE.a((short)-i, this.aP, this.aM, (byte)3);
        jdMethod_for((byte)16, i);
        s1 = -1;
        if ((a((byte)16) < a((byte)20) / 2) && (-1 != (s1 = a3.bE.jdMethod_if((byte)107))))
        {
          a3.bE.cJ.a(s1, true);
          a3.bE.jdMethod_if(s1, true);
          a3.bE.cJ.a(s1, false);
          a3.bE.c((byte)1);
        }
      }
    }
    if ((a3.bE.cJ.ki) && (this == a3.bE.cZ) && (this.ek))
    {
      this.gb = ((short)(this.gb + 1));
      if (this.gb > 50) {
        this.ek = false;
      }
    }
    this.ih = 0;
    switch (this.a4)
    {
    case 11: 
      if (this.al[1] != jdMethod_int((byte)17)) {
        a3.bE.b0.a(jdMethod_int((byte)17), 0, this.al);
      }
      break;
    case 12: 
      if (this.al[1] != jdMethod_int((byte)5)) {
        a3.bE.b0.a(jdMethod_int((byte)5), 0, this.al);
      }
      break;
    case 10: 
      if (this.al[1] != jdMethod_int((byte)23)) {
        a3.bE.b0.a(jdMethod_int((byte)23), 0, this.al);
      }
      break;
    case 9: 
      if (this.al[1] != jdMethod_int((byte)16)) {
        a3.bE.b0.a(jdMethod_int((byte)16), 0, this.al);
      }
      if ((this != a3.bE.cZ) && (this.g8 > 10))
      {
        a(this);
        return;
      }
      break;
    case 15: 
      if (this.al[1] != jdMethod_int((byte)22))
      {
        a3.bE.b0.a(jdMethod_int((byte)22), 0, this.al);
        this.hU = true;
      }
      if ((a3.jdMethod_do(this.hh, a.t) < g2 - a.void) && (a3.bE.cJ.jdField_int % 100 == 0) && (this.eY != null) && (g.dD == 1) && (a3.bE.aG.jdMethod_int(4009)))
      {
        a3.bE.aG.jdMethod_do(this.eY.a((byte)14));
        a3.bE.aG.jdMethod_new(this.eY.a((byte)16));
        a3.bE.aG.jdMethod_new(this.eY.a((byte)20));
        a3.bE.aG.jdMethod_if(this.eY.O);
        a3.bE.aG.jdMethod_if();
      }
      this.hh = a3.jdMethod_new(a3.jdMethod_do(this.hh, a.t) - a.char, a.t);
      if (a3.jdMethod_do(this.hh, a.t) <= 0) {
        d();
      }
      break;
    case 16: 
      if (this.al[1] != jdMethod_int((byte)26)) {
        a3.bE.b0.a(jdMethod_int((byte)26), 0, this.al);
      }
      this.hh = a3.jdMethod_new(a3.jdMethod_do(this.hh, a.t) - a.char, a.t);
      if (a3.jdMethod_do(this.hh, a.t) <= 0)
      {
        d();
      }
      else
      {
        a(a3.bE.b0, this.al);
        if ((this.an != null) && (!a3.bE.cJ.e7) && (g.jS != null)) {
          if (this.hj != null)
          {
            if ((a3.jdMethod_do(this.hh, a.t) < g2 - a.void) && (a3.bE.cJ.jdField_int % 100 == 0) && (a3.bE.aG.jdMethod_int(4014)))
            {
              a3.bE.aG.jdMethod_new(this.hj.t);
              a3.bE.aG.jdMethod_do(this.hj.a((byte)14));
              a3.bE.aG.jdMethod_if();
            }
          }
          else {
            for (i = 0; i < g.jS.length; i = (byte)(i + 1)) {
              if (a(g.jS[i]))
              {
                this.hj = g.jS[i];
                break;
              }
            }
          }
        }
      }
      break;
    case 13: 
      if (this.al[1] != jdMethod_int((byte)24)) {
        a3.bE.b0.a(jdMethod_int((byte)24), 0, this.al);
      }
      if (a3.bE.cJ.jdField_int % 2 == 0) {
        this.hh = a3.jdMethod_new(a3.jdMethod_do(this.hh, a.t) - a.i, a.t);
      }
      if (a3.jdMethod_do(this.hh, a.t) <= 0)
      {
        d();
      }
      else if ((a3.jdMethod_do(this.hh, a.t) < this.gM) && (a3.bE.cJ.jdField_int % 50 == 0) && (a3.bE.aG.jdMethod_int(4008)))
      {
        a3.bE.aG.jdMethod_new(h.jdMethod_if(1, a((byte)14)));
        a3.bE.aG.jdMethod_if();
      }
      break;
    case 14: 
      break;
    case 6: 
      i = 0;
      switch (this.bo)
      {
      case 0: 
        i = jdMethod_int((byte)9);
        break;
      case 1: 
        i = jdMethod_int((byte)10);
        break;
      case 2: 
        i = jdMethod_int((byte)11);
        break;
      case 3: 
        i = jdMethod_int((byte)8);
      }
      if (this.al[1] != i)
      {
        a3.bE.b0.a(i, 0, this.al);
        I();
      }
      break;
    case 4: 
    case 5: 
    case 7: 
      i = 0;
      switch (this.a4)
      {
      case 5: 
        i = jdMethod_int((byte)14);
        break;
      case 4: 
        i = jdMethod_int((byte)15);
        break;
      case 7: 
        i = jdMethod_int((byte)13);
      }
      if (this.al[1] != i) {
        a3.bE.b0.a(i, 0, this.al);
      }
      break;
    case 112: 
      if ((this.bF != 4) && (this == a3.bE.cZ)) {
        jdMethod_byte((byte)(this.c == -1 ? 3 : 1));
      }
      if (((this.bF == 4) && (this.bP == true)) || ((this.bF == 5) && (this.bc == true)))
      {
        if (this.au == 3) {
          a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
        } else {
          a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
        }
        this.bc = false;
        this.bP = false;
      }
      else if ((!this.T) && (this.al[1] != jdMethod_int((byte)19)))
      {
        a3.bE.b0.a(jdMethod_int((byte)19), 0, this.al);
        this.bc = false;
        this.bP = false;
      }
      if ((!this.T) && (this.j))
      {
        this.jdField_new = ((short)(this.jdField_new + 1));
        if (this.au == 3) {
          this.ih = a3.bt[((100 - this.jdField_new) % a3.bt.length)];
        } else {
          this.ih = a3.bt[(this.jdField_new % a3.bt.length)];
        }
      }
      jdMethod_int();
      if (jdMethod_for())
      {
        if (a3.bE.cZ.gV == this) {
          a3.bE.cZ.gV = null;
        }
        if (a3.bE.cZ.ep == this) {
          a3.bE.cZ.ep = null;
        }
        if ((this.aD != a3.bE.cZ) && ((this.aD instanceof ag)))
        {
          ((ag)this.aD).h2 = null;
          ((ag)this.aD).gV = null;
          ((ag)this.aD).ep = null;
          ((ag)this.aD).fw = null;
        }
        if (this == a3.bE.cZ)
        {
          if (a((byte)16) > 0)
          {
            s1 = -1;
            if ((a((byte)16) < a((byte)20) / 2) && (-1 != (s1 = a3.bE.jdMethod_if((byte)107))))
            {
              a3.bE.cJ.a(s1, true);
              a3.bE.jdMethod_if(s1, true);
              a3.bE.cJ.a(s1, false);
              a3.bE.c((byte)1);
            }
            a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
            d();
          }
          else if (-1 != a3.bE.jdMethod_if((byte)101))
          {
            a3.bE.cJ.jdField_int = 0;
            a3.bE.cJ.jdField_do = 39;
          }
          else
          {
            V();
          }
        }
        else if (as())
        {
          if ((this.gf > h.jdMethod_if(2, 4)) && (!R()))
          {
            this.d2 = 2;
            this.ib = 0;
            g((byte)4);
          }
          else
          {
            this.a4 = 0;
            ab();
          }
        }
        else
        {
          a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
          d();
        }
      }
      break;
    case 2: 
      if ((this.hH == 0) || (this.e0))
      {
        if (this.eZ != 3)
        {
          if ((!this.ga) && (this.al[1] != jdMethod_int(this.fB))) {
            a3.bE.b0.a(jdMethod_int(this.fB), 0, this.al);
          }
          if ((this.al[2] == h.cx[this.fm]) && (this.al[0] == 0) && (!this.hk))
          {
            this.hk = true;
            a(this.gG, this.aP + 10 + this.gN[0] * (this.au == 3 ? -1 : 1), this.aM + this.bA + this.gN[1], this.ed, this.h0);
          }
        }
      }
      else if ((!this.e0) && (this.al[1] != jdMethod_int((byte)14)))
      {
        a3.bE.b0.a(jdMethod_int((byte)14), 0, this.al);
        this.jdField_try = this.au;
        this.ao = true;
      }
      if (((this.ft = (byte)(this.ft + 1)) < 16) && ((this == a3.bE.cZ) || (a3.bE.cv == 0))) {
        a3.bE.a(this.gc, this.aP - hF, this.aM + this.bA - hE, 0, h.b2[2][0]);
      }
      break;
    case 1: 
      switch (this.au)
      {
      case 3: 
        if (this.al[1] != jdMethod_int((byte)2)) {
          a3.bE.b0.a(jdMethod_int((byte)2), 0, this.al);
        }
        break;
      case 1: 
        if (this.al[1] != jdMethod_int((byte)2)) {
          a3.bE.b0.a(jdMethod_int((byte)2), 0, this.al);
        }
        break;
      }
      break;
    case 0: 
      this.ao = false;
      if (this.fp > 60)
      {
        if (this.al[1] != jdMethod_int((byte)21)) {
          a3.bE.b0.a(jdMethod_int((byte)21), 0, this.al);
        }
      }
      else
      {
        this.fp = ((byte)(this.fp + 1));
        switch (this.au)
        {
        case 3: 
          if (this.al[1] != jdMethod_int((byte)1)) {
            a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
          }
          break;
        case 1: 
          if (this.al[1] != jdMethod_int((byte)1)) {
            a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
          }
          break;
        }
      }
      break;
    case 8: 
      if (this.al[1] != jdMethod_int((byte)20)) {
        a3.bE.b0.a(jdMethod_int((byte)20), 0, this.al);
      }
      break;
    }
    if ((this.au == 3) && (this.al[1] != jdMethod_int((byte)21))) {
      this.ih = ((byte)(this.ih ^ 0x2));
    }
    if (this == a3.bE.cZ) {
      aa();
    }
    int i = this.aP - hF;
    int j = this.aM - hE;
    int k = this.bo;
    int m = 0;
    if ((short)a3.jdMethod_int(this.H[0], a.C) != -1)
    {
      k = this.bo;
      m = a3.bE.d((short)a3.jdMethod_int(this.H[0], a.C));
    }
    short s2 = (short)a3.jdMethod_int(this.H[0], a.C);
    if ((this == a3.bE.cZ) && (h.v(s2))) {
      s2 = h.J(s2);
    }
    if (a((byte)12) != 0) {
      a3.bE.b0.a(i, j, a3.bE.o, hR, 0, false, 0);
    }
    if (this == a3.bE.cZ) {
      a3.bE.b0.a(hR);
    }
    if ((a3.bE.cJ.e7) || (a3.bE.cJ.ki) || (this == a3.bE.cZ) || (a3.bE.cv != 2))
    {
      Y();
      if ((!this.eT) || (a3.bE.cJ.jdField_do != 0) || (a3.bE.cJ.jdField_int % 5 >= 2))
      {
        a3.bE.b0.a(s2, a3.bE.af, i, j, k, m, this.ih, this.au, this.al, a3.bE.cJ.jdField_int);
        a3.bE.b0.a(i, j, a3.bE.o, this.al, this.ih, this.fa, this.bo);
        if (this.al[1] == jdMethod_int((byte)21)) {
          a3.bE.a(i, j, this.gD, this.bo, s2, (short)a3.jdMethod_int(this.H[a.char], a.C), (short)a3.jdMethod_int(this.H[a.t], a.C), (short)a3.jdMethod_int(this.H[a.i], a.C), (short)a3.jdMethod_int(this.H[a.J], a.C), (short)a3.jdMethod_int(this.H[a.L], a.C), (short)a3.jdMethod_int(this.H[a.e], a.C), a3.bE.cJ.jdField_int);
        }
      }
    }
    if (((a3.bE.cJ.ki) && (this == a3.bE.cZ) && (this.ek)) || ((as()) && (this.fv == 4)))
    {
      int n = (short)(i - 13);
      if (this.au == 3) {
        n = (short)(i + 12);
      }
      a3.bE.b0.a(n, j + this.bA - 15, a3.bE.o, a3.bE.cJ.il, 0, false, 0);
      a3.bE.b0.a(a3.bE.cJ.il);
    }
    i();
    if (this.a4 == 2) {
      if ((this.hH == 0) || (this.e0))
      {
        if (jdMethod_else(this.au))
        {
          this.g1 = null;
          a3.bE.cJ.a(this, true, 0);
          ad();
          d();
        }
      }
      else if (this.al[4] == 0)
      {
        this.e0 = true;
        this.ao = false;
      }
    }
    if (((g.dD != 2) || (g.dZ != 1) || (this.gE) || (this != a3.bE.cZ)) && (this.hU)) {
      jdMethod_goto(this.a4);
    }
    if (this.fF > 0) {
      this.fF = ((byte)(this.fF - 1));
    }
    if (this.hw > 0)
    {
      this.hw = ((byte)(this.hw - 1));
      if (this.hw == 0) {
        ar();
      }
    }
    a3.bE.b0.a(this.al);
    if ((this.dZ) && (a3.bE.cJ.jdField_do != 0)) {
      this.dZ = false;
    }
    if ((this.dZ) && (this.a4 != 15))
    {
      if (this == a3.bE.cZ)
      {
        a3.bE.fj.setColor(4473924);
        a3.bE.fj.fillRect(this.aP - 8 - hF, this.aM - 10 - hE, 24, 6);
        a3.bE.fj.setColor(13619151);
        a3.bE.fj.fillRect(this.aP - 8 + 1 - hF, this.aM - 10 + 1 - hE, 22 * this.g8 / this.gK, 4);
      }
      this.g8 = ((short)(this.g8 + this.du));
      if (this.g8 > this.gK) {
        this.g8 = 0;
      }
    }
    if ((this.a4 == 8) && (a3.bE.b0.jdMethod_if(this.al)))
    {
      String str1;
      if ((!a3.bE.cJ.ki) && (!a3.bE.cJ.e7))
      {
        jdMethod_if((byte)16, 1);
        str1 = "重伤倒地...损失经验";
        //计算要丢失的经验
        //如果把i1的值改为0可能就不会掉经验
        int i1 = h.jdMethod_if(1, a((byte)14));
        jdMethod_for((byte)4, i1);
        if (a3.bE.aG.jdMethod_int(4013))
        {
          a3.bE.aG.jdMethod_for(i1);
          a3.bE.aG.jdMethod_if();
        }
        str1 = str1 + i1;
        int i2 = 0;
        if ((a((byte)0) > 0) && (a((byte)14) > 10))
        {
          i2 = h.jdMethod_if(1, a((byte)14));
          if (i2 > a((byte)0)) {
            i2 = a((byte)0);
          }
          a(i2, true);
          str1 = str1 + ",损失金钱" + i2;
        }
        String str3 = ",原地休息可恢复体力,按确认键起身.";
        if ((g.dD == 2) && (g.dZ == 1)) {
          str3 = ",请等待队友救援,如放弃战斗并退出队伍,请按确认键.";
        }
        a3.bE.cJ.jdMethod_do(str1 + str3);
      }
      else
      {
        str1 = "重伤倒地...";
        String str2 = "";
        if (this.gE) {
          str2 = "请等待队友救援.";
        }
        a3.bE.cJ.jdMethod_do(str1 + str2);
      }
      if (g.dD == 0) {
        this.a4 = 10;
      }
      if (g.dD == 1) {
        this.a4 = 10;
      } else if (g.dD == 2)
      {
        if (g.dZ == 0)
        {
          this.a4 = 10;
          a3.bE.cJ.jdField_int = 0;
          a3.bE.cJ.jdField_do = 19;
        }
        else if (g.dZ == 1)
        {
          jdMethod_if((byte)16, 0);
          this.a4 = 10;
        }
      }
      else if ((g.dD == 4) || (g.dD == 3)) {
        this.a4 = 10;
      }
    }
    if (this.al[4] == 0) {
      switch (this.a4)
      {
      case 16: 
        if (this.hj == null) {
          d();
        }
        break;
      case 11: 
      case 12: 
        this.T = false;
        this.ao = false;
        this.hU = false;
        this.a4 = 0;
        break;
      case 2: 
        if (this.eZ == 3)
        {
          if ((this.gh) && (this.id < this.gd - 1))
          {
            this.id = ((byte)(this.id + 1));
            a3.bE.b0.a(0, 0, this.al);
            a3.bE.b0.a(jdMethod_int(this.fH[this.id]), 0, this.al);
          }
          else
          {
            d();
          }
        }
        else if ((!this.ga) && (this.al[1] == jdMethod_int(this.fB)) && (this.al[4] == 0))
        {
          this.ga = true;
          a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
        }
        break;
      case 3: 
        this.fF = 4;
        if (this != a3.bE.cZ)
        {
          this.f3 = ((byte)(this.f3 + 1));
          if (this.f3 < e7[this.bo].length) {
            x();
          } else {
            d();
          }
        }
        else
        {
          this.fF = 4;
          this.f3 = ((byte)((this.f3 + 1) % e7[this.bo].length));
          if (this.dv)
          {
            x();
            if (this.ie)
            {
              this.em = ((byte)(this.em + 1));
              if (this.em >= a.byte) {
                d();
              }
            }
          }
          else
          {
            d();
          }
        }
        break;
      case 5: 
        if ((a3.bE.cJ.jdField_if == 2) && (this.a4 == 5) && (a3.bE.cJ.je == 2))
        {
          g tmp5315_5312 = a3.bE.cJ;
          tmp5315_5312.kc = ((byte)(tmp5315_5312.kc + 1));
          if (a3.bE.cJ.kc >= 3)
          {
            a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
            a3.bE.S.a(4, a3.bE.cJ);
          }
        }
        this.T = false;
        this.ao = false;
        this.hU = false;
        this.a4 = 0;
        break;
      case 4: 
      case 6: 
      case 7: 
        d();
      }
    }
  }
  
  public void Y()
  {
    if (this == a3.bE.cZ) {
      af();
    }
    if (this.gR != null)
    {
      if (this.gR.a((byte)40) > 0)
      {
        int i = a3.bE.jdMethod_if(this.gR);
        a3.bE.c0.a(this.gR.aP - hF + (this.gR.au == 3 ? 20 : 0), this.gR.aM - hE, a3.bE.a2, a3.bE.dS[i], this.gR.au == 3 ? 2 : 0);
      }
    }
    else if (this.eN >= 0)
    {
      if ((a3.bE.cJ.jdField_do != 0) || (this.a4 == 112)) {
        return;
      }
      a3.bE.a(this.aP, this.aM, this.au, this.eN);
    }
  }
  
  public void au()
  {
    jdMethod_if((byte)16, 1);
    N();
    a3.bE.b0.a(jdMethod_int((byte)1), 0, this.al);
    d();
  }
  
  public void V()
  {
    aq();
    if ((this.aD != null) && ((this.aD instanceof ag))) {
      if (a3.bE.cJ.e7)
      {
        if (a3.bE.aG.jdMethod_int(4109))
        {
          a3.bE.aG.jdMethod_if(this.O);
          a3.bE.aG.jdMethod_if();
        }
      }
      else if (a3.bE.aG.jdMethod_int(4506))
      {
        a3.bE.aG.jdMethod_new(a3.bE.cJ.jdField_if);
        a3.bE.aG.jdMethod_if(this.aD.O);
        a3.bE.aG.jdMethod_if(this.O);
        if ((a3.bE.cJ.bD != null) && (a3.bE.cJ.bD.O.equals(this.aD.O))) {
          a3.bE.aG.jdMethod_do(0);
        } else {
          a3.bE.aG.jdMethod_do(1);
        }
        a3.bE.aG.jdMethod_if();
      }
    }
  }
  
  public void a(h paramh)
  {
    if ((!this.hr) || (this.a4 == 14)) {
      return;
    }
    if ((!a3.bE.cJ.e7) && (!a3.bE.cJ.ki) && (this != a3.bE.cZ) && (a3.bE.cv == 2))
    {
      if (this.gQ)
      {
        i = this.aP + 10 - 2 * h.eA - hF;
        a3.bE.a(i, this.aM - 20 - hE, 12, 12, 156, 0, a3.bE.aH[10], 0);
        i -= 12;
      }
      return;
    }
    int i = 0;
    if ((paramh.dT != 1) && (100 >= h.jdMethod_if(a3.bE.cZ.aP, this.aP, a3.bE.cZ.aM, this.aM))) {
      i = 1;
    }
    int j = this.aP + 10 - h.dA.stringWidth(this.O) / 2 - 12 - hF;
    if ((i != 0) || (this == a3.bE.cZ))
    {
      if (this.O != null)
      {
        int k = 0;
        if ((this.gR != null) && (paramh.bY))
        {
          paramh.a(this.gR.O, this.gR.aP + 10 - hF, this.gR.aM - 25 - hE, 17, h.gh);
        }
        else if ((this.eB != null) && (paramh.bY))
        {
          int m = 20;
          n = this.aP;
          int i2 = this.aM;
          if (this.au == 1) {
            n = (short)(n - (m + 10));
          } else {
            n = (short)(n + (20 + m));
          }
          paramh.a(this.eB, n + m / 2 - hF, i2 - 25 - hE, 17, h.gh);
        }
        if (a3.bE.jdMethod_for(this.O))
        {
          if (a3.bE.cJ.jdField_int / 5 % 3 == 0) {
            k = 0;
          } else if (a3.bE.cJ.jdField_int / 5 % 3 == 1) {
            k = 4;
          } else {
            k = 3;
          }
        }
        else
        {
          if (this.fL != -1)
          {
            if ((this != a3.bE.cZ) && (a3.bE.cZ.fL != this.fL)) {
              k = 5;
            } else {
              k = 1;
            }
          }
          else if (this == a3.bE.cZ) {
            k = 7;
          }
          if (this.he) {
            k = 4;
          } else if ((this != a3.bE.cZ) && (a3.bE.cJ.jdMethod_if(this.O))) {
            k = 6;
          }
        }
        if ((a3.bE.cJ.jdField_int / 10 % 2 == 0) && (ak() != null)) {
          paramh.a("根据箭头指示移动", this.aP + 10 - hF, this.aM - 25 - 20 - hE, 17, h.b2[k][0]);
        }
        paramh.a(this.O, this.aP + 10 - hF, this.aM - 25 - hE, 17, h.b2[k][0]);
        if ((paramh.cr) && (this.fL >= 0))
        {
          paramh.a(this.es, this.aP + 10 - hF, this.aM - 25 - hE - h.eA - 1, 17, m.a[this.fx]);
          paramh.jdMethod_do(this.fL, this.aP + 10 - hF - h.dA.stringWidth(this.es) / 2 - 17, this.aM - 25 - hE - h.eA - 1);
        }
        String str = "";
        if ((this != a3.bE.cZ) && (this.hv)) {
          str = str + "无畏|";
        }
        int i1;
        for (int n = 0; n < ez.length; i1 = (byte)(n + 1)) {
          if (n(n)) {
            str = str + ez[n] + "|";
          }
        }
        if (str.length() > 0)
        {
          str = str.substring(0, str.length() - 1);
          paramh.a(str, this.aP + 10 - hF, this.aM - 25 - h.eA * (this.fL >= 0 ? 2 : 1) - 1 - hE, 17, h.b2[k][0]);
        }
        if ((T()) || (as()) || ((a3.bE.cJ.e7) && (this != a3.bE.cZ))) {
          a3.bE.a(this.aP - hF, this.aM - hE - 8, 24, 3, h.b2[4][0], a((byte)20), a((byte)16));
        }
        if (a3.bE.cJ.ki) {
          paramh.a("" + this.eb, this.aP + 10 - hF, this.aM - 45 - h.eA - 1 - hE, 17, h.b2[4][0]);
        }
      }
      if ((h.ek) && (this.g4))
      {
        j -= 12;
        a3.bE.a(j, this.aM - 20 - hE, 24, 12, 288, 0, a3.bE.aH[10], 0);
        j -= 12;
      }
      if (this.fi)
      {
        a3.bE.a(j, this.aM - 20 - hE, 12, 12, 228, 0, a3.bE.aH[10], 0);
        j -= 12;
      }
      if (this.dU)
      {
        a3.bE.a(j, this.aM - 20 - hE, 12, 12, 132, 0, a3.bE.aH[10], 0);
        j -= 12;
      }
      if ((this.fL != -1) && (this.fj >= 0))
      {
        a3.bE.a(j, this.aM - 20 - hE, this.fj);
        j -= 12;
      }
      if (this.gk)
      {
        a3.bE.a(j, this.aM - 20 - hE, 12, 12, 180, 0, a3.bE.aH[10], 0);
        j -= 12;
      }
    }
    if (this.gQ)
    {
      a3.bE.a(j, this.aM - 20 - hE, 12, 12, 156, 0, a3.bE.aH[10], 0);
      j -= 12;
    }
  }
  
  public void jdMethod_do(short paramShort1, short paramShort2)
  {
    this.aP = paramShort1;
    this.aM = paramShort2;
    B();
  }
  
  public void jdMethod_if(byte paramByte1, short paramShort, byte paramByte2)
  {
    if ((paramByte1 < 0) || (paramByte1 > f7 - 1)) {
      return;
    }
    if ((paramByte2 != 0) && (paramByte2 != 1))
    {
      paramShort = -1;
      paramByte2 = -1;
    }
    else if ((paramByte2 == 0) && (paramShort > h.e5 - 1))
    {
      paramShort = -1;
      paramByte2 = -1;
    }
    else if (paramByte2 == 1)
    {
      try
      {
        a3.bE.jdMethod_try(paramShort);
      }
      catch (Exception localException)
      {
        paramShort = -1;
        paramByte2 = -1;
      }
    }
    e(a(paramShort, paramByte2));
    this.dF[paramByte1][0] = paramShort;
    this.dF[paramByte1][1] = ((short)paramByte2);
    U();
  }
  
  public byte a(short paramShort, byte paramByte)
  {
    if (paramShort < 0) {
      return -1;
    }
    for (byte b = 0; b < f7; b = (byte)(b + 1)) {
      if ((this.dF[b][0] == paramShort) && (this.dF[b][1] == paramByte)) {
        return b;
      }
    }
    return -1;
  }
  
  public void e(byte paramByte)
  {
    if (paramByte < 0) {
      return;
    }
    this.dF[paramByte][0] = -1;
    this.dF[paramByte][1] = -1;
    U();
  }
  
  public void jdMethod_if(int paramInt, boolean paramBoolean)
  {
    if ((jdMethod_else()) || (this.a4 == 13) || (this.a4 == 14)) {
      return;
    }
    int i = -1;
    switch (paramInt)
    {
    case 49: 
      if (a3.bE.cJ.jdField_if <= 2)
      {
        an();
        a(a.char, gu[this.bo][0], paramInt, this);
        return;
      }
      i = 0;
      break;
    case 51: 
      if (a3.bE.cJ.jdField_if <= 2)
      {
        an();
        a(a.char, gu[this.bo][1], paramInt, this);
        return;
      }
      i = 1;
      break;
    case 55: 
      i = 2;
      break;
    case 57: 
      i = 3;
    }
    if ((i < 0) || (i >= f7) || (this.dF[i][0] < 0)) {
      return;
    }
    if (this.dF[i][1] == 0)
    {
      if (a((byte)24) <= 0) {
        return;
      }
      if ((!l((byte)this.dF[i][0])) && (a((byte)14) <= a.n * h.s((byte)this.dF[i][0])))
      {
        a3.bE.cJ.jdMethod_do(this.hQ);
        return;
      }
      if (a3.bE.aG.jdMethod_int(5120))
      {
        a3.bE.aG.jdMethod_for(a3.jdMethod_new(this.dF[i][0], 2));
        a3.bE.aG.jdMethod_for(a3.jdMethod_new(a((byte)24), 2));
        a3.bE.aG.jdMethod_for(this.hh);
        a3.bE.aG.jdMethod_if();
      }
      an();
      a(a.char, (byte)this.dF[i][0], paramInt, this);
    }
    else if (this.dF[i][1] == 1)
    {
      short s = this.dF[i][0];
      if ((this.dZ) || (this.hU) || (s < 0) || (jdMethod_if(s) <= a.ac)) {
        return;
      }
      a3.bE.cJ.a(s, true);
      a3.bE.jdMethod_for(s);
      a3.bE.cJ.a(s, false);
    }
  }
  
  public boolean o(byte paramByte)
  {
    if ((this.bo == 0) && ((paramByte == 0) || (paramByte == eV))) {
      return true;
    }
    if ((this.bo == 1) && ((paramByte == 1) || (paramByte == d8))) {
      return true;
    }
    if ((this.bo == 2) && ((paramByte == 3) || (paramByte == hI))) {
      return true;
    }
    return (this.bo == 3) && ((paramByte == 2) || (paramByte == dV));
  }
  
  public static boolean jdMethod_null(byte paramByte)
  {
    return (paramByte == hI) || (paramByte == eV) || (paramByte == d8) || (paramByte == dV);
  }
  
  public static boolean l(byte paramByte)
  {
    return (paramByte >= a.H) && (paramByte <= a.u);
  }
  
  public byte P()
  {
    if ((this.h6[eV] == 0) && (!o(eV))) {
      return eV;
    }
    if ((this.h6[hI] == 0) && (!o(hI))) {
      return hI;
    }
    if ((this.h6[d8] == 0) && (!o(d8))) {
      return d8;
    }
    if ((this.h6[dV] == 0) && (!o(dV))) {
      return dV;
    }
    return -1;
  }
  
  public void c(byte paramByte)
  {
    this.h6[paramByte] = 0;
    jdMethod_for((byte)8, (int)h.j(paramByte));
    jdMethod_if((byte)0, paramByte);
  }
  
  public boolean j(byte paramByte)
  {
    if ((paramByte < 0) || (paramByte >= this.h6.length)) {
      return false;
    }
    return this.h6[paramByte] == 0;
  }
  
  public void jdMethod_try(byte paramByte)
  {
    this.h6[paramByte] = -1;
    e(a((short)paramByte, (byte)0));
    jdMethod_if((byte)1, paramByte);
  }
  
  public byte[] jdMethod_if(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = new byte[h.e5];
    int i = 0;
    int k;
    for (int j = 0; j < arrayOfByte1.length; k = (byte)(j + 1)) {
      if ((j(j)) && ((paramArrayOfByte == null) || (!a(j, paramArrayOfByte))))
      {
        arrayOfByte1[i] = j;
        i = (byte)(i + 1);
      }
    }
    byte[] arrayOfByte2 = new byte[i];
    if (i > 0) {
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
    }
    arrayOfByte1 = null;
    return arrayOfByte2;
  }
  
  public boolean a(byte paramByte, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return false;
    }
    for (int i = 0; i < paramArrayOfByte.length; i = (byte)(i + 1)) {
      if (paramByte == paramArrayOfByte[i]) {
        return true;
      }
    }
    return false;
  }
  
  public boolean k(byte paramByte)
  {
    return (a((byte)28) >= h.t(paramByte)) && (a((byte)30) >= h.a(paramByte)) && (a((byte)32) >= h.r(paramByte)) && (a((byte)34) >= h.w(paramByte));
  }
  
  public byte[] z()
  {
    byte[] arrayOfByte1 = new byte[h.e5];
    int i = 0;
    int k;
    for (int j = 0; j < arrayOfByte1.length; k = (byte)(j + 1)) {
      if ((!l(j)) && (!j(j)) && (j > a.e) && ((this.bo == h.y(j)) || (h.y(j) == -1)) && (h.s(j) == (a((byte)14) - 1) / 10))
      {
        arrayOfByte1[i] = j;
        i = (byte)(i + 1);
      }
    }
    byte[] arrayOfByte2 = new byte[i + 1];
    if (i > 0) {
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
    }
    arrayOfByte1 = null;
    return arrayOfByte2;
  }
  
  public boolean b(byte paramByte)
  {
    return this.gJ[paramByte] >= eK;
  }
  
  public short jdMethod_if(short paramShort)
  {
    if (paramShort < 0) {
      return 0;
    }
    for (int i = 0; i < 2; i = (byte)(i + 1)) {
      for (int j = 0; j < this.gJ[i]; j = (byte)(j + 1)) {
        if (this.gw[i][j] == paramShort) {
          return (short)a3.jdMethod_do(this.eX[i][j], 2);
        }
      }
    }
    return 0;
  }
  
  public byte a(byte paramByte, short paramShort)
  {
    for (byte b = 0; b < this.gJ[paramByte]; b = (byte)(b + 1)) {
      if (this.gw[paramByte][b] == paramShort) {
        return b;
      }
    }
    return -1;
  }
  
  public byte J()
  {
    byte b = 0;
    for (int i = 0; i < this.a7.length; i = (byte)(i + 1)) {
      if (h.v(this.a7[i])) {
        b = (byte)(b + 1);
      }
    }
    for (i = 0; i < 2; i = (byte)(i + 1)) {
      for (int j = 0; j < this.gJ[i]; j = (byte)(j + 1)) {
        if (h.v(this.gw[i][j])) {
          b = (byte)(b + 1);
        }
      }
    }
    return b;
  }
  
  public boolean jdMethod_for(short paramShort)
  {
    for (int i = 0; i < this.gJ[0]; i = (byte)(i + 1)) {
      if (this.gw[0][i] == paramShort) {
        return true;
      }
    }
    for (i = 0; i < this.H.length; i = (byte)(i + 1)) {
      if (a3.jdMethod_int(this.H[i], a.C) == paramShort) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(byte paramByte, short paramShort, int paramInt)
  {
    if ((paramShort < 0) || (paramInt > dH)) {
      return false;
    }
    int i = jdMethod_if(paramShort);
    if (i > 0) {
      return i + paramInt <= dH;
    }
    return !b(paramByte);
  }
  
  public byte d(byte paramByte)
  {
    return (byte)(eK - this.gJ[paramByte]);
  }
  
  public boolean jdMethod_if(byte paramByte, short paramShort, int paramInt)
  {
    if ((paramShort < 0) || (paramInt <= 0) || (paramInt > dH)) {
      return false;
    }
    if (jdMethod_if(paramShort) > 0)
    {
      if (jdMethod_if(paramShort) + paramInt > dH) {
        return false;
      }
      int i = (short)a3.jdMethod_do(this.eX[paramByte][a(paramByte, paramShort)], 2);
      i = (short)(i + paramInt);
      this.eX[paramByte][a(paramByte, paramShort)] = ((short)a3.jdMethod_new(i, 2));
      return true;
    }
    if (!b(paramByte))
    {
      this.gw[paramByte][this.gJ[paramByte]] = paramShort;
      this.eX[paramByte][this.gJ[paramByte]] = ((short)a3.jdMethod_new(paramInt, 2));
      byte tmp135_134 = paramByte;
      byte[] tmp135_131 = this.gJ;
      tmp135_131[tmp135_134] = ((byte)(tmp135_131[tmp135_134] + 1));
      y();
      return true;
    }
    return false;
  }
  
  public boolean a(byte paramByte, short paramShort, int paramInt, boolean paramBoolean)
  {
    if ((paramShort < 0) || (paramInt < 0)) {
      return false;
    }
    if (jdMethod_if(paramShort) > 0)
    {
      int i = a(paramByte, paramShort);
      int j = (short)a3.jdMethod_do(this.eX[paramByte][i], 2);
      j = (short)(j - paramInt);
      this.eX[paramByte][i] = ((short)a3.jdMethod_new(j, 2));
      if (a3.jdMethod_do(this.eX[paramByte][i], 2) <= 0)
      {
        e(a(this.gw[paramByte][i], (byte)1));
        this.gw[paramByte][i] = this.gw[paramByte][(this.gJ[paramByte] - 1)];
        this.eX[paramByte][i] = this.eX[paramByte][(this.gJ[paramByte] - 1)];
        this.gw[paramByte][(this.gJ[paramByte] - 1)] = -1;
        this.eX[paramByte][(this.gJ[paramByte] - 1)] = ((short)a3.jdMethod_new(-1, 2));
        byte tmp189_188 = paramByte;
        byte[] tmp189_185 = this.gJ;
        tmp189_185[tmp189_188] = ((byte)(tmp189_185[tmp189_188] - 1));
        y();
        if ((h.v(paramShort)) && (paramBoolean)) {
          h.jdMethod_long(paramShort);
        }
      }
      if (paramBoolean) {
        a(paramByte, paramShort, (byte)paramInt);
      }
      return true;
    }
    return false;
  }
  
  public void y()
  {
    for (int i = 0; i < 2; i = (byte)(i + 1)) {
      for (int j = 0; j < this.gJ[i] - 1; j = (byte)(j + 1)) {
        for (int k = (byte)(j + 1); k < this.gJ[i]; k = (byte)(k + 1)) {
          if (this.gw[i][j] > this.gw[i][k])
          {
            int m = this.gw[i][j];
            int n = this.eX[i][j];
            this.gw[i][j] = this.gw[i][k];
            this.eX[i][j] = this.eX[i][k];
            this.gw[i][k] = m;
            this.eX[i][k] = n;
          }
        }
      }
    }
  }
  
  public byte a(short paramShort)
  {
    if ((paramShort < 0) || (h.jdMethod_do(paramShort) < 0) || (h.jdMethod_do(paramShort) > 4)) {
      return -4;
    }
    if ((h.G(paramShort) == 0) && (h.N(paramShort) != this.bo)) {
      return -2;
    }
    if (this.fc[h.G(paramShort)] != 0) {
      return -5;
    }
    if (a((byte)14) < (h.z(paramShort) + 1) * a.J) {
      return -3;
    }
    byte b = h.G(paramShort);
    if (this.a7[b] != -1)
    {
      if (h.j(this.a7[b]) >= 3) {
        return -6;
      }
      if (this.a7[b] != paramShort)
      {
        a((byte)0, paramShort, 1, false);
        if (h(b))
        {
          jdMethod_if(paramShort, b);
          this.a7[b] = paramShort;
          this.H[b] = a3.a(paramShort, a.C);
          return 0;
        }
        jdMethod_if((byte)0, paramShort, 1);
        return -1;
      }
      return 0;
    }
    jdMethod_if(paramShort, b);
    a((byte)0, paramShort, 1, false);
    this.a7[b] = paramShort;
    this.H[b] = a3.a(paramShort, a.C);
    return 0;
  }
  
  public boolean jdMethod_int(short paramShort)
  {
    if (paramShort < 0) {
      return false;
    }
    for (int i = 0; i < this.H.length; i = (byte)(i + 1)) {
      if (a3.jdMethod_int(this.H[i], a.C) == paramShort) {
        return true;
      }
    }
    return false;
  }
  
  public boolean h(byte paramByte)
  {
    if (paramByte < 0) {
      return false;
    }
    short s = (short)a3.jdMethod_int(this.H[paramByte], a.C);
    if ((s != -1) && (jdMethod_if(s) < dH))
    {
      if (jdMethod_if((byte)0, s, 1))
      {
        this.a7[paramByte] = -1;
        this.H[paramByte] = a3.a(-1, a.C);
        p(paramByte);
        return true;
      }
      return false;
    }
    return false;
  }
  
  public void jdMethod_do(short paramShort)
  {
    for (int i = 1; i < this.H.length; i++) {
      if (a3.jdMethod_int(this.H[i], a.C) == paramShort)
      {
        this.a7[i] = -1;
        this.H[i] = a3.a(-1, a.C);
      }
    }
  }
  
  public void at()
  {
    jdMethod_if((byte)0, a.ac);
    jdMethod_if((byte)4, a.ac);
    jdMethod_if((byte)8, a.ac);
    jdMethod_if((byte)12, a.ac);
    jdMethod_if((byte)14, a.char);
    jdMethod_if((byte)36, a.ac);
    jdMethod_if((byte)38, a.ac);
    jdMethod_if((byte)40, a.ac);
    jdMethod_if((byte)42, a.ac);
    jdMethod_if((byte)44, a.ac);
    jdMethod_if((byte)46, a.ac);
    jdMethod_if((byte)48, a.ac);
    switch (this.bo)
    {
    case 0: 
      jdMethod_if((byte)16, a.b);
      jdMethod_if((byte)20, a.b);
      jdMethod_if((byte)24, a.Q);
      jdMethod_if((byte)26, a.Q);
      jdMethod_if((byte)28, a.z);
      jdMethod_if((byte)30, a.d);
      jdMethod_if((byte)32, a.af);
      jdMethod_if((byte)34, a.try);
      break;
    case 1: 
      jdMethod_if((byte)16, a.ab);
      jdMethod_if((byte)20, a.ab);
      jdMethod_if((byte)24, a.case);
      jdMethod_if((byte)26, a.case);
      jdMethod_if((byte)28, a.af);
      jdMethod_if((byte)30, a.af);
      jdMethod_if((byte)32, a.I);
      jdMethod_if((byte)34, a.F);
      break;
    case 2: 
      jdMethod_if((byte)16, a.s);
      jdMethod_if((byte)20, a.s);
      jdMethod_if((byte)24, a.void);
      jdMethod_if((byte)26, a.void);
      jdMethod_if((byte)28, a.void);
      jdMethod_if((byte)30, a.p);
      jdMethod_if((byte)32, a.void);
      jdMethod_if((byte)34, a.void);
      break;
    case 3: 
      jdMethod_if((byte)16, a.P);
      jdMethod_if((byte)20, a.P);
      jdMethod_if((byte)24, a.a);
      jdMethod_if((byte)26, a.a);
      jdMethod_if((byte)28, a.o);
      jdMethod_if((byte)30, a.a);
      jdMethod_if((byte)32, a.k);
      jdMethod_if((byte)34, a.p);
    }
    this.a7 = new short[a.ad];
    this.H = new int[a.ad];
    for (int i = 0; i < a.ad; i = (byte)(i + 1))
    {
      this.a7[i] = ((short)-a.char);
      this.H[i] = a3.a(-a.char, a.C);
    }
    this.gJ = new byte[2];
    this.gw = new short[2][eK];
    this.eX = new short[2][eK];
    int k;
    for (i = 0; i < eK; i = (byte)(i + 1)) {
      for (k = 0; k < a.t; k = (byte)(k + 1))
      {
        this.gw[k][i] = ((short)(byte)-a.char);
        this.eX[k][i] = ((short)a3.jdMethod_new(-a.char, a.t));
      }
    }
    this.h6 = new byte[h.e5];
    for (i = 0; i < h.e5; i = (byte)(i + 1)) {
      this.h6[i] = -1;
    }
    this.dF = new short[f7][2];
    int j;
    for (i = 0; i < f7; j = (byte)(i + 1))
    {
      k = -1;
      byte b = -1;
      jdMethod_if(i, k, b);
    }
    this.gE = false;
    this.fL = -1;
    this.fj = -1;
    this.dU = false;
    this.es = "";
    h.e8 = (byte)a.ac;
    this.fc = null;
    this.fc = new boolean[8];
    if (a3.bE.S != null) {
      a3.bE.S.ad = false;
    }
    a3.bE.cJ.kP.removeAllElements();
    a3.bE.G();
  }
  
  public boolean az()
  {
    f((byte)a.ac);
    return (this.fm == ey) || (this.fm == hI) || (this.fm == dt) || (this.fm == hX) || (this.fm == ig) || (this.fm == dV) || (l(this.fm));
  }
  
  public boolean aw()
  {
    f((byte)a.i);
    return (!this.fM) && (this.dJ == a.char);
  }
  
  public boolean ax()
  {
    f((byte)a.C);
    return (this.fm == d8) || (this.fm == eV) || (this.fm == dV) || (this.fm == ey) || (this.fm == dt) || (this.fm == hX) || (this.fm == ig) || (this.fm == hI);
  }
  
  public void al()
  {
    if (a3.bE.aG.jdMethod_int(4401))
    {
      for (int i = 0; i < this.jdField_case.length; i = (byte)(i + 1)) {
        a3.bE.aG.jdMethod_do(this.jdField_case[i]);
      }
      a3.bE.aG.jdMethod_if();
    }
  }
  
  public void a(byte paramByte1, short paramShort, byte paramByte2)
  {
    if (a3.bE.aG.jdMethod_int(4402))
    {
      a3.bE.aG.jdMethod_do(paramByte1);
      a3.bE.aG.jdMethod_new(paramShort);
      a3.bE.aG.jdMethod_new(a3.jdMethod_new(paramByte2, 2));
      a3.bE.aG.jdMethod_if();
    }
  }
  
  public void jdMethod_if(short paramShort, byte paramByte)
  {
    if (a3.bE.aG.jdMethod_int(4403))
    {
      a3.bE.aG.jdMethod_do(paramByte);
      a3.bE.aG.jdMethod_new(paramShort);
      a3.bE.aG.jdMethod_if();
    }
  }
  
  public void U()
  {
    if (a3.bE.aG.jdMethod_int(4404))
    {
      for (int i = 0; i < this.dF.length; i = (byte)(i + 1))
      {
        a3.bE.aG.jdMethod_new(this.dF[i][0]);
        a3.bE.aG.jdMethod_do((byte)this.dF[i][1]);
      }
      a3.bE.aG.jdMethod_if();
    }
  }
  
  public void p(byte paramByte)
  {
    if (a3.bE.aG.jdMethod_int(4406))
    {
      a3.bE.aG.jdMethod_do(paramByte);
      a3.bE.aG.jdMethod_if();
    }
  }
  
  public void jdMethod_if(byte paramByte1, byte paramByte2)
  {
    if (a3.bE.aG.jdMethod_int(4407))
    {
      a3.bE.aG.jdMethod_do(paramByte1);
      a3.bE.aG.jdMethod_do(paramByte2);
      for (int i = 0; i < h.e5; i = (byte)(i + 1)) {
        a3.bE.aG.jdMethod_do(this.h6[i]);
      }
      a3.bE.aG.jdMethod_if();
    }
  }
  
  public void jdMethod_try(int paramInt1, int paramInt2)
  {
    if (a3.bE.aG.jdMethod_int(4405))
    {
      a3.bE.aG.jdMethod_do(paramInt1);
      a3.bE.aG.jdMethod_for(paramInt2);
      a3.bE.aG.jdMethod_if();
    }
  }
  
  public void jdMethod_do(int paramInt, boolean paramBoolean)
  {
    jdMethod_do((byte)0, paramInt);
    if (paramBoolean) {
      jdMethod_try(0, paramInt);
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    jdMethod_for((byte)0, paramInt);
    if (a((byte)0) < 0) {
      jdMethod_if((byte)0, 0);
    }
    if (paramBoolean) {
      jdMethod_try(1, paramInt);
    }
  }
  
  public boolean jdMethod_else()
  {
    return (this.a4 == 8) || (this.a4 == 10);
  }
  
  public void jdMethod_do(int paramInt)
  {
    this.fn = a3.jdMethod_new(paramInt, 4);
  }
  
  public int am()
  {
    return a3.jdMethod_do(this.fn, 4);
  }
  
  public void a(DataInputStream paramDataInputStream)
  {
    try
    {
      this.gw = ((short[][])null);
      this.eX = ((short[][])null);
      this.gJ = new byte[2];
      this.gw = new short[2][eK];
      this.eX = new short[2][eK];
      for (int i = 0; i < 2; i = (byte)(i + 1))
      {
        short[] arrayOfShort = new short[eK];
        byte[] arrayOfByte = new byte[eK];
        for (int j = 0; j < eK; j = (byte)(j + 1))
        {
          arrayOfShort[j] = paramDataInputStream.readShort();
          arrayOfByte[j] = paramDataInputStream.readByte();
        }
        for (j = 0; j < eK; j = (byte)(j + 1)) {
          if ((arrayOfShort[j] < 0) || (arrayOfByte[j] <= 0))
          {
            int k = -1;
            for (int m = (byte)(eK - 1); m > j; m = (byte)(m - 1)) {
              if ((arrayOfShort[m] >= 0) && (arrayOfByte[m] > 0))
              {
                k = m;
                break;
              }
            }
            if (k < 0) {
              break;
            }
            arrayOfShort[j] = arrayOfShort[k];
            arrayOfByte[j] = arrayOfByte[k];
            arrayOfShort[k] = -1;
            arrayOfByte[k] = 0;
          }
        }
        for (j = 0; j < eK; j = (byte)(j + 1))
        {
          this.gw[i][j] = arrayOfShort[j];
          this.eX[i][j] = ((short)a3.jdMethod_new(arrayOfByte[j], 2));
          if ((this.gw[i][j] >= 0) && (a3.jdMethod_do(this.eX[i][j], 2) > 0))
          {
            int tmp301_300 = i;
            byte[] tmp301_297 = this.gJ;
            tmp301_297[tmp301_300] = ((byte)(tmp301_297[tmp301_300] + 1));
          }
        }
      }
      y();
    }
    catch (Exception localException)
    {
      h.a(localException);
    }
  }
  
  public static boolean jdMethod_do(byte paramByte1, byte paramByte2)
  {
    switch (paramByte1)
    {
    case 17: 
      if ((paramByte2 == 1) || (paramByte2 == 0) || (paramByte2 == 5)) {
        return true;
      }
    case 16: 
      if (paramByte2 == 2) {
        return true;
      }
    case 15: 
      if ((paramByte2 == 3) || (paramByte2 == 4) || (paramByte2 == 6)) {
        return true;
      }
      break;
    }
    return false;
  }
  
  public static int jdMethod_case(byte paramByte)
  {
    switch (paramByte)
    {
    case 16: 
      return 7;
    case 14: 
      return 5;
    case 13: 
      return 3;
    case 15: 
      return 1;
    }
    return 12;
  }
  
  public static String jdMethod_try(byte paramByte, int paramInt)
  {
    if (paramByte < 0)
    {
      String[] arrayOfString = { "成 员", "列 兵", "一等兵", "二等兵", "三等兵", "四等兵", "五等兵", "六等兵", "七等兵", "八等兵", "九等兵", "上等兵", "特等兵" };
      paramInt = Math.max(0, paramInt);
      paramInt = Math.min(arrayOfString.length - 1, paramInt);
      return arrayOfString[paramInt];
    }
    switch (paramByte)
    {
    case 17: 
      return "公会长";
    case 16: 
      return "指挥官";
    case 15: 
      return "执行官";
    case 14: 
      return "军团长";
    case 13: 
      return "卫队长";
    }
    return "";
  }
  
  public void a(a3 parama31, a3 parama32)
  {
    int i = (byte)a.C;
    switch (a3.bE.jdMethod_if(parama31))
    {
    case 0: 
    case 3: 
      i = (byte)a.C;
      break;
    case 1: 
      i = (byte)a.i;
      break;
    case 2: 
      i = (byte)a.J;
      break;
    case 4: 
      i = (byte)a.e;
    }
    if (Math.abs(parama31.aP - parama31.a2) <= i)
    {
      parama31.aP = parama31.a2;
    }
    else if (parama31.aP < parama31.a2)
    {
      parama31.au = 1;
      a3 tmp121_120 = parama31;
      tmp121_120.aP = ((short)(tmp121_120.aP + i));
    }
    else if (parama31.aP > parama31.a2)
    {
      parama31.au = 3;
      a3 tmp151_150 = parama31;
      tmp151_150.aP = ((short)(tmp151_150.aP - i));
    }
    if (Math.abs(parama31.aM - parama31.a1) <= i)
    {
      parama31.aM = parama31.a1;
    }
    else if (parama31.aM < parama31.a1)
    {
      a3 tmp200_199 = parama31;
      tmp200_199.aM = ((short)(tmp200_199.aM + i));
    }
    else if (parama31.aM > parama31.a1)
    {
      a3 tmp225_224 = parama31;
      tmp225_224.aM = ((short)(tmp225_224.aM - i));
    }
    if ((parama31.aP == parama31.a2) && (parama31.aM == parama31.a1)) {
      parama31.au = parama32.au;
    }
  }
  
  public void af()
  {
    if (this.gR != null)
    {
      if ((this.a4 != 112) && (a3.bE.cJ.jdField_int % h.jdMethod_if(3, 8) == 0)) {
        a3.bE.jdMethod_do(this.gR, this);
      }
      a(this.gR, this);
      if (a3.bE.cJ.jdField_int % 300 == 0)
      {
        if (jdMethod_new(this.gR))
        {
          a3.bE.cJ.jdMethod_do(this.gR.O + "逃回了背包.");
          this.gR.jdMethod_if((byte)12, 1);
          if (a3.bE.aG.jdMethod_int(4051))
          {
            a3.bE.aG.jdMethod_for(this.gR.a((byte)0));
            a3.bE.aG.jdMethod_do(2);
            a3.bE.aG.jdMethod_do(1);
            a3.bE.aG.jdMethod_if();
          }
          this.gR = null;
        }
        else if ((jdMethod_try(this.gR)) && (a3.bE.aG.jdMethod_int(4063)))
        {
          a3.bE.aG.jdMethod_for(this.gR.a((byte)0));
          a3.bE.aG.jdMethod_if();
        }
      }
      else if (this.gR.a((byte)40) <= 0)
      {
        a3.bE.cJ.jdMethod_do(this.gR.O + "死亡.");
        this.gR.jdMethod_if((byte)12, 1);
        if (a3.bE.aG.jdMethod_int(4051))
        {
          a3.bE.aG.jdMethod_for(this.gR.a((byte)0));
          a3.bE.aG.jdMethod_do(2);
          a3.bE.aG.jdMethod_do(1);
          a3.bE.aG.jdMethod_if();
        }
        this.gR = null;
      }
    }
  }
  
  public boolean jdMethod_try(a3 parama3)
  {
    if (a3.bE.a(parama3) != 2) {
      return false;
    }
    if ((a3.bE.cJ.jdField_do != 0) || (this.a4 == 112) || (jdMethod_else())) {
      return false;
    }
    int i = (byte)parama3.a((byte)46);
    int j = (byte)Math.max(a.ac, i / a.R * a.p);
    return h.jdMethod_if(a.char, a.new) < j;
  }
  
  public boolean jdMethod_new(a3 parama3)
  {
    if ((a3.bE.cJ.jdField_do != 0) || (g.dD == 0) || (g.dD == 3)) {
      return false;
    }
    int i = (byte)parama3.a((byte)14);
    int j = (byte)Math.max(a.char, (i - a3.bE.cZ.a((byte)14)) / a.t);
    j = (byte)Math.min(a.i, j);
    j = (byte)(j * j);
    if (j == a.char) {
      return false;
    }
    return h.jdMethod_if(a.char, a.new) < a.t * j;
  }
  
  public void I()
  {
    a3.bE.fj.setColor(h.b2[5][0]);
    a3.bE.fj.fillRect(0, 0, h.dU, h.fp);
  }
  
  public void an()
  {
    if ((this == a3.bE.cZ) && (a3.bE.cJ.jdField_if > 2))
    {
      this.fd = false;
      this.fb = false;
      this.e9 = false;
      this.ev = 0;
    }
  }
  
  public void f(byte paramByte)
  {
    if ((this == a3.bE.cZ) && (a3.bE.cJ.jdField_if > 2)) {
      this.ev = ((byte)(this.ev | 1 << paramByte));
    }
  }
  
  public void a(int paramInt1, byte paramByte, int paramInt2, ag paramag)
  {
    int j;
    try
    {
      
      if (paramag.jdMethod_else()) {
        return;
      }
      if (((paramag.fE) || (paramag.hv)) && ((paramByte == hX) || (paramByte == ig))) {
        return;
      }
      if ((a3.bE.cJ.ki) && (paramByte == d8)) {
        return;
      }
      if ((paramag.eT) && (paramByte == dt)) {
        return;
      }
      if ((paramag.a8) || (paramag.dZ) || (paramag.hU) || (paramag.a4 == 5)) {
        return;
      }
      if (paramag.a4 == 112) {
        return;
      }
      paramag.ao = false;
    }
    catch (Exception localException1)
    {
      j = a.new;
      paramag.a((byte)0, (short)1, a.n, true);
      paramag.fd = true;
      j++;
    }
    finally
    {
      h.jdMethod_if(-a.J, a.J);
    }
    a3.bE.B.a(paramag, paramByte);
    int i = 1;
    try
    {
      paramag.dI = paramInt2;
      if ((paramag == a3.bE.cZ) && (a3.bE.cJ.jdField_if > a.t))
      {
        if ((paramag.fm == d8) || (paramag.fm == eV))
        {
          if ((paramag.fm == d8) && ((g.dD == 0) || (g.dD == 3)))
          {
            a3.bE.cJ.a(0, (short)0, false, 30);
            return;
          }
          if (paramag.fm == eV)
          {
            j = 1;
            if ((g.dD != 2) && (g.dD != 1)) {
              j = 0;
            } else if ((g.jS == null) || (g.jS.length == 0)) {
              j = 0;
            }
            if (j == 0)
            {
              a3.bE.cJ.a(0, (short)0, false, 30);
              return;
            }
          }
          paramag.fW = ((short)Math.max(paramag.a((byte)24) / a.t, a.char));
          paramag.fW = a3.jdMethod_new(paramag.fW, a.C);
        }
        else if (paramag.az())
        {
          if ((paramag.fm == hI) && ((g.dD != 1) || (g.dZ != 0)))
          {
            a3.bE.cJ.a(0, (short)0, false, 30);
            return;
          }
          if (((paramag.fm == dV) || (paramag.fm == ey)) && ((g.dD == 0) || (g.dD == 3)))
          {
            a3.bE.cJ.a(0, (short)0, false, 30);
            return;
          }
          if (paramag.fm == hI)
          {
            paramag.fW = ((short)Math.max(paramag.a((byte)24) / a.t, a.char));
            paramag.fW = a3.jdMethod_new(paramag.fW, a.C);
          }
          else
          {
            paramag.fW = ((short)Math.max(paramag.a((byte)26) / a.t, a.char));
            paramag.fW = a3.jdMethod_new(paramag.fW, a.C);
          }
        }
        if (a3.bE.cJ.M())
        {
          paramag.ag();
          a3.bE.cJ.a(1, (short)0, false, 30);
          return;
        }
        if (a3.bE.cJ.O())
        {
          paramag.ag();
          a3.bE.cJ.a(2, (short)0, false, 30);
          return;
        }
        if (a3.bE.cJ.N())
        {
          paramag.ag();
          a3.bE.cJ.a(2, (short)0, false, 30);
          return;
        }
        if (paramag.aw())
        {
          paramag.i((byte)a.ac);
          return;
        }
        if (a3.bE.cJ.K()) {
          return;
        }
      }
    }
    catch (Exception localException2)
    {
      paramag.a(paramag.a((byte)24), true);
      paramag.fb = true;
    }
    finally
    {
      int k;
      if ((paramag == this) && (a3.bE.cJ.jdField_if > a.t))
      {
        paramag.f = ((short)paramag.a((byte)24));
        k = paramag.jdMethod_else() ? paramag.a((byte)20) : paramag.a((byte)20);
        paramag.ak = ((short)a3.jdMethod_do(paramag.hh, a.t));
        k += h.jdMethod_if(-paramag.a((byte)24), paramag.a((byte)20));
        paramag.bx = ((short)paramag.fm);
        i = k > 0 ? 1 : 0;
      }
    }
    if ((paramag == this) && (a3.bE.cJ.jdField_if > a.t)) {
      paramag.D = true;
    }
    boolean bool = false;
    try
    {
      a3.bE.S.a(paramag, true);
      i = bool = 1;
    }
    catch (Exception localException3)
    {
      a3.bE.S.a(null, false);
      paramag.e9 = true;
    }
    finally
    {
      bool = a3.bE.eC;
      a3.bE.S.a(paramag, false);
      i = !bool ? 1 : 0;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ag.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */