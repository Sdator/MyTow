public class al
{
  h a = null;
  g jdField_if = null;
  
  public al(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a()
  {
    switch (this.jdField_if.jdField_do)
    {
    case -20: 
      this.jdField_if.E();
      this.jdField_if.a("确定捐献?", "是", "否");
      break;
    case -14: 
      this.jdField_if.E();
      this.a.d9.a();
      this.a.x();
      this.a.c();
      break;
    case -26: 
    case -25: 
    case -24: 
    case -10: 
      this.jdField_if.E();
      this.a.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.jdField_if.gd, this.jdField_if.bI);
      this.a.x();
      this.a.c();
    }
  }
  
  public void jdMethod_if(int paramInt)
  {
    switch (this.jdField_if.jdField_do)
    {
    case -20: 
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
          if (this.a.aG.jdMethod_int(3718))
          {
            this.a.aG.jdMethod_if(this.a.cZ.O);
            this.a.aG.jdMethod_for(a3.jdMethod_do(this.jdField_if.mn, a.C));
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
          this.a.ez = null;
          break;
        case 1: 
          this.jdField_if.jdField_do = 0;
          this.a.ez = null;
        }
        break;
      }
      break;
    case -14: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_if.a("只能输入" + this.jdField_if.f4 + "-" + this.jdField_if.hG + "的数.", this.jdField_if.jdField_do, false, 9999);
        break;
      case 0: 
        if (a3.jdMethod_do(this.jdField_if.mn, a.C) == a.ac)
        {
          this.jdField_if.jdField_do = 0;
          this.a.ez = null;
        }
        else
        {
          this.jdField_if.e3 = ((byte)a.ac);
          this.jdField_if.jdField_do = -20;
        }
        break;
      case 1: 
        this.jdField_if.jdField_do = 0;
        this.a.ez = null;
      }
      break;
    }
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      g tmp96_93 = this.jdField_if;
      tmp96_93.gd = ((byte)(tmp96_93.gd - 1));
      if (this.jdField_if.gd < 0) {
        this.jdField_if.gd = ((byte)(this.jdField_if.bI.length - 1));
      }
      break;
    case 2: 
      g tmp141_138 = this.jdField_if;
      tmp141_138.gd = ((byte)(tmp141_138.gd + 1));
      if (this.jdField_if.gd > this.jdField_if.bI.length - 1) {
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
      int i = this.a.jdMethod_do(paramInt, this.jdField_if.bI.length);
      if (i < 0) {
        return;
      }
      if (i > 0) {
        this.jdField_if.gd = ((byte)i);
      }
      if (this.a.cZ.fL < 0)
      {
        this.jdField_if.jdField_do = 0;
        this.a.ez = null;
        return;
      }
      if ((this.jdField_if.eC >= 0) && (this.a.cZ.fL != this.jdField_if.eC))
      {
        this.jdField_if.jdField_do = 0;
        this.a.ez = null;
        return;
      }
      this.jdField_if.bI = null;
      switch (this.jdField_if.jdField_do)
      {
      case -25: 
        if (this.a.cZ.fj != 17)
        {
          this.jdField_if.jdField_do = 0;
          this.a.ez = null;
          return;
        }
        this.jdField_if.jdField_do = 21;
        if (this.a.aG.jdMethod_int(3723))
        {
          this.a.aG.jdMethod_for(this.a.cZ.fL);
          this.a.aG.jdMethod_do(this.jdField_if.gd);
          this.a.aG.jdMethod_if();
        }
        this.a.ez = null;
        break;
      case -26: 
        if (this.a.cZ.fj != 17)
        {
          this.jdField_if.jdField_do = 0;
          this.a.ez = null;
          return;
        }
        this.jdField_if.jdField_do = 21;
        if (this.a.aG.jdMethod_int(3724))
        {
          this.a.aG.jdMethod_for(this.a.cZ.fL);
          this.a.aG.jdMethod_do(this.jdField_if.gd);
          this.a.aG.jdMethod_if();
        }
        this.a.ez = null;
        break;
      case -24: 
        if (this.a.cZ.fj != 17)
        {
          this.jdField_if.jdField_do = 0;
          this.a.ez = null;
          return;
        }
        switch (this.jdField_if.gd)
        {
        case 0: 
          this.jdField_if.gd = 0;
          this.jdField_if.bI = new String[] { a.J + "%", a.n + "%", a.T + "%" };
          this.jdField_if.jdField_do = -25;
          break;
        case 1: 
          this.jdField_if.gd = 0;
          this.jdField_if.bI = new String[] { a.T + ":" + a.ac + a.ac, a.o + ":" + a.ac + a.ac, a.k + ":" + a.ac + a.ac };
          this.jdField_if.jdField_do = -26;
        }
        break;
      case -10: 
        switch (this.jdField_if.gd)
        {
        case 0: 
          if (this.a.aG.jdMethod_int(3721))
          {
            this.a.aG.jdMethod_for(this.a.cZ.fL);
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
          this.a.ez = null;
          break;
        case 1: 
          this.a.d9 = new w(this.a, "金额", a.ac, this.a.cZ.a((byte)0), a.ac);
          this.jdField_if.jdField_do = -14;
        }
        break;
      }
      break;
    case 7: 
      this.jdField_if.bI = null;
      this.jdField_if.jdField_do = 0;
      this.a.ez = null;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\al.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */