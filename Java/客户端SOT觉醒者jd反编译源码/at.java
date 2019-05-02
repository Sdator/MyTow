public class at
{
  h a = null;
  g jdField_if = null;
  
  public at(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a()
  {
    switch (this.jdField_if.jdField_do)
    {
    case -47: 
      this.jdField_if.E();
      this.a.a("兑换活动物品?", -1, (byte)4, false);
      this.a.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.jdField_if.gd, this.jdField_if.c9);
      this.a.x();
      this.a.c();
      break;
    case -46: 
      this.jdField_if.E();
      if (this.a.a("兑换活动物品?", g.gf, (byte)4, false))
      {
        this.jdField_if.gd = 0;
        this.jdField_if.c9 = new String[h.R.length + 1];
        this.jdField_if.c9[0] = "全部兑换";
        for (int i = 0; i < h.R.length; i = (byte)(i + 1))
        {
          this.jdField_if.c9[(i + 1)] = h.R[i];
          if (h.d6[i] > 0) {
            this.jdField_if.c9[(i + 1)] = (h.d6[i] + "个" + this.jdField_if.c9[(i + 1)]);
          }
        }
        this.jdField_if.jdField_do = -47;
      }
      break;
    }
  }
  
  public void a(int paramInt)
  {
    int i;
    switch (this.jdField_if.jdField_do)
    {
    case -48: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_if.e3 = 0;
        break;
      case 2: 
        this.jdField_if.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_if.e3 == 0)
        {
          for (i = 0; i < h.fq.length; i = (byte)(i + 1)) {
            if ((this.jdField_if.gd == 0) || (this.jdField_if.gd - 1 == i))
            {
              j = this.jdField_if.gd;
              if (this.jdField_if.gd == 0) {
                j = (byte)(i + 1);
              }
              if ((h.d6[(j - 1)] > 0) && (h.d6[(j - 1)] > this.a.cZ.jdMethod_if(h.fT[(j - 1)])))
              {
                this.jdField_if.a("背包里" + h.R[(j - 1)] + "需要有" + h.d6[(j - 1)] + "个才能兑换.", (short)0, false, 9999);
                return;
              }
            }
          }
          i = 0;
          for (int j = 0; j < this.a.cZ.gJ[0]; j = (byte)(j + 1)) {
            if ((this.a.jdMethod_try(this.a.cZ.gw[0][j]) == 7) && ((this.jdField_if.gd == 0) || (this.a.cZ.gw[0][j] == h.fT[(this.jdField_if.gd - 1)]))) {
              i = (byte)(i + 1);
            }
          }
          if (i == 0)
          {
            if (this.jdField_if.gd == 0) {
              this.jdField_if.a("背包里没有能兑换的物品.", (short)0, false, 9999);
            } else {
              this.jdField_if.a("背包里没有" + h.R[(this.jdField_if.gd - 1)] + ".", (short)0, false, 9999);
            }
            this.jdField_if.iZ = null;
            return;
          }
          short[] arrayOfShort1 = new short[i];
          short[] arrayOfShort2 = new short[i];
          i = 0;
          if (this.a.aG.jdMethod_int(8202))
          {
            this.a.aG.jdMethod_do(arrayOfShort1.length);
            for (k = 0; k < this.a.cZ.gJ[0]; k = (byte)(k + 1)) {
              if ((this.a.jdMethod_try(this.a.cZ.gw[0][k]) == 7) && ((this.jdField_if.gd == 0) || (this.a.cZ.gw[0][k] == h.fT[(this.jdField_if.gd - 1)])))
              {
                arrayOfShort1[i] = this.a.cZ.gw[0][k];
                int m = this.jdField_if.gd;
                if (this.jdField_if.gd == 0) {
                  for (int n = 0; n < h.fT.length; n = (byte)(n + 1)) {
                    if (h.fT[n] == this.a.cZ.gw[0][k])
                    {
                      m = (byte)(n + 1);
                      break;
                    }
                  }
                }
                if (h.d6[(m - 1)] > 0) {
                  arrayOfShort2[i] = ((short)h.d6[(m - 1)]);
                } else {
                  arrayOfShort2[i] = ((short)(byte)a3.jdMethod_do(this.a.cZ.eX[0][k], 2));
                }
                this.a.aG.jdMethod_new(this.a.cZ.gw[0][k]);
                this.a.aG.jdMethod_do(arrayOfShort2[i]);
                i = (byte)(i + 1);
              }
            }
            this.a.aG.jdMethod_if();
          }
          for (int k = 0; k < i; k = (byte)(k + 1)) {
            this.a.cZ.a((byte)0, arrayOfShort1[k], arrayOfShort2[k], true);
          }
          this.jdField_if.jdField_do = 21;
        }
        else
        {
          this.jdField_if.jdField_do = 0;
          this.jdField_if.iZ = null;
        }
        break;
      }
      break;
    case -47: 
      switch (paramInt)
      {
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
        this.jdField_if.e3 = 0;
        this.jdField_if.jdField_do = -48;
        break;
      case 7: 
        this.jdField_if.c9 = null;
        this.jdField_if.jdField_do = 0;
        this.jdField_if.iZ = null;
        break;
      case 1: 
        g tmp1126_1123 = this.jdField_if;
        tmp1126_1123.gd = ((byte)(tmp1126_1123.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = ((byte)(this.jdField_if.c9.length - 1));
        }
        break;
      case 2: 
        g tmp1171_1168 = this.jdField_if;
        tmp1171_1168.gd = ((byte)(tmp1171_1168.gd + 1));
        if (this.jdField_if.gd > this.jdField_if.c9.length - 1) {
          this.jdField_if.gd = 0;
        }
        break;
      }
      break;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\at.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */