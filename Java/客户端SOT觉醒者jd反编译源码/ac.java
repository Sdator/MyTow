public class ac
{
  h a;
  g jdField_if;
  
  public ac(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
    this.a.cZ.y();
    for (byte b = 0; b < 2; b = (byte)(b + 1)) {
      this.a.i.a(2, b, this.a.cZ.gJ[b], this.a.cZ.gw[b], this.a.cZ.eX[b]);
    }
    short[] arrayOfShort1 = new short[8];
    int i = 0;
    for (int j = 0; j < this.a.cZ.a7.length; j = (byte)(j + 1)) {
      if ((this.a.cZ.a7[j] > -1) && (-1 == this.a.cZ.a((byte)0, this.a.cZ.a7[j])))
      {
        arrayOfShort1[i] = this.a.cZ.a7[j];
        i = (byte)(i + 1);
      }
    }
    short[] arrayOfShort2 = new short[this.a.cZ.gJ[0] + this.a.cZ.gJ[1] + i];
    System.arraycopy(this.a.cZ.gw[0], 0, arrayOfShort2, 0, this.a.cZ.gJ[0]);
    System.arraycopy(this.a.cZ.gw[1], 0, arrayOfShort2, this.a.cZ.gJ[0], this.a.cZ.gJ[1]);
    System.arraycopy(arrayOfShort1, 0, arrayOfShort2, this.a.cZ.gJ[0] + this.a.cZ.gJ[1], i);
    this.a.i.a(arrayOfShort2, true);
    this.jdField_if.fE = -1;
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    int i;
    short s1;
    switch (this.jdField_if.jdField_do)
    {
    case 45: 
      switch (paramInt)
      {
      case 1: 
        g tmp144_141 = this.jdField_if;
        tmp144_141.gd = ((byte)(tmp144_141.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = ((byte)(this.jdField_if.i3.length - 1));
        }
        break;
      case 2: 
        g tmp189_186 = this.jdField_if;
        tmp189_186.gd = ((byte)(tmp189_186.gd + 1));
        if (this.jdField_if.gd > this.jdField_if.i3.length - 1) {
          this.jdField_if.gd = 0;
        }
        break;
      case 5: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.a.jdMethod_do(paramInt, this.jdField_if.i3.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_if.gd = ((byte)i);
        }
        switch (this.jdField_if.gd)
        {
        case 0: 
        case 1: 
        case 2: 
        case 3: 
          this.a.cZ.jdMethod_if(this.jdField_if.gd, this.jdField_if.nl[this.jdField_if.hC][(this.jdField_if.lY + this.jdField_if.lX * 6)], (byte)a.char);
          this.jdField_if.jdField_do = 30;
          break;
        case 4: 
          this.jdField_if.jdField_do = 30;
        }
        break;
      }
      break;
    case 33: 
      switch (paramInt)
      {
      case 1: 
        g tmp468_465 = this.jdField_if;
        tmp468_465.gd = ((byte)(tmp468_465.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = ((byte)(this.jdField_if.i3.length - 1));
        }
        break;
      case 2: 
        g tmp513_510 = this.jdField_if;
        tmp513_510.gd = ((byte)(tmp513_510.gd + 1));
        if (this.jdField_if.gd > this.jdField_if.i3.length - 1) {
          this.jdField_if.gd = 0;
        }
        break;
      case 5: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.a.jdMethod_do(paramInt, this.jdField_if.i3.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_if.gd = ((byte)i);
        }
        s1 = this.jdField_if.nl[this.jdField_if.hC][(this.jdField_if.lY + this.jdField_if.lX * 6)];
        if (this.jdField_if.hC == 1) {
          switch (this.jdField_if.gd)
          {
          case 0: 
            this.a.du = new i(this.a);
            this.a.du.jdField_for = s1;
            this.a.du.jdField_do = this.a.jdMethod_do(this.a.i.jdMethod_if(s1), h.dU - 10);
            this.a.du.jdField_try = 0;
            this.a.du.jdField_new = 30;
            this.jdField_if.jdField_do = 114;
            break;
          case 1: 
            this.a.cJ.a(s1, true);
            this.a.jdMethod_if(s1, false);
            this.a.cJ.a(s1, false);
            break;
          case 2: 
            this.jdField_if.e3 = 0;
            this.jdField_if.jdField_do = 18;
            break;
          case 3: 
            this.jdField_if.jdField_do = 30;
          }
        } else if (0 == h.k(s1)) {
          switch (this.jdField_if.gd)
          {
          case 0: 
            this.a.du = new i(this.a);
            this.a.du.jdField_for = s1;
            this.a.du.jdField_do = this.a.jdMethod_do(this.a.i.jdMethod_if(s1), h.dU - 10);
            this.a.du.jdField_try = 0;
            this.a.du.jdField_new = 30;
            this.jdField_if.jdField_do = 114;
            break;
          case 1: 
            byte b1 = this.jdField_if.lY;
            byte b2 = this.jdField_if.lX;
            short s2 = (short)a3.jdMethod_int(this.a.cZ.H[h.G(s1)], a.C);
            switch (this.a.cZ.a(s1))
            {
            case -1: 
              this.jdField_if.a("背包没有空间放当前该装备位上的装备.", (short)30, false, 9999);
              return;
            case -2: 
              this.jdField_if.a(19, (short)30, false, 9999);
              return;
            case -3: 
              this.jdField_if.a(20, (short)30, false, 9999);
              return;
            case -4: 
              this.jdField_if.a("无法装备.", (short)30, false, 9999);
              return;
            case -5: 
              this.jdField_if.a(21, (short)30, false, 9999);
              return;
            case -6: 
              this.jdField_if.a(22, (short)30, false, 9999);
              return;
            case 0: 
              this.a.cZ.y();
              for (byte b3 = 0; b3 < 2; b3 = (byte)(b3 + 1)) {
                this.a.i.a(2, b3, this.a.cZ.gJ[b3], this.a.cZ.gw[b3], this.a.cZ.eX[b3]);
              }
              this.jdField_if.lY = b1;
              this.jdField_if.lX = b2;
              String str2 = null;
              if (h.o(s1))
              {
                str2 = "换装成功.";
              }
              else
              {
                String[] arrayOfString = h.a8;
                int j = h.q(s1);
                if (s2 == s1)
                {
                  if (j != 4) {
                    str2 = arrayOfString[j] + "提高" + a.ac + "";
                  } else {
                    str2 = arrayOfString[0] + "提高" + a.ac + "" + arrayOfString[2] + "提高" + a.ac + "";
                  }
                }
                else
                {
                  int k;
                  if (s2 == -1)
                  {
                    k = h.jdMethod_void(s1);
                    if (j != 4) {
                      str2 = arrayOfString[j] + "提高" + k;
                    } else {
                      str2 = arrayOfString[0] + "提高" + k + " " + arrayOfString[2] + "提高" + k;
                    }
                  }
                  else if (h.G(s1) == 0)
                  {
                    k = 0;
                    int m = 0;
                    int n = h.q(s2);
                    int i1 = h.jdMethod_void(s2);
                    if (n == 4)
                    {
                      k = i1;
                      m = i1;
                    }
                    else if (n == 0)
                    {
                      k = i1;
                    }
                    else
                    {
                      m = i1;
                    }
                    int i2 = h.jdMethod_void(s1);
                    if (j == 4)
                    {
                      k = i2 - k;
                      m = i2 - m;
                    }
                    else if (j == 0)
                    {
                      k = i2 - k;
                      m = 0 - m;
                    }
                    else
                    {
                      k = 0 - k;
                      m = i2 - m;
                    }
                    str2 = "";
                    if (k >= 0) {
                      str2 = str2 + arrayOfString[0] + "提高" + k;
                    } else if (k < 0) {
                      str2 = str2 + arrayOfString[0] + "减少" + -k;
                    }
                    if (str2.length() > 0) {
                      str2 = str2 + " ";
                    }
                    if (m >= 0) {
                      str2 = str2 + arrayOfString[2] + "提高" + m;
                    } else if (m < 0) {
                      str2 = str2 + arrayOfString[2] + "减少" + -m;
                    }
                  }
                  else
                  {
                    k = 0;
                    if ((k = h.jdMethod_void(s1) - h.jdMethod_void(s2)) >= 0) {
                      str2 = arrayOfString[h.q(s1)] + "提高" + k;
                    } else {
                      str2 = arrayOfString[h.q(s1)] + "减少" + -k;
                    }
                  }
                }
              }
              this.jdField_if.a(str2, (short)30, false, 9999);
            }
            break;
          case 2: 
            this.jdField_if.e3 = 0;
            this.jdField_if.jdField_do = -45;
            break;
          case 3: 
            this.jdField_if.jdField_do = 30;
          }
        } else {
          switch (this.jdField_if.gd)
          {
          case 0: 
            this.a.du = new i(this.a);
            this.a.du.jdField_for = s1;
            this.a.du.jdField_do = this.a.jdMethod_do(this.a.i.jdMethod_if(s1), h.dU - 10);
            this.a.du.jdField_try = 0;
            this.a.du.jdField_new = 30;
            this.jdField_if.jdField_do = 114;
            break;
          case 1: 
            if (this.jdField_if.hC == 0) {
              if (this.a.jdMethod_try(s1) == 3)
              {
                this.a.cJ.a(s1, true);
                this.a.jdMethod_for(s1);
                this.a.cJ.a(s1, false);
              }
              else
              {
                this.a.cJ.a(s1, true);
                if (this.a.jdMethod_for(s1))
                {
                  this.a.cJ.a(s1, false);
                  this.a.i.jdMethod_if(this.jdField_if.hC, s1, (byte)1);
                }
                this.jdField_if.a(this.a.be, (short)30, false, 9999);
              }
            }
            break;
          case 2: 
            this.jdField_if.gd = ((byte)a.ac);
            this.jdField_if.i3 = new String[] { "数字" + a.char, "数字" + a.i, "数字" + a.e, "数字" + a.null, "返回" };
            this.jdField_if.jdField_do = 45;
            break;
          case 3: 
            this.jdField_if.e3 = 0;
            this.jdField_if.jdField_do = -45;
            break;
          case 4: 
            this.jdField_if.jdField_do = 30;
          }
        }
        break;
      }
      break;
    case 32: 
      switch (paramInt)
      {
      case 1: 
        g tmp2616_2613 = this.jdField_if;
        tmp2616_2613.gd = ((byte)(tmp2616_2613.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = ((byte)(this.jdField_if.i3.length - 1));
        }
        break;
      case 2: 
        g tmp2661_2658 = this.jdField_if;
        tmp2661_2658.gd = ((byte)(tmp2661_2658.gd + 1));
        if (this.jdField_if.gd > this.jdField_if.i3.length - 1) {
          this.jdField_if.gd = 0;
        }
        break;
      case 5: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.a.jdMethod_do(paramInt, this.jdField_if.i3.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_if.gd = ((byte)i);
        }
        if ((this.a.cZ.a7[this.jdField_if.gp] == -1) && (this.jdField_if.gd == 0)) {
          this.jdField_if.a("本装备位上没有装备,建议你选择\"匹配\"选项查找合适的装备.", (short)31, false, 9999);
        } else if (this.a.cZ.a7[this.jdField_if.gp] != -1) {
          switch (this.jdField_if.gd)
          {
          case 0: 
            this.a.du = new i(this.a);
            this.a.du.jdField_for = ((short)a3.jdMethod_int(this.a.cZ.H[this.jdField_if.gp], a.C));
            this.a.du.jdField_do = this.a.jdMethod_do(this.a.i.jdMethod_if(this.a.du.jdField_for), h.dU - 10);
            this.a.du.jdField_try = 0;
            this.a.du.jdField_new = 31;
            this.jdField_if.jdField_do = 114;
            break;
          case 1: 
            if (this.a.cZ.fc[this.jdField_if.gp] == 0)
            {
              s1 = this.a.cZ.a7[this.jdField_if.gp];
              if (h.j(s1) >= 3)
              {
                this.jdField_if.e3 = 0;
                this.jdField_if.jdField_do = -50;
                return;
              }
              if (!this.a.cZ.h(this.jdField_if.gp))
              {
                this.jdField_if.a("背包没有空间存放该装备.", (short)31, false, 9999);
              }
              else
              {
                this.a.i.a((byte)0, s1, (byte)1);
                this.jdField_if.jdField_do = 31;
              }
            }
            else if (h.j(this.a.cZ.a7[this.jdField_if.gp]) >= 3)
            {
              this.jdField_if.a(24, (short)31, false, 9999);
            }
            else
            {
              this.jdField_if.a(25, (short)31, false, 9999);
            }
            break;
          case 2: 
            if (this.jdField_if.gp == 7)
            {
              this.jdField_if.a("该装备位不能锁定.", (short)31, false, 9999);
              return;
            }
            if (this.a.cZ.fc[this.jdField_if.gp] == 0)
            {
              if (h.jdMethod_do(this.a.cZ.a7[this.jdField_if.gp]) > 0)
              {
                if ((!h.v(this.a.cZ.a7[this.jdField_if.gp])) && (this.a.cZ.J() >= h.c3))
                {
                  this.jdField_if.a("锁定失败,最多拥有" + h.c3 + "件合成装备.", (short)31, false, 9999);
                }
                else
                {
                  if (this.a.aG.jdMethod_int(4301))
                  {
                    this.a.aG.jdMethod_do(this.jdField_if.gp);
                    this.a.aG.jdMethod_new(this.a.cZ.a7[this.jdField_if.gp]);
                    this.a.aG.jdMethod_if();
                  }
                  this.jdField_if.jdField_do = 21;
                }
              }
              else {
                this.jdField_if.a(23, (short)31, false, 9999);
              }
            }
            else
            {
              if (this.a.aG.jdMethod_int(4302))
              {
                this.a.aG.jdMethod_do(this.jdField_if.gp);
                this.a.aG.jdMethod_new(this.a.cZ.a7[this.jdField_if.gp]);
                this.a.aG.jdMethod_if();
              }
              this.jdField_if.jdField_do = 21;
            }
            break;
          case 3: 
            if (this.jdField_if.gp == 7)
            {
              this.jdField_if.a("该装备位不能合成.", (short)31, false, 9999);
              return;
            }
            this.a.jdMethod_do(this.jdField_if.gp);
            break;
          case 4: 
            this.jdField_if.jdField_do = 31;
          }
        } else {
          switch (this.jdField_if.gd)
          {
          case 1: 
            this.jdField_if.fE = this.jdField_if.gp;
            this.jdField_if.jdField_do = 31;
            break;
          case 2: 
            this.jdField_if.jdField_do = 31;
          }
        }
        break;
      }
      break;
    case 31: 
      switch (paramInt)
      {
      case 4: 
        g tmp3712_3709 = this.jdField_if;
        tmp3712_3709.gp = ((byte)(tmp3712_3709.gp + 1));
        if (this.jdField_if.gp > this.a.cZ.a7.length - 1) {
          this.jdField_if.gp = 0;
        }
        break;
      case 3: 
        g tmp3760_3757 = this.jdField_if;
        tmp3760_3757.gp = ((byte)(tmp3760_3757.gp - 1));
        if (this.jdField_if.gp < 0) {
          this.jdField_if.gp = ((byte)(this.a.cZ.a7.length - 1));
        }
        break;
      case 2: 
        this.jdField_if.lY = ((byte)Math.min(this.jdField_if.gp, 5));
        this.jdField_if.jdField_do = 30;
        break;
      case 5: 
        if (this.a.cZ.a8) {
          return;
        }
        if (this.a.cZ.a7[this.jdField_if.gp] != -1)
        {
          String str1 = "卸下";
          if (h.j(this.a.cZ.a7[this.jdField_if.gp]) >= 3) {
            str1 = "丢弃";
          }
          this.jdField_if.gd = 0;
          this.jdField_if.i3 = new String[] { "说明", str1, this.a.cZ.fc[this.jdField_if.gp] != 0 ? "解锁" : "锁定", "合成", "返回" };
          this.jdField_if.jdField_do = 32;
        }
        else
        {
          this.jdField_if.gd = 0;
          this.jdField_if.i3 = new String[] { "说明", "匹配", "返回" };
          this.jdField_if.jdField_do = 32;
        }
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.a.br = null;
        this.jdField_if.jdField_do = 0;
      }
      break;
    case 30: 
      switch (paramInt)
      {
      case 1: 
        g tmp4112_4109 = this.jdField_if;
        tmp4112_4109.lX = ((byte)(tmp4112_4109.lX - 1));
        if (this.jdField_if.lX < 0)
        {
          this.jdField_if.lX = 0;
          if (this.jdField_if.hC == 0)
          {
            this.jdField_if.gp = this.jdField_if.lY;
            this.jdField_if.jdField_do = 31;
          }
        }
        break;
      case 4: 
        g tmp4180_4177 = this.jdField_if;
        tmp4180_4177.lY = ((byte)(tmp4180_4177.lY + 1));
        if ((this.jdField_if.lY > 5) && (this.jdField_if.hC == 0)) {
          if (h.ek)
          {
            if (this.a.cZ.fY > 0)
            {
              if (this.a.cZ.fY < 7)
              {
                this.jdField_if.lY = 0;
                this.jdField_if.hC = 1;
                this.jdField_if.a("您的VIP权限即将到期,VIP权限到期后,将关闭现金背包(无法在现金背包中存取物品),为避免造成不便,请及时补充VIP权限.", (short)30, false, 9999);
              }
              else
              {
                this.jdField_if.lY = 0;
                this.jdField_if.hC = 1;
              }
            }
            else
            {
              this.jdField_if.bH = true;
              g.gf = 0;
              this.jdField_if.e3 = 0;
              this.jdField_if.jdField_do = -123;
            }
          }
          else
          {
            this.jdField_if.lY = 0;
            this.jdField_if.hC = 1;
          }
        }
        break;
      case 3: 
        g tmp4358_4355 = this.jdField_if;
        tmp4358_4355.lY = ((byte)(tmp4358_4355.lY - 1));
        if (this.jdField_if.lY < 0) {
          if (this.jdField_if.hC == 1)
          {
            this.jdField_if.lY = 5;
            this.jdField_if.hC = 0;
          }
          else
          {
            this.jdField_if.lY = 0;
          }
        }
        break;
      case 2: 
        g tmp4423_4420 = this.jdField_if;
        tmp4423_4420.lX = ((byte)(tmp4423_4420.lX + 1));
        if (this.jdField_if.lX >= 8) {
          this.jdField_if.lX = 7;
        }
        break;
      case 5: 
      case 6: 
        if (this.a.cZ.a8) {
          return;
        }
        if (this.jdField_if.lY + this.jdField_if.lX * 6 > this.jdField_if.bs[this.jdField_if.hC] - 1) {
          return;
        }
        if (this.jdField_if.hC == 1) {
          this.jdField_if.i3 = new String[] { "说明", "使用", "丢弃", "返回" };
        } else if (0 == h.k(this.jdField_if.nl[this.jdField_if.hC][(this.jdField_if.lY + this.jdField_if.lX * 6)])) {
          this.jdField_if.i3 = new String[] { "说明", "装备", "丢弃", "返回" };
        } else {
          this.jdField_if.i3 = new String[] { "说明", "使用", "配置", "丢弃", "返回" };
        }
        this.jdField_if.gd = 0;
        this.jdField_if.jdField_do = 33;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.a.br = null;
        this.jdField_if.jdField_do = 0;
      }
      break;
    }
  }
  
  public void a()
  {
    switch (this.jdField_if.jdField_do)
    {
    case 32: 
    case 45: 
      this.jdField_if.E();
      this.a.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.a.i.jdMethod_do(this.jdField_if.jdField_do == 45);
      this.a.a(82, 5, this.jdField_if.gd, this.jdField_if.i3);
      this.a.x();
      this.a.c();
      break;
    case 31: 
      this.jdField_if.E();
      this.a.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.a.i.jdMethod_do(false);
      this.a.x();
      this.a.c();
      break;
    case 30: 
    case 33: 
      this.jdField_if.E();
      this.a.a((byte)2, 0, 0, h.dU, h.fp, false);
      this.a.i.jdMethod_do(true);
      if (this.jdField_if.jdField_do == 33) {
        this.a.a(g.f5 - 46, 5, this.jdField_if.gd, this.jdField_if.i3);
      }
      this.a.x();
      this.a.c();
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ac.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */