import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public class ae
{
  h a = null;
  g jdField_byte = null;
  String[] jdField_case = { "查   看", "回复信息", "查看资料", "加为好友", "屏蔽该人", "返   回" };
  String[] jdField_if = { "回复信息", "查看资料", "加为好友", "屏蔽该人", "返   回" };
  public static final String[] e = { "全", "私", "队", "会", "系" };
  byte jdField_char;
  byte l = 0;
  byte g;
  byte jdField_do;
  String jdField_long;
  byte i;
  byte jdField_void;
  short jdField_new;
  short jdField_int;
  short jdField_goto;
  byte jdField_else;
  short f;
  short jdField_try;
  short k;
  short d = 0;
  short c;
  short jdField_null;
  byte j;
  byte jdField_for;
  byte h;
  String[] b;
  
  public ae(h paramh)
  {
    this.a = paramh;
    this.jdField_byte = this.a.cJ;
    this.jdField_int = ((short)(h.dU - 15));
    this.jdField_goto = ((short)(h.fp - 20 - 15));
    this.jdField_else = ((byte)((h.fp - 2 * h.eA) / h.eA));
    this.f = 14;
  }
  
  public void a(int paramInt)
  {
    this.jdField_char = ((byte)paramInt);
    this.l = ((byte)(this.jdField_byte.h4[paramInt] - 1));
    if (this.l < 0) {
      this.l = 0;
    }
    this.jdField_do = this.l;
    this.g = 0;
    this.jdField_try = this.f;
    this.k = 8;
    this.g = ((byte)Math.max(this.jdField_do - this.jdField_else + 1, 0));
  }
  
  public void jdMethod_if(int paramInt)
  {
    int m;
    switch (this.jdField_byte.jdField_do)
    {
    case 91: 
      switch (paramInt)
      {
      case 1: 
        this.j = ((byte)(this.j - 1));
        if (this.j < 0) {
          this.j = 0;
        }
        break;
      case 2: 
        this.j = ((byte)(this.j + 1));
        if (this.j > this.h - 1) {
          this.j = ((byte)(this.h - 1));
        }
        break;
      case 5: 
      case 6: 
        this.jdField_byte.gd = 0;
        this.jdField_byte.jdField_do = 86;
        break;
      case 7: 
        this.jdField_byte.jdField_do = 15;
      }
      break;
    case 86: 
      switch (paramInt)
      {
      case 1: 
        g tmp276_273 = this.jdField_byte;
        tmp276_273.gd = ((byte)(tmp276_273.gd - 1));
        if (this.jdField_byte.gd < 0) {
          this.jdField_byte.gd = ((byte)(this.jdField_if.length - 1));
        }
        break;
      case 2: 
        g tmp318_315 = this.jdField_byte;
        tmp318_315.gd = ((byte)(tmp318_315.gd + 1));
        if (this.jdField_byte.gd > this.jdField_if.length - 1) {
          this.jdField_byte.gd = 0;
        }
        break;
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        m = this.a.jdMethod_do(paramInt, this.jdField_if.length);
        if (m < 0) {
          return;
        }
        if (m > 0) {
          this.jdField_byte.gd = ((byte)m);
        }
        switch (this.jdField_byte.gd)
        {
        case 0: 
          if (this.jdField_byte.b5.toUpperCase().equals("系统"))
          {
            this.jdField_byte.a("不可以回复,如果需要联系客服,请到'系统'->'客服'发送信息.", (short)91, false, 9999);
            return;
          }
          this.a.i.jdMethod_if(this.jdField_byte.b5, (byte)91);
          break;
        case 1: 
          if (this.jdField_byte.b5.toUpperCase().equals("系统"))
          {
            this.jdField_byte.a("不可以查看资料.", (short)91, false, 9999);
            return;
          }
          this.a.i.a(this.jdField_byte.b5, (byte)91);
          break;
        case 2: 
          if (this.jdField_byte.b5.toUpperCase().equals("系统"))
          {
            this.jdField_byte.a("不可以加为好友.", (short)91, false, 9999);
            return;
          }
          this.a.jdMethod_case(this.jdField_byte.b5);
          this.jdField_byte.a("已发送添加好友请求.", (short)91, false, 9999);
          break;
        case 3: 
          if (this.jdField_byte.b5.toUpperCase().equals("系统"))
          {
            this.jdField_byte.a("不可以屏蔽.", (short)91, false, 9999);
            return;
          }
          this.a.c(this.jdField_byte.b5);
          this.jdField_byte.a("已发送屏蔽请求.", (short)91, false, 9999);
          break;
        case 4: 
          this.jdField_byte.jdField_do = 91;
        }
        break;
      }
      break;
    case 89: 
      switch (paramInt)
      {
      case 1: 
        g tmp772_769 = this.jdField_byte;
        tmp772_769.gd = ((byte)(tmp772_769.gd - 1));
        if (this.jdField_byte.gd < 0) {
          this.jdField_byte.gd = ((byte)(this.jdField_case.length - 1));
        }
        break;
      case 2: 
        g tmp814_811 = this.jdField_byte;
        tmp814_811.gd = ((byte)(tmp814_811.gd + 1));
        if (this.jdField_byte.gd > this.jdField_case.length - 1) {
          this.jdField_byte.gd = 0;
        }
        break;
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        m = this.a.jdMethod_do(paramInt, this.jdField_case.length);
        if (m < 0) {
          return;
        }
        if (m > 0) {
          this.jdField_byte.gd = ((byte)m);
        }
        switch (this.jdField_byte.gd)
        {
        case 0: 
          this.b = this.a.jdMethod_do(this.jdField_long, h.dU - 14);
          int n = (byte)this.b.length;
          this.j = 0;
          this.jdField_for = ((byte)((h.fp - h.eA * 2) / (h.eA + 1)));
          this.h = ((byte)(n / this.jdField_for));
          if (this.h * this.jdField_for < n) {
            this.h = ((byte)(this.h + 1));
          }
          this.jdField_byte.jdField_do = 91;
          break;
        case 1: 
          if (this.jdField_byte.b5.toUpperCase().equals("系统"))
          {
            this.jdField_byte.a("不可以回复,如果需要联系客服,请到'系统'->'客服'发送信息.", (short)15, false, 9999);
            return;
          }
          this.a.i.jdMethod_if(this.jdField_byte.b5, (byte)15);
          break;
        case 2: 
          if (this.jdField_byte.b5.toUpperCase().equals("系统"))
          {
            this.jdField_byte.a("不可以查看资料.", (short)15, false, 9999);
            return;
          }
          this.a.i.a(this.jdField_byte.b5, (byte)15);
          break;
        case 3: 
          if (this.jdField_byte.b5.toUpperCase().equals("系统"))
          {
            this.jdField_byte.a("不可以加为好友.", (short)15, false, 9999);
            return;
          }
          this.a.jdMethod_case(this.jdField_byte.b5);
          this.jdField_byte.a("已发送添加好友请求.", (short)15, false, 9999);
          break;
        case 4: 
          if (this.jdField_byte.b5.toUpperCase().equals("系统"))
          {
            this.jdField_byte.a("不可以屏蔽.", (short)15, false, 9999);
            return;
          }
          this.a.c(this.jdField_byte.b5);
          this.jdField_byte.a("已发送屏蔽请求.", (short)15, false, 9999);
          break;
        case 5: 
          this.jdField_byte.jdField_do = 15;
        }
        break;
      }
      break;
    case 15: 
      switch (paramInt)
      {
      case 1: 
        a();
        this.jdField_byte.cs = 1;
        this.jdField_byte.b1 = true;
        this.jdField_byte.f6 = 0;
        break;
      case 2: 
        jdMethod_do();
        this.jdField_byte.cs = 2;
        this.jdField_byte.b1 = true;
        this.jdField_byte.f6 = 0;
        break;
      case 3: 
        this.jdField_char = ((byte)(this.jdField_char - 1));
        if (this.jdField_char < 0) {
          this.jdField_char = ((byte)(e.length - 1));
        }
        a(this.jdField_char);
        break;
      case 4: 
        this.jdField_char = ((byte)(this.jdField_char + 1));
        if (this.jdField_char > e.length - 1) {
          this.jdField_char = 0;
        }
        a(this.jdField_char);
        break;
      case 5: 
      case 6: 
        if (this.jdField_byte.h4[this.jdField_char] <= 0) {
          return;
        }
        this.jdField_long = this.jdField_byte.ld[this.jdField_char][this.l];
        String str = this.jdField_long.substring(4, this.jdField_long.indexOf(":")).trim();
        this.jdField_byte.b5 = str;
        if (str.equals(this.a.cZ.O)) {
          return;
        }
        if ((str.length() >= 4) && (str.substring(0, 2).equals("你对")) && (str.substring(str.length() - 2, str.length() - 1).equals("说"))) {
          return;
        }
        this.jdField_byte.j1 = 15;
        this.jdField_byte.gd = 0;
        this.i = ((byte)this.jdField_byte.g2[this.jdField_char][0][this.l]);
        this.jdField_void = ((byte)this.jdField_byte.g2[this.jdField_char][1][this.l]);
        this.jdField_new = this.jdField_byte.g2[this.jdField_char][2][this.l];
        this.jdField_byte.jdField_do = 89;
        break;
      case 7: 
      case 48: 
        this.jdField_byte.jdField_do = 0;
        this.jdField_byte.md = null;
        Runtime.getRuntime().gc();
        break;
      case 35: 
        if (this.jdField_byte.jdField_if > 2) {
          this.a.i.jdMethod_if(null, (byte)15);
        }
        break;
      }
      break;
    }
  }
  
  public void a()
  {
    if (this.jdField_byte.h4[this.jdField_char] == 0) {
      return;
    }
    this.l = ((byte)(this.l - 1));
    if (this.l < this.g)
    {
      this.g = ((byte)(this.g - 1));
      if (this.g < 0) {
        this.g = 0;
      }
      this.l = this.g;
      this.jdField_do = ((byte)Math.min(this.jdField_byte.h4[this.jdField_char] - 1, this.g + this.jdField_else - 1));
    }
    this.jdField_try = this.f;
    this.k = 8;
  }
  
  public void jdMethod_do()
  {
    if (this.jdField_byte.h4[this.jdField_char] == 0) {
      return;
    }
    this.l = ((byte)(this.l + 1));
    if (this.l >= this.jdField_do)
    {
      if (this.l > this.jdField_do) {
        this.jdField_do = ((byte)(this.jdField_do + 1));
      }
      if (this.jdField_do > this.jdField_byte.h4[this.jdField_char] - 1)
      {
        this.jdField_do = ((byte)(this.jdField_byte.h4[this.jdField_char] - 1));
        this.l = this.jdField_do;
      }
      this.g = ((byte)Math.max(this.jdField_do - this.jdField_else + 1, 0));
    }
    this.jdField_try = this.f;
    this.k = 8;
  }
  
  public void jdMethod_for()
  {
    if (this.jdField_byte.b1)
    {
      g tmp14_11 = this.jdField_byte;
      tmp14_11.f6 = ((short)(tmp14_11.f6 + 1));
      m = 0;
      if ((this.jdField_byte.f6 >= 10) && (this.jdField_byte.f6 <= 30) && (this.jdField_byte.f6 % 5 == 0)) {
        m = 1;
      } else if ((this.jdField_byte.f6 > 20) && (this.jdField_byte.f6 % 2 == 0)) {
        m = 1;
      }
      if (m != 0) {
        if (this.jdField_byte.cs == 1) {
          a();
        } else {
          jdMethod_do();
        }
      }
    }
    this.a.fj.setColor(0);
    this.a.fj.fillRect(0, 0, h.dU, h.fp);
    this.d = ((short)(h.eA + 4));
    this.c = 0;
    if (this.jdField_byte.h4[this.jdField_char] == 0)
    {
      this.a.fj.setColor(h.b2[1][0]);
      this.a.fj.drawString("无聊天记录", this.f, this.d, 0);
    }
    this.c = ((short)(this.d + (this.jdField_else - 1) * (h.eA + 1)));
    for (int m = this.jdField_do; (m >= this.g) && (this.jdField_byte.h4[this.jdField_char] != 0); m = (byte)(m - 1))
    {
      this.a.fj.setColor(g.iO[this.jdField_byte.g2[this.jdField_char][1][m]]);
      if (m == this.l)
      {
        this.jdField_null = this.c;
        this.a.fj.setColor(h.b2[1][0]);
        this.a.fj.drawLine(0, this.c - 1, h.dU, this.c - 1);
        this.a.fj.drawLine(0, this.c - 1 + h.eA + 2, h.dU, this.c - 1 + h.eA + 2);
      }
      this.a.fj.setColor(g.iO[this.jdField_byte.g2[this.jdField_char][1][m]]);
      int n = 0;
      if ((m == this.l) && ((n = h.dA.stringWidth(this.jdField_byte.ld[this.jdField_char][m])) > this.jdField_int))
      {
        if (this.k > 0)
        {
          this.k = ((short)(this.k - 1));
        }
        else
        {
          if (this.jdField_byte.jdField_int % 4 == 3) {
            this.jdField_try = ((short)(this.jdField_try - (this.a.t + 1) * 5));
          }
          if (this.jdField_try < this.f - n) {
            this.jdField_try = ((short)(this.f + this.jdField_int));
          }
        }
        this.a.fj.drawString(this.jdField_byte.ld[this.jdField_char][m], this.jdField_try, this.c, 0);
        if (this.jdField_byte.g2[this.jdField_char][2][m] != -1) {
          this.a.a(this.jdField_try + this.jdField_byte.g2[this.jdField_char][2][m], this.c, 12, 12, 228, 0, this.a.aH[10], 0);
        }
        if (this.jdField_byte.g2[this.jdField_char][0][m] != -1) {
          this.a.a(this.jdField_try - 13, this.c + (h.eA - 12) / 2, 12, 12, this.jdField_byte.g2[this.jdField_char][0][m] % 6 * 12, this.jdField_byte.g2[this.jdField_char][0][m] / 6 * 12, this.a.aH[8], 0);
        }
      }
      else
      {
        this.a.fj.drawString(this.jdField_byte.ld[this.jdField_char][m], this.f, this.c, 0);
        if (this.jdField_byte.g2[this.jdField_char][2][m] != -1) {
          this.a.a(this.f + this.jdField_byte.g2[this.jdField_char][2][m], this.c, 12, 12, 228, 0, this.a.aH[10], 0);
        }
        if (this.jdField_byte.g2[this.jdField_char][0][m] != -1) {
          this.a.a(this.f - 13, this.c + (h.eA - 12) / 2, 12, 12, this.jdField_byte.g2[this.jdField_char][0][m] % 6 * 12, this.jdField_byte.g2[this.jdField_char][0][m] / 6 * 12, this.a.aH[8], 0);
        }
      }
      this.c = ((short)(this.c - (h.eA + 1)));
    }
    this.a.fj.setColor(0);
    this.a.fj.fillRect(0, 0, h.dU, this.d - 2);
    this.a.fj.setColor(h.b2[1][0]);
    this.a.fj.drawLine(0, this.d - 2, h.dU, this.d - 2);
    for (m = 0; m < e.length; m = (byte)(m + 1))
    {
      if (m == this.jdField_char)
      {
        if (m == 1) {
          this.jdField_byte.el = false;
        }
        this.a.fj.setColor(h.b2[1][0]);
        this.jdField_byte.lC[m] = false;
      }
      else if ((this.jdField_byte.lC[m] != 0) && (this.jdField_byte.jdField_int / 6 % 2 == 0))
      {
        this.a.fj.setColor(h.b2[2][0]);
      }
      else
      {
        this.a.fj.setColor(h.b2[5][1]);
      }
      this.a.fj.drawString(e[m], 23 + m * 20, 2, 0);
    }
    if (this.g > 0) {
      this.a.a((h.dU - 14) / 2, this.d - 10 + (this.jdField_byte.jdField_int % 5 == 0 ? 1 : 0), 14, 8, 0, 0, this.a.aH[4], 0);
    }
    if (this.jdField_do < this.jdField_byte.h4[this.jdField_char] - 1) {
      this.a.a((h.dU - 14) / 2, h.fp - 8 - (this.a.cb % 5 == 0 ? 1 : 0), 14, 8, 0, 0, this.a.aH[4], 3);
    }
    this.a.x();
    this.a.c();
  }
  
  public void jdMethod_if()
  {
    this.a.fj.setColor(0);
    this.a.fj.fillRect(0, 0, h.dU, h.fp);
    if (this.i != -1) {
      this.a.a(1, h.eA, 12, 12, this.i % 6 * 12, this.i / 6 * 12, this.a.aH[8], 0);
    }
    this.a.fj.setColor(g.iO[this.jdField_void]);
    int m = 13;
    int n = (short)h.eA;
    for (int i1 = 0; (i1 < this.jdField_for) && (this.j * this.jdField_for + i1 <= this.b.length - 1); i1 = (byte)(i1 + 1)) {
      this.a.fj.drawString(this.b[(this.j * this.jdField_for + i1)], m, n + i1 * (h.eA + 1), 20);
    }
    if ((this.j == 0) && (this.jdField_new != -1)) {
      this.a.a(13 + this.jdField_new, h.eA, 12, 12, 228, 0, this.a.aH[10], 0);
    }
    if (this.j > 0) {
      this.a.a(h.dU - 16, 6 + (this.jdField_byte.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
    }
    if (this.j < this.h - 1) {
      this.a.a(h.dU - 16, h.fp - 20 + (this.jdField_byte.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
    }
    this.a.x();
    this.a.c();
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ae.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */