public class aa
{
  h a;
  g jdField_if;
  
  public aa(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(int paramInt)
  {
    int i;
    int j;
    switch (this.jdField_if.jdField_do)
    {
    case 112: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_if.a("只能输入" + this.jdField_if.f4 + "-" + this.jdField_if.hG + "的数.", this.jdField_if.jdField_do, false, 9999);
        break;
      case 0: 
        i = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
        if (a3.jdMethod_do(this.jdField_if.mn, 4) > 0)
        {
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0)
          {
            g tmp222_219 = this.jdField_if;
            tmp222_219.dx = ((short)(tmp222_219.dx + 1));
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_if.mn, 4), 2));
        }
        else if (a3.jdMethod_do(this.jdField_if.mn, 4) == 0)
        {
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) > 0)
          {
            g tmp298_295 = this.jdField_if;
            tmp298_295.dx = ((short)(tmp298_295.dx - 1));
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(0, 2));
        }
        this.jdField_if.jdField_do = 95;
        break;
      case 1: 
        this.jdField_if.jdField_do = 95;
      }
      break;
    case 111: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_if.a("只能输入" + this.jdField_if.f4 + "-" + this.jdField_if.hG + "的数.", this.jdField_if.jdField_do, false, 9999);
        break;
      case 0: 
        i = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
        if (a3.jdMethod_do(this.jdField_if.mn, 4) > 0)
        {
          if (this.jdField_if.bO - this.a.i.a() < a3.jdMethod_do(this.jdField_if.mn, 4) * this.jdField_if.lK[0][i])
          {
            this.jdField_if.a(18, this.jdField_if.jdField_do, false, 9999);
            return;
          }
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0)
          {
            g tmp578_575 = this.jdField_if;
            tmp578_575.dx = ((short)(tmp578_575.dx + 1));
            if (this.a.cZ.a((byte)0, this.jdField_if.nl[0][i]) == -1)
            {
              g tmp618_615 = this.jdField_if;
              tmp618_615.dc = ((byte)(tmp618_615.dc + 1));
            }
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_if.mn, 4), 2));
        }
        else if (a3.jdMethod_do(this.jdField_if.mn, 4) == 0)
        {
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) > 0)
          {
            g tmp694_691 = this.jdField_if;
            tmp694_691.dx = ((short)(tmp694_691.dx - 1));
            if (this.a.cZ.a((byte)0, this.jdField_if.nl[0][i]) == -1)
            {
              g tmp734_731 = this.jdField_if;
              tmp734_731.dc = ((byte)(tmp734_731.dc - 1));
            }
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(0, 2));
        }
        this.jdField_if.jdField_do = 96;
        break;
      case 1: 
        this.jdField_if.jdField_do = 96;
      }
      break;
    case 97: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_if.e3 = 0;
        break;
      case 2: 
        this.jdField_if.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_if.e3)
        {
        case 0: 
          i = 0;
          if (this.jdField_if.hB == 0)
          {
            i = 0;
            for (j = 0; j < this.jdField_if.bs[0]; j = (byte)(j + 1)) {
              if (a3.jdMethod_do(this.jdField_if.jv[0][j], 2) > 0)
              {
                i += a3.jdMethod_do(this.jdField_if.jv[0][j], 2) * this.jdField_if.lK[0][j];
                this.a.cZ.jdMethod_if((byte)0, this.jdField_if.nl[0][j], a3.jdMethod_do(this.jdField_if.jv[0][j], 2));
              }
            }
            this.a.cZ.a(i, false);
            if (this.a.aG.jdMethod_int(6332))
            {
              this.a.aG.jdMethod_do(this.jdField_if.hB);
              if ((this.jdField_if.eC >= 0) && (this.jdField_if.eC != this.a.cZ.fL))
              {
                if ((this.jdField_if.eC == this.a.cZ.ge) && (this.a.cZ.gm == 0)) {
                  this.a.aG.jdMethod_do(0);
                } else {
                  this.a.aG.jdMethod_do(this.jdField_if.hS);
                }
              }
              else {
                this.a.aG.jdMethod_do(0);
              }
              this.a.aG.jdMethod_for(i);
              this.a.aG.jdMethod_do(this.jdField_if.dx);
              for (j = 0; j < this.jdField_if.bs[0]; j = (byte)(j + 1)) {
                if (a3.jdMethod_do(this.jdField_if.jv[0][j], 2) > 0)
                {
                  this.a.aG.jdMethod_new(this.jdField_if.nl[0][j]);
                  this.a.aG.jdMethod_new(this.jdField_if.jv[0][j]);
                }
              }
              this.a.aG.jdMethod_if();
            }
          }
          else
          {
            i = 0;
            for (j = 0; j < this.jdField_if.bs[0]; j = (byte)(j + 1)) {
              if (a3.jdMethod_do(this.jdField_if.jv[0][j], 2) > 0) {
                i += a3.jdMethod_do(this.jdField_if.jv[0][j], 2) * this.jdField_if.lK[0][j];
              }
            }
            if (this.a.aG.jdMethod_int(6332))
            {
              this.a.aG.jdMethod_do(this.jdField_if.hB);
              this.a.aG.jdMethod_do(0);
              this.a.aG.jdMethod_for(i);
              this.a.aG.jdMethod_do(this.jdField_if.dx);
              for (j = 0; j < this.jdField_if.bs[0]; j = (byte)(j + 1)) {
                if (a3.jdMethod_do(this.jdField_if.jv[0][j], 2) > 0)
                {
                  this.a.aG.jdMethod_new(this.jdField_if.nl[0][j]);
                  this.a.aG.jdMethod_new(this.jdField_if.jv[0][j]);
                }
              }
              this.a.aG.jdMethod_if();
            }
          }
          this.a.i.jdMethod_if();
          this.jdField_if.jdField_do = 21;
          break;
        case 1: 
          if (this.jdField_if.hB == 0) {
            this.jdField_if.jdField_do = 96;
          } else {
            this.jdField_if.jdField_do = 95;
          }
          break;
        }
        break;
      }
      break;
    case -27: 
      switch (paramInt)
      {
      case 1: 
        g tmp1664_1661 = this.jdField_if;
        tmp1664_1661.gd = ((byte)(tmp1664_1661.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = 0;
        }
        break;
      case 2: 
        g tmp1699_1696 = this.jdField_if;
        tmp1699_1696.gd = ((byte)(tmp1699_1696.gd + 1));
        if (this.jdField_if.gd > 2) {
          this.jdField_if.gd = 2;
        }
        break;
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.a.jdMethod_do(paramInt, this.jdField_if.c9.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_if.gd = ((byte)i);
        }
        switch (this.jdField_if.gd)
        {
        case 0: 
          j = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
          if (j > this.jdField_if.bs[0] - 1) {
            return;
          }
          if ((a3.jdMethod_do(this.jdField_if.jv[0][j], 2) == 0) && (this.a.cZ.d((byte)0) - this.jdField_if.dc <= 0) && (this.a.cZ.jdMethod_if(this.jdField_if.nl[0][j]) == 0))
          {
            this.jdField_if.a("再买背包就放不下了.", this.jdField_if.jdField_do, false, 9999);
          }
          else if (ag.dH - this.a.cZ.jdMethod_if(this.jdField_if.nl[0][j]) == 0)
          {
            this.jdField_if.a("该物品在背包里已经满了.", this.jdField_if.jdField_do, false, 9999);
          }
          else
          {
            this.a.d9 = new w(this.a, "数量", 0, ag.dH - this.a.cZ.jdMethod_if(this.jdField_if.nl[0][j]), a3.jdMethod_do(this.jdField_if.jv[0][j], 2));
            this.jdField_if.jdField_do = 111;
          }
          break;
        case 1: 
          short s = this.jdField_if.nl[this.jdField_if.hC][(this.jdField_if.lY + this.jdField_if.lX * 6)];
          this.a.du = new i(this.a);
          this.a.du.jdField_for = s;
          this.a.du.jdField_do = this.a.jdMethod_do(this.a.i.jdMethod_if(s), h.dU - 10);
          this.a.du.jdField_try = 0;
          this.a.du.jdField_new = 96;
          this.jdField_if.jdField_do = 114;
          break;
        case 2: 
          this.jdField_if.jdField_do = 96;
        }
        break;
      case 7: 
        this.jdField_if.jdField_do = 96;
      }
      break;
    case 96: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.a.i.jdMethod_do(paramInt);
        break;
      case 5: 
        i = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
        if (i > this.jdField_if.bs[0] - 1) {
          return;
        }
        this.jdField_if.gd = 0;
        this.jdField_if.c9 = new String[] { "购买", "查看", "返回" };
        this.jdField_if.jdField_do = -27;
        break;
      case 6: 
        if (this.jdField_if.dx == 0) {
          return;
        }
        this.jdField_if.e3 = 0;
        this.jdField_if.jdField_do = 97;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.a.as = null;
        this.jdField_if.jdField_do = 0;
      }
      break;
    case 95: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.a.i.jdMethod_do(paramInt);
        break;
      case 5: 
        i = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
        if (i > this.jdField_if.bs[0] - 1) {
          return;
        }
        this.a.d9 = new w(this.a, "数量", 0, this.a.cZ.jdMethod_if(this.jdField_if.nl[0][i]), a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0 ? this.a.cZ.jdMethod_if(this.jdField_if.nl[0][i]) : a3.jdMethod_do(this.jdField_if.jv[0][i], 2));
        this.jdField_if.jdField_do = 112;
        break;
      case 6: 
        if (this.jdField_if.dx == 0) {
          return;
        }
        this.jdField_if.e3 = 0;
        this.jdField_if.jdField_do = 97;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.a.as = null;
        this.jdField_if.jdField_do = 0;
      }
      break;
    }
  }
  
  public void a()
  {
    switch (this.jdField_if.jdField_do)
    {
    case 112: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      this.a.d9.a();
      break;
    case 111: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      this.a.d9.a();
      break;
    case 97: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      this.jdField_if.a("是否结帐?", "是", "否");
      break;
    case -27: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      this.a.a((h.dU - 50) / 2, (h.fp - 70) / 2 + 20, this.jdField_if.gd, this.jdField_if.c9);
      this.a.x();
      this.a.c();
      break;
    case 96: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      if (this.jdField_if.dx > 0) {
        this.a.x();
      }
      this.a.c();
      break;
    case 95: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      if (this.jdField_if.dx > 0) {
        this.a.x();
      }
      this.a.c();
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\aa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */