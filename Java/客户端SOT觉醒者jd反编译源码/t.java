import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class t
{
  h a = null;
  g jdField_if = null;
  String jdField_int = null;
  short jdField_for;
  short jdField_do;
  
  public t(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
    switch (this.a.cZ.bo)
    {
    case 0: 
      this.jdField_int = "战士";
      break;
    case 1: 
      this.jdField_int = "法师";
      break;
    case 2: 
      this.jdField_int = "盗贼";
      break;
    case 3: 
      this.jdField_int = "枪手";
    }
    if (this.jdField_if.gn == null)
    {
      this.jdField_if.lB = new int[5];
      this.a.b0.a(21 + (this.a.cZ.gD == 1 ? 27 : 0), 0, this.jdField_if.lB);
    }
  }
  
  public void a()
  {
    if (h.a9 == 0)
    {
      this.a.a((byte)2, 0, 0, 128, 128, true);
      if (this.jdField_if.mz == 0)
      {
        this.jdField_for = 61;
        this.jdField_do = ((short)(h.eA + 1));
        jdMethod_if();
        this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
        this.a.a("金钱", 5, this.jdField_for, 0, h.b2[2][0]);
        this.a.a(45, this.jdField_for + 5, this.a.cZ.a((byte)0), 20);
        this.a.a(h.dU / 2 - 7, h.fp - 10 + (this.jdField_if.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
      }
      else if (this.jdField_if.mz == 1)
      {
        this.jdField_for = 10;
        this.jdField_do = ((short)(h.eA + 1));
        jdMethod_do();
        this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
        this.a.a("情侣 " + this.a.cJ.j2, 5, this.jdField_for, 0, h.b2[2][0]);
        this.a.a("亲密", 64, this.jdField_for, 0, h.b2[2][0]);
        this.a.a(104, this.jdField_for + 5, this.a.cJ.mb, 20);
        if (this.a.cJ.cn != 0)
        {
          this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
          this.a.a("师父" + this.a.cJ.l8, 5, this.jdField_for, 0, h.b2[2][0]);
          if (this.a.cJ.cn > 0)
          {
            this.a.a("师德", 64, this.jdField_for, 0, h.b2[2][0]);
            this.a.a(104, this.jdField_for + 5, this.a.cJ.ma, 20);
          }
        }
        if (this.a.cZ.fL >= 0)
        {
          this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
          this.a.a("公会贡献", 5, this.jdField_for, 0, h.b2[2][0]);
          this.a.a(65, this.jdField_for + 5, this.a.cZ.a((byte)50), 20);
        }
        this.a.a(h.dU / 2 - 7, 3 + (this.jdField_if.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
      }
    }
    else
    {
      this.a.a((byte)2, 0, 0, 176, 243, true);
      this.jdField_for = 60;
      this.jdField_do = ((short)(h.eA - 2));
      jdMethod_if();
      this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
      jdMethod_do();
      this.a.a("金钱", 88, this.jdField_for, 0, h.b2[2][0]);
      this.a.a(128, this.jdField_for + 5, this.a.cZ.a((byte)0), 20);
      this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
      this.a.a("情侣 " + this.a.cJ.j2, 5, this.jdField_for, 0, h.b2[2][0]);
      this.a.a("亲密", 88, this.jdField_for, 0, h.b2[2][0]);
      this.a.a(128, this.jdField_for + 5, this.a.cJ.mb, 20);
      if (this.a.cJ.cn != 0)
      {
        this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
        this.a.a("师父" + this.a.cJ.l8, 5, this.jdField_for, 0, h.b2[2][0]);
        if (this.a.cJ.cn > 0)
        {
          this.a.a("师德", 88, this.jdField_for, 0, h.b2[2][0]);
          this.a.a(128, this.jdField_for + 5, this.a.cJ.ma, 20);
        }
      }
      this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
      this.a.a("职业熟练", 5, this.jdField_for, 0, h.b2[2][0]);
      this.a.a(65, this.jdField_for + 5, this.jdField_if.bX, 20);
      if (this.a.cZ.fL >= 0)
      {
        this.a.a("公会贡献", 88, this.jdField_for, 0, h.b2[2][0]);
        this.a.a(148, this.jdField_for + 5, this.a.cZ.a((byte)50), 20);
      }
    }
  }
  
  public void jdMethod_if()
  {
    if ((this.a.cZ.a((byte)36) <= 0) && (this.jdField_if.e3 == 1)) {
      if (this.jdField_if.gn != null) {
        this.jdField_if.e3 = 0;
      } else {
        this.jdField_if.e3 = -1;
      }
    }
    if (this.jdField_if.gn != null)
    {
      this.a.fj.drawImage(this.jdField_if.gn, 3, 3, 0);
      if (this.jdField_if.e3 == 0) {
        this.a.a(46 + (this.jdField_if.jdField_int / 3 % 2 == 0 ? -1 : 1), 24, this.a.aH[6].getWidth(), this.a.aH[6].getHeight(), 0, 0, this.a.aH[6], 2);
      }
    }
    else
    {
      i = 20;
      j = 10;
      this.a.b0.a(i, j, this.a.o, this.jdField_if.lB, 0, this.a.cZ.fa, this.a.cZ.bo);
      this.a.b0.a(this.jdField_if.lB);
      this.a.a(i, j, this.a.cZ.gD, this.a.cZ.bo, h.J((short)a3.jdMethod_int(this.a.cZ.H[a.ac], a.C)), (short)a3.jdMethod_int(this.a.cZ.H[a.char], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.t], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.i], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.J], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.L], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.e], a.C), this.jdField_if.jdField_int);
    }
    this.a.a(8, 46, 22, 11, 66, 0, this.a.aH[12], 0);
    this.a.a(30, 48, this.a.cZ.a((byte)14), 20);
    if (this.a.cZ.fL >= 0) {
      this.a.a(46, 45, this.a.cZ.fj);
    }
    int i = (short)this.a.cZ.a((byte)36);
    int j = 2;
    if (i > 0)
    {
      if (this.jdField_if.e3 == 1) {
        this.a.a(38 + (h.a9 == 0 ? 0 : 20) + 6 + 2 * (this.jdField_if.jdField_int / 5 % 2), 24, 11, 8, 0, 0, this.a.aH[6], 0);
      }
      j = 4;
    }
    this.a.a(i + "", 60 + (i >= 10 ? 0 : 6) + (h.a9 == 0 ? 0 : 20), 22, 0, h.b2[j][0]);
    this.a.fj.setColor(h.b2[2][1]);
    this.a.fj.drawString(this.jdField_int, 50 + (h.a9 == 0 ? 0 : 20), 3, 0);
    if (this.a.cZ.fL >= 0) {
      this.a.fj.drawString(ag.jdMethod_try(this.a.cZ.fj, this.a.cZ.hq), 50 + 2 * h.eA + 2 + (h.a9 == 0 ? 0 : 20), 3, 0);
    }
    this.a.fj.drawString("点天赋", 78 + (h.a9 == 0 ? 0 : 20), 22, 0);
    if (this.a.cZ.fL != -1) {
      this.a.fj.setColor(m.a[this.a.cZ.fx]);
    }
    this.a.fj.drawString(this.a.cZ.es, 60 + (h.a9 == 0 ? 0 : 20), 40, 0);
    this.a.fj.setColor(h.b2[2][1]);
    long l1 = this.a.cZ.jdMethod_void();
    long l2 = Math.min(this.a.cZ.a((byte)4), this.a.cZ.jdMethod_void());
    this.a.a(5, 60, 80 + (h.a9 == 0 ? 0 : 50), 5, 13421772, this.a.cZ.jdMethod_void(), (int)l2);
    long l3 = l2 * 100L / l1;
    long l4 = l2 * 100L % l1;
    long l5 = l4 * 100L / l1;
    this.a.a(111 + (h.a9 == 0 ? 0 : 50) + 3, 59, 5, 7, 55, 0, this.a.aH[5], 0);
    if (l5 < 10L) {
      this.a.a(101 + (h.a9 == 0 ? 0 : 50) + 2, 59, 0L, 20);
    }
    this.a.a(101 + (l5 < 10L ? 5 : 0) + (h.a9 == 0 ? 0 : 50) + 2, 59, (int)l5, 20);
    this.a.a(96 + (h.a9 == 0 ? 0 : 50) + 2, 59, 5, 7, 80, 0, this.a.aH[5], 0);
    this.a.a(97 + (h.a9 == 0 ? 0 : 50) + 2, 59, (int)l3, 24);
    this.jdField_for = ((short)(this.jdField_for + 5));
    this.a.a("生命", 5, this.jdField_for, 0, h.b2[2][0]);
    this.a.a(95 + (h.a9 == 0 ? 0 : 40), this.jdField_for + 5, this.a.cZ.a((byte)16), 24);
    this.a.a(95 + (h.a9 == 0 ? 0 : 40), this.jdField_for + 5, 5, 7, 50, 0, this.a.aH[5], 0);
    this.a.a(123 + (h.a9 == 0 ? 0 : 40), this.jdField_for + 5, this.a.cZ.a((byte)20), 24);
    this.a.a(45, this.jdField_for + 5, 20 + (h.a9 == 0 ? 0 : 40), 4, h.b2[4][0], this.a.cZ.a((byte)20), this.a.cZ.a((byte)16));
    this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
    this.a.a("魔力", 5, this.jdField_for, 0, h.b2[2][0]);
    this.a.a(95 + (h.a9 == 0 ? 0 : 40), this.jdField_for + 5, this.a.cZ.a((byte)24) + this.a.de, 24);
    this.a.a(95 + (h.a9 == 0 ? 0 : 40), this.jdField_for + 5, 5, 7, 50, 0, this.a.aH[5], 0);
    this.a.a(123 + (h.a9 == 0 ? 0 : 40), this.jdField_for + 5, this.a.cZ.a((byte)26), 24);
    if (this.a.de > 0) {
      this.a.a(45, this.jdField_for + 5, 20 + (h.a9 == 0 ? 0 : 40), 4, h.b2[8][1], this.a.cZ.a((byte)26), this.a.cZ.a((byte)24) + this.a.de);
    }
    this.a.a(45, this.jdField_for + 5, 20 + (h.a9 == 0 ? 0 : 40), 4, h.b2[3][0], this.a.cZ.a((byte)26), this.a.cZ.a((byte)24), this.a.de <= 0);
  }
  
  public void jdMethod_do()
  {
    this.a.a("物攻", 5, this.jdField_for, 0, h.b2[2][0]);
    this.a.a(45, this.jdField_for + 5, this.a.cZ.e(), 20);
    a(45, this.jdField_for + 5, (byte)2);
    this.a.a("物防", (h.a9 == 0 ? '' : '°') / 2, this.jdField_for, 0, h.b2[2][0]);
    this.a.a((h.a9 == 0 ? '' : '°') / 2 + 40, this.jdField_for + 5, this.a.cZ.jdMethod_goto(), 20);
    a((h.a9 == 0 ? '' : '°') / 2 + 40, this.jdField_for + 5, (byte)3);
    this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
    this.a.a("魔攻", 5, this.jdField_for, 0, h.b2[2][0]);
    this.a.a(45, this.jdField_for + 5, this.a.cZ.jdMethod_byte(), 20);
    a(45, this.jdField_for + 5, (byte)4);
    this.a.a("魔防", (h.a9 == 0 ? '' : '°') / 2, this.jdField_for, 0, h.b2[2][0]);
    this.a.a((h.a9 == 0 ? '' : '°') / 2 + 40, this.jdField_for + 5, this.a.cZ.jdMethod_try(), 20);
    a((h.a9 == 0 ? '' : '°') / 2 + 40, this.jdField_for + 5, (byte)5);
    this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
    this.a.a("耐力", 5, this.jdField_for, 0, h.b2[2][0]);
    this.a.a(55, this.jdField_for + 5, this.a.cJ.gc, 24);
    this.a.a(56, this.jdField_for + 5, 5, 7, 55, 0, this.a.aH[5], 0);
    this.a.a("意志", (h.a9 == 0 ? '' : '°') / 2, this.jdField_for, 0, h.b2[2][0]);
    this.a.a((h.a9 == 0 ? '' : '°') / 2 + 40 + 10, this.jdField_for + 5, this.a.cJ.gA, 24);
    this.a.a((h.a9 == 0 ? '' : '°') / 2 + 40 + 11, this.jdField_for + 5, 5, 7, 55, 0, this.a.aH[5], 0);
    this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
    this.a.a("魅力", 5, this.jdField_for, 0, h.b2[2][0]);
    this.a.a(55, this.jdField_for + 5, this.a.cJ.l5, 24);
    this.a.a(56, this.jdField_for + 5, 5, 7, 55, 0, this.a.aH[5], 0);
    this.a.a("运气", (h.a9 == 0 ? '' : '°') / 2, this.jdField_for, 0, h.b2[2][0]);
    this.a.a((h.a9 == 0 ? '' : '°') / 2 + 40 + 10, this.jdField_for + 5, this.a.cJ.i1, 24);
    this.a.a((h.a9 == 0 ? '' : '°') / 2 + 40 + 11, this.jdField_for + 5, 5, 7, 55, 0, this.a.aH[5], 0);
    this.jdField_for = ((short)(this.jdField_for + this.jdField_do));
    this.a.a("勋章", 5, this.jdField_for, 0, h.b2[2][0]);
    this.a.a(45, this.jdField_for + 5, this.a.cZ.a((byte)8), 20);
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 7: 
      this.jdField_if.lB = null;
      this.jdField_if.jdField_do = 0;
      this.jdField_if.eZ = null;
      break;
    case 5: 
    case 6: 
      if ((this.jdField_if.mz == 0) && (this.a.cZ.a((byte)36) > 0) && (this.jdField_if.e3 == 1))
      {
        this.jdField_if.gd = 0;
        this.jdField_if.jdField_do = 25;
      }
      else if ((this.jdField_if.mz == 0) && (this.jdField_if.e3 == 0) && (this.jdField_if.gn != null))
      {
        if (this.jdField_if.dt == null)
        {
          if (this.a.aG.jdMethod_int(2506))
          {
            this.a.aG.jdMethod_if(this.a.cZ.O);
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
        }
        else
        {
          this.jdField_if.jdField_do = 107;
        }
        this.jdField_if.jr = 13;
      }
      break;
    case 3: 
      if (this.jdField_if.gn != null) {
        this.jdField_if.e3 = 0;
      }
      break;
    case 4: 
      if (this.a.cZ.a((byte)36) > 0) {
        this.jdField_if.e3 = 1;
      }
      break;
    case 1: 
      if (h.a9 == 0) {
        this.jdField_if.mz = 0;
      }
      break;
    case 2: 
      if (h.a9 == 0) {
        this.jdField_if.mz = 1;
      }
      break;
    }
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte)
  {
    int i = 0;
    byte b = -1;
    int j = 0;
    int k = paramInt1 + 20 + 2;
    switch (paramByte)
    {
    case 2: 
      b = 28;
      j = 0;
      break;
    case 3: 
      b = 30;
      j = 2;
      break;
    case 4: 
      b = 32;
      j = 1;
      break;
    case 5: 
      b = 34;
      j = 3;
    }
    int m = 0;
    if (this.a.jdMethod_new(paramByte))
    {
      m = 1;
      i += this.a.cZ.a(b) * a.t / a.n;
    }
    if (this.a.cZ.hT[j] > 0)
    {
      m = 1;
      i += this.a.cZ.a(b) * this.a.cZ.hT[j] / a.new;
    }
    if (m != 0)
    {
      this.a.a(k, paramInt2, 5, 7, 105, 0, this.a.aH[5], 0);
      k += 7;
      this.a.a(k, paramInt2, i, 20);
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\t.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */