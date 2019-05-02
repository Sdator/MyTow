import javax.microedition.lcdui.Graphics;

public class aj
{
  h a = null;
  g jdField_if = null;
  String[] jdField_for = null;
  byte jdField_do;
  byte jdField_int;
  
  public aj(h paramh, byte paramByte1, byte paramByte2)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
    this.jdField_int = paramByte2;
    String str = "技能名称:" + this.jdField_if.hl[(this.jdField_if.gi + this.jdField_if.hZ)] + "\001";
    String[] arrayOfString = null;
    if (ag.l(paramByte1))
    {
      str = str + "技能类型:职业技能\001";
    }
    else if (ag.jdMethod_null(paramByte1))
    {
      str = str + "技能类型:生活技能\001";
    }
    else if (h.k(paramByte1))
    {
      arrayOfString = new String[] { "常规", "蓄力", "空间", "连击" };
      str = str + "技能类型:" + arrayOfString[h.u(paramByte1)] + "\001";
    }
    else
    {
      arrayOfString = new String[] { "回复", "复活" };
      str = str + "技能类型:" + arrayOfString[h.jdMethod_case(paramByte1)] + "\001";
    }
    if ((paramByte1 == ag.d8) || (paramByte1 == ag.eV)) {
      str = str + "消耗魔力:当前魔力一半\001";
    } else if (paramByte1 == ag.hI) {
      str = str + "消耗魔力:1\001";
    } else if ((paramByte1 == ag.ey) || (paramByte1 == ag.dt) || (paramByte1 == ag.hX) || (paramByte1 == ag.ig) || (paramByte1 == ag.dV) || (ag.l(paramByte1))) {
      str = str + "消耗魔力:最大魔力一半\001";
    } else {
      str = str + "消耗魔力:" + h.jdMethod_null(paramByte1) + "\001";
    }
    str = str + "作用对象:" + (h.k(paramByte1) ? "敌" : "我") + "\001";
    str = str + "作用范围:" + ((h.u(paramByte1) != 3) && (h.n(paramByte1) == 0) ? "群体" : "单体") + "\001";
    if (paramByte2 != -71) {
      if ((this.jdField_if.gS == 0) || (this.jdField_if.gS == a.t))
      {
        str = str + "已习得\001";
      }
      else if ((!ag.jdMethod_null(paramByte1)) && (!ag.l(paramByte1)))
      {
        str = str + "需要勋章:" + h.j(paramByte1) + "\001";
        str = str + "需要能力:" + h.jdMethod_void(paramByte1) + "\001";
        str = str + "遗忘等级:" + (a.n * (h.s(paramByte1) + a.char) + a.char) + "\001";
      }
    }
    if (ag.jdMethod_null(paramByte1)) {
      str = str + "描述:" + ag.fr[(paramByte1 - a.C)];
    }
    if (ag.l(paramByte1)) {
      str = str + "技能等级:" + this.a.cZ.jdMethod_int(this.a.cZ.bo, paramByte1);
    }
    this.jdField_for = this.a.jdMethod_do(str, h.dU - a.n);
    this.jdField_do = ((byte)a.ac);
  }
  
  public void a()
  {
    this.jdField_if.E();
    this.a.a((byte)2, 0, 0, h.dU, h.fp, true);
    int i = (byte)this.jdField_for.length;
    int j = (byte)((h.fp - 2 * h.eA) / (h.eA + 1));
    int k = (short)(i / j);
    if (k * j < i) {
      k = (short)(k + 1);
    }
    if (this.jdField_do >= k) {
      this.jdField_do = ((byte)(k - 1));
    }
    this.a.fj.setColor(h.b2[2][1]);
    int m = 5;
    int n = 30;
    for (int i1 = 0; (i1 < j) && (this.jdField_do * j + i1 <= this.jdField_for.length - 1); i1 = (byte)(i1 + 1)) {
      this.a.fj.drawString(this.jdField_for[(this.jdField_do * j + i1)], m, n + i1 * (h.eA + 1), 20);
    }
    if (this.jdField_do > 0) {
      this.a.a(h.dU - 10 - 10, 30 + (this.jdField_if.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
    }
    if (this.jdField_do < k - 1) {
      this.a.a(h.dU - 10 - 10, h.fp - 20 + (this.jdField_if.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
    }
    this.a.c();
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      this.jdField_do = ((byte)(this.jdField_do - 1));
      if (this.jdField_do < 0) {
        this.jdField_do = 0;
      }
      break;
    case 2: 
      this.jdField_do = ((byte)(this.jdField_do + 1));
      break;
    case 7: 
      this.jdField_for = null;
      this.jdField_if.jdField_do = ((short)this.jdField_int);
      this.a.ex = null;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\aj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */