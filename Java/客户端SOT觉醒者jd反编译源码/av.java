import java.io.DataInputStream;

public class av
{
  h a = null;
  g jdField_if = null;
  byte jdField_do;
  String[] jdField_for = null;
  
  public av(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
    this.jdField_for = new String[] { "存入", "取出", "返回" };
  }
  
  public void a(int paramInt)
  {
    int i;
    int j;
    switch (this.jdField_if.jdField_do)
    {
    case -9: 
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
          if (this.a.aG.jdMethod_int(6563))
          {
            this.a.aG.jdMethod_do(this.jdField_if.dx);
            for (i = 0; i < this.jdField_if.nc; i = (byte)(i + 1)) {
              for (j = 0; j < this.jdField_if.bs[i]; j = (byte)(j + 1)) {
                if (a3.jdMethod_do(this.jdField_if.jv[i][j], 2) > 0)
                {
                  this.a.aG.jdMethod_new(this.jdField_if.nl[i][j]);
                  this.a.aG.jdMethod_new(this.jdField_if.jv[i][j]);
                }
              }
            }
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
          break;
        case 1: 
          this.jdField_if.jdField_do = 48;
        }
        break;
      }
      break;
    case 126: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_if.a("只能输入" + this.jdField_if.f4 + "-" + this.jdField_if.hG + "的数.", this.jdField_if.jdField_do, false, 9999);
        break;
      case 0: 
        i = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
        if (a3.jdMethod_do(this.jdField_if.mn, 4) == 0)
        {
          if (a3.jdMethod_do(this.jdField_if.jv[this.jdField_if.hC][i], 2) > 0)
          {
            g tmp517_514 = this.jdField_if;
            tmp517_514.dx = ((short)(tmp517_514.dx - 1));
            if (this.a.cZ.jdMethod_if(this.jdField_if.nl[this.jdField_if.hC][i]) == 0)
            {
              g tmp561_558 = this.jdField_if;
              tmp561_558.dc = ((byte)(tmp561_558.dc - 1));
            }
          }
          this.jdField_if.jv[this.jdField_if.hC][i] = ((short)a3.jdMethod_new(0, 2));
          this.jdField_if.jdField_do = 48;
        }
        else
        {
          if (a3.jdMethod_do(this.jdField_if.jv[this.jdField_if.hC][i], 2) == 0)
          {
            g tmp639_636 = this.jdField_if;
            tmp639_636.dx = ((short)(tmp639_636.dx + 1));
            if (this.a.cZ.jdMethod_if(this.jdField_if.nl[this.jdField_if.hC][i]) == 0)
            {
              g tmp683_680 = this.jdField_if;
              tmp683_680.dc = ((byte)(tmp683_680.dc + 1));
            }
          }
          this.jdField_if.jv[this.jdField_if.hC][i] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_if.mn, 4), 2));
          this.jdField_if.jdField_do = 48;
        }
        break;
      case 1: 
        this.jdField_if.jdField_do = 48;
      }
      break;
    case 48: 
      switch (paramInt)
      {
      case 1: 
        g tmp808_805 = this.jdField_if;
        tmp808_805.lX = ((byte)(tmp808_805.lX - 1));
        if (this.jdField_if.lX < 0) {
          this.jdField_if.lX = 0;
        }
        break;
      case 4: 
        g tmp843_840 = this.jdField_if;
        tmp843_840.lY = ((byte)(tmp843_840.lY + 1));
        if (this.jdField_if.lY > 6 - 1)
        {
          g tmp876_873 = this.jdField_if;
          tmp876_873.hC = ((byte)(tmp876_873.hC + 1));
          this.jdField_if.lY = 0;
          if (this.jdField_if.hC > this.jdField_if.nc - 1)
          {
            this.jdField_if.hC = ((byte)(this.jdField_if.nc - 1));
            this.jdField_if.lY = ((byte)(6 - 1));
          }
        }
        break;
      case 3: 
        g tmp954_951 = this.jdField_if;
        tmp954_951.lY = ((byte)(tmp954_951.lY - 1));
        if (this.jdField_if.lY < 0)
        {
          g tmp978_975 = this.jdField_if;
          tmp978_975.hC = ((byte)(tmp978_975.hC - 1));
          this.jdField_if.lY = ((byte)(6 - 1));
          if (this.jdField_if.hC < 0)
          {
            this.jdField_if.hC = 0;
            this.jdField_if.lY = 0;
          }
        }
        break;
      case 2: 
        g tmp1038_1035 = this.jdField_if;
        tmp1038_1035.lX = ((byte)(tmp1038_1035.lX + 1));
        if (this.jdField_if.lX >= 8) {
          this.jdField_if.lX = ((byte)(8 - 1));
        }
        break;
      case 5: 
        i = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
        if (i > this.jdField_if.bs[this.jdField_if.hC] - 1) {
          return;
        }
        j = (short)(ag.dH - this.a.cZ.jdMethod_if(this.jdField_if.nl[this.jdField_if.hC][i]));
        j = (short)Math.min(j, a(this.jdField_if.nl[this.jdField_if.hC][i]));
        if (j == 0)
        {
          this.jdField_if.a("背包里该物品已满.", (short)48, false, 9999);
        }
        else if ((a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0) && (this.a.cZ.d((byte)0) - this.jdField_if.dc <= 0) && (this.a.cZ.jdMethod_if(this.jdField_if.nl[0][i]) == 0))
        {
          this.jdField_if.a("背包放不下了.", this.jdField_if.jdField_do, false, 9999);
        }
        else
        {
          this.a.d9 = new w(this.a, "数量", 0, j, a3.jdMethod_do(this.jdField_if.jv[0][i], 2) > 0 ? a3.jdMethod_do(this.jdField_if.jv[0][i], 2) : j);
          this.jdField_if.jdField_do = 126;
        }
        break;
      case 6: 
        if (this.jdField_if.dx == 0) {
          return;
        }
        this.jdField_if.e3 = 0;
        this.jdField_if.jdField_do = -9;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.jdField_if.jdField_do = 0;
        this.a.e0 = null;
      }
      break;
    case 66: 
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
          if (this.a.aG.jdMethod_int(6562))
          {
            this.a.aG.jdMethod_do(this.jdField_if.dx);
            for (i = 0; i < this.jdField_if.bs[0]; i = (byte)(i + 1)) {
              if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) > 0)
              {
                this.a.aG.jdMethod_new(this.jdField_if.nl[0][i]);
                this.a.aG.jdMethod_new(this.jdField_if.jv[0][i]);
              }
            }
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
          break;
        case 1: 
          this.jdField_if.jdField_do = 49;
        }
        break;
      }
      break;
    case 54: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_if.a("只能输入" + this.jdField_if.f4 + "-" + this.jdField_if.hG + "的数.", this.jdField_if.jdField_do, false, 9999);
        break;
      case 0: 
        i = (byte)(this.jdField_if.lY + this.jdField_if.lX * 6);
        if (a3.jdMethod_do(this.jdField_if.mn, 4) == 0)
        {
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) > 0)
          {
            g tmp1867_1864 = this.jdField_if;
            tmp1867_1864.dx = ((short)(tmp1867_1864.dx - 1));
            if (a(this.jdField_if.nl[0][i]) == 0)
            {
              g tmp1899_1896 = this.jdField_if;
              tmp1899_1896.dc = ((byte)(tmp1899_1896.dc - 1));
            }
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(0, 2));
          this.jdField_if.jdField_do = 49;
        }
        else
        {
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0)
          {
            g tmp1965_1962 = this.jdField_if;
            tmp1965_1962.dx = ((short)(tmp1965_1962.dx + 1));
            if (a(this.jdField_if.nl[0][i]) == 0)
            {
              g tmp1997_1994 = this.jdField_if;
              tmp1997_1994.dc = ((byte)(tmp1997_1994.dc + 1));
            }
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_if.mn, 4), 2));
          this.jdField_if.jdField_do = 49;
        }
        break;
      case 1: 
        this.jdField_if.jdField_do = 49;
      }
      break;
    case 49: 
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
        j = (short)(ag.dH - a(this.jdField_if.nl[0][i]));
        j = (short)Math.min(j, this.a.cZ.jdMethod_if(this.jdField_if.nl[0][i]));
        if (j == 0)
        {
          this.jdField_if.a("仓库里该物品已满.", this.jdField_if.jdField_do, false, 9999);
        }
        else if ((a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0) && (jdMethod_if() - this.jdField_if.dc <= 0) && (a(this.jdField_if.nl[0][i]) == 0))
        {
          this.jdField_if.a("仓库放不下该物品了.", this.jdField_if.jdField_do, false, 9999);
        }
        else
        {
          this.a.d9 = new w(this.a, "数量", 0, j, a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0 ? j : a3.jdMethod_do(this.jdField_if.jv[0][i], 2));
          this.jdField_if.jdField_do = 54;
        }
        break;
      case 6: 
        if (this.jdField_if.dx == 0) {
          return;
        }
        this.jdField_if.e3 = 0;
        this.jdField_if.jdField_do = 66;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.jdField_if.jdField_do = 0;
        this.a.e0 = null;
      }
      break;
    case 47: 
      switch (paramInt)
      {
      case 1: 
        g tmp2548_2545 = this.jdField_if;
        tmp2548_2545.gd = ((byte)(tmp2548_2545.gd - 1));
        if (this.jdField_if.gd < 0) {
          this.jdField_if.gd = ((byte)(this.jdField_for.length - 1));
        }
        break;
      case 2: 
        g tmp2590_2587 = this.jdField_if;
        tmp2590_2587.gd = ((byte)(tmp2590_2587.gd + 1));
        if (this.jdField_if.gd > this.jdField_for.length - 1) {
          this.jdField_if.gd = 0;
        }
        break;
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.a.jdMethod_do(paramInt, this.jdField_for.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_if.gd = ((byte)i);
        }
        if (this.jdField_if.gd < 2)
        {
          a(this.jdField_if.gd);
        }
        else
        {
          this.jdField_if.jdField_do = 0;
          this.a.e0 = null;
        }
        this.jdField_for = null;
      }
      break;
    }
  }
  
  public void jdMethod_if(short paramShort)
  {
    switch (paramShort)
    {
    case -9: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      this.jdField_if.a("确定从仓库取出?", "是", "否");
      break;
    case 126: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      this.a.d9.a();
      break;
    case 48: 
      this.jdField_if.E();
      this.a.jdMethod_long();
      if (this.jdField_if.dx > 0) {
        this.a.x();
      }
      this.a.c();
      break;
    case 66: 
      this.jdField_if.E();
      this.a.s();
      this.jdField_if.a("确定存入仓库?", "是", "否");
      break;
    case 54: 
      this.jdField_if.E();
      this.a.s();
      this.a.d9.a();
      break;
    case 49: 
      this.jdField_if.E();
      this.a.s();
      if (this.jdField_if.dx > 0) {
        this.a.x();
      }
      this.a.c();
      break;
    case 47: 
      this.jdField_if.E();
      this.a.a("选择仓库操作?", -1, (byte)4, false);
      this.a.a((h.dU - 50) / 2, (h.fp - 70) / 2 + 20, this.jdField_if.gd, this.jdField_for);
    }
  }
  
  public void a(byte paramByte)
  {
    if (this.jdField_if.bN)
    {
      this.jdField_do = paramByte;
      this.jdField_if.jdField_do = 21;
      if (this.a.aG.jdMethod_int(6561))
      {
        this.a.aG.jdMethod_if(this.a.cZ.O);
        this.a.aG.jdMethod_if();
      }
      return;
    }
    this.jdField_if.dc = 0;
    byte b1;
    if (paramByte == 0)
    {
      this.a.cZ.y();
      b1 = 0;
      short[] arrayOfShort1 = null;
      for (int k = 0; k < 2; k = (byte)(k + 1))
      {
        b1 = 0;
        for (int m = 0; m < this.a.cZ.gJ[0]; m = (byte)(m + 1)) {
          if ((!h.v(this.a.cZ.gw[0][m])) && (!h.o(this.a.cZ.gw[0][m])))
          {
            if (k == 1) {
              arrayOfShort1[b1] = this.a.cZ.gw[0][m];
            }
            b1 = (byte)(b1 + 1);
          }
        }
        if (k == 0) {
          arrayOfShort1 = new short[b1];
        }
      }
      this.a.i.a(1, (byte)0, b1, arrayOfShort1, new short[arrayOfShort1.length]);
      short[] arrayOfShort3 = new short[this.a.cZ.gJ[0]];
      System.arraycopy(this.a.cZ.gw[0], 0, arrayOfShort3, 0, this.a.cZ.gJ[0]);
      this.a.i.a(arrayOfShort3, true);
      this.jdField_if.jdField_do = 49;
    }
    else if (paramByte == 1)
    {
      this.jdField_if.nl = ((short[][])null);
      b1 = (byte)(this.jdField_if.dI / ag.eK);
      if (b1 * ag.eK < this.jdField_if.dI) {
        b1 = (byte)(b1 + 1);
      }
      int i;
      if (b1 == 0)
      {
        for (i = 0; i < this.jdField_if.nc; i = (byte)(i + 1)) {
          this.a.i.a(this.jdField_if.nc, i, (byte)0, new short[0], new short[0]);
        }
      }
      else
      {
        int j;
        for (i = 0; i < b1; j = (byte)(i + 1))
        {
          byte b2 = 0;
          short[] arrayOfShort4 = null;
          short[] arrayOfShort5 = null;
          if (i < b1 - 1) {
            b2 = ag.eK;
          } else {
            b2 = (byte)(this.jdField_if.dI - ag.eK * i);
          }
          arrayOfShort4 = new short[b2];
          arrayOfShort5 = new short[b2];
          System.arraycopy(this.jdField_if.gK, i * ag.eK, arrayOfShort4, 0, b2);
          System.arraycopy(this.jdField_if.cD, i * ag.eK, arrayOfShort5, 0, b2);
          this.a.i.a(this.jdField_if.nc, i, b2, arrayOfShort4, new short[b2]);
          for (int n = 0; n < this.jdField_if.bs[i]; n = (byte)(n + 1)) {
            this.jdField_if.ev[i][n] = arrayOfShort5[n];
          }
        }
      }
      short[] arrayOfShort2 = new short[this.jdField_if.dI];
      System.arraycopy(this.jdField_if.gK, 0, arrayOfShort2, 0, this.jdField_if.dI);
      this.a.i.a(arrayOfShort2, true);
      this.jdField_if.jdField_do = 48;
      this.jdField_if.bO = this.a.cZ.a((byte)0);
    }
  }
  
  public void a(DataInputStream paramDataInputStream)
  {
    try
    {
      this.jdField_if.nc = paramDataInputStream.readByte();
      this.jdField_if.dI = paramDataInputStream.readShort();
      this.jdField_if.gK = new short[this.jdField_if.dI];
      this.jdField_if.cD = new short[this.jdField_if.dI];
      for (int i = 0; i < this.jdField_if.dI; i = (short)(i + 1))
      {
        this.jdField_if.gK[i] = paramDataInputStream.readShort();
        this.jdField_if.cD[i] = ((short)a3.jdMethod_new(paramDataInputStream.readByte(), 2));
      }
      a();
    }
    catch (Exception localException) {}
  }
  
  public void a()
  {
    for (int i = 0; i < this.jdField_if.dI - 1; i = (short)(i + 1)) {
      for (int j = (short)(i + 1); j < this.jdField_if.dI; j = (short)(j + 1)) {
        if (this.jdField_if.gK[i] > this.jdField_if.gK[j])
        {
          int k = this.jdField_if.gK[i];
          int m = this.jdField_if.cD[i];
          this.jdField_if.gK[i] = this.jdField_if.gK[j];
          this.jdField_if.cD[i] = this.jdField_if.cD[j];
          this.jdField_if.gK[j] = k;
          this.jdField_if.cD[j] = m;
        }
      }
    }
  }
  
  public byte a(short paramShort)
  {
    for (int i = 0; i < this.jdField_if.dI; i = (short)(i + 1)) {
      if (this.jdField_if.gK[i] == paramShort) {
        return (byte)a3.jdMethod_do(this.jdField_if.cD[i], 2);
      }
    }
    return 0;
  }
  
  public short jdMethod_if()
  {
    return (short)(ag.eK * this.jdField_if.nc - this.jdField_if.dI);
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\av.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */