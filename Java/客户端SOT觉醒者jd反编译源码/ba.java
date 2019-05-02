class ba
{
  h a = null;
  g jdField_if = null;
  
  public ba(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(byte paramByte)
  {
    if (this.a.cZ.dU) {
      switch (paramByte)
      {
      case 0: 
        this.a.i.jdMethod_if(this.jdField_if.b5, (byte)0);
        break;
      case 1: 
        this.jdField_if.eR = 0;
        this.jdField_if.e3 = 0;
        this.jdField_if.bu = ("确定把" + this.jdField_if.b5 + "踢出队伍?");
        this.jdField_if.jdField_do = -94;
        break;
      case 2: 
        this.jdField_if.jdField_do = 26;
      }
    } else {
      switch (paramByte)
      {
      case 0: 
        this.a.i.jdMethod_if(this.jdField_if.b5, (byte)0);
        break;
      case 1: 
        this.jdField_if.jdField_do = 26;
      }
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ba.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */