import javax.microedition.lcdui.Graphics;

public class m
{
  h jdField_if = null;
  g jdField_do = null;
  byte jdField_new;
  byte jdField_int;
  byte jdField_for;
  public static final int[] a = { 60928, 1632679, 4511487, 12766463, 16743920, 16744853, 16750940, 13495325, 15460976 };
  
  public m(h paramh)
  {
    this.jdField_if = paramh;
    this.jdField_do = paramh.cJ;
  }
  
  public void a()
  {
    this.jdField_do.E();
    int i = 100;
    int j = 120;
    int k = (short)((h.dU - i) / 2);
    int m = (short)((h.fp - j) / 2);
    this.jdField_if.a((byte)2, k, m, i, j, true);
    int n = 22;
    int i1 = 15;
    int i2 = 8;
    int i3 = 3;
    this.jdField_if.fj.setColor(h.b2[2][1]);
    this.jdField_if.fj.drawString("选择公会颜色:", k + i2, m + i2, 0);
    for (int i4 = 0; i4 < a.length; i4 = (byte)(i4 + 1))
    {
      this.jdField_if.fj.setColor(0);
      this.jdField_if.fj.drawRect(k + i2 + i4 % i3 * (n + i2) - 1, m + 20 + i2 + i4 / i3 * (n + i2) - 1, n, i1);
      this.jdField_if.fj.setColor(15724527);
      this.jdField_if.fj.drawRect(k + i2 + i4 % i3 * (n + i2), m + 20 + i2 + i4 / i3 * (n + i2), n, i1);
      if (this.jdField_int * i3 + this.jdField_new == i4)
      {
        this.jdField_if.fj.setColor(0);
        this.jdField_if.fj.fillRect(k + i2 + i4 % i3 * (n + i2) - 2, m + 20 + i2 + i4 / i3 * (n + i2) - 2, n + 4, i1 + 4);
      }
      this.jdField_if.fj.setColor(a[i4]);
      this.jdField_if.fj.fillRect(k + i2 + i4 % i3 * (n + i2), m + 20 + i2 + i4 / i3 * (n + i2), n, i1);
    }
  }
  
  public void a(int paramInt)
  {
    switch (this.jdField_do.jdField_do)
    {
    case -75: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_for = 0;
        break;
      case 2: 
        this.jdField_for = 1;
        break;
      case 5: 
      case 6: 
        if (this.jdField_for == 0)
        {
          if (this.jdField_if.aG.jdMethod_int(6714))
          {
            this.jdField_if.aG.jdMethod_new(this.jdField_if.jdMethod_if((byte)122));
            this.jdField_if.aG.jdMethod_do(this.jdField_do.mM.jdField_int * 3 + this.jdField_do.mM.jdField_new);
            this.jdField_if.aG.jdMethod_if();
          }
          this.jdField_do.jdField_do = 21;
          this.jdField_do.mM = null;
        }
        else
        {
          this.jdField_do.jdField_do = -74;
        }
        break;
      }
      break;
    case -74: 
      switch (paramInt)
      {
      case 2: 
        this.jdField_int = ((byte)(this.jdField_int + 1));
        if (this.jdField_int > 2) {
          this.jdField_int = 0;
        }
        break;
      case 1: 
        this.jdField_int = ((byte)(this.jdField_int - 1));
        if (this.jdField_int < 0) {
          this.jdField_int = 2;
        }
        break;
      case 3: 
        this.jdField_new = ((byte)(this.jdField_new - 1));
        if (this.jdField_new < 0) {
          this.jdField_new = 2;
        }
        break;
      case 4: 
        this.jdField_new = ((byte)(this.jdField_new + 1));
        if (this.jdField_new > 2) {
          this.jdField_new = 0;
        }
        break;
      case 5: 
      case 6: 
        this.jdField_for = 0;
        this.jdField_do.jdField_do = -75;
        break;
      case 7: 
        this.jdField_do.jdField_do = 0;
      }
      break;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */