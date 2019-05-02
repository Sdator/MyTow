import javax.microedition.lcdui.Graphics;

public class am
{
  h a = null;
  g jdField_if = null;
  
  public am(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void jdMethod_if()
  {
    switch (this.jdField_if.jdField_do)
    {
    case -72: 
      this.jdField_if.E();
      this.a.a((byte)2, 0, 0, h.dU, h.fp, false);
      a();
      this.a.a(72, 0, this.jdField_if.gd, g.f1[1]);
      break;
    case -71: 
      a();
      break;
    case -70: 
      this.jdField_if.E();
      if (this.a.a("每个角色最多可习得2个生活技能.提示:技能学习后只可通过遗忘卡清除;生活技能在技能列表中以红色字体置顶显示.", g.gf, (byte)4, false))
      {
        this.jdField_if.lj = new byte[3];
        this.jdField_if.hl = new String[3];
        int i = 0;
        for (int j = 0; j < ag.hC.length; j = (byte)(j + 1)) {
          if (!this.a.cZ.o((byte)(4 + j)))
          {
            this.jdField_if.lj[i] = ((byte)(4 + j));
            this.jdField_if.hl[i] = ag.hC[j];
            i = (byte)(i + 1);
          }
        }
        this.jdField_if.gi = 0;
        this.jdField_if.hZ = 0;
        this.jdField_if.jdField_do = -71;
      }
      break;
    }
  }
  
  public void a()
  {
    this.jdField_if.E();
    this.a.a((byte)2, 0, 0, h.dU, h.fp, true);
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
      else
      {
        this.a.fj.setColor(h.b2[1][1]);
      }
      this.a.fj.drawString(this.jdField_if.hl[(this.jdField_if.gi + m)], j, i + m * (h.eA + 2), 20);
    }
    if (this.jdField_if.hl.length > 0)
    {
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
    case -72: 
      switch (paramInt)
      {
      case 1: 
        g tmp112_109 = this.jdField_if;
        tmp112_109.gd = ((byte)(tmp112_109.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = ((byte)(g.f1[1].length - 1));
        }
        break;
      case 2: 
        g tmp160_157 = this.jdField_if;
        tmp160_157.gd = ((byte)(tmp160_157.gd + 1));
        if (this.jdField_if.gd > g.f1[1].length - 1) {
          this.jdField_if.gd = 0;
        }
        break;
      case 5: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        int i = this.a.jdMethod_do(paramInt, g.f1[1].length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_if.gd = ((byte)i);
        }
        switch (this.jdField_if.gd)
        {
        case 0: 
          this.a.ex = new aj(this.a, this.jdField_if.dF, (byte)-71);
          this.jdField_if.jdField_do = 80;
          break;
        case 1: 
          if (this.a.cZ.a((byte)8) < this.jdField_if.nw)
          {
            this.jdField_if.a(6, (short)-71, false, 9999);
            return;
          }
          this.a.cZ.c(this.jdField_if.dF);
          this.jdField_if.a("学习成功.", (short)0, false, 9999);
          this.a.ct = null;
          break;
        case 2: 
          this.jdField_if.jdField_do = -71;
        }
        break;
      }
      break;
    case -71: 
      switch (paramInt)
      {
      case 1: 
        g tmp460_457 = this.jdField_if;
        tmp460_457.hZ = ((short)(tmp460_457.hZ - 1));
        if (this.jdField_if.hZ < 0)
        {
          this.jdField_if.hZ = 0;
          g tmp492_489 = this.jdField_if;
          tmp492_489.gi = ((short)(tmp492_489.gi - 1));
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
        g tmp558_555 = this.jdField_if;
        tmp558_555.hZ = ((short)(tmp558_555.hZ + 1));
        if (this.jdField_if.hZ > g.iX - 1)
        {
          this.jdField_if.hZ = ((short)(byte)(g.iX - 1));
          g tmp611_608 = this.jdField_if;
          tmp611_608.gi = ((short)(tmp611_608.gi + 1));
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
        this.jdField_if.nw = ((short)(int)h.j(this.jdField_if.lj[(this.jdField_if.gi + this.jdField_if.hZ)]));
        this.jdField_if.jdField_do = -72;
        break;
      case 7: 
        this.jdField_if.lj = null;
        this.jdField_if.hl = null;
        this.jdField_if.mT = null;
        this.jdField_if.jdField_do = 0;
        this.a.ct = null;
      }
      break;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\am.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */