import javax.microedition.lcdui.Graphics;

public class c
{
  h a = null;
  g jdField_if = null;
  
  public c(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
    byte[] arrayOfByte1 = this.a.cZ.jdMethod_if(null);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    String[] arrayOfString1 = new String[arrayOfByte1.length];
    for (int i = 0; i < arrayOfByte2.length; i = (byte)(i + 1)) {
      arrayOfByte2[i] = 0;
    }
    arrayOfString1 = this.a.a(arrayOfByte1);
    i = (byte)arrayOfByte1.length;
    for (int j = 0; j < i / 2; j = (byte)(j + 1))
    {
      int k = arrayOfByte1[j];
      int m = arrayOfByte2[j];
      String str1 = arrayOfString1[j];
      arrayOfByte1[j] = arrayOfByte1[(i - j - 1)];
      arrayOfByte2[j] = arrayOfByte2[(i - j - 1)];
      arrayOfString1[j] = arrayOfString1[(i - j - 1)];
      arrayOfByte1[(i - j - 1)] = k;
      arrayOfByte2[(i - j - 1)] = m;
      arrayOfString1[(i - j - 1)] = str1;
    }
    byte[] arrayOfByte3 = this.a.cZ.z();
    byte[] arrayOfByte4 = new byte[arrayOfByte3.length];
    String[] arrayOfString2 = new String[arrayOfByte3.length];
    for (int n = 0; n < arrayOfByte4.length; n = (byte)(n + 1)) {
      arrayOfByte4[n] = 1;
    }
    arrayOfString2 = this.a.a(arrayOfByte3);
    arrayOfString2[(arrayOfByte3.length - 1)] = "????";
    i = (byte)arrayOfByte3.length;
    for (n = 0; n < i / 2; n = (byte)(n + 1))
    {
      int i1 = arrayOfByte3[n];
      int i2 = arrayOfByte4[n];
      String str2 = arrayOfString2[n];
      arrayOfByte3[n] = arrayOfByte3[(i - n - 1)];
      arrayOfByte4[n] = arrayOfByte4[(i - n - 1)];
      arrayOfString2[n] = arrayOfString2[(i - n - 1)];
      arrayOfByte3[(i - n - 1)] = i1;
      arrayOfByte4[(i - n - 1)] = i2;
      arrayOfString2[(i - n - 1)] = str2;
    }
    this.jdField_if.hl = new String[arrayOfByte1.length + arrayOfByte3.length];
    this.jdField_if.lj = new byte[arrayOfByte1.length + arrayOfByte3.length];
    this.jdField_if.mT = new byte[arrayOfByte1.length + arrayOfByte3.length];
    if (arrayOfByte1.length > 0)
    {
      System.arraycopy(arrayOfByte1, 0, this.jdField_if.lj, 0, arrayOfByte1.length);
      System.arraycopy(arrayOfByte2, 0, this.jdField_if.mT, 0, arrayOfByte2.length);
      System.arraycopy(arrayOfString1, 0, this.jdField_if.hl, 0, arrayOfString1.length);
    }
    if (arrayOfByte3.length > 0)
    {
      System.arraycopy(arrayOfByte3, 0, this.jdField_if.lj, arrayOfByte1.length, arrayOfByte3.length);
      System.arraycopy(arrayOfByte4, 0, this.jdField_if.mT, arrayOfByte1.length, arrayOfByte4.length);
      System.arraycopy(arrayOfString2, 0, this.jdField_if.hl, arrayOfByte1.length, arrayOfString2.length);
    }
    arrayOfByte1 = null;
    arrayOfByte2 = null;
    arrayOfByte3 = null;
    arrayOfByte4 = null;
    this.jdField_if.gi = 0;
    this.jdField_if.hZ = 0;
  }
  
  public void a()
  {
    this.jdField_if.E();
    this.a.a((byte)2, 0, 0, h.dU, h.fp, true);
    this.a.a((byte)2, 0, h.fp - 40, h.dU, 40, false);
    int i = 5;
    int j = 4;
    int k = h.dU;
    for (int m = 0; m < Math.min(g.iX, this.jdField_if.lj.length); m = (byte)(m + 1))
    {
      if (m == this.jdField_if.hZ)
      {
        this.a.fj.setColor(h.b2[2][1]);
        this.a.fj.fillRect(j - 2, i + m * (h.eA + 2) - 1, k - 5, h.eA + 1);
        this.a.fj.setColor(h.b2[2][0]);
      }
      else if (this.jdField_if.mT[(this.jdField_if.gi + m)] != 0)
      {
        this.a.fj.setColor(h.b2[2][0]);
      }
      else if (ag.jdMethod_null(this.jdField_if.lj[(this.jdField_if.gi + m)]))
      {
        this.a.fj.setColor(h.b2[4][0]);
      }
      else
      {
        this.a.fj.setColor(h.b2[1][1]);
      }
      this.a.fj.drawString(this.jdField_if.hl[(this.jdField_if.gi + m)], j, i + m * (h.eA + 2), 20);
      if (this.jdField_if.mT[(this.jdField_if.gi + m)] == 0)
      {
        int n = this.a.cZ.a((short)this.jdField_if.lj[(this.jdField_if.gi + m)], (byte)0);
        if (n >= 0)
        {
          switch (n)
          {
          case 0: 
            n = 1;
            break;
          case 1: 
            n = 3;
            break;
          case 2: 
            n = 7;
            break;
          case 3: 
            n = 9;
          }
          this.jdField_if.a(j - 3, i + m * (h.eA + 2) + 5, n);
        }
      }
    }
    if (this.jdField_if.hl.length > 0)
    {
      String str = "已习得该技能";
      if (this.jdField_if.mT[(this.jdField_if.gi + this.jdField_if.hZ)] != 0) {
        str = "点击查看详情";
      }
      this.a.fj.setColor(h.b2[2][1]);
      this.a.fj.drawString(str, j, h.fp - 38, 20);
      if (this.jdField_if.gi > 0) {
        this.a.a(k - 20, i + (this.jdField_if.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
      }
      if (this.jdField_if.gi < this.jdField_if.lj.length - g.iX) {
        this.a.a(k - 20, h.fp - 40 - 18 + (this.jdField_if.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
      }
    }
    this.a.x();
    this.a.c();
  }
  
  public void a(int paramInt)
  {
    switch (this.jdField_if.jdField_do)
    {
    case 75: 
      switch (paramInt)
      {
      case 1: 
        g tmp112_109 = this.jdField_if;
        tmp112_109.gd = ((byte)(tmp112_109.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = ((byte)(g.f1[this.jdField_if.gS].length - 1));
        }
        break;
      case 2: 
        g tmp166_163 = this.jdField_if;
        tmp166_163.gd = ((byte)(tmp166_163.gd + 1));
        if (this.jdField_if.gd > g.f1[this.jdField_if.gS].length - 1) {
          this.jdField_if.gd = 0;
        }
        break;
      case 5: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        int i = this.a.jdMethod_do(paramInt, g.f1[this.jdField_if.gS].length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_if.gd = ((byte)i);
        }
        switch (this.jdField_if.gS)
        {
        case 2: 
          switch (this.jdField_if.gd)
          {
          case 0: 
            this.a.ex = new aj(this.a, this.jdField_if.dF, (byte)74);
            this.jdField_if.jdField_do = 80;
            break;
          case 1: 
          case 2: 
          case 3: 
          case 4: 
            this.a.cZ.jdMethod_if((byte)(this.jdField_if.gd - 1), (short)this.jdField_if.dF, (byte)0);
            this.jdField_if.jdField_do = 74;
            break;
          case 5: 
            this.jdField_if.e3 = 0;
            this.jdField_if.jdField_do = -29;
            break;
          case 6: 
            this.jdField_if.jdField_do = 74;
          }
          break;
        case 0: 
          switch (this.jdField_if.gd)
          {
          case 0: 
            this.a.ex = new aj(this.a, this.jdField_if.dF, (byte)74);
            this.jdField_if.jdField_do = 80;
            break;
          case 1: 
          case 2: 
          case 3: 
          case 4: 
            this.a.cZ.jdMethod_if((byte)(this.jdField_if.gd - 1), (short)this.jdField_if.dF, (byte)0);
            this.jdField_if.jdField_do = 74;
            break;
          case 5: 
            this.jdField_if.jdField_do = 74;
          }
          break;
        case 1: 
          switch (this.jdField_if.gd)
          {
          case 0: 
            this.a.ex = new aj(this.a, this.jdField_if.dF, (byte)74);
            this.jdField_if.jdField_do = 80;
            break;
          case 1: 
            if (!this.a.cZ.k(this.jdField_if.dF))
            {
              this.jdField_if.a(5, (short)74, false, 9999);
              return;
            }
            if (this.a.cZ.a((byte)8) < this.jdField_if.nw)
            {
              this.jdField_if.a(6, (short)74, false, 9999);
              return;
            }
            this.jdField_if.mT[(this.jdField_if.gi + this.jdField_if.hZ)] = 0;
            this.a.cZ.c(this.jdField_if.dF);
            this.jdField_if.jdField_do = 74;
            break;
          case 2: 
            this.jdField_if.jdField_do = 74;
          }
          break;
        }
        break;
      }
      break;
    case 74: 
      switch (paramInt)
      {
      case 1: 
        g tmp864_861 = this.jdField_if;
        tmp864_861.hZ = ((short)(tmp864_861.hZ - 1));
        if (this.jdField_if.hZ < 0)
        {
          this.jdField_if.hZ = 0;
          g tmp896_893 = this.jdField_if;
          tmp896_893.gi = ((short)(tmp896_893.gi - 1));
          if (this.jdField_if.gi < 0)
          {
            this.jdField_if.gi = 0;
            this.jdField_if.hZ = 0;
          }
        }
        break;
      case 2: 
        if (this.jdField_if.hZ + 1 > this.jdField_if.lj.length - 1) {
          return;
        }
        g tmp962_959 = this.jdField_if;
        tmp962_959.hZ = ((short)(tmp962_959.hZ + 1));
        if (this.jdField_if.hZ > g.iX - 1)
        {
          this.jdField_if.hZ = ((short)(byte)(g.iX - 1));
          g tmp1005_1002 = this.jdField_if;
          tmp1005_1002.gi = ((short)(tmp1005_1002.gi + 1));
          if (this.jdField_if.gi > this.jdField_if.lj.length - g.iX) {
            this.jdField_if.gi = ((short)(byte)(this.jdField_if.lj.length - g.iX));
          }
        }
        break;
      case 5: 
      case 6: 
        if (this.jdField_if.lj.length <= 0) {
          return;
        }
        this.jdField_if.gd = 0;
        this.jdField_if.dF = this.jdField_if.lj[(this.jdField_if.gi + this.jdField_if.hZ)];
        this.jdField_if.gS = this.jdField_if.mT[(this.jdField_if.gi + this.jdField_if.hZ)];
        if (ag.l(this.jdField_if.dF))
        {
          if (this.jdField_if.dF >= a.l)
          {
            this.jdField_if.a("技能查看失败:角色当前条件不足.", (short)74, false, 9999);
            return;
          }
          this.jdField_if.gS = ((byte)a.t);
        }
        else if ((this.jdField_if.dF == 0) && (this.jdField_if.gS == 1))
        {
          this.jdField_if.a("技能查看失败:角色当前条件不足.", (short)74, false, 9999);
          return;
        }
        this.jdField_if.nw = ((short)(int)h.j(this.jdField_if.dF));
        this.jdField_if.jdField_do = 75;
        break;
      case 7: 
        this.jdField_if.lj = null;
        this.jdField_if.hl = null;
        this.jdField_if.mT = null;
        this.jdField_if.jdField_do = 0;
        this.jdField_if.e0 = null;
      }
      break;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */