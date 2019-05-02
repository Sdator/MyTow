import javax.microedition.lcdui.Graphics;

public class b
{
  h a;
  g jdField_if;
  
  public b(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void jdMethod_if()
  {
    switch (this.jdField_if.jdField_do)
    {
    case -12: 
      this.jdField_if.E();
      a();
      this.jdField_if.a(s.a(18) + "现在是否充值?", "充值", "返回");
      break;
    case 83: 
      this.jdField_if.E();
      a();
      if (h.cz) {
        this.jdField_if.a("购买该道具花费人民币" + this.jdField_if.hX + "元,确认购买?", "是", "否");
      } else {
        this.jdField_if.a("确定购买?", "是", "否");
      }
      break;
    case 82: 
      this.jdField_if.E();
      a();
      this.a.d9.a();
      break;
    case 102: 
      this.jdField_if.E();
      a();
      this.a.a((h.dU - 50) / 2, (h.fp - 70) / 2 + 20, this.jdField_if.gd, this.jdField_if.c9);
      this.a.x();
      this.a.c();
      break;
    case 71: 
      this.jdField_if.E();
      a();
      if (this.jdField_if.dx > 0) {
        this.a.x();
      }
      this.a.c();
    }
  }
  
  public void a(int paramInt)
  {
    int i;
    switch (this.jdField_if.jdField_do)
    {
    case -12: 
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
          this.jdField_if.e3 = 0;
          this.a.bv = new e(this.a);
          this.a.bv.jdField_do = 71;
          if (h.ek == true) {
            this.jdField_if.jdField_do = -106;
          } else {
            this.jdField_if.jdField_do = -36;
          }
          break;
        case 1: 
          this.jdField_if.jdField_do = 71;
        }
        break;
      }
      break;
    case 83: 
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
          if (this.a.aG.jdMethod_int(6702))
          {
            if (h.cz)
            {
              this.a.aG.jdMethod_do(1);
              this.a.aG.jdMethod_new(this.jdField_if.hr);
              this.a.aG.jdMethod_do(1);
              this.a.aG.jdMethod_if(q.dm);
              this.a.aG.jdMethod_if(q.cs);
            }
            else
            {
              this.a.aG.jdMethod_do(this.jdField_if.dx);
              for (i = 0; i < this.jdField_if.bs[0]; i = (byte)(i + 1)) {
                if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) > 0)
                {
                  this.a.aG.jdMethod_new(this.jdField_if.nl[0][i]);
                  this.a.aG.jdMethod_do(a3.jdMethod_do(this.jdField_if.jv[0][i], 2));
                }
              }
            }
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
          this.jdField_if.bq = ((short[][])null);
          this.jdField_if.ge = ((int[][])null);
          this.jdField_if.lk = ((String[][])null);
          this.jdField_if.lL = null;
          this.a.aI = null;
          break;
        case 1: 
          this.jdField_if.jdField_do = 71;
        }
        break;
      }
      break;
    case 82: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_if.a("只能输入" + this.jdField_if.f4 + "-" + this.jdField_if.hG + "的数.", this.jdField_if.jdField_do, false, 9999);
        break;
      case 0: 
        i = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
        if (a3.jdMethod_do(this.jdField_if.mn, 4) > 0)
        {
          if ((!h.cz) && (this.jdField_if.bO - this.a.i.a() < a3.jdMethod_do(this.jdField_if.mn, 4) * this.jdField_if.lK[0][i]))
          {
            if (h.ek)
            {
              this.jdField_if.a("钱不够啊.", (short)71, false, 9999);
            }
            else
            {
              this.jdField_if.e3 = 0;
              this.jdField_if.jdField_do = -12;
            }
            return;
          }
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0)
          {
            g tmp853_850 = this.jdField_if;
            tmp853_850.dx = ((short)(tmp853_850.dx + 1));
            if (this.a.cZ.a((byte)1, this.jdField_if.nl[0][i]) == -1)
            {
              g tmp893_890 = this.jdField_if;
              tmp893_890.dc = ((byte)(tmp893_890.dc + 1));
            }
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_if.mn, 4), 2));
        }
        else if (a3.jdMethod_do(this.jdField_if.mn, 4) == 0)
        {
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) > 0)
          {
            g tmp969_966 = this.jdField_if;
            tmp969_966.dx = ((short)(tmp969_966.dx - 1));
            if (this.a.cZ.a((byte)1, this.jdField_if.nl[0][i]) == -1)
            {
              g tmp1009_1006 = this.jdField_if;
              tmp1009_1006.dc = ((byte)(tmp1009_1006.dc - 1));
            }
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(0, 2));
        }
        this.jdField_if.jdField_do = 71;
        break;
      case 1: 
        this.jdField_if.jdField_do = 71;
      }
      break;
    case 102: 
      switch (paramInt)
      {
      case 1: 
        g tmp1156_1153 = this.jdField_if;
        tmp1156_1153.gd = ((byte)(tmp1156_1153.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = 0;
        }
        break;
      case 2: 
        g tmp1191_1188 = this.jdField_if;
        tmp1191_1188.gd = ((byte)(tmp1191_1188.gd + 1));
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
        int k;
        switch (this.jdField_if.gd)
        {
        case 0: 
          int j = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
          if (j > this.jdField_if.bs[0] - 1) {
            return;
          }
          if ((h.k(this.jdField_if.nl[0][j]) == 1) && (103 == this.a.jdMethod_try(this.jdField_if.nl[0][j])))
          {
            if (this.a.cZ.a((byte)14) == a.char)
            {
              this.jdField_if.a("等级" + a.t + "级以上才可购买.", this.jdField_if.jdField_do, false, 9999);
              return;
            }
            k = this.a.Q(this.jdField_if.nl[0][j]);
            if (this.a.cZ.a((byte)14) > k)
            {
              this.jdField_if.a("当前级别超过洗点卡使用级别,不能购买.", this.jdField_if.jdField_do, false, 9999);
              return;
            }
          }
          if ((a3.jdMethod_do(this.jdField_if.jv[0][j], 2) == 0) && (this.a.cZ.d((byte)1) - this.jdField_if.dc <= 0) && (this.a.cZ.jdMethod_if(this.jdField_if.nl[0][j]) == 0))
          {
            this.jdField_if.a("再买背包就放不下了.", this.jdField_if.jdField_do, false, 9999);
          }
          else if (ag.dH - this.a.cZ.jdMethod_if(this.jdField_if.nl[0][j]) == 0)
          {
            this.jdField_if.a("该物品在背包里已经满了.", this.jdField_if.jdField_do, false, 9999);
          }
          else if (h.cz)
          {
            this.jdField_if.hr = this.jdField_if.nl[0][j];
            for (k = 0; k < this.jdField_if.bq.length; k++) {
              for (int m = 0; m < this.jdField_if.bq[k].length; m++) {
                if (this.jdField_if.bq[k][m] == this.jdField_if.hr) {
                  this.jdField_if.hX = this.jdField_if.lk[k][m];
                }
              }
            }
            this.jdField_if.e3 = 0;
            this.jdField_if.jdField_do = 83;
          }
          else
          {
            this.a.d9 = new w(this.a, "数量", 0, ag.dH - this.a.cZ.jdMethod_if(this.jdField_if.nl[0][j]), a3.jdMethod_do(this.jdField_if.jv[0][j], 2));
            this.jdField_if.jdField_do = 82;
          }
          break;
        case 1: 
          k = this.jdField_if.nl[this.jdField_if.hC][(this.jdField_if.lY + this.jdField_if.lX * 6)];
          this.a.du = new i(this.a);
          this.a.du.jdField_for = k;
          this.a.du.jdField_do = this.a.jdMethod_do(this.a.i.jdMethod_if(k), h.dU - 10);
          this.a.du.jdField_try = 0;
          this.a.du.jdField_new = 71;
          this.jdField_if.jdField_do = 114;
          break;
        case 2: 
          this.jdField_if.jdField_do = 71;
        }
        break;
      case 7: 
        this.jdField_if.jdField_do = 71;
      }
      break;
    case 71: 
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
        this.jdField_if.jdField_do = 102;
        break;
      case 6: 
        if (this.jdField_if.dx == 0) {
          return;
        }
        this.jdField_if.e3 = 0;
        this.jdField_if.jdField_do = 83;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.a.aI = null;
        this.jdField_if.jdField_do = 2;
      }
      break;
    }
  }
  
  public void a()
  {
    this.a.a((byte)2, 0, 0, g.f5, g.l7, true);
    this.a.a((byte)2, 0, 0, g.f5, g.l7 - 33, false);
    int i = 9;
    int j = 14;
    this.a.i.a(i, j);
    short s = -1;
    if (this.jdField_if.lY + this.jdField_if.lX * 6 < this.jdField_if.bs[0]) {
      s = this.jdField_if.nl[0][(this.jdField_if.lY + this.jdField_if.lX * 6)];
    }
    int k = 3 + 20;
    int m = 3;
    if ((s != -1) && (!h.cz))
    {
      if (h.f5)
      {
        this.a.a(k, m, 12, 12, 0, 0, this.a.aH[10], 0);
        k += 12;
      }
      this.a.a(k, m + 5, this.jdField_if.lK[0][(this.jdField_if.lY + this.jdField_if.lX * 6)], 20);
      if (h.ek) {
        this.a.a(0, m, 12, 12, 12, 0, this.a.aH[10], 0);
      } else {
        this.a.a(0, m, 22, 11, 44, 0, this.a.aH[12], 0);
      }
    }
    this.a.a(k + 54, m, 12, 12, (h.f5 ? 1 : 16) * 12, 0, this.a.aH[10], 0);
    long l = this.jdField_if.bO;
    for (int n = 0; n < this.jdField_if.bs[0]; n = (byte)(n + 1)) {
      if (a3.jdMethod_do(this.jdField_if.jv[0][n], 2) > 0) {
        l -= a3.jdMethod_do(this.jdField_if.jv[0][n], 2) * this.jdField_if.lK[0][n];
      }
    }
    this.a.a(k + 54 + 13, m + 5, l, 20);
    if (g.kj < 8)
    {
      this.a.fj.setColor(0);
      this.a.fj.fillRect(i + g.lQ * 18 + 1, j, 3, 18 * g.kj);
      this.a.fj.setColor(15724527);
      this.a.fj.fillRect(i + g.lQ * 18 + 2, j + this.jdField_if.lX * 18 * g.kj / 8, 1, 18 * g.kj / 8);
    }
    if (this.jdField_if.lX >= g.kj) {
      j -= 18 * g.kj;
    }
    for (n = 0; n < this.jdField_if.bs[0]; n = (byte)(n + 1))
    {
      if (this.jdField_if.lX < g.kj)
      {
        if (n >= g.lQ * g.kj) {
          break;
        }
      }
      else {
        if (n < g.lQ * g.kj) {
          continue;
        }
      }
      if (a3.jdMethod_do(this.jdField_if.jv[0][n], 2) > 0)
      {
        this.a.fj.setColor(h.b2[4][0]);
        this.a.fj.fillRect(i + 18 * (n % 6) + 2, j + 18 * (n / 6) + 2, 15, 18 - 3);
      }
      this.a.a(i + 18 * (n % 6) + 2, j + 18 * (n / 6) + 2, this.jdField_if.nl[0][n]);
      if (a3.jdMethod_do(this.jdField_if.jv[0][n], 2) > 0) {
        this.a.a(i + 18 * (n % 6) + 15 + 2, j + 18 * (n / 6) + 15 + 2, a3.jdMethod_do(this.jdField_if.jv[0][n], 2), 40);
      }
    }
    this.a.i.jdMethod_do(s);
    if ((this.jdField_if.lY >= 0) && (this.jdField_if.lX >= 0) && (this.jdField_if.lY < 6) && (this.jdField_if.lX < 8))
    {
      this.a.fj.setColor(h.b2[4][0]);
      this.a.fj.drawRect(i + this.jdField_if.lY * 18 + this.jdField_if.jdField_int / 3 % 2, j + this.jdField_if.lX * 18 + this.jdField_if.jdField_int / 3 % 2, 18 - 2 * (this.jdField_if.jdField_int / 3 % 2), 18 - 2 * (this.jdField_if.jdField_int / 3 % 2));
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */