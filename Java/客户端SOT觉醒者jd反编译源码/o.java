import javax.microedition.lcdui.Graphics;

public class o
{
  h a;
  g jdField_if;
  
  public o(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a()
  {
    this.jdField_if.E();
    this.a.a((byte)2, 0, 0, h.dU, h.fp, false);
    int i = h.dU;
    int j = h.fp;
    this.a.a((byte)2, 0, 0, i, j, true);
    this.a.a((byte)2, 0, 0, i, 30, false);
    this.a.c();
    this.a.fj.setColor(h.b2[2][1]);
    this.a.fj.drawString(this.jdField_if.gq[this.jdField_if.jM][this.jdField_if.ix], 20, 5, 20);
    int k = (byte)this.jdField_if.kX.length;
    int m = (byte)((h.fp - 2 * h.eA) / (h.eA + 1));
    int n = (short)(k / m);
    if (n * m < k) {
      n = (short)(n + 1);
    }
    if (this.jdField_if.gM >= n) {
      this.jdField_if.gM = ((byte)(n - 1));
    }
    this.a.fj.setColor(h.b2[2][1]);
    int i1 = 5;
    int i2 = 30;
    for (int i3 = 0; (i3 < m) && (this.jdField_if.gM * m + i3 <= this.jdField_if.kX.length - 1); i3 = (byte)(i3 + 1)) {
      this.a.fj.drawString(this.jdField_if.kX[(this.jdField_if.gM * m + i3)], i1, i2 + i3 * (h.eA + 1), 20);
    }
    if (this.jdField_if.gM > 0) {
      this.a.a(i - 10 - 10, 30 + (this.jdField_if.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
    }
    if (this.jdField_if.gM < n - 1) {
      this.a.a(i - 10 - 10, j - 20 + (this.jdField_if.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
    }
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      g tmp40_37 = this.jdField_if;
      tmp40_37.gM = ((byte)(tmp40_37.gM - 1));
      if (this.jdField_if.gM < 0) {
        this.jdField_if.gM = 0;
      }
      break;
    case 2: 
      g tmp75_72 = this.jdField_if;
      tmp75_72.gM = ((byte)(tmp75_72.gM + 1));
      break;
    case 7: 
      this.a.dJ = null;
      this.jdField_if.jdField_do = 26;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\o.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */