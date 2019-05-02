public class v
{
  h jdField_if = null;
  g jdField_do = null;
  String[] jdField_int = null;
  short[] a = null;
  byte jdField_for;
  
  public v(h paramh)
  {
    this.jdField_if = paramh;
    this.jdField_do = paramh.cJ;
    this.jdField_for = 0;
  }
  
  public void a()
  {
    this.jdField_do.E();
    this.jdField_if.a("请选择需要解除绑定的装备.", -1, (byte)4, false);
    this.jdField_if.a((h.dU - 50) / 2, Math.max(0, h.fp - this.jdField_int.length * h.eA - 5) / 2, this.jdField_for, this.jdField_int, false);
    this.jdField_if.x();
    this.jdField_if.c();
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
    case 6: 
      int i = this.a[this.jdField_for];
      byte b = -1;
      for (int j = 0; j < this.jdField_if.cZ.a7.length; j = (byte)(j + 1)) {
        if (this.jdField_if.cZ.a7[j] == i)
        {
          b = j;
          break;
        }
      }
      this.jdField_int = null;
      this.a = null;
      if (b == -1) {
        return;
      }
      if (this.jdField_if.cZ.fc[b] != 0)
      {
        this.jdField_do.a(3, (short)0, false, 9999);
        this.jdField_if.bf = null;
        return;
      }
      if (!this.jdField_if.cZ.h(b))
      {
        this.jdField_do.a("背包没有空间存放该装备.", (short)0, false, 9999);
        this.jdField_if.bf = null;
      }
      else
      {
        this.jdField_if.cZ.a((byte)1, this.jdField_if.jdMethod_if((byte)115), 1, true);
        this.jdField_do.a("成功卸下.", (short)0, false, 9999);
        this.jdField_if.bf = null;
      }
      break;
    case 7: 
      this.jdField_int = null;
      this.a = null;
      this.jdField_do.jdField_do = 0;
      this.jdField_if.bf = null;
      break;
    case 1: 
      this.jdField_for = ((byte)(this.jdField_for - 1));
      if (this.jdField_for < 0) {
        this.jdField_for = ((byte)(this.jdField_int.length - 1));
      }
      break;
    case 2: 
      this.jdField_for = ((byte)(this.jdField_for + 1));
      if (this.jdField_for > this.jdField_int.length - 1) {
        this.jdField_for = 0;
      }
      break;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */