public class r
{
  h a = null;
  g jdField_if = null;
  
  public r(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a()
  {
    this.jdField_if.E();
    this.a.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.jdField_if.gd, this.jdField_if.bI);
    this.a.x();
    this.a.c();
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
        this.a.dy = null;
        return;
      }
      this.jdField_if.bI = null;
      switch (this.jdField_if.gd)
      {
      case 0: 
        if (this.a.aG.jdMethod_int(3755))
        {
          this.a.aG.jdMethod_new(this.jdField_if.jdField_if);
          this.a.aG.jdMethod_if();
        }
        this.jdField_if.jdField_do = 21;
        this.a.dy = null;
        break;
      case 1: 
        if (this.a.cZ.fj == 17)
        {
          if (this.a.aG.jdMethod_int(3754))
          {
            this.a.aG.jdMethod_new(this.jdField_if.jdField_if);
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
        }
        else
        {
          this.jdField_if.a("只有会长有权报名.", (short)0, false, 9999);
        }
        this.a.dy = null;
      }
      break;
    case 7: 
      this.jdField_if.bI = null;
      this.jdField_if.jdField_do = 0;
      this.a.dy = null;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\r.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */