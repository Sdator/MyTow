import java.io.DataInputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;

public class ah
{
  h a = null;
  g jdField_else = null;
  Command c;
  Command j;
  Form jdField_do = null;
  ChoiceGroup o = null;
  Form jdField_null = null;
  TextField d = null;
  TextBox jdField_goto = null;
  TextBox jdField_for = null;
  Command jdField_char;
  Command jdField_case;
  byte m = 6;
  Form jdField_if;
  Form t;
  Form k;
  Form q;
  Form jdField_try;
  Form jdField_new;
  Form h;
  Form b;
  Form jdField_void;
  TextField s;
  TextField i;
  TextField jdField_long;
  TextField jdField_int;
  ChoiceGroup g;
  ChoiceGroup f;
  ChoiceGroup e;
  TextField r;
  TextField p;
  TextField jdField_byte;
  byte n;
  byte l;
  
  public ah(h paramh)
  {
    this.a = paramh;
    this.jdField_else = paramh.cJ;
  }
  
  public void jdMethod_for()
  {
    this.jdField_else.gi = 0;
    this.jdField_else.hZ = 0;
    this.jdField_else.gd = 0;
    this.jdField_else.c4 = 5;
    this.jdField_else.hi = 0;
  }
  
  public void a(String paramString, byte paramByte)
  {
    this.jdField_else.dt = null;
    if (this.a.aG.jdMethod_int(1006))
    {
      this.a.aG.jdMethod_if(paramString);
      this.a.aG.jdMethod_if();
    }
    this.n = paramByte;
    this.jdField_else.jdField_do = 108;
  }
  
  public void jdMethod_int()
  {
    this.a.c9 = new ad(this.a);
    this.a.c9.a();
    this.jdField_else.jdField_do = 23;
  }
  
  public void jdMethod_else()
  {
    this.a.fF = new aq(this.a);
    this.a.fF.a();
    this.jdField_else.jdField_do = 117;
  }
  
  public void jdMethod_new()
  {
    this.jdField_else.jdField_do = -64;
    this.t = new Form("宠物改名");
    this.jdField_int = new TextField("新的宠物名称:", "", 6, 0);
    this.c = new Command("确定", 4, 0);
    this.j = new Command("取消", 8, 1);
    this.t.append(this.jdField_int);
    this.t.addCommand(this.c);
    this.t.addCommand(this.j);
    this.t.setCommandListener(this.jdField_else);
    Display.getDisplay(this.a.fG).setCurrent(this.t);
  }
  
  public void jdMethod_if(String paramString, byte paramByte)
  {
    this.jdField_null = new Form("输入聊天内容");
    if ((paramString != null) && (this.a.jdMethod_for(paramString))) {
      paramString = "系统";
    }
    this.jdField_else.nq = true;
    this.jdField_else.lM = System.currentTimeMillis();
    this.jdField_else.ce = a3.jdMethod_new(a.ac, a.C);
    this.jdField_else.bw = (paramString != null);
    this.jdField_else.jdField_do = 103;
    this.jdField_else.lS = paramByte;
    this.c = new Command("选择", 4, 0);
    this.j = new Command("返回", 2, 1);
    this.o = new ChoiceGroup("频道", 1);
    this.o.append(g.b6[0], null);
    this.o.append(g.b6[6], null);
    if (this.a.cZ.fL >= 0) {
      this.o.append(g.b6[1], null);
    } else if (this.m == 1) {
      this.m = 6;
    }
    if (this.a.cZ.gE) {
      this.o.append(g.b6[2], null);
    } else if (this.m == 2) {
      this.m = 6;
    }
    this.o.setSelectedIndex(0, true);
    for (int i1 = 0; i1 < this.o.size(); i1 = (byte)(i1 + 1)) {
      if (this.o.getString(i1).equals(g.b6[this.m]))
      {
        this.o.setSelectedIndex(i1, true);
        break;
      }
    }
    if (this.jdField_else.bw) {
      this.d = new TextField("发起聊天 -" + paramString, "", 30, 0);
    } else {
      this.d = new TextField("发起聊天 ", "", 30, 0);
    }
    this.jdField_char = new Command("发送", 4, 0);
    this.jdField_case = new Command("插入表情", 8, 3);
    this.jdField_null.append(this.d);
    if (!this.jdField_else.bw)
    {
      this.jdField_else.jx = "";
      this.jdField_null.append(this.o);
    }
    else
    {
      this.jdField_else.jx = paramString;
    }
    this.jdField_null.addCommand(this.jdField_char);
    this.jdField_null.addCommand(this.jdField_case);
    this.jdField_null.addCommand(this.j);
    this.jdField_null.setCommandListener(this.jdField_else);
    Display.getDisplay(this.a.fG).setCurrent(this.jdField_null);
  }
  
  public void jdMethod_case()
  {
    this.jdField_else.jdField_do = 0;
    this.jdField_else.nq = false;
    Display.getDisplay(this.a.fG).setCurrent(this.a);
  }
  
  public void a(byte paramByte, short paramShort)
  {
    this.jdField_else.ce = a3.jdMethod_new(a.char, a.C);
    this.jdField_else.ga = a3.jdMethod_new(paramByte, a.C);
    this.jdField_else.nf = a3.jdMethod_new(paramShort, a.C);
    this.jdField_else.bw = false;
    this.jdField_else.jdField_do = 103;
    this.jdField_else.lS = 0;
    this.jdField_null = new Form("喇叭");
    this.d = new TextField("请输入内容", "", 30, 0);
    this.jdField_char = new Command("发送", 4, 0);
    this.j = new Command("取消", 2, 1);
    this.jdField_case = new Command("插入表情", 8, 3);
    this.jdField_else.jx = "";
    this.jdField_null.append(this.d);
    this.jdField_null.addCommand(this.jdField_char);
    this.jdField_null.addCommand(this.jdField_case);
    this.jdField_null.addCommand(this.j);
    this.jdField_null.setCommandListener(this.jdField_else);
    Display.getDisplay(this.a.fG).setCurrent(this.jdField_null);
  }
  
  public void a(Command paramCommand, Displayable paramDisplayable)
  {
    if ((paramDisplayable == this.jdField_for) || (paramDisplayable == this.jdField_if) || (paramDisplayable == this.jdField_void))
    {
      this.jdField_else.ea.a(paramCommand, paramDisplayable);
    }
    else if (paramDisplayable == this.jdField_goto)
    {
      this.a.fm.a(paramCommand, paramDisplayable);
    }
    else if (paramDisplayable == this.jdField_null)
    {
      if (paramCommand == this.jdField_char)
      {
        if (this.d.getString().trim().length() == 0) {
          return;
        }
        if (this.d.getString().trim().length() > 30)
        {
          this.a.jdMethod_char("内容过长,最多输入30个字.");
          return;
        }
        if (a.char == a3.jdMethod_do(this.jdField_else.ce, a.C))
        {
          if (this.a.cZ.a((byte)1, (short)a3.jdMethod_do(this.jdField_else.nf, a.C)) != -1)
          {
            if (this.a.aG.jdMethod_int(3001))
            {
              this.a.aG.jdMethod_do(5);
              this.a.aG.jdMethod_if(this.jdField_else.jx);
              this.a.aG.jdMethod_if(a3.jdMethod_do(this.jdField_else.ga, a.C) + this.d.getString().trim());
              this.a.aG.jdMethod_for(a3.jdMethod_do(this.jdField_else.nf, a.C));
              this.a.aG.jdMethod_if();
            }
            this.jdField_else.jdField_do = 0;
            Display.getDisplay(this.a.fG).setCurrent(this.a);
            this.jdField_else.nq = false;
            this.a.cZ.a((byte)1, (short)a3.jdMethod_do(this.jdField_else.nf, a.C), 1, false);
            this.d.setString("");
          }
          return;
        }
        if (a3.jdMethod_do(this.jdField_else.dW, a.C) == 5) {
          return;
        }
        String str1 = null;
        if (!this.jdField_else.bw)
        {
          String str2 = this.o.getString(this.o.getSelectedIndex());
          if (str2.equals(g.b6[0])) {
            this.m = 0;
          } else if (str2.equals(g.b6[6])) {
            this.m = 6;
          } else if (str2.equals(g.b6[1])) {
            this.m = 1;
          } else if (str2.equals(g.b6[2])) {
            this.m = 2;
          }
          this.jdField_else.dW = a3.jdMethod_new(this.m, a.C);
        }
        else if (this.jdField_else.jx.toUpperCase().equals("系统"))
        {
          this.jdField_else.dW = a3.jdMethod_new(3, a.C);
        }
        else
        {
          this.jdField_else.dW = a3.jdMethod_new(4, a.C);
        }
        switch (a3.jdMethod_do(this.jdField_else.dW, a.C))
        {
        case 0: 
        case 1: 
        case 2: 
        case 6: 
          str1 = "[" + g.b6[a3.jdMethod_do(this.jdField_else.dW, a.C)] + "]" + this.a.cZ.O + (this.a.cZ.fi ? "1" : "0") + ":" + this.d.getString().trim();
          break;
        case 3: 
          str1 = "[" + g.b6[4] + "]" + "你对系统说0:" + this.d.getString().trim();
          break;
        case 4: 
          str1 = "[" + g.b6[a3.jdMethod_do(this.jdField_else.dW, a.C)] + "]" + "你对" + this.jdField_else.jx + "说0:" + this.d.getString().trim();
        }
        synchronized (this.jdField_else.kP)
        {
          if (this.jdField_else.kP.size() > 2) {
            this.jdField_else.kP.insertElementAt(str1, 1);
          } else {
            this.jdField_else.kP.addElement(str1);
          }
        }
        if ((a3.jdMethod_do(this.jdField_else.dW, a.C) == 3) || (!this.jdField_else.eu.equals(this.d.getString().trim())))
        {
          this.jdField_else.eu = this.d.getString().trim();
          if (this.a.aG.jdMethod_int(3001))
          {
            this.a.aG.jdMethod_do((byte)a3.jdMethod_do(this.jdField_else.dW, a.C));
            this.a.aG.jdMethod_if(this.jdField_else.jx);
            this.a.aG.jdMethod_if(this.d.getString().trim());
            this.a.aG.jdMethod_for(-1);
            this.a.aG.jdMethod_if();
          }
        }
        this.jdField_else.jdField_do = ((short)this.jdField_else.lS);
        Display.getDisplay(this.a.fG).setCurrent(this.a);
        this.jdField_else.nq = false;
        this.d.setString("");
      }
      if (paramCommand == this.j)
      {
        this.jdField_else.jdField_do = ((short)this.jdField_else.lS);
        Display.getDisplay(this.a.fG).setCurrent(this.a);
        this.jdField_else.nq = false;
      }
      if (paramCommand == this.jdField_case)
      {
        this.jdField_else.jdField_do = 116;
        Display.getDisplay(this.a.fG).setCurrent(this.a);
      }
    }
    else if (paramDisplayable == this.b)
    {
      this.a.bM.a(paramCommand, paramDisplayable);
    }
    else if (paramDisplayable == this.h)
    {
      this.a.c9.a(paramCommand, paramDisplayable);
    }
    else if (paramDisplayable == this.jdField_new)
    {
      this.a.fF.a(paramCommand, paramDisplayable);
    }
    else if (paramDisplayable == this.jdField_try)
    {
      this.a.ac.a(paramCommand, paramDisplayable);
    }
    else if ((paramDisplayable == this.k) || (paramDisplayable == this.q))
    {
      this.a.bv.a(paramCommand, paramDisplayable);
    }
    else if (paramDisplayable == this.t)
    {
      if (paramCommand == this.c)
      {
        if (!h.jdMethod_try(this.jdField_int.getString().trim()))
        {
          this.a.jdMethod_char("宠物名称要求3-6位.");
          return;
        }
        if (this.a.aG.jdMethod_int(4058))
        {
          this.a.aG.jdMethod_new(this.a.jdMethod_if((byte)116));
          this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
          this.a.aG.jdMethod_if(this.jdField_int.getString().trim());
          this.a.aG.jdMethod_if();
        }
        this.jdField_else.jdField_do = 21;
        Display.getDisplay(this.a.fG).setCurrent(this.a);
      }
      else if (paramCommand == this.j)
      {
        this.jdField_else.jdField_do = 0;
        Display.getDisplay(this.a.fG).setCurrent(this.a);
      }
    }
  }
  
  public long a()
  {
    long l1 = 0L;
    for (int i1 = 0; i1 < this.jdField_else.bs[0]; i1 = (byte)(i1 + 1)) {
      if ((a3.jdMethod_do(this.jdField_else.jv[0][i1], 2) > 0) && (i1 != this.jdField_else.lY + this.jdField_else.lX * 6)) {
        l1 += a3.jdMethod_do(this.jdField_else.jv[0][i1], 2) * this.jdField_else.lK[0][i1];
      }
    }
    return l1;
  }
  
  public void jdMethod_do(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      g tmp36_33 = this.jdField_else;
      tmp36_33.lX = ((byte)(tmp36_33.lX - 1));
      if (this.jdField_else.lX < 0) {
        this.jdField_else.lX = 0;
      }
      break;
    case 4: 
      g tmp71_68 = this.jdField_else;
      tmp71_68.lY = ((byte)(tmp71_68.lY + 1));
      if (this.jdField_else.lY > 6 - 1) {
        this.jdField_else.lY = ((byte)(6 - 1));
      }
      break;
    case 3: 
      g tmp124_121 = this.jdField_else;
      tmp124_121.lY = ((byte)(tmp124_121.lY - 1));
      if (this.jdField_else.lY < 0) {
        this.jdField_else.lY = 0;
      }
      break;
    case 2: 
      g tmp159_156 = this.jdField_else;
      tmp159_156.lX = ((byte)(tmp159_156.lX + 1));
      if (this.jdField_else.lX >= 8) {
        this.jdField_else.lX = ((byte)(8 - 1));
      }
      break;
    }
  }
  
  public void jdMethod_case(int paramInt)
  {
    this.a.aI = null;
    this.a.aI = new b(this.a);
    this.l = ((byte)paramInt);
    if (this.a.aG.jdMethod_int(6701))
    {
      this.a.aG.jdMethod_for(h.cz ? 999999 : q.cB);
      this.a.aG.jdMethod_if();
    }
    this.a.cJ.jdField_do = 21;
  }
  
  public void jdMethod_byte()
  {
    a(1, (byte)0, (byte)this.jdField_else.d4.length, this.jdField_else.d4, new short[this.jdField_else.d4.length]);
    a(this.jdField_else.d4, false);
    for (int i1 = 0; i1 < this.jdField_else.bs[0]; i1 = (byte)(i1 + 1))
    {
      this.jdField_else.lK[0][i1] = this.a.L(this.jdField_else.nl[0][i1]);
      if ((this.jdField_else.eC >= 0) && (this.jdField_else.eC != this.a.cZ.fL) && ((this.jdField_else.eC != this.a.cZ.ge) || (this.a.cZ.gm != 0))) {
        this.jdField_else.lK[0][i1] = (this.jdField_else.lK[0][i1] * (100 + this.jdField_else.hS) / 100);
      }
    }
    this.jdField_else.jdField_do = 96;
  }
  
  public void jdMethod_do()
  {
    if ((this.jdField_else.cA == this.jdField_else.jdField_if) && (this.a.cZ.al[1] == this.a.cZ.jdMethod_int((byte)21)) && (h.a(ag.hF, ag.hE, h.dU, h.fp, this.jdField_else.i9, this.jdField_else.i8, 10, 10))) {
      this.a.a(this.jdField_else.i9 - ag.hF, this.jdField_else.i8 - ag.hE, 1, this.jdField_else.jdField_int / 2 % 3);
    }
  }
  
  public void a(int paramInt, byte paramByte1, byte paramByte2, short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    this.a.fR = this.a.jdMethod_goto("/map/03.yy");
    try
    {
      this.a.gb = Image.createImage("/hole.png");
    }
    catch (Exception localException) {}
    if ((this.jdField_else.nl == null) || (this.jdField_else.nl.length != paramInt))
    {
      this.jdField_else.bs = new byte[paramInt];
      this.jdField_else.nl = new short[paramInt][ag.eK];
      this.jdField_else.jv = new short[paramInt][ag.eK];
      this.jdField_else.lK = new int[paramInt][ag.eK];
      this.jdField_else.ev = new short[paramInt][ag.eK];
    }
    int i1 = paramByte2;
    for (byte b1 = 0; b1 < paramByte2; b1 = (byte)(b1 + 1))
    {
      this.jdField_else.nl[paramByte1][b1] = paramArrayOfShort1[b1];
      if (paramArrayOfShort2[b1] == 0) {
        this.jdField_else.jv[paramByte1][b1] = ((short)a3.jdMethod_new(0, 2));
      } else {
        this.jdField_else.jv[paramByte1][b1] = paramArrayOfShort2[b1];
      }
      this.jdField_else.lK[paramByte1][b1] = 0;
    }
    this.jdField_else.bs[paramByte1] = i1;
    this.jdField_else.lY = 0;
    this.jdField_else.lX = 0;
    this.jdField_else.hC = 0;
    this.jdField_else.dx = 0;
  }
  
  public void a(short[] paramArrayOfShort, boolean paramBoolean)
  {
    this.jdField_else.jc = new short[paramArrayOfShort.length];
    this.jdField_else.lI = new String[paramArrayOfShort.length];
    this.jdField_else.hA = new String[paramArrayOfShort.length];
    System.arraycopy(paramArrayOfShort, 0, this.jdField_else.jc, 0, paramArrayOfShort.length);
    for (int i1 = 0; i1 < this.jdField_else.jc.length - 1; i1 = (short)(i1 + 1)) {
      for (int i2 = (short)(i1 + 1); i2 < this.jdField_else.jc.length; i2 = (short)(i2 + 1)) {
        if (this.jdField_else.jc[i1] > this.jdField_else.jc[i2])
        {
          int i3 = this.jdField_else.jc[i1];
          this.jdField_else.jc[i1] = this.jdField_else.jc[i2];
          this.jdField_else.jc[i2] = i3;
        }
      }
    }
    this.jdField_else.lI = this.a.a(this.jdField_else.jc);
    this.jdField_else.hA = this.a.a(this.jdField_else.jc, paramBoolean);
  }
  
  public String a(short paramShort)
  {
    int i1 = h.a(this.jdField_else.jc, paramShort);
    if (i1 != -1) {
      return this.jdField_else.lI[i1];
    }
    return null;
  }
  
  public String jdMethod_if(short paramShort)
  {
    int i1 = h.a(this.jdField_else.jc, paramShort);
    if (i1 > -1) {
      return this.jdField_else.hA[i1];
    }
    return "";
  }
  
  public void a(byte paramByte1, short paramShort, byte paramByte2)
  {
    for (int i1 = 0; i1 < this.jdField_else.bs[paramByte1]; i1 = (byte)(i1 + 1)) {
      if (this.jdField_else.nl[paramByte1][i1] == paramShort)
      {
        byte b1 = (short)a3.jdMethod_do(this.jdField_else.jv[paramByte1][i1], 2);
        b1 = (short)(b1 + paramByte2);
        this.jdField_else.jv[paramByte1][i1] = ((short)a3.jdMethod_new(b1, 2));
        return;
      }
    }
    this.jdField_else.nl[paramByte1][this.jdField_else.bs[paramByte1]] = paramShort;
    this.jdField_else.jv[paramByte1][this.jdField_else.bs[paramByte1]] = ((short)a3.jdMethod_new(paramByte2, 2));
    byte tmp142_141 = paramByte1;
    byte[] tmp142_138 = this.jdField_else.bs;
    tmp142_138[tmp142_141] = ((byte)(tmp142_138[tmp142_141] + 1));
    jdMethod_char();
  }
  
  public void jdMethod_if(byte paramByte1, short paramShort, byte paramByte2)
  {
    for (int i1 = 0; i1 < this.jdField_else.bs[paramByte1]; i1 = (byte)(i1 + 1)) {
      if (this.jdField_else.nl[paramByte1][i1] == paramShort)
      {
        byte b1 = (short)a3.jdMethod_do(this.jdField_else.jv[paramByte1][i1], 2);
        b1 = (short)(b1 - paramByte2);
        this.jdField_else.jv[paramByte1][i1] = ((short)a3.jdMethod_new(b1, 2));
        if (a3.jdMethod_do(this.jdField_else.jv[paramByte1][i1], 2) <= 0)
        {
          this.jdField_else.jv[paramByte1][i1] = this.jdField_else.jv[paramByte1][(this.jdField_else.bs[paramByte1] - 1)];
          this.jdField_else.nl[paramByte1][i1] = this.jdField_else.nl[paramByte1][(this.jdField_else.bs[paramByte1] - 1)];
          this.jdField_else.jv[paramByte1][(this.jdField_else.bs[paramByte1] - 1)] = ((short)a3.jdMethod_new(-1, 2));
          this.jdField_else.nl[paramByte1][(this.jdField_else.bs[paramByte1] - 1)] = -1;
          byte tmp220_219 = paramByte1;
          byte[] tmp220_216 = this.jdField_else.bs;
          tmp220_216[tmp220_219] = ((byte)(tmp220_216[tmp220_219] - 1));
          jdMethod_char();
        }
        return;
      }
    }
  }
  
  public void jdMethod_char()
  {
    for (int i1 = 0; i1 < this.jdField_else.bs.length; i1 = (byte)(i1 + 1)) {
      for (int i2 = 0; i2 < this.jdField_else.bs[i1] - 1; i2 = (byte)(i2 + 1)) {
        for (int i3 = (byte)(i2 + 1); i3 < this.jdField_else.bs[i1]; i3 = (byte)(i3 + 1)) {
          if (this.jdField_else.nl[i1][i2] > this.jdField_else.nl[i1][i3])
          {
            int i4 = this.jdField_else.nl[i1][i2];
            int i5 = this.jdField_else.jv[i1][i2];
            this.jdField_else.nl[i1][i2] = this.jdField_else.nl[i1][i3];
            this.jdField_else.jv[i1][i2] = this.jdField_else.jv[i1][i3];
            this.jdField_else.nl[i1][i3] = i4;
            this.jdField_else.jv[i1][i3] = i5;
          }
        }
      }
    }
  }
  
  public void jdMethod_do(short paramShort)
  {
    if (paramShort > -1)
    {
      String str1 = a(paramShort);
      this.a.fj.setColor(h.b2[5][0]);
      int i1 = g.l7 - h.eA - 5;
      int i2 = (h.k(paramShort) == 0) && (h.jdMethod_do(paramShort) > 0) ? 1 : 0;
      if (h.k(paramShort) == 1)
      {
        str1 = str1 + "......";
      }
      else
      {
        String str2 = " 等级:" + (h.z(paramShort) + 1) * a.J + " ";
        if (!h.o(paramShort))
        {
          int i3 = h.q(paramShort);
          if (i3 != 4)
          {
            str2 = str2 + h.a8[h.q(paramShort)] + ":" + h.jdMethod_void(paramShort);
          }
          else
          {
            str2 = str2 + h.a8[0] + ":" + h.jdMethod_void(paramShort);
            str2 = str2 + " " + h.a8[2] + ":" + h.jdMethod_void(paramShort);
          }
          if (this.a.fj.getFont().stringWidth(str1) + this.a.fj.getFont().stringWidth(str2) > g.f5 - 10 - (i2 != 0 ? 20 : 0)) {
            str1 = str1 + " 等级:" + (h.z(paramShort) + 1) * a.J + "......";
          } else {
            str1 = str1 + str2;
          }
        }
      }
      this.a.fj.setClip(5, i1, g.f5 - 10 - (i2 != 0 ? 20 : 0), h.eA);
      this.a.fj.drawString(str1, 5, i1, 0);
      this.a.fj.setClip(0, 0, h.dU, h.fp);
      if (i2 != 0) {
        this.a.a(g.f5 - 16 - 4, i1 + 2, 16, 16, (h.jdMethod_do(paramShort) / 2 - 1) * 16, 0, this.a.gb, 0);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.fj.setColor(h.b2[2][1]);
    this.a.fj.fillRect(paramInt1, paramInt2, g.lQ * 18, g.kj * 18);
    for (int i1 = 0; i1 < g.lQ; i1 = (byte)(i1 + 1)) {
      for (int i2 = 0; i2 < g.kj; i2 = (byte)(i2 + 1))
      {
        this.a.fj.setColor(0);
        this.a.fj.drawRect(paramInt1 + i1 * 18 + 1, paramInt2 + i2 * 18 + 1, 18 - 1, 18 - 1);
        this.a.fj.setColor(h.b2[5][1]);
        this.a.fj.drawRect(paramInt1 + i1 * 18, paramInt2 + i2 * 18, 18, 18);
      }
    }
  }
  
  public void jdMethod_if(boolean paramBoolean)
  {
    int i1 = (byte)(20 + 4);
    int i2 = 4;
    int i3 = 12;
    int i4 = 12;
    this.a.a(i1, i2, 8 * i3, i4, 2 * i3, 0, this.a.aH[10], 0);
    for (int i5 = 0; i5 < a.ad; i5 = (byte)(i5 + 1)) {
      if (a3.jdMethod_int(this.a.cZ.H[i5], a.C) == -1) {
        this.a.a(i1 + i5 * i3, i2, i3, i4, 10 * i3, 0, this.a.aH[10], 0);
      }
    }
    if (paramBoolean)
    {
      this.a.fj.setColor(h.b2[4][0]);
      this.a.fj.drawRect(i1 + i3 * this.jdField_else.gp + this.jdField_else.jdField_int / 3 % 2, i2 + this.jdField_else.jdField_int / 3 % 2, i3 - 1 - 2 * (this.jdField_else.jdField_int / 3 % 2), i4 - 1 - 2 * (this.jdField_else.jdField_int / 3 % 2));
    }
  }
  
  public void jdMethod_do(boolean paramBoolean)
  {
    this.a.a((byte)2, 0, 0, g.f5, g.l7, true);
    this.a.a((byte)2, 0, 0, g.f5, g.l7 - 33, false);
    int i1 = 0;
    int i2 = 0;
    if (this.jdField_else.hC == 0)
    {
      i1 = 4;
      i2 = 17;
      jdMethod_if(!paramBoolean);
    }
    else
    {
      i1 = 14;
      i2 = 17;
      this.a.a((g.f5 - 44) / 2, 3, 44, 11, 0, 0, this.a.aH[12], 0);
    }
    a(i1, i2);
    if (this.jdField_else.hC == 0) {
      this.a.a(g.f5 - 5 - 8 + (this.jdField_else.jdField_int % 6 == 0 ? 1 : -1), (g.l7 - 30 - 14) / 2, 14, 8, 0, 0, this.a.aH[4], 5);
    } else {
      this.a.a(5 + (this.jdField_else.jdField_int % 6 == 0 ? 1 : -1), (g.l7 - 30 - 14) / 2, 14, 8, 0, 0, this.a.aH[4], 6);
    }
    if (g.kj < 8)
    {
      this.a.fj.setColor(0);
      this.a.fj.fillRect(i1 + g.lQ * 18 + 1, i2, 3, 18 * g.kj);
      this.a.fj.setColor(15724527);
      this.a.fj.fillRect(i1 + g.lQ * 18 + 2, i2 + this.jdField_else.lX * 18 * g.kj / 8, 1, 18 * g.kj / 8);
    }
    if (this.jdField_else.lX >= g.kj) {
      i2 -= 18 * g.kj;
    }
    for (int i3 = 0; i3 < this.jdField_else.bs[this.jdField_else.hC]; i3 = (byte)(i3 + 1))
    {
      if (this.jdField_else.lX < g.kj)
      {
        if (i3 >= g.lQ * g.kj) {
          break;
        }
      }
      else {
        if (i3 < g.lQ * g.kj) {
          continue;
        }
      }
      if ((this.jdField_else.fE != -1) && (h.k(this.jdField_else.nl[this.jdField_else.hC][i3]) == 0) && (h.G(this.jdField_else.nl[this.jdField_else.hC][i3]) == this.jdField_else.fE) && ((this.jdField_else.fE != 0) || (h.N(this.jdField_else.nl[this.jdField_else.hC][i3]) == this.a.cZ.bo)))
      {
        this.a.fj.setColor(h.b2[4][0]);
        this.a.fj.fillRect(i1 + 18 * (i3 % 6) + 2, i2 + 18 * (i3 / 6) + 2, 18 - 3, 18 - 3);
      }
      this.a.a(i1 + 18 * (i3 % 6) + 2, i2 + 18 * (i3 / 6) + 2, this.jdField_else.nl[this.jdField_else.hC][i3]);
      this.a.a(i1 + 18 * (i3 % 6) + 15 + 2, i2 + 18 * (i3 / 6) + 15 + 2, a3.jdMethod_do(this.jdField_else.jv[this.jdField_else.hC][i3], 2), 40);
      int i4 = this.a.cZ.a(this.jdField_else.nl[this.jdField_else.hC][i3], (byte)1);
      if (i4 >= 0)
      {
        switch (i4)
        {
        case 0: 
          i4 = 1;
          break;
        case 1: 
          i4 = 3;
          break;
        case 2: 
          i4 = 7;
          break;
        case 3: 
          i4 = 9;
        }
        this.jdField_else.a(i1 + 18 * (i3 % 6), i2 + 18 * (i3 / 6), i4);
      }
    }
    i3 = -1;
    if ((this.jdField_else.jdField_do == 31) || (this.jdField_else.jdField_do == 32)) {
      i3 = this.a.cZ.a7[this.jdField_else.gp];
    } else if (this.jdField_else.lY + this.jdField_else.lX * 6 < this.jdField_else.bs[this.jdField_else.hC]) {
      i3 = this.jdField_else.nl[this.jdField_else.hC][(this.jdField_else.lY + this.jdField_else.lX * 6)];
    }
    jdMethod_do(i3);
    if ((this.jdField_else.lY >= 0) && (this.jdField_else.lX >= 0) && (this.jdField_else.lY < 6) && (this.jdField_else.lX < 8) && (paramBoolean))
    {
      this.a.fj.setColor(h.b2[4][0]);
      this.a.fj.drawRect(i1 + this.jdField_else.lY * 18 + this.jdField_else.jdField_int / 3 % 2, i2 + this.jdField_else.lX * 18 + this.jdField_else.jdField_int / 3 % 2, 18 - 2 * (this.jdField_else.jdField_int / 3 % 2), 18 - 2 * (this.jdField_else.jdField_int / 3 % 2));
    }
    this.a.x();
    this.a.c();
  }
  
  public void jdMethod_if()
  {
    this.a.fR = null;
    this.a.gb = null;
    this.jdField_else.nl = ((short[][])null);
    this.jdField_else.jv = ((short[][])null);
    this.jdField_else.ev = ((short[][])null);
    this.jdField_else.lK = ((int[][])null);
    this.jdField_else.jc = null;
    this.jdField_else.lI = null;
    this.jdField_else.hA = null;
    this.jdField_else.i3 = null;
    Runtime.getRuntime().gc();
  }
  
  public void jdMethod_if(int paramInt)
  {
    int i1;
    int i3;
    switch (this.jdField_else.jdField_do)
    {
    case -39: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.a.i.jdMethod_do(paramInt);
        break;
      case 5: 
      case 6: 
        i1 = (short)(this.jdField_else.lY + this.jdField_else.lX * 6);
        if (this.jdField_else.bs[0] <= i1) {
          return;
        }
        this.jdField_else.e3 = 0;
        this.jdField_else.jdField_do = -41;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.jdField_else.jdField_do = 0;
      }
      break;
    case -41: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_else.e3 = 0;
        break;
      case 2: 
        this.jdField_else.e3 = 1;
        break;
      case 5: 
      case 6: 
        switch (this.jdField_else.e3)
        {
        case 0: 
          i1 = (short)(this.jdField_else.lY + this.jdField_else.lX * 6);
          if (this.a.aG.jdMethod_int(6710))
          {
            this.a.aG.jdMethod_do(this.a.az);
            this.a.aG.jdMethod_new(this.a.ay);
            this.a.aG.jdMethod_new(this.jdField_else.nl[0][i1]);
            this.a.aG.jdMethod_do(1);
            this.a.aG.jdMethod_if();
          }
          this.jdField_else.jdField_do = 21;
          break;
        case 1: 
          this.jdField_else.jdField_do = -39;
        }
        break;
      }
      break;
    case -43: 
      if (this.jdField_else.jdField_int > 20) {
        switch (paramInt)
        {
        case 1: 
          this.jdField_else.e3 = 0;
          break;
        case 2: 
          this.jdField_else.e3 = 1;
          break;
        case 5: 
        case 6: 
          switch (this.jdField_else.e3)
          {
          case 0: 
            this.jdField_else.bD = null;
            this.jdField_else.bD = new ag(this.a);
            this.jdField_else.bD.jdMethod_if(this.a.b0);
            this.jdField_else.bD.O = this.jdField_else.cw;
            this.jdField_else.hD = this.jdField_else.cw;
            this.jdField_else.bD.fp = 0;
            this.jdField_else.bD.T = false;
            this.jdField_else.bD.ao = false;
            this.jdField_else.bD.hU = false;
            this.jdField_else.bD.a4 = 0;
            this.jdField_else.bD.jdMethod_void(this.jdField_else.jP);
            this.jdField_else.bD.m(this.jdField_else.dv);
            this.jdField_else.bD.fa = this.jdField_else.mS;
            this.jdField_else.bD.g4 = this.jdField_else.hN;
            this.jdField_else.bD.hP = this.jdField_else.ig;
            this.jdField_else.bD.hO = this.jdField_else.id;
            this.a.a(this.jdField_else.bD, this.jdField_else.ms);
            this.jdField_else.bD.aP = this.jdField_else.fV;
            this.jdField_else.bD.aM = this.jdField_else.fU;
            this.jdField_else.bD.dT = this.jdField_else.bD.aP;
            this.jdField_else.bD.dS = this.jdField_else.bD.aM;
            this.jdField_else.bD.g((byte)0);
            this.jdField_else.bD.eN = this.jdField_else.dO;
            this.jdField_else.bD.eB = this.jdField_else.bm;
            this.jdField_else.bD.eP = null;
            this.jdField_else.bD.X();
            this.jdField_else.bD.he = (this.jdField_else.gg != 0);
            this.jdField_else.bD.fL = this.jdField_else.lO;
            this.jdField_else.bD.fx = this.jdField_else.gD;
            this.jdField_else.bD.es = this.jdField_else.kb;
            this.jdField_else.bD.fj = this.jdField_else.lD;
            this.jdField_else.bD.dU = (this.jdField_else.fd != 0);
            this.jdField_else.bD.gQ = false;
            this.jdField_else.bD.gk = false;
            this.jdField_else.bD.h4 = false;
            this.jdField_else.hD = this.jdField_else.bD.O;
            this.jdField_else.gj = this.jdField_else.h2;
            this.jdField_else.hc = this.jdField_else.eI;
            this.jdField_else.bD.a7 = this.jdField_else.gj;
            int[] arrayOfInt = new int[a.ad];
            for (i3 = 0; i3 < arrayOfInt.length; i3 = (byte)(i3 + 1)) {
              arrayOfInt[i3] = a3.a(this.jdField_else.gj[i3], a.C);
            }
            this.jdField_else.bD.H = arrayOfInt;
            this.jdField_else.bD.a(this.jdField_else.eI);
            this.jdField_else.bD.g((byte)0);
            this.jdField_else.jdField_do = 0;
            this.a.cZ.jdMethod_if((byte)16, this.a.cZ.a((byte)20));
            this.jdField_else.e7 = true;
            if (this.a.aG.jdMethod_int(4103))
            {
              this.a.aG.jdMethod_do(1);
              this.a.aG.jdMethod_if();
            }
            this.jdField_else.eE = 0;
            this.jdField_else.ly = 10;
            this.jdField_else.jdField_do = -44;
            this.jdField_else.jdField_int = 0;
            break;
          case 1: 
            if (this.a.aG.jdMethod_int(4103))
            {
              this.a.aG.jdMethod_do(0);
              this.a.aG.jdMethod_if();
            }
            this.jdField_else.jdField_do = 0;
          }
          break;
        }
      }
      break;
    case -42: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_else.e3 = 0;
        break;
      case 2: 
        this.jdField_else.e3 = 1;
        break;
      case 5: 
      case 6: 
        switch (this.jdField_else.e3)
        {
        case 0: 
          int i2 = 0;
          for (i3 = 0; i3 < this.jdField_else.kT; i3 = (byte)(i3 + 1)) {
            if (this.jdField_else.iy[i3].equals(this.jdField_else.b5))
            {
              if (!h.M(this.jdField_else.dq[i3]))
              {
                this.jdField_else.a(13, (short)0, false, 9999);
                return;
              }
              if (h.D(this.jdField_else.dq[i3]))
              {
                this.jdField_else.a("该玩家正在决斗中.", (short)0, false, 9999);
                return;
              }
              if (1 == h.h(this.jdField_else.dq[i3]))
              {
                this.jdField_else.a("该玩家倒地,不能决斗.", (short)0, false, 9999);
                return;
              }
              i2 = 1;
              this.jdField_else.kg = this.jdField_else.co[i3];
              this.jdField_else.hD = null;
              this.jdField_else.gj = null;
              this.jdField_else.hc = null;
              for (int i4 = 0; i4 < this.jdField_else.li.length; i4 = (byte)(i4 + 1)) {
                if ((!this.jdField_else.li[i4].gq) && (this.jdField_else.li[i4].O.equals(this.jdField_else.hD)))
                {
                  this.jdField_else.li[i4].gq = true;
                  break;
                }
              }
              this.jdField_else.bD = null;
              if (this.a.aG.jdMethod_int(4101))
              {
                this.a.aG.jdMethod_new(this.jdField_else.jdField_if);
                this.a.aG.jdMethod_if(this.jdField_else.b5);
                this.a.aG.jdMethod_for(this.jdField_else.fg);
                this.a.aG.jdMethod_if();
              }
              this.jdField_else.jdField_do = 21;
              break;
            }
          }
          if (i2 == 0)
          {
            this.jdField_else.a("该玩家已离开本场景.", (short)0, false, 9999);
            return;
          }
          break;
        case 1: 
          this.jdField_else.jdField_do = 0;
        }
        break;
      }
      break;
    case -40: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_else.a("只能输入" + this.jdField_else.f4 + "-" + this.jdField_else.hG + "的数.", this.jdField_else.jdField_do, false, 9999);
        break;
      case 0: 
        if (a3.jdMethod_do(this.jdField_else.mn, 4) > 0)
        {
          this.jdField_else.fg = a3.jdMethod_do(this.jdField_else.mn, 4);
          this.jdField_else.e3 = 0;
          this.jdField_else.jdField_do = -42;
        }
        break;
      case 1: 
        this.jdField_else.jdField_do = 0;
      }
      break;
    }
  }
  
  public void jdMethod_try(int paramInt)
  {
    int i1;
    switch (this.jdField_else.jdField_do)
    {
    case -68: 
    case -67: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_else.e3 = 0;
        break;
      case 2: 
        this.jdField_else.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_else.jdField_do)
        {
        case -67: 
          switch (this.jdField_else.e3)
          {
          case 0: 
            if (this.a.aG.jdMethod_int(4059))
            {
              this.a.aG.jdMethod_new(this.a.jdMethod_if((byte)117));
              this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
              this.a.aG.jdMethod_if();
            }
            this.jdField_else.jdField_do = 21;
            break;
          case 1: 
            this.jdField_else.jdField_do = -65;
          }
          break;
        case -68: 
          switch (this.jdField_else.e3)
          {
          case 0: 
            this.a.cZ.a((byte)1, this.a.jdMethod_if((byte)118), 1, true);
            if (this.a.aG.jdMethod_int(4051))
            {
              this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
              this.a.aG.jdMethod_do(this.a.b7[this.jdField_else.bf].a((byte)12));
              this.a.aG.jdMethod_do(0);
              this.a.aG.jdMethod_if();
            }
            this.a.b7[this.jdField_else.bf].jdMethod_if((byte)12, 0);
            if (this.a.cZ.gR == this.a.b7[this.jdField_else.bf]) {
              this.a.cZ.gR = null;
            }
            this.jdField_else.a("封印成功.", (short)0, false, 9999);
            break;
          case 1: 
            this.jdField_else.jdField_do = -66;
          }
          break;
        }
        break;
      }
      break;
    case -69: 
    case -66: 
    case -65: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
        if (this.a.b7[this.jdField_else.bf] == null) {
          return;
        }
        switch (this.jdField_else.jdField_do)
        {
        case -69: 
          this.a.i.jdMethod_new();
          break;
        case -66: 
          if (this.a.b7[this.jdField_else.bf].a((byte)12) == 0) {
            return;
          }
          this.jdField_else.e3 = 0;
          this.jdField_else.jdField_do = -68;
          break;
        case -65: 
          if (this.a.b7[this.jdField_else.bf].a((byte)40) > 0) {
            return;
          }
          this.jdField_else.e3 = 0;
          this.jdField_else.jdField_do = -67;
        }
        break;
      case 7: 
        this.jdField_else.jdField_do = 0;
        break;
      case 3: 
        this.jdField_else.mz = 0;
        g tmp860_857 = this.jdField_else;
        tmp860_857.bf = ((byte)(tmp860_857.bf - 1));
        if (this.jdField_else.bf < 0) {
          this.jdField_else.bf = ((byte)(h.f0 - 1));
        }
        break;
      case 4: 
        this.jdField_else.mz = 0;
        g tmp913_910 = this.jdField_else;
        tmp913_910.bf = ((byte)(tmp913_910.bf + 1));
        if (this.jdField_else.bf > h.f0 - 1) {
          this.jdField_else.bf = 0;
        }
        break;
      case 1: 
        if (h.a9 == 0) {
          this.jdField_else.mz = 0;
        }
        break;
      case 2: 
        if (h.a9 == 0) {
          this.jdField_else.mz = 1;
        }
        break;
      }
      break;
    case -63: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_else.e3 = 0;
        break;
      case 2: 
        this.jdField_else.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_else.e3)
        {
        case 0: 
          if (this.a.aG.jdMethod_int(4012))
          {
            this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
            this.a.aG.jdMethod_if();
          }
          this.jdField_else.jdField_do = 21;
          break;
        case 1: 
          this.jdField_else.jdField_do = -34;
        }
        break;
      }
      break;
    case -62: 
    case -61: 
      this.a.a4.a(paramInt);
      break;
    case -60: 
    case -59: 
    case -58: 
      this.a.di.a(paramInt);
      break;
    case -57: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_else.e3 = 0;
        break;
      case 2: 
        this.jdField_else.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_else.e3)
        {
        case 0: 
          i1 = (byte)(this.jdField_else.lY + this.jdField_else.lX * 6);
          if (this.a.aG.jdMethod_int(4054))
          {
            this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
            this.a.aG.jdMethod_new(this.jdField_else.nl[0][i1]);
            this.a.aG.jdMethod_do(a3.jdMethod_do(this.a.v, 2));
            this.a.aG.jdMethod_if();
          }
          this.a.cZ.a((byte)0, this.jdField_else.nl[0][i1], 1, true);
          this.jdField_else.jdField_do = 21;
          break;
        case 1: 
          this.jdField_else.jdField_do = -55;
        }
        break;
      }
      break;
    case -56: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_else.a("只能输入" + this.jdField_else.f4 + "-" + this.jdField_else.hG + "的数.", this.jdField_else.jdField_do, false, 9999);
        break;
      case 0: 
        this.a.v = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_else.mn, 4), 2));
        this.jdField_else.e3 = 0;
        this.jdField_else.jdField_do = -57;
        break;
      case 1: 
        this.jdField_else.jdField_do = -55;
      }
      break;
    case -55: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.a.i.jdMethod_do(paramInt);
        break;
      case 5: 
      case 6: 
        i1 = (byte)(this.jdField_else.lY + this.jdField_else.lX * 6);
        if (i1 > this.jdField_else.bs[0] - 1) {
          return;
        }
        this.a.d9 = new w(this.a, "数量", 1, this.a.cZ.jdMethod_if(this.jdField_else.nl[0][i1]), 1);
        this.jdField_else.jdField_do = -56;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.jdField_else.jdField_do = -34;
      }
      break;
    case -34: 
      jdMethod_new(paramInt);
      break;
    case -53: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_else.a("只能输入" + this.jdField_else.f4 + "-" + this.jdField_else.hG + "的数.", this.jdField_else.jdField_do, false, 9999);
        break;
      case 0: 
        i1 = (byte)(this.jdField_else.lY + this.jdField_else.lX * 6);
        if (a3.jdMethod_do(this.jdField_else.mn, 4) > 0)
        {
          if (a3.jdMethod_do(this.jdField_else.jv[0][i1], 2) == 0)
          {
            g tmp1998_1995 = this.jdField_else;
            tmp1998_1995.dx = ((short)(tmp1998_1995.dx + 1));
          }
          this.jdField_else.jv[0][i1] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_else.mn, 4), 2));
        }
        else if (a3.jdMethod_do(this.jdField_else.mn, 4) == 0)
        {
          if (a3.jdMethod_do(this.jdField_else.jv[0][i1], 2) > 0)
          {
            g tmp2074_2071 = this.jdField_else;
            tmp2074_2071.dx = ((short)(tmp2074_2071.dx - 1));
          }
          this.jdField_else.jv[0][i1] = ((short)a3.jdMethod_new(0, 2));
        }
        this.jdField_else.jdField_do = -52;
        break;
      case 1: 
        this.jdField_else.jdField_do = -52;
      }
      break;
    case -54: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_else.e3 = 0;
        break;
      case 2: 
        this.jdField_else.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_else.e3)
        {
        case 0: 
          if (this.a.aG.jdMethod_int(4053))
          {
            this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
            this.a.aG.jdMethod_do(this.jdField_else.dx);
            for (i1 = 0; i1 < this.jdField_else.bs[0]; i1 = (byte)(i1 + 1)) {
              if (a3.jdMethod_do(this.jdField_else.jv[0][i1], 2) > 0)
              {
                this.a.aG.jdMethod_new(this.jdField_else.nl[0][i1]);
                this.a.aG.jdMethod_do(a3.jdMethod_do(this.jdField_else.jv[0][i1], 2));
              }
            }
            this.a.aG.jdMethod_if();
          }
          for (i1 = 0; i1 < this.jdField_else.bs[0]; i1 = (byte)(i1 + 1)) {
            if (a3.jdMethod_do(this.jdField_else.jv[0][i1], 2) > 0) {
              this.a.cZ.a((byte)0, this.jdField_else.nl[0][i1], a3.jdMethod_do(this.jdField_else.jv[0][i1], 2), true);
            }
          }
          this.jdField_else.jdField_do = 21;
          break;
        case 1: 
          this.jdField_else.jdField_do = -52;
        }
        break;
      }
      break;
    case -52: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.a.i.jdMethod_do(paramInt);
        break;
      case 5: 
        i1 = (byte)(this.jdField_else.lY + this.jdField_else.lX * 6);
        if (i1 > this.jdField_else.bs[0] - 1) {
          return;
        }
        this.a.d9 = new w(this.a, "数量", 0, this.a.cZ.jdMethod_if(this.jdField_else.nl[0][i1]), a3.jdMethod_do(this.jdField_else.jv[0][i1], 2) == 0 ? this.a.cZ.jdMethod_if(this.jdField_else.nl[0][i1]) : a3.jdMethod_do(this.jdField_else.jv[0][i1], 2));
        this.jdField_else.jdField_do = -53;
        break;
      case 6: 
        if (this.jdField_else.dx == 0) {
          return;
        }
        this.jdField_else.e3 = 0;
        this.jdField_else.jdField_do = -54;
        break;
      case 7: 
        this.a.i.jdMethod_if();
        this.jdField_else.jdField_do = -34;
      }
      break;
    case -35: 
      switch (paramInt)
      {
      case 1: 
        g tmp2852_2849 = this.jdField_else;
        tmp2852_2849.gd = ((byte)(tmp2852_2849.gd - 1));
        if (this.jdField_else.gd < 0) {
          this.jdField_else.gd = ((byte)(this.jdField_else.c9.length - 1));
        }
        break;
      case 2: 
        g tmp2897_2894 = this.jdField_else;
        tmp2897_2894.gd = ((byte)(tmp2897_2894.gd + 1));
        if (this.jdField_else.gd > this.jdField_else.c9.length - 1) {
          this.jdField_else.gd = 0;
        }
        break;
      case 5: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i1 = this.a.jdMethod_do(paramInt, this.jdField_else.c9.length);
        if (i1 < 0) {
          return;
        }
        if (i1 > 0) {
          this.jdField_else.gd = ((byte)i1);
        }
        short[] arrayOfShort;
        switch (this.jdField_else.gd)
        {
        case 0: 
          if (this.a.b7[this.jdField_else.bf].a((byte)12) == 0)
          {
            this.jdField_else.a(14, (short)-34, false, 9999);
            return;
          }
          if (this.a.b7[this.jdField_else.bf].a((byte)40) <= 0)
          {
            this.jdField_else.a(15, (short)-34, false, 9999);
            return;
          }
          this.a.cZ.y();
          this.a.i.a(1, (byte)0, this.a.cZ.gJ[0], this.a.cZ.gw[0], new short[this.a.cZ.gw[0].length]);
          arrayOfShort = new short[this.a.cZ.gJ[0]];
          System.arraycopy(this.a.cZ.gw[0], 0, arrayOfShort, 0, this.a.cZ.gJ[0]);
          this.a.i.a(arrayOfShort, true);
          this.jdField_else.jdField_do = -52;
          break;
        case 1: 
          switch (this.a.b7[this.jdField_else.bf].a((byte)12))
          {
          case 0: 
            if (this.a.aG.jdMethod_int(4051))
            {
              this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
              this.a.aG.jdMethod_do(this.a.b7[this.jdField_else.bf].a((byte)12));
              this.a.aG.jdMethod_do(1);
              this.a.aG.jdMethod_if();
            }
            this.a.b7[this.jdField_else.bf].jdMethod_if((byte)12, 1);
            this.jdField_else.a("宠物激活后要再次封印，需要用特殊道具.", (short)-34, false, 9999);
            break;
          case 1: 
            if (this.a.b7[this.jdField_else.bf].a((byte)40) <= 0)
            {
              this.jdField_else.a("宠物死亡,不能释放.", (short)-34, false, 9999);
              return;
            }
            for (int i2 = 0; i2 < this.a.jdField_try; i2 = (byte)(i2 + 1)) {
              if ((i2 != this.jdField_else.bf) && (this.a.b7[i2].a((byte)12) == 2))
              {
                if (this.a.aG.jdMethod_int(4051))
                {
                  this.a.aG.jdMethod_for(this.a.b7[i2].a((byte)0));
                  this.a.aG.jdMethod_do(this.a.b7[i2].a((byte)12));
                  this.a.aG.jdMethod_do(1);
                  this.a.aG.jdMethod_if();
                }
                this.a.b7[i2].jdMethod_if((byte)12, 1);
              }
            }
            this.a.b7[this.jdField_else.bf].jdMethod_if((byte)12, 2);
            this.a.cZ.gR = this.a.b7[this.jdField_else.bf];
            this.a.jdMethod_if(this.a.cZ.gR, this.a.cZ);
            if (this.a.aG.jdMethod_int(4051))
            {
              this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
              this.a.aG.jdMethod_do(1);
              this.a.aG.jdMethod_do(2);
              this.a.aG.jdMethod_if();
            }
            this.jdField_else.jdField_do = -34;
            break;
          case 2: 
            this.a.b7[this.jdField_else.bf].jdMethod_if((byte)12, 1);
            this.a.cZ.gR = null;
            if (this.a.aG.jdMethod_int(4051))
            {
              this.a.aG.jdMethod_for(this.a.b7[this.jdField_else.bf].a((byte)0));
              this.a.aG.jdMethod_do(2);
              this.a.aG.jdMethod_do(1);
              this.a.aG.jdMethod_if();
            }
            this.jdField_else.jdField_do = -34;
          }
          break;
        case 2: 
          if (this.a.b7[this.jdField_else.bf].a((byte)14) <= 30)
          {
            this.jdField_else.a(9, (short)-34, false, 9999);
            return;
          }
          if (this.a.b7[this.jdField_else.bf].a((byte)12) != 2)
          {
            this.jdField_else.a(10, (short)-34, false, 9999);
            return;
          }
          this.a.cZ.y();
          this.a.i.a(1, (byte)0, this.a.cZ.gJ[0], this.a.cZ.gw[0], new short[this.a.cZ.gw[0].length]);
          arrayOfShort = new short[this.a.cZ.gJ[0]];
          System.arraycopy(this.a.cZ.gw[0], 0, arrayOfShort, 0, this.a.cZ.gJ[0]);
          this.a.i.a(arrayOfShort, true);
          this.jdField_else.a("请从背包中选择1种进化材料。(进化成功宠物将进阶;进化失败将导致宠物降1级)", (short)-55, false, 9999);
          break;
        case 3: 
          this.jdField_else.e3 = 0;
          this.jdField_else.jdField_do = -63;
          break;
        case 4: 
          this.jdField_else.jdField_do = -34;
        }
        break;
      }
      break;
    }
  }
  
  public void jdMethod_new(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
    case 6: 
      if (this.a.b7[this.jdField_else.bf] == null) {
        return;
      }
      switch (this.a.b7[this.jdField_else.bf].a((byte)12))
      {
      case 0: 
        h.a7[1] = "激活";
        break;
      case 1: 
        h.a7[1] = "释放";
        break;
      case 2: 
        h.a7[1] = "回收";
      }
      this.jdField_else.c9 = h.a7;
      this.jdField_else.gd = 0;
      this.jdField_else.jdField_do = -35;
      break;
    case 7: 
      this.jdField_else.jdField_do = 0;
      break;
    case 3: 
      this.jdField_else.mz = 0;
      g tmp211_208 = this.jdField_else;
      tmp211_208.bf = ((byte)(tmp211_208.bf - 1));
      if (this.jdField_else.bf < 0) {
        this.jdField_else.bf = ((byte)(h.f0 - 1));
      }
      break;
    case 4: 
      this.jdField_else.mz = 0;
      g tmp264_261 = this.jdField_else;
      tmp264_261.bf = ((byte)(tmp264_261.bf + 1));
      if (this.jdField_else.bf > h.f0 - 1) {
        this.jdField_else.bf = 0;
      }
      break;
    case 1: 
      if (h.a9 == 0) {
        this.jdField_else.mz = 0;
      }
      break;
    case 2: 
      if (h.a9 == 0) {
        this.jdField_else.mz = 1;
      }
      break;
    }
  }
  
  public void jdMethod_int(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 7: 
      this.jdField_else.jdField_do = 2;
      break;
    case 1: 
      g tmp88_85 = this.jdField_else;
      tmp88_85.l4 = ((byte)(tmp88_85.l4 - 1));
      if (this.jdField_else.l4 < 0) {
        this.jdField_else.l4 = ((byte)(this.jdField_else.cz.length - 1));
      }
      break;
    case 2: 
      g tmp133_130 = this.jdField_else;
      tmp133_130.l4 = ((byte)(tmp133_130.l4 + 1));
      if (this.jdField_else.l4 > (byte)(this.jdField_else.cz.length - 1)) {
        this.jdField_else.l4 = 0;
      }
      break;
    case 5: 
    case 6: 
    case 49: 
      int i1 = this.a.jdMethod_do(paramInt, this.jdField_else.cz.length);
      if (i1 < 0) {
        return;
      }
      if (i1 > 0) {
        this.jdField_else.l4 = ((byte)i1);
      }
      switch (this.jdField_else.l4)
      {
      case 0: 
        if (this.a.cZ.fL < 0) {
          return;
        }
        if (this.a.aG.jdMethod_int(3726))
        {
          this.a.aG.jdMethod_for(this.a.cZ.fL);
          this.a.aG.jdMethod_if();
        }
        this.jdField_else.jdField_do = 21;
        break;
      case 1: 
        if (this.a.cZ.fL < 0) {
          return;
        }
        if (this.a.aG.jdMethod_int(3738))
        {
          this.a.aG.jdMethod_for(this.a.cZ.fL);
          this.a.aG.jdMethod_if();
        }
        this.jdField_else.jdField_do = 21;
        break;
      case 2: 
        if (this.a.cZ.fL < 0) {
          return;
        }
        this.jdField_else.F();
        break;
      case 3: 
        if (this.a.aG.jdMethod_int(3734))
        {
          this.a.aG.jdMethod_for(this.a.cZ.fL);
          this.a.aG.jdMethod_if();
        }
        this.jdField_else.jdField_do = 21;
        break;
      case 4: 
        if (this.a.cZ.fL < 0) {
          return;
        }
        if (this.a.aG.jdMethod_int(3705))
        {
          this.a.aG.jdMethod_for(this.a.cZ.fL);
          this.a.aG.jdMethod_if();
        }
        this.jdField_else.jdField_do = 21;
      }
      break;
    }
  }
  
  public void jdMethod_byte(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 7: 
      this.jdField_else.jdField_do = 2;
      break;
    case 1: 
      g tmp88_85 = this.jdField_else;
      tmp88_85.kk = ((byte)(tmp88_85.kk - 1));
      if (this.jdField_else.kk < 0) {
        this.jdField_else.kk = ((byte)(this.jdField_else.mv.length - 1));
      }
      break;
    case 2: 
      g tmp133_130 = this.jdField_else;
      tmp133_130.kk = ((byte)(tmp133_130.kk + 1));
      if (this.jdField_else.kk > (byte)(this.jdField_else.mv.length - 1)) {
        this.jdField_else.kk = 0;
      }
      break;
    case 5: 
    case 6: 
    case 49: 
      int i1 = this.a.jdMethod_do(paramInt, this.jdField_else.mv.length);
      if (i1 < 0) {
        return;
      }
      if (i1 > 0) {
        this.jdField_else.kk = ((byte)i1);
      }
      switch (this.jdField_else.kk)
      {
      case 0: 
        this.jdField_else.fO = 0;
        this.jdField_else.D();
        break;
      case 1: 
        this.jdField_else.fO = 1;
        this.jdField_else.n();
      }
      break;
    }
  }
  
  public void jdMethod_for(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 7: 
      this.jdField_else.jdField_do = 2;
      break;
    case 1: 
      g tmp88_85 = this.jdField_else;
      tmp88_85.nd = ((byte)(tmp88_85.nd - 1));
      if (this.jdField_else.nd < 0) {
        this.jdField_else.nd = ((byte)(this.jdField_else.ke.length - 1));
      }
      break;
    case 2: 
      g tmp133_130 = this.jdField_else;
      tmp133_130.nd = ((byte)(tmp133_130.nd + 1));
      if (this.jdField_else.nd > (byte)(this.jdField_else.ke.length - 1)) {
        this.jdField_else.nd = 0;
      }
      break;
    case 5: 
    case 6: 
    case 49: 
      int i1 = this.a.jdMethod_do(paramInt, this.jdField_else.ke.length);
      if (i1 < 0) {
        return;
      }
      if (i1 > 0) {
        this.jdField_else.nd = ((byte)i1);
      }
      switch (this.jdField_else.nd)
      {
      case 0: 
        this.jdField_else.w();
        break;
      case 1: 
        if (this.a.aG.jdMethod_int(3565))
        {
          this.a.aG.jdMethod_do(0);
          this.a.aG.jdMethod_if();
        }
        this.jdField_else.jdField_do = 21;
        break;
      case 2: 
        this.jdField_else.A();
        this.jdField_else.a("退出队伍成功.", (short)0, false, 9999);
      }
      break;
    }
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      g tmp48_45 = this.jdField_else;
      if ((tmp48_45.hq = (byte)(tmp48_45.hq - 1)) < 0) {
        this.jdField_else.hq = 5;
      }
      break;
    case 4: 
      g tmp77_74 = this.jdField_else;
      if ((tmp77_74.hq = (byte)(tmp77_74.hq + 1)) > 5) {
        this.jdField_else.hq = 0;
      }
      break;
    case 1: 
      g tmp107_104 = this.jdField_else;
      if ((tmp107_104.hp = (byte)(tmp107_104.hp - 1)) < 0) {
        this.jdField_else.hp = 5;
      }
      break;
    case 2: 
      g tmp136_133 = this.jdField_else;
      if ((tmp136_133.hp = (byte)(tmp136_133.hp + 1)) > 5) {
        this.jdField_else.hp = 0;
      }
      break;
    case 7: 
      Display.getDisplay(this.a.fG).setCurrent(this.a.i.jdField_null);
      break;
    case 5: 
    case 6: 
      try
      {
        if (this.a.i.d.size() > 28) {
          this.a.i.d.delete(28, this.a.i.d.size() - 28);
        }
        this.a.i.d.insert("/" + (char)(48 + this.jdField_else.hp * 6 + this.jdField_else.hq), this.a.i.d.getString().length());
      }
      catch (Exception localException) {}
      Display.getDisplay(this.a.fG).setCurrent(this.a.i.jdField_null);
    }
  }
  
  public Vector[] a(boolean paramBoolean)
  {
    Vector[] arrayOfVector = new Vector[2];
    arrayOfVector[0] = new Vector();
    arrayOfVector[1] = new Vector();
    synchronized (this.jdField_else.mX)
    {
      if (paramBoolean) {
        for (i1 = 0; i1 < this.jdField_else.jF; i1 = (byte)(i1 + 1)) {
          if (h.a(this.jdField_else.jU[i1], this.jdField_else.jT[i1], 25, 25, ag.hF, ag.hE, h.dU, h.fp))
          {
            arrayOfVector[0].addElement(this.jdField_else.cp[i1]);
            arrayOfVector[1].addElement(new Short((short)-1));
          }
        }
      }
      for (int i1 = 0; i1 < 3; i1 = (byte)(i1 + 1)) {
        for (int i2 = 0; i2 < Math.min(this.jdField_else.kT, 30); i2++) {
          if ((this.jdField_else.mX[i2] > ag.hF - 15) && (this.jdField_else.mX[i2] < ag.hF + h.dU) && (this.jdField_else.mW[i2] > ag.hE - 15) && (this.jdField_else.mW[i2] < ag.hE + h.fp)) {
            if (i1 == 0)
            {
              if (h.jdMethod_case(this.jdField_else.dq[i2]))
              {
                arrayOfVector[0].addElement(this.jdField_else.iy[i2]);
                arrayOfVector[1].addElement(new Short(this.jdField_else.dq[i2]));
              }
            }
            else
            {
              int i3;
              if ((this.a.cZ.gE) && (i1 == 1))
              {
                if (!h.jdMethod_case(this.jdField_else.dq[i2])) {
                  for (i3 = 0; i3 < this.jdField_else.g6.length; i3 = (byte)(i3 + 1)) {
                    if (this.jdField_else.g6[i3].equals(this.jdField_else.iy[i2]))
                    {
                      arrayOfVector[0].addElement(this.jdField_else.iy[i2]);
                      arrayOfVector[1].addElement(new Short(this.jdField_else.dq[i2]));
                    }
                  }
                }
              }
              else if ((i1 == 2) && (!h.jdMethod_case(this.jdField_else.dq[i2])))
              {
                i3 = 1;
                if (this.a.cZ.gE) {
                  for (int i4 = 0; i4 < this.jdField_else.g6.length; i4 = (byte)(i4 + 1)) {
                    if (this.jdField_else.g6[i4].equals(this.jdField_else.iy[i2])) {
                      i3 = 0;
                    }
                  }
                }
                if (i3 != 0)
                {
                  arrayOfVector[0].addElement(this.jdField_else.iy[i2]);
                  arrayOfVector[1].addElement(new Short(this.jdField_else.dq[i2]));
                }
              }
            }
          }
        }
      }
    }
    return arrayOfVector;
  }
  
  public void a(String paramString)
  {
    if (this.a.bR.a((byte)5)) {
      return;
    }
    this.jdField_else.dc = 0;
    this.jdField_else.lT = 0;
    this.jdField_else.bO = this.a.cZ.a((byte)0);
    try
    {
      int i1 = 0;
      synchronized (this.jdField_else.jd)
      {
        for (int i2 = 0; i2 < this.jdField_else.jF; i2 = (short)(i2 + 1)) {
          if (paramString.equals(this.jdField_else.cp[i2]))
          {
            i1 = 1;
            int i3 = (byte)this.jdField_else.jd[i2].length;
            short[] arrayOfShort = new short[i3];
            byte[] arrayOfByte = new byte[i3];
            int[] arrayOfInt = new int[i3];
            for (int i4 = 0; i4 < i3; i4 = (byte)(i4 + 1))
            {
              arrayOfShort[i4] = ((short)this.jdField_else.jd[i2][i4]);
              arrayOfByte[i4] = this.jdField_else.bP[i2][i4];
              arrayOfInt[i4] = this.jdField_else.br[i2][i4];
            }
            this.a.i.a(1, (byte)0, (byte)arrayOfShort.length, arrayOfShort, new short[arrayOfShort.length]);
            this.a.i.a(arrayOfShort, false);
            for (i4 = 0; i4 < this.jdField_else.bs[0]; i4 = (byte)(i4 + 1))
            {
              this.jdField_else.ev[0][i4] = ((short)a3.jdMethod_new(arrayOfByte[i4], 2));
              this.jdField_else.lK[0][i4] = arrayOfInt[i4];
            }
            this.jdField_else.hB = 0;
            this.jdField_else.jdField_do = -80;
            return;
          }
        }
      }
      if (i1 == 0) {
        this.jdField_else.a("打开离线摊位失败.", (short)0, false, 9999);
      }
    }
    catch (Exception localException)
    {
      this.jdField_else.a("打开离线摊位失败.", (short)0, false, 9999);
    }
  }
  
  public byte jdMethod_try()
  {
    int i2;
    for (int i1 = 0; i1 < this.jdField_else.kT; i2 = (byte)(i1 + 1)) {
      if (((this.jdField_else.mX[i1] <= ag.hF) || (this.jdField_else.mX[i1] >= ag.hF + h.dU) || (this.jdField_else.mW[i1] <= ag.hE) || (this.jdField_else.mW[i1] >= ag.hE + h.fp)) && (!h.jdMethod_case(this.jdField_else.dq[i1]))) {
        return i1;
      }
    }
    return -1;
  }
  
  public void a(int paramInt, DataInputStream paramDataInputStream)
  {
    try
    {
      int i1;
      int i2;
      int i3;
      short s1;
      int i4;
      short s2;
      short s3;
      int i5;
      int i6;
      short s7;
      int i8;
      byte b1;
      byte b2;
      short s11;
      byte b3;
      int i11;
      byte b4;
      boolean bool1;
      boolean bool2;
      boolean bool3;
      byte b5;
      byte b6;
      String str1;
      int i12;
      short[] arrayOfShort;
      int i14;
      byte b9;
      short s9;
      short s10;
      int i17;
      int i18;
      switch (paramInt)
      {
      case 3302: 
        if (!this.jdField_else.y()) {
          return;
        }
        i1 = paramDataInputStream.readShort();
        i2 = (short)(i1 & 0x7FFF);
        i3 = (i1 >> 15 & 0x1) == 1 ? 1 : 0;
        if (i2 != this.jdField_else.jdField_if) {
          return;
        }
        s1 = paramDataInputStream.readByte();
        for (i4 = 0; i4 < s1; i4 = (byte)(i4 + 1))
        {
          s2 = paramDataInputStream.readShort();
          s3 = paramDataInputStream.readShort();
          i5 = paramDataInputStream.readShort();
          i6 = paramDataInputStream.readShort();
          short s5 = paramDataInputStream.readShort();
          s7 = paramDataInputStream.readShort();
          long l2 = paramDataInputStream.readLong();
          i8 = (int)(l2 & 0xFFFFFF);
          int i9 = (short)(int)(l2 >> 24 & 0x1FF);
          int i10 = (short)(int)(l2 >> 34 & 0x1FF);
          b1 = (byte)(int)(l2 >> 44 & 1L);
          b2 = (byte)(int)(l2 >> 45 & 0x3);
          s11 = (short)(int)(l2 >> 47 & 0xFFF);
          b3 = paramDataInputStream.readByte();
          i11 = paramDataInputStream.readByte();
          b4 = paramDataInputStream.readByte();
          bool1 = (i11 & 0x1) > 0;
          bool2 = (i11 & 0x2) > 0;
          bool3 = (i11 & 0x4) > 0;
          b5 = paramDataInputStream.readByte();
          b6 = paramDataInputStream.readByte();
          str1 = null;
          if (i3 != 0) {
            str1 = paramDataInputStream.readUTF();
          }
          i12 = paramDataInputStream.readByte();
          arrayOfShort = new short[8];
          for (int i13 = 0; i13 < 8; i13 = (byte)(i13 + 1)) {
            if ((i12 >> i13 & 0x1) > 0) {
              arrayOfShort[i13] = paramDataInputStream.readShort();
            } else {
              arrayOfShort[i13] = -1;
            }
          }
          i13 = -1;
          i13 = paramDataInputStream.readInt();
          i14 = paramDataInputStream.readByte();
          byte b7 = paramDataInputStream.readByte();
          String str3 = null;
          if (b7 != -1) {
            str3 = paramDataInputStream.readUTF();
          }
          if (i8 != q.cB)
          {
            int i16;
            if (g.dZ == 1)
            {
              if (!this.a.cZ.gE) {
                return;
              }
              b9 = 0;
              for (i16 = 0; i16 < this.jdField_else.g6.length; i16 = (byte)(i16 + 1)) {
                if (this.jdField_else.g6[i16].equals(str1))
                {
                  b9 = 1;
                  break;
                }
              }
              if (b9 == 0) {}
            }
            else if ((g.dD != 3) || ((this.a.cZ.fL >= 0) && (i13 == this.a.cZ.fL)))
            {
              b9 = 0;
              for (i16 = 0; i16 < this.jdField_else.kT; i16 = (byte)(i16 + 1)) {
                if (i8 == this.jdField_else.co[i16])
                {
                  b9 = 1;
                  this.jdField_else.dq[i16] = s11;
                  if (h.h(s11) == 1)
                  {
                    this.jdField_else.mX[i16] = i9;
                    this.jdField_else.mW[i16] = i10;
                    this.jdField_else.jq[i16] = this.jdField_else.mX[i16];
                    this.jdField_else.jo[i16] = this.jdField_else.mW[i16];
                  }
                  else
                  {
                    this.jdField_else.jq[i16] = i9;
                    this.jdField_else.jo[i16] = i10;
                  }
                  this.jdField_else.jn[i16] = b5;
                  this.jdField_else.jm[i16] = b6;
                  this.jdField_else.en[i16] = bool3;
                  this.jdField_else.hQ[i16] = b4;
                  this.jdField_else.k9[i16] = bool1;
                  this.jdField_else.gT[i16] = bool2;
                  this.jdField_else.jC[i16] = arrayOfShort;
                  this.jdField_else.iD[i16] = ((short)b3);
                  this.jdField_else.fz[i16] = s2;
                  this.jdField_else.g5[i16] = s3;
                  this.jdField_else.kA[i16] = i5;
                  this.jdField_else.dX[i16] = i6;
                  this.jdField_else.fi[i16] = s5;
                  this.jdField_else.kJ[i16] = s7;
                  this.jdField_else.mL[i16] = i13;
                  this.jdField_else.k7[i16] = i14;
                  this.jdField_else.gh[i16] = b7;
                  this.jdField_else.fy[i16] = str3;
                }
              }
              if ((b9 == 0) && (this.jdField_else.kT >= 30) && (i9 > ag.hF - 15) && (i9 < ag.hF + h.dU) && (i10 > ag.hE - 15) && (i10 < ag.hE + h.fp))
              {
                str1 = (String)this.jdField_else.fu.get(new Integer(i8));
                if (str1 != null)
                {
                  i16 = jdMethod_try();
                  if (i16 != -1)
                  {
                    this.jdField_else.jdMethod_if(i16);
                    this.jdField_else.a(i8, b1, b2, str1, i9, i10, arrayOfShort, b3, s2, s3, i5, i6, s5, s7, s11, i13, i14, b7, str3, bool1, bool2, bool3, b4, b5, b6);
                  }
                }
              }
            }
          }
        }
        break;
      case 3301: 
        if (!this.jdField_else.y()) {
          return;
        }
        i4 = paramDataInputStream.readShort();
        if (i4 != this.jdField_else.jdField_if) {
          return;
        }
        s1 = paramDataInputStream.readByte();
        for (s2 = 0; s2 < s1; s2 = (byte)(s2 + 1))
        {
          s3 = paramDataInputStream.readShort();
          i5 = paramDataInputStream.readByte();
          i6 = (i5 & 0x1) > 0 ? 1 : 0;
          long l1 = paramDataInputStream.readLong();
          int i7 = (int)(l1 & 0xFFFFFF);
          short s8 = (short)(int)(l1 >> 24 & 0x1FF);
          i8 = (short)(int)(l1 >> 34 & 0x1FF);
          s9 = (short)(int)(l1 >> 47 & 0xFFF);
          if (i7 != q.cB)
          {
            if (i7 == this.jdField_else.kg) {
              if ((h.jdMethod_case(s9)) || ((!this.jdField_else.e7) && (h.D(s9)) && (this.jdField_else.hD != null)))
              {
                this.jdField_else.kg = -1;
                this.jdField_else.hD = null;
                this.jdField_else.bD = null;
              }
              else if (this.jdField_else.bD != null)
              {
                this.jdField_else.bD.jdMethod_if((byte)16, s3);
                this.jdField_else.bD.dT = s8;
                this.jdField_else.bD.dS = i8;
                this.jdField_else.bD.hv = i6;
                this.a.a(this.jdField_else.bD, i5);
                if (this.jdField_else.bD.fv == 4) {
                  this.jdField_else.bD.g((byte)0);
                }
                if (1 == h.h(s9))
                {
                  if (this.jdField_else.bD.aD == this.a.cZ)
                  {
                    if (this.a.cZ.gV == this.jdField_else.bD) {
                      this.a.cZ.gV = null;
                    }
                    if (this.a.cZ.ep == this.jdField_else.bD) {
                      this.a.cZ.ep = null;
                    }
                  }
                  this.jdField_else.bD.jdMethod_if((byte)16, 0);
                  if (this.jdField_else.bD.a4 == 0) {
                    this.jdField_else.bD.a4 = 10;
                  }
                }
                else if (this.jdField_else.bD.a4 == 10)
                {
                  this.jdField_else.bD.a4 = 0;
                }
                if ((this.jdField_else.bD.hB) && (this.jdField_else.bD.dz > 0))
                {
                  if (this.a.aG.jdMethod_int(4502))
                  {
                    this.a.aG.jdMethod_new(this.jdField_else.jdField_if);
                    this.a.aG.jdMethod_if(this.jdField_else.bD.O);
                    this.a.aG.jdMethod_do(3);
                    this.a.aG.jdMethod_do(-1);
                    this.a.aG.jdMethod_new(this.jdField_else.bD.dz);
                    this.a.aG.jdMethod_do((!this.jdField_else.e7) && (!this.jdField_else.ki) ? 1 : 0);
                    this.a.aG.jdMethod_if();
                  }
                  this.jdField_else.bD.dz = 0;
                }
                this.jdField_else.bD.gf = 0;
                this.jdField_else.bD.fV = 0;
                this.jdField_else.bD.hB = false;
                this.jdField_else.bD.he = h.u(s9);
                this.jdField_else.bD.gQ = this.a.a(this.jdField_else.hD);
                this.jdField_else.bD.h4 = h.jdMethod_new(s9);
              }
            }
            for (s10 = 0; s10 < this.jdField_else.kT; s10 = (byte)(s10 + 1)) {
              if (i7 == this.jdField_else.co[s10])
              {
                this.jdField_else.en[s10] = i6;
                this.jdField_else.hQ[s10] = i5;
                this.jdField_else.fz[s10] = s3;
                if (h.h(s9) == 1)
                {
                  this.jdField_else.mX[s10] = s8;
                  this.jdField_else.mW[s10] = i8;
                  this.jdField_else.jq[s10] = this.jdField_else.mX[s10];
                  this.jdField_else.jo[s10] = this.jdField_else.mW[s10];
                }
                else
                {
                  this.jdField_else.jq[s10] = s8;
                  this.jdField_else.jo[s10] = i8;
                }
                this.jdField_else.dq[s10] = s9;
              }
            }
          }
        }
        break;
      case 3303: 
        i1 = paramDataInputStream.readShort();
        i2 = (short)(i1 & 0x7FFF);
        i3 = (i1 >> 15 & 0x1) == 1 ? 1 : 0;
        if (i2 != this.jdField_else.jdField_if) {
          return;
        }
        s2 = paramDataInputStream.readShort();
        s3 = paramDataInputStream.readShort();
        short s4 = paramDataInputStream.readShort();
        i6 = paramDataInputStream.readShort();
        short s6 = paramDataInputStream.readShort();
        s7 = paramDataInputStream.readShort();
        long l3 = paramDataInputStream.readLong();
        i8 = (int)(l3 & 0xFFFFFF);
        if (i8 == q.cB) {
          return;
        }
        s9 = (short)(int)(l3 >> 24 & 0x1FF);
        s10 = (short)(int)(l3 >> 34 & 0x1FF);
        b1 = (byte)(int)(l3 >> 44 & 1L);
        b2 = (byte)(int)(l3 >> 45 & 0x3);
        s11 = (short)(int)(l3 >> 47 & 0xFFF);
        b3 = paramDataInputStream.readByte();
        i11 = paramDataInputStream.readByte();
        b4 = paramDataInputStream.readByte();
        bool1 = (i11 & 0x1) > 0;
        bool2 = (i11 & 0x2) > 0;
        bool3 = (i11 & 0x4) > 0;
        b5 = paramDataInputStream.readByte();
        b6 = paramDataInputStream.readByte();
        str1 = null;
        if (i3 != 0) {
          str1 = paramDataInputStream.readUTF();
        }
        i12 = paramDataInputStream.readByte();
        arrayOfShort = new short[a.ad];
        int[] arrayOfInt = new int[a.ad];
        for (i14 = 0; i14 < arrayOfShort.length; i15 = (byte)(i14 + 1))
        {
          if ((i12 >> i14 & 0x1) > 0) {
            arrayOfShort[i14] = paramDataInputStream.readShort();
          } else {
            arrayOfShort[i14] = -1;
          }
          arrayOfInt[i14] = a3.a(arrayOfShort[i14], a.C);
        }
        int i15 = -1;
        i15 = paramDataInputStream.readInt();
        String str2 = null;
        if (i15 != -1) {
          str2 = paramDataInputStream.readUTF();
        }
        byte b8 = paramDataInputStream.readByte();
        b9 = paramDataInputStream.readByte();
        this.a.a(i15, str2, b8);
        byte b10 = paramDataInputStream.readByte();
        String str4 = null;
        if (b10 != -1) {
          str4 = paramDataInputStream.readUTF();
        }
        if (str1.equals(this.a.cZ.O)) {
          return;
        }
        if ((g.dD == 4) && (this.a.cZ.fL < 0)) {
          return;
        }
        if (g.dZ == 1)
        {
          if (!this.a.cZ.gE) {
            return;
          }
          i17 = 0;
          for (i18 = 0; i18 < this.jdField_else.g6.length; i18 = (byte)(i18 + 1)) {
            if (this.jdField_else.g6[i18].equals(str1))
            {
              i17 = 1;
              break;
            }
          }
          if (i17 == 0) {
            return;
          }
        }
        if ((g.dD == 3) && ((this.a.cZ.fL < 0) || (i15 != this.a.cZ.fL))) {
          return;
        }
        if (this.jdField_else.fu.get(new Integer(i8)) == null) {
          this.jdField_else.fu.put(new Integer(i8), str1);
        }
        if (this.jdField_else.kT >= 30) {
          return;
        }
        if ((str1.equals(this.jdField_else.hD)) && (this.jdField_else.bD == null) && (!h.jdMethod_case(s11)) && (h.M(s11)))
        {
          this.jdField_else.bD = new ag(this.a);
          this.jdField_else.bD.jdMethod_if(this.a.b0);
          this.jdField_else.bD.O = str1;
          this.jdField_else.hD = str1;
          this.jdField_else.bD.jdMethod_void(b1);
          this.jdField_else.bD.m(b2);
          this.jdField_else.bD.fa = bool2;
          this.jdField_else.bD.aP = s9;
          this.jdField_else.bD.aM = s10;
          this.jdField_else.bD.dT = s9;
          this.jdField_else.bD.dS = s10;
          this.jdField_else.bD.g((byte)0);
          this.jdField_else.bD.fp = 0;
          this.jdField_else.bD.T = false;
          this.jdField_else.bD.ao = false;
          this.jdField_else.bD.hU = false;
          this.jdField_else.bD.hv = bool3;
          this.a.a(this.jdField_else.bD, b4);
          this.jdField_else.bD.a4 = 0;
          this.jdField_else.bD.eN = b10;
          this.jdField_else.bD.eB = str4;
          this.jdField_else.bD.a7 = arrayOfShort;
          this.jdField_else.bD.H = arrayOfInt;
          this.jdField_else.bD.g4 = bool1;
          this.jdField_else.bD.jdMethod_if((byte)14, b3);
          this.jdField_else.bD.jdMethod_if((byte)16, s2);
          this.jdField_else.bD.jdMethod_if((byte)20, s3);
          this.jdField_else.bD.jdMethod_if((byte)28, s4);
          this.jdField_else.bD.jdMethod_if((byte)30, i6);
          this.jdField_else.bD.jdMethod_if((byte)32, s6);
          this.jdField_else.bD.jdMethod_if((byte)34, s7);
          this.jdField_else.bD.fL = i15;
          this.jdField_else.bD.fj = b9;
          this.jdField_else.bD.fx = b8;
          this.jdField_else.bD.eP = null;
          this.jdField_else.bD.hP = b5;
          this.jdField_else.bD.hO = b6;
          if (1 == h.h(s11)) {
            this.jdField_else.bD.jdMethod_if((byte)16, 0);
          }
          this.jdField_else.bD.X();
          this.jdField_else.bD.gQ = this.a.a(this.jdField_else.hD);
          this.jdField_else.bD.gk = true;
          this.jdField_else.bD.h4 = h.jdMethod_new(s11);
        }
        this.jdField_else.a(i8, b1, b2, str1, s9, s10, arrayOfShort, b3, s2, s3, s4, i6, s6, s7, s11, i15, b9, b10, str4, bool1, bool2, bool3, b4, b5, b6);
        break;
      case 3304: 
        i17 = paramDataInputStream.readInt();
        i2 = paramDataInputStream.readShort();
        if (i2 != this.jdField_else.jdField_if) {
          return;
        }
        int i19;
        for (i18 = 0; i18 < this.jdField_else.kT; i19 = (byte)(i18 + 1)) {
          if (i17 == this.jdField_else.co[i18])
          {
            if (this.jdField_else.iy[i18].equals(this.jdField_else.hD)) {
              this.jdField_else.bD = null;
            }
            this.jdField_else.jdMethod_if(i18);
            this.jdField_else.fu.remove(new Integer(i17));
            return;
          }
        }
      }
    }
    catch (Exception localException) {}
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ah.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */