import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class k
{
  h jdField_else = null;
  g k = null;
  Image o = null;
  byte v;
  boolean n;
  String p = null;
  short m;
  String r = null;
  String jdField_byte = null;
  String l = null;
  String j = null;
  String i = null;
  int jdField_if;
  short e;
  short c;
  short b;
  short jdField_void;
  short jdField_null;
  short jdField_long;
  short jdField_goto;
  byte u;
  byte jdField_do;
  int t;
  int d;
  byte jdField_try;
  byte a;
  byte f;
  String jdField_case;
  int jdField_int;
  String h;
  int jdField_char;
  int jdField_for;
  int q;
  int jdField_new;
  int g;
  int s;
  
  public k(h paramh, DataInputStream paramDataInputStream)
  {
    this.jdField_else = paramh;
    this.k = paramh.cJ;
    try
    {
      this.p = paramDataInputStream.readUTF();
      switch (this.v = paramDataInputStream.readByte())
      {
      case 0: 
        this.r = "战士";
        break;
      case 1: 
        this.r = "法师";
        break;
      case 2: 
        this.r = "盗贼";
        break;
      case 3: 
        this.r = "枪手";
      }
      this.m = ((short)paramDataInputStream.readByte());
      this.n = (paramDataInputStream.readByte() > 0);
      this.t = paramDataInputStream.readInt();
      this.jdField_try = paramDataInputStream.readByte();
      this.d = paramDataInputStream.readInt();
      this.a = paramDataInputStream.readByte();
      this.jdField_do = paramDataInputStream.readByte();
      this.jdField_byte = paramDataInputStream.readUTF();
      this.l = paramDataInputStream.readUTF();
      this.j = paramDataInputStream.readUTF();
      this.i = paramDataInputStream.readUTF();
      int i1 = paramDataInputStream.readInt();
      this.jdField_if = i1;
      this.u = paramDataInputStream.readByte();
      this.jdField_for = paramDataInputStream.readShort();
      this.q = paramDataInputStream.readShort();
      this.jdField_new = paramDataInputStream.readShort();
      this.g = paramDataInputStream.readShort();
      this.s = paramDataInputStream.readShort();
      this.h = paramDataInputStream.readUTF();
      this.jdField_char = paramDataInputStream.readInt();
      this.f = paramDataInputStream.readByte();
      this.jdField_case = paramDataInputStream.readUTF();
      this.jdField_int = paramDataInputStream.readInt();
      this.e = paramDataInputStream.readShort();
      this.c = paramDataInputStream.readShort();
      this.b = paramDataInputStream.readShort();
      this.jdField_void = paramDataInputStream.readShort();
      this.jdField_null = paramDataInputStream.readShort();
      this.jdField_long = paramDataInputStream.readShort();
      this.jdField_goto = paramDataInputStream.readShort();
      int i2 = paramDataInputStream.readShort();
      if (i2 > 0)
      {
        byte[] arrayOfByte = new byte[i2];
        paramDataInputStream.readFully(arrayOfByte, 0, arrayOfByte.length);
        this.o = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
      }
      else
      {
        this.o = null;
        this.k.lB = new int[5];
        this.jdField_else.b0.a(21 + (this.u == 1 ? 27 : 0), 0, this.k.lB);
      }
      this.k.jdField_do = 109;
    }
    catch (Exception localException)
    {
      this.k.a("查看玩家资料失败.", (short)0, false, 9999);
    }
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
    case 6: 
      if (this.o == null) {
        return;
      }
      if (this.k.dt == null)
      {
        if (this.jdField_else.aG.jdMethod_int(2506))
        {
          this.jdField_else.aG.jdMethod_if(this.p);
          this.jdField_else.aG.jdMethod_if();
        }
        this.k.jdField_do = 21;
      }
      else
      {
        this.k.jdField_do = 107;
      }
      this.k.jr = 109;
      break;
    case 7: 
      this.k.dt = null;
      this.o = null;
      this.p = null;
      this.l = null;
      this.j = null;
      this.i = null;
      this.r = null;
      this.jdField_byte = null;
      this.k.lB = null;
      this.k.jdField_do = ((short)this.jdField_else.i.n);
      this.k.c7 = null;
    }
  }
  
  public void a()
  {
    this.jdField_else.cJ.E();
    this.jdField_else.a((byte)2, 0, 0, 128, 230, true);
    if (this.o != null)
    {
      this.jdField_else.fj.drawImage(this.o, 3, 3, 0);
    }
    else
    {
      i1 = 20;
      i2 = 10;
      this.jdField_else.b0.a(i1, i2, this.jdField_else.o, this.k.lB, 0, this.n, this.v);
      this.jdField_else.b0.a(this.k.lB);
      this.jdField_else.a(i1, i2, this.u, this.v, this.e, this.c, this.b, this.jdField_void, this.jdField_null, this.jdField_long, this.jdField_goto, this.k.jdField_int);
    }
    this.jdField_else.fj.setColor(h.b2[2][1]);
    this.jdField_else.fj.drawString(this.p, 47, 3, 0);
    if (this.t >= 0) {
      this.jdField_else.fj.setColor(m.a[this.jdField_do]);
    }
    this.jdField_else.fj.drawString(this.jdField_byte, 47, 22, 0);
    if (this.o != null) {
      this.jdField_else.a(46 + (this.k.jdField_int / 3 % 2 == 0 ? -1 : 1), 20, this.jdField_else.aH[6].getWidth(), this.jdField_else.aH[6].getHeight(), 0, 0, this.jdField_else.aH[6], 2);
    }
    this.jdField_else.fj.setColor(h.b2[2][1]);
    this.jdField_else.a(47, 40, 12, 12, 12, 0, this.jdField_else.aH[10], 0);
    this.jdField_else.a(61, 44, this.jdField_if, 20);
    this.jdField_else.fj.drawString("等级 ", 5, 58 - h.eA, 0);
    this.jdField_else.a(30, 58 - h.eA + 6, this.m, 20);
    int i1 = 56;
    int i2 = h.eA - 2;
    if (this.t >= 0)
    {
      this.jdField_else.fj.drawString("职位 " + ag.jdMethod_try(this.jdField_try, this.a), 5, i1, 0);
      i1 += i2;
    }
    this.jdField_else.fj.drawString("武器 " + this.l, 5, i1, 0);
    this.jdField_else.fj.drawString("盾牌 " + this.j, 5, i1 + i2, 0);
    this.jdField_else.fj.drawString("护甲 " + this.i, 5, i1 + i2 * 2, 0);
    this.jdField_else.fj.drawString("耐力 " + this.jdField_for + "%", 5, i1 + i2 * 3, 0);
    this.jdField_else.fj.drawString("意志 " + this.q + "%", 5, i1 + i2 * 4, 0);
    this.jdField_else.fj.drawString("运气 " + this.jdField_new + "%", 5, i1 + i2 * 5, 0);
    this.jdField_else.fj.drawString("魅力 " + this.g + "%", 5, i1 + i2 * 6, 0);
    this.jdField_else.fj.drawString("情侣 " + this.h, 5, i1 + i2 * 7, 0);
    this.jdField_else.fj.drawString("亲密 " + this.jdField_char, 5, i1 + i2 * 8, 0);
    this.jdField_else.fj.drawString("职业熟练 " + this.s, 5, i1 + i2 * 9, 0);
    if (this.f != 0) {
      if (this.f > 0)
      {
        this.jdField_else.fj.drawString("徒弟 " + this.jdField_case, 5, i1 + i2 * 10, 0);
        this.jdField_else.fj.drawString("师德 " + this.jdField_int, 5, i1 + i2 * 11, 0);
      }
      else
      {
        this.jdField_else.fj.drawString("师父 " + this.jdField_case, 5, i1 + i2 * 10, 0);
      }
    }
    this.jdField_else.c();
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */