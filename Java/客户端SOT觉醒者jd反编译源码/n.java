import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class n
{
  h a = null;
  g jdField_do = null;
  byte jdField_for;
  byte jdField_if;
  
  public n(h paramh)
  {
    this.a = paramh;
    this.jdField_do = paramh.cJ;
    this.jdField_for = 0;
    this.jdField_if = 0;
    this.a.bR.jdField_long = null;
    if (this.a.bR.d.size() > 0)
    {
      this.a.bR.jdField_long = new String[this.a.bR.d.size()];
      this.a.bR.jdField_new = new String[this.a.bR.d.size()];
      for (int i = 0; i < this.a.bR.d.size(); i++)
      {
        ao localao = (ao)this.a.bR.d.elementAt(i);
        this.a.bR.jdField_new[i] = localao.h;
        this.a.bR.jdField_long[i] = localao.i;
        if ((this.a.cZ.gE) && (this.a.jdField_else >= 0) && (localao.P == 3))
        {
          int tmp234_233 = i;
          String[] tmp234_230 = this.a.bR.jdField_long;
          tmp234_230[tmp234_233] = (tmp234_230[tmp234_233] + "(" + this.a.jdField_else + "/" + localao.jdField_for[1] + ")");
        }
      }
    }
    this.jdField_do.gJ = null;
  }
  
  public void a()
  {
    this.jdField_do.E();
    this.a.a((byte)2, 0, 0, h.dU, h.fp, false);
    int i = h.dU;
    int j = h.fp;
    this.a.a((byte)2, 0, 0, i, j, true);
    this.a.a((byte)2, 0, 0, i, 30, false);
    this.a.c();
    this.a.fj.setColor(h.b2[2][1]);
    if (this.a.bR.jdField_long == null)
    {
      this.a.fj.drawString("无任务提示.", 5, 30, 0);
      return;
    }
    this.a.fj.drawString(this.a.bR.jdField_new[this.jdField_for], 20, 5, 20);
    if (this.jdField_for > 0) {
      this.a.a(3 + (this.jdField_do.jdField_int % 6 == 0 ? -1 : 1), 32, 14, 8, 0, 0, this.a.aH[4], 6);
    }
    if (this.jdField_for < this.a.bR.jdField_long.length - 1) {
      this.a.a(i - 3 - 8 + (this.jdField_do.jdField_int % 6 == 0 ? 1 : -1), 32, 14, 8, 0, 0, this.a.aH[4], 5);
    }
    this.a.a(i - 10, 15, this.a.bR.jdField_long.length, 24);
    this.a.a(i - 10 - 14, 15, 5, 7, 50, 0, this.a.aH[5], 0);
    this.a.a(i - 10 - 21, 15, this.jdField_for + 1, 24);
    if (this.jdField_do.gJ == null)
    {
      if (this.jdField_for >= this.a.bR.d.size()) {
        this.jdField_for = ((byte)(this.a.bR.d.size() - 1));
      }
      ao localao = (ao)this.a.bR.d.elementAt(this.jdField_for);
      this.jdField_do.gJ = this.a.a(localao);
    }
    int k = (byte)this.jdField_do.gJ.length;
    int m = (byte)((h.fp - 2 * h.eA) / (h.eA + 1));
    int n = (short)(k / m);
    if (n * m < k) {
      n = (short)(n + 1);
    }
    if (this.jdField_if >= n) {
      this.jdField_if = ((byte)(n - 1));
    }
    this.a.fj.setColor(h.b2[2][1]);
    int i1 = 5;
    int i2 = 30;
    for (int i3 = 0; (i3 < m) && (this.jdField_if * m + i3 <= this.jdField_do.gJ.length - 1); i3 = (byte)(i3 + 1)) {
      this.a.fj.drawString(this.jdField_do.gJ[(this.jdField_if * m + i3)], i1, i2 + i3 * (h.eA + 1), 20);
    }
    if (this.jdField_if > 0) {
      this.a.a(i - 10 - 10, 30 + (this.jdField_do.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
    }
    if (this.jdField_if < n - 1) {
      this.a.a(i - 10 - 10, j - 20 + (this.jdField_do.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
    }
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      this.jdField_if = 0;
      this.jdField_for = ((byte)(this.jdField_for - 1));
      if (this.jdField_for < 0) {
        this.jdField_for = 0;
      }
      this.jdField_do.gJ = null;
      break;
    case 4: 
      if (this.a.bR.jdField_long != null)
      {
        this.jdField_if = 0;
        this.jdField_for = ((byte)(this.jdField_for + 1));
        if (this.jdField_for == this.a.bR.jdField_long.length) {
          this.jdField_for = ((byte)(this.a.bR.jdField_long.length - 1));
        }
        this.jdField_do.gJ = null;
      }
      break;
    case 1: 
      this.jdField_if = ((byte)(this.jdField_if - 1));
      if (this.jdField_if < 0) {
        this.jdField_if = 0;
      }
      break;
    case 2: 
      this.jdField_if = ((byte)(this.jdField_if + 1));
      break;
    case 7: 
      this.jdField_do.gJ = null;
      this.a.bR.jdField_new = null;
      this.a.bR.jdField_long = null;
      this.jdField_do.jdField_do = 0;
      this.jdField_do.jj = null;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\n.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */