import java.io.DataInputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;

public class an
{
  h jdField_if = null;
  g jdField_long = null;
  String[] d = null;
  int jdField_try;
  String jdField_void;
  byte e;
  byte jdField_case;
  int jdField_for;
  String jdField_goto;
  byte c;
  byte jdField_char;
  int f;
  int b;
  String jdField_byte;
  String jdField_new;
  String jdField_int;
  String jdField_do;
  String a;
  String jdField_else;
  String[] jdField_null;
  
  public an(h paramh)
  {
    this.jdField_if = paramh;
    this.jdField_long = paramh.cJ;
  }
  
  public void jdMethod_do()
  {
    switch (this.jdField_long.jdField_do)
    {
    case -90: 
      a();
      this.jdField_if.a("设置什么状态?", -1, (byte)4, false);
      this.jdField_if.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.jdField_long.gd, this.d);
      this.jdField_if.x();
      this.jdField_if.c();
      break;
    case -88: 
      a();
      this.jdField_if.a((h.a9 == 0 ? 128 : 176) - 2 * h.eA - 8, 20, this.jdField_long.gd, this.d);
      this.jdField_if.x();
      break;
    case -93: 
      jdMethod_for();
      this.jdField_if.c();
      break;
    case -87: 
      a();
      this.jdField_if.x();
      this.jdField_if.c();
    }
  }
  
  public void a(int paramInt)
  {
    int i;
    switch (this.jdField_long.jdField_do)
    {
    case -90: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.jdField_if.jdMethod_do(paramInt, this.d.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_long.gd = ((byte)i);
        }
        if (this.jdField_if.aG.jdMethod_int(3727))
        {
          this.jdField_if.aG.jdMethod_for(this.jdField_if.cZ.fL);
          this.jdField_if.aG.jdMethod_do(this.jdField_long.gd);
          this.jdField_if.aG.jdMethod_if();
        }
        this.jdField_long.jdField_do = 21;
        break;
      case 7: 
        this.d = null;
        this.jdField_long.jdField_do = -87;
        break;
      case 1: 
        g tmp278_275 = this.jdField_long;
        tmp278_275.gd = ((byte)(tmp278_275.gd - 1));
        if (this.jdField_long.gd < 0) {
          this.jdField_long.gd = ((byte)(this.d.length - 1));
        }
        break;
      case 2: 
        g tmp320_317 = this.jdField_long;
        tmp320_317.gd = ((byte)(tmp320_317.gd + 1));
        if (this.jdField_long.gd > this.d.length - 1) {
          this.jdField_long.gd = 0;
        }
        break;
      }
      break;
    case -88: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.jdField_if.jdMethod_do(paramInt, this.d.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.jdField_long.gd = ((byte)i);
        }
        if (ag.jdMethod_do(this.jdField_if.cZ.fj, (byte)5)) {
          switch (this.jdField_long.gd)
          {
          case 0: 
            this.d = ag.f6;
            this.jdField_long.gd = 0;
            this.jdField_long.jdField_do = -90;
            break;
          case 1: 
            if (ag.jdMethod_do(this.jdField_if.cZ.fj, (byte)2)) {
              jdMethod_if();
            }
            break;
          case 2: 
            this.d = null;
            this.jdField_long.jdField_do = -87;
          }
        } else if (ag.jdMethod_do(this.jdField_if.cZ.fj, (byte)2)) {
          switch (this.jdField_long.gd)
          {
          case 0: 
            jdMethod_if();
            break;
          case 1: 
            this.d = null;
            this.jdField_long.jdField_do = -87;
          }
        }
        break;
      case 1: 
        g tmp676_673 = this.jdField_long;
        tmp676_673.gd = ((byte)(tmp676_673.gd - 1));
        if (this.jdField_long.gd < 0) {
          this.jdField_long.gd = ((byte)(this.d.length - 1));
        }
        break;
      case 2: 
        g tmp718_715 = this.jdField_long;
        tmp718_715.gd = ((byte)(tmp718_715.gd + 1));
        if (this.jdField_long.gd > this.d.length - 1) {
          this.jdField_long.gd = 0;
        }
        break;
      }
      break;
    case -87: 
      switch (paramInt)
      {
      case 1: 
        this.e = ((byte)(this.e - 1));
        if (this.e < 0) {
          this.e = 0;
        }
        break;
      case 2: 
        this.e = ((byte)(this.e + 1));
        break;
      case 5: 
      case 6: 
        if ((ag.jdMethod_do(this.jdField_if.cZ.fj, (byte)5)) || (ag.jdMethod_do(this.jdField_if.cZ.fj, (byte)2)))
        {
          if (ag.jdMethod_do(this.jdField_if.cZ.fj, (byte)5)) {
            this.d = new String[] { "设定", "公告", "返回" };
          } else {
            this.d = new String[] { "公告", "返回" };
          }
          this.jdField_long.gd = 0;
          this.jdField_long.jdField_do = -88;
        }
        break;
      case 7: 
        this.jdField_else = null;
        this.jdField_null = null;
        this.jdField_void = null;
        this.jdField_long.jdField_do = 0;
        this.jdField_if.fm = null;
      }
      break;
    case -93: 
      switch (paramInt)
      {
      case 1: 
        if (h.a9 == 0) {
          this.e = 0;
        }
        break;
      case 2: 
        if (h.a9 == 0) {
          this.e = 1;
        }
        break;
      case 7: 
        this.jdField_void = null;
        this.jdField_byte = null;
        this.jdField_new = null;
        this.jdField_int = null;
        this.jdField_do = null;
        this.a = null;
        this.jdField_long.jdField_do = 26;
        this.jdField_if.fm = null;
      }
      break;
    }
  }
  
  public void jdMethod_for()
  {
    this.jdField_long.E();
    short s1 = 0;
    short s2 = 0;
    if (h.a9 == 0)
    {
      s1 = 128;
      s2 = 128;
    }
    else
    {
      s1 = 176;
      s2 = 203;
    }
    this.jdField_if.a((byte)2, 0, 0, s1, s2, true);
    short s3 = a(s1, s2);
    if (h.a9 == 0)
    {
      if (this.e == 1) {
        this.jdField_if.a(s1 - 20, s3 + (this.jdField_long.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.jdField_if.aH[4], 0);
      }
      if (this.e == 0) {
        jdMethod_if(s3);
      } else {
        a(s3);
      }
      if (this.e == 0) {
        this.jdField_if.a(s1 - 20, s2 - 20 + (this.jdField_long.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.jdField_if.aH[4], 3);
      }
    }
    else
    {
      s3 = jdMethod_if(s3);
      s3 = a(s3);
    }
  }
  
  public short jdMethod_if(short paramShort)
  {
    this.jdField_if.fj.drawString(ag.gB[4] + this.jdField_byte, 5, paramShort, 20);
    paramShort = (short)(paramShort + h.eA);
    this.jdField_if.fj.drawString(ag.gB[3] + this.jdField_new, 5, paramShort, 20);
    paramShort = (short)(paramShort + h.eA);
    this.jdField_if.fj.drawString(ag.gB[3] + this.jdField_int, 5, paramShort, 20);
    paramShort = (short)(paramShort + h.eA);
    return paramShort;
  }
  
  public short a(short paramShort)
  {
    this.jdField_if.fj.drawString(ag.gB[2] + this.jdField_do, 5, paramShort, 20);
    paramShort = (short)(paramShort + h.eA);
    this.jdField_if.fj.drawString(ag.gB[2] + this.a, 5, paramShort, 20);
    paramShort = (short)(paramShort + h.eA);
    return paramShort;
  }
  
  public void a()
  {
    this.jdField_long.E();
    short s1 = 0;
    short s2 = 0;
    if (h.a9 == 0)
    {
      s1 = 128;
      s2 = 128;
    }
    else
    {
      s1 = 176;
      s2 = 203;
    }
    this.jdField_if.a((byte)2, 0, 0, s1, s2, true);
    int i = a(s1, s2);
    int j = (byte)this.jdField_null.length;
    int k = (byte)((h.fp - i - h.eA) / (h.eA + 1));
    int m = (byte)(j / k);
    if (m * k < j) {
      m = (byte)(m + 1);
    }
    if (this.e >= m) {
      this.e = ((byte)(m - 1));
    }
    this.jdField_if.fj.setColor(h.b2[2][1]);
    for (int n = 0; (n < k) && (this.e * k + n <= this.jdField_null.length - 1); n = (byte)(n + 1)) {
      this.jdField_if.fj.drawString(this.jdField_null[(this.e * k + n)], 5, i + n * (h.eA + 1), 20);
    }
    if (this.e > 0) {
      this.jdField_if.a(s1 - 20, i + (this.jdField_long.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.jdField_if.aH[4], 0);
    }
    if (this.e < m - 1) {
      this.jdField_if.a(s1 - 20, s2 - 20 + (this.jdField_long.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.jdField_if.aH[4], 3);
    }
  }
  
  public short a(short paramShort1, short paramShort2)
  {
    this.jdField_if.jdMethod_do(this.jdField_try, (paramShort1 - 16) / 2, 3);
    int i = 18;
    this.jdField_if.a(ag.f6[this.jdField_case], 5, i, 0, h.b2[2][0]);
    this.jdField_if.a(this.jdField_void, 55, i, 0, h.b2[2][0]);
    i = (short)(i + h.eA);
    if (this.jdField_for >= 0)
    {
      this.jdField_if.a(this.c == 0 ? "同盟" : "敌对", 5, i, 0, h.b2[2][0]);
      this.jdField_if.a(this.jdField_goto, 55, i, 0, h.b2[2][0]);
    }
    else
    {
      this.jdField_if.a("中立", 5, i, 0, h.b2[2][0]);
    }
    i = (short)(i + h.eA);
    this.jdField_if.a(5, i, 22, 11, 66, 0, this.jdField_if.aH[12], 0);
    this.jdField_if.a(28, i + 2, this.jdField_char, 20);
    this.jdField_if.a(40, i + 3, 40 + (h.a9 == 0 ? 0 : 50), 5, 13421772, this.b, this.f);
    int j = this.f * 100 / this.b;
    int k = this.f * 100 % this.b;
    int m = k * 100 / this.b;
    this.jdField_if.a(110 + (h.a9 == 0 ? 0 : 50) + 3, i + 3, 5, 7, 55, 0, this.jdField_if.aH[5], 0);
    if (m < 10) {
      this.jdField_if.a(100 + (h.a9 == 0 ? 0 : 50) + 2, i + 3, 0L, 20);
    }
    this.jdField_if.a(100 + (m < 10 ? 5 : 0) + (h.a9 == 0 ? 0 : 50) + 2, i + 3, m, 20);
    this.jdField_if.a(95 + (h.a9 == 0 ? 0 : 50) + 2, i + 3, 5, 7, 80, 0, this.jdField_if.aH[5], 0);
    this.jdField_if.a(95 + (h.a9 == 0 ? 0 : 50) + 2, i + 3, j, 24);
    i = (short)(i + h.eA);
    return i;
  }
  
  public void jdMethod_if()
  {
    this.jdField_long.jdField_do = -89;
    this.jdField_if.i.c = new Command("确定", 4, 0);
    this.jdField_if.i.j = new Command("返回", 8, 1);
    this.jdField_if.i.jdField_goto = new TextBox("公告内容:", "", 30, 0);
    if (this.jdField_else != null) {
      this.jdField_if.i.jdField_goto.setString(this.jdField_else);
    }
    this.jdField_if.i.jdField_goto.addCommand(this.jdField_if.i.c);
    this.jdField_if.i.jdField_goto.addCommand(this.jdField_if.i.j);
    this.jdField_if.i.jdField_goto.setCommandListener(this.jdField_long);
    Display.getDisplay(this.jdField_if.fG).setCurrent(this.jdField_if.i.jdField_goto);
  }
  
  public void a(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramCommand == this.jdField_if.i.c)
    {
      if (this.jdField_if.i.jdField_goto.getString().trim().length() > a.void)
      {
        this.jdField_if.jdMethod_char("内容过长,最多输入" + a.void + "个字.");
        return;
      }
      if (this.jdField_if.aG.jdMethod_int(3728))
      {
        this.jdField_if.aG.jdMethod_for(this.jdField_if.cZ.fL);
        this.jdField_if.aG.jdMethod_if(this.jdField_if.i.jdField_goto.getString().trim());
        this.jdField_if.aG.jdMethod_if();
      }
      this.jdField_long.jdField_do = 21;
      Display.getDisplay(this.jdField_if.fG).setCurrent(this.jdField_if);
    }
    else if (paramCommand == this.jdField_if.i.j)
    {
      this.jdField_long.jdField_do = -87;
      Display.getDisplay(this.jdField_if.fG).setCurrent(this.jdField_if);
    }
  }
  
  public void a(int paramInt1, DataInputStream paramDataInputStream, int paramInt2, String paramString)
  {
    try
    {
      switch (paramInt1)
      {
      case 3727: 
        int i = paramDataInputStream.readByte();
        if (i == 0)
        {
          this.jdField_if.fm.jdField_case = this.jdField_long.gd;
          this.jdField_long.a("公会状态设定成功.", (short)-87, false, 9999);
        }
        else
        {
          this.jdField_long.a("公会状态设定失败.", (short)-87, false, 9999);
        }
        break;
      case 3728: 
        if (paramInt2 == 1)
        {
          this.jdField_long.a(paramString, (short)-87, false, 9999);
          return;
        }
        this.e = 0;
        this.jdField_else = this.jdField_if.i.jdField_goto.getString().trim();
        this.jdField_null = this.jdField_if.jdMethod_do(this.jdField_else, (h.a9 == 0 ? '' : '°') - 20);
        this.jdField_long.a("公告更新成功.", (short)-87, false, 9999);
      }
    }
    catch (Exception localException) {}
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\an.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */