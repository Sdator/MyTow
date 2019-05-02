import javax.microedition.lcdui.Graphics;

public class i
{
  String[] jdField_do = null;
  short jdField_for;
  byte jdField_try;
  byte jdField_new;
  int[] jdField_int;
  h a = null;
  g jdField_if = null;
  
  public i(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a()
  {
    this.jdField_if.E();
    this.a.a((byte)2, 0, 0, h.dU, h.fp, true);
    int i = (byte)this.jdField_do.length;
    int j = (byte)((h.fp - (h.o(this.jdField_for) ? 3 : 1) * 2 * h.eA) / (h.eA + 1));
    int k = (short)(i / j);
    if (k * j < i) {
      k = (short)(k + 1);
    }
    if (this.jdField_try >= k) {
      this.jdField_try = ((byte)(k - 1));
    }
    this.a.fj.setColor(h.b2[2][1]);
    int m = 5;
    int n = (short)(30 + (h.o(this.jdField_for) ? 3 * h.eA : 0));
    if (h.o(this.jdField_for))
    {
      if (this.jdField_int == null)
      {
        this.jdField_int = new int[5];
        this.jdField_int[1] = -1;
        this.a.b0.a(this.a.cZ.jdMethod_int((byte)21), 0, this.jdField_int);
      }
      this.a.b0.a((h.dU - 40) / 2, 20, this.a.o, this.jdField_int, 0, this.a.cZ.fa, this.a.cZ.bo);
      this.a.a((h.dU - 40) / 2, 20, this.a.cZ.gD, this.a.cZ.bo, (short)a3.jdMethod_int(this.a.cZ.H[a.ac], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.char], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.t], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.i], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.J], a.C), (short)a3.jdMethod_int(this.a.cZ.H[a.L], a.C), this.jdField_for, this.jdField_if.jdField_int);
      this.a.b0.a(this.jdField_int);
    }
    for (int i1 = 0; (i1 < j) && (this.jdField_try * j + i1 <= this.jdField_do.length - 1); i1 = (byte)(i1 + 1)) {
      this.a.fj.drawString(this.jdField_do[(this.jdField_try * j + i1)], m, n + i1 * (h.eA + 1), 20);
    }
    if (this.jdField_try > 0) {
      this.a.a(h.dU - 10 - 10, 30 + (this.jdField_if.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
    }
    if (this.jdField_try < k - 1) {
      this.a.a(h.dU - 10 - 10, h.fp - 20 + (this.jdField_if.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
    }
    this.a.c();
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      this.jdField_try = ((byte)(this.jdField_try - 1));
      if (this.jdField_try < 0) {
        this.jdField_try = 0;
      }
      break;
    case 2: 
      this.jdField_try = ((byte)(this.jdField_try + 1));
      break;
    case 7: 
      this.jdField_do = null;
      this.jdField_if.jdField_do = ((short)this.jdField_new);
      this.a.du = null;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */