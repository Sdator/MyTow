public class z
{
  h a = null;
  g jdField_if = null;
  String jdField_do;
  
  public z(h paramh, String paramString)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
    this.jdField_do = paramString;
    this.a.cZ.y();
    byte b = 0;
    short[] arrayOfShort1 = null;
    for (int i = 0; i < 2; i = (byte)(i + 1))
    {
      b = 0;
      for (int j = 0; j < this.a.cZ.gJ[0]; j = (byte)(j + 1)) {
        if ((!h.v(this.a.cZ.gw[0][j])) && (!h.o(this.a.cZ.gw[0][j])))
        {
          if (i == 1) {
            arrayOfShort1[b] = this.a.cZ.gw[0][j];
          }
          b = (byte)(b + 1);
        }
      }
      if (i == 0) {
        arrayOfShort1 = new short[b];
      }
    }
    this.a.i.a(1, (byte)0, b, arrayOfShort1, new short[arrayOfShort1.length]);
    short[] arrayOfShort2 = new short[this.a.cZ.gJ[0]];
    System.arraycopy(this.a.cZ.gw[0], 0, arrayOfShort2, 0, this.a.cZ.gJ[0]);
    this.a.i.a(arrayOfShort2, true);
  }
  
  public void a()
  {
    switch (this.jdField_if.jdField_do)
    {
    case 85: 
      this.jdField_if.E();
      this.a.s();
      this.jdField_if.a("确定赠送给 " + this.jdField_do + "?", "是", "否");
      break;
    case 84: 
      this.jdField_if.E();
      this.a.s();
      this.a.d9.a();
      break;
    case 68: 
      this.jdField_if.E();
      this.a.s();
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
    case 85: 
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
          if (this.a.aG.jdMethod_int(6564))
          {
            this.a.aG.jdMethod_if(this.jdField_do);
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
          this.a.jdField_long = null;
          break;
        case 1: 
          this.jdField_if.jdField_do = 68;
        }
        break;
      }
      break;
    case 84: 
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
            g tmp479_476 = this.jdField_if;
            tmp479_476.dx = ((short)(tmp479_476.dx - 1));
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(0, 2));
          this.jdField_if.jdField_do = 68;
        }
        else
        {
          if (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0)
          {
            g tmp545_542 = this.jdField_if;
            tmp545_542.dx = ((short)(tmp545_542.dx + 1));
          }
          this.jdField_if.jv[0][i] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_if.mn, 4), 2));
          this.jdField_if.jdField_do = 68;
        }
        break;
      case 1: 
        this.jdField_if.jdField_do = 68;
      }
      break;
    case 68: 
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
        if ((this.jdField_if.dx >= 10) && (a3.jdMethod_do(this.jdField_if.jv[0][i], 2) == 0))
        {
          this.jdField_if.a(26, (short)68, false, 30);
        }
        else
        {
          this.a.d9 = new w(this.a, "数量", 0, this.a.cZ.jdMethod_if(this.jdField_if.nl[0][i]), a3.jdMethod_do(this.jdField_if.jv[0][i], 2) > 0 ? a3.jdMethod_do(this.jdField_if.jv[0][i], 2) : this.a.cZ.jdMethod_if(this.jdField_if.nl[0][i]));
          this.jdField_if.jdField_do = 84;
        }
        break;
      case 6: 
        if (this.jdField_if.dx == 0) {
          return;
        }
        this.jdField_if.e3 = 0;
        this.jdField_if.jdField_do = 85;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.jdField_if.jdField_do = 0;
        this.a.jdField_long = null;
      }
      break;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\z.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */