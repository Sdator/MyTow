import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class a8
{
  h jdField_do = null;
  g jdField_char = null;
  byte jdField_else;
  public static final short jdField_try = 2503;
  public static final short jdField_int = 2504;
  public static final short a = 2505;
  public static final short jdField_case = 2506;
  public static final short jdField_null = 2507;
  public static final short jdField_for = 2508;
  public static final short jdField_long = 3301;
  public static final short jdField_void = 3302;
  public static final short c = 3303;
  public static final short b = 3304;
  public static final short jdField_byte = 6561;
  public static final short d = 6562;
  public static final short jdField_goto = 6563;
  public static final short jdField_new = 6564;
  public static final short jdField_if = 6565;
  
  public a8(h paramh)
  {
    this.jdField_do = paramh;
    this.jdField_char = paramh.cJ;
  }
  
  public void a(ag paramag, byte paramByte)
  {
    if ((this.jdField_do.cZ == paramag) && (this.jdField_do.cJ.jdField_if > 2)) {
      paramag.dK = paramag.a((byte)24);
    }
    paramag.ag();
    paramag.fm = paramByte;
    byte[] arrayOfByte = new byte[a.char];
    arrayOfByte[a.ac] = paramByte;
    paramag.gc = this.jdField_do.a(arrayOfByte)[a.ac];
    paramag.fB = h.jdMethod_int(paramByte);
    paramag.eZ = h.u(paramByte);
    paramag.gG = h.jdMethod_else(paramByte);
    paramag.ed = h.o(paramByte);
    paramag.h0 = h.jdMethod_long(paramByte);
    paramag.hH = h.jdMethod_char(paramByte);
    paramag.gd = h.jdMethod_for(paramByte);
    paramag.fH = h.h(paramByte);
    paramag.gN = h.jdMethod_goto(paramByte);
    paramag.fM = h.k(paramByte);
    paramag.hW = h.i(paramByte);
    paramag.dJ = h.jdMethod_case(paramByte);
    paramag.fe = h.jdMethod_byte(paramByte);
    paramag.hK = h.v(paramByte);
    paramag.dD = h.n(paramByte);
    paramag.fW = a3.jdMethod_new(h.jdMethod_null(paramByte), a.C);
    paramag.hi = h.m(paramByte);
    paramag.b = h.b(paramByte);
  }
  
  public boolean a(int paramInt)
  {
    boolean bool = true;
    int i;
    int m;
    int j;
    short s2;
    int k;
    switch (this.jdField_char.jdField_do)
    {
    case 7: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0) {
          try
          {
            if (this.jdField_do.fG.platformRequest(this.jdField_char.fL))
            {
              this.jdField_char.J();
            }
            else
            {
              this.jdField_char.jdField_do = 0;
              this.jdField_char.jdMethod_if(6);
            }
          }
          catch (Exception localException)
          {
            h.a(localException);
          }
        } else {
          this.jdField_char.jdField_do = 0;
        }
        this.jdField_char.fA = null;
        this.jdField_char.fL = null;
      }
      break;
    case -101: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0)
        {
          if (this.jdField_char.iN) {
            this.jdField_char.m();
          } else {
            this.jdField_char.B();
          }
        }
        else {
          this.jdField_char.jdField_do = 11;
        }
        break;
      }
      break;
    case -100: 
    case -99: 
    case -98: 
    case -97: 
    case -96: 
    case -95: 
      this.jdField_char.ea.jdMethod_if(paramInt);
      break;
    case -92: 
      this.jdField_do.bS.a(paramInt);
      break;
    case -93: 
    case -90: 
    case -88: 
    case -87: 
      this.jdField_do.fm.a(paramInt);
      break;
    case -94: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0)
        {
          if (this.jdField_char.eR == 0)
          {
            if (this.jdField_do.aG.jdMethod_int(3507))
            {
              this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.gz);
              this.jdField_do.aG.jdMethod_if(this.jdField_char.b5);
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.ip.removeElement(this.jdField_char.b5);
            this.jdField_do.i.jdMethod_for();
            this.jdField_char.jdField_do = 26;
          }
          else if (this.jdField_char.eR == 1)
          {
            if (this.jdField_do.aG.jdMethod_int(3716))
            {
              this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
              this.jdField_do.aG.jdMethod_if(this.jdField_char.b5);
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.ip.removeElementAt(this.jdField_char.hZ);
            this.jdField_char.bS.removeElementAt(this.jdField_char.hZ);
            this.jdField_char.dY.removeElementAt(this.jdField_char.hZ);
            this.jdField_char.k1.removeElementAt(this.jdField_char.hZ);
            this.jdField_do.i.jdMethod_for();
            this.jdField_char.jdField_do = 26;
          }
          else if (this.jdField_char.eR == 2)
          {
            if (this.jdField_do.aG.jdMethod_int(3731))
            {
              this.jdField_do.aG.jdMethod_for(this.jdField_char.es);
              this.jdField_do.aG.jdMethod_do(1);
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.jdField_do = 21;
          }
          this.jdField_char.bu = null;
        }
        else
        {
          this.jdField_char.bu = null;
          this.jdField_char.jdField_do = 26;
        }
        break;
      }
      break;
    case -86: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0)
        {
          if (this.jdField_do.aG.jdMethod_int(3729))
          {
            this.jdField_do.aG.jdMethod_if(this.jdField_char.b5);
            this.jdField_do.aG.jdMethod_do(this.jdField_char.mQ[this.jdField_char.gd]);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
        }
        else
        {
          this.jdField_char.jdField_do = -85;
        }
        this.jdField_char.bu = null;
      }
      break;
    case -85: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.jdField_do.jdMethod_do(paramInt, this.jdField_char.c9.length);
        if (i < 0) {
          return true;
        }
        if (i > 0) {
          this.jdField_char.gd = ((byte)i);
        }
        m = ((Byte)this.jdField_char.k1.elementAt(this.jdField_char.hZ)).byteValue();
        Integer localInteger = (Integer)this.jdField_char.dY.elementAt(this.jdField_char.hZ);
        int n = localInteger.byteValue();
        if ((m >= 0) && (m == this.jdField_char.mQ[this.jdField_char.gd])) {
          return true;
        }
        if ((this.jdField_char.mQ[this.jdField_char.gd] >= 0) && (n < ag.jdMethod_case(this.jdField_char.mQ[this.jdField_char.gd]))) {
          return true;
        }
        this.jdField_char.e3 = 0;
        if (this.jdField_char.mQ[this.jdField_char.gd] < 0) {
          this.jdField_char.bu = ("确定把" + this.jdField_char.b5 + "的职位撤销?");
        } else {
          this.jdField_char.bu = ("确定把" + this.jdField_char.b5 + "任命为" + ag.jdMethod_try(this.jdField_char.mQ[this.jdField_char.gd], 0) + "?");
        }
        this.jdField_char.jdField_do = -86;
        break;
      case 7: 
        this.jdField_char.c9 = null;
        this.jdField_char.mQ = null;
        this.jdField_char.jdField_do = 26;
        break;
      case 1: 
        g tmp2306_2303 = this.jdField_char;
        tmp2306_2303.gd = ((byte)(tmp2306_2303.gd - 1));
        if (this.jdField_char.gd < 0) {
          this.jdField_char.gd = ((byte)(this.jdField_char.c9.length - 1));
        }
        break;
      case 2: 
        g tmp2351_2348 = this.jdField_char;
        tmp2351_2348.gd = ((byte)(tmp2351_2348.gd + 1));
        if (this.jdField_char.gd > this.jdField_char.c9.length - 1) {
          this.jdField_char.gd = 0;
        }
        break;
      }
      break;
    case -75: 
    case -74: 
      this.jdField_char.mM.a(paramInt);
      break;
    case -51: 
      this.jdField_do.bf.a(paramInt);
      break;
    case -48: 
    case -47: 
      this.jdField_char.iZ.a(paramInt);
      break;
    case -38: 
    case -36: 
      this.jdField_do.bv.a(paramInt);
      break;
    case -84: 
    case -73: 
      this.jdField_do.bx.a(paramInt);
      break;
    case -43: 
    case -42: 
    case -41: 
    case -40: 
    case -39: 
      this.jdField_do.i.jdMethod_if(paramInt);
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
      this.jdField_do.i.jdMethod_try(paramInt);
      break;
    case 53: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          i = this.jdField_do.jdMethod_if((byte)112);
          if (i != -1)
          {
            this.jdField_char.jdField_do = 21;
            if (this.jdField_do.aG.jdMethod_int(6709))
            {
              this.jdField_do.aG.jdMethod_new(i);
              this.jdField_do.aG.jdMethod_do(this.jdField_do.e3[this.jdField_char.hZ]);
              this.jdField_do.aG.jdMethod_if();
            }
          }
          break;
        case 1: 
          this.jdField_char.jdField_do = 26;
        }
        break;
      }
      break;
    case 40: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          i = this.jdField_do.jdMethod_if((byte)101);
          if (-1 != i)
          {
            this.jdField_do.cJ.a(i, true);
            this.jdField_do.jdMethod_if(i, true);
            this.jdField_do.cJ.a(i, false);
          }
          else
          {
            this.jdField_char.jdField_do = 0;
            this.jdField_do.cZ.V();
          }
          break;
        case 1: 
          this.jdField_char.jdField_do = 0;
          this.jdField_do.cZ.V();
        }
        break;
      }
      break;
    case -50: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          if (this.jdField_do.aG.jdMethod_int(4412))
          {
            this.jdField_do.aG.jdMethod_do(this.jdField_char.gp);
            this.jdField_do.aG.jdMethod_new((short)a3.jdMethod_int(this.jdField_do.cZ.H[this.jdField_char.gp], a.C));
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cZ.a7[this.jdField_char.gp] = -1;
          this.jdField_do.cZ.H[this.jdField_char.gp] = a3.a(-1, a.C);
          this.jdField_do.a(true);
          this.jdField_char.jdField_do = 31;
          break;
        case 1: 
          this.jdField_char.jdField_do = 31;
        }
        break;
      }
      break;
    case -45: 
    case 18: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          short s1 = this.jdField_char.nl[this.jdField_char.hC][(this.jdField_char.lY + this.jdField_char.lX * 6)];
          if (this.jdField_do.cZ.a(this.jdField_char.hC, s1, 1, true)) {
            this.jdField_do.i.jdMethod_if(this.jdField_char.hC, s1, (byte)1);
          }
          this.jdField_char.jdField_do = 30;
          break;
        case 1: 
          this.jdField_char.jdField_do = 30;
        }
        break;
      }
      break;
    case -21: 
      this.jdField_do.dy.a(paramInt);
      break;
    case -20: 
    case -14: 
      this.jdField_do.ez.jdMethod_if(paramInt);
      break;
    case -26: 
    case -25: 
    case -24: 
    case -10: 
      this.jdField_do.ez.a(paramInt);
      break;
    case 68: 
    case 84: 
    case 85: 
      this.jdField_do.jdField_long.a(paramInt);
      break;
    case -9: 
    case 47: 
    case 48: 
    case 49: 
    case 54: 
    case 66: 
    case 126: 
      this.jdField_do.e0.a(paramInt);
      break;
    case -30: 
      if (this.jdField_char.mZ == 0) {
        switch (paramInt)
        {
        case 5: 
        case 6: 
        case 48: 
        case 49: 
        case 51: 
        case 55: 
        case 57: 
          j = this.jdField_do.jdMethod_do(paramInt, this.jdField_char.cM.length);
          if (j < 0) {
            return true;
          }
          if (j > 0) {
            this.jdField_char.gd = ((byte)j);
          }
          switch (this.jdField_char.gd)
          {
          case 0: 
            this.jdField_char.a("建筑等级太低,无法进入.", (short)-30, false, 9999);
            break;
          case 1: 
            g.gf = 0;
            this.jdField_char.mZ = 1;
            break;
          case 2: 
            this.jdField_do.i.jdMethod_for();
            this.jdField_char.j1 = -30;
            if (this.jdField_char.ip == null) {
              this.jdField_char.ip = new Vector();
            }
            if (this.jdField_char.bS == null) {
              this.jdField_char.bS = new Vector();
            }
            this.jdField_char.ip.removeAllElements();
            this.jdField_char.bS.removeAllElements();
            this.jdField_char.ee.removeAllElements();
            for (m = 0; m < this.jdField_char.fG.length; m = (byte)(m + 1))
            {
              this.jdField_char.bS.addElement(new Integer(this.jdField_char.fG[m]));
              this.jdField_char.ip.addElement(this.jdField_char.la[m]);
            }
            this.jdField_char.mZ = 2;
            break;
          case 3: 
            this.jdField_do.i.jdMethod_for();
            this.jdField_char.j1 = -30;
            if (this.jdField_char.ip == null) {
              this.jdField_char.ip = new Vector();
            }
            if (this.jdField_char.bS == null) {
              this.jdField_char.bS = new Vector();
            }
            this.jdField_char.ip.removeAllElements();
            this.jdField_char.ee.removeAllElements();
            this.jdField_char.bS.removeAllElements();
            for (m = 0; m < this.jdField_char.fG.length; m = (byte)(m + 1)) {
              if (this.jdField_char.ie[m] > 0)
              {
                this.jdField_char.bS.addElement(new Integer(this.jdField_char.fG[m]));
                this.jdField_char.ee.addElement(this.jdField_char.iA[m]);
                this.jdField_char.ip.addElement(this.jdField_char.la[m]);
              }
            }
            this.jdField_char.mZ = 3;
            break;
          case 4: 
            this.jdField_char.a(this.jdField_char.jy, (short)-30, false, 9999);
          }
          break;
        case 7: 
          this.jdField_char.eJ = null;
          this.jdField_char.fG = null;
          this.jdField_char.lG = null;
          this.jdField_char.iA = null;
          this.jdField_char.la = null;
          this.jdField_char.cM = null;
          this.jdField_char.jdField_do = 0;
          break;
        case 1: 
          g tmp4074_4071 = this.jdField_char;
          tmp4074_4071.gd = ((byte)(tmp4074_4071.gd - 1));
          if (this.jdField_char.gd < 0) {
            this.jdField_char.gd = ((byte)(this.jdField_char.cM.length - 1));
          }
          break;
        case 2: 
          g tmp4119_4116 = this.jdField_char;
          tmp4119_4116.gd = ((byte)(tmp4119_4116.gd + 1));
          if (this.jdField_char.gd > this.jdField_char.cM.length - 1) {
            this.jdField_char.gd = 0;
          }
          break;
        }
      } else if (this.jdField_char.mZ == 1) {
        switch (paramInt)
        {
        case 1: 
          g.gf = (byte)(g.gf - 1);
          if (g.gf < 0) {
            g.gf = 0;
          }
          break;
        case 2: 
          g.gf = (byte)(g.gf + 1);
          break;
        case 5: 
        case 6: 
          if (this.jdField_do.cZ.fj == 17)
          {
            this.jdField_char.mZ = 0;
            this.jdField_char.a("条件不足,无法升级该建筑.", (short)-30, false, 9999);
          }
          else
          {
            this.jdField_char.mZ = 0;
            this.jdField_char.a("只有会长才能升级科技建筑.", (short)-30, false, 9999);
          }
          break;
        case 7: 
          this.jdField_char.mZ = 0;
        }
      } else if (this.jdField_char.mZ == 2) {
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.L();
          break;
        case 2: 
          this.jdField_char.u();
          break;
        case 5: 
        case 6: 
          if (this.jdField_char.ip.size() > 0)
          {
            j = this.jdField_char.hZ;
            g.gf = 0;
            this.jdField_char.mZ = 4;
          }
          break;
        case 7: 
          this.jdField_char.mZ = 0;
        }
      } else if (this.jdField_char.mZ == 3) {
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.L();
          break;
        case 2: 
          this.jdField_char.u();
          break;
        case 5: 
        case 6: 
          if (this.jdField_char.ip.size() > 0)
          {
            j = this.jdField_char.hZ;
            g.gf = 0;
            this.jdField_char.mZ = 6;
          }
          break;
        case 7: 
          this.jdField_char.mZ = 0;
        }
      } else if (this.jdField_char.mZ == 4) {
        switch (paramInt)
        {
        case 1: 
          g.gf = (byte)(g.gf - 1);
          if (g.gf < 0) {
            g.gf = 0;
          }
          break;
        case 2: 
          g.gf = (byte)(g.gf + 1);
          break;
        case 5: 
        case 6: 
          if (this.jdField_char.ie[this.jdField_char.hZ] >= 10)
          {
            this.jdField_char.a("该科技已达到当前最高等级.", (short)2, false, 9999);
          }
          else
          {
            this.jdField_char.e3 = 0;
            this.jdField_char.mZ = 5;
          }
          break;
        case 7: 
          this.jdField_char.mZ = 2;
        }
      } else if (this.jdField_char.mZ == 5) {
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.e3 = 0;
          break;
        case 2: 
          this.jdField_char.e3 = 1;
          break;
        case 5: 
          switch (this.jdField_char.e3)
          {
          case 0: 
            if (this.jdField_do.aG.jdMethod_int(3739))
            {
              this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
              this.jdField_do.aG.jdMethod_for(this.jdField_char.fG[this.jdField_char.hZ]);
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.jdField_do = 21;
            break;
          case 1: 
            this.jdField_char.mZ = 4;
          }
          break;
        }
      } else if (this.jdField_char.mZ == 6) {
        switch (paramInt)
        {
        case 1: 
          g.gf = (byte)(g.gf - 1);
          if (g.gf < 0) {
            g.gf = 0;
          }
          break;
        case 2: 
          g.gf = (byte)(g.gf + 1);
          break;
        case 5: 
        case 6: 
          this.jdField_char.e3 = 0;
          this.jdField_char.mZ = 7;
          break;
        case 7: 
          this.jdField_char.mZ = 3;
        }
      } else if (this.jdField_char.mZ == 7) {
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.e3 = 0;
          break;
        case 2: 
          this.jdField_char.e3 = 1;
          break;
        case 5: 
          switch (this.jdField_char.e3)
          {
          case 0: 
            if (this.jdField_do.aG.jdMethod_int(3740))
            {
              this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
              this.jdField_do.aG.jdMethod_for(((Integer)this.jdField_char.bS.elementAt(this.jdField_char.hZ)).intValue());
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.jdField_do = 21;
            break;
          case 1: 
            this.jdField_char.mZ = 3;
          }
          break;
        }
      }
      break;
    case -83: 
    case 12: 
      switch (paramInt)
      {
      case 1: 
        g tmp5416_5413 = this.jdField_char;
        tmp5416_5413.gd = ((byte)(tmp5416_5413.gd - 1));
        if (this.jdField_char.gd < 0) {
          this.jdField_char.gd = 0;
        }
        break;
      case 2: 
        g tmp5451_5448 = this.jdField_char;
        tmp5451_5448.gd = ((byte)(tmp5451_5448.gd + 1));
        if (this.jdField_char.gd > 2) {
          this.jdField_char.gd = 2;
        }
        break;
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        j = this.jdField_do.jdMethod_do(paramInt, 3);
        if (j < 0) {
          return true;
        }
        if (j > 0) {
          this.jdField_char.gd = ((byte)j);
        }
        switch (this.jdField_char.gd)
        {
        case 0: 
          if (this.jdField_char.b5.equals(this.jdField_do.cZ.O))
          {
            this.jdField_char.a(16, (short)(this.jdField_char.jdField_do == 12 ? 10 : -80), false, 9999);
            return true;
          }
          if (this.jdField_do.cZ.a8)
          {
            this.jdField_char.a(17, (short)(this.jdField_char.jdField_do == 12 ? 10 : -80), false, 9999);
            return true;
          }
          m = (byte)(this.jdField_char.lY + this.jdField_char.lX * 6);
          if (m > this.jdField_char.bs[0] - 1) {
            return true;
          }
          if ((a3.jdMethod_do(this.jdField_char.jv[0][m], 2) == 0) && (this.jdField_do.cZ.d((byte)0) - this.jdField_char.dc <= 0) && (this.jdField_do.cZ.jdMethod_if(this.jdField_char.nl[0][m]) == 0))
          {
            this.jdField_char.a("再买背包就放不下了.", this.jdField_char.jdField_do, false, 9999);
          }
          else if ((a3.jdMethod_do(this.jdField_char.jv[0][m], 2) == 0) && (h.v(this.jdField_char.nl[0][m])) && (this.jdField_do.cZ.J() + this.jdField_char.lT >= h.c3))
          {
            this.jdField_char.a("最多拥有" + h.c3 + "件合成装备.", this.jdField_char.jdField_do, false, 9999);
          }
          else if (ag.dH - this.jdField_do.cZ.jdMethod_if(this.jdField_char.nl[0][m]) == 0)
          {
            this.jdField_char.a("该物品在背包里已经满了.", this.jdField_char.jdField_do, false, 9999);
          }
          else
          {
            this.jdField_do.d9 = new w(this.jdField_do, "数量", 0, Math.min(a3.jdMethod_do(this.jdField_char.ev[0][m], 2), ag.dH - this.jdField_do.cZ.jdMethod_if(this.jdField_char.nl[0][m])), a3.jdMethod_do(this.jdField_char.jv[0][m], 2) == 0 ? Math.min(a3.jdMethod_do(this.jdField_char.ev[0][m], 2), ag.dH - this.jdField_do.cZ.jdMethod_if(this.jdField_char.nl[0][m])) : a3.jdMethod_do(this.jdField_char.jv[0][m], 2));
            if (this.jdField_char.jdField_do == 12) {
              this.jdField_char.jdField_do = 51;
            } else {
              this.jdField_char.jdField_do = -82;
            }
          }
          break;
        case 1: 
          s2 = this.jdField_char.nl[this.jdField_char.hC][(this.jdField_char.lY + this.jdField_char.lX * 6)];
          this.jdField_do.du = new i(this.jdField_do);
          this.jdField_do.du.jdField_for = s2;
          this.jdField_do.du.jdField_do = this.jdField_do.jdMethod_do(this.jdField_do.i.jdMethod_if(s2), h.dU - 10);
          this.jdField_do.du.jdField_try = 0;
          this.jdField_do.du.jdField_new = 10;
          if (this.jdField_char.jdField_do == 12) {
            this.jdField_do.du.jdField_new = 10;
          } else {
            this.jdField_do.du.jdField_new = -80;
          }
          this.jdField_char.jdField_do = 114;
          break;
        case 2: 
          if (this.jdField_char.jdField_do == 12) {
            this.jdField_char.jdField_do = 10;
          } else {
            this.jdField_char.jdField_do = -80;
          }
          break;
        }
        break;
      case 7: 
        this.jdField_char.jdField_do = 10;
      }
      break;
    case 114: 
      this.jdField_do.du.a(paramInt);
      break;
    case 80: 
      this.jdField_do.ex.a(paramInt);
      break;
    case 91: 
      this.jdField_char.md.jdMethod_if(paramInt);
      break;
    case -6: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          if (this.jdField_do.aG.jdMethod_int(3712))
          {
            this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
            this.jdField_do.aG.jdMethod_if(this.jdField_char.b5);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
          break;
        case 1: 
          this.jdField_char.jdField_do = -5;
        }
        break;
      }
      break;
    case -5: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.L();
        break;
      case 2: 
        this.jdField_char.u();
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.ip.isEmpty()) {
          return true;
        }
        this.jdField_char.b5 = ((String)this.jdField_char.ip.elementAt(this.jdField_char.hZ));
        this.jdField_char.b5 = this.jdField_char.b5.substring(4, this.jdField_char.b5.length());
        this.jdField_char.jdField_do = -6;
        break;
      case 7: 
        this.jdField_char.c9 = null;
        this.jdField_char.ip.removeAllElements();
        this.jdField_char.bS.removeAllElements();
        this.jdField_char.dY = null;
        this.jdField_char.k1 = null;
        this.jdField_char.jdField_do = 0;
      }
      break;
    case -4: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          if (this.jdField_char.mf == 0)
          {
            if (this.jdField_do.cZ.a((byte)0) < this.jdField_char.eb)
            {
              this.jdField_char.a("强制退会需要" + this.jdField_char.eb + ".", (short)0, false, 9999);
            }
            else
            {
              if (this.jdField_do.aG.jdMethod_int(3709))
              {
                this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
                this.jdField_do.aG.jdMethod_for(this.jdField_char.eb);
                this.jdField_do.aG.jdMethod_if();
              }
              this.jdField_char.jdField_do = 21;
            }
          }
          else
          {
            if (this.jdField_do.aG.jdMethod_int(3706))
            {
              this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.a("已发送退会申请.", (short)0, false, 9999);
          }
          break;
        case 1: 
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case -3: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          this.jdField_char.e3 = 0;
          this.jdField_char.mf = 1;
          this.jdField_char.jdField_do = -4;
          break;
        case 1: 
          this.jdField_char.eb = (100 * this.jdField_do.cZ.a((byte)14) * this.jdField_do.cZ.a((byte)14));
          this.jdField_char.e3 = 0;
          this.jdField_char.mf = 0;
          this.jdField_char.jdField_do = -4;
        }
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
      }
      break;
    case -2: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          this.jdField_char.fj = 1;
          if (this.jdField_do.aG.jdMethod_int(3710))
          {
            this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
          break;
        case 1: 
          this.jdField_char.eb = (100 * this.jdField_do.cZ.a((byte)14) * this.jdField_do.cZ.a((byte)14));
          this.jdField_char.e3 = 0;
          this.jdField_char.mf = 0;
          this.jdField_char.jdField_do = -4;
        }
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
      }
      break;
    case -1: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          if (this.jdField_do.aG.jdMethod_int(3711))
          {
            this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.fL);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
          break;
        case 1: 
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case 121: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          if (this.jdField_do.aG.jdMethod_int(4304))
          {
            this.jdField_do.aG.jdMethod_do(this.jdField_char.gp);
            this.jdField_do.aG.jdMethod_new((short)a3.jdMethod_int(this.jdField_do.cZ.H[this.jdField_char.gp], a.C));
            this.jdField_do.aG.jdMethod_do(this.jdField_do.bJ.length);
            for (j = 0; j < this.jdField_do.bJ.length; j = (byte)(j + 1))
            {
              this.jdField_do.aG.jdMethod_new(this.jdField_do.bJ[j]);
              this.jdField_do.aG.jdMethod_do(a3.jdMethod_do(this.jdField_do.fr[j], 2));
              this.jdField_do.cZ.a((byte)0, this.jdField_do.bJ[j], a3.jdMethod_do(this.jdField_do.fr[j], 2), false);
            }
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
          break;
        case 1: 
          for (j = 0; j < this.jdField_char.bs[0]; j = (byte)(j + 1)) {
            this.jdField_char.jv[0][j] = ((short)a3.jdMethod_new(0, 2));
          }
          j = (short)a3.jdMethod_int(this.jdField_do.cZ.H[this.jdField_char.gp], a.C);
          this.jdField_do.bJ = new short[h.jdMethod_do(j)];
          this.jdField_do.fr = new short[h.jdMethod_do(j)];
          for (m = 0; m < this.jdField_do.fr.length; m = (byte)(m + 1)) {
            this.jdField_do.fr[m] = ((short)a3.jdMethod_new(0, 2));
          }
          this.jdField_char.lY = 0;
          this.jdField_char.lX = 0;
          this.jdField_char.hC = 0;
          this.jdField_char.dx = 0;
          this.jdField_char.jdField_do = 119;
        }
        break;
      }
      break;
    case 120: 
      switch (this.jdField_do.d9.a(paramInt))
      {
      case 2: 
        this.jdField_char.a("只能输入" + this.jdField_char.f4 + "-" + this.jdField_char.hG + "的数.", this.jdField_char.jdField_do, false, 9999);
        break;
      case 0: 
        k = (byte)(this.jdField_char.lY + this.jdField_char.lX * 6);
        if (a3.jdMethod_do(this.jdField_char.mn, 4) > 0)
        {
          this.jdField_do.bJ[this.jdField_char.dx] = this.jdField_char.nl[0][k];
          this.jdField_do.fr[this.jdField_char.dx] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_char.mn, 4), 2));
          if (a3.jdMethod_do(this.jdField_char.jv[0][k], 2) == 0)
          {
            g tmp8404_8401 = this.jdField_char;
            tmp8404_8401.dx = ((short)(tmp8404_8401.dx + 1));
          }
          this.jdField_char.jv[0][k] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_char.mn, 4), 2));
          m = h.jdMethod_do((short)a3.jdMethod_int(this.jdField_do.cZ.H[this.jdField_char.gp], a.C));
          if (m == 0) {
            m = 2;
          }
          if (this.jdField_char.dx >= m)
          {
            this.jdField_char.e3 = 0;
            this.jdField_char.jdField_do = 121;
          }
          else
          {
            this.jdField_char.a("请选择合成辅材料", (short)119, false, 20);
          }
        }
        break;
      case 1: 
        this.jdField_char.jdField_do = 119;
      }
      break;
    case 119: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.jdField_do.i.jdMethod_do(paramInt);
        break;
      case 5: 
      case 6: 
        k = (byte)(this.jdField_char.lY + this.jdField_char.lX * 6);
        if (k > this.jdField_char.bs[0] - 1) {
          return true;
        }
        if (a3.jdMethod_do(this.jdField_char.jv[0][k], 2) > 0) {
          return true;
        }
        this.jdField_do.d9 = new w(this.jdField_do, "数量", 1, this.jdField_do.cZ.jdMethod_if(this.jdField_char.nl[0][k]), a3.jdMethod_do(this.jdField_char.jv[0][k], 2) > 0 ? a3.jdMethod_do(this.jdField_char.jv[0][k], 2) : 1);
        this.jdField_char.jdField_do = 120;
        break;
      case 7: 
        this.jdField_do.i.jdMethod_if();
        this.jdField_char.jdField_do = 0;
      }
      break;
    case 92: 
      switch (paramInt)
      {
      case 1: 
        g tmp8820_8817 = this.jdField_char;
        tmp8820_8817.eq = ((byte)(tmp8820_8817.eq - 1));
        if (this.jdField_char.eq < 0) {
          this.jdField_char.eq = ((byte)(this.jdField_char.g6.length - 1));
        }
        break;
      case 2: 
        g tmp8865_8862 = this.jdField_char;
        tmp8865_8862.eq = ((byte)(tmp8865_8862.eq + 1));
        if (this.jdField_char.eq > this.jdField_char.g6.length - 1) {
          this.jdField_char.eq = 0;
        }
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.g6.length == 0) {
          return true;
        }
        k = 0;
        m = 0;
        for (s2 = 0; s2 < this.jdField_char.kT; s2 = (short)(s2 + 1)) {
          if (this.jdField_char.ki)
          {
            if (this.jdField_char.g6[this.jdField_char.eq].equals(g.hm[s2].O))
            {
              m = 1;
              if (g.hm[s2].jdMethod_else()) {
                k = 1;
              }
            }
          }
          else if (this.jdField_char.g6[this.jdField_char.eq].equals(this.jdField_char.iy[s2]))
          {
            m = 1;
            if (h.h(this.jdField_char.dq[s2]) == 1) {
              k = 1;
            }
          }
        }
        if (this.jdField_char.g6.length > 0)
        {
          if (m == 0)
          {
            this.jdField_char.a(this.jdField_char.g6[this.jdField_char.eq] + "不在同场景,无法使用.", (short)92, false, 30);
            return true;
          }
          if (k == 0)
          {
            this.jdField_char.a(this.jdField_char.g6[this.jdField_char.eq] + "没有死亡,无法使用.", (short)92, false, 30);
            return true;
          }
        }
        else if ((m == 0) || (k == 0))
        {
          return true;
        }
        if (this.jdField_do.cZ.eF == 0)
        {
          s2 = 0;
          if ((this.jdField_do.cZ.a((byte)24) < this.jdField_do.cZ.a((byte)26) / 2) && (-1 != (s2 = this.jdField_do.jdMethod_if((byte)111))))
          {
            this.jdField_do.cJ.a(s2, true);
            this.jdField_do.jdMethod_if(s2, true);
            this.jdField_do.cJ.a(s2, false);
            this.jdField_do.c((byte)2);
          }
          if (this.jdField_do.cZ.eZ == 1)
          {
            this.jdField_do.cZ.dZ = true;
            this.jdField_do.cZ.gZ = ((short)this.jdField_do.cZ.fm);
            this.jdField_do.cZ.g8 = 0;
            this.jdField_do.cZ.a4 = 9;
            return true;
          }
          this.jdField_do.cZ.a(this.jdField_do.cZ);
        }
        else if ((this.jdField_do.cZ.eF == 1) || (this.jdField_do.cZ.eF == 2))
        {
          if (this.jdField_do.aG.jdMethod_int(3509))
          {
            this.jdField_do.aG.jdMethod_for(this.jdField_do.cZ.gz);
            this.jdField_do.aG.jdMethod_do(-1);
            this.jdField_do.aG.jdMethod_do(1);
            this.jdField_do.aG.jdMethod_if(this.jdField_char.g6[this.jdField_char.eq]);
            this.jdField_do.aG.jdMethod_new(this.jdField_do.cZ.gl);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cZ.a((byte)(this.jdField_do.cZ.eF - 1), this.jdField_do.cZ.gl, 1, true);
        }
        this.jdField_char.jdField_do = 0;
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
      }
      break;
    case 122: 
      this.jdField_do.i.jdMethod_int(paramInt);
      break;
    case 127: 
      this.jdField_do.i.jdMethod_byte(paramInt);
      break;
    case 56: 
      this.jdField_do.i.jdMethod_for(paramInt);
      break;
    case 11: 
    case 67: 
    case 81: 
    case 88: 
    case 100: 
      this.jdField_do.ck.a(paramInt);
      break;
    case -91: 
    case -89: 
    case -82: 
    case -81: 
    case -80: 
    case -79: 
    case -78: 
    case -77: 
    case -76: 
    case -72: 
    case -71: 
    case -70: 
    case -64: 
    case -49: 
    case -46: 
    case -44: 
    case -37: 
    case -33: 
    case -32: 
    case -31: 
    case -29: 
    case -28: 
    case -27: 
    case -23: 
    case -22: 
    case -19: 
    case -18: 
    case -17: 
    case -16: 
    case -15: 
    case -13: 
    case -12: 
    case -11: 
    case -8: 
    case -7: 
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 8: 
    case 9: 
    case 10: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 50: 
    case 51: 
    case 52: 
    case 55: 
    case 57: 
    case 58: 
    case 59: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 65: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
    case 73: 
    case 74: 
    case 75: 
    case 76: 
    case 77: 
    case 78: 
    case 79: 
    case 82: 
    case 83: 
    case 86: 
    case 87: 
    case 89: 
    case 90: 
    case 93: 
    case 94: 
    case 95: 
    case 96: 
    case 97: 
    case 98: 
    case 99: 
    case 101: 
    case 102: 
    case 103: 
    case 104: 
    case 105: 
    case 106: 
    case 107: 
    case 108: 
    case 109: 
    case 110: 
    case 111: 
    case 112: 
    case 113: 
    case 115: 
    case 116: 
    case 117: 
    case 118: 
    case 123: 
    case 124: 
    case 125: 
    default: 
      bool = false;
    }
    return bool;
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    if (this.jdField_do.fK)
    {
      switch (paramInt)
      {
      case 1: 
        this.jdField_do.dp = 0;
        break;
      case 2: 
        this.jdField_do.dp = 1;
        break;
      case 5: 
        if (this.jdField_do.dp == 1) {
          this.jdField_do.fK = false;
        }
        break;
      }
      return;
    }
    if (this.jdField_do.br != null) {
      this.jdField_do.br.a(paramInt, false);
    }
    if (a(paramInt)) {
      return;
    }
    int i;
    int k;
    int j;
    switch (this.jdField_char.jdField_do)
    {
    case -103: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0)
        {
          i = Short.parseShort(this.jdField_do.i.g.getString(this.jdField_do.i.g.getSelectedIndex()));
          if (this.jdField_do.aG.jdMethod_int(8103))
          {
            this.jdField_do.aG.jdMethod_if(h.bL);
            this.jdField_do.aG.jdMethod_if(this.jdField_do.dv);
            this.jdField_do.aG.jdMethod_new(i);
            this.jdField_do.aG.jdMethod_if(q.dm);
            this.jdField_do.aG.jdMethod_if(q.cs);
            this.jdField_do.aG.jdMethod_do(127);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
          Display.getDisplay(this.jdField_do.fG).setCurrent(this.jdField_do);
          this.jdField_do.bv = null;
        }
        else
        {
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case -16: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0)
        {
          this.jdField_do.bR.a(this.jdField_do.bR.b, false);
          this.jdField_char.jdField_do = 0;
        }
        else if (this.jdField_do.bR.jdField_goto.length > 1)
        {
          this.jdField_char.jdField_do = -13;
        }
        else
        {
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case -19: 
      switch (paramInt)
      {
      case 1: 
        g.gf = (byte)(g.gf - 1);
        if (g.gf < 0) {
          g.gf = 0;
        }
        break;
      case 2: 
        g.gf = (byte)(g.gf + 1);
        break;
      case 5: 
      case 6: 
        if (this.jdField_do.aG.jdMethod_int(6790))
        {
          this.jdField_do.aG.jdMethod_for(this.jdField_char.ne);
          this.jdField_do.aG.jdMethod_do(1);
          this.jdField_do.aG.jdMethod_if();
        }
        this.jdField_do.cJ.jdField_do = 21;
        break;
      case 7: 
        this.jdField_char.jdField_do = -18;
      }
      break;
    case -18: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.L();
        break;
      case 2: 
        this.jdField_char.u();
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.ip.size() == 0) {
          return;
        }
        i = this.jdField_char.hZ;
        k = ((Integer)this.jdField_char.bS.elementAt(i)).intValue();
        this.jdField_char.ne = k;
        if (this.jdField_do.aG.jdMethod_int(6790))
        {
          this.jdField_do.aG.jdMethod_for(k);
          this.jdField_do.aG.jdMethod_do(0);
          this.jdField_do.aG.jdMethod_if();
        }
        this.jdField_do.cJ.jdField_do = 21;
        break;
      case 7: 
        this.jdField_char.p();
      }
      break;
    case 78: 
      switch (this.jdField_do.cZ.gj)
      {
      case 1: 
        switch (this.jdField_do.d9.a(paramInt))
        {
        case 2: 
          this.jdField_char.a("只能输入" + this.jdField_char.f4 + "-" + this.jdField_char.hG + "的数.", this.jdField_char.jdField_do, false, 9999);
          break;
        case 0: 
          if (a3.jdMethod_do(this.jdField_char.mn, 4) == 0)
          {
            this.jdField_do.cJ.p();
          }
          else
          {
            this.jdField_do.cZ.gF = this.jdField_char.mn;
            this.jdField_do.d9 = new w(this.jdField_do, "数量", 1, 99999999, 1);
            this.jdField_do.cZ.gj = 3;
          }
          break;
        case 1: 
          this.jdField_do.cJ.p();
        }
        break;
      case 3: 
        switch (this.jdField_do.d9.a(paramInt))
        {
        case 2: 
          this.jdField_char.a("只能输入" + this.jdField_char.f4 + "-" + this.jdField_char.hG + "的数.", this.jdField_char.jdField_do, false, 9999);
          break;
        case 0: 
          if (a3.jdMethod_do(this.jdField_char.mn, 4) == 0)
          {
            this.jdField_do.cJ.p();
          }
          else
          {
            g.gf = 0;
            this.jdField_do.cZ.dP = this.jdField_char.mn;
            this.jdField_do.cZ.gj = 4;
          }
          break;
        case 1: 
          this.jdField_do.cJ.p();
        }
        break;
      case 4: 
        switch (paramInt)
        {
        case 1: 
          g.gf = (byte)(g.gf - 1);
          if (g.gf < 0) {
            g.gf = 0;
          }
          break;
        case 2: 
          g.gf = (byte)(g.gf + 1);
          break;
        case 5: 
        case 6: 
          if (this.jdField_do.aG.jdMethod_int(6788))
          {
            this.jdField_do.aG.jdMethod_do(0);
            this.jdField_do.aG.jdMethod_do(this.jdField_do.cZ.dN);
            this.jdField_do.aG.jdMethod_for(a3.jdMethod_do(this.jdField_do.cZ.gF, a.C));
            this.jdField_do.aG.jdMethod_for(a3.jdMethod_do(this.jdField_do.cZ.dP, a.C));
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
          break;
        case 7: 
          this.jdField_do.cJ.p();
        }
        break;
      }
      break;
    case 60: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.jdField_do.jdMethod_do(paramInt, this.jdField_char.c9.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_char.gd = ((byte)i);
        }
        if (this.jdField_char.gd == 0)
        {
          if (this.jdField_do.aG.jdMethod_int(6789))
          {
            this.jdField_do.aG.jdMethod_do(0);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
        }
        else if (this.jdField_do.cZ.gH < 0)
        {
          this.jdField_do.cZ.dN = ((byte)(this.jdField_char.gd - 1));
          if ((this.jdField_do.cZ.dN < 0) || (this.jdField_do.cZ.dN > 1)) {
            this.jdField_do.cZ.dN = 0;
          }
          this.jdField_do.d9 = new w(this.jdField_do, "单价", 1, 99999999, 1);
          this.jdField_do.cZ.gj = 1;
          this.jdField_do.cJ.jdField_do = 78;
        }
        else
        {
          if (this.jdField_do.aG.jdMethod_int(6788))
          {
            this.jdField_do.aG.jdMethod_do(1);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
        }
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
        break;
      case 1: 
        g tmp2971_2968 = this.jdField_char;
        tmp2971_2968.gd = ((byte)(tmp2971_2968.gd - 1));
        if (this.jdField_char.gd < 0) {
          this.jdField_char.gd = ((byte)(this.jdField_char.c9.length - 1));
        }
        break;
      case 2: 
        g tmp3016_3013 = this.jdField_char;
        tmp3016_3013.gd = ((byte)(tmp3016_3013.gd + 1));
        if (this.jdField_char.gd > this.jdField_char.c9.length - 1) {
          this.jdField_char.gd = 0;
        }
        break;
      }
      break;
    case -13: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        this.jdField_char.e3 = 0;
        this.jdField_char.jdField_do = -16;
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
        break;
      case 1: 
        g tmp3135_3132 = this.jdField_char;
        tmp3135_3132.gd = ((byte)(tmp3135_3132.gd - 1));
        if (this.jdField_char.gd < 0) {
          this.jdField_char.gd = ((byte)(this.jdField_char.c9.length - 1));
        }
        break;
      case 2: 
        g tmp3180_3177 = this.jdField_char;
        tmp3180_3177.gd = ((byte)(tmp3180_3177.gd + 1));
        if (this.jdField_char.gd > this.jdField_char.c9.length - 1) {
          this.jdField_char.gd = 0;
        }
        break;
      }
      break;
    case 116: 
      this.jdField_do.i.a(paramInt);
      break;
    case -12: 
    case 71: 
    case 82: 
    case 83: 
    case 102: 
      this.jdField_do.aI.a(paramInt);
      break;
    case -105: 
      switch (paramInt)
      {
      case 2: 
      case 5: 
        if (this.jdField_do.aG.jdMethod_int(6718))
        {
          this.jdField_do.aG.jdMethod_do(0);
          this.jdField_do.aG.jdMethod_if();
        }
        this.jdField_do.cJ.jdField_do = 21;
      }
      break;
    case -106: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.L();
        break;
      case 2: 
        this.jdField_char.u();
        break;
      case 5: 
      case 6: 
        if (this.jdField_do.aG.jdMethod_int(6719))
        {
          this.jdField_do.aG.jdMethod_do(this.jdField_char.hZ);
          this.jdField_do.aG.jdMethod_if();
        }
        this.jdField_do.cJ.jdField_do = 21;
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
      }
      break;
    case -123: 
      if (this.jdField_char.bH) {
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
        }
      } else {
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.e3 = 0;
          break;
        case 2: 
          this.jdField_char.e3 = 1;
          break;
        case 5: 
        case 6: 
          if (this.jdField_char.e3 == 0) {
            this.jdField_char.jdMethod_try((byte)60);
          } else {
            this.jdField_char.jdField_do = 0;
          }
          break;
        }
      }
      break;
    case -107: 
      if (this.jdField_char.lz == 0) {
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
        }
      } else {
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.e3 = 0;
          break;
        case 2: 
          this.jdField_char.e3 = 1;
          break;
        case 5: 
        case 6: 
          if (this.jdField_char.e3 == 0) {
            this.jdField_char.jdMethod_try((byte)50);
          } else {
            this.jdField_char.jdField_do = 0;
          }
          break;
        }
      }
      break;
    case -108: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.L();
        break;
      case 2: 
        this.jdField_char.u();
        break;
      case 5: 
      case 6: 
        this.jdField_char.jdField_do = 27;
        this.jdField_char.dN = true;
        this.jdField_char.b5 = this.jdField_char.mp;
        this.jdField_char.gd = 0;
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
      }
      break;
    case -109: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.L();
        break;
      case 2: 
        this.jdField_char.u();
        break;
      case 5: 
      case 6: 
        this.jdField_char.jdField_do = 27;
        this.jdField_char.hu = true;
        this.jdField_char.b5 = this.jdField_char.mH;
        this.jdField_char.gd = 0;
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
      }
      break;
    case -122: 
    case -121: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0)
        {
          this.jdField_char.b();
        }
        else
        {
          this.jdField_char.e3 = 0;
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case -120: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.L();
        break;
      case 2: 
        this.jdField_char.u();
        break;
      case 5: 
      case 6: 
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
      }
      break;
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 45: 
      this.jdField_do.br.a(paramInt, true);
      break;
    case -72: 
    case -71: 
      this.jdField_do.ct.a(paramInt);
      break;
    case 75: 
      this.jdField_char.e0.a(paramInt);
      break;
    case 74: 
      this.jdField_char.e0.a(paramInt);
      break;
    case 27: 
      switch (paramInt)
      {
      case 3: 
        if (this.jdField_char.c9.length <= 6) {
          return;
        }
        if (this.jdField_char.gd >= this.jdField_char.c9.length / 2)
        {
          g tmp4470_4467 = this.jdField_char;
          tmp4470_4467.gd = ((byte)(tmp4470_4467.gd - this.jdField_char.c9.length / 2));
        }
        break;
      case 4: 
        if (this.jdField_char.c9.length <= 6) {
          return;
        }
        if (this.jdField_char.gd < this.jdField_char.c9.length / 2)
        {
          g tmp4530_4527 = this.jdField_char;
          tmp4530_4527.gd = ((byte)(tmp4530_4527.gd + this.jdField_char.c9.length / 2));
        }
        break;
      case 1: 
        g tmp4556_4553 = this.jdField_char;
        if ((tmp4556_4553.gd = (byte)(tmp4556_4553.gd - 1)) < 0) {
          this.jdField_char.gd = ((byte)(this.jdField_char.c9.length - 1));
        }
        break;
      case 2: 
        g tmp4595_4592 = this.jdField_char;
        if ((tmp4595_4592.gd = (byte)(tmp4595_4592.gd + 1)) > this.jdField_char.c9.length - 1) {
          this.jdField_char.gd = 0;
        }
        break;
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.jdField_do.jdMethod_do(paramInt, this.jdField_char.c9.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_char.gd = ((byte)i);
        }
        if (this.jdField_do.aj == null) {
          this.jdField_do.aj = new d(this.jdField_do, this.jdField_char.j1);
        }
        this.jdField_do.aj.a();
        this.jdField_do.aj.jdMethod_if();
        this.jdField_do.aj = null;
        Runtime.getRuntime().gc();
      }
      break;
    case 26: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.L();
        break;
      case 2: 
        this.jdField_char.u();
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.ip.isEmpty()) {
          return;
        }
        this.jdField_char.gd = 0;
        this.jdField_char.b5 = ((String)this.jdField_char.ip.elementAt(this.jdField_char.hZ));
        if ((this.jdField_char.j1 == 14) && (this.jdField_char.b5.indexOf("?") != -1)) {
          return;
        }
        if ((this.jdField_char.j1 == 28) || (this.jdField_char.j1 == 16))
        {
          this.jdField_char.es = ((Short)this.jdField_char.bS.elementAt(this.jdField_char.hZ)).shortValue();
          if (this.jdField_char.j1 == 16)
          {
            if (this.jdField_char.es == -1) {
              this.jdField_char.c9 = new String[] { "交易", "返回" };
            } else if (this.jdField_char.mc) {
              this.jdField_char.c9 = new String[] { "偷袭", "返回" };
            } else {
              this.jdField_char.c9 = new String[] { "私聊", "交易", "偷袭", "入队", "拜师", "返回", "好友", "资料", "决斗", "入会", "求爱", "返回" };
            }
            this.jdField_char.bA = -1;
            this.jdField_char.bj = false;
            for (i = 0; i < this.jdField_char.kT; i = (short)(i + 1)) {
              if (this.jdField_char.iy[i].equals(this.jdField_char.b5))
              {
                this.jdField_char.bA = this.jdField_char.mL[i];
                if (!ag.jdMethod_do(this.jdField_char.k7[i], (byte)6)) {
                  break;
                }
                this.jdField_char.bj = true;
                break;
              }
            }
          }
        }
        if (this.jdField_char.j1 == 29) {
          this.jdField_char.es = ((Byte)this.jdField_char.bS.elementAt(this.jdField_char.hZ)).byteValue();
        }
        if (this.jdField_char.j1 == 104)
        {
          this.jdField_char.c9 = new String[] { "私聊", "资料", "职位", "踢出", "返回" };
          this.jdField_char.b5 = this.jdField_char.b5.substring(4, this.jdField_char.b5.length());
          this.jdField_char.es = ((Short)this.jdField_char.bS.elementAt(this.jdField_char.hZ)).shortValue();
        }
        if (this.jdField_char.j1 == -91)
        {
          this.jdField_char.es = ((Integer)this.jdField_char.bS.elementAt(this.jdField_char.hZ)).intValue();
          this.jdField_char.c9 = new String[] { "查看", "外交", "返回" };
        }
        if ((this.jdField_char.j1 == -31) || (this.jdField_char.j1 == -32))
        {
          i = -1;
          if (this.jdField_char.fa == 0)
          {
            this.jdField_char.jM = ((byte)this.jdField_char.hZ);
            this.jdField_char.ix = 0;
            this.jdField_char.dA = 0;
            i = this.jdField_char.jV[this.jdField_char.jM];
          }
          else if (this.jdField_char.fa == 1)
          {
            this.jdField_char.ix = ((byte)this.jdField_char.hZ);
            this.jdField_char.dA = 0;
            i = this.jdField_char.cT[this.jdField_char.jM][this.jdField_char.ix];
          }
          else
          {
            this.jdField_char.dA = ((byte)this.jdField_char.hZ);
            i = this.jdField_char.iM[this.jdField_char.jM][this.jdField_char.ix][this.jdField_char.dA];
          }
          switch (i)
          {
          case 0: 
            return;
          case 1: 
            this.jdField_char.c9 = new String[] { "打开", "返回" };
            break;
          case 2: 
            this.jdField_char.c9 = new String[] { "查看", "返回" };
          }
        }
        this.jdField_char.jdField_do = 27;
        break;
      case 7: 
        this.jdField_char.c9 = null;
        this.jdField_char.ip.removeAllElements();
        this.jdField_char.bS.removeAllElements();
        this.jdField_char.dY = null;
        this.jdField_char.k1 = null;
        if (this.jdField_char.j1 == 28)
        {
          if (this.jdField_char.gL) {
            this.jdField_char.ea.a(this.jdField_char.ea.h);
          }
          this.jdField_char.jdField_do = this.jdField_char.f2;
        }
        else if (this.jdField_char.j1 == 90)
        {
          if (this.jdField_char.gL) {
            this.jdField_char.ea.a(this.jdField_char.ea.h);
          }
          this.jdField_char.jdField_do = this.jdField_char.bW;
        }
        else if ((this.jdField_char.j1 == -31) || (this.jdField_char.j1 == -32))
        {
          if (this.jdField_char.fa == 0)
          {
            this.jdField_char.kd = null;
            this.jdField_char.gq = ((String[][])null);
            this.jdField_char.cv = ((String[][][])null);
            this.jdField_char.jV = null;
            this.jdField_char.cT = ((byte[][])null);
            this.jdField_char.iM = ((byte[][][])null);
            this.jdField_char.kX = null;
            this.jdField_char.jb = null;
            this.jdField_char.jdField_do = 0;
          }
          else
          {
            this.jdField_char.ip.removeAllElements();
            this.jdField_char.bS.removeAllElements();
            if (this.jdField_char.fa == 1)
            {
              if (this.jdField_char.j1 == -31) {
                this.jdField_char.jb = "排行榜";
              } else {
                this.jdField_char.jb = "帮助";
              }
              for (i = 0; i < this.jdField_char.kd.length; i = (byte)(i + 1)) {
                this.jdField_char.ip.addElement(this.jdField_char.kd[i]);
              }
            }
            else
            {
              this.jdField_char.jb = this.jdField_char.kd[this.jdField_char.jM];
              for (i = 0; i < this.jdField_char.gq[this.jdField_char.jM].length; i = (byte)(i + 1)) {
                this.jdField_char.ip.addElement(this.jdField_char.gq[this.jdField_char.jM][i]);
              }
            }
            g tmp6194_6191 = this.jdField_char;
            tmp6194_6191.fa = ((byte)(tmp6194_6191.fa - 1));
            this.jdField_do.i.jdMethod_for();
            this.jdField_char.jdField_do = 26;
          }
        }
        else
        {
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case -15: 
      switch (paramInt)
      {
      case 1: 
        g tmp6284_6281 = this.jdField_char;
        tmp6284_6281.gd = ((byte)(tmp6284_6281.gd - 1));
        if (this.jdField_char.gd < 0) {
          this.jdField_char.gd = ((byte)(g.fZ.length - 1));
        }
        break;
      case 2: 
        g tmp6330_6327 = this.jdField_char;
        tmp6330_6327.gd = ((byte)(tmp6330_6327.gd + 1));
        if (this.jdField_char.gd > g.fZ.length - 1) {
          this.jdField_char.gd = 0;
        }
        break;
      case 5: 
      case 6: 
        switch (this.jdField_char.gd)
        {
        case 0: 
          this.jdField_do.i.jdMethod_if(this.jdField_char.jx, (byte)0);
          this.jdField_char.c4 = 5;
          break;
        case 1: 
          this.jdField_do.jdMethod_case(this.jdField_char.jx);
          break;
        }
        if (this.jdField_char.jdField_do == -15) {
          this.jdField_char.jdField_do = 104;
        }
        break;
      case 7: 
        if (this.jdField_char.jdField_do == -15) {
          this.jdField_char.jdField_do = 104;
        }
        break;
      }
      break;
    case 103: 
      this.jdField_char.jdField_do = 0;
      break;
    case -102: 
    case -70: 
    case -46: 
    case -37: 
    case -8: 
    case 5: 
    case 22: 
    case 41: 
    case 42: 
    case 43: 
    case 58: 
    case 59: 
    case 64: 
    case 65: 
    case 73: 
    case 87: 
    case 94: 
    case 98: 
    case 110: 
    case 113: 
    case 118: 
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
      }
      break;
    case 55: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        this.jdField_char.cE[this.jdField_char.fF] = this.jdField_char.d7;
        this.jdField_char.d7 = 0;
        if (this.jdField_char.fF + 1 >= this.jdField_char.nt.length)
        {
          if (this.jdField_do.aG.jdMethod_int(1005))
          {
            this.jdField_do.aG.jdMethod_do(5);
            this.jdField_do.aG.jdMethod_do(this.jdField_char.cE.length);
            for (i = 0; i < this.jdField_char.cE.length; i++) {
              this.jdField_do.aG.jdMethod_do(this.jdField_char.cE[i]);
            }
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_do.cJ.jdField_do = 21;
        }
        else
        {
          g tmp6803_6800 = this.jdField_char;
          tmp6803_6800.fF = ((byte)(tmp6803_6800.fF + 1));
        }
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
        break;
      case 1: 
        g tmp6831_6828 = this.jdField_char;
        tmp6831_6828.d7 = ((byte)(tmp6831_6828.d7 - 1));
        if (this.jdField_char.d7 < 0) {
          this.jdField_char.d7 = 0;
        }
        break;
      case 2: 
        g tmp6866_6863 = this.jdField_char;
        tmp6866_6863.d7 = ((byte)(tmp6866_6863.d7 + 1));
        if (this.jdField_char.d7 >= this.jdField_char.fx[this.jdField_char.fF].length) {
          this.jdField_char.d7 = ((byte)(this.jdField_char.fx[this.jdField_char.fF].length - 1));
        }
        break;
      }
      break;
    case -29: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0)
        {
          if (this.jdField_do.aG.jdMethod_int(1005))
          {
            this.jdField_do.aG.jdMethod_do(7);
            this.jdField_do.aG.jdMethod_new(this.jdField_char.dF);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
        }
        else
        {
          this.jdField_char.jdField_do = 74;
        }
        break;
      }
      break;
    case 34: 
      switch (this.jdField_char.kH)
      {
      case 0: 
      case 1: 
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.e3 = 0;
          break;
        case 2: 
          this.jdField_char.e3 = 1;
          break;
        case 5: 
        case 6: 
          if (this.jdField_char.e3 == 0)
          {
            if (this.jdField_do.cZ.a((byte)14) >= this.jdField_char.iw)
            {
              if (!this.jdField_char.lf)
              {
                this.jdField_char.a(this.jdField_char.hx, (short)0, false, 9999);
                return;
              }
              if (this.jdField_do.cZ.a((byte)0) < this.jdField_char.cU)
              {
                this.jdField_char.a(this.jdField_char.bT, (short)0, false, 9999);
                return;
              }
              if (this.jdField_char.gt > 0)
              {
                for (i = 0; i < this.jdField_do.cZ.H.length; i++) {
                  if (a3.jdMethod_int(this.jdField_do.cZ.H[i], a.C) != -1)
                  {
                    this.jdField_char.a("转职前请先卸下身上的所有装备.", (short)0, false, 9999);
                    return;
                  }
                }
                this.jdField_char.fF = 0;
                this.jdField_char.cE = new byte[this.jdField_char.nt.length];
                this.jdField_char.d7 = 0;
                this.jdField_char.a("新物质融合器:\"融合开始...进入自审程序...请认真回答以下问题,这将决定你的转职强化方向.\"", (short)55, false, 9999);
              }
              else
              {
                this.jdField_char.a(this.jdField_char.mA, (short)0, false, 9999);
              }
            }
            else
            {
              this.jdField_char.a(this.jdField_char.jk, (short)0, false, 9999);
            }
          }
          else {
            this.jdField_char.jdField_do = 0;
          }
          break;
        }
        break;
      }
      break;
    case -125: 
      if (this.jdField_char.gP) {
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
        }
      } else {
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.e3 = 0;
          break;
        case 2: 
          this.jdField_char.e3 = 1;
          break;
        case 5: 
          switch (this.jdField_char.e3)
          {
          case 0: 
            this.jdField_char.jdMethod_try((byte)60);
            break;
          case 1: 
            this.jdField_char.jdField_do = 0;
          }
          break;
        }
      }
      break;
    case -124: 
      if (this.jdField_do.dL) {
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
        }
      } else {
        switch (paramInt)
        {
        case 1: 
          this.jdField_char.e3 = 0;
          break;
        case 2: 
          this.jdField_char.e3 = 1;
          break;
        case 5: 
          switch (this.jdField_char.e3)
          {
          case 0: 
            if (this.jdField_do.aG.jdMethod_int(1005))
            {
              this.jdField_do.aG.jdMethod_do(1);
              this.jdField_do.aG.jdMethod_for(this.jdField_do.dl);
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.jdField_do = 21;
            break;
          case 1: 
            this.jdField_char.jdField_do = 0;
          }
          break;
        }
      }
      break;
    case -104: 
      switch (paramInt)
      {
      case 6: 
        if (this.jdField_do.aG.jdMethod_int(6702))
        {
          this.jdField_do.aG.jdMethod_if(h.bL);
          this.jdField_do.aG.jdMethod_do(100);
          for (i = 0; i < this.jdField_do.cJ.gX; i = (byte)(i + 1))
          {
            this.jdField_do.aG.jdMethod_new(this.jdField_do.cJ.dR[i]);
            this.jdField_do.aG.jdMethod_do(1);
            this.jdField_do.aG.jdMethod_if(q.dm);
            this.jdField_do.aG.jdMethod_if(q.cs);
          }
          this.jdField_do.aG.jdMethod_if();
        }
        this.jdField_do.cJ.jdField_do = 21;
        break;
      case 7: 
        this.jdField_char.jdField_do = 0;
        break;
      case 1: 
        g.gf = (byte)(g.gf - 1);
        if (g.gf < 0) {
          g.gf = 0;
        }
        break;
      case 2: 
      case 5: 
        g.gf = (byte)(g.gf + 1);
      }
      break;
    case 107: 
      switch (paramInt)
      {
      case 7: 
        this.jdField_char.jdField_do = this.jdField_char.jr;
      }
      break;
    case 109: 
      this.jdField_char.c7.a(paramInt);
      break;
    case -81: 
    case 46: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          if (this.jdField_do.aG.jdMethod_int(this.jdField_char.jdField_do == 46 ? 6782 : 6804))
          {
            this.jdField_do.aG.jdMethod_if(this.jdField_char.b5);
            this.jdField_do.aG.jdMethod_do(this.jdField_char.dx);
            for (i = 0; i < this.jdField_char.bs[0]; i = (byte)(i + 1)) {
              if (a3.jdMethod_do(this.jdField_char.jv[0][i], 2) > 0)
              {
                if (h.v(this.jdField_char.nl[0][i])) {
                  this.jdField_do.aG.jdMethod_for(this.jdField_char.nl[0][i] - 1000);
                } else {
                  this.jdField_do.aG.jdMethod_for(this.jdField_char.nl[0][i]);
                }
                this.jdField_do.aG.jdMethod_new(this.jdField_char.jv[0][i]);
              }
            }
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
          break;
        case 1: 
          if (this.jdField_char.jdField_do == 46) {
            this.jdField_char.jdField_do = 10;
          } else {
            this.jdField_char.jdField_do = -80;
          }
          break;
        }
        break;
      }
      break;
    case -82: 
    case 51: 
      switch (this.jdField_do.d9.a(paramInt))
      {
      case 2: 
        this.jdField_char.a("只能输入" + this.jdField_char.f4 + "-" + this.jdField_char.hG + "的数.", this.jdField_char.jdField_do, false, 9999);
        break;
      case 0: 
        i = (byte)(this.jdField_char.lY + this.jdField_char.lX * 6);
        if (a3.jdMethod_do(this.jdField_char.mn, 4) > 0)
        {
          if (this.jdField_char.bO - this.jdField_do.i.a() < a3.jdMethod_do(this.jdField_char.mn, 4) * this.jdField_char.lK[0][i])
          {
            this.jdField_char.a(18, this.jdField_char.jdField_do, false, 9999);
            return;
          }
          if (a3.jdMethod_do(this.jdField_char.jv[0][i], 2) == 0)
          {
            g tmp8822_8819 = this.jdField_char;
            tmp8822_8819.dx = ((short)(tmp8822_8819.dx + 1));
            if (this.jdField_do.cZ.a((byte)0, this.jdField_char.nl[0][i]) == -1)
            {
              g tmp8862_8859 = this.jdField_char;
              tmp8862_8859.dc = ((byte)(tmp8862_8859.dc + 1));
              if (h.v(this.jdField_char.nl[0][i]))
              {
                g tmp8898_8895 = this.jdField_char;
                tmp8898_8895.lT = ((byte)(tmp8898_8895.lT + 1));
              }
            }
          }
          this.jdField_char.jv[0][i] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_char.mn, 4), 2));
        }
        else if (a3.jdMethod_do(this.jdField_char.mn, 4) == 0)
        {
          if (a3.jdMethod_do(this.jdField_char.jv[0][i], 2) > 0)
          {
            g tmp8974_8971 = this.jdField_char;
            tmp8974_8971.dx = ((short)(tmp8974_8971.dx - 1));
            if (this.jdField_do.cZ.a((byte)0, this.jdField_char.nl[0][i]) == -1)
            {
              g tmp9014_9011 = this.jdField_char;
              tmp9014_9011.dc = ((byte)(tmp9014_9011.dc - 1));
              if (h.v(this.jdField_char.nl[0][i]))
              {
                g tmp9050_9047 = this.jdField_char;
                tmp9050_9047.lT = ((byte)(tmp9050_9047.lT - 1));
              }
            }
          }
          this.jdField_char.jv[0][i] = ((short)a3.jdMethod_new(0, 2));
        }
        if (this.jdField_char.jdField_do == 51) {
          this.jdField_char.jdField_do = 10;
        } else {
          this.jdField_char.jdField_do = -80;
        }
        break;
      case 1: 
        if (this.jdField_char.jdField_do == 51) {
          this.jdField_char.jdField_do = 10;
        } else {
          this.jdField_char.jdField_do = -80;
        }
        break;
      }
      break;
    case -80: 
    case 10: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.jdField_do.i.jdMethod_do(paramInt);
        break;
      case 5: 
        i = (byte)(this.jdField_char.lY + this.jdField_char.lX * 6);
        if (i > this.jdField_char.bs[0] - 1) {
          return;
        }
        this.jdField_char.gd = 0;
        if (this.jdField_char.jdField_do == 10) {
          this.jdField_char.jdField_do = 12;
        } else {
          this.jdField_char.jdField_do = -83;
        }
        break;
      case 6: 
        if (this.jdField_char.dx == 0) {
          return;
        }
        this.jdField_char.e3 = 0;
        if (this.jdField_char.jdField_do == 10) {
          this.jdField_char.jdField_do = 46;
        } else {
          this.jdField_char.jdField_do = -81;
        }
        break;
      case 7: 
        this.jdField_do.a(!this.jdField_do.cZ.a8);
        this.jdField_do.i.jdMethod_if();
        this.jdField_char.jdField_do = 26;
      }
      break;
    case -78: 
    case 9: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          if (this.jdField_char.jdField_do == 9)
          {
            if (this.jdField_do.aG.jdMethod_int(6783))
            {
              this.jdField_do.aG.jdMethod_do(this.jdField_char.dx);
              for (i = 0; i < this.jdField_char.bs[0]; i = (byte)(i + 1)) {
                if (a3.jdMethod_do(this.jdField_char.jv[0][i], 2) > 0)
                {
                  this.jdField_do.aG.jdMethod_do(0);
                  this.jdField_do.aG.jdMethod_for(this.jdField_char.nl[0][i]);
                  this.jdField_do.aG.jdMethod_new(this.jdField_char.jv[0][i]);
                  this.jdField_do.aG.jdMethod_for(this.jdField_char.lK[0][i]);
                }
              }
              this.jdField_do.aG.jdMethod_do(this.jdField_char.dx);
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.jdField_do = 21;
          }
          else
          {
            if (this.jdField_do.aG.jdMethod_int(6801))
            {
              this.jdField_do.aG.jdMethod_new(this.jdField_do.f);
              this.jdField_do.aG.jdMethod_new(this.jdField_do.cZ.aP);
              this.jdField_do.aG.jdMethod_new(this.jdField_do.cZ.aM);
              this.jdField_do.aG.jdMethod_do(this.jdField_char.dx);
              for (i = 0; i < this.jdField_char.bs[0]; i = (byte)(i + 1)) {
                if (a3.jdMethod_do(this.jdField_char.jv[0][i], 2) > 0)
                {
                  this.jdField_do.aG.jdMethod_do(0);
                  this.jdField_do.aG.jdMethod_for(this.jdField_char.nl[0][i]);
                  this.jdField_do.aG.jdMethod_new(this.jdField_char.jv[0][i]);
                  this.jdField_do.aG.jdMethod_for(this.jdField_char.lK[0][i]);
                }
              }
              this.jdField_do.aG.jdMethod_if();
            }
            this.jdField_char.jdField_do = 21;
          }
          break;
        case 1: 
          if (this.jdField_char.jdField_do == 9) {
            this.jdField_char.jdField_do = 6;
          } else {
            this.jdField_char.jdField_do = -76;
          }
          break;
        }
        break;
      }
      break;
    case -79: 
    case 8: 
      switch (this.jdField_do.d9.a(paramInt))
      {
      case 2: 
        this.jdField_char.a("只能输入" + this.jdField_char.f4 + "-" + this.jdField_char.hG + "的数.", this.jdField_char.jdField_do, false, 9999);
        break;
      case 0: 
        i = (byte)(this.jdField_char.lY + this.jdField_char.lX * 6);
        if (a3.jdMethod_do(this.jdField_char.jv[0][i], 2) == 0)
        {
          g tmp10088_10085 = this.jdField_char;
          tmp10088_10085.dx = ((short)(tmp10088_10085.dx + 1));
        }
        this.jdField_char.jv[0][i] = ((short)a3.jdMethod_new(this.jdField_else, 2));
        this.jdField_char.lK[0][i] = a3.jdMethod_do(this.jdField_char.mn, 4);
        if (this.jdField_char.jdField_do == 8) {
          this.jdField_char.jdField_do = 6;
        } else {
          this.jdField_char.jdField_do = -76;
        }
        break;
      case 1: 
        if (this.jdField_char.jdField_do == 8) {
          this.jdField_char.jdField_do = 6;
        } else {
          this.jdField_char.jdField_do = -76;
        }
        break;
      }
      break;
    case -77: 
    case 72: 
      switch (this.jdField_do.d9.a(paramInt))
      {
      case 2: 
        this.jdField_char.a("只能输入" + this.jdField_char.f4 + "-" + this.jdField_char.hG + "的数.", this.jdField_char.jdField_do, false, 9999);
        break;
      case 0: 
        i = (byte)(this.jdField_char.lY + this.jdField_char.lX * 6);
        if (a3.jdMethod_do(this.jdField_char.mn, 4) == 0)
        {
          if (a3.jdMethod_do(this.jdField_char.jv[0][i], 2) > 0)
          {
            g tmp10370_10367 = this.jdField_char;
            tmp10370_10367.dx = ((short)(tmp10370_10367.dx - 1));
          }
          this.jdField_char.jv[0][i] = ((short)a3.jdMethod_new(0, 2));
          if (this.jdField_char.jdField_do == 72) {
            this.jdField_char.jdField_do = 6;
          } else {
            this.jdField_char.jdField_do = -76;
          }
        }
        else
        {
          this.jdField_else = ((byte)a3.jdMethod_do(this.jdField_char.mn, 4));
          this.jdField_do.d9 = new w(this.jdField_do, "价格", 1, 99999999, Math.max(1, this.jdField_char.lK[0][i]));
          if (this.jdField_char.jdField_do == 72) {
            this.jdField_char.jdField_do = 8;
          } else {
            this.jdField_char.jdField_do = -79;
          }
        }
        break;
      case 1: 
        if (this.jdField_char.jdField_do == 72) {
          this.jdField_char.jdField_do = 6;
        } else {
          this.jdField_char.jdField_do = -76;
        }
        break;
      }
      break;
    case -76: 
    case 6: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.jdField_do.i.jdMethod_do(paramInt);
        break;
      case 5: 
        i = (byte)(this.jdField_char.lY + this.jdField_char.lX * 6);
        if (i > this.jdField_char.bs[0] - 1) {
          return;
        }
        if ((this.jdField_char.dx >= a.n) && (a3.jdMethod_do(this.jdField_char.jv[0][i], 2) == 0))
        {
          this.jdField_char.a("最多摆10种商品.", this.jdField_char.jdField_do, false, 30);
        }
        else
        {
          this.jdField_do.d9 = new w(this.jdField_do, "数量", 0, this.jdField_do.cZ.jdMethod_if(this.jdField_char.nl[0][i]), a3.jdMethod_do(this.jdField_char.jv[0][i], 2) > 0 ? a3.jdMethod_do(this.jdField_char.jv[0][i], 2) : this.jdField_do.cZ.jdMethod_if(this.jdField_char.nl[0][i]));
          if (this.jdField_char.jdField_do == 6) {
            this.jdField_char.jdField_do = 72;
          } else {
            this.jdField_char.jdField_do = -77;
          }
        }
        break;
      case 6: 
        if (this.jdField_char.dx == 0) {
          return;
        }
        this.jdField_char.e3 = 0;
        if (this.jdField_char.jdField_do == 6) {
          this.jdField_char.jdField_do = 9;
        } else {
          this.jdField_char.jdField_do = -78;
        }
        break;
      case 7: 
        this.jdField_do.i.jdMethod_if();
        this.jdField_char.jdField_do = 0;
      }
      break;
    case 99: 
      switch (paramInt)
      {
      case 1: 
        g tmp11008_11005 = this.jdField_char;
        tmp11008_11005.gd = ((byte)(tmp11008_11005.gd - 1));
        if (this.jdField_char.gd < 0) {
          this.jdField_char.gd = ((byte)(this.jdField_char.cW.length - 1));
        }
        break;
      case 2: 
        g tmp11053_11050 = this.jdField_char;
        tmp11053_11050.gd = ((byte)(tmp11053_11050.gd + 1));
        if (this.jdField_char.gd > this.jdField_char.cW.length - 1) {
          this.jdField_char.gd = 0;
        }
        break;
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.jdField_do.jdMethod_do(paramInt, this.jdField_char.cW.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_char.gd = ((byte)i);
        }
        this.jdField_do.dk = null;
        if (this.jdField_char.gd < 2) {
          this.jdField_char.jdMethod_do(this.jdField_char.gd);
        } else {
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case -27: 
    case 95: 
    case 96: 
    case 97: 
    case 111: 
    case 112: 
      this.jdField_do.as.a(paramInt);
      break;
    case 93: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
        this.jdField_char.e3 = (this.jdField_char.e3 == 0 ? 1 : 0);
        break;
      case 5: 
      case 6: 
        if (this.jdField_char.e3 == 0)
        {
          if ((g.dD == 4) && (this.jdField_do.aG.jdMethod_int(3757)))
          {
            this.jdField_do.aG.jdMethod_new(this.jdField_char.jdField_if);
            this.jdField_do.aG.jdMethod_if();
          }
          if ((this.jdField_char.cJ != -1) || ((this.jdField_do.cZ.gE) && (g.dZ == 1)))
          {
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
          }
          this.jdField_do.M = this.jdField_do.cJ.jdField_if;
          this.jdField_do.bH = this.jdField_do.fi;
          this.jdField_do.aF = this.jdField_do.cR;
          this.jdField_char.j();
        }
        else if (this.jdField_char.e3 == 1)
        {
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case 86: 
    case 89: 
      this.jdField_char.md.jdMethod_if(paramInt);
      break;
    case 76: 
      switch (paramInt)
      {
      case 5: 
        this.jdField_do.S.a();
      }
      break;
    case 77: 
      switch (paramInt)
      {
      case 5: 
        this.jdField_do.S.a(this.jdField_do.S.jdField_for, this.jdField_do.cJ);
      }
      break;
    case 70: 
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
          this.jdField_do.fG.platformRequest(this.jdField_char.fL);
          this.jdField_char.J();
        }
        catch (Exception localException) {}
      case 7: 
        this.jdField_char.J();
      }
      break;
    case 63: 
      switch (paramInt)
      {
      case 1: 
        as tmp11815_11812 = this.jdField_do.S;
        tmp11815_11812.av = ((byte)(tmp11815_11812.av - 1));
        if (this.jdField_do.S.av < 0) {
          this.jdField_do.S.av = ((byte)(this.jdField_do.S.ai.length - 1));
        }
        break;
      case 2: 
        as tmp11872_11869 = this.jdField_do.S;
        tmp11872_11869.av = ((byte)(tmp11872_11869.av + 1));
        if (this.jdField_do.S.av >= this.jdField_do.S.ai.length) {
          this.jdField_do.S.av = 0;
        }
        break;
      case 5: 
      case 6: 
        this.jdField_do.dk = null;
        this.jdField_do.S.a(this.jdField_do.S.aI[this.jdField_do.S.av], this.jdField_char);
      }
      break;
    case -33: 
      this.jdField_do.dJ.a(paramInt);
      break;
    case 50: 
      this.jdField_char.jj.a(paramInt);
      break;
    case 36: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          if (this.jdField_char.bZ == null)
          {
            this.jdField_char.bZ = new int[h.dU];
            for (j = 0; j < h.dU; j++) {
              this.jdField_char.bZ[j] = 285212672;
            }
          }
          this.jdField_char.c3 = 0;
          this.jdField_char.jdField_do = 37;
          break;
        case 1: 
          this.jdField_do.cZ.d();
          this.jdField_char.jdField_do = 0;
        }
        break;
      }
      break;
    case 20: 
      this.jdField_char.g7.jdMethod_if(paramInt);
      break;
    case 19: 
      if (this.jdField_char.jdField_int < 10) {
        return;
      }
      switch (paramInt)
      {
      case 5: 
        this.jdField_do.cZ.jdMethod_if((byte)16, 1);
        this.jdField_do.cZ.T = false;
        this.jdField_do.cZ.ao = false;
        this.jdField_do.cZ.hU = false;
        this.jdField_do.cZ.a4 = 0;
        this.jdField_do.o();
      }
      break;
    case 15: 
      this.jdField_char.md.jdMethod_if(paramInt);
      break;
    case 25: 
      switch (paramInt)
      {
      case 1: 
        g tmp12400_12397 = this.jdField_char;
        tmp12400_12397.gd = ((byte)(tmp12400_12397.gd - 1));
        if (this.jdField_char.gd < 0) {
          this.jdField_char.gd = ((byte)(g.b2.length - 1));
        }
        break;
      case 2: 
        g tmp12446_12443 = this.jdField_char;
        tmp12446_12443.gd = ((byte)(tmp12446_12443.gd + 1));
        if (this.jdField_char.gd > g.b2.length - 1) {
          this.jdField_char.gd = 0;
        }
        break;
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        j = this.jdField_do.jdMethod_do(paramInt, g.b2.length);
        if (j < 0) {
          return;
        }
        if (j > 0) {
          this.jdField_char.gd = ((byte)j);
        }
        this.jdField_char.bl = "配点成功!\001";
        k = 0;
        short[] arrayOfShort = new short[12];
        switch (this.jdField_char.gd)
        {
        case 5: 
          this.jdField_char.jdField_do = 13;
        }
        if (this.jdField_char.gd < 5)
        {
          if (this.jdField_do.aG.jdMethod_int(1015))
          {
            this.jdField_do.aG.jdMethod_do(this.jdField_char.gd);
            this.jdField_do.aG.jdMethod_if();
          }
          this.jdField_char.jdField_do = 21;
        }
        break;
      }
      break;
    case 13: 
      this.jdField_char.eZ.a(paramInt);
      break;
    case 0: 
      if ((this.jdField_char.ki) && (this.jdField_do.cZ.ek)) {
        return;
      }
      this.jdField_char.jdMethod_for(paramInt);
      break;
    case 1: 
      this.jdField_char.jdMethod_new(paramInt);
      break;
    case 2: 
      this.jdField_char.jdMethod_try(paramInt);
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\a8.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */