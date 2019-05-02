import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import javax.microedition.io.SocketConnection;
import javax.microedition.io.StreamConnection;
import kava.lang.Threak;

public class q
  implements Runnable
{
  private h cl;
  Threak du;
  public static boolean ak;
  private boolean bF = true;
  private byte b7;
  private String cj;
  public static String c4;
  static int cB = 0;
  private SocketConnection cw;
  private boolean bt;
  private boolean bo;
  private ByteArrayOutputStream br;
  private DataOutputStream bw;
  private ByteArrayOutputStream bp;
  private DataOutputStream bu;
  private int bd;
  private byte bn;
  private DataOutputStream cu = null;
  private DataInputStream ch = null;
  public long bQ;
  private static int[] aX;
  public static int b3 = 0;
  public static final short cP = 51;
  public static final short bz = 68;
  public static short jdField_if = 68;
  public static short bb = 51;
  public static String c3 = "/Order?action=4&SessionID=0&SPID=900501&ServiceID=03201127&MISC_U=http://";
  public static String dC = "218.200.244.92";
  public static final byte[] bk = { 83, 79, 67, 75 };
  public static final byte[] aD = { 83, 68, 65, 84 };
  public static final byte[] cv = { 83, 79, 84 };
  public static final short cE = 500;
  public static final short p = 20;
  public static final int bJ = 120000;
  public static final byte bq = 0;
  public static final byte bW = 1;
  public static final byte aZ = 2;
  public static final int aP = 0;
  public static final int cA = 1;
  public static final short jdField_null = 9999;
  public static final short ci = 9998;
  public static final short aw = 9997;
  public static final short dj = 9980;
  public static final short dz = 9970;
  public static final short aT = 9960;
  public static final short ar = 9950;
  public static final short at = 9000;
  public static final short aA = 8999;
  public static final short dc = 1001;
  public static final short m = 1002;
  public static final short ag = 1003;
  public static final short b4 = 1004;
  public static final short co = 1005;
  public static final short d = 1006;
  public static final short aU = 1007;
  public static final short i = 1008;
  public static final short dO = 1009;
  public static final short av = 1010;
  public static final short cK = 1012;
  public static final short dM = 1013;
  public static final short dy = 1014;
  public static final short dx = 1015;
  public static final short c = 1016;
  public static final short c5 = 1017;
  public static final short ah = 1018;
  public static final short cq = 1019;
  public static final short E = 3001;
  public static final short be = 3003;
  public static final short W = 3004;
  public static final short bA = 3005;
  public static final short dr = 3006;
  public static final short K = 3650;
  public static final short cp = 3651;
  public static final short l = 3652;
  public static final short dt = 3101;
  public static final short bh = 3102;
  public static final short cz = 3103;
  public static final short cJ = 3500;
  public static final short cy = 3501;
  public static final short aQ = 3503;
  public static final short aF = 3504;
  public static final short cm = 3505;
  public static final short bT = 3506;
  public static final short b6 = 3507;
  public static final short c6 = 3508;
  public static final short cQ = 3509;
  public static final short bR = 3510;
  public static final short bP = 3511;
  public static final short dU = 3512;
  public static final short bX = 3561;
  public static final short ap = 3562;
  public static final short S = 3560;
  public static final short bg = 3563;
  public static final short o = 3564;
  public static final short cM = 3565;
  public static final short J = 3601;
  public static final short a3 = 3602;
  public static final short dv = 3607;
  public static final short aV = 3603;
  public static final short cD = 3604;
  public static final short an = 3605;
  public static final short c9 = 3606;
  public static final short a2 = 3608;
  public static final short jdField_else = 3609;
  public static final short t = 3701;
  public static final short P = 3702;
  public static final short af = 3703;
  public static final short jdField_long = 3704;
  public static final short cC = 3705;
  public static final short cg = 3706;
  public static final short dW = 3707;
  public static final short w = 3708;
  public static final short ca = 3709;
  public static final short a1 = 3710;
  public static final short dL = 3711;
  public static final short by = 3712;
  public static final short aB = 3713;
  public static final short dT = 3714;
  public static final short cn = 3715;
  public static final short al = 3716;
  public static final short bV = 3717;
  public static final short dP = 3718;
  public static final short ck = 3719;
  public static final short dR = 3720;
  public static final short c7 = 3721;
  public static final short ba = 3722;
  public static final short bN = 3723;
  public static final short aY = 3724;
  public static final short aN = 3725;
  public static final short cW = 4051;
  public static final short y = 4052;
  public static final short bv = 4053;
  public static final short am = 4054;
  public static final short ay = 4055;
  public static final short dB = 4056;
  public static final short v = 4057;
  public static final short dV = 4058;
  public static final short bI = 4059;
  public static final short q = 4060;
  public static final short dp = 4061;
  public static final short n = 4062;
  public static final short a8 = 4063;
  public static final short aS = 3750;
  public static final short V = 3751;
  public static final short jdField_case = 3752;
  public static final short b5 = 3753;
  public static final short a6 = 3754;
  public static final short z = 3755;
  public static final short dF = 3756;
  public static final short aE = 3757;
  public static final short bm = 3758;
  public static final short dw = 4003;
  public static final short F = 4004;
  public static final short au = 4005;
  public static final short cx = 4006;
  public static final short ai = 4007;
  public static final short cT = 4008;
  public static final short cZ = 4009;
  public static final short bU = 4010;
  public static final short I = 4011;
  public static final short X = 4012;
  public static final short cX = 4013;
  public static final short bL = 4014;
  public static final short dD = 4015;
  public static final short a4 = 4016;
  public static final short cL = 4017;
  public static final short cI = 4018;
  public static final short bx = 4019;
  public static final short ae = 4020;
  public static final short dE = 4101;
  public static final short cH = 4102;
  public static final short B = 4103;
  public static final short dA = 4104;
  public static final short aJ = 4105;
  public static final short a7 = 4106;
  public static final short ac = 4107;
  public static final short r = 4108;
  public static final short b8 = 4109;
  public static final short a0 = 4110;
  public static final short k = 4111;
  public static final short dg = 4401;
  public static final short di = 4402;
  public static final short j = 4403;
  public static final short H = 4404;
  public static final short s = 4405;
  public static final short a5 = 4406;
  public static final short h = 4407;
  public static final short bB = 4408;
  public static final short jdField_void = 4409;
  public static final short dh = 4410;
  public static final short as = 4411;
  public static final short jdField_new = 4412;
  public static final short R = 4413;
  public static final short Z = 4415;
  public static final short cr = 4416;
  public static final short u = 4417;
  public static final short N = 4418;
  public static final short cF = 4419;
  public static final short ce = 4420;
  public static final short dl = 4421;
  public static final short aR = 4301;
  public static final short jdField_try = 4302;
  public static final short aG = 4303;
  public static final short c1 = 4304;
  public static final short bH = 5841;
  public static final short de = 5842;
  public static final short da = 5843;
  public static final short D = 5844;
  public static final short aj = 5845;
  public static final short bs = 5846;
  public static final short cb = 5847;
  public static final short jdField_byte = 5848;
  public static final short bc = 5849;
  public static final short df = 5850;
  public static final short dN = 5851;
  public static final short aI = 5852;
  public static final short dK = 5101;
  public static final short aa = 5102;
  public static final short M = 6701;
  public static final short Y = 6702;
  public static final short b = 6703;
  public static final short ds = 6704;
  public static final short cU = 6705;
  public static final short dd = 6706;
  public static final short O = 6707;
  public static final short cS = 6708;
  public static final short ad = 6709;
  public static final short b9 = 6710;
  public static final short aK = 6711;
  public static final short c0 = 6712;
  public static final short L = 6713;
  public static final short g = 6714;
  public static final short a = 6715;
  public static final short c2 = 6716;
  public static final short aO = 6718;
  public static final short bG = 6719;
  public static final short U = 6720;
  public static final short f = 6721;
  public static final short bf = 4501;
  public static final short bO = 4502;
  public static final short dH = 4503;
  public static final short C = 4504;
  public static final short cG = 4505;
  public static final short dQ = 4506;
  public static final short ab = 4507;
  public static final short cY = 6781;
  public static final short jdField_int = 6782;
  public static final short dG = 6783;
  public static final short bK = 6784;
  public static final short b0 = 6785;
  public static final short c8 = 6786;
  public static final short dq = 6787;
  public static final short aC = 6788;
  public static final short dk = 6789;
  public static final short dn = 6790;
  public static final short b2 = 6791;
  public static final short jdField_char = 6801;
  public static final short jdField_goto = 6802;
  public static final short dS = 6803;
  public static final short dI = 6804;
  public static final short bE = 6201;
  public static final short cc = 6202;
  public static final short aL = 6331;
  public static final short A = 6332;
  public static final short a9 = 6333;
  public static final short cR = 6717;
  public static final short bS = 7101;
  public static final short bl = 7102;
  public static final short bY = 7103;
  public static final short bC = 8201;
  public static final short jdField_for = 8202;
  public static final short cf = 8203;
  public static final short aW = 8103;
  public static final short aH = 8104;
  public static final short cO = 5120;
  public static final short cN = 5231;
  public static final short aq = 8108;
  public static final short bj = 3736;
  public static final short Q = 3735;
  public static final short bi = 3734;
  public static final short ao = 3733;
  public static final short db = 3732;
  public static final short dJ = 3731;
  public static final short cV = 3730;
  public static final short e = 3729;
  public static final short T = 3728;
  public static final short jdField_do = 3727;
  public static final short aM = 3726;
  public static final short bZ = 3737;
  public static final short x = 3738;
  public static final short b1 = 3739;
  public static final short az = 3740;
  public static final short bD = 3741;
  static String cd = null;
  static String bM;
  static String G;
  static String dm = "";
  static String cs = "";
  static String ct = "gmp.i139.cn/bizcontrol/LoginOnlineGame?sender=202&cpId=C00083&cpServiceId=120121814000&channelId=1000";
  static String ax = "http://gmp.i139.cn/bizcontrol/ControlVerify?sender=202&channelId=15083000&cpId=C00083&cpServiceId=120121814000";
  
  public q(h paramh, String paramString1, String paramString2, byte paramByte)
  {
    this.cl = paramh;
    this.cj = paramString1;
    jdMethod_if(paramByte);
    this.du = new Threak(this);
    a(paramString2);
    bb = 51;
    if = 68;
    jdMethod_for();
  }
  
  public void a(String paramString)
  {
    c4 = paramString;
    if (c4.equals(h.cc))
    {
      bb = 51;
      if = 68;
    }
    jdMethod_byte();
  }
  
  public void jdMethod_if(int paramInt)
  {
    this.b7 = ((byte)paramInt);
  }
  
  public void a(int paramInt)
  {
    cB = paramInt;
  }
  
  public void jdMethod_for()
  {
    ak = false;
    this.du.start();
  }
  
  private HttpConnection jdMethod_try()
  {
    HttpConnection localHttpConnection = null;
    while (localHttpConnection == null) {
      try
      {
        switch (this.b7)
        {
        case 0: 
          localHttpConnection = (HttpConnection)Connector.open("http://10.0.0.172:80" + this.cj, 3, true);
          localHttpConnection.setRequestProperty("X-Online-Host", c4);
          break;
        case 1: 
          localHttpConnection = (HttpConnection)Connector.open("http://" + c4 + this.cj, 3, true);
        }
        localHttpConnection.setRequestMethod("POST");
      }
      catch (Exception localException) {}
    }
    return localHttpConnection;
  }
  
  private void jdMethod_do()
    throws Exception
  {
    if (this.cw == null)
    {
      this.cw = ((SocketConnection)Connector.open("socket://" + c4, 3, false));
      this.cw.setSocketOption((byte)2, 0);
      this.cw.setSocketOption((byte)0, 10);
      this.cw.setSocketOption((byte)1, 5);
      this.cu = this.cw.openDataOutputStream();
      this.ch = this.cw.openDataInputStream();
    }
  }
  
  private void jdMethod_byte()
  {
    if (this.b7 == 2) {
      try
      {
        if (this.cw != null)
        {
          this.cw.close();
          this.cw = null;
          this.cu.close();
          this.ch.close();
        }
      }
      catch (Exception localException) {}
    }
  }
  
  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      for (int i1 = 0; i1 < cv.length; i1++) {
        if (paramArrayOfByte[i1] != cv[i1]) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public byte[] a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      localDataOutputStream.writeByte(1);
      localDataOutputStream.writeShort(0);
      localDataOutputStream.writeShort(6 + paramArrayOfByte.length);
      localDataOutputStream.writeShort(paramInt1);
      localDataOutputStream.writeShort(paramInt2);
      localDataOutputStream.writeShort(paramArrayOfByte.length);
      localDataOutputStream.write(paramArrayOfByte);
      arrayOfByte1 = localByteArrayOutputStream.toByteArray();
      byte[] arrayOfByte2 = arrayOfByte1;
      return arrayOfByte2;
    }
    catch (Exception localException1) {}finally
    {
      try
      {
        localDataOutputStream.close();
        localByteArrayOutputStream.close();
      }
      catch (Exception localException4) {}
    }
    return arrayOfByte1;
  }
  
  public void run()
  {
    HttpConnection localHttpConnection = null;
    OutputStream localOutputStream = null;
    Object localObject1 = null;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    int i1 = 0;
    byte[] arrayOfByte3 = null;
    for (;;)
    {
      if (!ak) {
        try
        {
          if ((this.cl.cJ.nq) && (System.currentTimeMillis() - this.cl.cJ.lM > 180000L)) {
            this.cl.i.jdMethod_case();
          }
          if (this.cl.cJ != null) {
            this.cl.cJ.I();
          }
          if (jdMethod_char())
          {
            this.bF = false;
            boolean bool = false;
            int i11;
            Object localObject3;
            Object localObject4;
            int i9;
            int i10;
            if (this.b7 != 2)
            {
              if (arrayOfByte1 == null)
              {
                arrayOfByte1 = jdMethod_int();
                if (arrayOfByte1 != null)
                {
                  jdMethod_case();
                }
                else
                {
                  this.bF = true;
                  arrayOfByte1 = null;
                  try
                  {
                    if (localOutputStream != null)
                    {
                      localOutputStream.close();
                      localOutputStream = null;
                    }
                    if (localObject1 != null)
                    {
                      ((DataInputStream)localObject1).close();
                      localObject1 = null;
                    }
                    if (localHttpConnection != null)
                    {
                      localHttpConnection.close();
                      localHttpConnection = null;
                    }
                  }
                  catch (Exception localException4) {}
                  continue;
                }
              }
              int i3 = 0;
              if (arrayOfByte1 != null) {
                try
                {
                  do
                  {
                    localHttpConnection = jdMethod_try();
                    localOutputStream = localHttpConnection.openOutputStream();
                    if ((i1 != 0) && (arrayOfByte3 != null))
                    {
                      i1 = 0;
                      localOutputStream.write(arrayOfByte3);
                    }
                    else
                    {
                      localOutputStream.write(arrayOfByte1);
                    }
                    if (localOutputStream != null)
                    {
                      localOutputStream.close();
                      localOutputStream = null;
                    }
                    i3 = localHttpConnection.getResponseCode();
                    byte[] arrayOfByte4 = new byte[''];
                    int i6 = 0;
                    InputStream localInputStream = localHttpConnection.openInputStream();
                    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
                    while ((i6 = localInputStream.read(arrayOfByte4)) != -1) {
                      localByteArrayOutputStream.write(arrayOfByte4, 0, i6);
                    }
                    byte[] arrayOfByte6 = localByteArrayOutputStream.toByteArray();
                    if (localInputStream != null)
                    {
                      localInputStream.close();
                      localInputStream = null;
                    }
                    if (localByteArrayOutputStream != null)
                    {
                      localByteArrayOutputStream.close();
                      localByteArrayOutputStream = null;
                    }
                    if (arrayOfByte6.length < 6)
                    {
                      i3 = 204;
                      Threak.sleep(500L);
                      try
                      {
                        if (localOutputStream != null)
                        {
                          localOutputStream.close();
                          localOutputStream = null;
                        }
                        if (localObject1 != null)
                        {
                          ((DataInputStream)localObject1).close();
                          localObject1 = null;
                        }
                        if (localHttpConnection != null)
                        {
                          localHttpConnection.close();
                          localHttpConnection = null;
                        }
                      }
                      catch (Exception localException11)
                      {
                        h.a(localException11);
                      }
                    }
                    else
                    {
                      i11 = 0;
                      i11 = (short)(i11 << 16);
                      i11 = (short)(i11 | arrayOfByte6[3] & 0xFF);
                      i11 = (short)(i11 << 8);
                      i11 = (short)(i11 | arrayOfByte6[4] & 0xFF);
                      if ((arrayOfByte6[0] == 83) && (arrayOfByte6[1] == 79) && (arrayOfByte6[2] == 84) && (i11 == arrayOfByte6.length - 5))
                      {
                        arrayOfByte2 = new byte[i11];
                        System.arraycopy(arrayOfByte6, 5, arrayOfByte2, 0, i11);
                        arrayOfByte6 = null;
                        bool = localHttpConnection.getHeaderField("PROTOCOL").equals("GZIP");
                      }
                      else
                      {
                        if (i3 != 200)
                        {
                          i1 = 1;
                          byte[] arrayOfByte7 = a(8484, i3, arrayOfByte6);
                          int i13 = a(arrayOfByte7, 0, arrayOfByte7.length);
                          localObject3 = new ByteArrayOutputStream();
                          localObject4 = new DataOutputStream((OutputStream)localObject3);
                          ((OutputStream)localObject4).write(aD);
                          ((DataOutputStream)localObject4).writeInt(i13);
                          ((DataOutputStream)localObject4).writeShort(arrayOfByte7.length + 12);
                          ((DataOutputStream)localObject4).writeInt(cB);
                          ((DataOutputStream)localObject4).writeLong(this.bQ);
                          ((OutputStream)localObject4).write(arrayOfByte7);
                          arrayOfByte3 = ((ByteArrayOutputStream)localObject3).toByteArray();
                          if (localObject4 != null)
                          {
                            ((DataOutputStream)localObject4).close();
                            localObject4 = null;
                          }
                          if (localObject3 != null)
                          {
                            ((ByteArrayOutputStream)localObject3).close();
                            localObject3 = null;
                          }
                        }
                        i3 = 204;
                        Threak.sleep(500L);
                        try
                        {
                          if (localOutputStream != null)
                          {
                            localOutputStream.close();
                            localOutputStream = null;
                          }
                          if (localObject1 != null)
                          {
                            ((DataInputStream)localObject1).close();
                            localObject1 = null;
                          }
                          if (localHttpConnection != null)
                          {
                            localHttpConnection.close();
                            localHttpConnection = null;
                          }
                        }
                        catch (Exception localException12)
                        {
                          h.a(localException12);
                        }
                      }
                      try
                      {
                        if (localOutputStream != null)
                        {
                          localOutputStream.close();
                          localOutputStream = null;
                        }
                        if (localObject1 != null)
                        {
                          ((DataInputStream)localObject1).close();
                          localObject1 = null;
                        }
                        if (localHttpConnection != null)
                        {
                          localHttpConnection.close();
                          localHttpConnection = null;
                        }
                      }
                      catch (Exception localException7)
                      {
                        h.a(localException7);
                      }
                    }
                  } while (i3 != 200);
                }
                catch (Exception localException8)
                {
                  i3 = 204;
                  Threak.sleep(500L);
                }
                finally
                {
                  try
                  {
                    if (localOutputStream != null)
                    {
                      localOutputStream.close();
                      localOutputStream = null;
                    }
                    if (localObject1 != null)
                    {
                      ((DataInputStream)localObject1).close();
                      localObject1 = null;
                    }
                    if (localHttpConnection != null)
                    {
                      localHttpConnection.close();
                      localHttpConnection = null;
                    }
                  }
                  catch (Exception localException13)
                  {
                    h.a(localException13);
                  }
                }
              }
              if (i3 == 200)
              {
                arrayOfByte1 = null;
                this.bF = true;
                if (bool)
                {
                  localObject2 = ",Z=" + arrayOfByte2.length;
                  arrayOfByte2 = f.a(arrayOfByte2);
                }
                Object localObject2 = new DataInputStream(new ByteArrayInputStream(arrayOfByte2));
                int i7 = ((DataInputStream)localObject2).readByte();
                if (i7 > 0)
                {
                  for (int i8 = 0; i8 < i7; i8++)
                  {
                    i9 = ((DataInputStream)localObject2).readShort();
                    i10 = ((DataInputStream)localObject2).readByte();
                    i11 = ((DataInputStream)localObject2).readShort();
                    if (i11 != 0)
                    {
                      byte[] arrayOfByte8 = new byte[i11];
                      ((DataInputStream)localObject2).readFully(arrayOfByte8);
                      DataInputStream localDataInputStream2 = new DataInputStream(new ByteArrayInputStream(arrayOfByte8));
                      this.cl.a(i9, i10, localDataInputStream2);
                      localDataInputStream2.close();
                      arrayOfByte8 = null;
                    }
                  }
                  if (localObject2 != null)
                  {
                    ((DataInputStream)localObject2).close();
                    localObject2 = null;
                  }
                }
                else
                {
                  arrayOfByte1 = null;
                  try
                  {
                    if (localOutputStream != null)
                    {
                      localOutputStream.close();
                      localOutputStream = null;
                    }
                    if (localObject1 != null)
                    {
                      ((DataInputStream)localObject1).close();
                      localObject1 = null;
                    }
                    if (localHttpConnection != null)
                    {
                      localHttpConnection.close();
                      localHttpConnection = null;
                    }
                  }
                  catch (Exception localException10) {}
                  continue;
                }
              }
            }
            else if (this.b7 == 2)
            {
              jdMethod_do();
              arrayOfByte1 = jdMethod_int();
              if (arrayOfByte1 != null) {
                jdMethod_case();
              }
              if (arrayOfByte1 != null)
              {
                this.cu.write(arrayOfByte1);
                this.cu.flush();
              }
              else
              {
                arrayOfByte1 = null;
                try
                {
                  if (localOutputStream != null)
                  {
                    localOutputStream.close();
                    localOutputStream = null;
                  }
                  if (localObject1 != null)
                  {
                    ((DataInputStream)localObject1).close();
                    localObject1 = null;
                  }
                  if (localHttpConnection != null)
                  {
                    localHttpConnection.close();
                    localHttpConnection = null;
                  }
                }
                catch (Exception localException5) {}
                continue;
              }
              arrayOfByte1 = null;
              this.bF = true;
              if (this.ch != null)
              {
                int i4 = this.ch.readByte() == 1 ? 1 : 0;
                int i5 = this.ch.readShort();
                byte[] arrayOfByte5 = new byte[i5];
                this.ch.readFully(arrayOfByte5);
                if (i4 != 0) {
                  arrayOfByte5 = f.a(arrayOfByte5);
                }
                DataInputStream localDataInputStream1 = new DataInputStream(new ByteArrayInputStream(arrayOfByte5));
                i9 = localDataInputStream1.readByte();
                for (i10 = 0; i10 < i9; i10++)
                {
                  i11 = localDataInputStream1.readShort();
                  int i12 = localDataInputStream1.readByte();
                  int i14 = localDataInputStream1.readShort();
                  if (i14 != 0)
                  {
                    localObject3 = new byte[i14];
                    localDataInputStream1.readFully((byte[])localObject3);
                    localObject4 = new DataInputStream(new ByteArrayInputStream((byte[])localObject3));
                    this.cl.a(i11, i12, (DataInputStream)localObject4);
                    ((DataInputStream)localObject4).close();
                  }
                }
                localDataInputStream1.close();
              }
              else
              {
                arrayOfByte1 = null;
                try
                {
                  if (localOutputStream != null)
                  {
                    localOutputStream.close();
                    localOutputStream = null;
                  }
                  if (localObject1 != null)
                  {
                    ((DataInputStream)localObject1).close();
                    localObject1 = null;
                  }
                  if (localHttpConnection != null)
                  {
                    localHttpConnection.close();
                    localHttpConnection = null;
                  }
                }
                catch (Exception localException6) {}
                continue;
              }
            }
          }
          int i2 = this.b7 == 2 ? 20 : 500;
          Threak.sleep(i2);
          arrayOfByte1 = null;
          try
          {
            if (localOutputStream != null)
            {
              localOutputStream.close();
              localOutputStream = null;
            }
            if (localObject1 != null)
            {
              ((DataInputStream)localObject1).close();
              localObject1 = null;
            }
            if (localHttpConnection != null)
            {
              localHttpConnection.close();
              localHttpConnection = null;
            }
          }
          catch (Exception localException1) {}
        }
        catch (Exception localException2)
        {
          localException2.printStackTrace();
          this.bF = true;
          jdMethod_byte();
        }
        finally
        {
          arrayOfByte1 = null;
          try
          {
            if (localOutputStream != null)
            {
              localOutputStream.close();
              localOutputStream = null;
            }
            if (localObject1 != null)
            {
              ((DataInputStream)localObject1).close();
              localObject1 = null;
            }
            if (localHttpConnection != null)
            {
              localHttpConnection.close();
              localHttpConnection = null;
            }
          }
          catch (Exception localException14) {}
        }
      }
    }
    System.out.println("comm stop");
  }
  
  private boolean jdMethod_char()
  {
    return (this.bw != null) && (this.bu != null) && (!this.bt) && (this.bF);
  }
  
  public byte[] jdMethod_int()
  {
    if ((this.bt) || (this.br == null) || (this.bp == null) || (this.bw == null) || (this.bu == null)) {
      return null;
    }
    this.bo = true;
    try
    {
      byte[] arrayOfByte1 = this.br.toByteArray();
      byte[] arrayOfByte2 = this.bp.toByteArray();
      byte[] arrayOfByte3 = new byte[arrayOfByte2.length + arrayOfByte1.length + 1];
      arrayOfByte3[0] = this.bn;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 1, arrayOfByte2.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 1 + arrayOfByte2.length, arrayOfByte1.length);
      int i1 = a(arrayOfByte3, 0, arrayOfByte3.length);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      if (this.b7 == 2)
      {
        localDataOutputStream.writeByte(if);
        localDataOutputStream.writeByte(bb);
        localDataOutputStream.write(bk);
      }
      localDataOutputStream.write(aD);
      localDataOutputStream.writeInt(i1);
      localDataOutputStream.writeShort(arrayOfByte3.length + 12);
      localDataOutputStream.writeInt(cB);
      localDataOutputStream.writeLong(this.bQ);
      localDataOutputStream.write(arrayOfByte3);
      byte[] arrayOfByte4 = localByteArrayOutputStream.toByteArray();
      if (localDataOutputStream != null)
      {
        localDataOutputStream.close();
        localDataOutputStream = null;
      }
      if (localByteArrayOutputStream != null)
      {
        localByteArrayOutputStream.close();
        localByteArrayOutputStream = null;
      }
      return arrayOfByte4;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public boolean jdMethod_int(int paramInt)
  {
    while (this.bt) {}
    this.bt = true;
    while (this.bo) {}
    try
    {
      if (this.bw == null)
      {
        this.bd = 0;
        this.bn = 0;
        this.bp = new ByteArrayOutputStream();
        this.br = new ByteArrayOutputStream();
        this.bu = new DataOutputStream(this.bp);
        this.bw = new DataOutputStream(this.br);
        this.bu.writeShort(0);
      }
      jdMethod_new(paramInt);
      return true;
    }
    catch (Exception localException) {}
    return true;
  }
  
  public void jdMethod_case()
  {
    try
    {
      if (this.br != null)
      {
        this.br.close();
        this.br = null;
      }
      if (this.bp != null)
      {
        this.bp.close();
        this.bp = null;
      }
      if (this.bw != null)
      {
        this.bw.close();
        this.bw = null;
      }
      if (this.bu != null)
      {
        this.bu.close();
        this.bu = null;
      }
      this.bo = false;
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_if()
  {
    try
    {
      if (this.bu != null)
      {
        this.bu.writeShort(this.bd);
        this.bn = ((byte)(this.bn + 1));
        this.bt = false;
      }
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_do(int paramInt)
  {
    try
    {
      this.bw.writeByte(paramInt);
      this.bd += 1;
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_new(int paramInt)
  {
    try
    {
      this.bw.writeShort(paramInt);
      this.bd += 2;
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_for(int paramInt)
  {
    try
    {
      this.bw.writeInt(paramInt);
      this.bd += 4;
    }
    catch (Exception localException) {}
  }
  
  public void a(long paramLong)
  {
    try
    {
      this.bw.writeLong(paramLong);
      this.bd += 8;
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_if(String paramString)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      int i1 = paramString.length();
      for (int i2 = 0; i2 < i1; i2++)
      {
        int i3 = paramString.charAt(i2);
        int i4 = 0;
        i4 |= i3 & 0xFFFF;
        if ((i4 >= 0) && (i4 < 128))
        {
          localByteArrayOutputStream.write((byte)(i4 & 0xFF));
        }
        else if ((i4 > 127) && (i4 < 2048))
        {
          localByteArrayOutputStream.write((byte)(i4 >>> 6 & 0x1F | 0xC0));
          localByteArrayOutputStream.write((byte)(i4 >>> 0 & 0x3F | 0x80));
        }
        else if ((i4 > 2047) && (i4 < 65536))
        {
          localByteArrayOutputStream.write((byte)(i4 >>> 12 & 0xF | 0xE0));
          localByteArrayOutputStream.write((byte)(i4 >>> 6 & 0x3F | 0x80));
          localByteArrayOutputStream.write((byte)(i4 >>> 0 & 0x3F | 0x80));
        }
        else if ((i4 > 65535) && (i4 < 1048575))
        {
          localByteArrayOutputStream.write((byte)(i4 >>> 18 & 0x7 | 0xF0));
          localByteArrayOutputStream.write((byte)(i4 >>> 12 & 0x3F | 0x80));
          localByteArrayOutputStream.write((byte)(i4 >>> 6 & 0x3F | 0x80));
          localByteArrayOutputStream.write((byte)(i4 >>> 0 & 0x3F | 0x80));
        }
      }
      localByteArrayOutputStream.flush();
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      this.bw.writeShort(arrayOfByte.length);
      this.bw.write(arrayOfByte);
      this.bd += arrayOfByte.length + 2;
    }
    catch (Exception localException) {}finally
    {
      localByteArrayOutputStream = null;
    }
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = -269488145;
    if (aX == null)
    {
      aX = new int['Ā'];
      for (int i4 = 0; i4 < 256; i4++)
      {
        int i3 = i4;
        for (int i5 = 0; i5 < 8; i5++) {
          if ((i3 & 0x1) == 1) {
            i3 = 0xEDB88320 ^ i3 >>> 1;
          } else {
            i3 >>>= 1;
          }
        }
        aX[i4] = i3;
      }
    }
    for (int i2 = paramInt1; i2 < paramInt2 + paramInt1; i2++) {
      i1 = aX[((i1 ^ paramArrayOfByte[i2]) & 0xFF)] ^ i1 >>> 8;
    }
    i1 ^= 0xFFFFFFFF;
    return i1;
  }
  
  public static int a(byte paramByte)
  {
    cd = null;
    HttpConnection localHttpConnection = null;
    int i1 = 1;
    int i2 = 0;
    while (i1 != 0)
    {
      if (i2 >= 2) {
        return 2;
      }
      try
      {
        switch (paramByte)
        {
        case 0: 
          localHttpConnection = (HttpConnection)Connector.open("http://10.0.0.172:80/a", 3, true);
          localHttpConnection.setRequestProperty("X-Online-Host", ct);
          break;
        case 1: 
          localHttpConnection = (HttpConnection)Connector.open("http://" + ct + "/a", 3, true);
        }
        localHttpConnection.setRequestMethod("GET");
        InputStream localInputStream = localHttpConnection.openInputStream();
        int i3 = 0;
        byte[] arrayOfByte1 = new byte['Ѐ'];
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        while ((i3 = localInputStream.read(arrayOfByte1)) != -1) {
          localByteArrayOutputStream.write(arrayOfByte1, 0, i3);
        }
        byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
        cd = new String(arrayOfByte2);
        int i4 = (short)cd.indexOf("hRet=");
        int i5 = (short)cd.indexOf("status=");
        int i6 = (short)cd.indexOf("userId=");
        int i7 = (short)cd.indexOf("key=");
        if ((i4 == -1) || (i5 == -1) || (i6 == -1) || (i7 == -1))
        {
          i2 = (byte)(i2 + 1);
          try
          {
            if (localHttpConnection != null) {
              localHttpConnection.close();
            }
          }
          catch (Exception localException3) {}
          localHttpConnection = null;
        }
        else
        {
          bM = cd.substring(i4 + 5, i5 - 2);
          G = cd.substring(i5 + 7, i6 - 2);
          dm = cd.substring(i6 + 7, i7 - 2);
          cs = cd.substring(i7 + 4, cd.length() - 2);
          cd = null;
          if (!bM.equals("0"))
          {
            i8 = 1;
            return i8;
          }
          localInputStream.close();
          int i8 = 0;
          return i8;
        }
      }
      catch (Exception localException1)
      {
        i2 = (byte)(i2 + 1);
      }
      finally
      {
        try
        {
          if (localHttpConnection != null) {
            localHttpConnection.close();
          }
        }
        catch (Exception localException6) {}
        localHttpConnection = null;
      }
    }
    return 3;
  }
  
  public static void a()
  {
    if (dm.trim().length() == 0) {
      return;
    }
    try
    {
      StreamConnection localStreamConnection = (StreamConnection)Connector.open("socket://" + c4);
      OutputStream localOutputStream = localStreamConnection.openOutputStream();
      String str1 = "CMCCGAME_userId=";
      String str2 = dm + "          ";
      str1 = str1 + str2.substring(0, 10);
      byte[] arrayOfByte = str1.getBytes();
      localOutputStream.write(arrayOfByte);
      localOutputStream.flush();
      if (localOutputStream != null) {
        localOutputStream.close();
      }
      if (localStreamConnection != null) {
        localStreamConnection.close();
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void jdMethod_new()
  {
    u localu = new u();
    new Threak(localu).start();
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\q.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */