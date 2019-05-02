import java.util.Vector;

class a9
{
  h a = null;
  g jdField_if = null;
  
  public a9(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      if (this.jdField_if.es == 0)
      {
        this.jdField_if.a("会员离线状态下,不能私聊.", (short)26, false, 9999);
        return;
      }
      this.a.i.jdMethod_if(this.jdField_if.b5, (byte)0);
      break;
    case 1: 
      if (this.jdField_if.es == 0)
      {
        this.jdField_if.a("会员离线状态下,不能查看资料.", (short)26, false, 9999);
        return;
      }
      this.a.i.a(this.jdField_if.b5, (byte)26);
      break;
    case 2: 
      if (!ag.jdMethod_do(this.a.cZ.fj, (byte)1)) {
        return;
      }
      if (this.jdField_if.es == 0)
      {
        this.jdField_if.a("会员离线状态下,不能设定职位.", (short)26, false, 9999);
        return;
      }
      int i = ((Byte)this.jdField_if.k1.elementAt(this.jdField_if.hZ)).byteValue();
      this.jdField_if.c9 = new String[ag.gB.length - 1 + (i >= 0 ? 1 : 0)];
      this.jdField_if.mQ = new byte[ag.gB.length - 1 + (i >= 0 ? 1 : 0)];
      this.jdField_if.c9[0] = "执行官 ";
      this.jdField_if.mQ[0] = 15;
      this.jdField_if.c9[1] = "卫队长 ";
      this.jdField_if.mQ[1] = 13;
      this.jdField_if.c9[2] = "军团长 ";
      this.jdField_if.mQ[2] = 14;
      this.jdField_if.c9[3] = "指挥官 ";
      this.jdField_if.mQ[3] = 16;
      if (i >= 0)
      {
        this.jdField_if.c9[(ag.gB.length - 1)] = "撤销职位";
        this.jdField_if.mQ[(ag.gB.length - 1)] = -1;
      }
      this.jdField_if.gd = 0;
      this.jdField_if.jdField_do = -85;
      break;
    case 3: 
      if (!ag.jdMethod_do(this.a.cZ.fj, (byte)4)) {
        return;
      }
      if (((Byte)this.jdField_if.k1.elementAt(this.jdField_if.hZ)).byteValue() >= this.a.cZ.fj)
      {
        this.jdField_if.a("不能踢出同职位或更高职位的会员.", (short)26, false, 9999);
        return;
      }
      this.jdField_if.eR = 1;
      this.jdField_if.e3 = 0;
      this.jdField_if.bu = ("确定把" + this.jdField_if.b5 + "踢出公会?");
      this.jdField_if.jdField_do = -94;
      break;
    case 4: 
      this.jdField_if.jdField_do = 26;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\a9.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */