class aw
  implements Runnable
{
  h jdField_if;
  boolean a = false;
  public byte jdField_do;
  
  public aw(h paramh, boolean paramBoolean)
  {
    this.jdField_if = paramh;
    this.a = paramBoolean;
  }
  
  public void run()
  {
    for (byte b = 0; b < (this.jdField_do == 3 ? 2 : 1); b = (byte)(b + 1))
    {
      int i = q.a(this.jdField_do == 3 ? (byte)(this.jdField_if.ef == 0 ? b : 1 - b) : this.jdField_if.ef);
      if (this.a)
      {
        h.bi = true;
        return;
      }
      switch (i)
      {
      case 0: 
        if (this.jdField_do == 3)
        {
          this.jdField_if.ef = b;
          this.jdField_if.jdMethod_else();
          if (this.jdField_if.aG.jdMethod_int(9950))
          {
            this.jdField_if.aG.jdMethod_do(1);
            this.jdField_if.aG.jdMethod_if(h.bL);
            this.jdField_if.aG.jdMethod_do(h.cz ? 1 : 0);
            this.jdField_if.aG.jdMethod_if(h.fY);
            this.jdField_if.aG.jdMethod_if();
          }
          return;
        }
        if (this.jdField_do == 2)
        {
          if (this.jdField_if.aG.jdMethod_int(6702))
          {
            this.jdField_if.aG.jdMethod_if(h.bL);
            this.jdField_if.aG.jdMethod_do(100);
            for (int j = 0; j < this.jdField_if.cJ.gX; j = (byte)(j + 1))
            {
              this.jdField_if.aG.jdMethod_new(this.jdField_if.cJ.dR[j]);
              this.jdField_if.aG.jdMethod_do(1);
              this.jdField_if.aG.jdMethod_if(q.dm);
              this.jdField_if.aG.jdMethod_if(q.cs);
            }
            this.jdField_if.aG.jdMethod_if();
          }
          this.jdField_if.cJ.jdField_do = 21;
        }
        else if (this.jdField_do == 1)
        {
          if (this.jdField_if.aG.jdMethod_int(6701))
          {
            this.jdField_if.aG.jdMethod_for(h.cz ? 999999 : q.cB);
            this.jdField_if.aG.jdMethod_if();
          }
          this.jdField_if.cJ.jdField_do = 21;
        }
        else
        {
          this.jdField_if.bv.a();
        }
        break;
      case 1: 
      case 2: 
      case 3: 
        if (this.jdField_do == 3)
        {
          if (b == 1)
          {
            y.int = 0;
            this.jdField_if.s.jdField_do = 4;
          }
        }
        else
        {
          this.jdField_if.cJ.a("暂时不能使用该充值方式.", this.jdField_do != 0 ? 0 : (short)this.jdField_if.bv.jdField_do, false, 9999);
          this.jdField_if.bv = null;
        }
        break;
      }
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\aw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */