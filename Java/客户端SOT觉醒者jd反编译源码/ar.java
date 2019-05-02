import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class ar
  extends a3
{
  public static final byte cP = 0;
  public static final byte db = 1;
  public static final byte di = 2;
  public static final byte cR = 3;
  public static final byte c0 = 0;
  public static final byte b5 = 1;
  public static final byte b3 = 2;
  public static final byte cS = 3;
  public static final byte cc = 0;
  public static final byte b9 = 1;
  public static final byte de = 2;
  public static final byte dh = 3;
  public static final byte b8 = 4;
  public static final byte b7 = 5;
  public static final byte cY = 6;
  public static final byte cM = 7;
  public static short cd = 100;
  public static short cK = 500;
  public static byte bR = 40;
  public static byte cn = 20;
  public static final byte cW = 1;
  public static final byte bT = 2;
  public static final byte cl = 2;
  public static final byte cp = 3;
  public static final byte cD = 4;
  public static final byte cC = 5;
  public static final byte cB = 6;
  public static short dg = -1;
  public short cv;
  private byte cH;
  public boolean df = false;
  public boolean cm = false;
  public short cZ = 0;
  public byte dr;
  public byte cG;
  public byte b0;
  public byte cy;
  public boolean bY;
  public byte ca;
  public byte bZ;
  public byte dq;
  public boolean cf = true;
  public int c9;
  public byte dc;
  public byte ck;
  private byte c5;
  private byte cE;
  public byte dm;
  public short dp;
  public short dn;
  public byte cj;
  public byte ch;
  public byte cg;
  public byte[][] cz = (byte[][])null;
  public byte c6;
  public byte bV;
  ag cT = null;
  public byte b2 = -1;
  boolean ci = false;
  short dj;
  byte cw;
  byte cX;
  public static byte c3 = 0;
  public static short[] ds = null;
  public static String[] bX = null;
  public static byte[] dd = null;
  public static short[] cb = null;
  public static byte[] cU = null;
  public static byte[] dk = null;
  public static final byte c2 = (byte)(h.ff ? 10 : 5);
  public static final byte da = 0;
  public static final byte b1 = 1;
  public static final byte cF = 2;
  public static final byte cI = 3;
  public static byte c8 = 0;
  public static Image[] cV = null;
  public static short[] ce = null;
  public static String[] cx = null;
  public static byte[] cL = null;
  public static int[] cA = null;
  public static int[] co = null;
  public static short[] b6 = null;
  public static short[] cQ = null;
  public static short[] b4 = null;
  public static short[] cO = null;
  public static byte[] cu = null;
  public static byte[][] bU = (byte[][])null;
  public static byte[] cs = null;
  public static byte[][] bS = (byte[][])null;
  public static byte[] cr = null;
  public static byte[][] bQ = (byte[][])null;
  public static byte[] cJ = null;
  public static byte[] bW = null;
  public static byte[] dl = null;
  public static byte[] cN = null;
  public static byte[] c7 = null;
  public static byte[] c1 = null;
  public static byte[] ct = null;
  public static byte[] cq = null;
  public static byte[] c4 = null;
  
  public ar(h paramh, byte paramByte, boolean paramBoolean)
  {
    super(paramh, null);
    this.O = null;
    this.cf = true;
    this.c9 = 0;
    this.aK = 20;
    this.bA = 25;
    this.b0 = 0;
    this.aI = ((byte)(this.bA - 4));
    this.cm = false;
    this.dm = paramByte;
    if (paramByte < paramh.fU / c8) {
      this.b2 = 0;
    } else {
      this.b2 = 1;
    }
    this.bz = paramBoolean;
  }
  
  private void m()
  {
    this.T = false;
    if (this.b0 != 1) {
      this.b0 = 0;
    } else if ((this.cT != null) && (this.cT == a3.bE.cZ)) {
      if (this.aM + this.bA < this.cT.aP + this.cT.bA) {
        this.jdField_try = 2;
      } else {
        this.jdField_try = 0;
      }
    }
    this.jdField_try = ((byte)h.jdMethod_if(0, 3));
    if (this.jdField_try == 3) {
      this.au = 3;
    } else if (this.jdField_try == 1) {
      this.au = 1;
    }
  }
  
  public void w()
  {
    if ((!this.df) && (g.dD != 2))
    {
      this.cv = ((short)(this.cv + 1));
      if (this.cv >= cd)
      {
        this.cv = 0;
        p();
      }
    }
  }
  
  protected int f()
  {
    if (this.ci) {
      return this.bb * a.i;
    }
    if ((this.b0 == 1) || (this.b0 == 4)) {
      return this.bb * a.t;
    }
    return this.bb;
  }
  
  public void q()
  {
    a3.bE.fj.setColor(0);
    a3.bE.fj.fillRect(this.aP - ag.hF, this.aM - ag.hE - 10, 22, 4);
    a3.bE.fj.setColor(16711680);
    a3.bE.fj.fillRect(this.aP - ag.hF + 1, this.aM - ag.hE - 9, a((byte)16) * 20 / a((byte)20), 2);
    if (a3.bE.dT != 1) {
      if ((this.bY) && (a3.bE.cJ.jdField_int / 2 % 2 == 0)) {
        a3.bE.a((a((byte)14) < a3.bE.cZ.a((byte)14) + 4) || (this.bz) ? this.O : "????", this.aP - ag.hF + 1, this.aM - ag.hE - 27, 0, h.b2[0][0]);
      } else if ((a((byte)14) < a3.bE.cZ.a((byte)14) + 4) || (this.bz)) {
        a3.bE.a(this.O, this.aP - ag.hF + 1, this.aM - ag.hE - 27, 0, h.b2[2][0]);
      } else {
        a3.bE.a("????", this.aP - ag.hF + 1, this.aM - ag.hE - 27, 0, h.b2[4][0]);
      }
    }
  }
  
  public void jdMethod_char()
  {
    if (this.bZ > 0) {
      this.bZ = ((byte)(this.bZ - 1));
    }
    if (this.bY)
    {
      this.ca = ((byte)(this.ca - 1));
      if (this.ca < 0)
      {
        this.ca = 0;
        this.bY = false;
      }
    }
    if ((this.cf) && (g.dD == 2))
    {
      if ((a3.bE.cJ.jdField_int % 2 == 0) && (this.c9 < bR)) {
        return;
      }
      this.a4 = 112;
      if (this.al[1] != 0) {
        this.af.a(0, 0, this.al);
      }
    }
    else
    {
      if (!this.df) {
        return;
      }
      if (this.cf)
      {
        if (a3.bE.cJ.jdField_int % 2 == 0) {
          return;
        }
        this.a4 = 112;
        if (this.al[1] != 0) {
          this.af.a(0, 0, this.al);
        }
      }
    }
    int i = 0;
    switch (this.a4)
    {
    case 3: 
      if (this.al[1] != 2) {
        this.af.a(2, 0, this.al);
      }
      if ((a3.bE.cJ.jdField_int % 3 == 0) && (h.jdMethod_if(0, 10) < 5)) {
        this.au = 3;
      } else {
        this.au = 1;
      }
      break;
    case 0: 
      switch (this.au)
      {
      case 1: 
      case 3: 
        if (this.al[1] != 2) {
          this.af.a(2, 0, this.al);
        }
        break;
      }
      break;
    case 1: 
      if (this.al[1] != 3) {
        this.af.a(3, 0, this.al);
      }
      a((byte)1, this.au);
      break;
    case 2: 
      if (this.al[1] != this.c5) {
        this.af.a(this.c5, 0, this.al);
      }
      a((byte)2, this.au);
      break;
    case 112: 
      if (!this.cf)
      {
        if (((this.bF == 4) && (this.bP == true)) || ((this.bF == 5) && (this.bc == true)))
        {
          if (this.au == 3) {
            this.af.a(2, 0, this.al);
          } else {
            this.af.a(2, 0, this.al);
          }
          this.bc = false;
          this.bP = false;
        }
        else if ((!this.T) && (this.al[1] != 1))
        {
          this.af.a(1, 0, this.al);
          this.bc = false;
          this.bP = false;
        }
        if ((!this.T) && (this.j))
        {
          this.jdField_new = ((short)(this.jdField_new + 1));
          if (this.au == 3) {
            i = a3.bt[((100000 - this.jdField_new) % a3.bt.length)];
          } else {
            i = a3.bt[(this.jdField_new % a3.bt.length)];
          }
        }
      }
      jdMethod_int();
    }
    if (this.au == 3) {
      i = (byte)(i ^ 0x2);
    }
    if (this.cm) {
      this.af.a(this.aP - ag.hF, this.aM - ag.hE, cV[this.ck], this.al, i);
    }
    i();
    if (this.cf) {
      return;
    }
    if ((this.dc > 0) || (this.bY))
    {
      q();
      this.dc = ((byte)(this.dc - 1));
    }
    this.af.a(this.al);
    if ((this.al[4] == 0) && ((this.a4 == 2) || (this.a4 == 1)))
    {
      v();
      m();
    }
    if ((a3.bE.dT != 1) && (this.bz)) {
      a3.bE.a(this.O, this.aP - ag.hF + 1, this.aM - ag.hE - 27, 0, h.b2[2][0]);
    }
  }
  
  protected void jdMethod_new()
  {
    if (jdMethod_do((byte)0)) {
      this.aM = ((short)(this.aM + a3.bp[this.jdField_try] * f()));
    } else {
      m();
    }
  }
  
  protected void h()
  {
    if (jdMethod_do((byte)2)) {
      this.aM = ((short)(this.aM + a3.bp[this.jdField_try] * f()));
    } else {
      m();
    }
  }
  
  protected void g()
  {
    if (jdMethod_do((byte)3)) {
      this.aP = ((short)(this.aP + a3.bq[this.jdField_try] * f()));
    } else {
      m();
    }
  }
  
  protected void c()
  {
    if (jdMethod_do((byte)1)) {
      this.aP = ((short)(this.aP + a3.bq[this.jdField_try] * f()));
    } else {
      m();
    }
  }
  
  public void d()
  {
    m();
  }
  
  public byte jdMethod_int(byte paramByte)
  {
    return paramByte;
  }
  
  public boolean jdMethod_else()
  {
    return this.cf;
  }
  
  public void jdMethod_case()
  {
    w();
    if (!this.df) {
      return;
    }
    this.cm = jdMethod_if(this.aP, this.aM);
    if (!this.cm)
    {
      this.cZ = ((short)(this.cZ + 1));
      if ((this.cZ >= cK) && (g.dD != 2)) {
        this.df = false;
      }
    }
    else
    {
      this.cZ = 0;
    }
    if ((this.df) && (!this.cf))
    {
      if (!this.ao)
      {
        m();
        this.ao = true;
      }
      u();
    }
    else if ((this.df) && (this.cf))
    {
      if (a3.bE.cZ.hj != this) {
        this.c9 += 1;
      }
      if (this.c9 >= (g.dD == 2 ? bR : cn))
      {
        this.cf = true;
        this.df = false;
        int i;
        int j;
        if (this.aD == a3.bE.cZ)
        {
          this.aD.jdMethod_for(this);
          if ((g.dD != 2) || (g.dZ != 1))
          {
            i = 0;
            if (a3.bE.cZ.gE) {
              for (j = 0; j < a3.bE.bR.d.size(); j = (byte)(j + 1))
              {
                ao localao1 = (ao)a3.bE.bR.d.elementAt(j);
                if ((localao1.P == 3) && (localao1.jdField_for[0] == this.t) && (localao1.jdField_for[1] > a3.bE.jdField_else))
                {
                  if (a3.bE.aG.jdMethod_int(3601))
                  {
                    a3.bE.aG.jdMethod_for(a3.bE.cZ.gz);
                    a3.bE.aG.jdMethod_new(localao1.E);
                    a3.bE.aG.jdMethod_new(this.t);
                    a3.bE.aG.jdMethod_do(this.z);
                    a3.bE.aG.jdMethod_do(this.jdField_if);
                    a3.bE.aG.jdMethod_new(a3.jdMethod_int(this.jdField_for, 0));
                    a3.bE.aG.jdMethod_if();
                  }
                  i = 1;
                }
              }
            }
            if (i == 0)
            {
              j = 1;
              if ((g.dD == 2) && (g.dZ == 0))
              {
                for (int k = 0; k < g.jS.length; k = (byte)(k + 1)) {
                  if (!g.jS[k].cf)
                  {
                    j = 0;
                    break;
                  }
                }
                if (j != 0) {
                  for (k = 0; k < a3.bE.bR.d.size(); k = (byte)(k + 1))
                  {
                    ao localao3 = (ao)a3.bE.bR.d.elementAt(k);
                    if ((localao3.E == 8888) && (localao3.jdField_for[0] == this.t))
                    {
                      j = 0;
                      break;
                    }
                  }
                }
              }
              if ((j != 0) && (a3.bE.aG.jdMethod_int(4019)))
              {
                a3.bE.aG.jdMethod_new(this.t);
                a3.bE.aG.jdMethod_do(a((byte)14));
                if (g.dD == 1) {
                  a3.bE.aG.jdMethod_do(0);
                } else if (g.dD == 2) {
                  if (g.dZ == 0) {
                    a3.bE.aG.jdMethod_do(1);
                  } else {
                    a3.bE.aG.jdMethod_do(2);
                  }
                }
                a3.bE.aG.jdMethod_do(this.z);
                a3.bE.aG.jdMethod_do(this.jdField_if);
                a3.bE.aG.jdMethod_new(a3.jdMethod_int(this.jdField_for, 0));
                a3.bE.aG.jdMethod_new(this.aP + this.aK / 2);
                a3.bE.aG.jdMethod_new(this.aM + this.bA / 2);
                a3.bE.aG.jdMethod_new(a3.bE.cZ.aP + 10);
                a3.bE.aG.jdMethod_new(a3.bE.cZ.aM + 15);
                a3.bE.aG.jdMethod_if();
              }
            }
          }
        }
        if ((g.dD == 2) && (g.dZ == 0))
        {
          if (a3.bE.cJ.jdField_if < 3) {
            a3.bE.cZ.at();
          }
          i = 1;
          for (j = 0; j < g.jS.length; j = (byte)(j + 1)) {
            if (!g.jS[j].cf)
            {
              i = 0;
              break;
            }
          }
          if (i != 0)
          {
            a3.bE.cZ.T = false;
            a3.bE.cZ.ao = false;
            a3.bE.cZ.hU = false;
            a3.bE.cZ.a4 = 0;
            if (this.v > 0) {
              a3.bE.S.a(this.v, a3.bE.cJ);
            } else {
              for (j = 0; j < a3.bE.bR.d.size(); j = (byte)(j + 1))
              {
                ao localao2 = (ao)a3.bE.bR.d.elementAt(j);
                if ((localao2.P == 9) && (localao2.jdField_for[0] == this.t))
                {
                  if ((localao2.E == 8888) && (a3.bE.cZ.fj != 17))
                  {
                    a3.bE.S.a(1, a3.bE.cJ);
                    break;
                  }
                  a3.bE.bR.a(localao2.E, true);
                  break;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public boolean j()
  {
    if (h.jdMethod_if(1, 100) <= this.c6)
    {
      if (h.a(this, this.cT) < o())
      {
        if ((h.jdMethod_if(1, 100) < this.cg) && (a((byte)16) < a((byte)20) / 10))
        {
          this.a4 = 2;
          this.b0 = 3;
          this.c5 = 6;
          r();
          return true;
        }
        if (h.jdMethod_if(1, 100) < this.ch)
        {
          this.a4 = 2;
          this.b0 = 3;
          this.c5 = 5;
          r();
          return true;
        }
        if (h.jdMethod_if(1, 100) < this.cj)
        {
          this.a4 = 2;
          this.b0 = 3;
          this.c5 = 4;
          r();
          return true;
        }
      }
      if ((h.a(this, this.cT) < this.dn * 3) && (Math.abs(this.aM + this.bA - this.cT.aM - this.cT.bA) <= 6))
      {
        this.a4 = 1;
        this.b0 = 2;
        r();
        return true;
      }
    }
    return false;
  }
  
  public void v()
  {
    this.cT.hd = 2;
    if (t()) {
      synchronized (bX)
      {
        if (ds[0] != this.t)
        {
          this.cT = a3.bE.cZ;
          return;
        }
        int i = 0;
        short s1 = 0;
        short s2 = 0;
        short[] arrayOfShort = new short[a.ad];
        byte b10 = 0;
        int j = -1;
        boolean bool1 = false;
        int k = 0;
        int m = 0;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = -1;
        boolean bool2 = false;
        byte b15 = -1;
        String str = null;
        synchronized (a3.bE.cJ.mX)
        {
          for (i1 = 0; i1 < a3.bE.cJ.kT; i1 = (short)(i1 + 1)) {
            if (((g.dD == 2) && (g.dZ == 1)) || ((a3.bE.cJ.iy[i1].equals(bX[0])) && (!h.jdMethod_case(a3.bE.cJ.dq[i1])) && (!h.D(a3.bE.cJ.dq[i1])) && (a3.bE.cJ.iy[i1].equals(bX[0])) && (!h.jdMethod_case(a3.bE.cJ.dq[i1])) && (!h.D(a3.bE.cJ.dq[i1])) && ((a3.bE.cJ.dq[i1] & 0x1) != 1) && (!a3.bE.cJ.iy[i1].equals(a3.bE.cJ.hD))))
            {
              i = 1;
              s1 = a3.bE.cJ.mX[i1];
              s2 = a3.bE.cJ.mW[i1];
              b10 = a3.bE.cJ.eX[i1];
              j = a3.bE.cJ.mL[i1];
              k = a3.bE.cJ.gT[i1];
              m = a3.bE.cJ.k9[i1];
              b11 = a3.bE.cJ.jn[i1];
              b12 = a3.bE.cJ.jm[i1];
              b13 = a3.bE.cJ.hQ[i1];
              b14 = a3.bE.cJ.k7[i1];
              bool1 = h.H(a3.bE.cJ.dq[i1]);
              bool2 = h.u(a3.bE.cJ.dq[i1]);
              b15 = a3.bE.cJ.gh[i1];
              str = a3.bE.cJ.fy[i1];
              for (i2 = 0; i2 < arrayOfShort.length; i2 = (byte)(i2 + 1)) {
                arrayOfShort = a3.bE.cJ.jC[i1];
              }
              break;
            }
          }
        }
        if (i == 0)
        {
          n();
          return;
        }
        if (g.dD == 1) {
          if (h.jdMethod_if(s1, this.aP, s2, this.aM) > (h.ff ? 200 : 120))
          {
            n();
            return;
          }
        }
        int n = 0;
        int i1 = -1;
        for (int i2 = 0; i2 < a3.bE.cJ.li.length; i2 = (byte)(i2 + 1))
        {
          if ((!a3.bE.cJ.li[i2].gq) && (a3.bE.cJ.li[i2].O.equals(bX[0])))
          {
            n = 1;
            break;
          }
          if (a3.bE.cJ.li[i2].gq)
          {
            i1 = i2;
            break;
          }
        }
        if ((n == 0) && (i1 != -1))
        {
          a3.bE.cJ.li[i1].hd = 3;
          a3.bE.cJ.li[i1].O = bX[0];
          a3.bE.cJ.li[i1].gD = b10;
          a3.bE.cJ.li[i1].bo = dd[0];
          a3.bE.cJ.li[i1].fa = k;
          a3.bE.cJ.li[i1].g4 = m;
          a3.bE.a(a3.bE.cJ.li[i1], b13);
          a3.bE.cJ.li[i1].hP = b11;
          a3.bE.cJ.li[i1].hO = b12;
          a3.bE.cJ.li[i1].fL = j;
          a3.bE.cJ.li[i1].fx = a3.bE.jdMethod_try(j);
          a3.bE.cJ.li[i1].es = a3.bE.jdMethod_if(j);
          a3.bE.cJ.li[i1].fj = b14;
          a3.bE.cJ.li[i1].dU = bool1;
          if (bool1) {
            a3.bE.cJ.li[i1].gE = true;
          }
          a3.bE.cJ.li[i1].eN = b15;
          a3.bE.cJ.li[i1].eB = str;
          a3.bE.cJ.li[i1].he = bool2;
          a3.bE.cJ.li[i1].aP = s1;
          a3.bE.cJ.li[i1].aM = s2;
          a3.bE.cJ.li[i1].a7 = arrayOfShort;
          int[] arrayOfInt = new int[a.ad];
          for (int i3 = 0; i3 < arrayOfShort.length; i3 = (byte)(i3 + 1)) {
            arrayOfInt[i3] = a3.a(arrayOfShort[i3], a.C);
          }
          a3.bE.cJ.li[i1].H = arrayOfInt;
          a3.bE.cJ.li[i1].gq = false;
          a3.bE.cJ.li[i1].N();
          a3.bE.cJ.li[i1].T = false;
          a3.bE.cJ.li[i1].ao = false;
          a3.bE.cJ.li[i1].hU = false;
          a3.bE.cJ.li[i1].a4 = 0;
          a3.bE.cJ.li[i1].gQ = a3.bE.a(a3.bE.cJ.li[i1].O);
          a3.bE.cJ.li[i1].h4 = false;
          a3.bE.cJ.li[i1].gk = false;
          if ((a3.bE.cJ.hD != null) && (a3.bE.cJ.hD.equals(a3.bE.cJ.li[i1].O))) {
            a3.bE.cJ.li[i1].gk = true;
          }
          this.dj = cb[0];
          this.cw = cU[0];
          this.cX = dk[0];
          this.cT = a3.bE.cJ.li[i1];
        }
        n();
      }
    } else {
      this.cT = a3.bE.cZ;
    }
  }
  
  public void u()
  {
    switch (this.b0)
    {
    case 2: 
      if (this.a4 != 1)
      {
        jdMethod_int(this.cT);
        this.a4 = 1;
        if (h.jdMethod_if(0, 1) == 0) {
          this.ci = false;
        }
      }
      break;
    case 3: 
      if (this.a4 != 2)
      {
        jdMethod_int(this.cT);
        this.a4 = 2;
        if (h.jdMethod_if(0, 1) == 0) {
          this.ci = false;
        }
      }
      break;
    case 5: 
      if (!this.cf)
      {
        if (this.a4 != 112)
        {
          jdMethod_int(this.aD);
          this.a4 = 112;
          this.jdField_new = 0;
        }
        if (jdMethod_for())
        {
          if (a3.bE.cZ.gV == this) {
            a3.bE.cZ.gV = null;
          }
          if (a3.bE.cZ.ep == this) {
            a3.bE.cZ.ep = null;
          }
          if (this.aD != null)
          {
            ((ag)this.aD).fw = null;
            if (this.aD != a3.bE.cZ)
            {
              ((ag)this.aD).h2 = null;
              ((ag)this.aD).gV = null;
              ((ag)this.aD).ep = null;
            }
          }
          if (a((byte)16) <= 0)
          {
            this.cT.hd = 2;
            this.cf = true;
            this.bY = false;
            this.ca = 0;
          }
          else
          {
            if ((this.dq == 3) || (this.dq == 2))
            {
              this.cy = ((byte)(this.cy + 1));
              if ((!this.bY) && (this.cy >= h.jdMethod_if(5, 10)))
              {
                this.bY = true;
                this.ca = ((byte)h.jdMethod_if(20, 70));
              }
            }
            if ((this.aD == a3.bE.cZ) && (h.jdMethod_if(1, 10) < 7))
            {
              this.cT.hd = 2;
              this.cT = a3.bE.cZ;
              if (((this.bF == 3) || (this.bF == 0) || (this.bF == 1)) && ((h.jdMethod_if(0, 3) == 0) || ((g.dD == 2) && (a((byte)16) < a((byte)20) / 10) && (h.jdMethod_if(0, 1) == 0))))
              {
                this.ci = true;
                if (!j())
                {
                  this.b0 = 1;
                  this.a4 = 0;
                }
              }
              else
              {
                if (h.jdMethod_if(0, 7) == 0) {
                  this.ci = true;
                }
                this.b0 = 1;
                this.a4 = 0;
              }
            }
            else
            {
              v();
              m();
            }
            this.aD = null;
          }
          this.bF = -1;
        }
      }
      break;
    case 1: 
      this.a4 = 0;
      if (this.cT == a3.bE.cZ)
      {
        if ((a3.bE.cJ.jdField_int % 5 == 0) && (this.cT.a4 == 2) && (h.jdMethod_if(0, 100) < this.c6))
        {
          if ((a((byte)16) < a((byte)20) / 4) && (h.jdMethod_if(0, 3) == 0)) {
            this.b0 = 4;
          } else if (h.jdMethod_if(0, 2) == 0) {
            j();
          } else if ((a((byte)16) < a((byte)20) / 2) && (h.jdMethod_if(0, 3) == 0)) {
            this.b0 = 4;
          } else if (h.jdMethod_if(0, 15) == 0) {
            this.b0 = 4;
          }
        }
        else if ((a3.bE.cJ.jdField_int % (this.ci ? 3 : 6) == 0) && (h.jdMethod_if(1, 100) < this.cg) && (a((byte)16) < a((byte)20) / 10) && (Math.abs(this.aM + this.bA - this.cT.aM - this.cT.bA) <= 16))
        {
          this.b0 = 3;
          this.c5 = 6;
          this.cE = 2;
          r();
        }
        else if ((a3.bE.cJ.jdField_int % (this.ci ? 6 : 12) == 0) && (h.jdMethod_if(1, 100) < this.ch) && (Math.abs(this.aM + this.bA - this.cT.aM - this.cT.bA) <= 16))
        {
          this.b0 = 3;
          this.c5 = 5;
          this.cE = 1;
          r();
        }
        else if ((a3.bE.cJ.jdField_int % (this.ci ? 5 : 15) == 0) && (h.jdMethod_if(1, 100) < this.cj) && (Math.abs(this.aM + this.bA - this.cT.aM - this.cT.bA) <= 16))
        {
          this.b0 = 3;
          this.c5 = 4;
          this.cE = 0;
          r();
        }
        else
        {
          if (a3.bE.cJ.jdField_int % (this.ci ? 4 : 8) != 0)
          {
            if (g.dD == 2) {
              if (a3.bE.cJ.jdField_int % (this.ci ? 3 : 6) != 0) {}
            }
          }
          else if ((h.a(this, this.cT) < this.dn) && (h.jdMethod_if(1, 100) <= this.c6) && (Math.abs(this.aM + this.bA - this.cT.aM - this.cT.bA) <= 10))
          {
            this.b0 = 2;
            r();
            break label1382;
          }
          if ((h.a(this, this.cT) > o()) && (this.cT == a3.bE.cZ)) {
            this.b0 = 0;
          } else if ((h.jdMethod_if(1, 10) < 5) && (a3.bE.cJ.jdField_int % 10 == 0)) {
            v();
          }
        }
      }
      else if ((h.a(this, this.cT) < this.dn) && (Math.abs(this.aM + this.bA - this.cT.aM - this.cT.bA) <= a.n)) {
        if (this.cw == 1)
        {
          this.b0 = 2;
        }
        else
        {
          this.b0 = 3;
          this.cE = this.cX;
          switch (this.cE)
          {
          case 0: 
            this.c5 = 4;
            break;
          case 1: 
            this.c5 = 5;
            break;
          case 2: 
            this.c5 = 6;
          }
        }
      }
      int i = this.cT.aP + this.cT.aK / 2;
      int j = this.cT.aM + this.cT.bA;
      int k = this.aP + this.aK / 2;
      int m = this.aM + this.bA;
      if (Math.abs(i - k) < Math.abs(j - m))
      {
        if (j - m > 0) {
          this.jdField_try = 2;
        } else {
          this.jdField_try = 0;
        }
      }
      else if (i - k > 0) {
        this.jdField_try = 1;
      } else {
        this.jdField_try = 3;
      }
      if (a3.bE.cJ.jdField_int % 3 == 0) {
        jdMethod_int(this.cT);
      }
      jdMethod_long();
      jdMethod_if();
      b();
      break;
    case 0: 
      this.a4 = 0;
      jdMethod_long();
      if ((h.jdMethod_if(1, 100) <= this.c6) && (a3.bE.cJ.jdField_int % 40 == 0)) {
        m();
      }
      jdMethod_if();
      b();
      if ((a3.bE.cJ.jdField_int % 5 == 0) && (h.a(this, this.cT) < o()) && (!this.cT.jdMethod_else()) && (!this.cT.a8) && (this.cT.a4 != 14) && (!this.cT.eT))
      {
        this.b0 = 1;
      }
      else if ((a3.bE.cJ.jdField_int % 5 == 0) && (h.jdMethod_if(1, 100) < 60))
      {
        v();
        if (this.cT != a3.bE.cZ)
        {
          this.b0 = 1;
          this.a4 = 0;
        }
      }
      break;
    case 4: 
      if ((this.cH = (byte)(this.cH - 1)) < 0)
      {
        this.cH = ((byte)h.jdMethod_if(15, 60));
        this.a4 = 0;
        byte b10 = 0;
        byte b11 = 0;
        if (this.cT.aP + this.cT.aK / 2 - (this.aP + this.aK / 2) > 0) {
          b10 = 3;
        } else {
          b10 = 1;
        }
        if (this.cT.aM + this.cT.bA - (this.aM + this.bA) > 0) {
          b11 = 0;
        } else {
          b11 = 2;
        }
        if (h.jdMethod_if(0, 1) == 0)
        {
          this.jdField_try = b10;
          this.au = this.jdField_try;
        }
        else
        {
          this.jdField_try = b11;
        }
      }
      jdMethod_long();
      jdMethod_if();
      b();
      if (h.a(this, this.cT) > o())
      {
        this.cH = 0;
        this.b0 = 0;
      }
      break;
    case 7: 
      label1382:
      this.a4 = 3;
      if (a3.bE.cZ.eY != this) {
        this.b0 = 0;
      }
      break;
    }
  }
  
  private short o()
  {
    return (short)(this.ci ? this.dp * a.i : this.dp);
  }
  
  private void jdMethod_int(a3 parama3)
  {
    if (parama3 == null) {
      return;
    }
    if (parama3.aP + parama3.aK / 2 > this.aP + this.aK / 2) {
      this.au = 1;
    } else {
      this.au = 3;
    }
  }
  
  public boolean a(a3 parama3)
  {
    if ((!this.cm) || (jdMethod_else()) || (this.bY)) {
      return false;
    }
    if ((this.b0 == 3) || (this.b0 == 7)) {
      return false;
    }
    if (a((byte)16) <= 0) {
      return false;
    }
    if ((((ag)parama3).a4 == 2) && (((ag)parama3).eZ == 2)) {
      return this.T;
    }
    return (this.b0 != 5) || ((this.bF != 0) && (this.bF != 1) && (this.bF != 3) && (this.bF != 2));
  }
  
  public void a(a3 parama3, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, short paramShort, boolean paramBoolean)
  {
    this.b0 = 5;
    if (paramByte3 == 4) {
      paramByte4 = (byte)Math.max(0, paramByte4 - this.bV);
    }
    this.dc = 20;
    int i;
    if (parama3 == a3.bE.cZ)
    {
      i = 0;
      if ((i = a3.bE.cZ.ac()) > 0)
      {
        a3.bE.cZ.jdMethod_do((byte)16, i);
        if (a3.bE.cZ.a((byte)16) > a3.bE.cZ.a((byte)20)) {
          a3.bE.cZ.jdMethod_if((byte)16, a3.bE.cZ.a((byte)20));
        }
        if (a3.bE.cJ.jdField_do == 0) {
          a3.bE.a(i, a3.bE.cZ.aP, a3.bE.cZ.aM, (byte)1);
        }
        if (a3.bE.aG.jdMethod_int(4015))
        {
          a3.bE.aG.jdMethod_do(0);
          a3.bE.aG.jdMethod_for(a3.jdMethod_new(i, 2));
          a3.bE.aG.jdMethod_for(a3.jdMethod_new(a3.bE.cZ.a((byte)16), 2));
          a3.bE.aG.jdMethod_for(a3.jdMethod_new(a3.bE.cZ.a((byte)24), 2));
          a3.bE.aG.jdMethod_if();
        }
      }
      if (((i = a3.bE.cZ.ai()) > 0) && (a3.bE.aG.jdMethod_int(4015)))
      {
        a3.bE.aG.jdMethod_do(1);
        a3.bE.aG.jdMethod_for(a3.jdMethod_new(i, 2));
        a3.bE.aG.jdMethod_for(a3.jdMethod_new(a3.bE.cZ.a((byte)16), 2));
        a3.bE.aG.jdMethod_for(a3.jdMethod_new(a3.bE.cZ.a((byte)24), 2));
        a3.bE.aG.jdMethod_if();
      }
    }
    if ((a3.bE.cZ.gE) && (g.dD == 2) && (g.dZ == 1))
    {
      if ((parama3 == a3.bE.cZ) && (paramShort > 0))
      {
        int j;
        for (i = 0; i < a3.bE.bR.d.size(); j = (byte)(i + 1))
        {
          ao localao = (ao)a3.bE.bR.d.elementAt(i);
          if ((localao.P == 4) && (localao.jdField_for[0] == this.t))
          {
            if (!a3.bE.aG.jdMethod_int(3603)) {
              break;
            }
            a3.bE.aG.jdMethod_new(a3.bE.cJ.jdField_if);
            a3.bE.aG.jdMethod_for(a3.bE.cZ.gz);
            a3.bE.aG.jdMethod_new(localao.E);
            a3.bE.aG.jdMethod_new(this.t);
            a3.bE.aG.jdMethod_do(this.dm);
            a3.bE.aG.jdMethod_do(paramByte1);
            a3.bE.aG.jdMethod_do(paramByte2);
            a3.bE.aG.jdMethod_new(paramShort);
            a3.bE.aG.jdMethod_if();
            break;
          }
        }
      }
      if ((!a3.bE.cJ.iJ) && (a((byte)16) <= paramShort)) {
        paramShort = (short)(a((byte)16) - 1);
      }
    }
    else if ((this.bz) && (parama3 == a3.bE.cZ))
    {
      if (a3.bE.aG.jdMethod_int(3652))
      {
        a3.bE.aG.jdMethod_new(this.t);
        a3.bE.aG.jdMethod_do(a((byte)14));
        a3.bE.aG.jdMethod_do(paramByte1);
        a3.bE.aG.jdMethod_do(paramByte2);
        a3.bE.aG.jdMethod_new(paramShort);
        a3.bE.aG.jdMethod_if();
      }
      if (a((byte)16) <= paramShort) {
        paramShort = (short)(a((byte)16) - 1);
      }
    }
    jdMethod_if(parama3, paramByte1, paramByte2, paramByte3, paramByte4, paramByte5, paramShort, paramBoolean);
  }
  
  public boolean p()
  {
    if (this.bz) {
      return false;
    }
    int i = 0;
    int j = 0;
    int k = 0;
    this.t = ce[this.b2];
    if (this.t == dg) {
      return false;
    }
    jdMethod_if((byte)16, co[this.b2]);
    jdMethod_if((byte)20, co[this.b2]);
    jdMethod_if((byte)28, b6[this.b2]);
    jdMethod_if((byte)30, cQ[this.b2]);
    jdMethod_if((byte)14, cL[this.b2]);
    jdMethod_if((byte)4, cA[this.b2]);
    jdMethod_if((byte)32, b4[this.b2]);
    jdMethod_if((byte)34, cO[this.b2]);
    this.ck = this.b2;
    this.af = a3.bE.cl[this.b2];
    jdMethod_if(this.af);
    this.O = cx[this.b2];
    this.bb = bW[this.b2];
    this.bV = c7[this.b2];
    this.dp = ((short)dl[this.b2]);
    this.dn = ((short)cN[this.b2]);
    this.cj = cu[this.b2];
    this.cz = new byte[3][2];
    this.cz[0] = bU[this.b2];
    this.ch = cs[this.b2];
    this.cz[1] = bS[this.b2];
    this.cg = cr[this.b2];
    this.cz[2] = bQ[this.b2];
    this.aK = ((short)c1[this.b2]);
    this.bA = ((short)ct[this.b2]);
    this.v = cq[this.b2];
    this.dq = c4[this.b2];
    this.c6 = cJ[this.b2];
    this.aI = ((byte)(this.bA - 8));
    this.a4 = 0;
    this.au = 1;
    this.jdField_try = 1;
    this.al = new int[5];
    this.af.a(jdMethod_int((byte)2), 0, this.al);
    this.aD = null;
    this.cT = a3.bE.cZ;
    for (int m = 0; m < (g.dD == 2 ? a.new : a.n); m = (byte)(m + 1))
    {
      j = h.jdMethod_if(a.Z, a3.bE.ad - h.u - a.Z);
      k = h.jdMethod_if(a.Z, a3.bE.dz - h.b8 - a.Z);
      if (((!jdMethod_if(j, k)) || (g.dD == 2)) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j, k)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK / 2, k)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK, k)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j, k + this.bA)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK / 2, k + this.bA)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK, k + this.bA)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK, k + this.bA / 2)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j, k + this.bA / 2)] > 0) && (a3.bE.fJ[a3.bE.cJ.jdMethod_for(j + this.aK / 2, k + this.bA / 2)] > 0))
      {
        i = 1;
        break;
      }
    }
    if (i == 0)
    {
      this.cv = ((short)(cd - 1));
      this.df = false;
      return false;
    }
    this.ci = false;
    this.aP = ((short)j);
    this.aM = ((short)k);
    this.ao = false;
    this.cv = 0;
    this.df = true;
    this.cf = false;
    this.c9 = 0;
    this.cm = false;
    this.cZ = 0;
    this.bg = 0;
    this.ag = 0;
    this.dc = 0;
    this.bY = false;
    this.ca = 0;
    this.cy = 0;
    return true;
  }
  
  private void a(byte paramByte1, byte paramByte2)
  {
    if (h.jdMethod_if(1, 3) == 3) {
      this.cy = 0;
    }
    byte b10 = 0;
    byte b11 = 0;
    byte b12 = 0;
    a(this.af, this.al);
    int i = 0;
    switch (paramByte1)
    {
    case 1: 
      b10 = 4;
      b11 = 3;
      b12 = 55;
      break;
    case 2: 
      b10 = 1;
      b11 = 0;
      b12 = 56;
      if ((this.cm) && (this.an != null))
      {
        if (this.an[0][2] >= 120)
        {
          i = 1;
          this.an[0][0] = ((short)(ag.hF - this.aP));
          this.an[0][2] = h.dU;
        }
        if (this.an[0][3] >= 120)
        {
          i = 1;
          this.an[0][1] = ((short)(ag.hE - this.aM));
          this.an[0][3] = h.fp;
        }
      }
      break;
    }
    if ((this.cm) && (this.an != null) && (this.cT.a(this))) {
      if ((h.a(this.cT.aP + this.cT.bj, this.cT.aM + this.cT.bi, this.cT.bh, this.cT.ac, this.aP + ((i == 0) && (paramByte2 == 3) ? -this.an[0][0] - this.an[0][2] + this.bh : this.an[0][0]), this.aM + this.an[0][1], this.an[0][2], this.an[0][3])) || (this.cT != a3.bE.cZ))
      {
        short s = 1;
        if (this.cT == a3.bE.cZ)
        {
          if (paramByte1 == 1)
          {
            s = (short)jdMethod_do(a3.bE.cZ);
            if (a3.bE.cZ.O() >= h.jdMethod_if(1, 100)) {
              s = 0;
            }
            a3.bE.cZ.eC = 0;
          }
          else
          {
            s = (short)jdMethod_if(a3.bE.cZ);
            try
            {
              if (h.jdMethod_if(1, 100) <= this.cz[this.cE][0]) {
                a3.bE.cZ.a(this.cz[this.cE][1], true);
              }
              a3.bE.cZ.eC = this.cE;
            }
            catch (Exception localException)
            {
              h.a(localException);
            }
          }
          if (a3.bE.aG.jdMethod_int(4017))
          {
            a3.bE.aG.jdMethod_new(this.t);
            a3.bE.aG.jdMethod_for(a3.jdMethod_new(a3.bE.cZ.a((byte)16), 4));
            a3.bE.aG.jdMethod_for(a3.jdMethod_new(s, 4));
            a3.bE.aG.jdMethod_if();
          }
        }
        else
        {
          s = this.dj;
          this.dj = 55537;
        }
        this.cT.a(this, paramByte1, (byte)-1, b10, b11, b12, s, false);
      }
    }
  }
  
  public static void s()
  {
    c3 = 0;
    if (bX != null) {
      synchronized (bX)
      {
        ds = null;
        bX = null;
        dd = null;
        cb = null;
        cU = null;
        dk = null;
      }
    }
  }
  
  public static boolean t()
  {
    return c3 > 0;
  }
  
  public static void k()
  {
    c3 = 0;
    ds = new short[c2];
    bX = new String[c2];
    dd = new byte[c2];
    cb = new short[c2];
    cU = new byte[c2];
    dk = new byte[c2];
  }
  
  public static void a(short paramShort1, String paramString, byte paramByte1, short paramShort2, byte paramByte2, byte paramByte3)
  {
    if (c3 >= c2) {
      c3 = 0;
    }
    synchronized (bX)
    {
      ds[c3] = paramShort1;
      bX[c3] = paramString;
      dd[c3] = paramByte1;
      cb[c3] = paramShort2;
      cU[c3] = paramByte2;
      dk[c3] = paramByte3;
      c3 = (byte)(c3 + 1);
    }
  }
  
  public static void n()
  {
    if (c3 <= 0) {
      return;
    }
    synchronized (bX)
    {
      ds[0] = ds[(c3 - 1)];
      bX[0] = bX[(c3 - 1)];
      dd[0] = dd[(c3 - 1)];
      cb[0] = cb[(c3 - 1)];
      cU[0] = cU[(c3 - 1)];
      dk[0] = dk[(c3 - 1)];
      c3 = (byte)(c3 - 1);
    }
  }
  
  public static void l()
  {
    cV = null;
    ce = null;
    cx = null;
    cL = null;
    cA = null;
    co = null;
    b6 = null;
    cQ = null;
    b4 = null;
    cO = null;
    cu = null;
    cs = null;
    cr = null;
    cJ = null;
    bW = null;
    dl = null;
    cN = null;
    c7 = null;
    c1 = null;
    ct = null;
    cq = null;
    c4 = null;
  }
  
  private void r()
  {
    if ((this.cT == a3.bE.cZ) && (a3.bE.aG.jdMethod_int(4016)))
    {
      a3.bE.aG.jdMethod_new(this.t);
      a3.bE.aG.jdMethod_for(a3.jdMethod_new(a3.bE.cZ.a((byte)16), 4));
      a3.bE.aG.jdMethod_if();
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ar.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */