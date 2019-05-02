import javax.microedition.lcdui.Graphics;

public class s
{
  static final byte[][] jdField_case = { { -26, -106, -94, -27, -73, -112, -29, -101, -96, -19, -75, -106, -22, -121, -86, -22, -100, -85, -9, -116, -117, -15, -82, -70, -4, -92, -91, -4, -120, -75, -10, -80, -123, -57, -88, -93, -52, -90, -101, 9 }, { -23, -84, -106, -26, -114, -98, -30, -65, -123, -31, -68, -72, 45 }, { -24, -126, -65, -22, -125, -118, -32, -96, -75, 33, -18, -74, -127, -23, -76, -127, -7, -68, -122, -10, -98, -114, -16, -80, -91, -3, -94, -112, -6, -117, -89, 54, -57, -69, -90, -58, -103, -74, -61, -82, -91, -63, -87, -106, -59, -86, -95, -54, -78, -103, -41, -105, -77, -47, -114, -70, -48, -113, -119, -33, -121, -104, -38, -126, -1, -90, -42, -21, -94, -24, -30, -95, -62, -55, -94, -56, -15, 99 }, { -24, -82, -89, -21, -89, Byte.MIN_VALUE, -29, -93, -113, -20, -82, -113, -24, -73, Byte.MIN_VALUE, -26, -124, -112, -9, -67, -114, -14, -100, -95, -2, -103, -101, 55, -8, -91, -109, -9, -93, -100, -57, -82, -100, -63, -98, -84, 6 }, { -27, -79, -125, -26, -119, -75, -31, -115, -66, -17, -118, -118, -23, -93, -82, -24, -103, -72, -12, -102, -103, -3, -107, -86, -4, -93, -66, -3, -124, -114, 48, 55, -59, -82, -115, -57, -103, -102, -63, -77, Byte.MIN_VALUE, -52, -65, -83, -55, -78, -96, -53, -120, -100, -43, -87, -80, -46, -65, -114, -34, -105, -80, -46, -67, -82, -37, -70, -9, -92, -14, -59, -95, -21, -26, -96, -63, -32, -81, -5, -51, -88, -61, -1, 121 }, { -24, -126, -65, -26, -114, -98, -30, -65, -123, -31, -68, -72, 34, -27, -95, -72, -10, -114, -73, -12, -120, -98, -2, -72, -67, -1, -112, -101, -12, -98, -93, -8, -70, -91, -54, -96, -103, -64, -84, -68, -64, -113, -85, -51, -99, -81, 0 }, { -27, -118, -119, -28, -81, -91, -30, -65, -123, -20, -82, -108, 34, -24, -127, -96, -12, -86, -73, -10, -120, -67, -2, -104, -124, -4, -105, -114, 49, 35, -6, -89, -118, -59, -104, -103, 9, 27, -61, -106, -74, -49, -86, -116, -56, -107, -125, -55, -81, -108, -43, -81, -65, -47, -117, -105, -34, -78, -97, -35, -96, -76, -39, -91, -60, -92, -55, -56, -93, -18, -26, -95, -35, -7, 100 }, { -25, -107, -99, -26, -107, -72, -29, -115, -88, -17, -79, -86, 45 }, { -23, -84, -106, -26, -114, -98, -29, -115, -88, -17, -79, -86, 45 }, { -27, -81, -94, -28, -115, -84, -31, -86, -127, -18, -80, -84, -23, -87, -87, -21, -86, -97, 33, 35, -13, -81, -79, -14, -120, -105, -4, -110, -111, -11, -99, -94, -56, -98, -71, -58, -88, -77, 8 }, { -27, -81, -94, -28, -115, -84, -30, -65, -123, -20, -82, -113, -24, -73, Byte.MIN_VALUE, -26, -105, -101, -12, -121, -86, -14, -100, -95, -2, -103, -101, 55, -8, -91, -109, -9, -93, -100, -54, -100, -65, -64, -86, -79, 6 }, { -26, -112, -124, -27, -107, -113, -30, -65, -91, -19, -78, -122, -28, -114, -77, -25, -81, -118, -6, -78, -104, -13, -69, -79, -3, Byte.MIN_VALUE, -78, -2, -116, -107, -8, -105, -80, 15 }, { -24, -82, -75, -26, -104, -83, -18, -120, -108, -20, -121, -98, 33, 51, -22, -73, -70, -11, -88, -87, 57, 43, -1, -106, -117, -4, -97, -84, -5, -121, -102, -9, -125, -92, -57, -121, -93, -63, -101, -86, -52, -111, -96, -62, -84, -92, -56, -92, -103, -40, -90, -78, -47, -101, -84, -47, -107, -97, -33, -94, -108, -40, -82, -79, -90, -56, -49, -85, -57, -8, -93, -41, -64, -81, -62, -37, 98 }, { -24, -82, -89, -28, -118, -84, -29, -87, -66, -20, -113, -72, -27, -102, -93, -21, -86, -105, 66, 88, 58 }, { -27, -81, -94, -28, -115, -84, -29, -93, -116, -19, -80, -123, -23, -67, -113, -22, -99, -95, -11, -103, -94, -13, -106, -106, 52, -3, -94, -106, -12, -98, -93, -6, -74, -93, -57, -90, -97, 11 }, { -27, -81, -94, -28, -115, -84, -32, -86, -77, -19, -80, -86, 32, -23, -74, -126, -8, -110, -81, -10, -126, -105, -13, -110, -93, 55 }, { -28, -71, -113, -21, -121, -72, -30, -66, -72, -31, -115, -95, -23, -70, -65, -23, -127, -101, -10, -82, -103, -14, -116, -109, -1, -112, -77, -2, -113, -100, 48 }, { -26, -112, -124, -27, -107, -113, -30, -65, -91, -19, -78, -122, -28, -114, -77, -22, -106, -100, -6, -92, -117, -16, -109, -95, -4, -94, -116, -4, -110, -76, -5, -79, -106, -59, -104, -121, -62, -67, -75, 9 }, { -23, -109, -77, -25, -68, -120, -29, -93, -105, -20, -97, -127, 34 }, { -28, -68, -94, -28, -98, -127, -18, -122, -124, -19, -78, -111, -24, -75, -125, -25, -109, -84, -6, -80, -111, -16, -78, -112, -16, -74, -65, -3, -79, -69, -5, -122, -120, 15 }, { -28, -68, -94, -28, -98, -127, -31, -67, -81, -20, -126, -96, -24, -75, -125, -25, -109, -84, -6, -80, -111, -16, -78, -112, -16, -74, -65, -13, -65, -104, -5, -69, -89, 15 }, { -27, -68, -111, -26, -115, -120, -32, -86, -82, -20, -109, -93, -23, -87, -118, -21, -86, -97, -5, -121, -107, -16, -72, -115, -1, -109, -84, -3, -100, -100, 50, -5, -104, -84, -54, -96, -103, -61, -67, -104, -50, -92, -120, 5 }, { -28, -71, -113, -21, -121, -72, -18, -92, -115, -20, -82, -116, 32, -21, -112, -114, -11, -126, -109, -5, -73, -112, -13, -77, -97, -4, -83, -87, -5, -90, -113, -6, -114, -69, -57, -65, -116, -51, -119, -126, -64, -118, -81, -50, -120, -86, -54, -110, -67, 31, 26, -42, -69, -102, -46, -118, -121, -34, -82, -109, -37, -76, -121, -39, -18, -53, -85, -62, -41, -96, -61, -16, -96, -18, -23, -94, -43, -23, -87, -12, -63, -76, -4, -55, 125 }, { -24, -82, -89, -21, -89, Byte.MIN_VALUE, -29, -93, -113, -17, -99, -85, -23, -96, -102, 35, -12, -87, -97, -5, -105, -88, -1, -125, -103, -4, -76, -127, 50 }, { -23, -107, -125, -26, -86, -97, -31, -115, -66, -17, -118, -118, -22, -102, -82, -23, -93, -124, -10, -85, -74, -16, -86, -108, 54 }, { -23, -107, -125, -26, -86, -97, -31, -115, -66, -17, -118, -118, -22, -102, -82, -23, -93, -124, -9, -98, -84, -15, -82, -100, 54 }, { -26, -99, -126, -26, -96, -97, -18, -78, -88, -32, -118, -118, 61, 61, -23, -88, -99, -10, -101, -70, -15, -122, -105, 57 }, { -27, -81, -117, -26, -127, -83, -29, -117, -78, -20, -107, -108, -23, -117, -117, -21, -88, -100, -6, -112, -87, -16, -103, -122, -16, -84, -83, -2, -99, -86, -10, -67, -115, 15 }, { -24, -82, -75, -26, -104, -83, -18, -120, -108, -20, -121, -98, 33, 51, -23, -68, -85, -10, -87, -116, 57, 43, -2, -71, -90, -2, -89, -75, -8, -91, -77, -6, -100, -95, -57, -77, -117, 117, 109, 9 }, { -26, -112, -124, -27, -107, -113, -30, -65, -91, -19, -78, -122, -28, -114, -77, -22, -111, -90, -6, -79, -71, 59 }, { -24, -82, -89, -28, -118, -84, -29, -87, -66, -20, -113, -72, -27, -102, -93, -21, -86, -105, 66, 88, 58 }, { -24, -82, -89, -28, -118, -84, -29, -87, -66, -17, -89, -88, -23, -111, -90, -23, -127, -105, -12, -126, -98, -15, -82, -70, 54 }, { -24, -82, -89, -28, -118, -84, -29, -87, -66, -17, -89, -88, -23, -111, -90, -22, -106, -94, -12, -123, -125, -15, -82, -70, 54 }, { -27, -81, -117, -26, -127, -83, -29, -117, -78, -20, -107, -108, -23, -117, -117, -21, -88, -100, -6, -112, -87, -16, -103, -122, -16, -84, -83, -2, -102, -82, -8, -119, -73, 15 }, { -24, -82, -75, -26, -104, -83, -18, -120, -108, -20, -121, -98, 33, 51, -23, -68, -85, -10, -87, -116, 57, 43, -2, -71, -90, -2, -89, -75, -8, -91, -77, -6, -100, -95, -57, -77, -117, 117, 109, 9 }, { -27, -121, -79, -27, -110, -110, -17, Byte.MIN_VALUE, -103, -17, -106, -117, -24, -80, Byte.MIN_VALUE, -26, -116, -111, -6, -75, -107, 36, 38, 39, 40, 55 }, { -27, -84, -92, -25, -67, -91, -29, -93, -71, -31, -66, -82, 32, -21, -95, Byte.MIN_VALUE, -12, -87, -72, -5, -77, -121, -2, -98, -86, -1, -122, -101, -7, -71, -124, -6, -81, -114, -58, -102, -124, -64, -104, -80, 26, -51, -110, -127, -53, -71, -79, -55, -124, -118, -44, -71, -76, -35, -75, -118, 22, -33, -75, -85, -37, -103, -124, 5, -91, -50, -19, -89, -7, -6, -95, -45, -32, -96, -53, -36, -87, -14, -42, -86, -35, -16, -76, -21, -47, -68, -49, -13, -65, -11, -10, 105, -72, -27, -12, -72, -12, -2, -124, -41, -33, -125, -20, -25, Byte.MIN_VALUE, -22, -41, 69 }, { -26, -103, -99, -27, -116, -99, 73, 105, 100, 96, 100, 110 }, { 88, 104, 108, 100, 94, 109, 103, 105 }, { 77, 72, 70, 111, 97, 113, 43, 73, 105, 100, 111 }, { 77, 72, 70, 111, 97, 113, 43, 54 } };
  byte a = 0;
  byte jdField_goto = 0;
  byte jdField_byte = 0;
  String[] f;
  String[][] jdField_void;
  byte jdField_new = 0;
  byte[] c = null;
  static final byte jdField_do = 0;
  static final byte jdField_int = 1;
  static final byte d = 2;
  static final byte g = 3;
  static final byte jdField_char = 4;
  static final byte jdField_try = 5;
  static final byte b = 6;
  static final byte e = 7;
  static final byte jdField_else = 8;
  static final byte jdField_for = 9;
  static final byte jdField_null = 10;
  h jdField_if = null;
  g jdField_long = null;
  
  public s(h paramh)
  {
    this.jdField_if = paramh;
    this.jdField_long = paramh.cJ;
    this.jdField_byte = 0;
    a();
    this.c[0] = ((byte)(this.jdField_if.t - 2));
    this.c[1] = this.jdField_if.dT;
    if (this.jdField_if.dT == 2) {
      h.aL = true;
    } else {
      h.aL = false;
    }
    this.c[2] = this.jdField_if.cv;
    this.c[5] = this.jdField_if.eQ;
    this.c[8] = ((byte)(this.jdField_if.fI ? 0 : 1));
    this.c[7] = ((byte)(this.jdField_if.bu ? 1 : 0));
    this.c[9] = ((byte)(h.dc ? 0 : 1));
    this.c[10] = this.jdField_if.fs;
    this.c[3] = ((byte)(this.jdField_if.cr ? 0 : 1));
    this.c[4] = ((byte)(this.jdField_if.bY ? 0 : 1));
    this.c[6] = this.jdField_if.b3;
  }
  
  public static String a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > case.length)) {
      return null;
    }
    byte[] arrayOfByte = new byte[case[paramInt].length];
    System.arraycopy(case[paramInt], 0, arrayOfByte, 0, arrayOfByte.length);
    for (int i = 0; i < arrayOfByte.length; i = (byte)(i + 1)) {
      arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ i));
    }
    try
    {
      return a(arrayOfByte, 0, arrayOfByte.length);
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramInt1 + paramInt2;
    for (int j = paramInt1; j < i; j++)
    {
      int k = 0;
      if ((paramArrayOfByte[j] & 0x80) == 0)
      {
        k = (char)paramArrayOfByte[j];
      }
      else if ((paramArrayOfByte[j] & 0xE0) == 192)
      {
        k = (char)(k | (paramArrayOfByte[j] & 0x1F) << 6);
        j++;
        k = (char)(k | (paramArrayOfByte[j] & 0x3F) << 0);
      }
      else if ((paramArrayOfByte[j] & 0xF0) == 224)
      {
        k = (char)(k | (paramArrayOfByte[j] & 0xF) << 12);
        j++;
        k = (char)(k | (paramArrayOfByte[j] & 0x3F) << 6);
        j++;
        k = (char)(k | (paramArrayOfByte[j] & 0x3F) << 0);
      }
      else if ((paramArrayOfByte[j] & 0xF8) == 240)
      {
        k = (char)(k | (paramArrayOfByte[j] & 0x7) << 18);
        j++;
        k = (char)(k | (paramArrayOfByte[j] & 0x3F) << 12);
        j++;
        k = (char)(k | (paramArrayOfByte[j] & 0x3F) << 6);
        j++;
        k = (char)(k | (paramArrayOfByte[j] & 0x3F) << 0);
      }
      else
      {
        k = 63;
      }
      localStringBuffer.append(k);
    }
    return localStringBuffer.toString();
  }
  
  public void a()
  {
    this.jdField_new = 11;
    this.c = new byte[this.jdField_new];
    this.f = new String[this.jdField_new];
    this.jdField_void = new String[this.jdField_new][4];
    this.f[0] = "聊天滚动速度";
    this.jdField_void[0] = { "慢", "中", "快" };
    this.f[1] = "显示文字信息";
    this.jdField_void[1] = { "是", "否", "精致" };
    this.f[2] = "显示其他玩家";
    this.jdField_void[2] = { "完全", "简化", "否" };
    this.f[5] = "屏幕聊天滚动";
    this.jdField_void[5] = { "开", "关" };
    this.f[6] = "接收聊天信息";
    this.jdField_void[6] = { "是", "否", "除公聊" };
    this.f[7] = "显示缩略地图";
    this.jdField_void[7] = { "是", "否" };
    this.f[8] = "PK开关";
    this.jdField_void[8] = { "开", "关" };
    this.f[9] = "背景缓存";
    this.jdField_void[9] = { "开", "关" };
    this.f[10] = "物理攻击方式";
    this.jdField_void[10] = { "自动", "手动" };
    this.f[4] = "显示宠物名称";
    this.jdField_void[4] = { "是", "否" };
    this.f[3] = "显示公会名称";
    this.jdField_void[3] = { "是", "否" };
    this.a = 0;
    this.jdField_goto = ((byte)(h.fp / 36));
  }
  
  public void jdMethod_if()
  {
    this.jdField_if.a((byte)2, 0, 0, h.dU, h.fp, false);
    this.jdField_if.fj.setColor(0);
    this.jdField_if.fj.fillRect(0, 0, h.dU, h.fp);
    this.jdField_if.a((byte)2, 0, 0, h.dU, h.fp, true);
    this.jdField_if.fj.setColor(h.b2[2][0]);
    this.jdField_if.fj.fillRect(3, this.jdField_byte * 36 + h.eA, h.dU - 6, 18);
    this.jdField_if.a(this.a, this.jdField_goto, this.jdField_new, this.f, this.jdField_void, this.c);
    if (this.a < this.jdField_new - this.jdField_goto) {
      this.jdField_if.a(h.dU / 2 - 7, h.fp - 10 + (this.jdField_long.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.jdField_if.aH[4], 3);
    }
    if (this.a >= this.jdField_goto) {
      this.jdField_if.a(h.dU / 2 - 7, 3 + (this.jdField_long.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.jdField_if.aH[4], 0);
    }
    this.jdField_if.x();
    this.jdField_if.c();
  }
  
  public void jdMethod_if(int paramInt)
  {
    int i = (byte)(this.a + this.jdField_byte);
    switch (paramInt)
    {
    case 5: 
    case 6: 
      this.jdField_if.t = ((byte)(this.c[0] + 2));
      this.jdField_if.dT = this.c[1];
      if (this.jdField_if.dT == 2) {
        h.aL = true;
      } else {
        h.aL = false;
      }
      this.jdField_if.cv = this.c[2];
      this.jdField_if.eQ = this.c[5];
      if (this.c[7] == 0) {
        this.jdField_if.bu = false;
      } else {
        this.jdField_if.bu = true;
      }
      if (this.c[3] == 1) {
        this.jdField_if.cr = false;
      } else {
        this.jdField_if.cr = true;
      }
      if (this.c[4] == 1) {
        this.jdField_if.bY = false;
      } else {
        this.jdField_if.bY = true;
      }
      if (this.c[8] == 0)
      {
        this.jdField_if.fI = true;
      }
      else
      {
        this.jdField_if.fI = false;
        this.jdField_long.bD = null;
        this.jdField_long.hD = null;
        this.jdField_long.kg = -1;
      }
      this.jdField_if.b3 = this.c[6];
      h.dc = this.c[9] == 0;
      this.jdField_if.fs = this.c[10];
      this.jdField_if.jdMethod_else();
      this.jdField_long.jdField_do = 0;
      this.c = null;
      this.f = null;
      this.f = null;
      this.jdField_void = ((String[][])null);
      this.jdField_long.g7 = null;
      Runtime.getRuntime().gc();
      break;
    case 7: 
      this.jdField_long.jdField_do = 0;
      this.c = null;
      this.f = null;
      this.f = null;
      this.jdField_void = ((String[][])null);
      this.jdField_long.g7 = null;
      Runtime.getRuntime().gc();
      break;
    case 1: 
      this.jdField_byte = ((byte)(this.jdField_byte - 1));
      if (this.jdField_byte < 0)
      {
        this.jdField_byte = (this.a <= 0 ? 0 : (byte)(this.jdField_goto - 1));
        this.a = ((byte)(this.a - this.jdField_goto));
        if (this.a < 0) {
          this.a = 0;
        }
      }
      break;
    case 2: 
      if (i < this.jdField_new - 1) {
        this.jdField_byte = ((byte)(this.jdField_byte + 1));
      }
      if (this.jdField_byte % this.jdField_goto == 0)
      {
        this.jdField_byte = 0;
        this.a = ((byte)(this.a + this.jdField_goto));
        if (this.a >= this.jdField_new - 1) {
          this.a = ((byte)(this.jdField_new - 1));
        }
      }
      break;
    case 3: 
      switch (i)
      {
      case 3: 
        this.c[3] = 0;
        break;
      case 4: 
        this.c[4] = 0;
        break;
      case 6: 
        byte[] tmp674_669 = this.c;
        tmp674_669[6] = ((byte)(tmp674_669[6] - 1));
        if (this.c[6] < 0) {
          this.c[6] = 0;
        }
        break;
      case 0: 
        int tmp706_705 = 0;
        byte[] tmp706_702 = this.c;
        tmp706_702[tmp706_705] = ((byte)(tmp706_702[tmp706_705] - 1));
        if (this.c[0] < 0) {
          this.c[0] = 0;
        }
        break;
      case 1: 
        int tmp736_735 = 1;
        byte[] tmp736_732 = this.c;
        tmp736_732[tmp736_735] = ((byte)(tmp736_732[tmp736_735] - 1));
        if (this.c[1] < 0) {
          this.c[1] = 0;
        }
        break;
      case 7: 
        this.c[7] = 0;
        break;
      case 8: 
        this.c[8] = 0;
        this.jdField_long.a("开启PK可获得" + a.o + "%的经验加成.", (short)20, false, 9999);
        break;
      case 9: 
        this.c[9] = 0;
        break;
      case 10: 
        this.c[10] = 0;
        break;
      case 2: 
        int tmp849_848 = 2;
        byte[] tmp849_845 = this.c;
        tmp849_845[tmp849_848] = ((byte)(tmp849_845[tmp849_848] - 1));
        if (this.c[2] < 0) {
          this.c[2] = 0;
        }
        break;
      case 5: 
        this.c[5] = 0;
      }
      break;
    case 4: 
      switch (i)
      {
      case 4: 
        this.c[4] = 1;
        break;
      case 3: 
        this.c[3] = 1;
        break;
      case 6: 
        byte[] tmp970_965 = this.c;
        tmp970_965[6] = ((byte)(tmp970_965[6] + 1));
        if (this.c[6] > 2) {
          this.c[6] = 2;
        }
        break;
      case 0: 
        int tmp1003_1002 = 0;
        byte[] tmp1003_999 = this.c;
        tmp1003_999[tmp1003_1002] = ((byte)(tmp1003_999[tmp1003_1002] + 1));
        if (this.c[0] > 2) {
          this.c[0] = 2;
        }
        break;
      case 1: 
        int tmp1034_1033 = 1;
        byte[] tmp1034_1030 = this.c;
        tmp1034_1030[tmp1034_1033] = ((byte)(tmp1034_1030[tmp1034_1033] + 1));
        if (this.c[1] > 2) {
          this.c[1] = 2;
        }
        break;
      case 7: 
        this.c[7] = 1;
        break;
      case 8: 
        this.c[8] = 1;
        break;
      case 9: 
        this.c[9] = 1;
        break;
      case 10: 
        this.c[10] = 1;
        break;
      case 2: 
        int tmp1109_1108 = 2;
        byte[] tmp1109_1105 = this.c;
        tmp1109_1105[tmp1109_1108] = ((byte)(tmp1109_1105[tmp1109_1108] + 1));
        if (this.c[2] > 2) {
          this.c[2] = 2;
        }
        break;
      case 5: 
        this.c[5] = 1;
      }
      break;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */