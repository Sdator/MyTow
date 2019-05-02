import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public class ai
{
  h jdField_void = null;
  g b = null;
  String[] jdField_do = null;
  public byte jdField_new;
  public ao[] jdField_try = null;
  byte jdField_for;
  byte jdField_long;
  short c;
  String jdField_else = null;
  short a = 15;
  short jdField_if = 20;
  short jdField_null;
  short jdField_goto;
  byte jdField_byte;
  byte jdField_char;
  byte jdField_case;
  byte jdField_int;
  
  public ai(h paramh)
  {
    this.jdField_void = paramh;
    this.b = paramh.cJ;
  }
  
  public void jdMethod_for()
  {
    this.jdField_for = 0;
    this.jdField_long = 0;
    this.jdField_null = this.a;
    this.jdField_int = ((byte)((h.fp - h.eA * 2) / (h.eA + 1)));
  }
  
  public void jdMethod_do()
  {
    if (this.jdField_void.bR.a(this.jdField_try[(this.jdField_for + this.jdField_long)].E))
    {
      jdMethod_if(this.jdField_try[(this.jdField_for + this.jdField_long)]);
      if (this.b.my != null) {
        this.b.my[(this.jdField_for + this.jdField_long)] = ((short)Math.max(0, this.b.my[(this.jdField_for + this.jdField_long)] - 1));
      }
      if ((this.jdField_new == 2) && (this.b.ew[(this.jdField_for + this.jdField_long)].equals(this.jdField_void.cZ.O))) {
        this.b.ew[(this.jdField_for + this.jdField_long)] = "";
      }
    }
    else if ((this.jdField_new == 0) && (!this.jdField_void.bR.jdMethod_if()))
    {
      a(this.jdField_try[(this.jdField_for + this.jdField_long)]);
    }
    else if ((this.jdField_new == 1) && (!this.jdField_void.bR.jdMethod_do((byte)7)))
    {
      a(this.jdField_try[(this.jdField_for + this.jdField_long)]);
    }
    else if ((this.jdField_new == 2) && (!this.jdField_void.bR.jdMethod_do((byte)9)))
    {
      a(this.jdField_try[(this.jdField_for + this.jdField_long)]);
    }
    else if ((this.jdField_new == 3) && (!this.jdField_void.bR.jdMethod_do((byte)8)))
    {
      if (this.jdField_try[(this.jdField_for + this.jdField_long)].jdField_void == this.jdField_void.cZ.dC)
      {
        this.b.a("不能接受自己发布的悬赏任务.", (short)11, false, 9999);
        return;
      }
      a(this.jdField_try[(this.jdField_for + this.jdField_long)]);
    }
    else
    {
      String str = "";
      switch (this.jdField_new)
      {
      case 0: 
        str = "你的资格证";
        break;
      case 1: 
        str = "每日任务";
        break;
      case 3: 
        str = "悬赏任务";
        break;
      case 2: 
        str = "公会任务";
      }
      this.b.a(str + "只允许领取1个任务,必须完成或放弃已接受的任务才能领取新任务.在菜单->个人->任务中查看你要完成的任务.", (short)11, false, 9999);
    }
  }
  
  public void jdMethod_if()
  {
    switch (this.b.jdField_do)
    {
    case 88: 
      this.jdField_void.a(this.jdField_else, -1, (byte)4, false);
      if (this.b.jdField_int > 15) {
        a(5);
      }
      break;
    case 100: 
      this.b.E();
      a();
      this.jdField_void.a(4, 2, this.b.gd, this.jdField_do);
      break;
    case 81: 
      this.b.E();
      a();
      this.jdField_void.x();
      this.jdField_void.c();
      break;
    case 67: 
      this.b.E();
      jdMethod_int();
      this.jdField_void.a(h.dU - 46, this.jdField_goto, this.b.gd, this.jdField_do);
      break;
    case 11: 
      this.b.E();
      jdMethod_int();
      this.jdField_void.x();
      this.jdField_void.c();
    }
  }
  
  public void a(DataInputStream paramDataInputStream)
  {
    try
    {
      this.b.dg = paramDataInputStream.readShort();
      this.b.em = paramDataInputStream.readShort();
      int i = paramDataInputStream.readByte();
      this.b.my = null;
      this.b.ew = null;
      if (this.jdField_new == 3) {
        this.b.my = new short[i];
      } else if (this.jdField_new == 2) {
        this.b.ew = new String[i];
      }
      this.jdField_try = new ao[i];
      for (int j = 0; j < i; j = (byte)(j + 1))
      {
        paramDataInputStream.readShort();
        ao localao = new ao(paramDataInputStream);
        this.jdField_try[j] = localao;
        localao = null;
        if (this.jdField_new == 3) {
          this.b.my[j] = paramDataInputStream.readShort();
        } else {
          paramDataInputStream.readShort();
        }
        if (this.jdField_new == 2) {
          this.b.ew[j] = paramDataInputStream.readUTF();
        }
      }
      if (this.b.jdField_do == 125)
      {
        if (this.jdField_new == 0) {
          this.jdField_void.bR.jdField_for = this.jdField_try;
        }
        jdMethod_for();
        this.b.jdField_do = 11;
      }
    }
    catch (Exception localException) {}
  }
  
  public void a(byte paramByte)
  {
    this.jdField_new = paramByte;
    if (this.jdField_void.aG.jdMethod_int(5844))
    {
      this.jdField_void.aG.jdMethod_do(paramByte);
      this.jdField_void.aG.jdMethod_new(this.b.dg);
      int i;
      ao localao;
      if ((paramByte == 0) && (this.jdField_void.bR.jdMethod_if())) {
        for (i = 0; i < this.jdField_void.bR.d.size(); i = (byte)(i + 1))
        {
          localao = (ao)this.jdField_void.bR.d.elementAt(i);
          if ((localao.E >= 1000) && (localao.E < 2000))
          {
            this.jdField_void.aG.jdMethod_new(localao.E);
            break;
          }
        }
      } else if ((paramByte == 1) && (this.jdField_void.bR.jdMethod_do((byte)7))) {
        for (i = 0; i < this.jdField_void.bR.d.size(); i = (byte)(i + 1))
        {
          localao = (ao)this.jdField_void.bR.d.elementAt(i);
          if (ak.jdMethod_if(localao.E) == 7)
          {
            this.jdField_void.aG.jdMethod_new(localao.E);
            break;
          }
        }
      } else if ((paramByte == 2) && (this.jdField_void.bR.jdMethod_do((byte)9))) {
        for (i = 0; i < this.jdField_void.bR.d.size(); i = (byte)(i + 1))
        {
          localao = (ao)this.jdField_void.bR.d.elementAt(i);
          if (ak.jdMethod_if(localao.E) == 9)
          {
            this.jdField_void.aG.jdMethod_new(localao.E);
            break;
          }
        }
      } else if ((paramByte == 3) && (this.jdField_void.bR.jdMethod_do((byte)8))) {
        for (i = 0; i < this.jdField_void.bR.d.size(); i = (byte)(i + 1))
        {
          localao = (ao)this.jdField_void.bR.d.elementAt(i);
          if (ak.jdMethod_if(localao.E) == 8)
          {
            this.jdField_void.aG.jdMethod_new(localao.E);
            break;
          }
        }
      } else {
        this.jdField_void.aG.jdMethod_new(-1);
      }
      this.jdField_void.aG.jdMethod_do(this.jdField_void.cZ.a((byte)14));
      this.jdField_void.aG.jdMethod_if();
    }
    this.b.jdField_int = 0;
    this.b.jdField_do = 125;
  }
  
  public void a(int paramInt)
  {
    int i;
    switch (this.b.jdField_do)
    {
    case 88: 
      switch (paramInt)
      {
      case 5: 
        this.b.jdField_do = 11;
      }
      break;
    case 100: 
      switch (paramInt)
      {
      case 1: 
        g tmp168_165 = this.b;
        tmp168_165.gd = ((byte)(tmp168_165.gd - 1));
        if (this.b.gd < 0) {
          this.b.gd = ((byte)(this.jdField_do.length - 1));
        }
        break;
      case 2: 
        g tmp210_207 = this.b;
        tmp210_207.gd = ((byte)(tmp210_207.gd + 1));
        if (this.b.gd > this.jdField_do.length - 1) {
          this.b.gd = 0;
        }
        break;
      case 5: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.jdField_void.jdMethod_do(paramInt, this.jdField_do.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.b.gd = ((byte)i);
        }
        switch (this.b.gd)
        {
        case 0: 
          jdMethod_do();
          break;
        case 1: 
          this.jdField_do = null;
          this.b.jdField_do = 81;
        }
        break;
      }
      break;
    case 81: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        this.jdField_do = new String[] { "接受", "返回" };
        if (this.jdField_void.bR.a(this.jdField_try[(this.jdField_for + this.jdField_long)].E)) {
          this.jdField_do[0] = "放弃";
        }
        this.b.gd = 0;
        this.b.jdField_do = 100;
        break;
      case 1: 
        this.jdField_byte = ((byte)(this.jdField_byte - 1));
        if (this.jdField_byte < 0) {
          this.jdField_byte = 0;
        }
        break;
      case 2: 
        this.jdField_byte = ((byte)(this.jdField_byte + 1));
        if (this.jdField_byte > this.jdField_char - 1) {
          this.jdField_byte = ((byte)(this.jdField_char - 1));
        }
        break;
      case 7: 
        this.b.gJ = null;
        this.jdField_do = null;
        this.b.jdField_do = 11;
      }
      break;
    case 67: 
      switch (paramInt)
      {
      case 1: 
        g tmp624_621 = this.b;
        tmp624_621.gd = ((byte)(tmp624_621.gd - 1));
        if (this.b.gd < 0) {
          this.b.gd = ((byte)(this.jdField_do.length - 1));
        }
        break;
      case 2: 
        g tmp666_663 = this.b;
        tmp666_663.gd = ((byte)(tmp666_663.gd + 1));
        if (this.b.gd > this.jdField_do.length - 1) {
          this.b.gd = 0;
        }
        break;
      case 5: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i = this.jdField_void.jdMethod_do(paramInt, this.jdField_do.length);
        if (i < 0) {
          return;
        }
        if (i > 0) {
          this.b.gd = ((byte)i);
        }
        switch (this.b.gd)
        {
        case 0: 
          this.jdField_byte = 0;
          this.b.gJ = null;
          this.b.gJ = this.jdField_void.a(this.jdField_try[(this.jdField_for + this.jdField_long)]);
          int j = (byte)this.b.gJ.length;
          this.jdField_case = ((byte)((h.fp - h.eA * 2) / (h.eA + 1)));
          this.jdField_char = ((byte)(j / this.jdField_case));
          if (this.jdField_char * this.jdField_case < j) {
            this.jdField_char = ((byte)(this.jdField_char + 1));
          }
          this.b.jdField_do = 81;
          break;
        case 1: 
          jdMethod_do();
          break;
        case 2: 
          this.jdField_do = null;
          this.b.jdField_do = 11;
        }
        break;
      }
      break;
    case 11: 
      switch (paramInt)
      {
      case 1: 
        if (this.jdField_try.length != 0)
        {
          this.jdField_null = this.a;
          this.jdField_long = ((byte)(this.jdField_long - 1));
          if (this.jdField_long < this.jdField_for)
          {
            this.jdField_for = ((byte)(this.jdField_for - 1));
            if (this.jdField_for < 0)
            {
              this.jdField_for = 0;
              if ((this.jdField_new == 3) || (this.jdField_new == 2))
              {
                this.b.iN = false;
                this.b.e3 = 0;
                this.b.jdField_do = -101;
              }
            }
            this.jdField_long = this.jdField_for;
          }
        }
        break;
      case 2: 
        if (this.jdField_try.length != 0)
        {
          this.jdField_null = this.a;
          this.jdField_long = ((byte)(this.jdField_long + 1));
          i = (byte)Math.min(this.jdField_int, this.jdField_try.length);
          if (this.jdField_long > i - 1)
          {
            this.jdField_long = ((byte)(i - 1));
            this.jdField_for = ((byte)(this.jdField_for + 1));
            if (this.jdField_for > this.jdField_try.length - i)
            {
              this.jdField_for = ((byte)(this.jdField_void.ck.jdField_try.length - i));
              if ((this.jdField_new == 3) || (this.jdField_new == 2))
              {
                this.b.iN = true;
                this.b.e3 = 0;
                this.b.jdField_do = -101;
              }
            }
          }
        }
        break;
      case 5: 
      case 6: 
        if (this.jdField_try.length != 0)
        {
          this.jdField_do = new String[] { "查看", "接受", "返回" };
          if (this.jdField_void.bR.a(this.jdField_try[(this.jdField_for + this.jdField_long)].E)) {
            this.jdField_do[1] = "放弃";
          }
          this.b.gd = 0;
          this.b.jdField_do = 67;
        }
        break;
      case 7: 
        this.jdField_do = null;
        this.jdField_try = null;
        this.jdField_void.cJ.my = null;
        this.jdField_void.cJ.ew = null;
        this.b.jdField_do = 0;
        this.jdField_void.ck = null;
      }
      break;
    }
  }
  
  public void a(ao paramao)
  {
    if (this.jdField_void.cZ.a((byte)14) < this.jdField_try[(this.jdField_for + this.jdField_long)].N)
    {
      this.b.jdField_int = 0;
      this.jdField_else = (this.jdField_try[(this.jdField_for + this.jdField_long)].N + "级以上才能接受该任务.");
      this.b.jdField_do = 88;
      return;
    }
    if (this.jdField_new != 2)
    {
      if (paramao.o > this.jdField_void.cZ.a((byte)0))
      {
        this.b.jdField_int = 0;
        this.jdField_else = "不够支付抵押金,不能接受该任务.";
        this.b.jdField_do = 88;
      }
    }
    else if (paramao.o > this.jdField_void.cZ.a((byte)50))
    {
      this.b.jdField_int = 0;
      this.jdField_else = ("角色贡献度达到" + paramao.o + "才能接受该任务,可前往公会大本营,通过捐献公会基金提升角色当前贡献度.");
      this.b.jdField_do = 88;
      return;
    }
    if (ak.jdMethod_if(paramao.E) == 0)
    {
      this.b.jdField_int = 0;
      this.jdField_else = "你未加入任何一个商盟.";
      this.b.jdField_do = 88;
      return;
    }
    if (ak.jdMethod_if(paramao.E) == 1)
    {
      this.b.jdField_int = 0;
      this.jdField_else = "你未加入任何一个雇佣军团.";
      this.b.jdField_do = 88;
      return;
    }
    if (ak.jdMethod_if(paramao.E) == 2)
    {
      this.b.jdField_int = 0;
      this.jdField_else = "你未加入任何一个盗贼军团.";
      this.b.jdField_do = 88;
      return;
    }
    if (ak.jdMethod_if(paramao.E) == 3)
    {
      this.b.jdField_int = 0;
      this.jdField_else = "你未加入任何一个刺客军团.";
      this.b.jdField_do = 88;
      return;
    }
    if (ak.jdMethod_if(paramao.E) == 4)
    {
      this.b.jdField_int = 0;
      this.jdField_else = "你未获得该星域超距航行许可证.";
      this.b.jdField_do = 88;
      return;
    }
    this.jdField_void.dV = null;
    this.jdField_void.jdField_else = 0;
    if (this.jdField_new != 2) {
      this.jdField_void.cZ.jdMethod_for((byte)0, paramao.o);
    }
    this.jdField_void.bR.a(paramao, true);
    this.b.jdField_int = 0;
    this.jdField_else = "接受新任务!";
    this.b.jdField_do = 88;
    for (int i = 0; i < this.jdField_try.length; i = (byte)(i + 1)) {
      if (paramao.E == this.jdField_try[i].E)
      {
        ao localao = this.jdField_try[i];
        this.jdField_try[i] = this.jdField_try[0];
        this.jdField_try[0] = localao;
        if (this.jdField_new == 3)
        {
          int j = this.b.my[i];
          this.b.my[i] = this.b.my[0];
          this.b.my[0] = ((short)(j + 1));
        }
        else if (this.jdField_new == 2)
        {
          this.b.ew[i] = this.b.ew[0];
          this.b.ew[0] = this.jdField_void.cZ.O;
        }
      }
    }
  }
  
  public void jdMethod_if(ao paramao)
  {
    if (paramao.P == 5) {
      this.jdField_void.cZ.jdMethod_if((byte)0, this.jdField_void.cZ.am());
    }
    if (this.jdField_new != 2) {
      this.jdField_void.cZ.jdMethod_do((byte)0, paramao.o / 2);
    }
    for (int i = 0; i < this.jdField_void.bR.d.size(); i = (byte)(i + 1))
    {
      ao localao = (ao)this.jdField_void.bR.d.elementAt(i);
      if (localao.E == paramao.E)
      {
        this.jdField_void.bR.d.removeElementAt(i);
        break;
      }
    }
    this.jdField_void.bR.a(paramao);
    if (this.jdField_void.aG.jdMethod_int(5845))
    {
      this.jdField_void.aG.jdMethod_new(paramao.E);
      this.jdField_void.aG.jdMethod_if();
    }
    this.b.jdField_int = 0;
    this.jdField_else = "放弃任务!";
    if (ak.jdMethod_if(paramao.E) != 9) {
      this.jdField_else = (this.jdField_else + "收回抵押金" + paramao.o / 2 + ".");
    }
    this.b.jdField_do = 88;
  }
  
  public void jdMethod_int()
  {
    this.jdField_void.fj.setColor(0);
    this.jdField_void.fj.fillRect(0, 0, h.dU, h.fp);
    if ((this.jdField_try.length == 0) && (this.jdField_new == 3))
    {
      this.jdField_void.fj.setColor(h.b2[2][0]);
      this.jdField_void.fj.drawString("没有玩家发布悬赏任务.", h.dU / 2, 10, 17);
    }
    for (int i = 0; (i < this.jdField_int) && (i <= this.jdField_try.length - 1); i = (byte)(i + 1))
    {
      String str = this.jdField_try[(this.jdField_for + i)].h;
      if (this.jdField_new == 3) {
        str = str + "(" + this.b.my[(this.jdField_for + i)] + "人)";
      } else if ((this.jdField_new == 2) && (this.b.ew[(this.jdField_for + i)].trim().length() > 0)) {
        str = str + "(" + this.b.ew[(this.jdField_for + i)] + ")";
      }
      if (i == this.jdField_long)
      {
        this.jdField_goto = ((short)(this.jdField_if + i * (h.eA + 1)));
        this.jdField_void.fj.setColor(h.b2[2][0]);
        this.jdField_void.fj.drawLine(0, this.jdField_if + i * (h.eA + 1) - 1, h.dU, this.jdField_if + i * (h.eA + 1) - 1);
        this.jdField_void.fj.drawLine(0, this.jdField_if + i * (h.eA + 1) - 1 + h.eA + 2, h.dU, this.jdField_if + i * (h.eA + 1) - 1 + h.eA + 2);
      }
      if (this.jdField_void.bR.a(this.jdField_try[(this.jdField_for + i)].E)) {
        this.jdField_void.fj.setColor(16768256);
      } else {
        this.jdField_void.fj.setColor(h.b2[2][0]);
      }
      if ((i == this.jdField_long) && (h.dA.stringWidth(str) > h.dU))
      {
        this.jdField_null = ((short)(this.jdField_null - (this.jdField_void.t + 1)));
        if (this.jdField_null < -h.dA.stringWidth(str)) {
          this.jdField_null = h.dU;
        }
        this.jdField_void.fj.drawString(str, this.jdField_null, this.jdField_if + i * (h.eA + 1), 20);
      }
      else
      {
        this.jdField_void.fj.drawString(str, this.a, this.jdField_if + i * (h.eA + 1), 20);
      }
    }
    if (this.jdField_for > 0) {
      this.jdField_void.a(h.dU - 15, h.eA + 4 + (this.b.jdField_int % 5 == 0 ? 1 : 0), 14, 8, 0, 0, this.jdField_void.aH[4], 0);
    }
    if (this.jdField_for < this.jdField_try.length - this.jdField_int - 1) {
      this.jdField_void.a(h.dU - 15, h.fp - 15 - 8 - (this.b.jdField_int % 5 == 0 ? 1 : 0), 14, 8, 0, 0, this.jdField_void.aH[4], 3);
    }
  }
  
  public void a()
  {
    ao localao = this.jdField_try[(this.jdField_for + this.jdField_long)];
    this.jdField_void.fj.setColor(0);
    this.jdField_void.fj.fillRect(0, 0, h.dU, h.fp);
    this.jdField_void.fj.setColor(16777214);
    this.jdField_void.fj.drawString(localao.h, 20, 2, 0);
    this.jdField_void.fj.drawLine(0, h.eA + 2, h.dU, h.eA + 2);
    int i = 2;
    int j = (short)(h.eA + 3);
    for (int k = 0; (k < this.jdField_case) && (this.jdField_byte * this.jdField_case + k <= this.b.gJ.length - 1); k = (byte)(k + 1)) {
      this.jdField_void.fj.drawString(this.b.gJ[(this.jdField_byte * this.jdField_case + k)], i, j + k * (h.eA + 1), 20);
    }
    if (this.jdField_byte > 0) {
      this.jdField_void.a(h.dU - 16, 26 + (this.b.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.jdField_void.aH[4], 0);
    }
    if (this.jdField_byte < this.jdField_char - 1) {
      this.jdField_void.a(h.dU - 16, h.fp - 22 + (this.b.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.jdField_void.aH[4], 3);
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ai.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */