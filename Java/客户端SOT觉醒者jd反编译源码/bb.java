class bb
{
  h a = null;
  g jdField_if = null;
  
  public bb(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(byte paramByte)
  {
    ax localax;
    if (this.jdField_if.mc) {
      switch (paramByte)
      {
      case 0: 
        localax = new ax(this.a);
        localax.a(true);
        localax = null;
        break;
      case 1: 
        this.jdField_if.jdField_do = 26;
      }
    } else if (this.jdField_if.es == -1) {
      switch (paramByte)
      {
      case 0: 
        this.a.i.a(this.jdField_if.b5);
        break;
      case 1: 
        this.jdField_if.jdField_do = 26;
      }
    } else {
      switch (paramByte)
      {
      case 0: 
        this.a.i.jdMethod_if(this.jdField_if.b5, (byte)0);
        break;
      case 1: 
        this.a.b(this.jdField_if.b5);
        break;
      case 2: 
        localax = new ax(this.a);
        localax.a(false);
        localax = null;
        break;
      case 3: 
        if (this.a.cZ.gE)
        {
          this.jdField_if.a("你已经处于组队状态.", (short)0, false, 9999);
          return;
        }
        this.a.jdMethod_int(this.jdField_if.b5);
        this.jdField_if.a("已发送入队请求.", (short)0, false, 9999);
        break;
      case 4: 
        this.a.jdMethod_byte(this.jdField_if.b5);
        this.jdField_if.a("已发送拜师请求.", (short)0, false, 9999);
        break;
      case 10: 
        this.a.e(this.jdField_if.b5);
        this.jdField_if.a("已发送求爱请求.", (short)0, false, 9999);
        break;
      case 5: 
      case 11: 
        this.jdField_if.jdField_do = 26;
        break;
      case 6: 
        this.a.jdMethod_case(this.jdField_if.b5);
        this.jdField_if.a("已发送添加好友请求.", (short)0, false, 9999);
        break;
      case 7: 
        this.a.i.a(this.jdField_if.b5, (byte)26);
        break;
      case 8: 
        if ((g.dD != 1) || (g.dZ != 0))
        {
          this.jdField_if.a(33, (short)0, false, 9999);
          return;
        }
        if (!this.a.fI)
        {
          this.jdField_if.a(34, (short)0, false, 9999);
          return;
        }
        if (this.a.cZ.a((byte)0) < 1000)
        {
          this.jdField_if.a(35, (short)0, false, 9999);
          return;
        }
        if (this.a.cZ.a8)
        {
          this.jdField_if.a("摆摊中不能决斗.", (short)0, false, 9999);
          return;
        }
        this.a.d9 = new w(this.a, "金额", 1000, this.a.cZ.a((byte)0), 1000);
        this.jdField_if.jdField_do = -40;
        break;
      case 9: 
        if (this.a.cZ.fL >= 0)
        {
          this.jdField_if.a("你已经加入" + this.a.cZ.es + ".", (short)0, false, 9999);
          return;
        }
        if (!this.a.cJ.bj)
        {
          this.jdField_if.a("对方没有权利接受入会申请.", (short)0, false, 9999);
          return;
        }
        if (this.a.aG.jdMethod_int(3702))
        {
          this.a.aG.jdMethod_if(this.jdField_if.b5);
          this.a.aG.jdMethod_for(this.jdField_if.bA);
          this.a.aG.jdMethod_if();
        }
        this.jdField_if.a("已发送入公会请求.", (short)0, false, 9999);
      }
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\bb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */