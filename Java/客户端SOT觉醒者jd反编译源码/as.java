import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Display;

public class as
{
  public static final String aO = "event";
  public byte[][] aJ = (byte[][])null;
  public static final byte u = 1;
  public static final byte ab = 2;
  public static final byte P = 3;
  public static final byte aF = 4;
  public static final byte Q = 5;
  public static final byte au = 6;
  public static final byte ae = 7;
  public static final byte K = 9;
  public static final byte m = 12;
  public static final byte ao = 13;
  public static final byte ap = 14;
  public static final byte r = 15;
  public static final byte v = 16;
  public static final byte Z = 17;
  public static final byte j = 19;
  public static final byte T = 20;
  public static final byte o = 21;
  public static final byte aG = 22;
  public static final byte ag = 23;
  public static final byte O = 24;
  public static final byte U = 25;
  public static final byte ah = 26;
  public static final byte jdField_void = 27;
  public static final byte jdField_case = 28;
  public static final byte aP = 29;
  public static final byte aA = 30;
  public static final byte H = 31;
  public static final byte at = 32;
  public static final byte az = 33;
  public static final byte aN = 34;
  public static final byte am = 35;
  public static final byte E = 36;
  public static final byte q = 37;
  public static final byte jdField_null = 38;
  public static final byte N = 39;
  public static final byte jdField_goto = 40;
  public static final byte an = 41;
  public static final byte aE = 42;
  public static final byte R = 43;
  public static final byte b = 44;
  public static final byte aj = 45;
  public static final byte c = 46;
  public static final byte jdField_else = 47;
  public static final byte B = 48;
  public static final byte jdField_if = 49;
  public static final byte ay = 50;
  public static final byte al = 51;
  public static final byte jdField_try = 52;
  public static final byte aw = 53;
  public static final byte aa = 54;
  public static final byte L = 55;
  public static final byte e = 46;
  private h jdField_do;
  public ap n = null;
  public byte t;
  public int x = -1;
  public byte A;
  public byte D;
  public short aC;
  public String C = null;
  public String[] ai = null;
  public byte[] aI = null;
  public byte av;
  public byte h;
  public short I;
  public byte jdField_new;
  public byte s;
  public short g;
  public byte f;
  public byte Y;
  public short aL;
  public byte p;
  public byte ax;
  public byte aK;
  public byte M;
  public int aM;
  public l aD;
  public byte aH;
  public byte af;
  public byte ar;
  public byte G;
  public byte aQ;
  public byte jdField_long;
  public byte jdField_char;
  public byte jdField_byte;
  public byte jdField_int;
  public byte jdField_for;
  public byte aR;
  public short aB;
  public byte W;
  public byte ac;
  public byte S;
  public short y;
  public byte J;
  public byte z;
  public byte w;
  public byte i;
  public short d;
  public byte ak;
  public byte a;
  public boolean k = false;
  public boolean ad;
  public short X;
  public short V;
  public String F = null;
  String aq = null;
  short as = -1;
  short l = -1;
  
  public as(h paramh)
  {
    this.jdField_do = paramh;
  }
  
  public void jdMethod_if(int paramInt, ap paramap)
  {
    if (this.jdField_do.fJ == null) {
      return;
    }
    int i1 = (byte)(this.jdField_do.fJ[paramInt] >> 10 & 0x1F);
    if (i1 != 0)
    {
      if (this.jdField_do.cJ.kV) {
        return;
      }
      this.jdField_do.cJ.kV = true;
      a(i1, paramap);
      return;
    }
    this.k = false;
    this.jdField_do.cJ.kV = false;
  }
  
  public void a()
  {
    a(this.x, this.n);
  }
  
  public void a(int paramInt, ap paramap)
  {
    if ((this.jdField_do.cJ.ki) || (this.jdField_do.cJ.e7)) {
      return;
    }
    if (paramInt == 0)
    {
      paramap.jdField_do = 0;
      return;
    }
    this.n = paramap;
    byte[] arrayOfByte = a(paramInt);
    if (arrayOfByte == null)
    {
      paramap.jdField_do = 0;
      return;
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
    try
    {
      this.t = localDataInputStream.readByte();
      this.x = localDataInputStream.readByte();
      int i8;
      int i9;
      int i17;
      int i37;
      int i38;
      int i43;
      byte b1;
      byte b3;
      switch (this.t)
      {
      case 1: 
        if ((g.dD == 2) && (g.dZ == 0) && (g.jS != null)) {
          for (int i1 = 0; i1 < g.jS.length; i1 = (byte)(i1 + 1)) {
            if (!g.jS[i1].cf) {
              return;
            }
          }
        }
        if ((this.jdField_do.cZ.he) && (this.jdField_do.cZ.ii < 2000)) {
          return;
        }
        if (this.jdField_do.cZ.a8) {
          return;
        }
        this.k = false;
        this.jdField_do.cZ.d();
        this.jdField_do.cJ.e3 = 0;
        this.jdField_do.cJ.cJ = localDataInputStream.readShort();
        this.jdField_do.cJ.hv = localDataInputStream.readShort();
        this.jdField_do.cJ.ez = "";
        if (this.jdField_do.cJ.cJ <= 0)
        {
          this.jdField_do.cJ.jdMethod_new(false);
          return;
        }
        for (int i2 = 0; i2 < h.ga.length; i2 = (byte)(i2 + 1)) {
          if (this.jdField_do.cJ.cJ == h.al[i2]) {
            this.jdField_do.cJ.ez = h.ga[i2];
          }
        }
        this.jdField_do.cJ.jdField_do = 93;
        break;
      case 2: 
        if (this.jdField_do.cZ.fL < 0) {
          return;
        }
        this.jdField_do.cZ.d();
        if ((this.jdField_do.cJ.eC == -1) && (!this.jdField_do.J()))
        {
          this.jdField_do.cJ.jdField_do = 0;
          return;
        }
        if ((this.jdField_do.cJ.eC != -1) && (this.jdField_do.cJ.eC != this.jdField_do.cZ.fL))
        {
          this.jdField_do.cJ.a("非占领公会无权使用该装置.", (short)0, false, 9999);
          return;
        }
        this.jdField_do.cJ.gd = 0;
        this.jdField_do.cJ.bI = new String[] { "查看", "捐献" };
        this.jdField_do.ez = new al(this.jdField_do);
        this.jdField_do.cJ.jdField_do = -10;
        break;
      case 3: 
        this.jdField_do.cZ.d();
        int i3 = localDataInputStream.readByte();
        if (i3 == 0)
        {
          this.F = localDataInputStream.readUTF();
          g.gf = 0;
          this.jdField_do.cJ.gd = 0;
          this.jdField_do.cJ.cW = new String[] { "买", "卖", "取消" };
          paramap.jdField_do = 94;
        }
        else if (i3 == 1)
        {
          this.jdField_do.ac = new ab(this.jdField_do);
          this.jdField_do.ac.a();
          this.jdField_do.cJ.jdField_do = -28;
        }
        break;
      case 4: 
        this.jdField_do.cZ.d();
        int i4 = localDataInputStream.readByte();
        ao localao1;
        switch (i4)
        {
        case 0: 
          this.jdField_do.cJ.e3 = 0;
          paramap.jdField_do = 36;
          break;
        case 1: 
          if (h.e1 == 1)
          {
            this.jdField_do.cJ.a("该功能暂时关闭.", (short)0, false, 9999);
            return;
          }
          this.jdField_do.cJ.gd = 0;
          this.jdField_do.e0 = new av(this.jdField_do);
          this.jdField_do.cJ.jdField_do = 47;
          break;
        case 2: 
          this.jdField_do.cJ.gd = 0;
          this.jdField_do.cJ.bI = new String[] { "查对战表", "报名" };
          this.jdField_do.dy = new r(this.jdField_do);
          this.jdField_do.cJ.jdField_do = -21;
          break;
        case 3: 
          if ((this.jdField_do.J()) || (this.jdField_do.cJ.eC == -1))
          {
            this.jdField_do.cJ.jdField_do = 0;
            return;
          }
          if ((this.jdField_do.cJ.eC != -1) && (this.jdField_do.cJ.eC != this.jdField_do.cZ.fL))
          {
            this.jdField_do.cJ.a("非占领公会无权使用该装置.", (short)0, false, 9999);
            return;
          }
          if (this.jdField_do.cZ.fj != 17)
          {
            this.jdField_do.cJ.a("非公会长无权使用该装置.", (short)0, false, 9999);
            return;
          }
          this.jdField_do.cJ.gd = 0;
          this.jdField_do.cJ.bI = new String[] { "设置税率", "公会战时间" };
          this.jdField_do.ez = new al(this.jdField_do);
          this.jdField_do.cJ.jdField_do = -24;
          break;
        case 4: 
          if (h.R == null) {
            return;
          }
          this.jdField_do.cJ.iZ = new at(this.jdField_do);
          g.gf = 0;
          this.jdField_do.cJ.jdField_do = -46;
          break;
        case 5: 
          if (this.jdField_do.aG.jdMethod_int(8203))
          {
            this.jdField_do.aG.jdMethod_do(this.jdField_do.cZ.a((byte)14));
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
          break;
        case 6: 
          if (this.jdField_do.cZ.P() != -1)
          {
            this.jdField_do.cJ.a(36, (short)0, false, 9999);
          }
          else
          {
            g.gf = 0;
            this.jdField_do.ct = new am(this.jdField_do);
            this.jdField_do.cJ.jdField_do = -70;
          }
          break;
        case 7: 
          if (this.jdField_do.aG.jdMethod_int(6802))
          {
            this.jdField_do.aG.jdMethod_do(0);
            this.jdField_do.aG.jdMethod_if(this.jdField_do.cZ.O);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
          break;
        case 8: 
          if (this.jdField_do.bR.jdMethod_do((byte)7)) {
            for (int i5 = 0; i5 < this.jdField_do.bR.d.size(); i5 = (byte)(i5 + 1))
            {
              localao1 = (ao)this.jdField_do.bR.d.elementAt(i5);
              if ((ak.jdMethod_if(localao1.E) == 7) && (this.jdField_do.bR.jdMethod_try(localao1.E)))
              {
                if (localao1.P == 20)
                {
                  this.jdField_do.cJ.gd = 0;
                  if (this.jdField_do.bR.jdField_goto.length == 1)
                  {
                    this.jdField_do.cJ.e3 = 0;
                    this.jdField_do.cJ.jdField_do = -16;
                  }
                  else
                  {
                    this.jdField_do.cJ.c9 = this.jdField_do.bR.jdField_char;
                    this.jdField_do.cJ.jdField_do = -13;
                  }
                }
                else
                {
                  this.jdField_do.bR.a(localao1.E, false);
                }
                return;
              }
            }
          }
          this.jdField_do.q((byte)1);
          break;
        case 9: 
          if (h.cu == 1)
          {
            this.jdField_do.cJ.a("该功能暂时关闭.", (short)0, false, 9999);
            return;
          }
          if (this.jdField_do.bR.jdMethod_do((byte)8)) {
            for (int i6 = 0; i6 < this.jdField_do.bR.d.size(); i6 = (byte)(i6 + 1))
            {
              localao1 = (ao)this.jdField_do.bR.d.elementAt(i6);
              if ((ak.jdMethod_if(localao1.E) == 8) && (this.jdField_do.bR.jdMethod_try(localao1.E)))
              {
                if (localao1.P == 15)
                {
                  this.jdField_do.cJ.gd = 0;
                  if (this.jdField_do.bR.jdField_goto.length == 1)
                  {
                    this.jdField_do.cJ.e3 = 0;
                    this.jdField_do.cJ.jdField_do = -16;
                  }
                  else
                  {
                    this.jdField_do.cJ.c9 = this.jdField_do.bR.jdField_char;
                    this.jdField_do.cJ.jdField_do = -13;
                  }
                }
                else
                {
                  this.jdField_do.bR.a(localao1.E, false);
                }
                return;
              }
            }
          }
          this.jdField_do.cJ.dg = 1;
          this.jdField_do.cJ.em = 0;
          this.jdField_do.q((byte)3);
          break;
        case 10: 
          if (this.jdField_do.aG.jdMethod_int(6802))
          {
            this.jdField_do.aG.jdMethod_do(1);
            this.jdField_do.aG.jdMethod_if(this.jdField_do.cZ.O);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
          break;
        case 11: 
          if (this.jdField_do.cZ.fL < 0)
          {
            this.jdField_do.cJ.a("你没有加入公会.", (short)0, false, 9999);
            return;
          }
          if (this.jdField_do.bR.jdMethod_do((byte)9)) {
            for (int i7 = 0; i7 < this.jdField_do.bR.d.size(); i7 = (byte)(i7 + 1))
            {
              localao1 = (ao)this.jdField_do.bR.d.elementAt(i7);
              if ((ak.jdMethod_if(localao1.E) == 9) && (this.jdField_do.bR.jdMethod_try(localao1.E)))
              {
                if (localao1.P == 24)
                {
                  this.jdField_do.cJ.gd = 0;
                  if (this.jdField_do.bR.jdField_goto.length == 1)
                  {
                    this.jdField_do.cJ.e3 = 0;
                    this.jdField_do.cJ.jdField_do = -16;
                  }
                  else
                  {
                    this.jdField_do.cJ.c9 = this.jdField_do.bR.jdField_char;
                    this.jdField_do.cJ.jdField_do = -13;
                  }
                }
                else
                {
                  this.jdField_do.bR.a(localao1.E, false);
                }
                return;
              }
            }
          }
          this.jdField_do.cJ.dg = 1;
          this.jdField_do.cJ.em = 0;
          this.jdField_do.q((byte)2);
          break;
        case 12: 
        case 13: 
          this.jdField_do.cJ.hP = (i4 == 12 ? 0 : 1);
          if (this.jdField_do.aG.jdMethod_int(6720))
          {
            this.jdField_do.aG.jdMethod_do(0);
            this.jdField_do.aG.jdMethod_new(this.jdField_do.cJ.hP);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
          break;
        case 14: 
          this.jdField_do.cJ.kH = 0;
          if (this.jdField_do.aG.jdMethod_int(1005))
          {
            this.jdField_do.aG.jdMethod_do(4);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
          break;
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
          if (this.jdField_do.cZ.fL < 0) {
            return;
          }
          if (this.jdField_do.aG.jdMethod_int(3737))
          {
            this.jdField_do.aG.jdMethod_do(i4 - 15);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
        }
        break;
      case 5: 
        this.jdField_do.cZ.d();
        g.gf = 0;
        this.jdField_do.cJ.h7 = localDataInputStream.readUTF();
        if (this.jdField_do.cJ.h7.startsWith("*"))
        {
          if (this.aq == null)
          {
            String str1 = String.valueOf(System.currentTimeMillis());
            this.aq = ("No." + str1.substring(str1.length() - 5, str1.length()));
          }
          this.jdField_do.cJ.h7 = (this.aq + this.jdField_do.cJ.h7.substring(1));
        }
        this.jdField_do.cJ.jdField_do = 43;
        break;
      case 6: 
        this.jdField_do.cZ.d();
        short s1 = localDataInputStream.readShort();
        this.jdField_long = localDataInputStream.readByte();
        this.jdField_char = localDataInputStream.readByte();
        this.jdField_byte = localDataInputStream.readByte();
        this.jdField_int = localDataInputStream.readByte();
        this.jdField_for = localDataInputStream.readByte();
        this.aR = localDataInputStream.readByte();
        this.jdField_do.bR.jdMethod_new(s1);
        break;
      case 7: 
        this.jdField_do.cZ.d();
        this.A = localDataInputStream.readByte();
        this.D = localDataInputStream.readByte();
        this.aC = localDataInputStream.readShort();
        this.jdField_do.cZ.eO = this.A;
        this.jdField_do.cJ.jdField_do = 57;
        break;
      case 13: 
        this.jdField_do.cZ.d();
        this.ai = new String[2];
        this.aI = new byte[2];
        this.C = localDataInputStream.readUTF();
        for (i8 = 0; i8 < 2; i8++)
        {
          this.ai[i8] = localDataInputStream.readUTF();
          this.aI[i8] = localDataInputStream.readByte();
        }
        g.gf = 0;
        this.av = 0;
        this.jdField_do.cJ.jdField_do = 58;
        break;
      case 12: 
        this.jdField_do.cZ.d();
        this.aH = localDataInputStream.readByte();
        this.af = localDataInputStream.readByte();
        this.aQ = localDataInputStream.readByte();
        this.aD = this.jdField_do.cJ.mN[(this.aH - 1)];
        this.ar = this.aD.jdField_do;
        this.aD.jdField_do = this.af;
        this.jdField_do.bV.a(this.aD.jdField_do, 0, this.aD.a);
        if (this.aQ > 0)
        {
          this.G = 0;
          this.jdField_do.cJ.jdField_do = 61;
        }
        else
        {
          a();
        }
        break;
      case 9: 
        this.jdField_do.cZ.d();
        this.aH = localDataInputStream.readByte();
        this.af = localDataInputStream.readByte();
        this.aB = localDataInputStream.readShort();
        this.W = localDataInputStream.readByte();
        this.ac = localDataInputStream.readByte();
        this.aD = this.jdField_do.cJ.mN[(this.aH - 1)];
        this.ar = this.aD.jdField_do;
        this.aD.jdField_do = this.af;
        this.jdField_do.bV.a(this.aD.jdField_do, 0, this.aD.a);
        this.jdField_do.cJ.jdField_do = 62;
        break;
      case 14: 
        this.y = localDataInputStream.readShort();
        this.jdField_do.bR.jdMethod_do(this.y);
        this.jdField_do.cJ.jdField_int = 0;
        this.jdField_do.cJ.jdField_do = 76;
        break;
      case 15: 
        this.y = localDataInputStream.readShort();
        this.J = localDataInputStream.readByte();
        this.z = localDataInputStream.readByte();
        if (this.jdField_do.bR.jdMethod_case(this.y)) {
          a(this.J, paramap);
        } else {
          a(this.z, paramap);
        }
        break;
      case 16: 
        this.y = localDataInputStream.readShort();
        this.w = localDataInputStream.readByte();
        this.z = localDataInputStream.readByte();
        if (this.jdField_do.bR.a(this.y)) {
          a(this.w, paramap);
        } else {
          a(this.z, paramap);
        }
        break;
      case 17: 
        this.aH = localDataInputStream.readByte();
        this.i = localDataInputStream.readByte();
        this.aD = this.jdField_do.cJ.mN[(this.aH - 1)];
        this.aD.jdField_int = (this.i == 0);
        a();
        break;
      case 19: 
        this.jdField_do.cZ.d();
        this.aH = localDataInputStream.readByte();
        this.af = localDataInputStream.readByte();
        this.W = localDataInputStream.readByte();
        this.aB = localDataInputStream.readShort();
        this.ac = localDataInputStream.readByte();
        this.S = localDataInputStream.readByte();
        this.aD = this.jdField_do.cJ.mN[(this.aH - 1)];
        this.ar = this.aD.jdField_do;
        this.aD.jdField_do = this.af;
        this.jdField_do.bV.a(this.aD.jdField_do, 0, this.aD.a);
        this.jdField_do.cJ.jdField_do = 79;
        break;
      case 20: 
        this.y = localDataInputStream.readShort();
        i8 = localDataInputStream.readByte();
        if (i8 == 1)
        {
          this.jdField_do.bR.jdMethod_for(this.y);
          if (this.jdField_do.aG.jdMethod_int(5842))
          {
            this.jdField_do.aG.jdMethod_new(this.y);
            this.jdField_do.aG.jdMethod_for(-1);
            this.jdField_do.aG.jdMethod_if();
          }
        }
        else if (i8 == 2)
        {
          for (i9 = 0; i9 < this.jdField_do.bR.jdField_else.length; i9++) {
            if (this.y == this.jdField_do.bR.jdField_else[i9])
            {
              this.jdField_do.bR.jdField_else[i9] = this.jdField_do.bR.jdField_else[(this.jdField_do.bR.jdField_else.length - 1)];
              short[] arrayOfShort = new short[this.jdField_do.bR.jdField_else.length - 1];
              System.arraycopy(this.jdField_do.bR.jdField_else, 0, arrayOfShort, 0, arrayOfShort.length);
              this.jdField_do.bR.jdField_else = arrayOfShort;
              arrayOfShort = null;
              break;
            }
          }
        }
        if (this.jdField_do.bR.a(this.y)) {
          this.jdField_do.bR.d.removeElement(this.jdField_do.bR.jdMethod_int(this.y));
        }
        a();
        break;
      case 21: 
        i9 = localDataInputStream.readShort();
        short s2 = localDataInputStream.readShort();
        int i10 = localDataInputStream.readByte();
        int i11 = localDataInputStream.readByte();
        int i12 = localDataInputStream.readByte();
        int i13 = localDataInputStream.readByte();
        int i14 = 0;
        boolean bool1 = this.jdField_do.bR.jdMethod_case(i9);
        boolean bool2 = this.jdField_do.bR.jdMethod_case(s2);
        if ((!bool1) && (!bool2)) {
          i14 = i10;
        } else if ((!bool1) && (bool2)) {
          i14 = i11;
        } else if ((bool1) && (!bool2)) {
          i14 = i12;
        } else if ((bool1) && (bool2)) {
          i14 = i13;
        }
        a(i14, paramap);
        break;
      case 22: 
        this.d = localDataInputStream.readShort();
        this.ak = localDataInputStream.readByte();
        this.a = localDataInputStream.readByte();
        String str2 = null;
        if (!this.jdField_do.cZ.a((byte)0, this.d, 1))
        {
          str2 = "获得 " + this.jdField_do.a(new short[] { this.d })[0] + "　1个(您的背包已满,该物品已舍弃)。";
          this.jdField_do.cJ.jdMethod_do(str2);
          a(this.a, paramap);
        }
        else
        {
          str2 = "获得 " + this.jdField_do.a(new short[] { this.d })[0] + "　1个。";
          this.jdField_do.cZ.jdMethod_if((byte)0, this.d, 1);
          this.jdField_do.cJ.jdMethod_do(str2);
          a(this.ak, paramap);
        }
        break;
      case 23: 
        int i15 = localDataInputStream.readShort();
        int i16 = localDataInputStream.readByte();
        if (this.jdField_do.cZ.a((byte)0) >= i15)
        {
          this.jdField_do.cZ.a(i15, true);
          if (this.jdField_do.aG.jdMethod_int(4415))
          {
            this.jdField_do.aG.jdMethod_do(0);
            this.jdField_do.aG.jdMethod_if();
          }
          if (this.jdField_do.cJ.bZ == null)
          {
            this.jdField_do.cJ.bZ = new int[h.dU];
            for (i17 = 0; i17 < h.dU; i17++) {
              this.jdField_do.cJ.bZ[i17] = 285212672;
            }
          }
          this.jdField_do.cJ.c3 = 0;
          this.jdField_do.cJ.jdField_do = 37;
        }
        else
        {
          a(i16, paramap);
        }
        break;
      case 24: 
        i17 = (short)localDataInputStream.readByte();
        int i18 = localDataInputStream.readByte();
        int i19 = localDataInputStream.readByte();
        int i20 = localDataInputStream.readByte();
        if (i17 > this.jdField_do.cZ.a((byte)14)) {
          a(i18, paramap);
        } else if (i17 == this.jdField_do.cZ.a((byte)14)) {
          a(i19, paramap);
        } else {
          a(i20, paramap);
        }
        break;
      case 25: 
        this.d = localDataInputStream.readShort();
        int i21 = localDataInputStream.readByte();
        int i22 = localDataInputStream.readByte();
        int i23 = localDataInputStream.readByte();
        if (this.jdField_do.cZ.a((byte)0, this.d) == -1)
        {
          a(i23, paramap);
        }
        else if (this.jdField_do.cZ.jdMethod_if(this.d) >= i21)
        {
          this.jdField_do.cZ.a((byte)0, this.d, i21, true);
          a(i22, paramap);
        }
        else
        {
          a(i23, paramap);
        }
        break;
      case 26: 
        this.y = localDataInputStream.readShort();
        this.jdField_do.S.jdField_for = localDataInputStream.readByte();
        this.jdField_do.bR.a(this.y, false);
        this.jdField_do.cJ.jdField_int = 0;
        this.jdField_do.cJ.jdField_do = 77;
        break;
      case 27: 
        this.y = localDataInputStream.readShort();
        int i24 = localDataInputStream.readByte();
        int i25 = localDataInputStream.readByte();
        ao localao2 = this.jdField_do.bR.jdMethod_int(this.y);
        if (localao2 == null) {
          a(i25, paramap);
        }
        if ((this.jdField_do.bR.jdMethod_try(localao2.E)) && (this.jdField_do.bR.jdMethod_for(localao2))) {
          a(i24, paramap);
        } else {
          a(i25, paramap);
        }
        break;
      case 28: 
        int i26 = localDataInputStream.readByte();
        int i27 = localDataInputStream.readByte();
        if (this.jdField_do.cZ.b((byte)0)) {
          a(i26, paramap);
        } else {
          a(i27, paramap);
        }
        break;
      case 29: 
        int i28 = localDataInputStream.readByte();
        int i29 = localDataInputStream.readByte();
        int i30 = localDataInputStream.readByte();
        if (this.jdField_do.cZ.gJ[0] + i28 >= ag.eK) {
          a(i30, paramap);
        } else {
          a(i29, paramap);
        }
        break;
      case 30: 
        short s3 = localDataInputStream.readShort();
        int i31 = localDataInputStream.readByte();
        int i32 = localDataInputStream.readByte();
        int i33 = localDataInputStream.readByte();
        if (this.jdField_do.cZ.a((byte)0, s3) == -1) {
          a(i33, paramap);
        }
        if (this.jdField_do.cZ.jdMethod_if(s3) >= i31) {
          a(i32, paramap);
        } else {
          a(i33, paramap);
        }
        break;
      case 31: 
        short s4 = localDataInputStream.readShort();
        int i34 = localDataInputStream.readByte();
        int i35 = localDataInputStream.readByte();
        if (!this.jdField_do.cZ.jdMethod_int(s4)) {
          a(i35, paramap);
        } else {
          a(i34, paramap);
        }
        break;
      case 32: 
        int i36 = localDataInputStream.readShort() * 1000;
        i37 = localDataInputStream.readByte();
        i38 = localDataInputStream.readByte();
        if (this.jdField_do.cZ.a((byte)0) >= i36) {
          a(i37, paramap);
        } else {
          a(i38, paramap);
        }
        break;
      case 33: 
        int i39 = localDataInputStream.readShort() * 1000;
        this.jdField_do.cZ.jdMethod_do(i39, true);
        a();
        break;
      case 34: 
        int i40 = localDataInputStream.readShort() * 1000;
        this.jdField_do.cZ.a(i40, true);
        a();
        break;
      case 35: 
        int i41 = localDataInputStream.readByte();
        i37 = localDataInputStream.readByte();
        i38 = localDataInputStream.readByte();
        if (this.jdField_do.bR.jdMethod_if()) {
          a(i37, paramap);
        } else {
          a(i38, paramap);
        }
        break;
      case 55: 
        int i42 = localDataInputStream.readByte();
        i37 = localDataInputStream.readByte();
        i38 = localDataInputStream.readByte();
        if (this.jdField_do.cZ.bo == i42) {
          a(i37, paramap);
        } else {
          a(i38, paramap);
        }
        break;
      case 36: 
        short s5 = localDataInputStream.readShort();
        i43 = localDataInputStream.readByte();
        b1 = localDataInputStream.readByte();
        if (this.jdField_do.bR.jdMethod_try(s5)) {
          a(i43, paramap);
        } else {
          a(b1, paramap);
        }
        break;
      case 37: 
        int i44 = localDataInputStream.readByte();
        i43 = localDataInputStream.readByte();
        b1 = localDataInputStream.readByte();
        byte b2 = localDataInputStream.readByte();
        switch (i43)
        {
        case 0: 
          if ((this.jdField_do.cJ.m5) && (this.jdField_do.cJ.mx == this.jdField_do.cJ.jdField_if)) {
            a(b1, paramap);
          } else {
            a(b2, paramap);
          }
          break;
        case 1: 
          if (this.jdField_do.cZ.he) {
            a(b1, paramap);
          } else {
            a(b2, paramap);
          }
          break;
        case 2: 
          if (this.jdField_do.cZ.fL >= 0) {
            a(b1, paramap);
          } else {
            a(b2, paramap);
          }
          break;
        case 3: 
          if (this.jdField_do.cZ.fL >= 0)
          {
            this.jdField_new = b1;
            this.s = b2;
            this.jdField_do.cJ.jdField_do = 21;
            if (this.jdField_do.aG.jdMethod_int(3722))
            {
              this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
              this.jdField_do.aG.jdMethod_if();
            }
          }
          break;
        }
        break;
      case 38: 
        i43 = localDataInputStream.readByte();
        if (i43 == 0)
        {
          if ((h.cz) || (h.bL.equals("" + a.X + "")))
          {
            if (this.jdField_do.aG.jdMethod_int(1002))
            {
              this.jdField_do.aG.jdMethod_if("");
              this.jdField_do.aG.jdMethod_if("");
              this.jdField_do.aG.jdMethod_if("");
              this.jdField_do.aG.jdMethod_do(0);
              this.jdField_do.aG.jdMethod_do(0);
              this.jdField_do.aG.a(Long.parseLong("13000000000"));
              this.jdField_do.aG.jdMethod_if("getInitName");
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_do.cJ.jdField_do = 21;
            Display.getDisplay(this.jdField_do.fG).setCurrent(this.jdField_do);
          }
          else
          {
            ad.do = "";
            ad.for = "";
            this.jdField_do.i.jdMethod_int();
          }
        }
        else if (i43 == 1) {
          if (this.jdField_do.cZ.fL >= 0)
          {
            if (this.jdField_do.aG.jdMethod_int(3701))
            {
              this.jdField_do.aG.jdMethod_if(this.jdField_do.cZ.es);
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_do.cJ.jdField_do = 21;
          }
          else
          {
            this.jdField_do.i.jdMethod_else();
          }
        }
        break;
      case 39: 
        short s6 = localDataInputStream.readShort();
        this.jdField_do.cZ.jdMethod_do(s6);
        a();
        break;
      case 40: 
        b3 = localDataInputStream.readByte();
        this.jdField_do.cZ.c(b3);
        a();
        break;
      case 41: 
        b3 = localDataInputStream.readByte();
        this.jdField_do.cZ.jdMethod_try(b3);
        a();
        break;
      case 42: 
        b3 = localDataInputStream.readByte();
        int i45 = localDataInputStream.readByte();
        int i46 = localDataInputStream.readByte();
        if ((this.jdField_do.cZ.fL >= 0) && (this.jdField_do.cZ.fj == 17)) {
          a(i45, paramap);
        } else {
          a(i46, paramap);
        }
        break;
      case 43: 
        this.jdField_do.cZ.d();
        if (this.jdField_do.bR.jdField_for != null)
        {
          this.jdField_do.ck = new ai(this.jdField_do);
          this.jdField_do.ck.jdField_new = 0;
          this.jdField_do.ck.jdField_try = this.jdField_do.bR.jdField_for;
          this.jdField_do.ck.jdMethod_for();
          this.jdField_do.cJ.jdField_do = 11;
        }
        else
        {
          this.jdField_do.q((byte)0);
        }
        break;
      case 44: 
        int i47 = localDataInputStream.readByte();
        int i48 = localDataInputStream.readByte();
        if (this.jdField_do.cZ.gE) {
          a(i47, paramap);
        } else {
          a(i48, paramap);
        }
        break;
      case 45: 
        if (this.jdField_do.aG.jdMethod_int(3507))
        {
          this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.gz);
          this.jdField_do.aG.jdMethod_if(this.jdField_do.cZ.O);
          this.jdField_do.aG.jdMethod_if();
        }
        this.jdField_do.dV = null;
        this.jdField_do.jdField_else = 0;
        this.jdField_do.cZ.gE = false;
        this.jdField_do.cZ.dU = false;
        this.jdField_do.cJ.g6 = null;
        this.jdField_do.cJ.cl = null;
        this.jdField_do.cJ.no = null;
        a();
        break;
      case 46: 
        int i49 = localDataInputStream.readByte();
        if (i49 == 1)
        {
          this.ad = true;
          this.jdField_do.S.X = ag.hF;
          this.jdField_do.S.V = ag.hE;
        }
        else
        {
          this.ad = false;
          ag.hF = this.jdField_do.S.X;
          ag.hE = this.jdField_do.S.V;
        }
        a();
        break;
      case 49: 
        int i50 = localDataInputStream.readByte();
        int i51 = localDataInputStream.readShort();
        this.jdField_do.cJ.h7 = null;
        switch (i50)
        {
        case 0: 
          break;
        }
        g.gf = 0;
        this.jdField_do.cJ.jdField_do = 43;
        break;
      case 52: 
        this.k = false;
        this.jdField_do.cZ.d();
        localDataInputStream.readByte();
        this.jdField_do.cJ.cJ = localDataInputStream.readShort();
        this.jdField_do.cJ.hv = localDataInputStream.readShort();
        if (this.jdField_do.cJ.cJ <= 0)
        {
          this.jdField_do.cJ.cJ = this.as;
          this.jdField_do.cJ.hv = this.l;
        }
        this.jdField_do.M = this.jdField_do.cJ.jdField_if;
        this.jdField_do.bH = this.jdField_do.fi;
        this.jdField_do.aF = this.jdField_do.cR;
        this.jdField_do.cJ.j();
        break;
      case 53: 
        break;
      case 54: 
        this.jdField_do.cZ.hr = false;
        a();
      }
      return;
    }
    catch (IOException localIOException8) {}finally
    {
      try
      {
        if (localDataInputStream != null) {
          localDataInputStream.close();
        }
        if (localByteArrayInputStream != null) {
          localByteArrayInputStream.close();
        }
      }
      catch (IOException localIOException22) {}
    }
  }
  
  public byte[] a(int paramInt)
  {
    byte[] arrayOfByte = null;
    arrayOfByte = this.aJ[(paramInt - 1)];
    return arrayOfByte;
  }
  
  public void a(ag paramag, boolean paramBoolean)
  {
    if ((paramag == null) || (paramBoolean)) {
      return;
    }
    try
    {
      if ((paramag == this.jdField_do.cZ) && (this.jdField_do.cJ.jdField_if > a.t))
      {
        if (this.jdField_do.cJ.K()) {
          return;
        }
        if (this.jdField_do.cJ.M()) {
          return;
        }
        if (paramag.fm == ag.hI) {
          paramag.hh = a3.jdMethod_new(a.ac, a.t);
        } else if (!paramag.ax()) {
          try
          {
            int i1 = a3.jdMethod_do(paramag.fW, a.C) < a.void ? a.void : a3.jdMethod_do(paramag.fW, a.C);
            paramag.hh = a3.jdMethod_new(a3.jdMethod_do(paramag.hh, a.t) - i1, a.t);
          }
          catch (Exception localException1)
          {
            paramag.hh = a3.jdMethod_new(a.ac, a.t);
            paramag.fW = a3.jdMethod_new(a.ae, a.ae);
          }
          finally
          {
            if (a3.jdMethod_do(paramag.hh, a.t) < (short)a.ac) {
              paramag.hh = a3.jdMethod_new(a.ac, a.t);
            }
          }
        }
        if ((paramag.fm == ag.dt) || (paramag.fm == ag.hX) || (paramag.fm == ag.ig) || (paramag.fm == ag.eV) || (paramag.fm == ag.dV) || (paramag.fm == ag.ey) || (paramag.fm == ag.d8) || (ag.l(paramag.fm)))
        {
          short s1 = 0;
          if ((paramag.a((byte)24) < paramag.a((byte)26) / 2) && (-1 != (s1 = this.jdField_do.jdMethod_if((byte)111))))
          {
            this.jdField_do.cJ.a(s1, true);
            this.jdField_do.jdMethod_if(s1, true);
            this.jdField_do.cJ.a(s1, false);
            this.jdField_do.c((byte)2);
          }
        }
      }
      if (paramag.fm == ag.d8)
      {
        paramag.dZ = true;
        paramag.a4 = 15;
        paramag.jdMethod_if(paramag);
        return;
      }
      if (paramag.fm == ag.dt)
      {
        this.jdField_do.c((byte)4);
        paramag.eT = true;
        paramag.et = ((byte)a.long);
        paramag.d3 = paramag.gc;
        paramag.jdMethod_if(paramag);
        return;
      }
      if (paramag.fm == ag.dV)
      {
        paramag.a4 = 16;
        paramag.jdMethod_if(paramag);
        return;
      }
      if (paramag.fm == ag.ig)
      {
        this.jdField_do.c((byte)4);
        paramag.hv = true;
        paramag.et = ((byte)a.long);
        paramag.d3 = paramag.gc;
        paramag.jdMethod_if(paramag);
        return;
      }
      if (paramag.fm == ag.hX)
      {
        this.jdField_do.c((byte)4);
        paramag.fE = true;
        paramag.et = ((byte)a.long);
        paramag.d3 = paramag.gc;
        paramag.jdMethod_if(paramag);
        return;
      }
      if (paramag.fm == ag.eV)
      {
        paramag.gM = ((short)h.jdMethod_if(ag.g2 / a.t, ag.g2 - a.o));
        paramag.a4 = 13;
        paramag.jdMethod_if(paramag);
        return;
      }
      if (paramag.fm == ag.ey)
      {
        paramag.hV = false;
        paramag.fU = ((short)(h.dU / a.t));
        paramag.fT = ((short)(h.fp / a.t));
        paramag.a4 = 14;
        paramag.jdMethod_if(paramag);
        return;
      }
      if (paramag.eZ == a.char)
      {
        paramag.dZ = true;
        paramag.gZ = ((short)paramag.fm);
        paramag.g8 = ((short)a.ac);
        paramag.a4 = 9;
        return;
      }
      paramag.a(paramag);
    }
    catch (Exception localException2)
    {
      localException2 = localException2;
      return;
    }
    finally {}
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\as.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */