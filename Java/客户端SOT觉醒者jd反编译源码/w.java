import javax.microedition.lcdui.Graphics;

public class w
{
  h a = null;
  g jdField_if = null;
  String jdField_new = null;
  String jdField_do;
  byte jdField_int;
  byte jdField_byte;
  boolean jdField_try;
  byte jdField_for;
  
  public w(h paramh, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
    this.jdField_new = paramString;
    this.jdField_if.f4 = paramInt1;
    this.jdField_if.hG = paramInt2;
    this.jdField_if.mn = a3.jdMethod_new(paramInt3, 4);
    this.jdField_for = ((byte)String.valueOf(paramInt2).length());
    this.jdField_do = ("00000000000000" + a3.jdMethod_do(this.jdField_if.mn, 4));
    this.jdField_do = this.jdField_do.substring(this.jdField_do.length() - this.jdField_for);
    this.jdField_int = ((byte)(this.jdField_for - 1));
    this.jdField_byte = Byte.parseByte(this.jdField_do.substring(this.jdField_int, this.jdField_int + 1));
    this.jdField_try = true;
  }
  
  public void a()
  {
    int i = (short)(this.jdField_for * 5 + 40 + 16);
    int j = 30;
    int k = (short)((h.dU - i) / 2);
    int m = (short)(h.fp / 2 - j / 2);
    this.a.a((byte)2, k, m, i, j, true);
    this.a.fj.setColor(h.b2[5][0]);
    this.a.fj.drawString(this.jdField_new, k + 4, m + 2, 0);
    if (this.jdField_try) {
      for (int n = 0; n < this.jdField_for; n = (byte)(n + 1)) {
        if (n == this.jdField_int)
        {
          this.a.a(k + 50 + n * 5 - 4, m + 12 - 8 + (this.jdField_if.jdField_int % 10 == 0 ? 0 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
          this.a.a(k + 50 + n * 5 - 4, m + 12 + 7 + (this.jdField_if.jdField_int % 10 == 0 ? 0 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
          if (this.jdField_if.jdField_int % 10 == 0) {}
        }
        else
        {
          int i1 = Byte.parseByte(this.jdField_do.substring(n, n + 1));
          this.a.a(k + 50 + n * 5, m + 12, 5, 7, i1 * 5, 0, this.a.aH[5], 0);
        }
      }
    } else {
      this.a.a(k + 50 + 5 * (this.jdField_for - String.valueOf(a3.jdMethod_do(this.jdField_if.mn, 4)).length()), m + 12, a3.jdMethod_do(this.jdField_if.mn, 4), 20);
    }
  }
  
  public byte a(int paramInt)
  {
    int i;
    StringBuffer localStringBuffer2;
    StringBuffer localStringBuffer3;
    switch (paramInt)
    {
    case 4: 
      if (this.jdField_try)
      {
        this.jdField_int = ((byte)(this.jdField_int + 1));
        if (this.jdField_int > this.jdField_for - 1) {
          this.jdField_int = 0;
        }
        this.jdField_byte = Byte.parseByte(this.jdField_do.substring(this.jdField_int, this.jdField_int + 1));
      }
      break;
    case 3: 
      if (this.jdField_try)
      {
        this.jdField_int = ((byte)(this.jdField_int - 1));
        if (this.jdField_int < 0) {
          this.jdField_int = ((byte)(this.jdField_for - 1));
        }
        this.jdField_byte = Byte.parseByte(this.jdField_do.substring(this.jdField_int, this.jdField_int + 1));
      }
      break;
    case 2: 
      if (this.jdField_try)
      {
        i = (byte)(this.jdField_byte - 1);
        if (i < 0) {
          i = 9;
        }
        localStringBuffer2 = new StringBuffer(this.jdField_do);
        localStringBuffer2.setCharAt(this.jdField_int, (char)(48 + i));
        if ((Integer.parseInt(localStringBuffer2.toString()) > this.jdField_if.hG) || (Integer.parseInt(localStringBuffer2.toString()) < this.jdField_if.f4)) {
          return -1;
        }
        this.jdField_byte = ((byte)(this.jdField_byte - 1));
        if (this.jdField_byte < 0) {
          this.jdField_byte = 9;
        }
        localStringBuffer3 = new StringBuffer(this.jdField_do);
        localStringBuffer3.setCharAt(this.jdField_int, (char)(48 + this.jdField_byte));
        try
        {
          this.jdField_if.mn = a3.jdMethod_new(Integer.parseInt(localStringBuffer3.toString()), 4);
        }
        catch (Exception localException2) {}
        this.jdField_do = ("00000000000000" + a3.jdMethod_do(this.jdField_if.mn, 4));
        this.jdField_do = this.jdField_do.substring(this.jdField_do.length() - this.jdField_for);
      }
      break;
    case 1: 
      if (this.jdField_try)
      {
        i = (byte)(this.jdField_byte + 1);
        if (i > 9) {
          i = 0;
        }
        localStringBuffer2 = new StringBuffer(this.jdField_do);
        localStringBuffer2.setCharAt(this.jdField_int, (char)(48 + i));
        if ((Integer.parseInt(localStringBuffer2.toString()) > this.jdField_if.hG) || (Integer.parseInt(localStringBuffer2.toString()) < this.jdField_if.f4)) {
          return -1;
        }
        this.jdField_byte = ((byte)(this.jdField_byte + 1));
        if (this.jdField_byte > 9) {
          this.jdField_byte = 0;
        }
        localStringBuffer3 = new StringBuffer(this.jdField_do);
        localStringBuffer3.setCharAt(this.jdField_int, (char)(48 + this.jdField_byte));
        try
        {
          this.jdField_if.mn = a3.jdMethod_new(Integer.parseInt(localStringBuffer3.toString()), 4);
        }
        catch (Exception localException3)
        {
          h.a(localException3);
        }
        this.jdField_do = ("00000000000000" + a3.jdMethod_do(this.jdField_if.mn, 4));
        this.jdField_do = this.jdField_do.substring(this.jdField_do.length() - this.jdField_for);
      }
      break;
    case 5: 
    case 6: 
      if (this.jdField_try)
      {
        StringBuffer localStringBuffer1 = new StringBuffer(this.jdField_do);
        localStringBuffer1.setCharAt(this.jdField_int, (char)(48 + this.jdField_byte));
        if ((Integer.parseInt(localStringBuffer1.toString()) > this.jdField_if.hG) || (Integer.parseInt(localStringBuffer1.toString()) < this.jdField_if.f4)) {
          return 2;
        }
        try
        {
          this.jdField_if.mn = a3.jdMethod_new(Integer.parseInt(localStringBuffer1.toString()), 4);
        }
        catch (Exception localException1) {}
        this.jdField_do = ("00000000000000" + a3.jdMethod_do(this.jdField_if.mn, 4));
        this.jdField_do = this.jdField_do.substring(this.jdField_do.length() - this.jdField_for);
        return 0;
      }
      break;
    case 7: 
      this.a.d9 = null;
      return 1;
    }
    return -1;
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\w.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */