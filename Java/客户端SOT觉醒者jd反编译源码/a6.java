class a6
{
  h a = null;
  g jdField_if = null;
  
  public a6(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      if (this.a.aG.jdMethod_int(3735))
      {
        this.a.aG.jdMethod_for(this.jdField_if.es);
        this.a.aG.jdMethod_if();
      }
      this.jdField_if.jdField_do = 21;
      break;
    case 1: 
      if (this.a.cZ.fL == this.jdField_if.es) {
        return;
      }
      if (!ag.jdMethod_do(this.a.cZ.fj, (byte)0))
      {
        this.jdField_if.a("只有公会长才有外交权利.", (short)26, false, 9999);
        return;
      }
      if (this.a.cZ.ge < 0)
      {
        this.a.bS = new au(this.a);
        this.a.bS.jdField_do = new String[] { "同盟", "敌对", "返回" };
      }
      else if (this.jdField_if.es == this.a.cZ.ge)
      {
        this.a.bS = new au(this.a);
        if (this.a.cZ.gm == 0) {
          this.a.bS.jdField_do = new String[] { "断交", "返回" };
        } else if (this.a.cZ.gm == 1) {
          this.a.bS.jdField_do = new String[] { "中立", "返回" };
        }
      }
      else
      {
        this.jdField_if.a("需要解除与其他公会的外交关系,才能与该公会建立外交关系.", (short)26, false, 9999);
        return;
      }
      paramByte = 0;
      this.jdField_if.jdField_do = -92;
      break;
    case 2: 
      this.jdField_if.jdField_do = 26;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\a6.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */