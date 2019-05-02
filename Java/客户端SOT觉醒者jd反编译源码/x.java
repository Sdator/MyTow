import java.io.DataInputStream;
import java.io.PrintStream;
import javax.microedition.lcdui.Image;

public class x
{
  final short[] c = { 0, 1, 12, 13, 43, 78, 81, 104, 123, 124, 176, 177 };
  private h jdField_else;
  short[][] jdField_try;
  byte[] jdField_if;
  int[][] jdField_case;
  int[] b;
  byte[] jdField_for = new byte[4];
  byte[][] jdField_int;
  byte d;
  int jdField_long = -1;
  int jdField_void;
  int a;
  boolean jdField_new = true;
  boolean jdField_do;
  byte[][] jdField_goto;
  public static final byte jdField_byte = 15;
  public static final byte jdField_char = 15;
  public static final byte[][] jdField_null = { { 0, 1, 2, 3, 4, 5, 6, 7 }, { 1, 0, 3, 2, 5, 4, 7, 6 }, { 2, 3, 0, 1, 6, 7, 4, 5 }, { 3, 2, 1, 0, 7, 6, 5, 4 }, { 4, 6, 5, 7, 0, 2, 1, 3 }, { 5, 7, 4, 6, 1, 3, 0, 2 }, { 6, 4, 7, 5, 2, 0, 3, 1 }, { 7, 5, 6, 4, 3, 1, 2, 0 } };
  
  public x(h paramh)
  {
    this.jdField_else = paramh;
  }
  
  public void a(String paramString)
  {
    DataInputStream localDataInputStream = new DataInputStream(getClass().getResourceAsStream(paramString));
    a(localDataInputStream, true);
  }
  
  public void a(DataInputStream paramDataInputStream, boolean paramBoolean)
  {
    try
    {
      int i = paramDataInputStream.readShort();
      this.b = new int[i];
      for (int m = 0; m < i; m++) {
        this.b[m] = paramDataInputStream.readInt();
      }
      for (m = 0; m < 4; m++) {
        this.jdField_for[m] = paramDataInputStream.readByte();
      }
      i = paramDataInputStream.readShort();
      m = paramDataInputStream.readByte();
      if (m == 1)
      {
        this.jdField_do = true;
        this.jdField_goto = new byte[i][3];
      }
      else
      {
        this.jdField_do = false;
      }
      this.jdField_int = new byte[i][4];
      this.jdField_case = new int[i][];
      int i1;
      for (int n = 0; n < i; n++)
      {
        int k = paramDataInputStream.readByte();
        this.jdField_case[n] = new int[k];
        for (i1 = 0; i1 < k; i1++) {
          this.jdField_case[n][i1] = paramDataInputStream.readInt();
        }
        this.jdField_int[n][0] = paramDataInputStream.readByte();
        this.jdField_int[n][1] = paramDataInputStream.readByte();
        this.jdField_int[n][2] = paramDataInputStream.readByte();
        this.jdField_int[n][3] = paramDataInputStream.readByte();
        if (this.jdField_do)
        {
          this.jdField_goto[n][0] = paramDataInputStream.readByte();
          this.jdField_goto[n][1] = paramDataInputStream.readByte();
          this.jdField_goto[n][2] = paramDataInputStream.readByte();
        }
      }
      i = paramDataInputStream.readShort();
      this.jdField_if = new byte[i];
      this.jdField_try = new short[i][];
      for (n = 0; n < i; n++)
      {
        int j = paramDataInputStream.readUnsignedByte();
        this.jdField_if[n] = ((byte)j);
        this.jdField_try[n] = new short[j * 2];
        for (i1 = 0; i1 < this.jdField_try[n].length; i1 += 2)
        {
          this.jdField_try[n][i1] = paramDataInputStream.readShort();
          this.jdField_try[n][(i1 + 1)] = ((short)paramDataInputStream.readByte());
        }
      }
      if (paramBoolean)
      {
        paramDataInputStream.close();
        paramDataInputStream = null;
      }
    }
    catch (Exception localException) {}
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.d = ((byte)paramArrayOfInt[0]);
    this.jdField_long = paramArrayOfInt[1];
    this.jdField_void = paramArrayOfInt[2];
    this.a = paramArrayOfInt[3];
    this.jdField_new = (paramArrayOfInt[4] == 0);
    this.d = ((byte)(this.d + 1));
    if (this.d < this.jdField_try[this.jdField_long][((this.jdField_void << 1) + 1)])
    {
      paramArrayOfInt[0] = this.d;
      paramArrayOfInt[1] = this.jdField_long;
      paramArrayOfInt[2] = this.jdField_void;
      paramArrayOfInt[3] = this.a;
      paramArrayOfInt[4] = (this.jdField_new == true ? 0 : 1);
      return;
    }
    this.jdField_void += 1;
    if (this.jdField_void > this.jdField_if[this.jdField_long] - 1)
    {
      this.jdField_void = 0;
      this.jdField_new = true;
    }
    this.a = a(this.jdField_long, this.jdField_void);
    this.d = 0;
    paramArrayOfInt[0] = this.d;
    paramArrayOfInt[1] = this.jdField_long;
    paramArrayOfInt[2] = this.jdField_void;
    paramArrayOfInt[3] = this.a;
    paramArrayOfInt[4] = (this.jdField_new == true ? 0 : 1);
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.jdField_if.length)) {
      return -1;
    }
    if ((paramInt2 < 0) || (paramInt2 >= this.jdField_if[paramInt1])) {
      return -1;
    }
    return this.jdField_try[paramInt1][(paramInt2 << 1)];
  }
  
  public boolean jdMethod_if(int[] paramArrayOfInt)
  {
    return (paramArrayOfInt[2] == this.jdField_if[paramArrayOfInt[1]] - 1) && (paramArrayOfInt[0] == this.jdField_try[paramArrayOfInt[1]][((paramArrayOfInt[2] << 1) + 1)] - 1);
  }
  
  public byte[] a(int paramInt)
  {
    return this.jdField_int[paramInt];
  }
  
  public boolean a(int[] paramArrayOfInt1, int paramInt1, int[] paramArrayOfInt2, int paramInt2)
  {
    return (paramArrayOfInt1[paramInt1] > paramArrayOfInt2[paramInt2] - paramArrayOfInt1[(paramInt1 + 2)]) && (paramArrayOfInt1[paramInt1] < paramArrayOfInt2[paramInt2] + paramArrayOfInt2[(paramInt1 + 2)]) && (paramArrayOfInt1[(paramInt1 + 1)] > paramArrayOfInt2[(paramInt2 + 1)] - paramArrayOfInt1[(paramInt1 + 3)]) && (paramArrayOfInt1[(paramInt1 + 1)] < paramArrayOfInt2[(paramInt2 + 1)] + paramArrayOfInt2[(paramInt1 + 3)]);
  }
  
  public boolean jdMethod_if(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    return (paramInt1 > paramInt5 - paramInt3) && (paramInt1 < paramInt5 + paramInt7) && (paramInt2 > paramInt6 - paramInt4) && (paramInt2 < paramInt6 + paramInt8);
  }
  
  public void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (paramInt1 == paramArrayOfInt[1]) {
      return;
    }
    int i = a(paramInt1, paramInt2);
    if (i < 0) {
      return;
    }
    paramArrayOfInt[0] = 0;
    paramArrayOfInt[1] = paramInt1;
    paramArrayOfInt[2] = 0;
    paramArrayOfInt[3] = i;
    paramArrayOfInt[4] = 1;
  }
  
  private void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (int i4 = 0; i4 < this.jdField_case[paramInt4].length; i4++)
    {
      int i = this.jdField_case[paramInt4][i4] & 0x7FF;
      int j = this.jdField_case[paramInt4][i4] >> 11 & 0x7;
      int k = this.b[i] & 0x1FF;
      int m = this.b[i] >> 9 & 0x1FF;
      int n = this.b[i] >> 18 & 0x7F;
      int i1 = this.b[i] >> 25 & 0x7F;
      int i2 = paramInt1;
      int i3 = paramInt2;
      int i5 = (byte)(this.jdField_case[paramInt4][i4] >> 14 & 0xFF);
      int i6 = (byte)(this.jdField_case[paramInt4][i4] >> 22 & 0xFF);
      short[] arrayOfShort = a(i2, i3, i5, i6, n, i1, j, paramInt3);
      this.jdField_else.a(arrayOfShort[0], arrayOfShort[1], n, i1, k, m, paramImage, arrayOfShort[2]);
    }
  }
  
  private void a(Image[][] paramArrayOfImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    for (int i2 = 0; i2 < this.jdField_case[paramInt4].length; i2++)
    {
      int i = this.jdField_case[paramInt4][i2] & 0x7FF;
      int j = this.jdField_case[paramInt4][i2] >> 11 & 0x7;
      int i3 = paramInt5;
      if ((paramArrayOfImage == this.jdField_else.o) && (paramArrayOfImage[i].length == 1)) {
        i3 = 0;
      }
      int k = this.b[i] >> 18 & 0x7F;
      int m = this.b[i] >> 25 & 0x7F;
      int n = paramInt1;
      int i1 = paramInt2;
      int i4 = (byte)(this.jdField_case[paramInt4][i2] >> 14 & 0xFF);
      int i5 = (byte)(this.jdField_case[paramInt4][i2] >> 22 & 0xFF);
      short[] arrayOfShort = a(n, i1, i4, i5, k, m, j, paramInt3);
      try
      {
        this.jdField_else.a(arrayOfShort[0], arrayOfShort[1], k, m, 0, 0, paramArrayOfImage[i][i3], arrayOfShort[2]);
      }
      catch (Exception localException)
      {
        System.out.println(paramArrayOfImage.length + " " + paramArrayOfImage[i].length + " " + i + " " + i3);
        localException.printStackTrace();
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, Image paramImage, int[] paramArrayOfInt, int paramInt3)
  {
    this.d = ((byte)paramArrayOfInt[0]);
    this.jdField_long = paramArrayOfInt[1];
    this.jdField_void = paramArrayOfInt[2];
    this.a = paramArrayOfInt[3];
    if (this.a == -1) {
      this.a = 0;
    }
    this.jdField_new = (paramArrayOfInt[4] == 0);
    a(paramImage, paramInt1, paramInt2, paramInt3, this.a);
  }
  
  public void a(int paramInt1, int paramInt2, Image[][] paramArrayOfImage, int[] paramArrayOfInt, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    this.d = ((byte)paramArrayOfInt[0]);
    this.jdField_long = paramArrayOfInt[1];
    this.jdField_void = paramArrayOfInt[2];
    this.a = paramArrayOfInt[3];
    if (this.a == -1) {
      this.a = 0;
    }
    this.jdField_new = (paramArrayOfInt[4] == 0);
    int i = (byte)((paramBoolean ? 1 : 0) * (paramInt4 + 1));
    a(paramArrayOfImage, paramInt1, paramInt2, paramInt3, this.a, i);
  }
  
  public void a(short paramShort, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte1, byte paramByte2, int[] paramArrayOfInt, int paramInt5)
  {
    if (!this.jdField_do) {
      return;
    }
    int i = this.jdField_goto[paramArrayOfInt[3]][0];
    int j = this.jdField_goto[paramArrayOfInt[3]][1];
    if ((i != 0) || (j != 0))
    {
      int k = this.jdField_goto[paramArrayOfInt[3]][2];
      short[] arrayOfShort = a(paramInt1, paramInt2, i, j, 15, 15, k, paramByte1);
      int m = h.j(paramShort);
      if (m == 3) {
        this.jdField_else.a(paramByte2 == 1 ? paramInt1 + i : paramInt1 - i + 3, paramInt2 + j, 16, 17, 16 * (paramInt5 / 2 % 3), 9, this.jdField_else.eD, arrayOfShort[2]);
      }
      this.jdField_else.a(paramByte2 == 1 ? paramInt1 + i : paramInt1 - i + 3, paramInt2 + j, 15, 15, paramInt4 * 15, paramInt3 * 15, paramImage, arrayOfShort[2]);
      if ((m > 0) && (m < 3)) {
        this.jdField_else.a(paramByte2 == 1 ? paramInt1 + i : paramInt1 - i + 3, paramInt2 + j, m, paramInt5 / 2 % 3);
      }
    }
  }
  
  public short[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    short[] arrayOfShort = new short[3];
    switch (paramInt8)
    {
    case 0: 
      paramInt1 += paramInt3;
      paramInt2 += paramInt4;
      break;
    case 2: 
      paramInt1 += this.jdField_for[2] + this.jdField_for[0] - paramInt3;
      paramInt2 += paramInt4;
      break;
    case 7: 
      paramInt1 += this.jdField_for[3] + this.jdField_for[1] - paramInt4;
      paramInt2 += this.jdField_for[2] + this.jdField_for[0] - paramInt3;
      break;
    case 1: 
      paramInt1 += paramInt3;
      paramInt2 += this.jdField_for[3] + this.jdField_for[1] - paramInt4;
      break;
    case 4: 
      paramInt1 += paramInt4;
      paramInt2 += paramInt3;
      break;
    case 3: 
      paramInt1 += this.jdField_for[2] + this.jdField_for[0] - paramInt3;
      paramInt2 += this.jdField_for[3] + this.jdField_for[1] - paramInt4;
      break;
    case 6: 
      paramInt1 += paramInt4;
      paramInt2 += this.jdField_for[2] + this.jdField_for[0] - paramInt3;
      break;
    case 5: 
      paramInt1 += this.jdField_for[3] + this.jdField_for[1] - paramInt4;
      paramInt2 += paramInt3;
    }
    paramInt7 = null[paramInt7][paramInt8];
    switch (paramInt7)
    {
    case 0: 
      break;
    case 2: 
      paramInt1 -= paramInt5;
      break;
    case 7: 
      paramInt1 -= paramInt6;
      paramInt2 -= paramInt5;
      break;
    case 1: 
      paramInt2 -= paramInt6;
      break;
    case 4: 
      break;
    case 5: 
      paramInt1 -= paramInt6;
      break;
    case 3: 
      paramInt1 -= paramInt5;
      paramInt2 -= paramInt6;
      break;
    case 6: 
      paramInt2 -= paramInt5;
    }
    arrayOfShort[0] = ((short)paramInt1);
    arrayOfShort[1] = ((short)paramInt2);
    arrayOfShort[2] = ((short)(byte)paramInt7);
    return arrayOfShort;
  }
  
  public static Image[][] a(DataInputStream paramDataInputStream)
  {
    try
    {
      int i = paramDataInputStream.readShort();
      Image[][] arrayOfImage = new Image[i][];
      for (int j = 0; j < i; j = (short)(j + 1))
      {
        int k = paramDataInputStream.readShort();
        arrayOfImage[j] = new Image[k];
        int m = i * k;
        for (int n = 0; n < k; n = (short)(n + 1))
        {
          int i1 = j * k + n;
          y.W = i1 * 100 / m;
          paramDataInputStream.readShort();
          paramDataInputStream.readByte();
          int i2 = paramDataInputStream.readShort();
          byte[] arrayOfByte1 = new byte[i2];
          paramDataInputStream.readFully(arrayOfByte1);
          int i3 = paramDataInputStream.readShort();
          byte[] arrayOfByte2 = new byte[i3];
          paramDataInputStream.readFully(arrayOfByte2);
          int i4 = paramDataInputStream.readShort();
          byte[] arrayOfByte3 = new byte[i4];
          paramDataInputStream.readFully(arrayOfByte3);
          byte[] arrayOfByte4 = new byte[arrayOfByte1.length + arrayOfByte2.length + arrayOfByte3.length];
          System.arraycopy(arrayOfByte2, 0, arrayOfByte4, 0, arrayOfByte2.length);
          System.arraycopy(arrayOfByte1, 0, arrayOfByte4, arrayOfByte2.length, arrayOfByte1.length);
          System.arraycopy(arrayOfByte3, 0, arrayOfByte4, arrayOfByte2.length + arrayOfByte1.length, arrayOfByte3.length);
          arrayOfImage[j][n] = Image.createImage(arrayOfByte4, 0, arrayOfByte4.length);
        }
      }
      return arrayOfImage;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return (Image[][])null;
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\x.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */