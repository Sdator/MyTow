public class au
{
  h a = null;
  g jdField_if = null;
  String[] jdField_do = null;
  
  public au(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
    this.jdField_if.e3 = 0;
  }
  
  public void a()
  {
    this.jdField_if.E();
    this.a.a("设置外交关系?", -1, (byte)4, false);
    this.a.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.jdField_if.gd, this.jdField_do);
    this.a.x();
    this.a.c();
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
    case 6: 
    case 48: 
    case 49: 
    case 51: 
    case 55: 
    case 57: 
      int i = this.a.jdMethod_do(paramInt, this.jdField_do.length);
      if (i < 0) {
        return;
      }
      if (i > 0) {
        this.jdField_if.gd = ((byte)i);
      }
      if (this.a.cZ.ge < 0) {
        switch (this.jdField_if.gd)
        {
        case 0: 
        case 1: 
          if (this.jdField_if.gd == 1)
          {
            this.jdField_if.e3 = 0;
            this.jdField_if.eR = 2;
            this.jdField_if.bu = "与其他公会建立敌对关系后,可在非保护区域内强制偷袭其会员.确认敌对关系?";
            this.jdField_if.jdField_do = -94;
            return;
          }
          if (this.a.aG.jdMethod_int(3731))
          {
            this.a.aG.jdMethod_for(this.jdField_if.es);
            this.a.aG.jdMethod_do(0);
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
          this.a.bS = null;
          break;
        case 2: 
          this.jdField_if.jdField_do = 26;
          this.a.bS = null;
        }
      } else if (this.jdField_if.es == this.a.cZ.ge) {
        if (this.a.cZ.gm == 0) {
          switch (this.jdField_if.gd)
          {
          case 0: 
            if (this.a.aG.jdMethod_int(3731))
            {
              this.a.aG.jdMethod_for(this.jdField_if.es);
              this.a.aG.jdMethod_do(-1);
              this.a.aG.jdMethod_if();
            }
            this.jdField_if.jdField_do = 21;
            this.a.bS = null;
            break;
          case 1: 
            this.jdField_if.jdField_do = 26;
            this.a.bS = null;
          }
        } else if (this.a.cZ.gm == 1) {
          switch (this.jdField_if.gd)
          {
          case 0: 
            if (this.a.aG.jdMethod_int(3731))
            {
              this.a.aG.jdMethod_for(this.jdField_if.es);
              this.a.aG.jdMethod_do(-1);
              this.a.aG.jdMethod_if();
            }
            this.jdField_if.jdField_do = 21;
            this.a.bS = null;
            break;
          case 1: 
            this.jdField_if.jdField_do = 26;
            this.a.bS = null;
          }
        }
      }
      break;
    case 7: 
      this.jdField_do = null;
      this.jdField_if.jdField_do = 26;
      this.a.bS = null;
      break;
    case 1: 
      g tmp682_679 = this.jdField_if;
      tmp682_679.gd = ((byte)(tmp682_679.gd - 1));
      if (this.jdField_if.gd < 0) {
        this.jdField_if.gd = ((byte)(this.jdField_if.c9.length - 1));
      }
      break;
    case 2: 
      g tmp727_724 = this.jdField_if;
      tmp727_724.gd = ((byte)(tmp727_724.gd + 1));
      if (this.jdField_if.gd > this.jdField_if.c9.length - 1) {
        this.jdField_if.gd = 0;
      }
      break;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\au.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */