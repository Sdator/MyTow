import java.io.IOException;

public class f
{
  private static final int jdField_new = 1;
  private static final int jdField_int = 2;
  private static final int jdField_for = 4;
  private static final int jdField_do = 8;
  private static final int b = 16;
  private static final int jdField_void = 0;
  private static final int jdField_null = 1;
  private static final int jdField_long = 2;
  private static final int jdField_goto = 3;
  private static final int jdField_else = 16;
  private static final int jdField_char = 287;
  private static final int jdField_case = 31;
  private static final int jdField_byte = 18;
  private static final int jdField_try = 256;
  private static final int[] jdField_if = { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 99, 99 };
  private static final int[] a = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0 };
  private static final int[] h = { 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13 };
  private static final int[] g = { 1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577 };
  private static final int[] f = { 16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15 };
  private static int e;
  private static int d;
  private static int c;
  
  public static byte[] a(byte[] paramArrayOfByte)
    throws IOException
  {
    e = d = c = 0;
    if ((a(paramArrayOfByte, 16) != 35615) || (a(paramArrayOfByte, 8) != 8)) {
      throw new IOException("Invalid GZIP format");
    }
    int i = a(paramArrayOfByte, 8);
    e += 6;
    if ((i & 0x4) != 0) {
      e += a(paramArrayOfByte, 16);
    }
    while (((i & 0x8) != 0) && (paramArrayOfByte[(e++)] != 0)) {}
    while (((i & 0x10) != 0) && (paramArrayOfByte[(e++)] != 0)) {}
    if ((i & 0x2) != 0) {
      e += 2;
    }
    int j = e;
    e = paramArrayOfByte.length - 4;
    byte[] arrayOfByte1 = new byte[a(paramArrayOfByte, 16) | a(paramArrayOfByte, 16) << 16];
    int k = 0;
    e = j;
    int m = 0;
    int n = 0;
    do
    {
      m = a(paramArrayOfByte, 1);
      n = a(paramArrayOfByte, 2);
      if (n == 0)
      {
        c = 0;
        int i1 = a(paramArrayOfByte, 16);
        int i2 = a(paramArrayOfByte, 16);
        System.arraycopy(paramArrayOfByte, e, arrayOfByte1, k, i1);
        e += i1;
        k += i1;
      }
      else
      {
        int i5;
        int[] arrayOfInt1;
        int[] arrayOfInt2;
        if (n == 2)
        {
          int i3 = a(paramArrayOfByte, 5) + 257;
          i5 = a(paramArrayOfByte, 5) + 1;
          i7 = a(paramArrayOfByte, 4) + 4;
          byte[] arrayOfByte4 = new byte[19];
          for (int i9 = 0; i9 < i7; i9++) {
            arrayOfByte4[f[i9]] = ((byte)a(paramArrayOfByte, 3));
          }
          int[] arrayOfInt3 = jdMethod_if(arrayOfByte4, 18);
          arrayOfInt1 = jdMethod_if(a(paramArrayOfByte, arrayOfInt3, i3), i3 - 1);
          arrayOfInt2 = jdMethod_if(a(paramArrayOfByte, arrayOfInt3, i5), i5 - 1);
        }
        else
        {
          byte[] arrayOfByte2 = new byte['Ġ'];
          for (i5 = 0; i5 < 144; i5++) {
            arrayOfByte2[i5] = 8;
          }
          for (i5 = 144; i5 < 256; i5++) {
            arrayOfByte2[i5] = 9;
          }
          for (i5 = 256; i5 < 280; i5++) {
            arrayOfByte2[i5] = 7;
          }
          for (i5 = 280; i5 < 288; i5++) {
            arrayOfByte2[i5] = 8;
          }
          arrayOfInt1 = jdMethod_if(arrayOfByte2, 287);
          byte[] arrayOfByte3 = new byte[32];
          for (i7 = 0; i7 < arrayOfByte3.length; i7++) {
            arrayOfByte3[i7] = 5;
          }
          arrayOfInt2 = jdMethod_if(arrayOfByte3, 31);
        }
        int i4 = 0;
        int i6 = 0;
        int i7 = 0;
        while ((i4 = a(paramArrayOfByte, arrayOfInt1)) != 256) {
          if (i4 > 256)
          {
            i4 -= 257;
            int i8 = a[i4];
            if ((i6 = if[i4]) > 0) {
              i8 += a(paramArrayOfByte, i6);
            }
            i4 = a(paramArrayOfByte, arrayOfInt2);
            int i10 = g[i4];
            if ((i7 = h[i4]) > 0) {
              i10 += a(paramArrayOfByte, i7);
            }
            int i11 = k - i10;
            while (i10 < i8)
            {
              System.arraycopy(arrayOfByte1, i11, arrayOfByte1, k, i10);
              k += i10;
              i8 -= i10;
              i10 <<= 1;
            }
            System.arraycopy(arrayOfByte1, i11, arrayOfByte1, k, i8);
            k += i8;
          }
          else
          {
            arrayOfByte1[(k++)] = ((byte)i4);
          }
        }
      }
    } while (m == 0);
    return arrayOfByte1;
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = c == 0 ? (d = paramArrayOfByte[(e++)] & 0xFF) : d >> c;
    for (int j = 8 - c; j < paramInt; j += 8)
    {
      d = paramArrayOfByte[(e++)] & 0xFF;
      i |= d << j;
    }
    c = c + paramInt & 0x7;
    return i & (1 << paramInt) - 1;
  }
  
  private static int a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    while (i >= 0)
    {
      if (c == 0) {
        d = paramArrayOfByte[(e++)] & 0xFF;
      }
      i = (d & 1 << c) == 0 ? paramArrayOfInt[(i >> 16)] : paramArrayOfInt[(i & 0xFFFF)];
      c = c + 1 & 0x7;
    }
    return i & 0xFFFF;
  }
  
  private static byte[] a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    int j = 0;
    for (int k = 0; i < paramInt; k = j)
    {
      j = a(paramArrayOfByte, paramArrayOfInt);
      if (j >= 16)
      {
        int m = 0;
        if (j == 16)
        {
          m = 3 + a(paramArrayOfByte, 2);
          j = k;
        }
        else
        {
          if (j == 17) {
            m = 3 + a(paramArrayOfByte, 3);
          } else {
            m = 11 + a(paramArrayOfByte, 7);
          }
          j = 0;
        }
        while (m-- > 0) {
          arrayOfByte[(i++)] = ((byte)j);
        }
      }
      else
      {
        arrayOfByte[(i++)] = ((byte)j);
      }
    }
    return arrayOfByte;
  }
  
  private static int[] jdMethod_if(byte[] paramArrayOfByte, int paramInt)
  {
    int[] arrayOfInt1 = new int[17];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfInt1[paramArrayOfByte[i]] += 1;
    }
    i = 0;
    arrayOfInt1[0] = 0;
    int[] arrayOfInt2 = new int[17];
    for (int j = 1; j <= 16; j++) {
      arrayOfInt2[j] = (i = i + arrayOfInt1[(j - 1)] << 1);
    }
    int[] arrayOfInt3 = new int[(paramInt << 1) + 16];
    int k = 1;
    for (int m = 0; m <= paramInt; m++)
    {
      int n = paramArrayOfByte[m];
      if (n != 0)
      {
        int tmp110_108 = n;
        int[] tmp110_106 = arrayOfInt2;
        int tmp112_111 = tmp110_106[tmp110_108];
        tmp110_106[tmp110_108] = (tmp112_111 + 1);
        i = tmp112_111;
        int i1 = 0;
        for (int i2 = n - 1; i2 >= 0; i2--)
        {
          int i3 = i & 1 << i2;
          int i4;
          if (i3 == 0)
          {
            i4 = arrayOfInt3[i1] >> 16;
            if (i4 == 0)
            {
              arrayOfInt3[i1] |= k << 16;
              i1 = k++;
            }
            else
            {
              i1 = i4;
            }
          }
          else
          {
            i4 = arrayOfInt3[i1] & 0xFFFF;
            if (i4 == 0)
            {
              arrayOfInt3[i1] |= k;
              i1 = k++;
            }
            else
            {
              i1 = i4;
            }
          }
        }
        arrayOfInt3[i1] = (0x80000000 | m);
      }
    }
    return arrayOfInt3;
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\f.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */