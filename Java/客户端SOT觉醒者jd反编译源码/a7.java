class a7
{
  h a = null;
  g jdField_if = null;
  
  public a7(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
    case 1: 
      if (this.jdField_if.es == 0)
      {
        if (this.a.aG.jdMethod_int(3503))
        {
          this.a.aG.jdMethod_if(this.jdField_if.b5);
          this.a.aG.jdMethod_do(paramByte);
          this.a.aG.jdMethod_if();
        }
      }
      else if (this.jdField_if.es == 1)
      {
        if (!ag.jdMethod_do(this.a.cZ.fj, (byte)3))
        {
          this.jdField_if.a("当前公会职位无权作此操作.", (short)29, false, 9999);
          return;
        }
        if (this.a.aG.jdMethod_int(3703))
        {
          this.a.aG.jdMethod_if(this.jdField_if.b5);
          this.a.aG.jdMethod_do(paramByte);
          this.a.aG.jdMethod_if();
        }
      }
      else if (this.jdField_if.es == 2)
      {
        if (!ag.jdMethod_do(this.a.cZ.fj, (byte)4))
        {
          this.jdField_if.a("当前公会职位无权作此操作.", (short)29, false, 9999);
          return;
        }
        if (this.jdField_if.b5.equals(this.a.cZ.O))
        {
          this.jdField_if.a("不能操作自己的退会请求.", (short)29, false, 9999);
          return;
        }
        if (this.a.aG.jdMethod_int(3707))
        {
          this.a.aG.jdMethod_if(this.jdField_if.b5);
          this.a.aG.jdMethod_do(paramByte);
          this.a.aG.jdMethod_if();
        }
      }
      else if (this.jdField_if.es == 3)
      {
        if (!ag.jdMethod_do(this.a.cZ.fj, (byte)0))
        {
          this.jdField_if.a("当前公会职位无权作此操作.", (short)29, false, 9999);
          return;
        }
        if (this.a.aG.jdMethod_int(3733))
        {
          this.a.aG.jdMethod_if(this.jdField_if.b5);
          this.a.aG.jdMethod_do(paramByte);
          this.a.aG.jdMethod_if();
        }
      }
      else if (this.jdField_if.es == 4)
      {
        if (this.a.aG.jdMethod_int(3562))
        {
          this.a.aG.jdMethod_if(this.jdField_if.b5);
          this.a.aG.jdMethod_for(paramByte);
          this.a.aG.jdMethod_if();
        }
      }
      else if ((this.jdField_if.es == 5) && (this.a.aG.jdMethod_int(3564)))
      {
        this.a.aG.jdMethod_if(this.jdField_if.b5);
        this.a.aG.jdMethod_for(paramByte);
        this.a.aG.jdMethod_if();
      }
      this.jdField_if.jdField_do = 21;
      break;
    case 2: 
      this.jdField_if.jdField_do = 26;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\a7.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */