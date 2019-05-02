import java.io.DataInputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
import kava.lang.Threak;

public class g
  extends ap
  implements CommandListener, ItemStateListener
{
  int b4;
  int eP;
  short dL;
  int f7;
  int kD;
  boolean el;
  String ez = null;
  short cJ = 0;
  short hv = 0;
  static final byte fq = 17;
  boolean mY;
  boolean gz;
  boolean ed;
  ag[] li;
  String kU = "";
  Image gn = null;
  short jr;
  Image dt = null;
  public int jdField_int = 0;
  public h bh;
  public int gR = 0;
  byte je;
  byte kc = 0;
  boolean lm;
  short ic;
  boolean j5;
  boolean ei;
  byte j0;
  int gO;
  String bl = "";
  byte[] lR;
  byte ca;
  boolean jl;
  boolean bo;
  boolean l0;
  public static final byte hI = 0;
  public static final byte iH = 1;
  public static final byte kK = 9;
  public static final byte bC = 3;
  public static final byte kr = 10;
  public static final byte lP = 5;
  public static final byte ch = 6;
  public static final byte g4 = 7;
  public static final byte kO = 8;
  public static final byte g9 = 2;
  public static final byte d8 = 4;
  public static final byte i5 = 11;
  public static final byte h0 = 12;
  public static final byte eU = 13;
  public static final byte hs = 0;
  public static final byte gN = 1;
  public static final byte e2 = 2;
  public static final byte km = 3;
  public static final byte nn = 4;
  public static final byte fN = 0;
  public static final byte gv = 1;
  public static byte dD;
  public static byte dZ;
  public byte fQ;
  public byte f3;
  public byte bM;
  byte bf;
  byte mz;
  int[] lB = null;
  public String h7;
  public boolean kV = false;
  public static final byte d5 = 0;
  public static final byte ek = 1;
  public static final byte fJ = 2;
  public static final byte j9 = 3;
  public static final byte iI = 4;
  public static final byte iV = 5;
  public static final byte jg = 6;
  public static final byte cq = 7;
  public static final byte gG = 8;
  public static final byte ff = 9;
  public static final byte hn = 10;
  public static final byte dU = 11;
  public static final byte dm = 12;
  public static final byte h3 = 13;
  public static final byte dT = 14;
  public static final byte fe = 15;
  public static final byte fI = 16;
  public static final byte bt = 17;
  public static final byte mG = 18;
  public static final byte fD = 19;
  public static final byte cm = 20;
  public static final byte kt = 21;
  public static final byte jE = 22;
  public static final byte b8 = 23;
  public static final byte hU = 24;
  public static final byte hW = 25;
  public static final byte ci = 26;
  public static final byte ih = 27;
  public static final byte iF = 28;
  public static final byte eH = 29;
  public static final byte b7 = 30;
  public static final byte ck = 31;
  public static final byte iR = 32;
  public static final byte kE = 33;
  public static final byte bk = 34;
  public static final byte mi = 35;
  public static final byte fl = 36;
  public static final byte iL = 37;
  public static final byte le = 38;
  public static final byte eW = 39;
  public static final byte eT = 40;
  public static final byte lx = 41;
  public static final byte h6 = 42;
  public static final byte jz = 43;
  public static final byte cX = 44;
  public static final byte iW = 45;
  public static final byte mh = 46;
  public static final byte ey = 47;
  public static final byte kC = 48;
  public static final byte lq = 49;
  public static final byte dK = 50;
  public static final byte b9 = 51;
  public static final byte mD = 52;
  public static final byte fb = 53;
  public static final byte kN = 54;
  public static final byte l6 = 55;
  public static final byte ka = 56;
  public static final byte fY = 57;
  public static final byte lJ = 58;
  public static final byte ky = 59;
  public static final byte fo = 60;
  public static final byte jt = 61;
  public static final byte mI = 62;
  public static final byte mK = 63;
  public static final byte dG = 64;
  public static final byte bJ = 65;
  public static final byte h8 = 66;
  public static final byte ni = 67;
  public static final byte ex = 68;
  public static final byte bi = 69;
  public static final byte dn = 70;
  public static final byte kn = 71;
  public static final byte f8 = 72;
  public static final byte mk = 73;
  public static final byte jw = 74;
  public static final byte mg = 75;
  public static final byte eM = 76;
  public static final byte gZ = 77;
  public static final byte iP = 78;
  public static final byte ct = 79;
  public static final byte cb = 80;
  public static final byte cV = 81;
  public static final byte jN = 82;
  public static final byte jY = 83;
  public static final byte nv = 84;
  public static final byte kz = 85;
  public static final byte m9 = 86;
  public static final byte h5 = 87;
  public static final byte gs = 88;
  public static final byte g8 = 89;
  public static final byte ik = 90;
  public static final byte iz = 91;
  public static final byte jD = 92;
  public static final byte iC = 93;
  public static final byte lV = 94;
  public static final byte ib = 95;
  public static final byte cO = 96;
  public static final byte eY = 97;
  public static final byte g3 = 98;
  public static final byte cS = 99;
  public static final byte bn = 100;
  public static final byte b3 = 101;
  public static final byte h1 = 102;
  public static final byte in = 103;
  public static final byte gw = 104;
  public static final byte jG = 105;
  public static final byte cj = 106;
  public static final byte hY = 107;
  public static final byte i0 = 108;
  public static final byte mq = 109;
  public static final byte ds = 110;
  public static final byte eS = 111;
  public static final byte cL = 112;
  public static final byte hf = 113;
  public static final byte kL = 114;
  public static final byte gQ = 115;
  public static final byte lw = 116;
  public static final byte eB = 117;
  public static final byte bR = 118;
  public static final byte cG = 119;
  public static final byte lu = 120;
  public static final byte ec = 121;
  public static final byte k0 = 122;
  public static final byte kY = 127;
  public static final byte hH = 123;
  public static final byte ng = 124;
  public static final byte fw = 125;
  public static final byte dP = 126;
  public static final byte ls = 127;
  public static final byte dj = -1;
  public static final byte dh = -2;
  public static final byte df = -3;
  public static final byte bL = -4;
  public static final byte ft = -5;
  public static final byte et = -6;
  public static final byte du = -7;
  public static final byte lc = -8;
  public static final byte hk = -9;
  public static final byte fX = -10;
  public static final byte hE = -11;
  public static final byte nb = -12;
  public static final byte nm = -13;
  public static final byte jJ = -14;
  public static final byte ko = -15;
  public static final byte fK = -16;
  public static final byte hy = -17;
  public static final byte lg = -18;
  public static final byte nj = -19;
  public static final byte lp = -20;
  public static final byte l1 = -21;
  public static final byte dV = -22;
  public static final byte lH = -23;
  public static final byte mm = -24;
  public static final byte bU = -25;
  public static final byte jO = -26;
  public static final byte dp = -27;
  public static final byte jf = -28;
  public static final byte mE = -29;
  public static final byte lh = -30;
  public static final byte fR = -31;
  public static final byte e4 = -32;
  public static final byte ji = -33;
  public static final byte kW = -34;
  public static final byte gE = -35;
  public static final byte i6 = -36;
  public static final byte gl = -37;
  public static final byte hh = -38;
  public static final byte kR = -39;
  public static final byte lU = -40;
  public static final byte iq = -41;
  public static final byte hw = -42;
  public static final byte mJ = -43;
  public static final byte jZ = -44;
  public static final byte hd = -45;
  public static final byte j7 = -46;
  public static final byte j6 = -47;
  public static final byte iv = -48;
  public static final byte cg = -49;
  public static final byte m2 = -50;
  public static final byte bE = -51;
  public static final byte lE = -52;
  public static final byte fc = -53;
  public static final byte gb = -54;
  public static final byte k8 = -55;
  public static final byte ii = -56;
  public static final byte cF = -57;
  public static final byte mt = -58;
  public static final byte ia = -59;
  public static final byte e6 = -60;
  public static final byte fW = -61;
  public static final byte m1 = -62;
  public static final byte cK = -63;
  public static final byte hR = -64;
  public static final byte jI = -65;
  public static final byte fB = -66;
  public static final byte hK = -67;
  public static final byte iE = -68;
  public static final byte mO = -69;
  public static final byte d3 = -70;
  public static final byte d1 = -71;
  public static final byte js = -72;
  public static final byte l3 = -73;
  public static final byte me = -74;
  public static final byte ks = -75;
  public static final byte gu = -76;
  public static final byte di = -77;
  public static final byte cB = -78;
  public static final byte iT = -79;
  public static final byte fh = -80;
  public static final byte e9 = -81;
  public static final byte iB = -82;
  public static final byte d2 = -83;
  public static final byte is = -84;
  public static final byte m6 = -85;
  public static final byte ll = -86;
  public static final byte lv = -87;
  public static final byte im = -88;
  public static final byte f0 = -89;
  public static final byte cZ = -90;
  public static final byte cy = -91;
  public static final byte cC = -92;
  public static final byte gy = -93;
  public static final byte c6 = -94;
  public static final byte dJ = -95;
  public static final byte iS = -96;
  public static final byte ej = -97;
  public static final byte l2 = -98;
  public static final byte gr = -99;
  public static final byte eD = -100;
  public static final byte lA = -101;
  public static final byte c5 = -102;
  public static final byte cu = -103;
  public static final byte mV = -104;
  public static final byte gU = -105;
  public static final byte jh = -106;
  public static final byte eK = -107;
  public static final byte eh = -108;
  public static final byte m0 = -109;
  public static final byte j3 = -120;
  public static final byte m8 = -121;
  public static final byte dr = -122;
  public static final byte cR = -123;
  public static final byte by = -124;
  public static final byte mU = -125;
  public static final byte go = 1;
  public static final byte iY = -1;
  public String[] bI = null;
  public byte bK;
  String k2 = null;
  public static boolean kQ = false;
  public static ar[] jS = null;
  public static ag[] hm = null;
  public String gB;
  short iK;
  String bu = null;
  byte eR;
  public l[] mN = null;
  short cH = (short)(h.fp - 96);
  static final byte bv = 50;
  static final byte gx = 10;
  short bG = 0;
  String[] eA = new String[50];
  byte[] cY = new byte[50];
  byte[] eG = new byte[50];
  boolean[] eg = new boolean[50];
  short mR = 0;
  String[] k4 = new String[10];
  boolean[] lC = new boolean[5];
  String[][] ld = new String[5][25];
  int[] h4 = new int[5];
  short[][][] g2 = new short[5][3][25];
  Vector kP = new Vector();
  Vector mB = new Vector();
  Vector ip = new Vector();
  Vector bS = new Vector();
  Vector ee = new Vector();
  byte[] gC = null;
  boolean[] i2 = null;
  String b5 = null;
  int es;
  int bA;
  int ht;
  String[] c9 = null;
  byte[] mQ = null;
  boolean bj;
  Vector d6 = null;
  public static byte eO = 4;
  short gi = 0;
  short hZ = 0;
  byte gd = 0;
  public static final String[] b2 = { "+敏捷", "+物攻", "+物防", "+魔攻", "+魔防", "返回" };
  public static final String[] fZ = { "发送消息", "加为好友", "返　　回" };
  short dg;
  short em;
  short[] my;
  String[] ew;
  boolean iN;
  int kS;
  boolean jX;
  byte c1;
  int[] il;
  boolean ki;
  boolean e7;
  int fg;
  short eE;
  short ly;
  boolean iJ;
  int eb;
  byte mf;
  String eN = "";
  String[] g6 = new String[0];
  byte[] cl = new byte[0];
  byte[] no = new byte[0];
  short hM = 0;
  int mw;
  int gV;
  static byte gf = 0;
  public static final String dC = "如何申请VIP?\001 1.您可以通过主菜单->VIP->申请功能,使用星币,激活VIP特殊权限.(如果星币不足,可使用主菜单->系统->充值功能,进行充值.)\001 2.VIP特殊权限有三种激活方式,分别为10元/月,30元/6月,50元/12月,可任选其一进行激活.(激活的时间越久,所获得的优惠幅度越大.)\001 成为VIP有什么好处?\001 1.VIP用户可使用游戏币不限数量的购买商城中的任意商品.使您更加便捷的进行游戏.\001 2.VIP用户每次登陆根据离线时间可获得离线经验的奖励,助你快速升级.\001 3.VIP用户可获得独有的VIP图标,从而彰显你的尊贵.";
  public int kp;
  public int jA;
  public String i7;
  public boolean gP;
  public String m3 = null;
  byte kx;
  byte gM;
  short lW;
  short iu;
  Vector dY = null;
  Vector k1 = null;
  String m7;
  byte kH = 0;
  byte fF;
  byte[] cE;
  byte d7;
  byte gt = 0;
  boolean lf;
  int cU;
  byte iw;
  String gm;
  String io;
  String jk;
  String mA;
  String hx;
  String bT;
  String[] nt;
  String[][] fx;
  String[] cW = { "买", "卖", "取消" };
  short[] cP = null;
  short[] j4 = null;
  short[] mP = null;
  String[] kZ = null;
  int[] nu = null;
  String[] lZ = null;
  String[] kw = null;
  boolean[] dB = null;
  byte[] kB = null;
  byte[] ln = null;
  byte[] iU = null;
  byte[] eQ = null;
  long bO = 0L;
  short dx = 0;
  byte dc = 0;
  short fs;
  short fp;
  short dk = 0;
  short hj = 0;
  byte hB = 0;
  short[] d4 = null;
  short lb;
  String lt = null;
  boolean jdField_new = false;
  boolean eL = false;
  short jB = -1;
  byte[] bz = null;
  byte[] it = null;
  byte[] hb = null;
  byte k6;
  String hz;
  byte ir;
  String[] eF;
  Vector c8 = new Vector();
  byte lz;
  int kl;
  String na = null;
  boolean bH = false;
  Vector j8 = new Vector();
  Vector nk = new Vector();
  Vector cd = new Vector();
  String mH;
  String mp;
  int c0;
  int kF;
  int gW;
  int fO;
  int hP;
  boolean hu = false;
  boolean dN = false;
  int dE;
  String f9;
  public static final byte eV = 0;
  public static final byte jH = 1;
  public static final byte cx = 2;
  public static final byte ij = 3;
  public static final byte bV = 4;
  public static final byte hg = 5;
  public static final byte nr = 6;
  public static final byte fT = 7;
  byte mZ;
  String[] cM;
  String eJ;
  String jy;
  byte[] fG;
  byte[] ie;
  String[] la;
  String[] lG;
  String[] iA;
  byte lT;
  int ep;
  String hO = null;
  String kh = null;
  boolean dl;
  boolean dd;
  public static final byte cQ = 0;
  public static final byte jR = 1;
  public static final byte hT = 2;
  public static final byte kq = 3;
  public static final byte lF = 4;
  public static final byte m4 = 5;
  public static final byte bQ = 6;
  static final int[] iO = { 16777214, 7864183, 7864319, 16759637, 16776960, 16777214, 16777214 };
  int ce;
  int ga;
  int nf;
  boolean bw;
  String jx;
  byte lS;
  int dW;
  String eu = "";
  boolean ha = false;
  public static final String[] b6 = { "世界", "公会", "队伍", "系统", "私聊", "喊话", "区域" };
  public boolean nq;
  public long lM;
  int hF = 0;
  int b0 = 0;
  int i4 = h.eA * 2;
  int bp = 0;
  String[] db = null;
  boolean dz;
  short gH;
  int kM;
  byte e5;
  byte e1 = -1;
  byte bY;
  short ju;
  int[] dH = null;
  boolean d9 = false;
  int dS = 0;
  int e8 = 0;
  byte j1;
  byte ku;
  boolean kG;
  int be;
  public static final byte fP = 20;
  public byte jF = 0;
  public boolean[] fH = null;
  public int[] bx = new int[20];
  public short[] jU = new short[20];
  public short[] jT = new short[20];
  public String[] cp = new String[20];
  public int[][] jd = new int[20][];
  public int[][] br = new int[20][];
  public byte[][] bP = new byte[20][];
  int fk = 0;
  byte hq = 2;
  byte hp = 2;
  byte eq;
  byte fj;
  byte h9;
  boolean fn = false;
  public byte dw = (byte)(h.fp / (h.eA + 4));
  short c4;
  byte hi;
  short mo;
  short ml;
  Vector hV = new Vector();
  String jK = null;
  byte e3;
  int[] bZ = null;
  byte c3;
  String lr;
  int ne;
  int ja;
  int mC;
  int mu;
  int mr;
  int mF;
  short g1;
  long lN = 0L;
  boolean b1 = false;
  short f6;
  byte cs;
  s g7 = null;
  ae md = null;
  t eZ = null;
  short gc;
  short gA;
  short i1;
  short l5;
  int bX;
  String j2;
  int mb;
  int cn;
  String l8;
  int ma;
  boolean mc;
  boolean d0;
  short f2;
  boolean gL;
  short bW;
  public static final byte iX = (byte)((h.fp - 40) / (h.eA + 2) - 1);
  public String[] hl = null;
  public byte[] lj = null;
  public byte[] mT = null;
  public static String[][] f1 = { { "查看", "数字1", "数字3", "数字7", "数字9", "返回" }, { "查看", "学习", "返回" }, { "查看", "数字1", "数字3", "数字7", "数字9", "提升", "返回" } };
  public byte dF;
  public byte gS;
  public short nw;
  byte fE;
  short[] jc = null;
  String[] lI = null;
  String[] hA = null;
  short[][] nl = (short[][])null;
  short[][] jv = (short[][])null;
  short[][] ev = (short[][])null;
  int[][] lK = (int[][])null;
  byte[] bs = null;
  short hr;
  String hX;
  byte gp;
  byte hC;
  byte lY;
  byte lX;
  public static final byte c2 = 18;
  public static final byte fv = 18;
  public static final byte jW = 6;
  public static final byte cr = 8;
  public static byte lQ = 6;
  public static byte kj = 4;
  public static short f5 = 128;
  public static short l7 = 128;
  String[] i3 = null;
  c e0 = null;
  n jj = null;
  af ea = null;
  at iZ = null;
  m mM = null;
  k c7 = null;
  int f4;
  int hG;
  int mn;
  byte l4;
  String[] cz = { "状态", "资源", "成员", "一览", "退会" };
  byte kk;
  String[] mv = { "情侣", "师徒" };
  byte mj;
  String[] iQ = { "私聊", "资料", "赠送", "返回" };
  byte nd;
  String[] ke = { "成员", "冷却", "退队" };
  public int gk = -1;
  public int k5 = -1;
  public int k3 = -1;
  public int er = -1;
  public int da = -1;
  public int fm = -1;
  String fS;
  byte ns;
  String fA;
  String fL;
  byte gI;
  boolean ho;
  boolean nh = false;
  String dy = null;
  byte gX;
  short[] dR;
  byte[] jQ;
  boolean bB;
  String fM;
  public Hashtable fu = new Hashtable();
  public int[] co = new int[30];
  public byte[] iG = new byte[30];
  public String[] iy = new String[30];
  public short[] mX = new short[30];
  public short[] mW = new short[30];
  public short[] jq = new short[30];
  public short[] jo = new short[30];
  public byte[] eX = new byte[30];
  public byte[] kf = new byte[30];
  public boolean[] gT = new boolean[30];
  public short[] dq = new short[30];
  public short[][] jC = new short[30][8];
  public short[] iD = new short[30];
  public short[] fz = new short[30];
  public short[] g5 = new short[30];
  public short[] kA = new short[30];
  public short[] dX = new short[30];
  public short[] fi = new short[30];
  public short[] kJ = new short[30];
  public boolean[] k9 = new boolean[30];
  public boolean[] en = new boolean[30];
  public byte[] hQ = new byte[30];
  public byte[] jn = new byte[30];
  public byte[] jm = new byte[30];
  public byte[] dQ = new byte[30];
  public int[] mL = new int[30];
  public short[] gF = new short[30];
  public byte[] gh = new byte[30];
  public String[] fy = new String[30];
  public byte[] k7 = new byte[30];
  public short kT = 0;
  public static final byte ef = 0;
  public static final byte l9 = 1;
  public static final byte jp = 2;
  public static final byte np = 3;
  public static final byte bg = 4;
  public static final byte gY = 5;
  public int[][][] de = new int[2][6][5];
  short[][] bq;
  int[][] ge;
  String[][] lk;
  String[] lL;
  public boolean bN = true;
  public byte nc;
  public short dI;
  public short[] gK;
  public short[] cD;
  byte fa;
  String jb;
  String[] kX = null;
  String[] kd = null;
  String[][] gq = (String[][])null;
  String[][][] cv = (String[][][])null;
  byte[] jV = null;
  byte[][] cT = (byte[][])null;
  byte[][][] iM = (byte[][][])null;
  byte jM;
  byte ix;
  byte dA;
  public static String[] he = null;
  public static String[] dM = null;
  public static String[] eo = null;
  public static byte[] kv = null;
  MessageConnection lo = null;
  String[] gJ = null;
  int kg = -1;
  String hD = null;
  byte[] hc = null;
  short[] gj = null;
  ag bD = null;
  String cw = null;
  byte jP;
  byte dv;
  boolean mS;
  boolean hN;
  byte ig;
  byte id;
  byte ms;
  short fV;
  short fU;
  byte gg;
  byte lD;
  byte fd;
  byte[] eI;
  short[] h2;
  int bF;
  byte dO;
  String bm;
  int lO;
  byte gD;
  String kb;
  public static final byte kI = 5;
  public byte fC = 0;
  String[] fr = null;
  String[] hJ = new String[5];
  short[] cI = new short[5];
  public short mx = -1;
  public boolean m5;
  public short eC = -1;
  public byte hS = 0;
  public short cf;
  public short jL;
  public short hL;
  public short cN;
  public short cc;
  public short g0;
  short cA = -1;
  short i9;
  short i8;
  
  public void E()
  {
    k();
    int i;
    if (this.mN != null) {
      for (i = 0; i < this.mN.length; i++) {
        if (this.mN[i].jdField_new <= this.bh.cZ.aM) {
          this.bh.a(this.mN[i]);
        }
      }
    }
    this.bh.cZ.jdMethod_char();
    if (this.mN != null) {
      for (i = 0; i < this.mN.length; i++) {
        if (this.mN[i].jdField_new > this.bh.cZ.aM) {
          this.bh.a(this.mN[i]);
        }
      }
    }
    jdMethod_void();
    this.bh.cZ.a(this.bh);
    this.bh.C();
    this.bh.R();
    jdMethod_long();
  }
  
  public void itemStateChanged(Item paramItem)
  {
    if (paramItem == this.bh.i.jdField_byte)
    {
      if (!this.bh.i.g.isSelected(0))
      {
        this.bh.i.jdField_byte.setString("");
        Alert localAlert = new Alert("提示", "请绑定手机号和密保码.", null, AlertType.WARNING);
        localAlert.setTimeout(2000);
        Display.getDisplay(this.bh.fG).setCurrent(localAlert);
      }
    }
    else if ((paramItem == this.bh.i.g) && (!this.bh.i.g.isSelected(0))) {
      this.bh.i.jdField_byte.setString("");
    }
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    this.bh.i.a(paramCommand, paramDisplayable);
  }
  
  public void jdMethod_int(byte paramByte)
  {
    if (this.bh.d5) {
      this.a = jdMethod_for(this.bh.aW, this.bh.aV);
    }
    this.bh.cZ.aP = ((short)(this.a % this.bh.w * h.u));
    this.bh.cZ.aM = ((short)(this.a / this.bh.w * h.b8));
    this.bh.cZ.d7 = 0;
    this.bh.cZ.d6 = 0;
    this.bh.cZ.jdMethod_do(this.bh.cZ.aP, this.bh.cZ.aM);
    if (this.bh.cZ.gR != null) {
      this.bh.jdMethod_if(this.bh.cZ.gR, this.bh.cZ);
    }
    if (this.bh.d5)
    {
      this.bh.d5 = false;
      this.bh.cZ.aP = this.bh.aW;
      this.bh.cZ.aM = this.bh.aV;
      if (this.bh.cZ.a((byte)16) == 0) {
        this.bh.cZ.a4 = 10;
      } else {
        this.bh.b0.a(this.bh.cZ.jdMethod_int((byte)1), 0, this.bh.cZ.al);
      }
    }
    this.bh.N();
    if (paramByte == 0)
    {
      this.bh.dk = null;
      gf = 0;
      this.jdField_do = 0;
      this.jdField_for = false;
    }
    else
    {
      this.j0 = 1;
    }
  }
  
  public void t()
  {
    this.kG = false;
  }
  
  public void u()
  {
    if (!this.kG) {
      this.be = 0;
    }
    this.ku = 1;
    this.kG = true;
    this.c4 = 5;
    if ((this.j1 == 28) || (this.j1 == -91)) {
      this.c4 = 18;
    }
    this.hi = 0;
    this.hZ = ((short)(this.hZ + 1));
    if (this.jdField_do == -106)
    {
      if (this.hZ > this.c8.size() - 1) {
        this.bh.i.jdMethod_for();
      }
    }
    else if (this.jdField_do == -108)
    {
      if (this.hZ > this.j8.size() - 1) {
        this.bh.i.jdMethod_for();
      }
    }
    else if (this.jdField_do == -109)
    {
      if (this.hZ > this.nk.size() - 1) {
        this.bh.i.jdMethod_for();
      }
    }
    else if (this.jdField_do == -120)
    {
      if (this.hZ > this.cd.size() - 1) {
        this.bh.i.jdMethod_for();
      }
    }
    else if (this.hZ > this.ip.size() - 1)
    {
      this.bh.i.jdMethod_for();
      return;
    }
    if (this.gi + this.dw - 1 < this.hZ) {
      this.gi = ((short)(this.gi + 1));
    }
  }
  
  public void L()
  {
    this.ku = 0;
    if (!this.kG) {
      this.be = 0;
    }
    this.kG = true;
    this.hZ = ((short)(this.hZ - 1));
    this.c4 = 5;
    if ((this.j1 == 28) || (this.j1 == -91)) {
      this.c4 = 18;
    }
    this.hi = 0;
    if (this.hZ < 0)
    {
      if (this.jdField_do == -106) {
        this.hZ = ((short)(this.c8.size() - 1));
      } else if (this.jdField_do == -108) {
        this.hZ = ((short)(this.j8.size() - 1));
      } else if (this.jdField_do == -109) {
        this.hZ = ((short)(this.nk.size() - 1));
      } else if (this.jdField_do == -120) {
        this.hZ = ((short)(this.cd.size() - 1));
      } else {
        this.hZ = ((short)(this.ip.size() - 1));
      }
      this.gi = ((short)Math.max(0, this.hZ - this.dw + 1));
      return;
    }
    if (this.hZ < this.gi) {
      this.gi = this.hZ;
    }
  }
  
  public void x()
  {
    synchronized (this.bx)
    {
      this.jF = 0;
    }
  }
  
  public void h()
  {
    synchronized (this.mX)
    {
      for (int i = 0; i < this.kT; i++)
      {
        if (((this.mX[i] != this.jq[i]) || (this.mW[i] != this.jo[i])) && (this.gF[i] <= 0))
        {
          this.iG[i] = 0;
        }
        else if (this.iG[i] <= 60)
        {
          int tmp82_81 = i;
          byte[] tmp82_78 = this.iG;
          tmp82_78[tmp82_81] = ((byte)(tmp82_78[tmp82_81] + 1));
        }
        if (this.bh.cv == 1)
        {
          if (this.jq[i] > this.mX[i]) {
            this.dQ[i] = 1;
          } else if (this.jq[i] < this.mX[i]) {
            this.dQ[i] = 0;
          }
          this.mX[i] = this.jq[i];
          this.mW[i] = this.jo[i];
        }
        else
        {
          int tmp178_177 = i;
          short[] tmp178_174 = this.gF;
          tmp178_174[tmp178_177] = ((short)(tmp178_174[tmp178_177] - 1));
          if (this.gF[i] <= 0)
          {
            if (Math.abs(this.jq[i] - this.mX[i]) <= 6) {
              this.mX[i] = this.jq[i];
            }
            if (Math.abs(this.jo[i] - this.mW[i]) <= 6) {
              this.mW[i] = this.jo[i];
            }
            if (this.jq[i] > this.mX[i])
            {
              int tmp279_278 = i;
              short[] tmp279_275 = this.mX;
              tmp279_275[tmp279_278] = ((short)(tmp279_275[tmp279_278] + 6));
            }
            else if (this.jq[i] < this.mX[i])
            {
              int tmp309_308 = i;
              short[] tmp309_305 = this.mX;
              tmp309_305[tmp309_308] = ((short)(tmp309_305[tmp309_308] - 6));
            }
            if (this.jo[i] > this.mW[i])
            {
              int tmp336_335 = i;
              short[] tmp336_332 = this.mW;
              tmp336_332[tmp336_335] = ((short)(tmp336_332[tmp336_335] + 6));
            }
            else if (this.jo[i] < this.mW[i])
            {
              int tmp366_365 = i;
              short[] tmp366_362 = this.mW;
              tmp366_362[tmp366_365] = ((short)(tmp366_362[tmp366_365] - 6));
            }
          }
        }
      }
    }
  }
  
  public void e()
  {
    synchronized (this.mX)
    {
      h();
      this.fk = 0;
      int i;
      for (this.hM = ((short)(this.kT - 1)); this.hM >= 0; this.hM = ((short)(this.hM - 1)))
      {
        i = 0;
        for (int j = 0; j < this.li.length; j = (byte)(j + 1)) {
          if ((!this.li[j].gq) && (this.iy[this.hM].equals(this.li[j].O)))
          {
            i = 1;
            break;
          }
        }
        if ((this.bD != null) && (this.iy[this.hM].equals(this.hD))) {
          i = 1;
        }
        if (i == 0)
        {
          int k;
          if (dZ == 1)
          {
            if (this.bh.cZ.gE)
            {
              j = 0;
              if (this.g6 != null) {
                for (k = 0; k < this.g6.length; k = (byte)(k + 1)) {
                  if ((this.g6[k] != null) && (this.g6[k].equals(this.iy[this.hM])))
                  {
                    j = 1;
                    break;
                  }
                }
              }
              if (j == 0) {}
            }
          }
          else
          {
            int m;
            if ((!this.bh.bu) && (this.bh.cZ.gE) && (this.g6 != null))
            {
              j = 1;
              k = h.dU - 82 + 20;
              this.bh.fj.setColor(h.b2[3][0]);
              for (m = 0; m < this.g6.length; m = (byte)(m + 1)) {
                if ((this.g6[m] != null) && (this.g6[m].equals(this.iy[this.hM])))
                {
                  this.bh.fj.fillArc(k + 3 * (this.mX[this.hM] / h.u), j + 2 * (this.mW[this.hM] / h.u), 3, 3, 0, 360);
                  break;
                }
              }
            }
            if ((this.mX[this.hM] != 0) && (this.mW[this.hM] != 0) && (this.mX[this.hM] < ag.hF + h.dU) && (this.mX[this.hM] + 20 > ag.hF) && (this.mW[this.hM] < ag.hE + h.fp) && (this.mW[this.hM] + 31 > ag.hE))
            {
              j = this.mX[this.hM] + 10 - h.dA.stringWidth(this.iy[this.hM]) / 2 - 12 - ag.hF;
              if (this.bh.cv != 2)
              {
                k = 0;
                if (((this.mX[this.hM] == this.jq[this.hM]) && (this.mW[this.hM] == this.jo[this.hM])) || (this.gF[this.hM] > 0))
                {
                  if (1 == h.h(this.dq[this.hM])) {
                    k = 4;
                  } else if (this.iG[this.hM] > 60) {
                    k = 5;
                  } else {
                    switch (this.dQ[this.hM])
                    {
                    case 0: 
                      k = 2;
                      break;
                    case 1: 
                      k = 3;
                    }
                  }
                }
                else
                {
                  if (this.jq[this.hM] > this.mX[this.hM]) {
                    k = 1;
                  } else if (this.jq[this.hM] < this.mX[this.hM]) {
                    k = 0;
                  }
                  this.dQ[this.hM] = k;
                }
                if (this.bh.cv == 0)
                {
                  this.bh.a(this.mX[this.hM], this.mW[this.hM], (byte)(k % 2 == 0 ? 3 : 1), this.gh[this.hM]);
                  if (this.hQ[this.hM] != 0) {
                    this.bh.b0.a(this.mX[this.hM] - ag.hF, this.mW[this.hM] - ag.hE, this.bh.o, ag.hR, 0, false, 0);
                  }
                  this.bh.b0.a(this.mX[this.hM] - ag.hF, this.mW[this.hM] - ag.hE, this.bh.o, this.de[this.eX[this.hM]][k], k % 2 == 0 ? 2 : k == 4 ? 0 : this.dQ[this.hM] == 0 ? 2 : 0, this.gT[this.hM], this.kf[this.hM]);
                  if (k == 5) {
                    this.bh.a(this.mX[this.hM] - ag.hF, this.mW[this.hM] - ag.hE, this.eX[this.hM], this.kf[this.hM], this.jC[this.hM][0], this.jC[this.hM][1], this.jC[this.hM][2], this.jC[this.hM][3], this.jC[this.hM][5], this.jC[this.hM][6], this.jC[this.hM][7], this.jdField_int);
                  }
                }
                else if (this.bh.cv == 1)
                {
                  this.bh.a(this.mX[this.hM] - ag.hF, this.mW[this.hM] - ag.hE, this.bh.eZ.getWidth() / 2, this.bh.eZ.getHeight(), this.bh.eZ.getWidth() / 2 * this.eX[this.hM], 0, this.bh.eZ, this.dQ[this.hM] == 0 ? 2 : 0);
                }
                if ((this.bh.dT != 1) && (80 >= h.jdMethod_if(this.bh.cZ.aP, this.mX[this.hM], this.bh.cZ.aM, this.mW[this.hM])))
                {
                  this.fk += 1;
                  if (this.fk <= a.J)
                  {
                    m = 0;
                    int i10 = this.mL[this.hM];
                    if ((this.bh.cv != 1) && (this.bh.bY) && (this.fy[this.hM] != null)) {
                      this.bh.a(this.mX[this.hM], this.mW[this.hM], (byte)(k % 2 == 0 ? 3 : 1), this.gh[this.hM], this.fy[this.hM], m);
                    }
                    int n;
                    if (this.bh.jdMethod_for(this.iy[this.hM]))
                    {
                      if (this.jdField_int / 5 % 3 == 0) {
                        n = 0;
                      } else if (this.jdField_int / 5 % 3 == 1) {
                        n = 4;
                      } else {
                        n = 3;
                      }
                    }
                    else
                    {
                      if (i10 != -1) {
                        if (i10 == this.bh.cZ.fL) {
                          n = 1;
                        } else if (i10 != this.bh.cZ.fL) {
                          n = 5;
                        }
                      }
                      if (h.u(this.dq[this.hM])) {
                        n = 4;
                      } else if (jdMethod_if(this.iy[this.hM])) {
                        n = 6;
                      }
                    }
                    this.bh.a(this.iy[this.hM], this.mX[this.hM] + 10 - ag.hF, this.mW[this.hM] - 20 - ag.hE, 17, h.b2[n][0]);
                    String str = this.bh.jdMethod_if(this.mL[this.hM]);
                    if ((str != null) && (this.bh.cr))
                    {
                      this.bh.a(str, this.mX[this.hM] + 10 - ag.hF, this.mW[this.hM] - 20 - ag.hE - h.eA - 1, 17, m.a[this.bh.jdMethod_try(this.mL[this.hM])]);
                      this.bh.jdMethod_do(this.mL[this.hM], this.mX[this.hM] + 10 - ag.hF - h.dA.stringWidth(str) / 2 - 17, this.mW[this.hM] - 20 - ag.hE - h.eA - 1);
                    }
                    if ((h.ek) && (this.k9[this.hM] != 0))
                    {
                      j -= 12;
                      this.bh.a(j, this.mW[this.hM] - 20 - ag.hE, 24, 12, 288, 0, this.bh.aH[10], 0);
                      j -= 12;
                    }
                    if (h.I(this.dq[this.hM]))
                    {
                      this.bh.a(j, this.mW[this.hM] - 20 - ag.hE, 12, 12, 228, 0, this.bh.aH[10], 0);
                      j -= 12;
                    }
                    if (h.H(this.dq[this.hM]))
                    {
                      this.bh.a(j, this.mW[this.hM] - 20 - ag.hE, 12, 12, 132, 0, this.bh.aH[10], 0);
                      j -= 12;
                    }
                    if (this.k7[this.hM] >= 0)
                    {
                      this.bh.a(j, this.mW[this.hM] - 20 - ag.hE, this.k7[this.hM]);
                      j -= 12;
                    }
                    if ((this.hD != null) && (this.hD.equals(this.iy[this.hM])))
                    {
                      this.bh.a(j, this.mW[this.hM] - 20 - ag.hE, 12, 12, 180, 0, this.bh.aH[10], 0);
                      j -= 12;
                    }
                  }
                }
              }
              if ((h.jdMethod_case(this.dq[this.hM])) && (this.mX[this.hM] == this.jq[this.hM]) && (this.mW[this.hM] == this.jo[this.hM])) {
                a(this.mX[this.hM], this.mW[this.hM], (byte)(h.B(this.dq[this.hM]) ? 1 : 0));
              }
              if (this.bh.a(this.iy[this.hM])) {
                this.bh.a(j, this.mW[this.hM] - 20 - ag.hE, 12, 12, 156, 0, this.bh.aH[10], 0);
              }
            }
          }
        }
      }
      if (this.bh.cv == 0) {
        for (i = 0; i < this.de[0].length; i++) {
          if (i != 4)
          {
            this.bh.b0.a(this.de[0][i]);
            this.bh.b0.a(this.de[1][i]);
          }
        }
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte)
  {
    int i = paramByte;
    paramInt1 += 1 - ag.hF;
    paramInt2 += 21 - ag.hE;
    if (i == 2) {
      paramByte = 0;
    }
    this.bh.a(this.bh.fj, paramInt1, paramInt2, 19, 10, paramByte * 19, 0, this.bh.aH[13], 0);
    if (i == 2) {
      this.bh.a(paramInt1 + (this.jdField_int / 5 % 16 + 1) * h.jdMethod_new(this.jdField_int % 12 * 30) / 256, paramInt2 + (this.jdField_int / 8 % 8 + 2) * h.jdMethod_do(this.jdField_int % 10 * 30) / 256, 2, this.jdField_int / 2 % 3);
    }
  }
  
  public void P()
  {
    synchronized (this.bx)
    {
      for (int i = 0; i < this.jF; i = (byte)(i + 1)) {
        if (h.a(this.jU[i], this.jT[i], 25, 25, ag.hF, ag.hE, h.dU, h.fp))
        {
          a(this.jU[i], this.jT[i], (byte)2);
          if ((this.bh.dT != 1) && (this.bh.cv != 2) && (100 >= h.jdMethod_if(this.bh.cZ.aP, this.jU[i], this.bh.cZ.aM, this.jT[i]))) {
            this.bh.a(this.cp[i], this.jU[i] + 10 - ag.hF, this.jT[i] - 20 - ag.hE, 17, h.b2[0][0]);
          }
        }
      }
    }
  }
  
  public void jdMethod_if(int paramInt1, int paramInt2) {}
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void jdMethod_if(int paramInt)
  {
    this.bh.B.a(paramInt, true);
  }
  
  public void jdMethod_int(int paramInt1, int paramInt2)
  {
    this.bh.a(paramInt1, paramInt2, this.bh.aH[6].getWidth(), this.bh.aH[6].getHeight(), 0, 0, this.bh.aH[6], 0);
  }
  
  public void a(Vector paramVector, boolean paramBoolean)
  {
    int i = 35;
    int j = 5;
    if ((this.j1 == 28) || (this.j1 == 16) || (this.j1 == -91)) {
      j = 18;
    }
    int k = (short)(h.dU - j - 4);
    this.bh.a((byte)2, 0, 0, h.dU, h.fp, true);
    String str1 = null;
    switch (this.j1)
    {
    case -109: 
      str1 = "师徒信息";
      break;
    case -108: 
      str1 = "情侣信息";
      break;
    case -106: 
      str1 = "购买方式";
      break;
    case -18: 
      str1 = "金币市场";
      break;
    case -30: 
      str1 = "建筑科技";
      break;
    case -36: 
      str1 = "充值方式";
      break;
    case 16: 
      str1 = "附近玩家";
      break;
    case -17: 
      str1 = "队伍成员";
      break;
    case -5: 
    case 104: 
      str1 = "公会成员";
      this.bh.a(h.dU - 5, 15, this.iu, 24);
      this.bh.a(h.dU - 5 - 21, 15, 5, 7, 50, 0, this.bh.aH[5], 0);
      this.bh.a(h.dU - 5 - 21, 15, this.lW, 24);
      break;
    case -91: 
      str1 = "公会一览";
      break;
    case 28: 
      str1 = "好友列表";
      break;
    case 90: 
      str1 = "黑名单";
      break;
    case 29: 
      str1 = "请求列表";
      break;
    case 14: 
      str1 = "本星系航线";
      break;
    case 52: 
      str1 = "已学技能";
      break;
    case -32: 
    case -31: 
      str1 = this.jb;
    }
    this.bh.fj.setColor(h.b2[2][1]);
    this.bh.fj.drawString(str1, h.dU / 2, 5, 17);
    this.bh.a((byte)2, 0, 0, h.dU, 30, false);
    if (paramVector.isEmpty()) {
      return;
    }
    if ((this.jdField_do == 26) || (this.jdField_do == -5))
    {
      if ((this.kG) && (++this.be > 12) && (this.jdField_int % 2 == 0)) {
        if (this.ku == 0) {
          L();
        } else {
          u();
        }
      }
    }
    else {
      this.kG = false;
    }
    String str2 = null;
    short s = 0;
    int m = -1;
    for (int n = 0; (n < this.dw) && (this.gi + n < paramVector.size()); n++)
    {
      str2 = (String)paramVector.elementAt(this.gi + n);
      if ((this.j1 == 28) || (this.j1 == 16) || (this.j1 == 104) || (this.j1 == -5) || (this.j1 == 14)) {
        s = ((Short)this.bS.elementAt(this.gi + n)).shortValue();
      } else if (this.j1 == -91) {
        m = ((Integer)this.bS.elementAt(this.gi + n)).intValue();
      }
      if (this.j1 == 29) {
        if (0 == ((Byte)this.bS.elementAt(this.gi + n)).byteValue()) {
          str2 = "入队 " + str2;
        } else if (1 == ((Byte)this.bS.elementAt(this.gi + n)).byteValue()) {
          str2 = "入会 " + str2;
        } else if (2 == ((Byte)this.bS.elementAt(this.gi + n)).byteValue()) {
          str2 = "退会 " + str2;
        } else if (3 == ((Byte)this.bS.elementAt(this.gi + n)).byteValue()) {
          str2 = "同盟 " + str2;
        } else if (4 == ((Byte)this.bS.elementAt(this.gi + n)).byteValue()) {
          str2 = "拜师 " + str2;
        } else if (5 == ((Byte)this.bS.elementAt(this.gi + n)).byteValue()) {
          str2 = "求爱 " + str2;
        }
      }
      if (n == this.hZ - this.gi)
      {
        this.bh.fj.setColor(h.b2[2][1]);
        this.bh.fj.fillRect(j - 2, i + n * h.eA - 2, k + 2, h.eA + 2);
        this.bh.fj.setColor(h.b2[2][0]);
        switch (this.j1)
        {
        case -91: 
          this.bh.jdMethod_do(m, 0, i + n * h.eA);
          if (m == this.bh.cZ.fL) {
            this.bh.fj.setColor(h.b2[2][0]);
          } else if (this.bh.cZ.ge == m) {
            if (this.bh.cZ.gm == 0) {
              this.bh.fj.setColor(h.b2[1][0]);
            } else {
              this.bh.fj.setColor(h.b2[4][0]);
            }
          }
          break;
        case 16: 
          if (s != -1)
          {
            if (h.jdMethod_case(s)) {
              this.bh.fj.setColor(h.b2[0][0]);
            }
            if (h.u(s)) {
              this.bh.fj.setColor(h.b2[4][0]);
            }
            if (h.H(s)) {
              this.bh.a(3, i + n * h.eA, 12, 12, 132, 0, this.bh.aH[10], 0);
            } else if (h.I(s)) {
              this.bh.a(3, i + n * h.eA, 12, 12, 228, 0, this.bh.aH[10], 0);
            }
          }
          else
          {
            this.bh.a(3, i + n * h.eA, 2, this.jdField_int / 2 % 3);
            this.bh.fj.setColor(h.b2[0][0]);
          }
          break;
        case 104: 
          if (s == 1) {
            this.bh.fj.setColor(16768256);
          }
          break;
        case 28: 
          if (s == 1)
          {
            if (this.i2[(this.gi + n)] != 0) {
              this.bh.a(3, i + n * h.eA + 2, 12, 12, 228, 0, this.bh.aH[10], 0);
            } else {
              this.bh.a(3, i + n * h.eA, 15, 15, this.gC[(this.gi + n)] == 0 ? 23 : 3, 3, this.bh.aH[7], 0);
            }
            this.bh.fj.setColor(16768256);
          }
          break;
        case -109: 
          if (s == 1)
          {
            if (this.i2[(this.gi + n)] != 0) {
              this.bh.a(3, i + n * h.eA + 2, 12, 12, 228, 0, this.bh.aH[10], 0);
            } else {
              this.bh.a(3, i + n * h.eA, 15, 15, this.gC[(this.gi + n)] == 0 ? 23 : 3, 3, this.bh.aH[7], 0);
            }
            this.bh.fj.setColor(16768256);
          }
          break;
        case -5: 
        case 14: 
          if (s == 1) {
            this.bh.fj.setColor(16768256);
          }
          break;
        }
        if (h.dA.stringWidth(str2) > k)
        {
          if (this.hi > 10) {
            this.c4 = ((short)(this.c4 - 3));
          } else {
            this.hi = ((byte)(this.hi + 1));
          }
          if (this.c4 + h.dA.stringWidth(str2) < 0) {
            this.c4 = ((short)(h.dU - 5));
          }
          this.bh.fj.setClip(j, i + n * h.eA - 1, k, h.eA + 1);
          this.bh.fj.drawString(str2, this.c4, i + n * h.eA, 0);
          this.bh.fj.setClip(0, 0, h.dU, h.fp);
        }
        else
        {
          int i10 = j;
          this.bh.fj.drawString(str2, i10, i + n * h.eA, 0);
        }
      }
      else
      {
        this.bh.fj.setColor(h.b2[2][1]);
        switch (this.j1)
        {
        case -91: 
          this.bh.jdMethod_do(m, 0, i + n * h.eA);
          if (m == this.bh.cZ.fL) {
            this.bh.fj.setColor(h.b2[2][0]);
          } else if (this.bh.cZ.ge == m) {
            if (this.bh.cZ.gm == 0) {
              this.bh.fj.setColor(h.b2[1][0]);
            } else {
              this.bh.fj.setColor(h.b2[4][0]);
            }
          }
          break;
        case 16: 
          if (s != -1)
          {
            if (h.jdMethod_case(s)) {
              this.bh.fj.setColor(h.b2[0][0]);
            }
            if (h.u(s)) {
              this.bh.fj.setColor(h.b2[4][0]);
            }
            if (h.H(s)) {
              this.bh.a(3, i + n * h.eA, 12, 12, 132, 0, this.bh.aH[10], 0);
            } else if (h.I(s)) {
              this.bh.a(3, i + n * h.eA, 12, 12, 228, 0, this.bh.aH[10], 0);
            }
          }
          else
          {
            this.bh.a(3, i + n * h.eA, 2, this.jdField_int / 2 % 3);
            this.bh.fj.setColor(h.b2[0][0]);
          }
          break;
        case 104: 
          if (s == 1) {
            this.bh.fj.setColor(16768256);
          }
          break;
        case 28: 
          if (s == 1)
          {
            if (this.i2[(this.gi + n)] != 0) {
              this.bh.a(3, i + n * h.eA + 2, 12, 12, 228, 0, this.bh.aH[10], 0);
            } else {
              this.bh.a(3, i + n * h.eA, 15, 15, this.gC[(this.gi + n)] == 0 ? 23 : 3, 3, this.bh.aH[7], 0);
            }
            this.bh.fj.setColor(16768256);
          }
          break;
        case -5: 
        case 14: 
          if (s == 1) {
            this.bh.fj.setColor(16768256);
          }
          break;
        }
        this.bh.fj.setClip(j, i + n * h.eA - 1, k, h.eA + 1);
        this.bh.fj.drawString(str2, j, i + n * h.eA, 0);
        this.bh.fj.setClip(0, 0, h.dU, h.fp);
      }
    }
    if (this.gi > 0) {
      this.bh.a(h.dU - 16, i + (this.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.bh.aH[4], 0);
    }
    if (this.gi < paramVector.size() - this.dw) {
      this.bh.a(h.dU - 16, h.fp - 23 + (this.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.bh.aH[4], 3);
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    this.bh.a(paramString1, -1, (byte)4, false);
    int i = (short)Math.max(h.dA.stringWidth(paramString2), h.dA.stringWidth(paramString3));
    this.bh.a((byte)2, (h.dU - i - 30) / 2, h.fp / 2 + 15, i + 30, 50, true);
    this.mC = ((h.dU - i - 30) / 2 + 20);
    this.mu = (h.fp / 2 + 20 + this.e3 * 20);
    this.mr = (i + 30);
    this.mF = 20;
    this.bh.fj.setColor(h.b2[2][0]);
    this.bh.fj.fillRect(this.mC - 17, this.mu, this.mr - 6, this.mF);
    this.bh.fj.setColor(h.b2[2][1]);
    this.bh.fj.drawString(paramString2, this.mC, h.fp / 2 + 20, 20);
    this.bh.fj.drawString(paramString3, this.mC, h.fp / 2 + 20 + 20, 20);
    if (this.jdField_int % 5 == 0) {
      this.fn = (!this.fn);
    }
    jdMethod_int(this.mC - 16 + (this.fn ? -1 : 1), h.fp / 2 + 15 + 5 + 2 + this.e3 * 20);
    this.bh.dk = null;
  }
  
  public void jdMethod_if()
  {
    if (h.cz)
    {
      long l = System.currentTimeMillis();
      if (l - this.lN >= 60000L)
      {
        this.lN = l;
        this.bh.aG.jdMethod_new();
      }
    }
    if (this.bh.fK)
    {
      this.bh.fj.setColor(0);
      this.bh.fj.fillRect(0, 0, h.dU, h.fp);
      this.bh.fj.setColor(h.b2[5][0]);
      this.bh.fj.drawString((this.bh.dp == 0 ? ">>" : "") + "暂停游戏" + (this.bh.dp == 0 ? "<<" : ""), 50, 20, 17);
      this.bh.fj.drawString((this.bh.dp == 1 ? ">>" : "") + "继续游戏" + (this.bh.dp == 1 ? "<<" : ""), 50, 45, 17);
      return;
    }
    if (h.fZ != null) {
      for (int i = 0; i < h.fZ.length; i = (byte)(i + 1)) {
        h.a5.a(h.fZ[i]);
      }
    }
    this.bh.fK = false;
    this.kp += 1;
    if ((this.bh.cZ.he) && (this.bh.cZ.ii < 2000))
    {
      ag tmp379_376 = this.bh.cZ;
      tmp379_376.ii = ((short)(tmp379_376.ii + 1));
    }
    if ((!this.bh.cZ.a8) && ((this.jdField_do == 1) || (this.jdField_do == 2) || (this.jdField_do == 26) || (this.jdField_do == 27) || (this.jdField_do == 74) || (this.jdField_do == 15) || (this.jdField_do == 93) || (this.jdField_do == 29) || (this.jdField_do == 13) || (this.jdField_do == 109) || (this.jdField_do == 50)) && (Display.getDisplay(this.bh.fG).getCurrent() == this.bh))
    {
      this.g1 = ((short)(this.g1 + 1));
      if (this.g1 > 2000) {
        this.bh.i.jdMethod_case();
      }
    }
    else
    {
      this.g1 = 0;
    }
    this.bh.r();
    if ((this.jdField_do != 5) && (this.bh.w()))
    {
      if ((this.bh.I()) && (this.jdField_int % h.jdMethod_if(5, 6) == 0)) {
        synchronized (h.co)
        {
          this.bh.d();
        }
      }
      if ((this.bh.jdMethod_goto()) && (this.jdField_int % h.jdMethod_if(5, 6) == 0))
      {
        synchronized (h.bG)
        {
          this.bh.jdMethod_if(h.bG[0], h.ds[0], h.ej[0], h.cy[0], h.ec[0], h.aa[0]);
        }
        this.bh.jdMethod_int();
      }
    }
    if ((this.bh.cZ.a4 == 10) && (!this.ki) && ((dD == 1) || (dD == 4)) && (dZ == 0) && (this.jdField_int % 10 == 0)) {
      this.bh.cZ.A();
    }
    if (this.bh.S.ad)
    {
      ag.hF = (short)(ag.hF + 2 * (this.jdField_int % 2 == 0 ? -1 : 1));
      ag.hE = (short)(ag.hE + 3 * (this.jdField_int % 5 < 3 ? -1 : this.jdField_int % 2 == 0 ? -1 : this.jdField_int % 5 < 3 ? 1 : 1));
      if (ag.hF < 0)
      {
        ag.hF = 0;
      }
      else if (ag.hF + h.dU >= this.bh.ad)
      {
        ag.hF = (short)(this.bh.ad - h.dU);
        if (ag.hF < 0) {
          ag.hF = 0;
        }
      }
      if (ag.hE < 0)
      {
        ag.hE = 0;
      }
      else if (ag.hE + h.fp > this.bh.dz)
      {
        ag.hE = (short)(this.bh.dz - h.fp);
        if (ag.hE < 0) {
          ag.hE = 0;
        }
      }
    }
    if (++this.jdField_int == Integer.MAX_VALUE) {
      this.jdField_int = 0;
    }
    String str1;
    int i14;
    int i12;
    switch (this.jdField_do)
    {
    case -16: 
      E();
      a("确认提交宠物?", "是", "否");
      this.bh.x();
      this.bh.c();
      break;
    case -19: 
      E();
      this.bh.a(this.lr, gf, (byte)4, false);
      this.bh.x();
      this.bh.c();
      break;
    case -18: 
      E();
      a(this.ip, true);
      this.bh.x();
      this.bh.c();
      break;
    case 78: 
      switch (this.bh.cZ.gj)
      {
      case 1: 
        E();
        this.bh.a("输入" + (this.bh.cZ.dN == 0 ? "买1手金" : "卖1手金") + "的单价(1手金=100星币).", -1, (byte)4, false);
        if (this.bh.cZ.gj == 1) {
          this.bh.d9.a();
        }
        this.bh.x();
        this.bh.c();
        break;
      case 3: 
        E();
        this.bh.a("输入" + (this.bh.cZ.dN == 0 ? "买1手金" : "卖1手金") + "的数量(1手金=100星币).", -1, (byte)4, false);
        if (this.bh.cZ.gj == 3) {
          this.bh.d9.a();
        }
        this.bh.x();
        this.bh.c();
        break;
      case 4: 
        E();
        this.bh.a("您的交易信息为:" + (this.bh.cZ.dN == 0 ? "买" : "卖") + a3.jdMethod_do(this.bh.cZ.dP, a.C) + "手金,单价" + a3.jdMethod_do(this.bh.cZ.gF, a.C) + "游戏币.是否缴纳押金10星币提交交易请求? (交易不限时长,在线有效)成交则押金不予退还,撤单将扣除2星币平台使用费.", gf, (byte)4, false);
        this.bh.x();
        this.bh.c();
      }
      break;
    case 60: 
      E();
      this.bh.a("请选择要进行的操作?", -1, (byte)4, false);
      this.bh.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.gd, this.c9);
      this.bh.x();
      this.bh.c();
      break;
    case -13: 
      E();
      this.bh.a("选择完成[" + this.bh.bR.jdField_case + "]提交的宠物?", -1, (byte)4, false);
      this.bh.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.gd, this.c9);
      this.bh.x();
      this.bh.c();
      break;
    case 107: 
      E();
      this.bh.a((byte)2, 0, 0, this.dt.getWidth() + 4, this.dt.getHeight() + 4, true);
      this.bh.fj.drawImage(this.dt, 2, 2, 0);
      this.bh.c();
      break;
    case 7: 
      E();
      a(this.fA, "查看", "返回");
      break;
    case 55: 
      E();
      this.bh.a(this.nt[this.fF], -1, (byte)4, false);
      this.bh.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.d7, this.fx[this.fF]);
      this.bh.x();
      this.bh.c();
      break;
    case 59: 
      E();
      if (this.bh.a(this.m7, gf, (byte)4, false))
      {
        this.cJ = 4;
        this.hv = 168;
        j();
      }
      this.bh.x();
      break;
    case -29: 
      E();
      j = this.bh.cZ.jdMethod_int(this.bh.cZ.bo, this.dF);
      j = Math.max(1, j);
      int k = (j + 1) * (j + 1) * (j + 1) * 100;
      a("是否消耗职业熟练值" + k + "提升本技能?", "是", "否");
      break;
    case 34: 
      switch (this.kH)
      {
      case 0: 
      case 1: 
        E();
        a("新物质融合器:\"是否已准备好启动融合?\"", "是", "否");
      }
      break;
    case -125: 
      E();
      if (this.gP)
      {
        if (this.bh.a(this.i7, gf, (byte)4, false)) {
          this.gP = false;
        }
      }
      else
      {
        a(this.i7, "是", "否");
        this.bh.x();
        this.bh.c();
      }
      break;
    case -124: 
      E();
      str1 = "欢迎回到充满未知与激情的星战世界!您已离线超过" + this.bh.bD + "小时,每小时可获得" + this.bh.ey + "点离线经验(等级越高,获得越多),点击确认VIP用户即可获得总计" + this.bh.dl + "点离线经验.";
      if (this.bh.dL)
      {
        if (this.bh.a(str1, gf, (byte)4, false)) {
          this.bh.dL = false;
        }
      }
      else
      {
        a(str1, "是", "否");
        this.bh.x();
        this.bh.c();
      }
      break;
    case -104: 
      E();
      if (this.bh.a(this.dy, gf, (byte)4, false)) {}
      this.bh.a((byte)2, 0, h.fp - 22, 45, 22, true);
      this.bh.a((byte)2, h.dU - 45, h.fp - 22, 45, 22, true);
      this.bh.fj.setColor(0);
      this.bh.fj.drawString("购买", 22, h.fp - 3, 33);
      this.bh.fj.setColor(0);
      this.bh.fj.drawString("取消", h.dU - 22, h.fp - 3, 33);
      break;
    case 65: 
      E();
      if (this.bh.a(this.fA, gf, (byte)4, false)) {
        if (this.gI == 0)
        {
          this.fA = null;
          this.fL = null;
          this.jdField_do = 0;
        }
        else
        {
          this.e3 = 0;
          this.jdField_do = 7;
        }
      }
      break;
    case -101: 
      E();
      this.bh.ck.jdMethod_int();
      a(this.iN ? "查看下一页?" : "查看上一页?", "是", "否");
      break;
    case -100: 
    case -99: 
    case -98: 
    case -97: 
    case -96: 
    case -95: 
      this.ea.jdMethod_new();
      break;
    case -92: 
      this.bh.bS.a();
      break;
    case -93: 
    case -90: 
    case -88: 
    case -87: 
      this.bh.fm.jdMethod_do();
      break;
    case -85: 
      E();
      this.bh.a("设置什么职位?(可通过:系统->帮助->公会->职位 查看管理职位任命要求)", -1, (byte)4, false);
      this.bh.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.gd, this.c9);
      this.bh.x();
      this.bh.c();
      break;
    case -94: 
      E();
      a(this.bu, "确定", "取消");
      break;
    case -86: 
      E();
      a(this.bu, "确定", "取消");
      break;
    case -75: 
      E();
      a("确定使用该颜色?", "确定", "取消");
      break;
    case -74: 
      this.mM.a();
      this.bh.x();
      this.bh.c();
      break;
    case -51: 
      this.bh.bf.a();
      break;
    case -71: 
      this.bh.ct.jdMethod_if();
      break;
    case -47: 
      this.iZ.a();
      break;
    case -44: 
    case -43: 
    case -42: 
    case -40: 
      this.bh.b();
      break;
    case -84: 
    case -73: 
    case -41: 
      E();
      a("确定使用?", "确定", "取消");
      break;
    case -48: 
      E();
      a("确定兑换?", "确定", "取消");
      break;
    case -39: 
      E();
      this.bh.jdMethod_long();
      this.bh.x();
      this.bh.c();
      break;
    case -102: 
    case -38: 
    case -37: 
    case -36: 
      this.bh.bv.jdMethod_do();
      break;
    case -69: 
    case -68: 
    case -67: 
    case -66: 
    case -65: 
    case -63: 
    case -62: 
    case -61: 
    case -60: 
    case -59: 
    case -58: 
    case -57: 
    case -56: 
    case -55: 
    case -54: 
    case -53: 
    case -52: 
    case -35: 
    case -34: 
      this.bh.y();
      break;
    case 40: 
      a("使用唤醒模组?(" + (10 - this.jdField_int / 10 % 10) + ")", "是", "否");
      if (this.jdField_int > 100)
      {
        this.e3 = 1;
        jdMethod_if(5);
      }
      break;
    case 39: 
      this.bh.a("使用唤醒模组?", -1, (byte)4, false);
      if (this.jdField_int > 10)
      {
        this.jdField_do = 40;
        this.jdField_int = 0;
        this.e3 = 0;
      }
      break;
    case -50: 
    case -45: 
    case 18: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.bh.i.jdMethod_do(true);
      a(this.jdField_do == -50 ? "装备位上是极品装备,强制卸下将导致装备丢弃,确定丢弃?(可使用特殊道具解除绑定)" : "确定丢弃?", "是", "否");
      break;
    case -23: 
      this.bh.k("公会战结束,请稍候...");
      break;
    case -22: 
      this.bh.k("公会战即将开始...");
      break;
    case -21: 
      this.bh.dy.a();
      break;
    case -26: 
    case -25: 
    case -24: 
    case -20: 
    case -14: 
    case -10: 
      this.bh.ez.a();
      break;
    case 68: 
    case 84: 
    case 85: 
      this.bh.jdField_long.a();
      break;
    case -9: 
    case 47: 
    case 48: 
    case 49: 
    case 54: 
    case 66: 
    case 126: 
      this.bh.e0.jdMethod_if(this.jdField_do);
      break;
    case -30: 
      E();
      if (this.mZ == 0)
      {
        this.bh.a("选择要进行的操作?", -1, (byte)4, false);
        this.bh.a((h.dU - 50) / 2, (h.fp - 70) / 2 + 20, this.gd, this.cM);
        this.bh.x();
        this.bh.c();
      }
      else if (this.mZ == 1)
      {
        this.bh.a(this.eJ, gf, (byte)4, false);
        jdMethod_do("升级", "返回");
      }
      else if (this.mZ == 2)
      {
        a(this.ip, true);
        jdMethod_do("选择", "返回");
      }
      else if (this.mZ == 3)
      {
        a(this.ip, true);
        jdMethod_do("使用", "返回");
      }
      else if (this.mZ == 4)
      {
        a(this.ip, false);
        this.bh.a(this.lG[this.hZ], gf, (byte)4, false);
        jdMethod_do("研发", "返回");
      }
      else if (this.mZ == 6)
      {
        a(this.ip, false);
        this.bh.a((String)this.ee.elementAt(this.hZ), gf, (byte)4, false);
        jdMethod_do("使用", "返回");
      }
      else if (this.mZ == 5)
      {
        a(this.ip, false);
        a("确定要研发此科技?", "是", "否");
      }
      else if (this.mZ == 7)
      {
        a(this.ip, false);
        String str2 = "激活科技需消耗公会贡献度1,是否要激活?(同时只能激活1种科技,若已激活其他科技,将自动解除)";
        if (this.fG[this.hZ] > 5) {
          str2 = "确定使用该科技?";
        }
        a(str2, "是", "否");
      }
      break;
    case -83: 
    case 12: 
      E();
      this.bh.jdMethod_long();
      this.bh.a((h.dU - 50) / 2, (h.fp - 70) / 2 + 20, this.gd, new String[] { "购买", "查看", "返回" });
      this.bh.x();
      this.bh.c();
      break;
    case 86: 
      this.md.jdMethod_if();
      this.bh.a(22, h.eA * 2 + 2, this.gd, this.md.jdField_if);
      break;
    case 91: 
      this.md.jdMethod_if();
      break;
    case -6: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      a(this.ip, false);
      a("确认会长转移给" + this.b5 + "?", "是", "否");
      break;
    case -5: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      a(this.ip, true);
      this.bh.x();
      this.bh.c();
      break;
    case -4: 
      E();
      if (this.mf == 0) {
        a("强制退会需扣除金钱" + this.eb + ",且将导致公会贡献度清0.确认操作？", "确认", "返回");
      } else {
        a("退出公会会将公会贡献度清0,确认退会?", "确认", "返回");
      }
      break;
    case -3: 
      E();
      a("选择退会方式?", "申请退会", "强制退会");
      this.bh.x();
      this.bh.c();
      break;
    case -2: 
      E();
      a("选择退会方式?", "会长转移", "强制退会");
      this.bh.x();
      this.bh.c();
      break;
    case -1: 
      E();
      a("公会只有你一人,解散公会?", "是", "否");
      break;
    case 121: 
      E();
      this.bh.s();
      a("确定开始合成?", "是", "否");
      break;
    case 120: 
      E();
      this.bh.s();
      this.bh.d9.a();
      break;
    case 119: 
      if ((this.jdField_int == 1) && (this.dx == 0))
      {
        a("请选择合成主材料", (short)119, false, 20);
        return;
      }
      E();
      this.bh.s();
      if (this.dx > 0) {
        this.bh.x();
      }
      this.bh.c();
      break;
    case 101: 
      this.bh.a("任务失败!", -1, (byte)4, false);
      if (this.jdField_int > 15)
      {
        this.bh.cZ.T = false;
        this.bh.cZ.ao = false;
        this.bh.cZ.hU = false;
        this.bh.cZ.a4 = 0;
        this.bh.cZ.jdMethod_if((byte)16, 1);
        this.bh.o();
      }
      break;
    case 92: 
      E();
      if (this.g6.length > 0)
      {
        if (this.eq > this.g6.length - 1) {
          this.eq = ((byte)(this.g6.length - 1));
        }
        this.bh.a(27 + (this.jdField_int % 5 == 0 ? 2 : 0), 22 + this.eq * (6 + (h.a9 == 0 ? 3 : h.eA)), this.bh.aH[6].getWidth(), this.bh.aH[6].getHeight(), 0, 0, this.bh.aH[6], 2);
      }
      this.bh.x();
      this.bh.c();
      break;
    case 11: 
    case 67: 
    case 81: 
    case 88: 
    case 100: 
      this.bh.ck.jdMethod_if();
      break;
    case 116: 
      this.bh.fj.setColor(0);
      this.bh.fj.fillRect(0, 0, h.dU, h.fp);
      int m = 8;
      int n = h.dU / 2 - (72 + 4 * m) / 2;
      int i10 = h.fp / 2 - (72 + 4 * m) / 2;
      for (int i11 = 0; i11 < 6; i11 = (byte)(i11 + 1)) {
        for (i14 = 0; i14 < 6; i14 = (byte)(i14 + 1)) {
          this.bh.a(n + i11 * (12 + m), i10 + i14 * (12 + m), 12, 12, i11 * 12, i14 * 12, this.bh.aH[8], 0);
        }
      }
      this.bh.fj.setColor(h.b2[5][0]);
      this.bh.fj.drawRect(n + this.hq * (12 + m) - 4 + this.jdField_int / 2 % 2, i10 + this.hp * (12 + m) - 4 + this.jdField_int / 2 % 2, 18 - 2 * (this.jdField_int / 2 % 2), 18 - 2 * (this.jdField_int / 2 % 2));
      this.bh.x();
      this.bh.c();
      break;
    case 115: 
    case 124: 
      if (this.jdField_int <= 11)
      {
        this.bh.fj.setColor(0);
        this.bh.fj.fillRect(0, 0, h.dU, h.fp);
        if (this.jdField_int >= 5)
        {
          this.bh.fj.setColor(16777215);
          this.bh.fj.fillRect(0, h.fp / 2, h.dU / 4 * (this.jdField_int - 5), 2);
        }
        if (this.jdField_int == 11) {
          if (this.jdField_do == 124) {
            this.bh.cZ.a4 = 12;
          } else {
            this.bh.cZ.a4 = 11;
          }
        }
      }
      else
      {
        E();
        if (this.jdField_int > (this.jdField_do == 124 ? 18 : 40)) {
          a(this.bl, (short)0, true, 9999);
        }
      }
      break;
    case 114: 
      this.bh.du.a();
      break;
    case 113: 
      if (this.bh.a(this.bu, gf, (byte)4, false)) {
        this.bh.a(this, this.bh.s);
      }
      break;
    case 42: 
      E();
      if (this.bh.a(this.bu, gf, (byte)4, false)) {
        this.jdField_do = 0;
      }
      break;
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 45: 
      this.bh.br.a();
      break;
    case -72: 
      this.bh.ct.jdMethod_if();
      break;
    case 75: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.e0.a();
      this.bh.a(72, 0, this.gd, f1[this.gS]);
      break;
    case 74: 
      this.e0.a();
      break;
    case 27: 
      E();
      a(this.ip, false);
      if (this.hu == true) {
        a(this.nk, true);
      }
      if (this.dN == true) {
        a(this.j8, true);
      }
      this.bh.a(h.dU - 46, 0, this.gd, this.c9);
      break;
    case 53: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      a(this.ip, true);
      a("确定遗忘吗？", "是", "否");
      break;
    case 26: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      a(this.ip, true);
      this.bh.x();
      this.bh.c();
      break;
    case -70: 
      this.bh.ct.jdMethod_if();
      break;
    case -46: 
      this.iZ.a();
      break;
    case 118: 
      E();
      if (this.bh.a(this.bu, gf, (byte)4, false)) {
        if (this.bK == 1)
        {
          if (this.bh.cZ.fL < 0) {
            this.bh.i.jdMethod_else();
          } else {
            this.jdField_do = 0;
          }
        }
        else {
          this.jdField_do = 0;
        }
      }
      break;
    case 22: 
      E();
      if (this.bh.a(this.bu, gf, (byte)4, false)) {
        Display.getDisplay(this.bh.fG).setCurrent(this.bh.i.h);
      }
      break;
    case 3: 
    case 125: 
      this.bh.k("请稍候...");
      if ((this.jdField_int > 2400) && (this.jdField_do == 3)) {
        a("打开商店失败.", (short)0, false, 30);
      }
      break;
    case -105: 
      E();
      this.bh.a(this.hz, gf, (byte)4, false);
      break;
    case -106: 
      E();
      a(this.c8, true);
      this.bh.x();
      this.bh.c();
      break;
    case -123: 
      E();
      str1 = "您当前还不是VIP用户.VIP用户可获得使用游戏币购买商城道具,登陆获得离线经验,增加现金背包等特权.是否申请成为VIP用户(最低仅需5元/月)?";
      if (this.bH)
      {
        if (this.bh.a(str1, gf, (byte)4, false))
        {
          this.e3 = 0;
          this.bH = false;
        }
      }
      else
      {
        a(str1, "是", "否");
        this.bh.x();
        this.bh.c();
      }
      break;
    case -107: 
      E();
      if (this.lz == 0)
      {
        if (this.bh.a(this.na, gf, (byte)4, false)) {
          this.jdField_do = 0;
        }
        this.bh.c();
      }
      else
      {
        a(this.na, "是", "否");
        this.bh.x();
        this.bh.c();
      }
      break;
    case -108: 
      E();
      a(this.j8, true);
      this.bh.x();
      this.bh.c();
      break;
    case -109: 
      E();
      a(this.nk, true);
      this.bh.x();
      this.bh.c();
      break;
    case -120: 
      E();
      if (this.bh.a(this.na, gf, (byte)4, false)) {
        this.jdField_do = 0;
      }
      break;
    case -122: 
    case -121: 
      E();
      a(this.f9, "是", "否");
      this.bh.x();
      this.bh.c();
      break;
    case 21: 
      this.bh.k("请稍候...");
      break;
    case 103: 
      break;
    case -8: 
      E();
      if (this.bh.a(this.k2, gf, (byte)4, false))
      {
        this.k2 = null;
        this.jdField_do = 0;
      }
      break;
    case -7: 
      this.bh.k("请稍候...");
      break;
    case 110: 
      E();
      if (this.bh.a("等候超时!", gf, (byte)4, false)) {
        J();
      }
      break;
    case 108: 
      this.bh.k("请稍候...");
      break;
    case 109: 
      this.c7.a();
      break;
    case 106: 
      break;
    case -103: 
      E();
      a(this.lt, "确定", "取消");
      this.bh.x();
      this.bh.c();
      break;
    case -81: 
    case 46: 
      E();
      this.bh.jdMethod_long();
      a("确定购买?", "是", "否");
      break;
    case -82: 
    case 51: 
      E();
      this.bh.jdMethod_long();
      this.bh.d9.a();
      break;
    case -80: 
    case 10: 
      E();
      this.bh.jdMethod_long();
      if (this.dx > 0) {
        this.bh.x();
      }
      this.bh.c();
      break;
    case -78: 
    case 9: 
      a("确定摆摊?", "是", "否");
      break;
    case -79: 
    case -77: 
    case 8: 
    case 72: 
      E();
      this.bh.s();
      this.bh.d9.a();
      break;
    case -76: 
    case 6: 
      E();
      this.bh.s();
      if (this.dx > 0) {
        this.bh.x();
      }
      this.bh.c();
      break;
    case 98: 
      E();
      if ((this.bh.a(this.lt, gf, (byte)4, this.jdField_new)) || (this.jdField_int > this.eP))
      {
        this.bh.dk = null;
        this.jdField_do = this.lb;
      }
      break;
    case -27: 
    case 95: 
    case 96: 
    case 97: 
    case 111: 
    case 112: 
      this.bh.as.a();
      break;
    case -12: 
    case 71: 
    case 82: 
    case 83: 
    case 102: 
      this.bh.aI.jdMethod_if();
      break;
    case 99: 
      E();
      this.bh.a(this.bh.S.F, gf - 1, (byte)4, false);
      this.bh.a((h.dU - 50) / 2, (h.fp - 70) / 2 + 20, this.gd, this.cW);
      break;
    case 94: 
      E();
      if (this.bh.a(this.bh.S.F, gf, (byte)4, false)) {
        this.jdField_do = 99;
      }
      break;
    case 93: 
      E();
      a("进入 " + this.ez + "?", "是", "否");
      break;
    case 89: 
      this.md.jdMethod_for();
      this.bh.a(20, this.md.jdField_null + 20, this.gd, this.md.jdField_case);
      break;
    case 76: 
      E();
      this.bh.a("添加新任务!", -1, (byte)4, false);
      if (this.jdField_int > 20) {
        jdMethod_if(5);
      }
      break;
    case 77: 
      E();
      this.bh.a("该任务结束!", -1, (byte)4, false);
      if (this.jdField_int > 20) {
        jdMethod_if(5);
      }
      break;
    case 73: 
      E();
      if (this.bh.a(this.jK, gf, (byte)4, false)) {
        this.jdField_do = 0;
      }
      break;
    case 70: 
      E();
      if (this.bh.a(this.fA, gf, (byte)4, false)) {
        gf = 0;
      }
      this.bh.a((byte)2, 0, h.fp - 22, 45, 22, true);
      this.bh.a((byte)2, h.dU - 45, h.fp - 22, 45, 22, true);
      this.bh.fj.setColor(0);
      this.bh.fj.drawString("查看", 22, h.fp - 3, 33);
      this.bh.fj.setColor(0);
      this.bh.fj.drawString("退出", h.dU - 22, h.fp - 3, 33);
      break;
    case 62: 
      E();
      if (this.bh.S.aB != 0)
      {
        switch (this.bh.S.W)
        {
        case 0: 
        case 2: 
          if (this.bh.S.aB - this.bh.S.ac <= 0)
          {
            l tmp7850_7847 = this.bh.S.aD;
            tmp7850_7847.jdField_new = ((short)(tmp7850_7847.jdField_new + this.bh.S.aB * a3.bp[this.bh.S.W]));
            this.bh.S.aB = 0;
          }
          else
          {
            l tmp7908_7905 = this.bh.S.aD;
            tmp7908_7905.jdField_new = ((short)(tmp7908_7905.jdField_new + this.bh.S.ac * a3.bp[this.bh.S.W]));
            as tmp7949_7946 = this.bh.S;
            tmp7949_7946.aB = ((short)(tmp7949_7946.aB - this.bh.S.ac));
          }
          break;
        case 1: 
        case 3: 
          if (this.bh.S.aB - this.bh.S.ac <= 0)
          {
            l tmp8005_8002 = this.bh.S.aD;
            tmp8005_8002.jdField_try = ((short)(tmp8005_8002.jdField_try + this.bh.S.aB * a3.bq[this.bh.S.W]));
            this.bh.S.aB = 0;
          }
          else
          {
            l tmp8063_8060 = this.bh.S.aD;
            tmp8063_8060.jdField_try = ((short)(tmp8063_8060.jdField_try + this.bh.S.ac * a3.bq[this.bh.S.W]));
            as tmp8104_8101 = this.bh.S;
            tmp8104_8101.aB = ((short)(tmp8104_8101.aB - this.bh.S.ac));
          }
          break;
        }
      }
      else
      {
        this.bh.bV.a(this.bh.S.ar, 0, this.bh.S.aD.a);
        this.bh.S.a();
      }
      break;
    case 61: 
      E();
      if (this.bh.S.aD.a[4] == 0)
      {
        this.bh.S.aD.a[4] = 1;
        as tmp8218_8215 = this.bh.S;
        tmp8218_8215.G = ((byte)(tmp8218_8215.G + 1));
        if (this.bh.S.G >= this.bh.S.aQ)
        {
          this.bh.bV.a(this.bh.S.ar, 0, this.bh.S.aD.a);
          this.bh.S.a();
        }
      }
      break;
    case 79: 
      E();
      if ((this.bh.S.aB != 0) && (this.bh.S.ac > 0))
      {
        switch (this.bh.S.W)
        {
        case 0: 
        case 2: 
          if (this.bh.S.aB - this.bh.S.ac <= 0)
          {
            l tmp8402_8399 = this.bh.S.aD;
            tmp8402_8399.jdField_new = ((short)(tmp8402_8399.jdField_new + this.bh.S.aB * a3.bp[this.bh.S.W]));
            this.bh.S.aB = 0;
          }
          else
          {
            l tmp8460_8457 = this.bh.S.aD;
            tmp8460_8457.jdField_new = ((short)(tmp8460_8457.jdField_new + this.bh.S.ac * a3.bp[this.bh.S.W]));
            as tmp8501_8498 = this.bh.S;
            tmp8501_8498.aB = ((short)(tmp8501_8498.aB - this.bh.S.ac));
          }
          break;
        case 1: 
        case 3: 
          if (this.bh.S.aB - this.bh.S.ac <= 0)
          {
            l tmp8557_8554 = this.bh.S.aD;
            tmp8557_8554.jdField_try = ((short)(tmp8557_8554.jdField_try + this.bh.S.aB * a3.bq[this.bh.S.W]));
            this.bh.S.aB = 0;
          }
          else
          {
            l tmp8615_8612 = this.bh.S.aD;
            tmp8615_8612.jdField_try = ((short)(tmp8615_8612.jdField_try + this.bh.S.ac * a3.bq[this.bh.S.W]));
            as tmp8656_8653 = this.bh.S;
            tmp8656_8653.aB = ((short)(tmp8656_8653.aB - this.bh.S.ac));
          }
          break;
        }
        as tmp8682_8679 = this.bh.S;
        tmp8682_8679.ac = ((byte)(tmp8682_8679.ac + this.bh.S.S));
      }
      else
      {
        this.bh.bV.a(this.bh.S.ar, 0, this.bh.S.aD.a);
        this.bh.S.a();
      }
      break;
    case 58: 
      E();
      if (this.bh.a(this.bh.S.C, gf, (byte)4, false)) {
        this.jdField_do = 63;
      }
      break;
    case 63: 
      this.e3 = this.bh.S.av;
      a(this.bh.S.C, this.bh.S.ai[0], this.bh.S.ai[1]);
      break;
    case 57: 
      if ((ag.hF < 0) || (ag.hE < 0) || (ag.hF + h.dU > this.bh.ad) || (ag.hE + h.fp > this.bh.dz)) {
        this.bh.S.aC = 0;
      }
      if (this.bh.S.aC != 0)
      {
        switch (this.bh.cZ.eO)
        {
        case 0: 
        case 2: 
          if (this.bh.S.aC - this.bh.S.D > 0)
          {
            ag.hE = (short)(ag.hE + this.bh.S.D * a3.bp[this.bh.S.A]);
            as tmp9068_9065 = this.bh.S;
            tmp9068_9065.aC = ((short)(tmp9068_9065.aC - this.bh.S.D));
          }
          else
          {
            ag.hE = (short)(ag.hE + this.bh.S.aC * a3.bp[this.bh.S.A]);
            this.bh.S.aC = 0;
          }
          break;
        case 1: 
        case 3: 
          if (this.bh.S.aC - this.bh.S.D > 0)
          {
            ag.hF = (short)(ag.hF + this.bh.S.D * a3.bq[this.bh.S.A]);
            as tmp9217_9214 = this.bh.S;
            tmp9217_9214.aC = ((short)(tmp9217_9214.aC - this.bh.S.D));
          }
          else
          {
            ag.hF = (short)(ag.hF + this.bh.S.aC * a3.bq[this.bh.S.A]);
            this.bh.S.aC = 0;
          }
          break;
        }
        E();
      }
      else
      {
        this.bh.S.a();
      }
      break;
    case 80: 
      this.bh.ex.a();
      break;
    case -33: 
      this.bh.dJ.a();
      break;
    case 50: 
      this.jj.a();
      break;
    case 44: 
      this.bh.k("退出中,请稍候...");
      break;
    case 43: 
      E();
      if (this.bh.a(this.h7, gf, (byte)4, false))
      {
        if ((this.jdField_if == 2) && (this.h7.indexOf("疾冲") != -1))
        {
          this.je = 2;
          this.kc = 0;
          this.jdField_int = 0;
        }
        this.h7 = null;
        this.bh.S.a();
      }
      break;
    case 64: 
      this.bh.fj.setColor(h.b2[3][1]);
      this.bh.fj.fillRect(0, 0, h.dU, h.fp);
      if (this.bh.a(this.fS, gf, (byte)4, false)) {
        if (this.ns == 0) {
          this.jdField_do = 0;
        } else {
          try
          {
            this.bh.fG.platformRequest("http://gameta.cn/sot_bill_index.jsp?owner=1&user=" + this.bh.dv + "&zone=" + this.bh.fA);
            J();
          }
          catch (Exception localException) {}
        }
      }
      break;
    case 41: 
      this.bh.fj.setColor(h.b2[3][1]);
      this.bh.fj.fillRect(0, 0, h.dU, h.fp);
      if (this.bh.a("网络超时!请重新登录.", gf, (byte)4, false)) {
        if (this.gz) {
          this.bh.a(this, this.bh.s);
        } else {
          J();
        }
      }
      break;
    case 36: 
      a("需要休息?", "是", "否");
      break;
    case 37: 
      this.c3 = ((byte)(this.c3 + 1));
      if (this.c3 > 15)
      {
        this.c3 = 0;
        for (i12 = 0; i12 < h.dU; i12++) {
          this.bZ[i12] = -16777216;
        }
        this.bh.cZ.N();
        this.bh.cZ.hh = a3.jdMethod_new(ag.g2, a.t);
        this.bh.cZ.d();
        this.bh.cZ.jdField_try = 2;
        return;
      }
      for (i12 = 0; i12 < h.dU; i12++) {
        this.bZ[i12] += 285212672;
      }
      this.bh.a(this.bZ, 0, 0, h.dU, h.fp);
      break;
    case 38: 
      E();
      this.c3 = ((byte)(this.c3 + 1));
      if (this.c3 > 6)
      {
        this.jdField_do = 0;
        this.bZ = null;
        return;
      }
      for (i12 = 0; i12 < h.dU; i12++) {
        this.bZ[i12] -= 570425344;
      }
      this.bh.a(this.bZ, 0, 0, h.dU, h.fp);
      break;
    case 20: 
      this.g7.jdMethod_if();
      break;
    case 19: 
      E();
      this.bh.fj.setColor(16777215);
      this.bh.fj.fillRect(0, h.fp / 2, h.dU, 20);
      this.bh.fj.setColor(0);
      this.bh.fj.drawString("任务失败", h.dU / 2, h.fp / 2 + 1, 17);
      break;
    case 15: 
      this.md.jdMethod_for();
      break;
    case -11: 
    case 123: 
      E();
      this.bh.c();
      break;
    case 25: 
      E();
      this.eZ.a();
      this.bh.a(72, 0, this.gd, b2);
      break;
    case 13: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.eZ.a();
      if ((this.mz == 0) && ((this.bh.cZ.a((byte)36) > 0) || (this.gn != null))) {
        this.bh.x();
      }
      this.bh.c();
      break;
    case 5: 
      if (this.j0 == 0)
      {
        this.bh.k(this.kh);
      }
      else
      {
        E();
        this.bh.a(this.kh, -1, (byte)4, false);
      }
      if (!this.j5)
      {
        this.ca = -1;
        this.gR = 0;
        this.j5 = true;
        if ((h.dc) && (this.bh.F(this.jdField_if) > -1))
        {
          this.jl = true;
        }
        else if (this.bh.c(this.jdField_if))
        {
          this.mY = true;
          this.jl = true;
        }
        i12 = this.bh.A(this.jdField_if);
        if ((i12 != -1) && (this.bh.d8[this.jdField_if] == i12))
        {
          this.bh.am = this.bh.jdMethod_else(this.jdField_if);
          if (this.bh.am != -1)
          {
            //读入地图存档
            this.lR = this.bh.i(this.bh.am);
            //如果存档数据不为空 并且 可能是验证存档
            if ((this.lR != null) && (q.a(this.lR, 0, this.lR.length) == this.bh.P(this.jdField_if))) {
              this.bo = true;
            } else {
              this.lR = null;
            }
          }
        }
        if (this.jdField_if < 4)
        {
          DataInputStream localDataInputStream = new DataInputStream(getClass().getResourceAsStream("scene" + this.jdField_if + ".pak"));
          a(2508, 0, localDataInputStream);
        }
        else
        {
          if (this.jl)
          {
            if ((this.bo) && (!this.bh.d7))
            {
              this.ca = 0;
            }
            else
            {
              this.bo = false;
              this.lR = null;
              if ((this.l0 = a(this.jdField_if))) {
                this.ca = 5;
              } else {
                this.ca = 2;
              }
            }
          }
          else if (this.bo) {
            this.ca = 3;
          } else if ((this.l0 = a(this.jdField_if))) {
            this.ca = 4;
          } else {
            this.ca = 1;
          }
          this.bh.x(this.ca);
        }
      }
      else
      {
        this.gR += 1;
        if (this.gR > 120000 / h.bn)
        {
          gf = 0;
          this.jdField_int = 0;
          this.gz = false;
          this.jdField_do = 41;
          return;
        }
        if ((this.ca == 0) && (!this.bh.d7))
        {
          this.bh.d7 = true;
          a(2508, 0, null);
        }
        if (this.jdField_for) {
          jdMethod_int((byte)0);
        }
      }
      break;
    case 4: 
      break;
    case 0: 
      if ((h.cz) && (this.jdField_if == 1))
      {
        if (this.bh.aG.jdMethod_int(1002))
        {
          this.bh.aG.jdMethod_if("");
          this.bh.aG.jdMethod_if("");
          this.bh.aG.jdMethod_if("");
          this.bh.aG.jdMethod_do(0);
          this.bh.aG.jdMethod_do(0);
          this.bh.aG.a(Long.parseLong("13000000000"));
          this.bh.aG.jdMethod_if("getInitName");
          this.bh.aG.jdMethod_if();
        }
        this.jdField_do = 21;
        Display.getDisplay(this.bh.fG).setCurrent(this.bh);
        return;
      }
      synchronized (this.hV)
      {
        if ((!this.hV.isEmpty()) && (!this.bh.cZ.hU))
        {
          this.jK = ((String)this.hV.firstElement());
          this.hV.removeElementAt(0);
          gf = 0;
          this.jdField_do = 73;
          return;
        }
      }
      if (this.nh)
      {
        this.nh = false;
        gf = 0;
        this.jdField_do = -104;
        return;
      }
      if (!this.ho)
      {
        this.ho = true;
        gf = 0;
        this.jdField_do = 65;
      }
      if (this.bh.bq)
      {
        this.bh.dL = true;
        this.bh.bq = false;
        gf = 0;
        this.e3 = 0;
        this.jdField_do = -124;
        return;
      }
      if ((h.dc) && (!this.bh.q) && (this.jdField_int % 10 == 0) && (this.bh.dM == null)) {
        this.bh.S();
      }
      if ((this.bh.cZ.a4 != 13) && (this.bh.cZ.a4 != 14) && (this.bh.cZ.a4 != 15) && (this.bh.cZ.a4 != 16) && (!this.bh.cZ.eT) && (!this.bh.cZ.fE) && (!this.bh.cZ.hv) && (this.jdField_int % a.T == 0)) {
        this.bh.cZ.A();
      }
      o();
      if ((this.jdField_do == 0) && (this.jB != -1) && (!this.eL))
      {
        this.eL = true;
        this.bh.S.a(this.jB, this);
      }
      else if (this.jdField_if == 2)
      {
        if (this.jdField_int % 200 == 0) {
          if (this.je == 1) {
            jdMethod_do("按住确认键或数字5键发动连续攻击，点击数字1、3键使用技能.");
          } else if (this.je == 2) {
            jdMethod_do("向同一个方向快速点击两次方向键启动疾冲.");
          }
        }
        if (this.je == 2)
        {
          int i13 = 5;
          i14 = 30;
          this.bh.fj.setColor(15724527);
          this.bh.fj.drawString("完成", i13, i14, 20);
          i13 = (short)(i13 + (h.eA * 2 + 1));
          this.bh.fj.setColor(16711680);
          this.bh.fj.drawString("" + this.kc, i13, i14, 20);
          i13 = (short)(i13 + (h.dA.stringWidth("" + this.kc) + 1));
          this.bh.fj.setColor(15724527);
          this.bh.fj.drawString("次", i13, i14, 20);
        }
      }
      break;
    case 122: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.bh.F();
      this.bh.jdMethod_do(true);
      this.bh.jdMethod_if(true);
      this.bh.x();
      this.bh.c();
      break;
    case 127: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.bh.F();
      this.bh.jdMethod_do(true);
      this.bh.jdMethod_for(true);
      this.bh.x();
      this.bh.c();
      break;
    case 56: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.bh.F();
      this.bh.jdMethod_do(true);
      this.bh.jdMethod_int(true);
      this.bh.x();
      this.bh.c();
      break;
    case 1: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.bh.F();
      this.bh.jdMethod_do(false);
      this.bh.x();
      this.bh.c();
      break;
    case 2: 
      E();
      this.bh.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.bh.F();
      this.bh.jdMethod_do(true);
      if ((this.bh.cZ.gE) && (this.fQ == 2) && (this.f3 == 1)) {
        this.bh.jdMethod_int(false);
      }
      if ((this.fQ == 2) && (this.f3 == 2)) {
        this.bh.jdMethod_if(false);
      }
      if ((this.fQ == 2) && (this.f3 == 5)) {
        this.bh.jdMethod_for(false);
      }
      this.bh.x();
      this.bh.c();
    }
    if (((this.jdField_do != 20) && (this.jdField_do != 5)) || ((this.jdField_do == 5) && (this.j0 == 1)))
    {
      this.bh.h();
      this.bh.k();
    }
    if (this.lm)
    {
      this.ja += 1;
      if (this.ja >= 40000 / h.bn)
      {
        this.bh.a(this, this.bh.s);
        this.lm = false;
        return;
      }
    }
    if (0 == this.jdField_int % 40)
    {
      if (this.lm) {
        return;
      }
      if ((this.jdField_do != 5) && (this.jdField_if > 2))
      {
        this.gO = this.jdField_if;
        if (this.bh.aG.jdMethod_int(2507))
        {
          j = 0;
          if (this.bh.cZ.jdMethod_else()) {
            j = (short)(j | 0x1);
          }
          if (this.bh.cZ.a8) {
            j = (short)(j | 0x8);
          }
          if (this.bh.cZ.dU) {
            j = (short)(j | 0x10);
          }
          if ((this.bh.cZ.fL >= 0) && (this.bh.cZ.fj == 17)) {
            j = (short)(j | 0x20);
          }
          if (this.bh.cZ.he) {
            j = (short)(j | 0x40);
          }
          if ((this.bh.fI) || (this.bh.cZ.he)) {
            j = (short)(j | 0x80);
          }
          if (this.e7) {
            j = (short)(j | 0x100);
          }
          if (this.ki) {
            j = (short)(j | 0x200);
          }
          if ((this.bh.cZ.a8) && (this.bh.cZ.d == 1)) {
            j = (short)(j | 0x400);
          }
          this.bh.aG.jdMethod_new(j);
          if (dZ == 0)
          {
            if (dD == 2) {
              this.bh.aG.jdMethod_do(1);
            } else if (dD == 4) {
              this.bh.aG.jdMethod_do(0);
            } else {
              this.bh.aG.jdMethod_do(this.bh.cv == 2 ? 1 : 0);
            }
          }
          else {
            this.bh.aG.jdMethod_do(0);
          }
          this.bh.aG.jdMethod_do(this.bh.b3);
          if (this.bh.cZ.gR != null)
          {
            this.bh.aG.jdMethod_do(this.bh.jdMethod_if(this.bh.cZ.gR));
            this.bh.aG.jdMethod_if(this.bh.cZ.gR.O);
          }
          else
          {
            this.bh.aG.jdMethod_do(-1);
          }
          this.bh.aG.jdMethod_if();
        }
      }
    }
    if (this.bh.cZ.gE) {
      if ((this.jdField_int % (h.ff ? 100 : 100) == 0) && (this.bh.aG.jdMethod_int(3505)))
      {
        this.bh.aG.jdMethod_for(this.bh.cZ.gz);
        this.bh.aG.jdMethod_if();
      }
    }
    if (this.jdField_if > 2) {
      this.b4 += 1;
    }
    if (this.b4 > 8000)
    {
      this.jdField_int = 0;
      gf = 0;
      this.gz = true;
      this.jdField_do = 41;
      return;
    }
    for (int j = 0; j < this.bh.dS.length; j = (byte)(j + 1)) {
      this.bh.c0.a(this.bh.dS[j]);
    }
  }
  
  public void v()
  {
    I();
  }
  
  public void a(int paramInt)
  {
    this.bh.B.a(paramInt, false);
    switch (this.jdField_do)
    {
    case -5: 
    case 26: 
      t();
      break;
    case 0: 
      jdMethod_int(paramInt);
      break;
    case 15: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
        this.b1 = false;
      }
      break;
    }
  }
  
  public void a(h paramh)
  {
    if (h.a9 == 0)
    {
      lQ = 6;
      kj = 4;
      f5 = 128;
      l7 = 128;
    }
    else
    {
      lQ = 6;
      kj = 8;
      f5 = 128;
      l7 = 203;
    }
    this.bh = paramh;
    int i;
    if (this.bh.c0 == null)
    {
      this.bh.c0 = new x(this.bh);
      this.bh.c0.a("/pet.dat");
      this.bh.a2 = this.bh.jdMethod_goto("/pet.yy");
      this.bh.dS = new int[this.bh.c0.jdField_try.length][5];
      for (i = 0; i < this.bh.dS.length; i = (byte)(i + 1)) {
        this.bh.c0.a(i, 0, this.bh.dS[i]);
      }
    }
    gf = 0;
    this.bh.jdMethod_char();
    x();
    this.gk = a3.jdMethod_new(0, a.C);
    this.k5 = a3.jdMethod_new(0, a.C);
    this.k3 = a3.jdMethod_new(0, a.C);
    this.er = -1;
    this.da = -1;
    this.fm = -1;
    this.jdField_new = false;
    this.eL = false;
    this.j5 = false;
    this.jl = false;
    this.bo = false;
    this.l0 = false;
    this.lR = null;
    this.bh.cZ.gV = null;
    this.bh.cZ.ep = null;
    this.bh.cZ.g1 = null;
    ar.dg = -1;
    this.iJ = false;
    this.kp = 0;
    this.mY = false;
    this.je = 1;
    this.ei = false;
    this.lm = false;
    this.gR = 0;
    this.dl = false;
    this.jdField_for = false;
    this.kV = true;
    this.bh.cZ.a8 = false;
    this.bh.cZ.d();
    this.bh.cZ.jdField_try = 2;
    if (this.hO != null) {
      this.kh = this.hO;
    } else {
      this.kh = "载入中...";
    }
    this.j0 = 0;
    this.jdField_do = 5;
    if (this.dH == null)
    {
      this.dH = new int[h.dU];
      for (i = 0; i < h.dU; i++) {
        this.dH[i] = -1441254842;
      }
    }
    this.il = new int[5];
    this.bh.b0.a(58, 0, this.il);
    this.bh.cZ.hr = true;
  }
  
  public void a()
  {
    this.fu.clear();
    this.bh.i.jdMethod_if();
    this.bD = null;
    this.bh.E();
    this.bh.jdMethod_byte();
    ar.s();
    this.bh.dq = 0;
    this.bh.cY[0] = false;
    this.bh.cY[1] = false;
    this.bh.S.aJ = ((byte[][])null);
    for (int i = 1; i >= 0; i--) {
      if (this.bh.aH[i] != null) {
        this.bh.aH[i] = null;
      }
    }
    if (this.bh.cl != null) {
      for (i = 0; i < this.bh.cl.length; i = (byte)(i + 1)) {
        this.bh.cl[i] = null;
      }
    }
    g();
    ar.l();
    if (this.mN != null)
    {
      for (i = 0; i < this.mN.length; i = (byte)(i + 1)) {
        this.mN[i] = null;
      }
      this.mN = null;
    }
    this.bh.bV = null;
    this.bh.aH[1] = null;
    this.bh.fJ = null;
    this.kT = 0;
    Runtime.getRuntime().gc();
  }
  
  public void r()
  {
    for (int i = 0; i < this.li.length; i = (byte)(i + 1))
    {
      this.li[i].gq = true;
      this.li[i].eN = -1;
      this.li[i].eB = null;
    }
  }
  
  public void jdMethod_null()
  {
    if (this.bh.fU > 0)
    {
      jS = new ar[this.bh.fU];
      int j;
      for (int i = 0; i < jS.length; j = (byte)(i + 1))
      {
        jS[i] = new ar(this.bh, i, i >= jS.length - 2);
        jS[i].p();
      }
      C();
    }
  }
  
  public void C()
  {
    try
    {
      if ((this.jdField_if > 3) && (jS != null) && (dD == 1) && (this.bh.aG.jdMethod_int(1005)))
      {
        this.bh.aG.jdMethod_do(6);
        this.bh.aG.jdMethod_new(this.jdField_if);
        this.bh.aG.jdMethod_do(this.bh.fU);
        for (int i = 0; i < jS.length; i = (byte)(i + 1)) {
          if (jS[i] == null)
          {
            this.bh.aG.jdMethod_do(-1);
          }
          else
          {
            this.bh.aG.jdMethod_do(jS[i].df ? 1 : 0);
            this.bh.aG.jdMethod_do(jS[i].bz ? 1 : 0);
            this.bh.aG.jdMethod_new(jS[i].aP);
            this.bh.aG.jdMethod_new(jS[i].aM);
          }
        }
        this.bh.aG.jdMethod_if();
      }
    }
    catch (Exception localException) {}
  }
  
  public void g()
  {
    if (jS != null) {
      for (int i = 0; i < jS.length; i++) {
        if (jS[i] != null) {
          jS[i] = null;
        }
      }
    }
    jS = null;
  }
  
  public void j()
  {
    this.jdField_if = this.cJ;
    this.a = this.hv;
    this.bh.a(this, this);
  }
  
  public int jdMethod_for(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    if (paramInt1 >= this.bh.ad) {
      paramInt1 = this.bh.ad - 1;
    }
    if (paramInt2 >= this.bh.dz) {
      paramInt2 = this.bh.dz - 1;
    }
    return paramInt1 / h.u + paramInt2 / h.b8 * this.bh.w;
  }
  
  public boolean jdMethod_if(String paramString)
  {
    if (this.fr == null) {
      return false;
    }
    try
    {
      synchronized (this.fr)
      {
        for (int i = 0; i < this.fr.length; i++) {
          if (this.fr[i].equals(paramString)) {
            return true;
          }
        }
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  public void k()
  {
    this.bh.N();
    this.bh.jdMethod_if(this.bh.aH[0]);
    if ((!this.ki) && (!this.e7)) {
      for (int i = 0; i < 4; i++) {
        if (h.void[i] != -1)
        {
          int j = h.u * (h.void[i] % this.bh.w);
          int k = h.b8 * (h.void[i] / this.bh.w);
          if ((j < ag.hF + h.dU) && (j + 24 > ag.hF) && (k < ag.hE + h.fp) && (k + 19 > ag.hE))
          {
            this.bh.a(j - ag.hF, k - ag.hE, 12, 9, 12 * (this.jdField_int / 3 % 3), 0, this.bh.aH[9], 0);
            this.bh.a(j - ag.hF + 12, k - ag.hE, 12, 9, 12 * (this.jdField_int / 3 % 3), 0, this.bh.aH[9], 2);
            this.bh.a(j - ag.hF, k - ag.hE + 9, 12, 9, 12 * (this.jdField_int / 3 % 3), 0, this.bh.aH[9], 1);
            this.bh.a(j - ag.hF + 12, k - ag.hE + 9, 12, 9, 12 * (this.jdField_int / 3 % 3), 0, this.bh.aH[9], 3);
          }
        }
      }
    }
  }
  
  public void o()
  {
    this.bh.cZ.jdMethod_case();
    k();
    this.bh.i.jdMethod_do();
    int i;
    if (this.ki)
    {
      for (i = 0; i < this.kT; i = (byte)(i + 1)) {
        hm[i].jdMethod_case();
      }
      for (i = 0; i < this.kT; i = (byte)(i + 1)) {
        if (hm[i].aM <= this.bh.cZ.aM)
        {
          hm[i].jdMethod_char();
          hm[i].a(this.bh);
        }
      }
    }
    if ((!this.ki) && (this.bD != null))
    {
      this.bD.jdMethod_case();
      if (this.bD.aM <= this.bh.cZ.aM)
      {
        this.bD.jdMethod_char();
        this.bD.a(this.bh);
      }
    }
    if ((dD != 0) && (!this.ki) && (!this.e7) && ((dD != 2) || (dZ != 1) || (this.bh.cZ.gE)) && (jS != null)) {
      for (i = 0; i < jS.length; i = (byte)(i + 1)) {
        if ((jS[i] != null) && (jS[i].aM <= this.bh.cZ.aM))
        {
          jS[i].jdMethod_case();
          jS[i].jdMethod_char();
        }
      }
    }
    if ((this.mN != null) && (!this.ki) && (!this.e7)) {
      for (i = 0; i < this.mN.length; i++) {
        if (this.mN[i].jdField_new <= this.bh.cZ.aM) {
          this.bh.a(this.mN[i]);
        }
      }
    }
    this.bh.cZ.jdMethod_char();
    this.bh.jdMethod_null();
    if (this.ki) {
      for (i = 0; i < this.kT; i = (byte)(i + 1)) {
        if (hm[i].aM > this.bh.cZ.aM)
        {
          hm[i].jdMethod_char();
          hm[i].a(this.bh);
        }
      }
    }
    if ((!this.ki) && (this.bD != null) && (this.bD.aM > this.bh.cZ.aM))
    {
      this.bD.jdMethod_char();
      this.bD.a(this.bh);
    }
    if ((dD != 0) && (!this.ki) && (!this.e7) && ((dD != 2) || (dZ != 1) || (this.bh.cZ.gE)) && (jS != null)) {
      for (i = 0; i < jS.length; i = (byte)(i + 1)) {
        if ((jS[i] != null) && (jS[i].aM > this.bh.cZ.aM))
        {
          jS[i].jdMethod_case();
          jS[i].jdMethod_char();
        }
      }
    }
    if ((this.mN != null) && (!this.ki) && (!this.e7)) {
      for (i = 0; i < this.mN.length; i++) {
        if (this.mN[i].jdField_new > this.bh.cZ.aM) {
          this.bh.a(this.mN[i]);
        }
      }
    }
    if ((this.jdField_if > 2) && (!this.ki) && (!this.e7))
    {
      e();
      P();
      for (i = 0; i < this.li.length; i = (byte)(i + 1)) {
        if (!this.li[i].gq)
        {
          this.li[i].jdMethod_case();
          this.li[i].jdMethod_char();
          this.li[i].a(this.bh);
        }
      }
    }
    if (this.bh.cZ.a4 == 14) {
      this.bh.cZ.C();
    }
    this.bh.a();
    this.bh.q();
    if (this.bh.cZ.a8) {
      a(this.bh.cZ.aP, this.bh.cZ.aM, this.bh.cZ.d);
    }
    jdMethod_void();
    this.bh.cZ.a(this.bh);
    this.bh.C();
    this.bh.R();
    jdMethod_long();
    if (this.ki) {
      f();
    }
    if (this.e7) {
      i();
    } else if (this.bh.jdMethod_new((byte)0)) {
      this.bh.u();
    }
    if ((this.bh.cZ.a4 != 1) && (this.bh.cZ.a4 != 0)) {
      return;
    }
    this.bh.S.jdMethod_if(jdMethod_for(this.bh.cZ.aP + 10, this.bh.cZ.aM + this.bh.cZ.aI + 1), this);
  }
  
  public void jdMethod_void()
  {
    if (this.bh.cZ.gE)
    {
      int i = 2;
      int j = 22;
      int k = 24;
      int m = 25;
      int n = 3;
      if (h.a9 == 0)
      {
        k = 3;
      }
      else
      {
        k = (short)h.eA;
        j = (short)(j + h.eA);
      }
      if (this.g6 != null) {
        for (int i10 = 0; i10 < this.g6.length; i10 = (byte)(i10 + 1))
        {
          if ((this.g6[i10] != null) && (h.a9 != 0) && (this.bh.dT != 1)) {
            this.bh.a(this.g6[i10], i, j, 36, h.b2[2][0]);
          }
          if ((i10 == 0) && (!this.bh.cZ.dU)) {
            this.bh.a(i, j - 12, 12, 12, 132, 0, this.bh.aH[10], 0);
          }
          this.bh.a(i, j, m, n, h.b2[4][0], 100L, this.cl[i10]);
          this.bh.a(i, j + n, m, n, h.b2[3][0], 100L, this.no[i10]);
          j = (short)(j + (n * 2 + k));
        }
      }
    }
  }
  
  public void i()
  {
    if (!this.e7) {
      return;
    }
    int i = h.fp - h.eA * 2 - 12;
    int j = h.dU - 10;
    this.bh.a((h.dU - j) / 2, i + 8, j, 3, 15724527, this.ly, this.ly - this.eE);
  }
  
  public void f()
  {
    if (!this.ki) {
      return;
    }
    int i = h.fp - h.eA * 2 - 12;
    int j = h.dU - 10;
    int k = h.dU - 30 - 12;
    this.bh.a((h.dU - k) / 4 - 7, i, this.cf, 20);
    this.bh.a(h.dU - (h.dU - k) / 4 - 7, i, this.jL, 20);
    int m = (h.dU - k) / 2;
    this.bh.fj.setColor(h.b2[5][1]);
    this.bh.fj.fillRect(m, i, k, 5);
    this.bh.fj.setColor(h.b2[3][0]);
    this.bh.fj.fillRect(m, i, k / 2 * this.cc / 100, 5);
    this.bh.fj.setColor(h.b2[4][0]);
    this.bh.fj.fillRect(m + k - k / 2 * this.g0 / 100, i, k / 2 * this.g0 / 100, 5);
    this.bh.fj.setColor(0);
    this.bh.fj.drawRect(m, i, k / 2, 5);
    this.bh.fj.drawRect(m, i, k, 5);
    this.bh.a((h.dU - j) / 2, i + 8, j, 3, 15724527, this.cN, this.cN - this.hL);
  }
  
  public void jdMethod_long()
  {
    if (this.bh.dT != 1)
    {
      int i = 24;
      int j = 18;
      int k = 12;
      int m = h.fp - j - 1;
      int n = 3;
      i = 24;
      j = 18;
      k = 45;
      m = h.fp - 2 * h.eA - 10 - j - 1;
      n = (h.dU - 2 * k - i * 4) / 4;
      k += n / 2;
      for (int i10 = 0; i10 < ag.f7; i10 = (byte)(i10 + 1))
      {
        this.bh.fj.setColor(h.b2[0][1]);
        this.bh.fj.drawRect(k + i10 * (i + n) - n / 2, m - 8, i + n, j + 16);
        this.bh.fj.setColor(h.b2[2][1]);
        this.bh.fj.fillRect(k + i10 * (i + n), m, i, j);
        this.bh.fj.setColor(0);
        this.bh.fj.drawRect(k + i10 * (i + n) + 1, m + 1, i - 1, j - 1);
        this.bh.fj.setColor(h.b2[5][1]);
        this.bh.fj.drawRect(k + i10 * (i + n), m, i, j);
        int i11 = 0;
        switch (i10)
        {
        case 0: 
          i11 = 1;
          break;
        case 1: 
          i11 = 3;
          break;
        case 2: 
          i11 = 7;
          break;
        case 3: 
          i11 = 9;
        }
        a(k + i10 * (i + n) + 2, m + 5, i11);
        this.bh.a(k + i10 * (i + n) + 8, m + 2, 15, 15, 60, 0, this.bh.fz, 0);
        if (this.bh.cZ.dF[i10][0] >= 0) {
          if (this.bh.cZ.dF[i10][1] == 0)
          {
            this.bh.jdMethod_if(k + i10 * (i + n) + 8, m + 2, (byte)this.bh.cZ.dF[i10][0]);
          }
          else
          {
            this.bh.a(k + i10 * (i + n) + 8, m + 2, this.bh.cZ.dF[i10][0]);
            int i12 = this.bh.cZ.jdMethod_if(this.bh.cZ.dF[i10][0]);
            this.bh.a(k + i10 * (i + n) + 8 + 15, m + 2 + 15, i12, 40);
          }
        }
      }
      if ((this.jdField_if > 2) && (!this.ki))
      {
        this.bh.a("菜单", 2, 25 + (this.bh.eC ? h.eA : 0), 0, h.b2[1][0]);
        this.bh.a("聊天", 2, m, 0, h.b2[1][0]);
        this.bh.a("记录", h.dU - h.dA.stringWidth("记录") - 2, m, 0, h.b2[1][0]);
        this.bh.a("附近玩家", h.dU - h.dA.stringWidth("附近玩家"), this.bh.bO * 2 + 3 + (this.bh.eC ? h.eA : 0), 0, h.b2[1][0]);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.bh.a(paramInt1, paramInt2, 5, 7, (17 + paramInt3 / 3) * 5, 0, this.bh.aH[5], 0);
  }
  
  public boolean c()
  {
    if (((this.bh.cZ.he) && (dD != 0)) || ((dZ == 1) && (this.bh.cZ.gE)) || (this.ki)) {
      return true;
    }
    if (dD == 2) {
      return true;
    }
    return dD == 4;
  }
  
  public void jdMethod_for(int paramInt)
  {
    if ((this.bh.fs == 0) && (this.bh.cZ.ie))
    {
      this.bh.cZ.ie = false;
      this.bh.cZ.dv = false;
      if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3) && (paramInt != 4)) {
        return;
      }
      this.bh.cZ.d();
    }
    else if ((this.bh.cZ.hU) || (this.bh.cZ.a4 == 112))
    {
      return;
    }
    switch (paramInt)
    {
    case 49: 
      this.bh.cZ.jdMethod_if(paramInt, true);
      break;
    case 51: 
      this.bh.cZ.jdMethod_if(paramInt, false);
      break;
    case 55: 
      this.bh.cZ.jdMethod_if(paramInt, true);
      break;
    case 57: 
      this.bh.cZ.jdMethod_if(paramInt, false);
      break;
    case 35: 
      if (this.e7) {
        return;
      }
      jdMethod_try((byte)30);
      break;
    case 42: 
      jdMethod_for(false);
      break;
    case 48: 
      if (this.e7) {
        return;
      }
      if (c()) {
        return;
      }
      jdMethod_try((byte)33);
      break;
    case 6: 
      if (this.jdField_if <= 2) {
        return;
      }
      if (this.bh.cZ.a4 == 112) {
        return;
      }
      if ((this.ki) || (this.e7)) {
        return;
      }
      if (this.bh.cZ.jdMethod_else()) {
        return;
      }
      if (c()) {
        return;
      }
      this.bh.cZ.d();
      this.fQ = 0;
      this.f3 = 0;
      this.jdField_do = 1;
      break;
    case 7: 
      if (this.jdField_if <= 2) {
        return;
      }
      if (this.e7) {
        return;
      }
      if (c()) {
        return;
      }
      jdMethod_try((byte)31);
      break;
    case 1: 
      this.bh.cZ.jdMethod_long((byte)0);
      break;
    case 2: 
      this.bh.cZ.jdMethod_long((byte)2);
      break;
    case 3: 
      this.bh.cZ.jdMethod_long((byte)3);
      break;
    case 4: 
      this.bh.cZ.jdMethod_long((byte)1);
      break;
    case 5: 
      if (this.bh.cZ.a8) {
        return;
      }
      this.bh.cZ.S();
    }
  }
  
  public void jdMethod_int(int paramInt)
  {
    switch (this.jdField_do)
    {
    case 0: 
      switch (paramInt)
      {
      case 5: 
        this.bh.cZ.ah();
        break;
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.bh.cZ.ae();
        break;
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        if (this.bh.cZ.jdMethod_else()) {
          return;
        }
        if ((this.bh.cZ.dZ) && (paramInt == this.bh.cZ.dI)) {
          this.bh.cZ.a(this.bh.cZ);
        }
        break;
      }
      break;
    }
  }
  
  public void l()
  {
    this.g7 = new s(this.bh);
    this.jdField_do = 20;
  }
  
  public void H()
  {
    if (this.bh.cZ.a8)
    {
      a("摆摊中不能复位.", (short)0, false, 9999);
      return;
    }
    short s1 = (short)(this.bh.fi % this.bh.w * h.u);
    short s2 = (short)(this.bh.fi / this.bh.w * h.b8);
    this.bh.cZ.jdMethod_do(s1, s2);
    h.f1 = true;
    this.bh.N();
    this.jdField_do = 0;
  }
  
  public void jdMethod_do(int paramInt1, int paramInt2)
  {
    if ((this.el) && (this.jdField_int / 10 % 2 == 0)) {
      this.bh.a(paramInt1, paramInt2, 12, 12, 216, 0, this.bh.aH[10], 0);
    }
  }
  
  public void G()
  {
    if (this.jdField_if <= 2) {
      return;
    }
    this.md = new ae(this.bh);
    this.md.a(0);
    this.el = false;
    this.lC = new boolean[5];
    this.jdField_do = 15;
  }
  
  public void d()
  {
    this.eZ = new t(this.bh);
    this.mz = 0;
    this.e3 = -1;
    if (this.bh.cZ.a((byte)36) > 0) {
      this.e3 = 1;
    } else if (this.gn != null) {
      this.e3 = 0;
    }
    this.jdField_do = 13;
  }
  
  public void jdMethod_for(boolean paramBoolean)
  {
    if (this.jdField_if <= 2) {
      return;
    }
    if (this.e7) {
      return;
    }
    if (this.bh.cZ.jdMethod_else()) {
      return;
    }
    if (c()) {
      return;
    }
    this.mc = paramBoolean;
    this.bh.i.jdMethod_for();
    this.j1 = 16;
    this.jdField_do = 26;
    Vector[] arrayOfVector = this.bh.i.a(!this.mc);
    this.ip = arrayOfVector[0];
    this.bS = arrayOfVector[1];
  }
  
  public void w()
  {
    if (!this.bh.cZ.gE) {
      return;
    }
    this.bh.i.jdMethod_for();
    this.j1 = -17;
    if (this.bh.cZ.dU) {
      this.c9 = new String[] { "私聊", "踢出", "返回" };
    } else {
      this.c9 = new String[] { "私聊", "返回" };
    }
    this.ip.removeAllElements();
    for (int i = 0; i < this.g6.length; i = (byte)(i + 1)) {
      this.ip.addElement(this.g6[i]);
    }
    this.jdField_do = 26;
  }
  
  public void F()
  {
    this.bh.i.jdMethod_for();
    this.j1 = 104;
    this.jdField_do = 21;
    this.fj = 0;
    if (this.bh.aG.jdMethod_int(3710))
    {
      this.bh.aG.jdMethod_for(this.bh.cZ.fL);
      this.bh.aG.jdMethod_if();
    }
  }
  
  public void n()
  {
    this.bh.i.jdMethod_for();
    this.j1 = -109;
    this.c9 = new String[] { "私聊", "资料", "赠送", "返回" };
    this.jdField_do = 21;
    if (this.bh.aG.jdMethod_int(3560))
    {
      this.bh.aG.jdMethod_for(this.kk);
      this.bh.aG.jdMethod_if();
    }
  }
  
  public void q()
  {
    this.bh.i.jdMethod_for();
    this.j1 = -120;
    this.jdField_do = 21;
    if (this.bh.aG.jdMethod_int(6721))
    {
      this.bh.aG.jdMethod_do(1);
      this.bh.aG.jdMethod_if();
    }
  }
  
  public void b()
  {
    if (this.bh.aG.jdMethod_int(6720))
    {
      this.bh.aG.jdMethod_do(1);
      this.bh.aG.jdMethod_new(this.hP);
      this.bh.aG.jdMethod_if();
    }
    this.jdField_do = 21;
  }
  
  public void D()
  {
    this.bh.i.jdMethod_for();
    this.j1 = -108;
    this.c9 = new String[] { "私聊", "资料", "赠送", "返回" };
    this.jdField_do = 21;
    if (this.bh.aG.jdMethod_int(3560))
    {
      this.bh.aG.jdMethod_for(this.kk);
      this.bh.aG.jdMethod_if();
    }
  }
  
  public void jdMethod_new(boolean paramBoolean)
  {
    this.d0 = paramBoolean;
    this.bh.i.jdMethod_for();
    this.j1 = 14;
    this.c9 = new String[] { "出发", "返回" };
    this.ip.removeAllElements();
    this.bS.removeAllElements();
    for (int i = 0; i < h.eK.length - (this.d0 ? 0 : 1); i = (byte)(i + 1))
    {
      this.ip.addElement(h.eK[i]);
      this.bS.addElement(new Short((short)0));
      if (!this.d0) {
        for (int j = 0; j < this.bh.bR.d.size(); j = (byte)(j + 1))
        {
          ao localao = (ao)this.bh.bR.d.elementAt(j);
          if ((localao.j > 0) && (localao.jdField_long > 0) && (localao.j == h.es[i])) {
            this.bS.setElementAt(new Short((short)1), i);
          }
        }
      }
      if ((this.bh.cZ.a((byte)14) == 1) && (i == 0)) {
        break;
      }
    }
    this.jdField_do = 26;
  }
  
  public void a(byte paramByte1, byte paramByte2)
  {
    if (this.bh.aG.jdMethod_int(7102))
    {
      this.bh.aG.jdMethod_do(paramByte1);
      this.bh.aG.jdMethod_do(paramByte2);
      this.bh.aG.jdMethod_if();
    }
    this.jdField_do = 21;
  }
  
  public void jdMethod_for(byte paramByte)
  {
    if (this.bh.aG.jdMethod_int(7101))
    {
      this.bh.aG.jdMethod_do(paramByte);
      this.bh.aG.jdMethod_if();
    }
    this.jdField_do = 21;
  }
  
  public void jdMethod_do(short paramShort, boolean paramBoolean)
  {
    this.gL = paramBoolean;
    this.f2 = paramShort;
    this.bh.i.jdMethod_for();
    this.j1 = 28;
    if (paramBoolean) {
      this.c9 = new String[] { "选择", "返回" };
    } else {
      this.c9 = new String[] { "私聊", "资料", "赠送", "删除", "返回" };
    }
    this.ip.removeAllElements();
    this.bS.removeAllElements();
    this.gC = new byte[this.bG];
    this.i2 = new boolean[this.bG];
    for (int i = 0; i < this.bG; i = (byte)(i + 1))
    {
      this.ip.addElement(this.eA[i]);
      this.bS.addElement(new Short((short)this.cY[i]));
      this.gC[i] = this.eG[i];
      this.i2[i] = this.eg[i];
    }
    this.jdField_do = 26;
  }
  
  public void jdMethod_if(short paramShort, boolean paramBoolean)
  {
    this.gL = paramBoolean;
    this.bW = paramShort;
    this.j1 = 90;
    if (paramBoolean) {
      this.c9 = new String[] { "选择", "返回" };
    } else {
      this.c9 = new String[] { "解除", "返回" };
    }
    this.ip.removeAllElements();
    this.bS.removeAllElements();
    for (int i = 0; i < this.mR; i = (byte)(i + 1)) {
      this.ip.addElement(this.k4[i]);
    }
    this.bh.i.jdMethod_for();
    this.jdField_do = 26;
  }
  
  public void s()
  {
    this.bh.i.jdMethod_for();
    this.j1 = 29;
    this.c9 = new String[] { "批准", "拒绝", "返回" };
    this.jdField_do = 21;
    if (this.bh.aG.jdMethod_int(3500))
    {
      this.bh.aG.jdMethod_if(this.bh.cZ.O);
      this.bh.aG.jdMethod_if();
    }
  }
  
  public void jdMethod_do(byte paramByte)
  {
    this.bh.as = new aa(this.bh);
    this.dc = 0;
    this.bO = this.bh.cZ.a((byte)0);
    this.hB = paramByte;
    if (!this.bh.bR.a((byte)5)) {
      switch (paramByte)
      {
      case 0: 
        if (this.d4 != null)
        {
          this.bh.i.jdMethod_byte();
        }
        else
        {
          if (this.bh.aG.jdMethod_int(6331))
          {
            this.bh.aG.jdMethod_for(this.jdField_if);
            this.bh.aG.jdMethod_do(0);
            this.bh.aG.jdMethod_if();
          }
          this.jdField_int = 0;
          this.jdField_do = 3;
        }
        break;
      case 1: 
        this.bh.cZ.y();
        byte b = 0;
        short[] arrayOfShort1 = null;
        for (int i = 0; i < 2; i = (byte)(i + 1))
        {
          b = 0;
          for (j = 0; j < this.bh.cZ.gJ[0]; j = (byte)(j + 1)) {
            if (!h.o(this.bh.cZ.gw[0][j]))
            {
              if (i == 1) {
                arrayOfShort1[b] = this.bh.cZ.gw[0][j];
              }
              b = (byte)(b + 1);
            }
          }
          if (i == 0) {
            arrayOfShort1 = new short[b];
          }
        }
        this.bh.i.a(1, (byte)0, b, arrayOfShort1, new short[arrayOfShort1.length]);
        short[] arrayOfShort2 = new short[this.bh.cZ.gJ[0]];
        System.arraycopy(this.bh.cZ.gw[0], 0, arrayOfShort2, 0, this.bh.cZ.gJ[0]);
        this.bh.i.a(arrayOfShort2, true);
        for (int j = 0; j < this.bs[0]; j = (byte)(j + 1)) {
          this.lK[0][j] = (this.bh.L(this.nl[0][j]) / 2);
        }
        this.jdField_do = 95;
      }
    }
  }
  
  public void z()
  {
    if (!this.bh.cZ.a8)
    {
      if (this.bh.cZ.gJ[0] > 0)
      {
        this.bO = this.bh.cZ.a((byte)0);
        this.bh.cZ.y();
        byte b = 0;
        short[] arrayOfShort1 = null;
        for (int i = 0; i < 2; i = (byte)(i + 1))
        {
          b = 0;
          for (j = 0; j < this.bh.cZ.gJ[0]; j = (byte)(j + 1)) {
            if (!h.o(this.bh.cZ.gw[0][j]))
            {
              if (i == 1) {
                arrayOfShort1[b] = this.bh.cZ.gw[0][j];
              }
              b = (byte)(b + 1);
            }
          }
          if (i == 0) {
            arrayOfShort1 = new short[b];
          }
        }
        this.bh.i.a(1, (byte)0, b, arrayOfShort1, new short[arrayOfShort1.length]);
        short[] arrayOfShort2 = new short[this.bh.cZ.gJ[0]];
        System.arraycopy(this.bh.cZ.gw[0], 0, arrayOfShort2, 0, this.bh.cZ.gJ[0]);
        this.bh.i.a(arrayOfShort2, true);
        for (int j = 0; j < this.bs[0]; j = (byte)(j + 1)) {
          this.lK[0][j] = (this.bh.L(this.nl[0][j]) / 2);
        }
        this.jdField_do = 6;
      }
      else
      {
        this.lt = "背包里没有能卖的东西.";
        a(this.lt, (short)0, false, 9999);
      }
    }
    else
    {
      if ((this.bh.cZ.a8) && (this.bh.cZ.d != 0)) {
        return;
      }
      if (this.bh.aG.jdMethod_int(6784))
      {
        this.bh.aG.jdMethod_for(this.mw);
        this.bh.aG.jdMethod_if();
      }
      this.jdField_do = 21;
    }
  }
  
  public void a(String paramString, short paramShort, boolean paramBoolean, int paramInt)
  {
    this.eP = paramInt;
    gf = 0;
    this.lt = paramString;
    this.lb = paramShort;
    this.jdField_new = paramBoolean;
    this.jdField_int = 0;
    this.jdField_do = 98;
  }
  
  public void jdMethod_try(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      this.bh.br = null;
      this.bh.br = new ac(this.bh);
      this.jdField_do = 30;
      break;
    case 1: 
      this.e0 = new c(this.bh);
      this.jdField_do = 74;
      break;
    case 2: 
      if (this.bh.aG.jdMethod_int(1005))
      {
        this.bh.aG.jdMethod_do(2);
        this.bh.aG.jdMethod_if();
      }
      this.jdField_do = 21;
      break;
    case 3: 
      if (h.fh == 1)
      {
        a("该功能暂时关闭.", (short)0, false, 9999);
        return;
      }
      z();
      break;
    case 4: 
      this.jj = new n(this.bh);
      this.jdField_do = 50;
      break;
    case 5: 
      p();
      break;
    case 10: 
      this.bh.L();
      this.mz = 0;
      this.bf = 0;
      this.jdField_do = -34;
      break;
    case 12: 
      if (h.aw == 1)
      {
        a("该功能暂时关闭.", (short)0, false, 9999);
        return;
      }
      if (!this.bh.cZ.a8)
      {
        if (this.bh.jdField_try <= 0) {
          return;
        }
        int i = 0;
        for (int j = 0; j < this.bh.jdField_try; j = (byte)(j + 1)) {
          if (this.bh.b7[j].a((byte)12) == 0) {
            i = 1;
          }
        }
        if (i == 0)
        {
          a("没有可用于交易的宠物.(处于封印状态下的宠物才可交易)", (short)0, false, 9999);
        }
        else
        {
          this.bh.L();
          this.mz = 0;
          this.bf = 0;
          this.bh.ee = new int[this.bh.jdField_try];
          this.bh.f3 = new boolean[this.bh.jdField_try];
          this.bh.di = new j(this.bh);
          this.jdField_do = -58;
        }
      }
      else
      {
        if ((this.bh.cZ.a8) && (this.bh.cZ.d != 1)) {
          return;
        }
        if (this.bh.aG.jdMethod_int(4057))
        {
          this.bh.aG.jdMethod_for(this.mw);
          this.bh.aG.jdMethod_if();
        }
        this.jdField_do = 21;
      }
      break;
    case 20: 
      jdMethod_for(false);
      break;
    case 21: 
      if (!this.bh.cZ.gE)
      {
        a("你不在组队状态.", (short)0, false, 9999);
      }
      else
      {
        this.nd = 0;
        this.jdField_do = 56;
      }
      break;
    case 22: 
      this.l4 = 0;
      this.jdField_do = 122;
      break;
    case 23: 
      s();
      break;
    case 24: 
      jdMethod_for((byte)0);
      break;
    case 25: 
      this.kk = 0;
      this.jdField_do = 127;
      break;
    case 30: 
      if (this.jdField_if > 2) {
        this.bh.i.jdMethod_if(null, (byte)0);
      }
      break;
    case 31: 
      jdMethod_do((short)0, false);
      break;
    case 32: 
      jdMethod_if((short)0, false);
      break;
    case 33: 
      G();
      break;
    case 40: 
      this.bh.i.jdMethod_case(0);
      break;
    case 41: 
      this.bh.i.jdMethod_case(1);
      break;
    case 42: 
    case 50: 
      this.e3 = 0;
      this.bh.bv = new e(this.bh);
      this.bh.bv.jdField_do = 0;
      this.jdField_do = -36;
      break;
    case 51: 
      l();
      break;
    case 52: 
      H();
      break;
    case 53: 
      jdMethod_for((byte)1);
      break;
    case 54: 
      this.bh.i.jdMethod_if("系统", (byte)0);
      break;
    case 55: 
      if (this.bh.aG.jdMethod_int(1016))
      {
        this.bh.aG.jdMethod_new(this.jdField_if);
        this.bh.aG.jdMethod_if();
      }
      this.jdField_do = 21;
      break;
    case 60: 
      if (this.bh.aG.jdMethod_int(6718))
      {
        this.bh.aG.jdMethod_do(0);
        this.bh.aG.jdMethod_if();
      }
      this.jdField_do = 21;
      break;
    case 61: 
      if (!this.bh.cZ.g4)
      {
        this.bH = true;
        gf = 0;
        this.e3 = 0;
        this.jdField_do = -123;
      }
      else
      {
        q();
      }
      break;
    case 62: 
      a("如何申请VIP?\001 1.您可以通过主菜单->VIP->申请功能,使用星币,激活VIP特殊权限.(如果星币不足,可使用主菜单->系统->充值功能,进行充值.)\001 2.VIP特殊权限有三种激活方式,分别为10元/月,30元/6月,50元/12月,可任选其一进行激活.(激活的时间越久,所获得的优惠幅度越大.)\001 成为VIP有什么好处?\001 1.VIP用户可使用游戏币不限数量的购买商城中的任意商品.使您更加便捷的进行游戏.\001 2.VIP用户每次登陆根据离线时间可获得离线经验的奖励,助你快速升级.\001 3.VIP用户可获得独有的VIP图标,从而彰显你的尊贵.", (short)0, false, 9999);
    }
  }
  
  public void jdMethod_new(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 48: 
    case 49: 
    case 51: 
    case 55: 
    case 57: 
      int i = this.bh.jdMethod_do(paramInt, h.dh.length);
      if (i < 0) {
        return;
      }
      if (i > 0) {
        this.fQ = ((byte)i);
      }
      switch (this.fQ)
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
        this.f3 = 0;
        this.jdField_do = 2;
      }
      break;
    case 7: 
      this.jdField_do = 0;
      break;
    case 2: 
      this.fQ = ((byte)(this.fQ + 1));
      if (this.fQ == h.dh.length) {
        this.fQ = 0;
      }
      break;
    case 1: 
      this.fQ = ((byte)(this.fQ - 1));
      if (this.fQ < 0) {
        this.fQ = ((byte)(h.dh.length - 1));
      }
      break;
    }
  }
  
  public void A()
  {
    if (this.bh.aG.jdMethod_int(3507))
    {
      this.bh.aG.jdMethod_for(this.bh.cZ.gz);
      this.bh.aG.jdMethod_if(this.bh.cZ.O);
      this.bh.aG.jdMethod_if();
    }
    this.bh.dV = null;
    this.bh.jdField_else = 0;
    this.bh.cZ.gE = false;
    this.bh.cZ.dU = false;
  }
  
  public void jdMethod_try(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 7: 
      this.jdField_do = 1;
      break;
    case 1: 
      this.f3 = ((byte)(this.f3 - 1));
      if (this.f3 < 0) {
        this.f3 = ((byte)(h.cg[this.fQ].length - 1));
      }
      break;
    case 2: 
      this.f3 = ((byte)(this.f3 + 1));
      if (this.f3 > (byte)(h.cg[this.fQ].length - 1)) {
        this.f3 = 0;
      }
      break;
    case 5: 
    case 6: 
    case 48: 
    case 49: 
    case 51: 
    case 55: 
    case 57: 
      int i = this.bh.jdMethod_do(paramInt, h.cg[this.fQ].length);
      if (i < 0) {
        return;
      }
      if (i > 0) {
        this.f3 = ((byte)i);
      }
      if ((h.cz) && (this.fQ == 5)) {
        this.f3 = ((byte)(this.f3 + 1));
      }
      jdMethod_try((byte)(this.fQ * 10 + this.f3));
      break;
    case 4: 
      if (this.fQ == 2) {
        if ((this.f3 == 1) && (this.bh.cZ.gE))
        {
          this.nd = 0;
          this.jdField_do = 56;
        }
        else if (this.f3 == 2)
        {
          this.l4 = 0;
          this.jdField_do = 122;
        }
        else if (this.f3 == 5)
        {
          this.kk = 0;
          this.jdField_do = 127;
        }
      }
      break;
    }
  }
  
  public void I()
  {
    if (this.jdField_do != 0) {
      return;
    }
    if (this.jdField_if <= 3) {
      return;
    }
    int i;
    if (this.bh.aG.jdMethod_int(1018))
    {
      i = 1;
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      if ((a3.jdMethod_do(this.gk, a.C) == this.jdField_if) && (a3.jdMethod_do(this.k5, a.C) == this.bh.cZ.aP) && (a3.jdMethod_do(this.k3, a.C) == this.bh.cZ.aM)) {
        i = 0;
      }
      if (i != 0)
      {
        n = (byte)(n | 0x1);
        this.gk = a3.jdMethod_new(this.jdField_if, a.C);
        this.k5 = a3.jdMethod_new(this.bh.cZ.aP, a.C);
        this.k3 = a3.jdMethod_new(this.bh.cZ.aM, a.C);
      }
      if (this.bh.cZ.hv) {
        n = (byte)(n | 0x2);
      }
      if (this.er != this.bh.cZ.a((byte)16))
      {
        j = 1;
        n = (byte)(n | 0x4);
        this.er = this.bh.cZ.a((byte)16);
      }
      if (this.da != this.bh.cZ.a((byte)24))
      {
        k = 1;
        n = (byte)(n | 0x8);
        this.da = this.bh.cZ.a((byte)24);
      }
      if (this.fm != this.bh.cZ.a((byte)12))
      {
        m = 1;
        n = (byte)(n | 0x10);
        this.fm = this.bh.cZ.a((byte)12);
      }
      this.bh.aG.jdMethod_do(n);
      if (i != 0)
      {
        this.bh.aG.jdMethod_new(this.jdField_if);
        this.bh.aG.jdMethod_new(this.bh.cZ.aP);
        this.bh.aG.jdMethod_new(this.bh.cZ.aM);
      }
      if (j != 0) {
        this.bh.aG.jdMethod_for(this.bh.cZ.a((byte)16));
      }
      if (k != 0) {
        this.bh.aG.jdMethod_new(this.bh.cZ.a((byte)24));
      }
      if (m != 0) {
        this.bh.aG.jdMethod_new(this.bh.cZ.a((byte)12));
      }
      this.bh.aG.jdMethod_if();
    }
    if (this.bh.eO)
    {
      if (this.bh.aG.jdMethod_int(1019))
      {
        this.bh.aG.jdMethod_do(1);
        for (i = 0; i < this.bh.cZ.jdField_case.length; i = (byte)(i + 1)) {
          this.bh.aG.jdMethod_do(this.bh.cZ.jdField_case[i]);
        }
        for (i = 0; i < h.c7.length; i = (byte)(i + 1)) {
          this.bh.aG.jdMethod_do(h.c7[i] != 0 ? 1 : 0);
        }
        for (i = 0; i < this.bh.cZ.a7.length; i = (byte)(i + 1)) {
          this.bh.aG.jdMethod_new(this.bh.cZ.a7[i]);
        }
        this.bh.aG.jdMethod_new(this.bh.cZ.a(0));
        this.bh.aG.jdMethod_new(this.bh.cZ.a(1));
        this.bh.aG.jdMethod_new(this.bh.cZ.a(2));
        this.bh.aG.jdMethod_new(this.bh.cZ.a(3));
        this.bh.aG.jdMethod_do(this.bh.cZ.hP);
        this.bh.aG.jdMethod_do(this.bh.cZ.hO);
        for (i = 0; i < this.bh.cZ.hT.length; i = (byte)(i + 1)) {
          this.bh.aG.jdMethod_do(this.bh.cZ.hT[i]);
        }
        if (this.bh.cZ.gR != null)
        {
          this.bh.aG.jdMethod_do(1);
          this.bh.aG.jdMethod_for(this.bh.cZ.gR.a((byte)0));
          this.bh.aG.jdMethod_new(this.bh.cZ.gR.a((byte)28));
          this.bh.aG.jdMethod_new(this.bh.cZ.gR.a((byte)30));
          this.bh.aG.jdMethod_new(this.bh.cZ.gR.a((byte)32));
          this.bh.aG.jdMethod_new(this.bh.cZ.gR.a((byte)34));
          this.bh.aG.jdMethod_new(this.bh.a(this.bh.cZ.gR, 0));
          this.bh.aG.jdMethod_new(this.bh.a(this.bh.cZ.gR, 1));
          this.bh.aG.jdMethod_new(this.bh.a(this.bh.cZ.gR, 2));
          this.bh.aG.jdMethod_new(this.bh.a(this.bh.cZ.gR, 3));
        }
        else
        {
          this.bh.aG.jdMethod_do(0);
        }
        this.bh.aG.jdMethod_if();
      }
      this.bh.eO = false;
    }
  }
  
  public void jdMethod_do(String paramString)
  {
    synchronized (this.kP)
    {
      String str = "[" + b6[3] + "]" + "系统0:" + paramString;
      if (this.kP.size() > 2) {
        this.kP.insertElementAt(str, 1);
      } else {
        this.kP.addElement(str);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, DataInputStream paramDataInputStream)
  {
    ;
    this.b4 = 0;
    int i = 0;
    String str1 = null;
    try
    {
      if (paramInt2 == 1)
      {
        i = paramDataInputStream.readByte();
        str1 = paramDataInputStream.readUTF();
      }
      int n;
      int i13;
      Object localObject2;
      Object localObject1;
      int i18;
      int i19;
      int i20;
      int i25;
      int i28;
      short s8;
      byte b12;
      short s3;
      int i23;
      String str6;
      int i31;
      int i33;
      int i39;
      String str8;
      int i37;
      short s11;
      int i40;
      short s12;
      int i35;
      int i41;
      int i42;
      int i44;
      short s13;
      int i48;
      int i49;
      int i50;
      short s14;
      int i55;
      int i46;
      String str11;
      int i51;
      int i52;
      int i53;
      byte b14;
      int i57;
      byte b15;
      int i59;
      int i60;
      byte b16;
      int i64;
      int i65;
      int i66;
      byte b17;
      int i67;
      int i68;
      int i69;
      int i71;
      int i72;
      int i74;
      Object localObject4;
      int i56;
      int i58;
      Object localObject6;
      byte b18;
      short s16;
      int i87;
      Object localObject7;
      int i92;
      int i94;
      int i95;
      byte b22;
      int i100;
      byte b24;
      int i105;
      byte b25;
      byte b26;
      int i108;
      int i109;
      int i111;
      int i114;
      int i117;
      int i119;
      int i120;
      int i121;
      int i124;
      int i125;
      int i132;
      int i129;
      int i96;
      byte b21;
      int i112;
      int i113;
      short s19;
      String str29;
      int i110;
      String str32;
      short s21;
      String str34;
      int i128;
      short s23;
      short s22;
      int i130;
      int i131;
      int i133;
      int i134;
      int i136;
      int i137;
      int i140;
      int i141;
      byte b28;
      byte b29;
      int i148;
      byte b30;
      byte b31;
      int i157;
      short s32;
      short s33;
      int i163;
      short s26;
      String str42;
      int i149;
      int i151;
      short s29;
      short s31;
      String str47;
      short s34;
      short s35;
      int i167;
      int i161;
      int i173;
      int i172;
      switch (paramInt1)
      {
      case 8108: 
        this.bB = (paramDataInputStream.readByte() != 0);
        this.fM = paramDataInputStream.readUTF();
        break;
      case 1007: 
        if (paramDataInputStream.readByte() == 1)
        {
          aw localaw = new aw(this.bh, true);
          Threak localThreak = new Threak(localaw);
          localThreak.start();
        }
        else
        {
          this.bh.a(this, this.bh.s);
        }
        break;
      case 1016: 
        if (paramDataInputStream.readByte() == 0)
        {
          J();
          return;
        }
        this.fA = paramDataInputStream.readUTF();
        this.fL = paramDataInputStream.readUTF();
        gf = 0;
        if (h.cz)
        {
          this.fA = "更多精彩游戏请点击左键下载";
          this.fL = "http://wap.suiqu.cn";
        }
        this.jdField_do = 70;
        break;
      case 4415: 
        this.bh.cZ.N();
        this.bh.cZ.hh = a3.jdMethod_new(ag.g2, a.t);
        this.jdField_do = 38;
        break;
      case 6717: 
        int j = paramDataInputStream.readByte();
        if (j == 1)
        {
          paramDataInputStream.readShort();
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        break;
      case 1019: 
        int k = paramDataInputStream.readByte();
        if (k == 0) {
          this.bh.eO = true;
        }
        break;
      case 1018: 
        this.bh.cZ.fY = paramDataInputStream.readShort();
        this.bh.cZ.g4 = (this.bh.cZ.fY > 0);
        this.bh.cZ.gH = paramDataInputStream.readByte();
        this.bh.cZ.hP = paramDataInputStream.readByte();
        this.bh.cZ.hO = paramDataInputStream.readByte();
        ag.eJ = paramDataInputStream.readByte();
        ag.eI = paramDataInputStream.readByte();
        ag.eG = paramDataInputStream.readByte();
        break;
      case 1005: 
        int m = paramDataInputStream.readByte();
        if (m == 7)
        {
          n = paramDataInputStream.readByte();
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          return;
        }
        if (m != 6) {
          if (m == 5)
          {
            n = paramDataInputStream.readByte() == 1 ? 1 : 0;
            if (n == 0)
            {
              a(paramDataInputStream.readUTF(), (short)0, false, 9999);
              return;
            }
            this.bh.cZ.fa = true;
            this.m7 = paramDataInputStream.readUTF();
            byte[] arrayOfByte1 = new byte[54];
            paramDataInputStream.readFully(arrayOfByte1);
            this.bh.cZ.a(arrayOfByte1);
            this.bh.cZ.a7 = new short[a.ad];
            this.bh.cZ.H = new int[a.ad];
            for (int i12 = 0; i12 < a.ad; i12 = (byte)(i12 + 1))
            {
              this.bh.cZ.a7[i12] = paramDataInputStream.readShort();
              this.bh.cZ.H[i12] = a3.a(this.bh.cZ.a7[i12], a.t);
            }
            this.bh.cZ.a(paramDataInputStream);
            this.bh.cZ.h6 = new byte[h.e5];
            for (i12 = 0; i12 < h.e5; i12 = (byte)(i12 + 1)) {
              this.bh.cZ.h6[i12] = paramDataInputStream.readByte();
            }
            this.bh.cZ.dF = new short[ag.f7][2];
            for (i12 = 0; i12 < ag.f7; i13 = (byte)(i12 + 1))
            {
              i14 = paramDataInputStream.readShort();
              byte b10 = paramDataInputStream.readByte();
              if (b10 == 0)
              {
                if (!this.bh.cZ.j((byte)i14))
                {
                  i14 = -1;
                  b10 = -1;
                }
              }
              else if ((b10 == 1) && (this.bh.cZ.a((byte)0, i14) < 0) && (this.bh.cZ.a((byte)1, i14) < 0))
              {
                i14 = -1;
                b10 = -1;
              }
              this.bh.cZ.jdMethod_if(i12, i14, b10);
            }
            this.bh.bR = new ak(this.bh);
            i13 = paramDataInputStream.readShort();
            for (int i14 = 0; i14 < i13; i14++)
            {
              short s1 = paramDataInputStream.readShort();
              this.bh.bR.jdMethod_for(s1);
            }
            i13 = paramDataInputStream.readShort();
            int i16;
            for (int i15 = 0; i15 < i13; i16 = (byte)(i15 + 1))
            {
              paramDataInputStream.readShort();
              localObject2 = new ao(paramDataInputStream);
              paramDataInputStream.readByte();
              if ((!((ao)localObject2).jdField_char) && (this.bh.bR.jdMethod_case(((ao)localObject2).E)))
              {
                if (this.bh.aG.jdMethod_int(5845))
                {
                  this.bh.aG.jdMethod_new(((ao)localObject2).E);
                  this.bh.aG.jdMethod_if();
                }
              }
              else {
                this.bh.bR.jdMethod_do((ao)localObject2);
              }
            }
            gf = 0;
            this.jdField_do = 59;
          }
          else if (m == 4)
          {
            this.kH = 0;
            this.lf = (paramDataInputStream.readByte() == 1);
            this.cU = paramDataInputStream.readInt();
            this.gt = paramDataInputStream.readByte();
            this.iw = paramDataInputStream.readByte();
            this.gm = paramDataInputStream.readUTF();
            this.io = paramDataInputStream.readUTF();
            this.jk = paramDataInputStream.readUTF();
            this.mA = paramDataInputStream.readUTF();
            this.hx = paramDataInputStream.readUTF();
            this.bT = paramDataInputStream.readUTF();
            this.nt = new String[paramDataInputStream.readByte()];
            this.fx = new String[this.nt.length][];
            for (n = 0; n < this.nt.length; n++)
            {
              this.nt[n] = paramDataInputStream.readUTF();
              this.fx[n] = new String[paramDataInputStream.readByte()];
              for (int i10 = 0; i10 < this.fx[n].length; i10++) {
                this.fx[n][i10] = paramDataInputStream.readUTF();
              }
            }
            gf = 0;
            if (this.bh.cZ.fa)
            {
              a(this.io, (short)0, false, 9999);
            }
            else
            {
              this.e3 = 0;
              this.kH = 1;
              this.jdField_do = 34;
            }
          }
          else if (m != 3)
          {
            if (m == 2)
            {
              this.gc = paramDataInputStream.readShort();
              this.gA = paramDataInputStream.readShort();
              this.i1 = paramDataInputStream.readShort();
              this.l5 = paramDataInputStream.readShort();
              this.bX = paramDataInputStream.readInt();
              this.j2 = paramDataInputStream.readUTF();
              this.mb = paramDataInputStream.readInt();
              this.cn = paramDataInputStream.readByte();
              this.l8 = paramDataInputStream.readUTF();
              this.ma = paramDataInputStream.readInt();
              d();
            }
            else if (m == 0)
            {
              this.bh.cZ.fY = paramDataInputStream.readShort();
              this.bh.cZ.g4 = (this.bh.cZ.fY > 0);
            }
            else
            {
              n = paramDataInputStream.readByte();
              if (n == 1)
              {
                a(paramDataInputStream.readUTF(), (short)0, false, 9999);
              }
              else
              {
                gf = 0;
                this.e3 = 0;
                this.gP = true;
                this.i7 = paramDataInputStream.readUTF();
                this.jdField_do = -125;
              }
            }
          }
        }
        break;
      case 6781: 
        n = paramDataInputStream.readByte();
        if (n == 1)
        {
          a("查看摊位失败.", (short)0, false, 9999);
          return;
        }
        int i11 = paramDataInputStream.readByte();
        this.dc = 0;
        this.lT = 0;
        this.bO = this.bh.cZ.a((byte)0);
        if (i11 == 0)
        {
          i13 = paramDataInputStream.readByte();
          localObject1 = new short[i13];
          localObject2 = new byte[i13];
          int[] arrayOfInt1 = new int[i13];
          for (int i17 = 0; i17 < i13; i18 = (byte)(i17 + 1))
          {
            localObject1[i17] = paramDataInputStream.readShort();
            localObject2[i17] = paramDataInputStream.readByte();
            arrayOfInt1[i17] = paramDataInputStream.readInt();
          }
          i18 = paramDataInputStream.readByte();
          for (i19 = 0; i19 < i18; i19 = (byte)(i19 + 1))
          {
            i20 = paramDataInputStream.readShort();
            short s2 = paramDataInputStream.readShort();
            String str3 = paramDataInputStream.readUTF();
            short s4 = paramDataInputStream.readShort();
            i25 = paramDataInputStream.readShort();
            short s5 = paramDataInputStream.readShort();
            short s6 = paramDataInputStream.readShort();
            i28 = paramDataInputStream.readShort();
            short s7 = paramDataInputStream.readShort();
            s8 = paramDataInputStream.readShort();
            short s9 = paramDataInputStream.readShort();
            b12 = 1;
            this.bh.a((short)(i20 + 1000), s2, str3, false, s4, i25, s5, s6, i28, s7, s8, s9, b12);
          }
          this.bh.i.a(1, (byte)0, (byte)localObject1.length, (short[])localObject1, new short[localObject1.length]);
          this.bh.i.a((short[])localObject1, false);
          for (i19 = 0; i19 < this.bs[0]; i19 = (byte)(i19 + 1))
          {
            this.ev[0][i19] = ((short)a3.jdMethod_new(localObject2[i19], 2));
            this.lK[0][i19] = arrayOfInt1[i19];
          }
          this.jdField_do = 10;
        }
        else
        {
          this.bh.a4 = new p(this.bh);
          this.bh.a4.jdField_do = new a3[paramDataInputStream.readByte()];
          this.bh.ee = new int[this.bh.a4.jdField_do.length];
          this.bh.f3 = new boolean[this.bh.a4.jdField_do.length];
          for (i13 = 0; i13 < this.bh.a4.jdField_do.length; i13 = (byte)(i13 + 1))
          {
            this.bh.a4.jdField_do[i13] = new a3(this.bh, null);
            this.bh.a4.jdField_do[i13].O = paramDataInputStream.readUTF();
            localObject1 = new byte[54];
            paramDataInputStream.readFully((byte[])localObject1);
            this.bh.a4.jdField_do[i13].a((byte[])localObject1);
            localObject1 = null;
            this.bh.ee[i13] = paramDataInputStream.readInt();
          }
          this.mz = 0;
          this.bf = 0;
          this.jdField_do = -61;
        }
        break;
      case 2506: 
        i13 = paramDataInputStream.readByte();
        if (i13 == 1)
        {
          a("查看个性头像失败.", (short)0, false, 9999);
        }
        else
        {
          localObject1 = new byte[paramDataInputStream.readShort()];
          paramDataInputStream.readFully((byte[])localObject1);
          this.dt = Image.createImage((byte[])localObject1, 0, localObject1.length);
          localObject1 = null;
          this.jdField_do = 107;
        }
        break;
      case 3005: 
        localObject1 = paramDataInputStream.readUTF();
        localObject2 = paramDataInputStream.readUTF();
        byte b11 = paramDataInputStream.readByte();
        if (b11 == 99)
        {
          this.dy = ((String)localObject1);
          this.gX = paramDataInputStream.readByte();
          this.dR = new short[this.gX];
          i18 = 1;
          for (i19 = 0; i19 < this.gX; i19 = (byte)(i19 + 1)) {
            this.dR[i19] = paramDataInputStream.readShort();
          }
          this.nh = i18;
        }
        else
        {
          this.ho = false;
          this.fA = ((String)localObject1);
          this.fL = ((String)localObject2);
          this.gI = b11;
        }
        break;
      case 8104: 
        this.fS = paramDataInputStream.readUTF();
        this.ns = paramDataInputStream.readByte();
        this.bh.cZ.d();
        gf = 0;
        this.jdField_do = 64;
        break;
      case 7103: 
        this.hO = null;
        this.hO = paramDataInputStream.readUTF();
        break;
      case 4062: 
        i18 = paramDataInputStream.readInt();
        i19 = -1;
        for (i20 = 0; i20 < this.bh.jdField_try; i20 = (byte)(i20 + 1)) {
          if (this.bh.b7[i20].a((byte)0) == i18)
          {
            i19 = i20;
            break;
          }
        }
        if (i19 == -1) {
          return;
        }
        if (this.bh.b7[i19] == this.bh.cZ.gR) {
          this.bh.cZ.gR = null;
        }
        this.bh.b7[i19] = null;
        for (int i21 = (byte)(i19 + 1); i21 < h.f0; i21 = (byte)(i21 + 1))
        {
          this.bh.b7[(i21 - 1)] = this.bh.b7[i21];
          this.bh.b7[i21] = null;
        }
        h tmp4089_4086 = this.bh;
        tmp4089_4086.jdField_try = ((byte)(tmp4089_4086.jdField_try - 1));
        if (this.bh.jdField_try < 0) {
          this.bh.jdField_try = 0;
        }
        break;
      case 4061: 
        if (this.bh.jdField_try < h.f0)
        {
          String str2 = paramDataInputStream.readUTF();
          byte[] arrayOfByte2 = new byte[54];
          paramDataInputStream.readFully(arrayOfByte2);
          this.bh.b7[this.bh.jdField_try] = new a3(this.bh, null);
          this.bh.b7[this.bh.jdField_try].O = str2;
          this.bh.b7[this.bh.jdField_try].a(arrayOfByte2);
          h tmp4222_4219 = this.bh;
          tmp4222_4219.jdField_try = ((byte)(tmp4222_4219.jdField_try + 1));
        }
        break;
      case 5842: 
        int i22 = paramDataInputStream.readByte();
        if (i22 == 1)
        {
          this.bh.cZ.a(paramDataInputStream);
        }
        else
        {
          s3 = paramDataInputStream.readShort();
          this.bh.bR.jdMethod_for(s3);
          for (i23 = 0; i23 < this.bh.bR.d.size(); i23 = (byte)(i23 + 1))
          {
            ao localao1 = (ao)this.bh.bR.d.elementAt(i23);
            if (localao1.E == s3)
            {
              this.bh.bR.d.removeElementAt(i23);
              break;
            }
          }
        }
        break;
      case 5849: 
        this.ea.a(paramInt1, paramInt2, paramDataInputStream);
        break;
      case 3736: 
        this.bh.cZ.hq = paramDataInputStream.readByte();
        this.bh.cZ.jdMethod_if((byte)50, paramDataInputStream.readInt());
        break;
      case 3731: 
        a(paramDataInputStream.readUTF(), (short)26, false, 9999);
        s3 = paramDataInputStream.readByte();
        if (s3 == 0)
        {
          this.bh.cZ.ge = paramDataInputStream.readInt();
          this.bh.cZ.gm = paramDataInputStream.readByte();
        }
        break;
      case 3735: 
        this.bh.fm = new an(this.bh);
        this.bh.fm.e = 0;
        this.bh.fm.jdField_try = paramDataInputStream.readInt();
        this.bh.fm.jdField_void = paramDataInputStream.readUTF();
        this.bh.fm.jdField_case = paramDataInputStream.readByte();
        this.bh.fm.jdField_for = paramDataInputStream.readInt();
        this.bh.fm.jdField_goto = paramDataInputStream.readUTF();
        this.bh.fm.c = paramDataInputStream.readByte();
        this.bh.fm.jdField_char = paramDataInputStream.readByte();
        this.bh.fm.f = paramDataInputStream.readInt();
        this.bh.fm.b = paramDataInputStream.readInt();
        this.bh.fm.jdField_byte = paramDataInputStream.readUTF();
        this.bh.fm.jdField_new = paramDataInputStream.readUTF();
        this.bh.fm.jdField_int = paramDataInputStream.readUTF();
        this.bh.fm.jdField_do = paramDataInputStream.readUTF();
        this.bh.fm.a = paramDataInputStream.readUTF();
        this.jdField_do = -93;
        break;
      case 3732: 
        i23 = paramDataInputStream.readInt();
        int i24 = paramDataInputStream.readInt();
        i25 = paramDataInputStream.readByte();
        if (this.bh.cZ.fL == i23)
        {
          this.bh.cZ.ge = i24;
          this.bh.cZ.gm = i25;
        }
        break;
      case 3727: 
      case 3728: 
        this.bh.fm.a(paramInt1, paramDataInputStream, paramInt2, str1);
        break;
      case 3730: 
        int i26 = paramDataInputStream.readInt();
        if (i26 == this.bh.cZ.fL) {
          this.bh.cZ.fj = paramDataInputStream.readByte();
        }
        break;
      case 3729: 
        if (paramInt2 == 1)
        {
          a(str1, (short)26, false, 9999);
          return;
        }
        int i27 = ((Integer)this.dY.elementAt(this.hZ)).intValue();
        i28 = this.mQ[this.gd];
        String str4 = this.b5;
        this.ip.setElementAt(ag.jdMethod_try(i28, i27) + " " + str4, this.hZ);
        this.k1.setElementAt(new Byte(this.mQ[this.gd]), this.hZ);
        a(this.mQ[this.gd] < 0 ? "职位撤销成功." : "职位任命成功.", (short)26, false, 9999);
        break;
      case 3740: 
        s8 = paramDataInputStream.readByte() == 0 ? 1 : 0;
        String str5 = paramDataInputStream.readUTF();
        if (s8 != 0)
        {
          b12 = paramDataInputStream.readByte();
          this.bh.cZ.jdMethod_if((byte)50, paramDataInputStream.readInt());
          a(str5, (short)0, false, 9999);
        }
        else
        {
          this.mZ = 3;
          a(str5, (short)-30, false, 9999);
        }
        break;
      case 3739: 
        b12 = paramDataInputStream.readByte() == 0 ? 1 : 0;
        str6 = paramDataInputStream.readUTF();
        if (b12 != 0)
        {
          a(str6, (short)0, false, 9999);
        }
        else
        {
          this.mZ = 2;
          a(str6, (short)-30, false, 9999);
        }
        break;
      case 3738: 
        str6 = paramDataInputStream.readUTF();
        a(str6, (short)0, false, 9999);
        break;
      case 3726: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        this.bh.fm = new an(this.bh);
        this.bh.fm.e = 0;
        this.bh.fm.jdField_try = this.bh.cZ.fL;
        this.bh.fm.jdField_void = this.bh.cZ.es;
        this.bh.fm.jdField_case = paramDataInputStream.readByte();
        this.bh.fm.jdField_for = paramDataInputStream.readInt();
        this.bh.fm.jdField_goto = paramDataInputStream.readUTF();
        this.bh.fm.c = paramDataInputStream.readByte();
        this.bh.fm.jdField_char = paramDataInputStream.readByte();
        this.bh.fm.f = paramDataInputStream.readInt();
        this.bh.fm.b = paramDataInputStream.readInt();
        this.bh.fm.jdField_else = paramDataInputStream.readUTF();
        this.bh.fm.jdField_null = this.bh.jdMethod_do(this.bh.fm.jdField_else, (h.a9 == 0 ? '' : '°') - 20);
        if ((this.bh.fm.f >= this.bh.fm.b) && (this.bh.cZ.fj == 17)) {
          a("公会已达到升级条件.(需使用公会升级卡提升公会等级)", (short)-87, false, 9999);
        } else {
          this.jdField_do = -87;
        }
        break;
      case 3725: 
        if (this.bh.cZ.fL == paramDataInputStream.readInt()) {
          this.bh.cZ.fx = paramDataInputStream.readByte();
        }
        break;
      case 4014: 
        int i29 = paramDataInputStream.readByte();
        if ((i29 == 0) && (this.bh.cZ.a4 == 16) && (this.bh.cZ.hj != null))
        {
          this.bh.cZ.hj.c9 = (dD == 2 ? ar.bR : ar.cn);
          this.bh.cZ.hj = null;
        }
        break;
      case 5846: 
        this.bh.bR.a();
        break;
      case 5848: 
        this.bh.bR.jdMethod_byte(paramDataInputStream.readShort());
        break;
      case 5852: 
        this.bh.bR.jdMethod_int();
        break;
      case 5851: 
        int i30 = paramDataInputStream.readByte();
        if (i30 == 1)
        {
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          this.ea = new af(this.bh);
          this.ea.jdField_case = new byte[2];
          for (i31 = 0; i31 < 2; i31 = (byte)(i31 + 1)) {
            this.ea.jdField_case[i31] = paramDataInputStream.readByte();
          }
          this.ea.a(1);
        }
        break;
      case 4060: 
      case 5847: 
      case 6713: 
      case 6714: 
      case 6715: 
      case 6716: 
        i31 = paramDataInputStream.readByte();
        if (i31 == 1)
        {
          paramDataInputStream.readShort();
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          if ((paramInt1 == 6714) || (paramInt1 == 6715) || (paramInt1 == 6713))
          {
            a("使用成功.", (short)0, false, 9999);
          }
          else if (paramInt1 == 6716)
          {
            a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          }
          else if (paramInt1 == 4060)
          {
            h.f0 = paramDataInputStream.readByte();
            a("扩充成功.可携带宠物数量+1.", (short)0, false, 9999);
          }
          else
          {
            this.bh.bR.a();
            a("每日任务重置完成.", (short)0, false, 9999);
          }
        }
        break;
      case 4058: 
        int i32 = paramDataInputStream.readByte();
        String str7;
        if (i32 == 1)
        {
          i33 = paramDataInputStream.readShort();
          str7 = paramDataInputStream.readUTF();
          a(str7, (short)0, false, 9999);
        }
        else
        {
          i33 = paramDataInputStream.readInt();
          str7 = paramDataInputStream.readUTF();
          this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          for (int i36 = 0; i36 < this.bh.jdField_try; i36 = (byte)(i36 + 1)) {
            if (i33 == this.bh.b7[i36].a((byte)0)) {
              this.bh.b7[i36].O = str7;
            }
          }
          a("改名成功.", (short)0, false, 9999);
        }
        break;
      case 4059: 
        i33 = paramDataInputStream.readByte();
        int i34;
        Object localObject3;
        if (i33 == 1)
        {
          i34 = paramDataInputStream.readShort();
          localObject3 = paramDataInputStream.readUTF();
          a((String)localObject3, (short)0, false, 9999);
        }
        else
        {
          i34 = paramDataInputStream.readInt();
          localObject3 = new byte[54];
          paramDataInputStream.readFully((byte[])localObject3);
          this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          for (i39 = 0; i39 < this.bh.jdField_try; i39 = (byte)(i39 + 1)) {
            if (i34 == this.bh.b7[i39].a((byte)0)) {
              this.bh.b7[i39].a((byte[])localObject3);
            }
          }
          a("唤醒成功.", (short)0, false, 9999);
        }
        break;
      case 4056: 
        this.bh.a4.a(paramInt2, str1, paramDataInputStream);
        this.bh.a4 = null;
        Runtime.getRuntime().gc();
        break;
      case 4055: 
        if (this.bh.di != null) {
          this.bh.di.a(paramInt2, str1, paramDataInputStream);
        }
        this.bh.di = null;
        Runtime.getRuntime().gc();
        break;
      case 4054: 
        if (paramInt2 == 1)
        {
          str8 = paramDataInputStream.readUTF();
          a(str8, (short)-34, false, 9999);
          short s10 = paramDataInputStream.readShort();
          i39 = paramDataInputStream.readByte();
          this.bh.cZ.jdMethod_if((byte)0, s10, i39);
        }
        else
        {
          str8 = paramDataInputStream.readUTF();
          i37 = paramDataInputStream.readInt();
          byte[] arrayOfByte3 = new byte[54];
          paramDataInputStream.readFully(arrayOfByte3);
          for (s11 = 0; s11 < this.bh.jdField_try; s11 = (byte)(s11 + 1)) {
            if (this.bh.b7[s11].a((byte)0) == i37) {
              this.bh.b7[s11].a(arrayOfByte3);
            }
          }
          a(str8, (short)-34, true, 9999);
        }
        this.bh.i.jdMethod_if();
        break;
      case 4053: 
        if (paramInt2 == 1)
        {
          str8 = paramDataInputStream.readUTF();
          a(str8, (short)-34, false, 9999);
          i37 = paramDataInputStream.readByte();
          for (i40 = 0; i40 < i37; i40 = (byte)(i40 + 1))
          {
            s11 = paramDataInputStream.readShort();
            s12 = paramDataInputStream.readByte();
            this.bh.cZ.jdMethod_if((byte)0, s11, s12);
          }
        }
        else
        {
          i35 = paramDataInputStream.readByte() == 0 ? 0 : 1;
          String str9 = paramDataInputStream.readUTF();
          i40 = paramDataInputStream.readInt();
          byte[] arrayOfByte5 = new byte[54];
          paramDataInputStream.readFully(arrayOfByte5);
          for (s12 = 0; s12 < this.bh.jdField_try; s12 = (byte)(s12 + 1)) {
            if (this.bh.b7[s12].a((byte)0) == i40) {
              this.bh.b7[s12].a(arrayOfByte5);
            }
          }
          a(str9, (short)-34, false, 9999);
        }
        this.bh.i.jdMethod_if();
        break;
      case 4052: 
        i35 = paramDataInputStream.readInt();
        int i38 = paramDataInputStream.readShort();
        for (i40 = 0; i40 < this.bh.jdField_try; i40 = (byte)(i40 + 1)) {
          if (this.bh.b7[i40].a((byte)0) == i35) {
            this.bh.b7[i40].jdMethod_if((byte)40, i38);
          }
        }
        break;
      case 8103: 
      case 8202: 
      case 8203: 
        a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        break;
      case 8201: 
        this.cA = paramDataInputStream.readShort();
        this.i9 = paramDataInputStream.readShort();
        this.i8 = paramDataInputStream.readShort();
        break;
      case 3741: 
        byte[] arrayOfByte4 = new byte[4];
        for (i41 = 0; i41 < arrayOfByte4.length; i41 = (byte)(i41 + 1)) {
          arrayOfByte4[i41] = paramDataInputStream.readByte();
        }
        this.bh.cZ.hT = arrayOfByte4;
        break;
      case 6712: 
        for (i41 = 1; i41 < 6; i42 = (byte)(i41 + 1))
        {
          s12 = paramDataInputStream.readByte();
          this.bh.a(i41, s12 == 1);
        }
        break;
      case 6711: 
        i42 = paramDataInputStream.readByte();
        s12 = paramDataInputStream.readShort();
        String str10 = paramDataInputStream.readUTF();
        if (i42 != 1)
        {
          this.bh.cZ.a((byte)1, s12, 1, false);
          byte b13 = (byte)(this.bh.Q(s12) + 1);
          this.bh.a(b13, true);
        }
        a(str10, (short)0, true, 9999);
        break;
      case 1014: 
      case 1015: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        this.bh.cZ.hh = a3.jdMethod_new(ag.g2, a.t);
        this.bl = paramDataInputStream.readUTF();
        byte[] arrayOfByte6 = new byte[54];
        paramDataInputStream.readFully(arrayOfByte6);
        this.bh.cZ.a(arrayOfByte6);
        arrayOfByte6 = null;
        this.jdField_int = 0;
        if (paramInt1 == 1015)
        {
          this.jdField_do = 124;
        }
        else
        {
          this.bh.bR.jdMethod_do();
          this.bh.bR.jdField_for = null;
          if (this.jdField_do == 21) {
            this.jdField_do = 115;
          } else {
            jdMethod_do(this.bl);
          }
        }
        break;
      case 4111: 
        int i43 = paramDataInputStream.readByte();
        if (i43 == 0) {
          this.fr = null;
        }
        this.fr = new String[i43];
        for (i44 = 0; i44 < i43; i44 = (byte)(i44 + 1)) {
          this.fr[i44] = paramDataInputStream.readUTF();
        }
        break;
      case 4101: 
      case 4102: 
      case 4107: 
      case 4110: 
        this.bh.a(paramInt1, paramDataInputStream);
        break;
      case 5850: 
      case 6802: 
        i44 = paramDataInputStream.readByte();
        if (i44 == 1)
        {
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          return;
        }
        a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        this.bh.cZ.a(paramDataInputStream);
        break;
      case 6803: 
        int i45 = paramDataInputStream.readShort();
        if (this.jdField_if != i45) {
          return;
        }
        synchronized (this.bx)
        {
          this.fH = new boolean[20];
          s13 = (short)paramDataInputStream.readByte();
          for (int i47 = 0; i47 < s13; i47 = (short)(i47 + 1))
          {
            i48 = paramDataInputStream.readInt();
            i49 = paramDataInputStream.readShort();
            i50 = paramDataInputStream.readShort();
            String str13 = paramDataInputStream.readUTF();
            s14 = paramDataInputStream.readByte();
            int[] arrayOfInt2 = new int[s14];
            int[] arrayOfInt3 = new int[s14];
            byte[] arrayOfByte7 = new byte[s14];
            for (short s15 = 0; s15 < s14; s15 = (short)(s15 + 1))
            {
              arrayOfInt2[s15] = paramDataInputStream.readInt();
              arrayOfInt3[s15] = paramDataInputStream.readInt();
              arrayOfByte7[s15] = paramDataInputStream.readByte();
            }
            s15 = 0;
            for (i55 = 0; i55 < this.jF; i55 = (short)(i55 + 1)) {
              if (i48 == this.bx[i55])
              {
                this.jU[i55] = i49;
                this.jT[i55] = i50;
                this.cp[i55] = str13;
                this.jd[i55] = arrayOfInt2;
                this.br[i55] = arrayOfInt3;
                this.bP[i55] = arrayOfByte7;
                this.fH[i55] = true;
                s15 = 1;
                break;
              }
            }
            if ((s15 == 0) && (this.jF < 20))
            {
              this.bx[this.jF] = i48;
              this.jU[this.jF] = i49;
              this.jT[this.jF] = i50;
              this.cp[this.jF] = str13;
              this.jd[this.jF] = arrayOfInt2;
              this.br[this.jF] = arrayOfInt3;
              this.bP[this.jF] = arrayOfByte7;
              this.fH[this.jF] = true;
              this.jF = ((byte)(this.jF + 1));
            }
          }
          for (i47 = 0; i47 < this.jF; i47 = (short)(i47 + 1)) {
            if (this.fH[i47] == 0)
            {
              while ((this.fH[(this.jF - 1)] == 0) && (i47 < this.jF - 1))
              {
                this.jd[this.jF] = null;
                this.br[this.jF] = null;
                this.bP[this.jF] = null;
                this.jF = ((byte)(this.jF - 1));
              }
              this.bx[i47] = this.bx[(this.jF - 1)];
              this.jU[i47] = this.jU[(this.jF - 1)];
              this.jT[i47] = this.jT[(this.jF - 1)];
              this.cp[i47] = this.cp[(this.jF - 1)];
              this.jd[i47] = this.jd[(this.jF - 1)];
              this.br[i47] = this.br[(this.jF - 1)];
              this.bP[i47] = this.bP[(this.jF - 1)];
              this.jF = ((byte)(this.jF - 1));
            }
          }
          this.fH = null;
        }
        break;
      case 3650: 
        i46 = paramDataInputStream.readShort();
        if ((this.jdField_if == i46) && (jS != null))
        {
          s13 = paramDataInputStream.readShort();
          str11 = paramDataInputStream.readUTF();
          i48 = paramDataInputStream.readByte();
          i49 = paramDataInputStream.readInt();
          i50 = paramDataInputStream.readInt();
          i51 = paramDataInputStream.readShort();
          s14 = paramDataInputStream.readShort();
          i52 = paramDataInputStream.readShort();
          i53 = paramDataInputStream.readShort();
          b14 = paramDataInputStream.readByte();
          byte[] arrayOfByte8 = new byte[2];
          arrayOfByte8[0] = paramDataInputStream.readByte();
          arrayOfByte8[1] = paramDataInputStream.readByte();
          i55 = paramDataInputStream.readByte();
          byte[] arrayOfByte9 = new byte[2];
          arrayOfByte9[0] = paramDataInputStream.readByte();
          arrayOfByte9[1] = paramDataInputStream.readByte();
          i57 = paramDataInputStream.readByte();
          byte[] arrayOfByte10 = new byte[2];
          arrayOfByte10[0] = paramDataInputStream.readByte();
          arrayOfByte10[1] = paramDataInputStream.readByte();
          b15 = paramDataInputStream.readByte();
          i59 = paramDataInputStream.readByte();
          i60 = paramDataInputStream.readByte();
          b16 = paramDataInputStream.readByte();
          int i62 = paramDataInputStream.readByte();
          i64 = paramDataInputStream.readByte();
          i65 = paramDataInputStream.readByte();
          i66 = paramDataInputStream.readByte();
          b17 = paramDataInputStream.readByte();
          i67 = (short)paramDataInputStream.readByte();
          i68 = 0;
          for (i69 = 0; i69 < ar.ce.length; i69 = (byte)(i69 + 1)) {
            if (ar.ce[i69] == i67)
            {
              i68 = i69;
              break;
            }
          }
          i69 = paramDataInputStream.readInt();
          int i70 = 0;
          for (i71 = (byte)(jS.length - 2); i71 < jS.length; i71 = (byte)(i71 + 1)) {
            if (jS[i71].t == s13)
            {
              jS[i71].jdMethod_if((byte)16, i69);
              i70 = 1;
            }
          }
          if (i70 == 0)
          {
            i71 = 0;
            for (i72 = (byte)(jS.length - 2); i72 < jS.length; i72 = (byte)(i72 + 1)) {
              if ((jS[i72].bz) && (jS[i72].t != s13) && (!jS[i72].df))
              {
                int i73 = 0;
                i74 = 0;
                ar localar = jS[i72];
                localar.t = s13;
                localar.jdMethod_if((byte)16, i69);
                localar.jdMethod_if((byte)20, i50);
                localar.jdMethod_if((byte)28, i51);
                localar.jdMethod_if((byte)30, s14);
                localar.jdMethod_if((byte)14, i48);
                localar.jdMethod_if((byte)4, i49);
                localar.jdMethod_if((byte)32, i52);
                localar.jdMethod_if((byte)34, i53);
                localar.ck = i68;
                localar.af = this.bh.cl[i68];
                localar.jdMethod_if(localar.af);
                localar.O = str11;
                localar.bb = i59;
                localar.bV = b16;
                localar.dp = ((short)i60);
                localar.dn = ((short)i65);
                localar.cj = b14;
                localar.cz = new byte[3][2];
                localar.cz[0] = arrayOfByte8;
                localar.ch = i55;
                localar.cz[1] = arrayOfByte9;
                localar.cg = i57;
                localar.cz[2] = arrayOfByte10;
                localar.aK = ((short)i62);
                localar.bA = ((short)i64);
                localar.v = 0;
                localar.dq = b17;
                localar.c6 = b15;
                localar.aI = ((byte)(localar.bA - 8));
                localar.a4 = 0;
                localar.au = 1;
                localar.jdField_try = 1;
                localar.al = new int[5];
                localar.af.a(localar.jdMethod_int((byte)2), 0, localar.al);
                localar.aD = null;
                localar.cT = this.bh.cZ;
                for (int i76 = 0; i76 < 50; i76 = (byte)(i76 + 1))
                {
                  i73 = h.jdMethod_if(80, this.bh.ad - h.u - 80);
                  i74 = h.jdMethod_if(80, this.bh.dz - h.b8 - 80);
                  if (((!localar.jdMethod_if(i73, i74)) || (dD == 2)) && (this.bh.fJ[jdMethod_for(i73, i74)] > 0) && (this.bh.fJ[jdMethod_for(i73 + localar.aK / 2, i74)] > 0) && (this.bh.fJ[jdMethod_for(i73 + localar.aK, i74)] > 0) && (this.bh.fJ[jdMethod_for(i73, i74 + localar.bA)] > 0) && (this.bh.fJ[jdMethod_for(i73 + localar.aK / 2, i74 + localar.bA)] > 0) && (this.bh.fJ[jdMethod_for(i73 + localar.aK, i74 + localar.bA)] > 0) && (this.bh.fJ[jdMethod_for(i73 + localar.aK, i74 + localar.bA / 2)] > 0) && (this.bh.fJ[jdMethod_for(i73, i74 + localar.bA / 2)] > 0) && (this.bh.fJ[jdMethod_for(i73 + localar.aK / 2, i74 + localar.bA / 2)] > 0))
                  {
                    i71 = 1;
                    break;
                  }
                }
                if (i71 == 0)
                {
                  localar.cv = ((short)(ar.cd - 1));
                  localar.df = false;
                  return;
                }
                localar.ci = false;
                localar.aP = ((short)i73);
                localar.aM = ((short)i74);
                localar.ao = false;
                localar.cv = 0;
                localar.df = true;
                localar.cf = false;
                localar.c9 = 0;
                localar.cm = false;
                localar.cZ = 0;
                localar.bg = 0;
                localar.ag = 0;
                localar.dc = 0;
                break;
              }
            }
          }
        }
        break;
      case 3651: 
        i46 = paramDataInputStream.readShort();
        s13 = paramDataInputStream.readShort();
        str11 = paramDataInputStream.readUTF();
        String str12 = paramDataInputStream.readUTF();
        if ((this.jdField_if == i46) && (jS != null)) {
          for (i49 = (byte)(jS.length - 2); i49 < jS.length; i49 = (byte)(i49 + 1)) {
            if ((jS[i49] != null) && (jS[i49].bz) && (jS[i49].t == s13))
            {
              jS[i49].jdMethod_if((byte)16, 0);
              jS[i49].cf = true;
            }
          }
        }
        if (str12.equals(this.bh.cZ.O)) {
          for (i49 = 0; i49 < this.bh.bR.d.size(); i49 = (byte)(i49 + 1))
          {
            localObject4 = (ao)this.bh.bR.d.elementAt(i49);
            if (((((ao)localObject4).P == 10) || (((ao)localObject4).P == 21)) && (((ao)localObject4).i.indexOf(str11) != -1)) {
              this.bh.bR.a(((ao)localObject4).E, true);
            }
          }
        }
        break;
      case 6710: 
        i49 = paramDataInputStream.readByte();
        localObject4 = paramDataInputStream.readUTF();
        i51 = 0;
        s14 = 0;
        i52 = 0;
        i53 = 0;
        if (i49 == 1)
        {
          s14 = paramDataInputStream.readShort();
          i52 = paramDataInputStream.readShort();
          i53 = paramDataInputStream.readByte();
          a((String)localObject4, (short)0, false, 9999);
        }
        else
        {
          s14 = paramDataInputStream.readShort();
          i52 = paramDataInputStream.readShort();
          i53 = paramDataInputStream.readByte();
          this.bh.cZ.a((byte)1, s14, 1, false);
          this.bh.cZ.a((byte)0, (short)i52, i53, false);
          i51 = paramDataInputStream.readByte();
          i52 = paramDataInputStream.readInt();
          i53 = paramDataInputStream.readByte();
          switch (i51)
          {
          case 0: 
            this.bh.cZ.jdMethod_if((byte)0, (short)i52, i53);
            break;
          case 1: 
            this.bh.cZ.jdMethod_do((byte)0, i52);
            break;
          case 2: 
            this.bh.cZ.jdMethod_do((byte)8, i52);
          }
          a((String)localObject4, (short)0, false, 9999);
        }
        break;
      case 4012: 
        b14 = paramDataInputStream.readByte();
        if (b14 == 0)
        {
          if (this.bh.b7[this.bf] == this.bh.cZ.gR) {
            this.bh.cZ.gR = null;
          }
          this.bh.b7[this.bf] = null;
          for (int i54 = (byte)(this.bf + 1); i54 < h.f0; i54 = (byte)(i54 + 1))
          {
            this.bh.b7[(i54 - 1)] = this.bh.b7[i54];
            this.bh.b7[i54] = null;
          }
          h tmp9744_9741 = this.bh;
          tmp9744_9741.jdField_try = ((byte)(tmp9744_9741.jdField_try - 1));
          if (this.bh.jdField_try < 0) {
            this.bh.jdField_try = 0;
          }
          a("舍弃宠物成功.", (short)-34, false, 9999);
        }
        else
        {
          a("释放宠物失败.", (short)-34, false, 9999);
        }
        break;
      case 8999: 
        String str14 = paramDataInputStream.readUTF();
        i55 = paramDataInputStream.readByte();
        for (i56 = 0; i56 < i55; i56 = (byte)(i56 + 1))
        {
          i57 = paramDataInputStream.readShort();
          i58 = paramDataInputStream.readByte();
          this.bh.cZ.jdMethod_if((byte)1, i57, i58);
        }
        a(str14, (short)0, false, 9999);
        break;
      case 7101: 
        i56 = paramDataInputStream.readByte();
        this.fa = 0;
        this.jM = 0;
        this.ix = 0;
        this.dA = 0;
        i57 = paramDataInputStream.readByte();
        this.kd = new String[i57];
        this.gq = new String[i57][];
        this.cv = new String[i57][][];
        this.jV = new byte[i57];
        this.cT = new byte[i57][];
        this.iM = new byte[i57][][];
        for (i58 = 0; i58 < this.kd.length; i58 = (byte)(i58 + 1))
        {
          this.kd[i58] = paramDataInputStream.readUTF();
          this.jV[i58] = paramDataInputStream.readByte();
          b15 = paramDataInputStream.readByte();
          this.gq[i58] = new String[b15];
          this.cv[i58] = new String[b15][];
          this.cT[i58] = new byte[b15];
          this.iM[i58] = new byte[b15][];
          for (i59 = 0; i59 < b15; i59 = (byte)(i59 + 1))
          {
            this.gq[i58][i59] = paramDataInputStream.readUTF();
            this.cT[i58][i59] = paramDataInputStream.readByte();
            i60 = paramDataInputStream.readByte();
            this.cv[i58][i59] = new String[i60];
            this.iM[i58][i59] = new byte[i60];
            for (b16 = 0; b16 < i60; b16 = (byte)(b16 + 1))
            {
              this.cv[i58][i59][b16] = paramDataInputStream.readUTF();
              this.iM[i58][i59][b16] = paramDataInputStream.readByte();
            }
          }
        }
        if (i56 == 0)
        {
          this.j1 = -31;
          this.jb = "排行榜";
        }
        else
        {
          this.j1 = -32;
          this.jb = "帮助";
        }
        this.ip.removeAllElements();
        this.bS.removeAllElements();
        for (i58 = 0; i58 < this.kd.length; i58 = (byte)(i58 + 1)) {
          this.ip.addElement(this.kd[i58]);
        }
        this.bh.i.jdMethod_for();
        this.jdField_do = 26;
        break;
      case 6709: 
        i58 = paramDataInputStream.readByte();
        if (i58 == 1)
        {
          paramDataInputStream.readShort();
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          localObject6 = new byte[h.e5];
          paramDataInputStream.readFully((byte[])localObject6);
          i59 = paramDataInputStream.readShort();
          this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          this.bh.cZ.jdMethod_if((byte)8, i59);
          this.bh.cZ.h6 = ((byte[])localObject6);
          this.bh.cZ.e(this.bh.cZ.a((short)this.bh.e3[this.hZ], (byte)0));
          String str15 = "遗忘成功!";
          a(str15, (short)0, true, 9999);
        }
        this.bh.e3 = null;
        break;
      case 7102: 
        this.gM = 0;
        localObject6 = paramDataInputStream.readUTF();
        this.kX = this.bh.jdMethod_do((String)localObject6, h.dU - 10);
        this.bh.dJ = new o(this.bh);
        this.jdField_do = -33;
        break;
      case 6708: 
        i59 = paramDataInputStream.readByte();
        if (i59 == 1)
        {
          paramDataInputStream.readShort();
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          a("修改昵称成功!", (short)0, false, 9999);
          this.bh.cZ.O = this.bh.i.jdField_int.getString().trim();
        }
        this.bh.bM = null;
        break;
      case 4410: 
        i19 = paramDataInputStream.readByte();
        int i61 = paramDataInputStream.readShort();
        String str16 = paramDataInputStream.readUTF();
        if (a3.jdMethod_int(this.bh.cZ.H[i19], a.C) == i61)
        {
          this.bh.cZ.a7[i19] = -1;
          this.bh.cZ.H[i19] = a3.a(-1, a.C);
          jdMethod_do("失去 " + str16 + "1个");
        }
        break;
      case 6701: 
        this.k6 = paramDataInputStream.readByte();
        if (this.k6 == 1)
        {
          this.bH = true;
          gf = 0;
          this.e3 = 0;
          this.jdField_do = -123;
          return;
        }
        this.bO = paramDataInputStream.readInt();
        int i63 = paramDataInputStream.readByte();
        this.lL = new String[i63];
        this.bq = new short[i63][];
        this.ge = new int[i63][];
        if (h.cz) {
          this.lk = new String[i63][];
        }
        for (i64 = 0; i64 < i63; i64 = (byte)(i64 + 1))
        {
          this.lL[i64] = paramDataInputStream.readUTF();
          i65 = paramDataInputStream.readByte();
          this.bq[i64] = new short[i65];
          this.ge[i64] = new int[i65];
          if (h.cz) {
            this.lk[i64] = new String[i65];
          }
          for (i66 = 0; i66 < i65; i66 = (byte)(i66 + 1))
          {
            this.bq[i64][i66] = paramDataInputStream.readShort();
            this.ge[i64][i66] = paramDataInputStream.readInt();
            if (h.cz) {
              this.lk[i64][i66] = paramDataInputStream.readUTF();
            }
          }
        }
        i64 = (byte)this.bq[this.bh.i.l].length;
        this.dc = 0;
        short[] arrayOfShort1 = new short[i64];
        int[] arrayOfInt4 = new int[i64];
        for (b17 = 0; b17 < i64; b17 = (byte)(b17 + 1))
        {
          arrayOfShort1[b17] = this.bq[this.bh.i.l][b17];
          arrayOfInt4[b17] = this.ge[this.bh.i.l][b17];
        }
        this.bh.i.a(1, (byte)0, (byte)arrayOfShort1.length, arrayOfShort1, new short[arrayOfShort1.length]);
        this.bh.i.a(arrayOfShort1, false);
        for (b17 = 0; b17 < this.bs[0]; b17 = (byte)(b17 + 1)) {
          for (i67 = 0; i67 < i64; i67 = (byte)(i67 + 1)) {
            if (this.nl[0][b17] == arrayOfShort1[i67]) {
              this.lK[0][b17] = arrayOfInt4[i67];
            }
          }
        }
        this.jdField_do = 71;
        break;
      case 6789: 
        b17 = paramDataInputStream.readByte() == 0 ? 1 : 0;
        if (b17 == 0)
        {
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          i67 = paramDataInputStream.readByte();
          this.bh.i.jdMethod_for();
          this.j1 = -18;
          if (this.ip == null) {
            this.ip = new Vector();
          }
          if (this.bS == null) {
            this.bS = new Vector();
          }
          this.ip.removeAllElements();
          this.bS.removeAllElements();
          for (i68 = 0; i68 < i67; i68 = (byte)(i68 + 1))
          {
            this.bS.addElement(new Integer(paramDataInputStream.readInt()));
            this.ip.addElement(paramDataInputStream.readUTF());
          }
          this.jdField_do = -18;
        }
        break;
      case 6791: 
        this.bh.cZ.jdMethod_if((byte)0, paramDataInputStream.readInt());
        String str17 = paramDataInputStream.readUTF();
        if (str17.trim().length() > 0) {
          a(str17, (short)0, false, 9999);
        }
        break;
      case 6790: 
        i68 = paramDataInputStream.readByte() == 0 ? 1 : 0;
        i69 = paramDataInputStream.readByte() == 0 ? 1 : 0;
        String str18 = paramDataInputStream.readUTF();
        if (i68 != 0)
        {
          if (i69 == 0)
          {
            a(str18, (short)60, false, 9999);
          }
          else
          {
            this.e3 = 0;
            gf = 0;
            this.lr = str18;
            this.jdField_do = -19;
          }
        }
        else if (i69 == 0)
        {
          a(str18, (short)60, false, 9999);
        }
        else
        {
          this.bh.cZ.jdMethod_if((byte)0, paramDataInputStream.readInt());
          a(str18, (short)60, false, 9999);
        }
        break;
      case 3737: 
        b17 = paramDataInputStream.readByte() == 0 ? 1 : 0;
        if (b17 == 0)
        {
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          this.eJ = paramDataInputStream.readUTF();
          this.jy = paramDataInputStream.readUTF();
          i71 = paramDataInputStream.readByte();
          this.fG = new byte[i71];
          this.ie = new byte[i71];
          this.la = new String[i71];
          this.lG = new String[i71];
          this.iA = new String[i71];
          for (i72 = 0; i72 < i71; i72 = (byte)(i72 + 1))
          {
            this.fG[i72] = paramDataInputStream.readByte();
            this.ie[i72] = paramDataInputStream.readByte();
            this.la[i72] = paramDataInputStream.readUTF();
            this.lG[i72] = paramDataInputStream.readUTF();
            this.iA[i72] = paramDataInputStream.readUTF();
          }
          this.mZ = 0;
          this.gd = 0;
          this.cM = new String[] { "进入建筑", "升级建筑", "研发科技", "激活科技", "建筑说明" };
          this.jdField_do = -30;
        }
        break;
      case 6788: 
        b17 = paramDataInputStream.readByte() == 0 ? 1 : 0;
        if (b17 == 0)
        {
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          this.bh.cZ.jdMethod_if((byte)0, paramDataInputStream.readInt());
        }
        break;
      case 6718: 
        this.ir = paramDataInputStream.readByte();
        this.eF = new String[this.ir];
        for (i71 = 0; i71 < this.ir; i71++) {
          this.eF[i71] = paramDataInputStream.readUTF();
        }
        this.bh.i.jdMethod_for();
        if (this.c8 == null) {
          this.c8 = new Vector();
        }
        this.c8.removeAllElements();
        this.j1 = -106;
        for (i71 = 0; i71 < this.ir; i71 = (byte)(i71 + 1)) {
          this.c8.addElement(this.eF[i71]);
        }
        this.jdField_do = -106;
        break;
      case 6719: 
        this.lz = paramDataInputStream.readByte();
        this.kl = paramDataInputStream.readInt();
        this.na = paramDataInputStream.readUTF();
        gf = 0;
        this.e3 = 0;
        this.jdField_do = -107;
        break;
      case 4009: 
        this.bh.jdMethod_new(paramDataInputStream);
        break;
      case 3723: 
      case 3724: 
        a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        break;
      case 6707: 
        i71 = paramDataInputStream.readByte();
        i72 = paramDataInputStream.readShort();
        String str19 = paramDataInputStream.readUTF();
        if (i71 == 0) {
          this.bh.cZ.a((byte)1, i72, 1, false);
        }
        a(str19, (short)0, true, 9999);
        break;
      case 6720: 
        i74 = paramDataInputStream.readByte();
        int i75 = paramDataInputStream.readByte() == 0 ? 1 : 0;
        int i77 = paramDataInputStream.readInt();
        String str20 = paramDataInputStream.readUTF();
        if ((i75 != 0) && (i74 == 0))
        {
          this.dE = i77;
          this.f9 = str20;
          this.jdField_do = (this.hP == 0 ? -121 : -122);
          this.e3 = 0;
          this.bh.cZ.jdMethod_if((byte)0, i77);
        }
        else
        {
          a(str20, (short)0, false, 9999);
          this.bh.cZ.jdMethod_if((byte)0, i77);
        }
        break;
      case 6721: 
        a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        break;
      case 6706: 
        int i78 = paramDataInputStream.readByte();
        if (i78 == 1)
        {
          paramDataInputStream.readShort();
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          b18 = paramDataInputStream.readByte();
          s16 = paramDataInputStream.readShort();
          this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          this.bh.cZ.jdMethod_do(b18, s16);
          this.bh.a(b18, s16);
        }
        break;
      case 6704: 
        b18 = paramDataInputStream.readByte();
        s16 = paramDataInputStream.readShort();
        String str21 = paramDataInputStream.readUTF();
        if (b18 == 0) {
          this.bh.cZ.a((byte)1, s16, 1, false);
        }
        a(str21, (short)0, true, 9999);
        break;
      case 6705: 
        this.bh.av = paramDataInputStream.readShort();
        this.bh.fw = paramDataInputStream.readShort();
        if (this.bh.av >= this.bh.fw) {
          this.bh.a((byte)0, false);
        } else {
          this.bh.a((byte)0, true);
        }
        break;
      case 6703: 
        i58 = paramDataInputStream.readByte();
        if (i58 == 1)
        {
          paramDataInputStream.readShort();
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        }
        else
        {
          byte[] arrayOfByte11 = new byte[54];
          paramDataInputStream.readFully(arrayOfByte11);
          this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          this.bh.cZ.a(arrayOfByte11);
          String str22 = "洗点成功!";
          a(str22, (short)0, true, 9999);
        }
        break;
      case 3722: 
        int i79 = paramDataInputStream.readByte();
        if (i79 == 1) {
          this.bh.S.a(this.bh.S.jdField_new, this);
        } else {
          this.bh.S.a(this.bh.S.s, this);
        }
        break;
      case 3753: 
        if (this.bh.cZ.fL < 0) {
          return;
        }
        this.cN = paramDataInputStream.readShort();
        this.hL = paramDataInputStream.readShort();
        this.cf = paramDataInputStream.readShort();
        this.cc = paramDataInputStream.readShort();
        this.jL = paramDataInputStream.readShort();
        this.g0 = paramDataInputStream.readShort();
        break;
      case 3752: 
        if (dD != 4) {
          return;
        }
        if (this.bh.cZ.fL < 0) {
          return;
        }
        if (!this.ki) {
          return;
        }
        this.bh.cZ.d();
        if (this.bh.aG.jdMethod_int(4501))
        {
          this.bh.aG.jdMethod_do(0);
          this.bh.aG.jdMethod_if();
        }
        Display.getDisplay(this.bh.fG).setCurrent(this.bh);
        this.jdField_do = -23;
        break;
      case 3751: 
        if (dD != 4) {
          return;
        }
        if (this.bh.cZ.fL < 0) {
          return;
        }
        if (this.ki) {
          return;
        }
        this.bh.cZ.d();
        if (this.bh.aG.jdMethod_int(4501))
        {
          this.bh.aG.jdMethod_do(1);
          this.bh.aG.jdMethod_if();
        }
        Display.getDisplay(this.bh.fG).setCurrent(this.bh);
        this.jdField_do = -22;
        break;
      case 3755: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        break;
      case 3754: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        break;
      case 3721: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        int i80 = paramDataInputStream.readInt();
        int i81 = paramDataInputStream.readInt();
        a("当前公会基金余额为 " + i80 + ",公会每日维护费用为" + i81 + "(若公会每日维护费用不足，公会功能将处于冻结状态).", (short)0, false, 9999);
        break;
      case 3718: 
      case 3719: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        int i82 = paramDataInputStream.readInt();
        if (paramInt1 == 3719)
        {
          a("取出成功,当前公会基金余额为 " + i82 + ".", (short)0, false, 9999);
          this.bh.cZ.jdMethod_do(a3.jdMethod_do(this.mn, 4), false);
        }
        else
        {
          int i83 = paramDataInputStream.readInt();
          i87 = paramDataInputStream.readInt();
          a("捐献成功.当前公会基金余额为 " + i82 + ",公会繁荣度提升" + i83 + "点,角色贡献度提升" + i87 + "点.", (short)0, false, 9999);
          this.bh.cZ.a(a3.jdMethod_do(this.mn, 4), false);
        }
        break;
      case 3720: 
        this.eC = paramDataInputStream.readShort();
        this.hS = paramDataInputStream.readByte();
        if ((this.eC >= 0) && (this.eC == this.bh.cZ.ge) && (this.bh.cZ.gm == 0)) {
          this.hS = 0;
        }
        break;
      case 3750: 
        if (this.bh.cZ.fL < 0) {
          return;
        }
        this.mx = paramDataInputStream.readShort();
        this.m5 = (paramDataInputStream.readByte() == 0);
        break;
      case 3717: 
        this.bh.cZ.fj = -1;
        this.bh.cZ.es = "";
        this.bh.cZ.fL = -1;
        this.bh.cZ.jdMethod_if((byte)50, 0);
        jdMethod_do(paramDataInputStream.readUTF());
        if ((dD == 4) && (this.ki))
        {
          this.bh.cZ.d();
          if (this.bh.aG.jdMethod_int(4501))
          {
            this.bh.aG.jdMethod_do(0);
            this.bh.aG.jdMethod_if();
          }
          Display.getDisplay(this.bh.fG).setCurrent(this.bh);
          this.jdField_do = 21;
        }
        break;
      case 4507: 
        break;
      case 6563: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        this.bh.e0.a(paramDataInputStream);
        for (int i84 = 0; i84 < this.bs.length; i84 = (byte)(i84 + 1)) {
          for (i87 = 0; i87 < this.bs[i84]; i87 = (byte)(i87 + 1)) {
            if (a3.jdMethod_do(this.jv[i84][i87], 2) > 0) {
              this.bh.cZ.jdMethod_if((byte)0, this.nl[i84][i87], a3.jdMethod_do(this.jv[i84][i87], 2));
            }
          }
        }
        a("取出成功.", (short)0, false, 9999);
        this.bh.e0 = null;
        break;
      case 6562: 
      case 6564: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        for (int i85 = 0; i85 < this.bs[0]; i85 = (byte)(i85 + 1)) {
          if (a3.jdMethod_do(this.jv[0][i85], 2) > 0) {
            this.bh.cZ.a((byte)0, this.nl[0][i85], a3.jdMethod_do(this.jv[0][i85], 2), false);
          }
        }
        if (paramInt1 == 6564)
        {
          a("赠送成功.", (short)0, false, 9999);
        }
        else
        {
          this.bh.e0.a(paramDataInputStream);
          a("存入仓库成功.", (short)0, false, 9999);
        }
        this.bh.e0 = null;
        this.bh.i.jdMethod_if();
        break;
      case 6565: 
        this.bN = true;
        jdMethod_do(paramDataInputStream.readUTF());
        break;
      case 6561: 
        this.bh.e0.a(paramDataInputStream);
        this.bN = false;
        if (this.bh.e0.jdField_do == 0) {
          this.bh.e0.a((byte)0);
        } else if (this.bh.e0.jdField_do == 1) {
          this.bh.e0.a((byte)1);
        }
        break;
      case 3565: 
        a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        break;
      case 3507: 
        this.bh.dV = null;
        this.bh.jdField_else = 0;
        this.bh.cZ.gE = false;
        this.bh.cZ.dU = false;
        break;
      case 4504: 
        if (!this.ki) {
          return;
        }
        int i86 = paramDataInputStream.readByte();
        for (i87 = 0; i87 < i86; i87 = (byte)(i87 + 1))
        {
          int i89 = paramDataInputStream.readShort();
          localObject7 = paramDataInputStream.readUTF();
          String str23 = paramDataInputStream.readUTF();
          i92 = paramDataInputStream.readByte();
          byte b19 = paramDataInputStream.readByte();
          i94 = paramDataInputStream.readShort();
          i95 = paramDataInputStream.readByte();
          if ((i89 == this.jdField_if) && (!((String)localObject7).equals(this.bh.cZ.O))) {
            for (int i97 = 0; i97 < this.kT; i97 = (byte)(i97 + 1)) {
              if (hm[i97].O.equals(localObject7))
              {
                hm[i97].a((byte)0, (short)-1, str23, i92, b19, i94, i95);
                break;
              }
            }
          }
        }
        break;
      case 4503: 
        if (!this.ki) {
          return;
        }
        if ((this.jdField_do == 5) || (this.jdField_do == 21)) {
          return;
        }
        int i88 = paramDataInputStream.readShort();
        if (i88 != this.jdField_if) {
          return;
        }
        this.jA = Math.max(20, this.kp);
        this.kp = 0;
        int i90 = paramDataInputStream.readShort();
        localObject7 = new boolean[30];
        int i91 = 0;
        i92 = 0;
        int i93 = ag.hF;
        i94 = ag.hE;
        if (i90 >= 30)
        {
          i91 = 1;
          i92 = 15;
        }
        for (i95 = 0; i95 < i90; i96 = (byte)(i95 + 1))
        {
          String str24 = paramDataInputStream.readUTF();
          byte b20 = paramDataInputStream.readByte();
          b22 = paramDataInputStream.readByte();
          i100 = paramDataInputStream.readByte() > 0 ? 1 : 0;
          boolean bool1 = paramDataInputStream.readByte() > 0;
          b24 = paramDataInputStream.readByte();
          i105 = (b24 & 0x1) > 0 ? 1 : 0;
          b25 = paramDataInputStream.readByte();
          b26 = paramDataInputStream.readByte();
          i108 = paramDataInputStream.readShort();
          i109 = paramDataInputStream.readShort();
          i111 = paramDataInputStream.readShort();
          short[] arrayOfShort2 = new short[a.ad];
          for (i114 = 0; i114 < arrayOfShort2.length; i114 = (byte)(i114 + 1)) {
            arrayOfShort2[i114] = paramDataInputStream.readShort();
          }
          i114 = paramDataInputStream.readInt();
          String str30 = "";
          if (i114 != -1) {
            str30 = paramDataInputStream.readUTF();
          }
          byte b27 = paramDataInputStream.readByte();
          i117 = paramDataInputStream.readInt();
          i119 = paramDataInputStream.readByte();
          i120 = paramDataInputStream.readByte() == 0 ? 0 : 1;
          i121 = paramDataInputStream.readByte() == 0 ? 0 : 1;
          byte[] arrayOfByte12 = new byte[54];
          paramDataInputStream.readFully(arrayOfByte12);
          i124 = paramDataInputStream.readShort();
          i125 = paramDataInputStream.readByte();
          String str33 = null;
          if (i125 >= 0) {
            str33 = paramDataInputStream.readUTF();
          }
          if (str24.equals(this.bh.cZ.O))
          {
            this.bh.cZ.eb = i124;
          }
          else if ((i91 == 0) || ((i91 != 0) && (h.a(i108, i109, 20, 31, i93 + i92, i94 + i92, h.dU - 2 * i92, h.fp - 2 * i92))))
          {
            int i126 = 0;
            Object localObject8;
            for (int i127 = 0; i127 < this.kT; i127 = (byte)(i127 + 1)) {
              if (str24.equals(hm[i127].O))
              {
                localObject7[i127] = 1;
                i126 = 1;
                localObject8 = hm[i127];
                ((a3)localObject8).O = str24;
                ((ag)localObject8).jdMethod_void(b20);
                ((ag)localObject8).m(b22);
                ((ag)localObject8).fa = i100;
                ((ag)localObject8).hv = i105;
                ((ag)localObject8).g4 = bool1;
                ((ag)localObject8).hP = b25;
                ((ag)localObject8).hO = b26;
                this.bh.a((ag)localObject8, b24);
                ((ag)localObject8).fL = i114;
                ((ag)localObject8).es = str30;
                ((ag)localObject8).fx = b27;
                ((ag)localObject8).gz = i117;
                ((ag)localObject8).dU = i120;
                ((ag)localObject8).fj = i119;
                ((ag)localObject8).he = i121;
                ((ag)localObject8).eb = i124;
                ((a3)localObject8).a(arrayOfByte12);
                ((a3)localObject8).a7 = arrayOfShort2;
                int[] arrayOfInt5 = new int[a.ad];
                for (i132 = 0; i132 < arrayOfInt5.length; i132 = (byte)(i132 + 1)) {
                  arrayOfInt5[i132] = a3.a(arrayOfShort2[i132], a.C);
                }
                ((a3)localObject8).H = arrayOfInt5;
                ((ag)localObject8).eN = i125;
                ((ag)localObject8).eB = str33;
                if (((ag)localObject8).fv == 4) {
                  ((ag)localObject8).g((byte)0);
                }
                if (1 == h.h(i111))
                {
                  if (((a3)localObject8).aD == this.bh.cZ)
                  {
                    if (this.bh.cZ.gV == localObject8) {
                      this.bh.cZ.gV = null;
                    }
                    if (this.bh.cZ.ep == localObject8) {
                      this.bh.cZ.ep = null;
                    }
                  }
                  ((a3)localObject8).jdMethod_if((byte)16, 0);
                  if (((a3)localObject8).a4 == 0) {
                    ((a3)localObject8).a4 = 10;
                  }
                }
                else if (((a3)localObject8).a4 == 10)
                {
                  ((a3)localObject8).a4 = 0;
                }
                ((ag)localObject8).dT = i108;
                ((ag)localObject8).dS = i109;
                if ((((ag)localObject8).hB) && (((ag)localObject8).dz > 0))
                {
                  if (this.bh.aG.jdMethod_int(4502))
                  {
                    this.bh.aG.jdMethod_new(this.jdField_if);
                    this.bh.aG.jdMethod_if(((a3)localObject8).O);
                    this.bh.aG.jdMethod_do(3);
                    this.bh.aG.jdMethod_do(-1);
                    this.bh.aG.jdMethod_new(((ag)localObject8).dz);
                    this.bh.aG.jdMethod_do((!this.e7) && (!this.ki) ? 1 : 0);
                    this.bh.aG.jdMethod_if();
                  }
                  ((ag)localObject8).dz = 0;
                }
                ((ag)localObject8).gf = 0;
                ((ag)localObject8).fV = 0;
                ((ag)localObject8).hB = false;
                ((ag)localObject8).fP = i127;
              }
            }
            if ((i126 == 0) && (this.kT < 30))
            {
              ag localag = new ag(this.bh);
              localag.jdMethod_if(this.bh.b0);
              localag.O = str24;
              localag.fp = 0;
              localag.T = false;
              localag.ao = false;
              localag.hU = false;
              localag.a4 = 0;
              localag.jdMethod_void(b20);
              localag.m(b22);
              localag.fa = i100;
              localag.hv = i105;
              localag.g4 = bool1;
              this.bh.a(localag, b24);
              localag.fL = i114;
              localag.fx = b27;
              localag.es = str30;
              localag.gz = i117;
              localag.dU = i120;
              localag.hP = b25;
              localag.hO = b26;
              localag.fj = i119;
              localag.he = i121;
              localag.eb = i124;
              localag.a(arrayOfByte12);
              localag.a7 = arrayOfShort2;
              localObject8 = new int[a.ad];
              for (i129 = 0; i129 < localObject8.length; i129 = (byte)(i129 + 1)) {
                localObject8[i129] = a3.a(arrayOfShort2[i129], a.C);
              }
              localag.H = ((int[])localObject8);
              localag.eN = i125;
              localag.eB = str33;
              localag.g((byte)0);
              localag.eP = null;
              if (1 == h.h(i111)) {
                localag.jdMethod_if((byte)16, 0);
              }
              localag.aP = i108;
              localag.aM = i109;
              localag.dT = i108;
              localag.dS = i109;
              localag.X();
              localObject7[this.kT] = 1;
              localag.fP = ((byte)this.kT);
              hm[this.kT] = localag;
              this.kT = ((short)(this.kT + 1));
            }
          }
        }
        for (i96 = 0; i96 < this.kT; i96 = (byte)(i96 + 1)) {
          if (localObject7[i96] == 0)
          {
            while ((localObject7[(this.kT - 1)] == 0) && (i96 < this.kT - 1))
            {
              hm[(this.kT - 1)] = null;
              this.kT = ((short)(this.kT - 1));
            }
            if ((hm[i96] != null) && (hm[i96].aD == this.bh.cZ))
            {
              if (this.bh.cZ.gV == hm[i96]) {
                this.bh.cZ.gV = null;
              }
              if (this.bh.cZ.ep == hm[i96]) {
                this.bh.cZ.ep = null;
              }
            }
            hm[i96] = hm[(this.kT - 1)];
            hm[(this.kT - 1)] = null;
            this.kT = ((short)(this.kT - 1));
          }
        }
        break;
      case 4501: 
        i96 = paramDataInputStream.readByte();
        int i98 = paramDataInputStream.readByte();
        if (i98 == 0)
        {
          if (i96 == 1)
          {
            this.ki = false;
            this.bh.z();
            this.bh.jdMethod_byte();
            jdMethod_null();
            this.bh.P();
            r();
            this.jdField_do = 0;
            this.bh.cZ.gV = null;
            this.bh.cZ.ep = null;
            ar.k();
            this.kp = 0;
          }
          else
          {
            a("操作失败!", (short)0, false, 9999);
          }
        }
        else if (i98 == 1) {
          if (i96 == 1)
          {
            this.ki = true;
            g();
            this.bh.jdMethod_byte();
            this.bh.jdMethod_try();
            this.bh.P();
            r();
            this.jdField_do = 0;
            this.bh.cZ.gV = null;
            this.bh.cZ.ep = null;
            ar.k();
            this.il = new int[5];
            this.bh.b0.a(58, 0, this.il);
            this.kp = 0;
            this.jA = 0;
            this.bh.cZ.ek = false;
            this.bh.cZ.eb = 0;
            this.bh.A();
          }
          else
          {
            a("操作失败!", (short)0, false, 9999);
          }
        }
        break;
      case 4007: 
        if (this.jdField_do == 5) {
          return;
        }
        if ((dD != 1) || (this.ki) || (this.e7)) {
          return;
        }
        if ((dZ == 1) && (!this.bh.cZ.gE)) {
          return;
        }
        b21 = paramDataInputStream.readByte();
        for (b22 = 0; b22 < b21; b22 = (byte)(b22 + 1))
        {
          i100 = paramDataInputStream.readShort();
          String str25 = paramDataInputStream.readUTF();
          b24 = paramDataInputStream.readByte();
          i105 = paramDataInputStream.readShort();
          b25 = paramDataInputStream.readByte();
          b26 = paramDataInputStream.readByte();
          if (!str25.equals(this.bh.cZ.O))
          {
            i108 = 0;
            for (i109 = 0; i109 < ar.ce.length; i109 = (byte)(i109 + 1)) {
              if (ar.ce[i109] == i100)
              {
                i108 = 1;
                break;
              }
            }
            if (i108 != 0) {
              if ((dZ == 1) && (this.bh.cZ.gE) && (this.g6 != null) && (this.g6.length > 0))
              {
                i109 = 0;
                for (i111 = 0; i111 < this.g6.length; i112 = (byte)(i111 + 1)) {
                  if (this.g6[i111].equals(str25))
                  {
                    i109 = 1;
                    break;
                  }
                }
                if (i109 == 0) {}
              }
              else
              {
                ar.a(i100, str25, b24, i105, b25, b26);
                ar.a(i100, str25, b24, i105, b25, b26);
              }
            }
          }
        }
        break;
      case 3609: 
        if (this.jdField_do == 5) {
          return;
        }
        if ((dD != 2) || (dZ != 1)) {
          return;
        }
        if ((!this.bh.cZ.gE) || (this.iJ)) {
          return;
        }
        int i99 = 0;
        int i101;
        for (i100 = 0; i100 < jS.length; i101 = (byte)(i100 + 1)) {
          if (!jS[i100].cf) {
            i99 = 1;
          }
        }
        if (i99 == 0) {
          return;
        }
        b21 = paramDataInputStream.readByte();
        for (byte b23 = 0; b23 < b21; b23 = (byte)(b23 + 1))
        {
          short s17 = paramDataInputStream.readShort();
          String str26 = paramDataInputStream.readUTF();
          i105 = paramDataInputStream.readByte();
          short s18 = paramDataInputStream.readShort();
          b26 = paramDataInputStream.readByte();
          i108 = paramDataInputStream.readByte();
          if (!str26.equals(this.bh.cZ.O))
          {
            i109 = 0;
            for (i112 = 0; i112 < ar.ce.length; i112 = (byte)(i112 + 1)) {
              if (ar.ce[i112] == s17)
              {
                i109 = 1;
                break;
              }
            }
            if (i109 != 0) {
              if ((dZ == 1) && (this.bh.cZ.gE) && (this.g6 != null) && (this.g6.length > 0))
              {
                i112 = 0;
                for (i113 = 0; i113 < this.g6.length; i113 = (byte)(i113 + 1)) {
                  if (this.g6[i113].equals(str26))
                  {
                    i112 = 1;
                    break;
                  }
                }
                if (i112 == 0) {}
              }
              else
              {
                ar.a(s17, str26, i105, s18, b26, i108);
              }
            }
          }
        }
        break;
      case 3511: 
        if ((!this.bh.cZ.gE) || (this.bh.cZ.jdMethod_else())) {
          return;
        }
        int i102 = paramDataInputStream.readByte();
        int i103 = paramDataInputStream.readInt();
        if (this.bh.cZ.a((byte)14) >= h.bm) {
          i103 = 0;
        }
        int i104 = Math.max(1, this.bh.cZ.a((byte)14) - i102);
        i104 = Math.min(i104, 3);
        i103 = Math.max(1, i103 / (i104 * i104));
        this.bh.cZ.jdMethod_do((byte)4, i103);
        synchronized (this.kP)
        {
          String str27 = "[" + b6[3] + "]" + "系统:" + paramDataInputStream.readUTF() + i103;
          if (this.kP.size() < 20)
          {
            if (this.kP.size() > 2) {
              this.kP.insertElementAt(str27, 1);
            } else {
              this.kP.addElement(str27);
            }
          }
          else {
            this.bh.a(4, str27, (byte)3, (byte)-1, (short)-1);
          }
        }
        this.bh.cZ.Z();
        break;
      case 4409: 
      case 4413: 
        int i106 = paramDataInputStream.readByte();
        int i107 = paramDataInputStream.readByte();
        String str28 = "";
        if (i106 == 0) {
          str28 = str28 + "获得 ";
        } else if (i106 == 1) {
          str28 = str28 + "失去 ";
        }
        for (s19 = 0; s19 < i107; s19 = (byte)(s19 + 1))
        {
          i109 = paramDataInputStream.readShort();
          str29 = paramDataInputStream.readUTF();
          i113 = paramDataInputStream.readShort();
          i114 = (byte)a3.jdMethod_do(i113, 2);
          if (i114 != 0)
          {
            if (i106 == 0)
            {
              str28 = str28 + str29 + i114 + "个";
              if (!this.bh.cZ.jdMethod_if((byte)(paramInt1 == 4413 ? 1 : 0), i109, i114)) {
                str28 = str28 + "(背包已满，该物品舍弃)";
              }
            }
            else if (i106 == 1)
            {
              if (this.bh.cZ.a((byte)(paramInt1 == 4413 ? 1 : 0), i109, i114, false)) {
                str28 = str28 + str29 + i114 + "个";
              }
            }
            str28 = str28 + " ";
          }
        }
        if (str28.trim().length() > 3) {
          jdMethod_do(str28);
        }
        break;
      case 4408: 
        this.bh.jdMethod_long(paramDataInputStream);
        s19 = 0;
        if ((this.bh.cZ.a((byte)24) < this.bh.cZ.a((byte)26) / 2) && (-1 != (s19 = this.bh.jdMethod_if((byte)111))))
        {
          this.bh.cJ.a(s19, true);
          this.bh.jdMethod_if(s19, true);
          this.bh.cJ.a(s19, false);
          this.bh.c((byte)2);
        }
        break;
      case 3713: 
        if (this.bh.cZ.fL >= 0)
        {
          this.bh.cZ.fj = 17;
          jdMethod_do(paramDataInputStream.readUTF());
        }
        break;
      case 3708: 
        if (this.bh.cZ.fL >= 0)
        {
          i110 = paramDataInputStream.readByte();
          str29 = paramDataInputStream.readUTF();
          if (i110 == 0)
          {
            this.bh.cZ.es = "";
            this.bh.cZ.fL = -1;
            this.bh.cZ.fj = -1;
            this.bh.cZ.jdMethod_if((byte)50, 0);
          }
          jdMethod_do(str29);
        }
        break;
      case 3704: 
        if (this.bh.cZ.fL < 0)
        {
          i110 = paramDataInputStream.readByte();
          str29 = paramDataInputStream.readUTF();
          if (i110 == 0)
          {
            this.bh.cZ.es = paramDataInputStream.readUTF();
            this.bh.cZ.fL = paramDataInputStream.readInt();
            this.bh.cZ.fx = paramDataInputStream.readByte();
            this.bh.cZ.fj = -1;
            this.bh.cZ.jdMethod_if((byte)50, 0);
          }
          jdMethod_do(str29);
        }
        break;
      case 3712: 
        if (paramDataInputStream.readByte() == 0)
        {
          this.bh.cZ.fj = -1;
          a("会长转移成功！", (short)0, false, 9999);
        }
        else
        {
          a("会长转移失败！", (short)0, false, 9999);
        }
        break;
      case 3709: 
        if (paramDataInputStream.readByte() == 0)
        {
          this.bh.cZ.a(this.eb, false);
          this.bh.cZ.fj = -1;
          this.bh.cZ.es = "";
          this.bh.cZ.fL = -1;
          this.bh.cZ.jdMethod_if((byte)50, 0);
          a("退出公会成功！", (short)0, false, 9999);
        }
        else
        {
          a("退出公会失败！", (short)0, false, 9999);
        }
        break;
      case 3711: 
        i110 = paramDataInputStream.readByte();
        str29 = paramDataInputStream.readUTF();
        if (i110 == 1)
        {
          this.bh.cZ.fj = -1;
          this.bh.cZ.es = "";
          this.bh.cZ.fL = -1;
          this.bh.cZ.jdMethod_if((byte)50, 0);
        }
        a(str29, (short)0, false, 9999);
        break;
      case 3705: 
        i113 = paramDataInputStream.readShort();
        if (i113 <= 1)
        {
          this.e3 = 0;
          this.jdField_do = -1;
        }
        else if (this.bh.cZ.fj == 17)
        {
          this.e3 = 0;
          this.jdField_do = -2;
        }
        else
        {
          this.e3 = 0;
          this.jdField_do = -3;
        }
        break;
      case 4304: 
        i114 = paramDataInputStream.readByte();
        int i115 = paramDataInputStream.readByte();
        String str31;
        if (i115 == 0)
        {
          str31 = paramDataInputStream.readUTF();
          a(str31, (short)0, false, 9999);
          i117 = paramDataInputStream.readByte();
          for (i119 = 0; i119 < i117; i119 = (byte)(i119 + 1))
          {
            i120 = paramDataInputStream.readShort();
            b21 = paramDataInputStream.readByte();
            this.bh.cZ.jdMethod_if((byte)0, i120, b21);
          }
        }
        else
        {
          str31 = "合成成功!";
          i117 = paramDataInputStream.readByte();
          if (i117 == 0)
          {
            str31 = str31 + " 强化";
            i119 = -1;
            for (i120 = 0; i120 < h.e8; i120 = (byte)(i120 + 1)) {
              if (h.gd[i120] == this.bh.cZ.a7[i114]) {
                i119 = i120;
              }
            }
            i120 = paramDataInputStream.readByte();
            i121 = paramDataInputStream.readByte();
            switch (i120)
            {
            case 0: 
              str31 = str31 + " 幸运+" + i121;
              int tmp18746_18744 = i119;
              short[] tmp18746_18741 = h.eY;
              tmp18746_18741[tmp18746_18744] = ((short)(tmp18746_18741[tmp18746_18744] + i121));
              break;
            case 1: 
              str31 = str31 + " 敏捷+" + i121;
              int tmp18794_18792 = i119;
              short[] tmp18794_18789 = h.dm;
              tmp18794_18789[tmp18794_18792] = ((short)(tmp18794_18789[tmp18794_18792] + i121));
              break;
            case 2: 
              str31 = str31 + " 暴击+" + i121;
              int tmp18842_18840 = i119;
              short[] tmp18842_18837 = h.d2;
              tmp18842_18837[tmp18842_18840] = ((short)(tmp18842_18837[tmp18842_18840] + i121));
              break;
            case 3: 
              str31 = str31 + " 命中+" + i121;
              int tmp18890_18888 = i119;
              short[] tmp18890_18885 = h.dQ;
              tmp18890_18885[tmp18890_18888] = ((short)(tmp18890_18885[tmp18890_18888] + i121));
              break;
            case 4: 
              str31 = str31 + " 威力+" + i121;
              int tmp18938_18936 = i119;
              short[] tmp18938_18933 = h.aR;
              tmp18938_18933[tmp18938_18936] = ((short)(tmp18938_18933[tmp18938_18936] + i121));
              break;
            case 5: 
              str31 = str31 + " 攻击距离+" + i121;
              int tmp18986_18984 = i119;
              short[] tmp18986_18981 = h.fH;
              tmp18986_18981[tmp18986_18984] = ((short)(tmp18986_18981[tmp18986_18984] + i121));
              break;
            case 6: 
              str31 = str31 + " 吸血+" + i121;
              int tmp19034_19032 = i119;
              short[] tmp19034_19029 = h.fP;
              tmp19034_19029[tmp19034_19032] = ((short)(tmp19034_19029[tmp19034_19032] + i121));
              break;
            case 7: 
              str31 = str31 + " 吸魔+" + i121;
              int tmp19082_19080 = i119;
              short[] tmp19082_19077 = h.eg;
              tmp19082_19077[tmp19082_19080] = ((short)(tmp19082_19077[tmp19082_19080] + i121));
            }
          }
          else
          {
            i119 = paramDataInputStream.readShort();
            str32 = paramDataInputStream.readUTF();
            str31 = str31 + " 合成出" + str32;
            for (i121 = 0; i121 < h.e8; i121 = (byte)(i121 + 1)) {
              if (h.gd[i121] == this.bh.cZ.a7[i114])
              {
                h.m[i121] = i119;
                h.bb[i121] = str32;
                h.eY[i121] = 0;
                h.dm[i121] = 0;
                h.d2[i121] = 0;
                h.dQ[i121] = 0;
                h.aR[i121] = 0;
                h.fP[i121] = 0;
                h.eg[i121] = 0;
                h.fH[i121] = 0;
                break;
              }
            }
            if ((h.G(i119) == 0) && (h.N(i119) != this.bh.cZ.bo))
            {
              this.bh.cZ.jdMethod_if((byte)0, (short)a3.jdMethod_int(this.bh.cZ.H[i114], a.C), 1);
              this.bh.cZ.a7[i114] = -1;
              this.bh.cZ.H[i114] = a3.a(-1, a.C);
              this.bh.cZ.fc[i114] = false;
            }
          }
          a(str31, (short)0, true, 9999);
        }
        break;
      case 4302: 
        if (paramInt2 == 1)
        {
          a(str1, (short)31, false, 9999);
          return;
        }
        int i116 = paramDataInputStream.readByte();
        this.bh.cZ.fc[i116] = false;
        a("解锁成功!", (short)31, false, 9999);
        break;
      case 4301: 
        if (paramInt2 == 1)
        {
          a(str1, (short)31, false, 9999);
          return;
        }
        int i118 = paramDataInputStream.readByte();
        short s20 = paramDataInputStream.readShort();
        str32 = paramDataInputStream.readUTF();
        if (this.bh.cZ.a7[i118] != s20)
        {
          this.bh.a(s20, this.bh.cZ.a7[i118], str32, true, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (byte)0);
          this.bh.cZ.a7[i118] = s20;
          this.bh.cZ.H[i118] = a3.a(s20, a.C);
        }
        this.bh.cZ.fc[i118] = true;
        a("锁定成功!", (short)31, false, 9999);
        this.bh.cZ.y();
        int i122;
        for (i121 = 0; i121 < 2; i122 = (byte)(i121 + 1)) {
          this.bh.i.a(2, i121, this.bh.cZ.gJ[i121], this.bh.cZ.gw[i121], this.bh.cZ.eX[i121]);
        }
        short[] arrayOfShort3 = new short[8];
        int i123 = 0;
        for (i124 = 0; i124 < this.bh.cZ.a7.length; i124 = (byte)(i124 + 1)) {
          if ((this.bh.cZ.a7[i124] != -1) && (-1 == this.bh.cZ.a((byte)0, this.bh.cZ.a7[i124])))
          {
            arrayOfShort3[i123] = this.bh.cZ.a7[i124];
            i123 = (byte)(i123 + 1);
          }
        }
        short[] arrayOfShort4 = new short[this.bh.cZ.gJ[0] + this.bh.cZ.gJ[1] + i123];
        System.arraycopy(this.bh.cZ.gw[0], 0, arrayOfShort4, 0, this.bh.cZ.gJ[0]);
        System.arraycopy(this.bh.cZ.gw[1], 0, arrayOfShort4, this.bh.cZ.gJ[0], this.bh.cZ.gJ[1]);
        System.arraycopy(arrayOfShort3, 0, arrayOfShort4, this.bh.cZ.gJ[0] + this.bh.cZ.gJ[1], i123);
        this.bh.i.a(arrayOfShort4, true);
        break;
      case 3734: 
        this.ip.removeAllElements();
        this.bS.removeAllElements();
        i125 = paramDataInputStream.readShort();
        for (s21 = 0; s21 < i125; s21 = (short)(s21 + 1))
        {
          str34 = paramDataInputStream.readUTF();
          i128 = paramDataInputStream.readInt();
          this.ip.addElement(str34);
          this.bS.addElement(new Integer(i128));
        }
        this.bh.i.jdMethod_for();
        this.j1 = -91;
        this.jdField_do = 26;
        break;
      case 3710: 
        this.ip.removeAllElements();
        this.bS.removeAllElements();
        this.iu = paramDataInputStream.readShort();
        this.lW = paramDataInputStream.readShort();
        this.dY = new Vector();
        this.k1 = new Vector();
        for (s21 = 0; s21 < this.lW; s21 = (short)(s21 + 1))
        {
          str34 = paramDataInputStream.readUTF();
          i128 = paramDataInputStream.readByte();
          s23 = paramDataInputStream.readByte();
          i129 = paramDataInputStream.readByte();
          if (!str34.equals(this.bh.cZ.O))
          {
            this.ip.addElement(ag.jdMethod_try(i129, s23) + " " + str34);
            this.bS.addElement(new Short((short)i128));
            this.dY.addElement(new Integer(s23));
            this.k1.addElement(new Byte(i129));
          }
        }
        if (this.fj == 0)
        {
          this.bh.i.jdMethod_for();
          this.j1 = 104;
          this.jdField_do = 26;
        }
        else
        {
          this.bh.i.jdMethod_for();
          this.j1 = -5;
          this.jdField_do = -5;
        }
        break;
      case 3512: 
        s21 = paramDataInputStream.readShort();
        if ((this.bh.cZ.gE) && (this.bh.cZ.jdMethod_else()) && (dZ == 1) && (this.bh.bR.a(s21)))
        {
          this.jdField_int = 0;
          this.jdField_do = 101;
        }
        break;
      case 3605: 
        this.bh.cZ.d();
        if ((this.bh.cZ.gE) && (dD == 2) && (dZ == 1))
        {
          s22 = paramDataInputStream.readShort();
          if (this.bh.bR.a(s22))
          {
            for (i128 = 0; i128 < jS.length; i128 = (byte)(i128 + 1)) {
              jS[i128].cf = true;
            }
            this.bh.dV = null;
            this.iJ = true;
            ar.s();
            this.bh.bR.a(s22, true);
            this.bh.o();
          }
        }
        break;
      case 3607: 
        s22 = paramDataInputStream.readShort();
        if ((this.bh.cZ.gE) && (this.bh.bR.a(s22))) {
          this.bh.jdField_else = paramDataInputStream.readInt();
        }
        break;
      case 3604: 
        s22 = paramDataInputStream.readShort();
        i128 = paramDataInputStream.readShort();
        if ((this.bh.cZ.gE) && (this.bh.bR.a(s22)))
        {
          s23 = paramDataInputStream.readByte();
          this.bh.dV = new int[s23];
          for (i130 = 0; i130 < s23; i130 = (byte)(i130 + 1))
          {
            i132 = paramDataInputStream.readInt();
            if ((this.jdField_if == i128) && (this.jdField_do == 0))
            {
              jS[i130].jdMethod_if((byte)16, i132);
              if (i132 == 0) {
                jS[i130].cf = true;
              }
            }
            this.bh.dV[i130] = i132;
          }
        }
        break;
      case 3602: 
        if ((this.bh.cZ.gE) && (dD == 1) && (dZ == 1))
        {
          s23 = paramDataInputStream.readShort();
          if (this.bh.bR.a(s23))
          {
            for (i130 = 0; i130 < ar.ce.length; i131 = (byte)(i130 + 1)) {
              if (this.bh.bR.jdMethod_int(s23).jdField_for[0] == ar.ce[i130]) {
                ar.dg = ar.ce[i130];
              }
            }
            this.bh.bR.a(s23, true);
          }
        }
        break;
      case 3510: 
        if (!this.bh.cZ.gE) {
          return;
        }
        String str35 = paramDataInputStream.readUTF();
        i131 = paramDataInputStream.readByte();
        String str36 = paramDataInputStream.readUTF();
        short s24 = paramDataInputStream.readShort();
        String str37 = paramDataInputStream.readUTF();
        if (i131 == 0)
        {
          if (!this.bh.cZ.jdMethod_else())
          {
            this.bh.a(s24, this.bh.cZ.aP, this.bh.cZ.aM, (byte)1);
            this.bh.cZ.jdMethod_do((byte)16, s24);
            if (this.bh.cZ.a((byte)16) > this.bh.cZ.a((byte)20)) {
              this.bh.cZ.jdMethod_if((byte)16, this.bh.cZ.a((byte)20));
            }
            jdMethod_do(str37);
            this.bh.c((byte)1);
          }
        }
        else if ((i131 == 1) && (str36.equals(this.bh.cZ.O)) && (this.bh.cZ.jdMethod_else()))
        {
          this.bh.cZ.T = false;
          this.bh.cZ.ao = false;
          this.bh.cZ.hU = false;
          this.bh.cZ.a4 = 0;
          if (this.bh.cZ.a((byte)16) == 0) {
            this.bh.cZ.jdMethod_if((byte)16, 1);
          }
          this.bh.c((byte)1);
          jdMethod_do(str37);
          if ((this.ki) && (this.bh.cZ.fL >= 0) && (this.bh.aG.jdMethod_int(3758)))
          {
            this.bh.aG.jdMethod_for(this.bh.cZ.fL);
            this.bh.aG.jdMethod_if(this.bh.cZ.O);
            this.bh.aG.jdMethod_if();
          }
        }
        break;
      case 3508: 
        if (!this.bh.cZ.gE) {
          return;
        }
        if (paramDataInputStream.readInt() != this.bh.cZ.gz) {
          return;
        }
        String str38 = paramDataInputStream.readUTF();
        this.bh.cZ.gz = -1;
        this.bh.cZ.gE = false;
        this.bh.cZ.dU = false;
        if ((dD == 2) && (dZ == 1) && (!this.iJ))
        {
          this.bh.o();
          str38 = str38 + " 战斗失败!";
        }
        jdMethod_do(str38);
        break;
      case 3703: 
      case 3707: 
        i133 = paramDataInputStream.readByte();
        for (i134 = 0; i134 < this.ip.size(); i134 = (byte)(i134 + 1)) {
          if (((String)this.ip.elementAt(i134)).equals(this.b5))
          {
            this.ip.removeElementAt(i134);
            this.bS.removeElementAt(i134);
            break;
          }
        }
        this.bh.i.jdMethod_for();
        if (i133 == 0) {
          this.jdField_do = 26;
        } else {
          a("操作失败!", (short)26, false, 9999);
        }
        break;
      case 3733: 
        this.ip.removeElementAt(this.hZ);
        this.bS.removeElementAt(this.hZ);
        this.bh.i.jdMethod_for();
        this.jdField_do = 26;
        break;
      case 3503: 
        i133 = paramDataInputStream.readByte();
        if ((i133 == 0) && (this.gd == 0))
        {
          this.bh.cZ.gz = paramDataInputStream.readInt();
          this.bh.cZ.gE = true;
          this.bh.cZ.dU = true;
          if (this.bh.aG.jdMethod_int(3505))
          {
            this.bh.aG.jdMethod_for(this.bh.cZ.gz);
            this.bh.aG.jdMethod_if();
          }
        }
        for (i134 = 0; i134 < this.ip.size(); i134 = (byte)(i134 + 1)) {
          if (((String)this.ip.elementAt(i134)).equals(this.b5))
          {
            this.ip.removeElementAt(i134);
            this.bS.removeElementAt(i134);
            break;
          }
        }
        this.bh.i.jdMethod_for();
        this.jdField_do = 26;
        break;
      case 3563: 
        i134 = paramDataInputStream.readByte();
        String str39 = paramDataInputStream.readUTF();
        a("" + str39, (short)0, false, 9999);
        break;
      case 3564: 
        int i135 = paramDataInputStream.readByte();
        for (i136 = 0; i136 < this.j8.size(); i136 = (byte)(i136 + 1)) {
          if (((String)this.j8.elementAt(i136)).equals(this.b5))
          {
            this.j8.removeElementAt(i136);
            this.bS.removeElementAt(i136);
            break;
          }
        }
        if ((this.gd == 0) || (this.gd == 1))
        {
          this.bh.i.jdMethod_for();
          this.jdField_do = 0;
        }
        break;
      case 3562: 
        i136 = paramDataInputStream.readByte();
        if (i136 == 1)
        {
          String str40 = paramDataInputStream.readUTF();
          a("" + str40, (short)0, false, 9999);
        }
        for (i137 = 0; i137 < this.nk.size(); i137 = (byte)(i137 + 1)) {
          if (((String)this.nk.elementAt(i137)).equals(this.b5))
          {
            this.nk.removeElementAt(i137);
            this.bS.removeElementAt(i137);
            break;
          }
        }
        if ((this.gd == 0) || (this.gd == 1))
        {
          this.bh.i.jdMethod_for();
          this.jdField_do = 0;
        }
        break;
      case 3560: 
        switch (this.fO)
        {
        case 0: 
          i137 = paramDataInputStream.readByte();
          if (i137 == 0)
          {
            this.mp = paramDataInputStream.readUTF();
            this.b5 = this.mp;
            this.c0 = paramDataInputStream.readInt();
            if (this.j8 == null) {
              this.j8 = new Vector();
            }
            this.j8.removeAllElements();
            this.j8.addElement("情侣是." + this.mp);
            this.j8.addElement("亲密度." + this.c0);
            this.jdField_do = -108;
          }
          else
          {
            a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          }
          break;
        case 1: 
          int i138 = paramDataInputStream.readByte();
          if (i138 == 0)
          {
            this.mH = paramDataInputStream.readUTF();
            this.b5 = this.mH;
            this.kF = paramDataInputStream.readInt();
            this.gW = paramDataInputStream.readInt();
            if (this.nk == null) {
              this.nk = new Vector();
            }
            this.nk.removeAllElements();
            if (this.kF == 1)
            {
              this.nk.addElement("师父是.：" + this.mH);
              this.nk.addElement("师父师德值." + this.gW);
            }
            if (this.kF == -1)
            {
              this.nk.addElement("徒弟是." + this.mH);
              this.nk.addElement("师德值." + this.gW);
            }
            this.jdField_do = -109;
          }
          else
          {
            a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          }
          break;
        }
        break;
      case 3504: 
        i137 = paramDataInputStream.readByte();
        String str41 = null;
        if (i137 == 0)
        {
          str41 = paramDataInputStream.readUTF();
          this.bh.cZ.gz = paramDataInputStream.readInt();
          this.bh.cZ.dU = false;
          this.bh.cZ.gE = true;
          if (this.bh.aG.jdMethod_int(3505))
          {
            this.bh.aG.jdMethod_for(this.bh.cZ.gz);
            this.bh.aG.jdMethod_if();
          }
        }
        else
        {
          str41 = paramDataInputStream.readUTF();
        }
        jdMethod_do(str41);
        break;
      case 3500: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, true, 9999);
          return;
        }
        int i139 = paramDataInputStream.readShort();
        this.ip.removeAllElements();
        this.bS.removeAllElements();
        for (i140 = 0; i140 < i139; i140 = (byte)(i140 + 1))
        {
          this.bS.addElement(new Byte(paramDataInputStream.readByte()));
          this.ip.addElement(paramDataInputStream.readUTF());
        }
        this.jdField_do = 26;
        break;
      case 5844: 
        this.bh.ck.a(paramDataInputStream);
        break;
      case 4108: 
        i140 = paramDataInputStream.readByte();
        jdMethod_do(paramDataInputStream.readUTF());
        if (i140 == 1)
        {
          this.bh.cZ.he = true;
          this.bh.cZ.ii = 0;
        }
        else
        {
          this.bh.cZ.he = false;
          this.bh.cZ.ii = 0;
        }
        break;
      case 4505: 
        if (dD != 1) {
          return;
        }
        if ((this.bh.cZ.a8) || (this.ki) || (this.bh.cZ.jdMethod_else())) {
          return;
        }
        i141 = paramDataInputStream.readByte();
        for (int i142 = 0; i142 < i141; i142 = (byte)(i142 + 1))
        {
          short s25 = paramDataInputStream.readShort();
          String str44 = paramDataInputStream.readUTF();
          b28 = paramDataInputStream.readByte();
          b29 = paramDataInputStream.readByte();
          i148 = paramDataInputStream.readShort();
          b30 = paramDataInputStream.readByte();
          b31 = paramDataInputStream.readByte();
          boolean bool2 = paramDataInputStream.readByte() > 0;
          boolean bool3 = paramDataInputStream.readByte() > 0;
          byte b32 = paramDataInputStream.readByte();
          byte b33 = paramDataInputStream.readByte();
          i157 = paramDataInputStream.readByte();
          s32 = paramDataInputStream.readShort();
          s33 = paramDataInputStream.readShort();
          short[] arrayOfShort5 = new short[8];
          for (i163 = 0; i163 < arrayOfShort5.length; i163 = (byte)(i163 + 1)) {
            arrayOfShort5[i163] = paramDataInputStream.readShort();
          }
          i163 = paramDataInputStream.readInt();
          byte b34 = paramDataInputStream.readByte();
          boolean bool4 = paramDataInputStream.readByte() != 0;
          boolean bool5 = paramDataInputStream.readByte() != 0;
          byte b35 = paramDataInputStream.readByte();
          if (s25 == this.jdField_if) {
            if ((this.jdField_do != 0) && (!this.bh.cZ.jdMethod_else()) && (!this.bh.cZ.a8))
            {
              this.bh.cZ.jdMethod_for((byte)16, i148);
              if (this.bh.cZ.a((byte)16) <= 0)
              {
                this.bh.cZ.aD = new ag(this.bh);
                this.bh.cZ.aD.O = str44;
                this.bh.cZ.V();
              }
            }
            else
            {
              this.bh.a(s25, str44, b28, b29, i148, b31, b30, i163, bool4, b34, bool5, arrayOfShort5, s32, s33, b35, bool2, bool3, b32, b33, i157);
            }
          }
        }
        break;
      case 4003: 
        if (dD == 0) {
          return;
        }
        i141 = paramDataInputStream.readByte();
        if (h.bN + i141 >= h.y) {
          this.bh.jdMethod_int();
        }
        for (int i143 = 0; i143 < i141; i143 = (byte)(i143 + 1))
        {
          String str43 = paramDataInputStream.readUTF();
          s26 = paramDataInputStream.readShort();
          b28 = paramDataInputStream.readByte();
          b29 = paramDataInputStream.readByte();
          i148 = paramDataInputStream.readShort();
          b30 = paramDataInputStream.readByte();
          short s27;
          if ((dD == 1) && ((b28 == 3) || (b28 == 4) || (b28 == 7))) {
            s27 = (short)(i148 * h.jdMethod_if(10, 20) / 10);
          }
          this.bh.a(str43, s26, b28, b29, s27, b30);
        }
        break;
      case 4019: 
        if (paramInt2 == 1) {
          return;
        }
        str42 = "";
        int i144 = paramDataInputStream.readByte();
        if (i144 == 1)
        {
          s26 = paramDataInputStream.readShort();
          String str45 = paramDataInputStream.readUTF();
          if (this.bh.cZ.jdMethod_if((byte)0, s26, 1)) {
            str42 = str42 + "获得" + str45 + "1个 ";
          }
        }
        s26 = paramDataInputStream.readByte();
        if (s26 == 1)
        {
          int i145 = paramDataInputStream.readInt();
          this.bh.cZ.jdMethod_do(i145, false);
          str42 = str42 + "获得金钱" + i145;
        }
        if (str42.trim().length() > 0) {
          jdMethod_do(str42);
        }
        break;
      case 6332: 
        if (paramDataInputStream.readByte() == 1)
        {
          a(paramDataInputStream.readUTF(), (short)this.bh.D, false, 9999);
          this.bh.cZ.jdMethod_if((byte)0, paramDataInputStream.readInt());
          this.bh.cZ.a(paramDataInputStream);
          return;
        }
        this.bh.cZ.jdMethod_if((byte)0, paramDataInputStream.readInt());
        this.bh.cZ.a(paramDataInputStream);
        a(paramDataInputStream.readUTF(), (short)this.bh.D, false, 9999);
        break;
      case 6702: 
        int i146 = paramDataInputStream.readByte();
        int i147 = paramDataInputStream.readInt();
        this.bh.cZ.a(paramDataInputStream);
        if (i146 == 0)
        {
          a("购买成功.当前余额为" + i147, (short)0, false, 9999);
        }
        else
        {
          String str46 = "购买失败.当前余额为" + i147 + ".";
          if ((h.cz) && (paramDataInputStream.available() > 0)) {
            str46 = paramDataInputStream.readUTF();
          }
          a(str46, (short)0, false, 9999);
        }
        break;
      case 6804: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        i149 = a3.jdMethod_do(paramDataInputStream.readInt(), 4);
        this.bh.cZ.jdMethod_if((byte)0, i149);
        b30 = paramDataInputStream.readByte();
        for (b31 = 0; b31 < b30; b31 = (byte)(b31 + 1))
        {
          i151 = paramDataInputStream.readShort();
          s29 = paramDataInputStream.readByte();
          this.bh.cZ.jdMethod_if((byte)0, i151, s29);
        }
        a("购买成功.", (short)0, false, 9999);
        this.bh.a(true);
        break;
      case 6782: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        i149 = a3.jdMethod_do(paramDataInputStream.readInt(), 4);
        this.bh.cZ.jdMethod_if((byte)0, i149);
        b30 = paramDataInputStream.readByte();
        for (int i150 = 0; i150 < b30; i150 = (byte)(i150 + 1))
        {
          i151 = paramDataInputStream.readShort();
          s29 = paramDataInputStream.readByte();
          this.bh.cZ.jdMethod_if((byte)0, i151, s29);
        }
        i150 = paramDataInputStream.readByte();
        int i152;
        for (i151 = 0; i151 < i150; i152 = (byte)(i151 + 1))
        {
          s29 = paramDataInputStream.readShort();
          s31 = paramDataInputStream.readShort();
          str47 = paramDataInputStream.readUTF();
          i157 = paramDataInputStream.readByte() == 0 ? 0 : 1;
          s32 = paramDataInputStream.readShort();
          s33 = paramDataInputStream.readShort();
          s34 = paramDataInputStream.readShort();
          i163 = paramDataInputStream.readShort();
          s35 = paramDataInputStream.readShort();
          short s36 = paramDataInputStream.readShort();
          short s37 = paramDataInputStream.readShort();
          i167 = paramDataInputStream.readShort();
          byte b36 = 0;
          this.bh.a(s29, s31, str47, i157, s32, s33, s34, i163, s35, s36, s37, i167, b36);
        }
        a("购买成功.", (short)0, false, 9999);
        this.bh.a(true);
        break;
      case 6801: 
        if (paramDataInputStream.readByte() == 1)
        {
          paramDataInputStream.readShort();
          a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          this.bh.cZ.a(paramDataInputStream);
          return;
        }
        for (int i153 = 0; i153 < this.bs[0]; i153 = (byte)(i153 + 1)) {
          if (a3.jdMethod_do(this.jv[0][i153], 2) > 0) {
            this.bh.cZ.a((byte)0, this.nl[0][i153], (short)a3.jdMethod_do(this.jv[0][i153], 2), false);
          }
        }
        this.gV = paramDataInputStream.readInt();
        a(paramDataInputStream.readUTF(), (short)0, false, 49);
        this.bh.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
        break;
      case 6783: 
        this.bh.cZ.a8 = (paramDataInputStream.readByte() == 0);
        a(paramDataInputStream.readUTF(), (short)0, false, 9999);
        this.mw = paramDataInputStream.readInt();
        this.bh.cZ.d = 0;
        this.bh.cZ.a(paramDataInputStream);
        break;
      case 6784: 
        if (paramInt2 == 1)
        {
          this.hV.addElement(str1);
          return;
        }
        short s28 = paramDataInputStream.readByte();
        for (s29 = 0; s29 < s28; s29 = (byte)(s29 + 1))
        {
          s31 = (short)paramDataInputStream.readInt();
          b21 = paramDataInputStream.readByte();
          this.bh.cZ.jdMethod_if((byte)0, s31, b21);
        }
        this.bh.a(true);
        this.bh.cZ.a8 = false;
        a("撤摊成功.", (short)0, false, 49);
        break;
      case 4057: 
        if (paramInt2 == 1)
        {
          this.hV.addElement(str1);
          return;
        }
        short s30 = paramDataInputStream.readByte();
        for (s31 = 0; s31 < s30; s31 = (byte)(s31 + 1))
        {
          str47 = paramDataInputStream.readUTF();
          byte[] arrayOfByte13 = new byte[54];
          paramDataInputStream.readFully(arrayOfByte13);
          if (this.bh.jdField_try < h.f0)
          {
            this.bh.b7[this.bh.jdField_try] = new a3(this.bh, null);
            this.bh.b7[this.bh.jdField_try].O = str47;
            this.bh.b7[this.bh.jdField_try].a(arrayOfByte13);
            h tmp24944_24941 = this.bh;
            tmp24944_24941.jdField_try = ((byte)(tmp24944_24941.jdField_try + 1));
          }
        }
        this.bh.cZ.a8 = false;
        a("撤摊成功.", (short)0, false, 49);
        break;
      case 6331: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        int i154 = paramDataInputStream.readByte();
        this.d4 = new short[i154];
        for (int i155 = 0; i155 < i154; i155 = (byte)(i155 + 1)) {
          this.d4[i155] = paramDataInputStream.readShort();
        }
        if (this.jdField_do == 3) {
          this.bh.i.jdMethod_byte();
        }
        break;
      case 2505: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        int i156 = paramDataInputStream.readByte();
        this.ip.removeAllElements();
        this.bS.removeAllElements();
        for (int i158 = 0; i158 < i156; i158 = (byte)(i158 + 1)) {
          this.ip.addElement(paramDataInputStream.readUTF());
        }
        this.jdField_do = 26;
        break;
      case 2504: 
        if (paramInt2 == 1)
        {
          a(str1, (short)0, false, 9999);
          return;
        }
        int i159 = paramDataInputStream.readByte();
        s32 = (short)paramDataInputStream.readByte();
        if (i159 == 0)
        {
          this.bG = ((short)(byte)Math.min(s32, 50));
          for (s33 = 0; s33 < this.bG; s33 = (short)(s33 + 1))
          {
            this.eA[s33] = paramDataInputStream.readUTF();
            this.cY[s33] = paramDataInputStream.readByte();
            this.eG[s33] = paramDataInputStream.readByte();
            this.eg[s33] = (paramDataInputStream.readByte() == 1 ? 1 : false);
          }
        }
        else if (i159 == 1)
        {
          this.mR = ((short)(byte)Math.min(s32, 10));
          for (s33 = 0; s33 < this.mR; s33 = (short)(s33 + 1)) {
            this.k4[s33] = paramDataInputStream.readUTF();
          }
        }
        break;
      case 3003: 
        if (paramInt2 == 0)
        {
          str1 = paramDataInputStream.readUTF();
          String str48 = paramDataInputStream.readUTF();
          s34 = paramDataInputStream.readByte();
          int i164 = paramDataInputStream.readByte();
          if (s34 == 1) {
            if (i164 == 0)
            {
              if (this.mR < 10)
              {
                this.k4[this.mR] = str48;
                this.mR = ((short)(this.mR + 1));
              }
            }
            else {
              for (s35 = 0; s35 < this.mR; s35 = (short)(s35 + 1)) {
                if (this.k4[s35].equals(str48))
                {
                  this.k4[s35] = this.k4[(this.mR - 1)];
                  this.mR = ((short)(this.mR - 1));
                  break;
                }
              }
            }
          }
        }
        jdMethod_do(str1);
        break;
      case 9960: 
      case 9970: 
        gf = 0;
        this.bu = paramDataInputStream.readUTF();
        this.jdField_do = 113;
        break;
      case 3701: 
        ao localao2;
        if (paramInt2 == 1)
        {
          this.bK = 1;
          this.bu = str1;
          gf = 0;
          this.jdField_do = 118;
          Display.getDisplay(this.bh.fG).setCurrent(this.bh);
          if (this.bh.cZ.fL >= 0) {
            for (int i160 = 0; i160 < this.bh.bR.d.size(); i160 = (byte)(i160 + 1))
            {
              localao2 = (ao)this.bh.bR.d.elementAt(i160);
              if (localao2.E == 8888)
              {
                if (this.bh.aG.jdMethod_int(5842))
                {
                  this.bh.aG.jdMethod_new(localao2.E);
                  this.bh.aG.jdMethod_if();
                }
                this.bh.bR.jdMethod_for(localao2.E);
                this.bh.bR.d.removeElementAt(i160);
                this.bh.bR.a(localao2);
                break;
              }
            }
          }
          return;
        }
        this.bh.cZ.fL = paramDataInputStream.readInt();
        this.bh.cZ.fx = 0;
        for (i161 = 0; i161 < this.bh.bR.d.size(); i161 = (byte)(i161 + 1))
        {
          localao2 = (ao)this.bh.bR.d.elementAt(i161);
          if (localao2.E == 8888)
          {
            if (this.bh.aG.jdMethod_int(5842))
            {
              this.bh.aG.jdMethod_new(localao2.E);
              this.bh.aG.jdMethod_if();
            }
            this.bh.bR.jdMethod_for(localao2.E);
            this.bh.bR.d.removeElementAt(i161);
            this.bh.bR.a(localao2);
            break;
          }
        }
        if (this.bh.cZ.es.trim().length() == 0)
        {
          this.bu = "公会申请成功!你成为了会长.";
          this.bh.cZ.jdMethod_if((byte)50, 0);
        }
        else
        {
          this.bu = "继任会长成功!你成为了会长.";
        }
        gf = 0;
        this.jdField_do = 118;
        this.bK = 0;
        Display.getDisplay(this.bh.fG).setCurrent(this.bh);
        this.bh.cZ.fj = 17;
        if (this.bh.cZ.es.trim().length() == 0) {
          this.bh.cZ.es = this.bh.i.jdField_int.getString().trim();
        }
        break;
      case 1002: 
        i161 = paramDataInputStream.readByte();
        if (i161 == 99)
        {
          ad.do = paramDataInputStream.readUTF();
          ad.for = paramDataInputStream.readUTF();
          this.bh.i.jdMethod_int();
          return;
        }
        if (i161 == 1)
        {
          this.bu = paramDataInputStream.readUTF();
          i162 = paramDataInputStream.readByte();
          switch (i162)
          {
          case 0: 
            this.bh.i.jdField_long.setString("");
            break;
          case 1: 
            this.bh.i.jdField_int.setString("");
            break;
          case 2: 
            this.bh.i.r.setString("");
            this.bh.i.p.setString("");
          }
          if (paramDataInputStream.available() > 0)
          {
            this.bh.i.jdField_long.setString(paramDataInputStream.readUTF());
            String str49 = paramDataInputStream.readUTF();
            this.bh.i.r.setString(str49);
            this.bh.i.p.setString(str49);
          }
          gf = 0;
          this.jdField_do = 22;
          Display.getDisplay(this.bh.fG).setCurrent(this.bh);
          return;
        }
        Display.getDisplay(this.bh.fG).setCurrent(this.bh);
        h.ek = paramDataInputStream.readByte() == 1;
        this.bh.cZ.g4 = (paramDataInputStream.readByte() == 1);
        this.bh.cZ.fY = paramDataInputStream.readShort();
        if (!h.ek) {
          h.dh = new String[] { "个人", "宠物", "交互", "聊天", "商城", "系统" };
        }
        h.b9 = paramDataInputStream.readUTF();
        h.ea = paramDataInputStream.readUTF();
        h.bB = paramDataInputStream.readUTF();
        q.ct = paramDataInputStream.readUTF();
        int i162 = paramDataInputStream.readByte();
        he = new String[i162];
        dM = new String[i162];
        eo = new String[i162];
        kv = new byte[i162];
        for (int i165 = 0; i165 < i162; i165 = (byte)(i165 + 1))
        {
          he[i165] = paramDataInputStream.readUTF();
          dM[i165] = paramDataInputStream.readUTF();
          eo[i165] = paramDataInputStream.readUTF();
          kv[i165] = paramDataInputStream.readByte();
        }
        i162 = paramDataInputStream.readByte();
        e.try = new String[i162];
        e.int = new byte[i162];
        e.new = new byte[i162];
        e.a = new byte[i162];
        e.byte = new String[i162];
        for (i165 = 0; i165 < i162; i165 = (byte)(i165 + 1))
        {
          e.try[i165] = paramDataInputStream.readUTF();
          e.byte[i165] = paramDataInputStream.readUTF();
          e.int[i165] = paramDataInputStream.readByte();
          e.a[i165] = paramDataInputStream.readByte();
          e.new[i165] = paramDataInputStream.readByte();
        }
        String str50 = paramDataInputStream.readUTF().trim();
        int i166 = paramDataInputStream.readInt();
        long l = paramDataInputStream.readLong();
        this.bh.aG.a(i166);
        this.bh.aG.bQ = l;
        this.bh.dv = this.bh.i.jdField_long.getString().trim();
        this.bh.dw = this.bh.i.r.getString().trim();
        this.bh.c9 = null;
        this.bh.jdField_do = str50;
        this.bh.D();
        this.bh.cZ.jdMethod_do(200, false);
        this.bh.cZ.jdMethod_if((byte)0, (short)3840, 2);
        this.bh.cZ.jdMethod_if((byte)0, (short)3844, 2);
        if (h.cz) {
          this.bh.cZ.jdMethod_if((byte)1, (short)3871, 1);
        }
        this.bh.cZ.jdMethod_if((byte)2, (short)3840, (byte)1);
        this.bh.cZ.jdMethod_if((byte)3, (short)3844, (byte)1);
        i167 = -1;
        switch (this.bh.cZ.bo)
        {
        case 0: 
          i167 = 0;
          this.bh.cZ.jdMethod_if((byte)0, (short)0, 1);
          break;
        case 1: 
          i167 = 1;
          this.bh.cZ.jdMethod_if((byte)0, (short)3, 1);
          break;
        case 2: 
          i167 = 3;
          this.bh.cZ.jdMethod_if((byte)0, (short)6, 1);
          break;
        case 3: 
          i167 = 2;
          this.bh.cZ.jdMethod_if((byte)0, (short)9, 1);
        }
        this.bh.cZ.c(i167);
        this.bh.cZ.jdMethod_if((byte)0, (short)i167, (byte)0);
        this.bh.cZ.c((byte)(i167 + 4));
        this.bh.cZ.jdMethod_if((byte)8, 0);
        this.bh.cZ.O = str50;
        if (h.cz)
        {
          this.cJ = 4;
          this.hv = 168;
        }
        else
        {
          this.cJ = 3;
          this.hv = 49;
        }
        j();
        break;
      case 3505: 
        if (!this.bh.cZ.gE) {
          return;
        }
        int i168 = paramDataInputStream.readByte();
        this.g6 = new String[i168 - 1];
        this.cl = new byte[i168 - 1];
        this.no = new byte[i168 - 1];
        int i169 = 0;
        for (int i170 = 0; i170 < i168; i170 = (byte)(i170 + 1))
        {
          String str51 = paramDataInputStream.readUTF();
          i173 = paramDataInputStream.readByte();
          int i174 = paramDataInputStream.readByte();
          if (!str51.equals(this.bh.cZ.O))
          {
            this.g6[i169] = str51;
            this.cl[i169] = i173;
            this.no[i169] = i174;
            i169 = (byte)(i169 + 1);
          }
        }
        break;
      case 1006: 
        this.c7 = new k(this.bh, paramDataInputStream);
        break;
      case 6787: 
        synchronized (this.hV)
        {
          str42 = paramDataInputStream.readUTF();
          int i171 = a3.jdMethod_do(paramDataInputStream.readInt(), 4);
          this.bh.cZ.jdMethod_if((byte)0, i171);
          this.hV.addElement(str42);
        }
        break;
      case 3004: 
        ??? = paramDataInputStream.readUTF();
        synchronized (this.hV)
        {
          this.hV.addElement(???);
        }
        for (i172 = 0; i172 < this.h4.length; i172 = (byte)(i172 + 1)) {
          this.bh.a(i172, "[" + b6[3] + "]" + "系统:" + (String)???, (byte)3, (byte)-1, (short)-1);
        }
        break;
      case 9998: 
        this.b4 = 0;
        break;
      case 3301: 
      case 3302: 
      case 3303: 
      case 3304: 
        this.bh.i.a(paramInt1, paramDataInputStream);
        break;
      case 3006: 
        i172 = paramDataInputStream.readUnsignedByte();
        i173 = 0;
        while (i173 < i172)
        {
          synchronized (this.kP)
          {
            int i175 = paramDataInputStream.readByte();
            String str52 = paramDataInputStream.readUTF();
            String str53 = paramDataInputStream.readUTF();
            int i176 = paramDataInputStream.readByte();
            if (i175 == 5)
            {
              String str54 = "[" + b6[i175] + "]" + str52 + i176 + ":" + str53;
              this.mB.addElement(str54);
            }
            else
            {
              int i177 = 0;
              for (int i178 = 0; i178 < this.mR; i178 = (byte)(i178 + 1)) {
                if (str52.equals(this.k4[i178]))
                {
                  i177 = 1;
                  break;
                }
              }
              if (i177 != 0) {
                break label27919;
              }
              if (i175 == 4) {
                this.el = true;
              }
              str42 = "[" + b6[i175] + "]" + str52 + i176 + ":" + str53;
              if (i175 != 0)
              {
                if (this.kP.size() > 2) {
                  this.kP.insertElementAt(str42, 1);
                } else {
                  this.kP.addElement(str42);
                }
              }
              else if (this.kP.size() < 25) {
                this.kP.addElement(str42);
              }
            }
          }
          ???++;
        }
        break;
      case 2508: 
        label27919:
        this.gR = 0;
        this.bh.jdMethod_goto(paramDataInputStream);
      }
    }
    catch (Exception localException3)
    {
      h.a(localException3);
      localException3.printStackTrace();
    }
    finally
    {
      try
      {
        if (paramDataInputStream != null) {
          paramDataInputStream.close();
        }
      }
      catch (Exception localException65)
      {
        h.a(localException65);
      }
      paramDataInputStream = null;
    }
  }
  
  public void J()
  {
    if (this.bh.aG.jdMethod_int(1007))
    {
      this.bh.aG.jdMethod_new(this.jdField_if);
      this.bh.aG.jdMethod_new(this.bh.cZ.aP);
      this.bh.aG.jdMethod_new(this.bh.cZ.aM);
      for (int i = 0; i < this.bh.cZ.jdField_case.length; i = (byte)(i + 1)) {
        this.bh.aG.jdMethod_do(this.bh.cZ.jdField_case[i]);
      }
      this.bh.aG.jdMethod_if();
    }
    this.ja = 0;
    this.lm = true;
    this.jdField_do = 44;
  }
  
  public void jdMethod_if(byte paramByte)
  {
    this.iG[paramByte] = this.iG[(this.kT - 1)];
    this.mX[paramByte] = this.mX[(this.kT - 1)];
    this.mW[paramByte] = this.mW[(this.kT - 1)];
    this.co[paramByte] = this.co[(this.kT - 1)];
    this.k9[paramByte] = this.k9[(this.kT - 1)];
    this.iy[paramByte] = this.iy[(this.kT - 1)];
    this.eX[paramByte] = this.eX[(this.kT - 1)];
    this.kf[paramByte] = this.kf[(this.kT - 1)];
    this.gT[paramByte] = this.gT[(this.kT - 1)];
    this.dq[paramByte] = this.dq[(this.kT - 1)];
    this.jq[paramByte] = this.jq[(this.kT - 1)];
    this.jo[paramByte] = this.jo[(this.kT - 1)];
    this.dQ[paramByte] = this.dQ[(this.kT - 1)];
    this.jC[paramByte] = this.jC[(this.kT - 1)];
    this.iD[paramByte] = this.iD[(this.kT - 1)];
    this.fz[paramByte] = this.fz[(this.kT - 1)];
    this.en[paramByte] = this.en[(this.kT - 1)];
    this.jn[paramByte] = this.jn[(this.kT - 1)];
    this.jm[paramByte] = this.jm[(this.kT - 1)];
    this.hQ[paramByte] = this.hQ[(this.kT - 1)];
    this.g5[paramByte] = this.g5[(this.kT - 1)];
    this.kA[paramByte] = this.kA[(this.kT - 1)];
    this.dX[paramByte] = this.dX[(this.kT - 1)];
    this.fi[paramByte] = this.fi[(this.kT - 1)];
    this.kJ[paramByte] = this.kJ[(this.kT - 1)];
    this.gF[paramByte] = this.gF[(this.kT - 1)];
    this.mL[paramByte] = this.mL[(this.kT - 1)];
    this.k7[paramByte] = this.k7[(this.kT - 1)];
    this.gh[paramByte] = this.gh[(this.kT - 1)];
    this.fy[paramByte] = this.fy[(this.kT - 1)];
    this.kT = ((short)(this.kT - 1));
  }
  
  public void a(int paramInt1, byte paramByte1, byte paramByte2, String paramString1, short paramShort1, short paramShort2, short[] paramArrayOfShort, byte paramByte3, short paramShort3, short paramShort4, short paramShort5, short paramShort6, short paramShort7, short paramShort8, short paramShort9, int paramInt2, byte paramByte4, byte paramByte5, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, byte paramByte6, byte paramByte7, byte paramByte8)
  {
    for (int i = 0; i < this.kT; i = (byte)(i + 1)) {
      if (paramInt1 == this.co[i])
      {
        this.dq[i] = paramShort9;
        this.k9[i] = paramBoolean1;
        this.gT[i] = paramBoolean2;
        this.en[i] = paramBoolean3;
        this.hQ[i] = paramByte6;
        this.jn[i] = paramByte7;
        this.jm[i] = paramByte8;
        return;
      }
    }
    this.iG[this.kT] = 0;
    this.co[this.kT] = paramInt1;
    this.k9[this.kT] = paramBoolean1;
    this.eX[this.kT] = paramByte1;
    this.kf[this.kT] = paramByte2;
    this.gT[this.kT] = paramBoolean2;
    this.iy[this.kT] = paramString1;
    this.mX[this.kT] = paramShort1;
    this.mW[this.kT] = paramShort2;
    this.jq[this.kT] = paramShort1;
    this.jo[this.kT] = paramShort2;
    this.jn[this.kT] = paramByte7;
    this.jm[this.kT] = paramByte8;
    this.jC[this.kT] = paramArrayOfShort;
    this.iD[this.kT] = ((short)paramByte3);
    this.fz[this.kT] = paramShort3;
    this.g5[this.kT] = paramShort4;
    this.kA[this.kT] = paramShort5;
    this.dX[this.kT] = paramShort6;
    this.fi[this.kT] = paramShort7;
    this.kJ[this.kT] = paramShort8;
    this.mL[this.kT] = paramInt2;
    this.k7[this.kT] = paramByte4;
    this.gh[this.kT] = paramByte5;
    this.fy[this.kT] = paramString2;
    this.dq[this.kT] = paramShort9;
    this.dQ[this.kT] = 0;
    this.en[this.kT] = paramBoolean3;
    this.hQ[this.kT] = paramByte6;
    this.kT = ((short)(this.kT + 1));
  }
  
  public synchronized boolean jdMethod_new(byte paramByte)
  {
    boolean bool = true;
    try
    {
      this.lo = ((MessageConnection)Connector.open("sms://" + dM[paramByte]));
      TextMessage localTextMessage = (TextMessage)this.lo.newMessage("text");
      localTextMessage.setPayloadText(eo[paramByte]);
      this.lo.send(localTextMessage);
      this.lo.close();
      if (this.bh.aG.jdMethod_int(8108))
      {
        this.bh.aG.jdMethod_if(dM[paramByte]);
        this.bh.aG.jdMethod_if();
      }
    }
    catch (Exception localException)
    {
      bool = false;
    }
    return bool;
  }
  
  public boolean a(short paramShort)
  {
    DataInputStream localDataInputStream = null;
    try
    {
      localDataInputStream = new DataInputStream(getClass().getResourceAsStream("/local/scene" + paramShort + "_" + "high" + ".local"));
      localDataInputStream.skip(2L);
      boolean bool1 = true;
      return bool1;
    }
    catch (Exception localException1)
    {
      boolean bool2 = false;
      return bool2;
    }
    finally
    {
      if (localDataInputStream != null) {
        try
        {
          localDataInputStream.close();
        }
        catch (Exception localException4) {}
      }
      localDataInputStream = null;
    }
  }
  
  public void m()
  {
    if (this.dg >= this.em)
    {
      a("当前页已经是最后一页.", (short)11, false, 9999);
    }
    else
    {
      this.dg = ((short)(this.dg + 1));
      this.bh.q(this.bh.ck.jdField_new);
    }
  }
  
  public void B()
  {
    if (this.dg <= 1)
    {
      a("当前页已经是第一页.", (short)11, false, 9999);
    }
    else
    {
      this.dg = ((short)(this.dg - 1));
      this.bh.q(this.bh.ck.jdField_new);
    }
  }
  
  public boolean O()
  {
    this.bh.cZ.f((byte)a.char);
    return (a3.jdMethod_do(this.bh.cZ.hh, a.t) < ag.g2) && (this.bh.cZ.ax());
  }
  
  public boolean N()
  {
    this.bh.cZ.f((byte)a.t);
    if (a3.jdMethod_do(this.bh.cZ.hh, a.t) < ag.g2) {
      if (a3.jdMethod_do(this.bh.cZ.hh, a.t) < (a3.jdMethod_do(this.bh.cZ.fW, a.C) < a.void ? a.void : a3.jdMethod_do(this.bh.cZ.fW, a.C))) {
        return true;
      }
    }
    return false;
  }
  
  public void jdMethod_do(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      this.bh.a((byte)2, 0, h.fp - 22, 45, 22, true);
      this.bh.fj.setColor(0);
      this.bh.fj.drawString(paramString1, 22, h.fp - 3, 33);
    }
    if (paramString2 != null)
    {
      this.bh.a((byte)2, h.dU - 45, h.fp - 22, 45, 22, true);
      this.bh.fj.setColor(0);
      this.bh.fj.drawString(paramString2, h.dU - 22, h.fp - 3, 33);
    }
  }
  
  public void p()
  {
    this.gd = 0;
    this.c9 = null;
    if (this.bh.cZ.gH < 0) {
      this.c9 = new String[] { "金币市场", "我要买金", "我要卖金" };
    } else {
      this.c9 = new String[] { "金币市场", "停止买卖" };
    }
    this.jdField_do = 60;
  }
  
  public boolean M()
  {
    this.bh.cZ.f((byte)a.J);
    return this.bh.cZ.a((byte)24) < a3.jdMethod_do(this.bh.cZ.fW, a.C);
  }
  
  public boolean K()
  {
    this.bh.cZ.f((byte)a.L);
    return a3.jdMethod_do(this.bh.cZ.fW, a.C) <= a.ac;
  }
  
  public void a(int paramInt1, short paramShort, boolean paramBoolean, int paramInt2)
  {
    this.eP = paramInt2;
    gf = 0;
    this.lt = s.a(paramInt1);
    this.lb = paramShort;
    this.jdField_new = paramBoolean;
    this.jdField_int = 0;
    this.jdField_do = 98;
  }
  
  public boolean y()
  {
    if ((this.jdField_do == 5) || (this.jdField_do == 21)) {
      return false;
    }
    return (dD != 2) || (dZ != 0);
  }
  
  public void a(short paramShort, boolean paramBoolean)
  {
    int i = paramBoolean ? 4416 : 4418;
    if (this.bh.aG.jdMethod_int(i))
    {
      this.bh.aG.jdMethod_for(a3.jdMethod_new(paramShort, 2));
      this.bh.aG.jdMethod_for(a3.jdMethod_new(this.bh.cZ.jdMethod_if(paramShort), 2));
      this.bh.aG.jdMethod_for(a3.jdMethod_new(this.bh.cZ.a((byte)16), 2));
      this.bh.aG.jdMethod_for(a3.jdMethod_new(this.bh.cZ.a((byte)24), 2));
      this.bh.aG.jdMethod_do(0);
      this.bh.aG.jdMethod_if();
    }
  }
  
  public void jdMethod_int(boolean paramBoolean)
  {
    int i = -1;
    if (((i = paramBoolean ? this.bh.cZ.ac() : this.bh.cZ.ai()) > 0) && (this.bh.aG.jdMethod_int(4018)))
    {
      this.bh.aG.jdMethod_do(paramBoolean ? 0 : 1);
      this.bh.aG.jdMethod_for(a3.jdMethod_new(i, 2));
      this.bh.aG.jdMethod_for(a3.jdMethod_new(this.bh.cZ.a((byte)16), 2));
      this.bh.aG.jdMethod_for(a3.jdMethod_new(this.bh.cZ.a((byte)24), 2));
      this.bh.aG.jdMethod_if();
    }
  }
  
  public void a(ag paramag, boolean paramBoolean, int paramInt)
  {
    if ((paramag == this.bh.cZ) && (!paramag.fM) && (paramag.dJ == 0))
    {
      int i = paramBoolean ? 4419 : 4420;
      if (this.bh.aG.jdMethod_int(i))
      {
        this.bh.aG.jdMethod_for(a3.jdMethod_new(paramag.fm, 2));
        this.bh.aG.jdMethod_for(a3.jdMethod_new(paramag.a((byte)16), 2));
        this.bh.aG.jdMethod_for(a3.jdMethod_new(paramag.a((byte)24), 2));
        this.bh.aG.jdMethod_for(a3.jdMethod_new(paramInt, 2));
        this.bh.aG.jdMethod_if();
      }
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */