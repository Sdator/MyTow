import java.io.DataInputStream;

public class ao
{
  public static final byte jdField_byte = 0;
  public static final byte q = 1;
  public static final byte e = 2;
  public static final byte jdField_try = 3;
  public static final byte s = 4;
  public static final byte k = 0;
  public static final byte jdField_else = 1;
  public static final byte G = 2;
  public static final byte c = 3;
  public static final byte p = 4;
  public static final byte x = 5;
  public static final byte A = 6;
  public static final byte O = 7;
  public static final byte jdField_goto = 8;
  public static final byte d = 9;
  public static final byte D = 11;
  public static final byte b = 12;
  public static final byte n = 13;
  public static final byte t = 14;
  public static final byte L = 15;
  public static final byte I = 16;
  public static final byte l = 17;
  public static final byte w = 10;
  public static final byte v = 18;
  public static final byte jdField_new = 19;
  public static final byte a = 20;
  public static final byte g = 21;
  public static final byte F = 22;
  public static final byte u = 23;
  public static final byte H = 24;
  public static final byte K = 0;
  public static final byte y = 1;
  public static final byte jdField_do = 2;
  public static final byte m = 3;
  public static final byte f = 4;
  public static final byte jdField_case = 5;
  public static final byte M = 6;
  public static final byte jdField_if = 7;
  public static final byte jdField_null = 8;
  public static final byte J = 9;
  public short E;
  public String h;
  public byte N;
  public byte r;
  public boolean jdField_char;
  public byte P;
  public String C;
  public byte B;
  public int jdField_void;
  public short j;
  public short jdField_long;
  public int o;
  public int[] jdField_for;
  public String i;
  public short[][] jdField_int;
  public byte z;
  
  public ao(DataInputStream paramDataInputStream)
  {
    try
    {
      this.E = paramDataInputStream.readShort();
      this.h = paramDataInputStream.readUTF();
      this.i = paramDataInputStream.readUTF();
      this.P = paramDataInputStream.readByte();
      this.N = paramDataInputStream.readByte();
      this.r = paramDataInputStream.readByte();
      this.jdField_char = (paramDataInputStream.readByte() == 1);
      this.j = paramDataInputStream.readShort();
      this.jdField_long = paramDataInputStream.readShort();
      this.o = paramDataInputStream.readInt();
      this.jdField_int = new short[paramDataInputStream.readByte()][2];
      for (int i1 = 0; i1 < this.jdField_int.length; i1 = (byte)(i1 + 1))
      {
        this.jdField_int[i1][0] = paramDataInputStream.readShort();
        this.jdField_int[i1][1] = ((short)paramDataInputStream.readByte());
      }
      paramDataInputStream.skipBytes(20);
      i1 = paramDataInputStream.readByte();
      this.jdField_for = new int[i1];
      for (int i2 = 0; i2 < this.jdField_for.length; i2 = (byte)(i2 + 1)) {
        this.jdField_for[i2] = paramDataInputStream.readInt();
      }
      this.C = paramDataInputStream.readUTF();
      this.B = paramDataInputStream.readByte();
      this.jdField_void = paramDataInputStream.readInt();
    }
    catch (Exception localException) {}
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ao.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */