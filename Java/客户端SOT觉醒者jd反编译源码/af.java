import java.io.DataInputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;

public class af
{
  byte x;
  byte[] jdField_case = null;
  byte h;
  String r;
  byte u;
  String w = null;
  byte g;
  int s;
  int jdField_new;
  String jdField_int;
  short t;
  int jdField_byte;
  String j;
  short n;
  int q;
  byte jdField_char;
  byte jdField_do;
  int v;
  byte c;
  byte jdField_null;
  byte f;
  byte d;
  int a;
  byte jdField_for;
  byte i;
  byte e;
  short b;
  short p;
  short m;
  short jdField_goto;
  short l;
  short jdField_else;
  String jdField_try = null;
  String o = null;
  String jdField_if = null;
  String[] jdField_long;
  h jdField_void = null;
  g k = null;
  
  public af(h paramh)
  {
    this.jdField_void = paramh;
    this.k = paramh.cJ;
  }
  
  public void jdMethod_do()
  {
    this.w = null;
    this.g = 0;
    this.jdField_char = 0;
    this.jdField_do = 0;
    this.v = a3.jdMethod_new(1, 4);
    this.jdField_null = 5;
    this.f = 0;
    this.d = 0;
    this.a = a3.jdMethod_new(1, 4);
    this.c = 0;
    this.jdField_for = -1;
    this.i = -1;
    this.e = 1;
    this.b = 0;
    this.p = 0;
    this.m = 0;
    this.jdField_goto = 0;
    this.l = 0;
    this.jdField_else = 0;
    this.s = a3.jdMethod_new(0, 4);
    this.jdField_new = a3.jdMethod_new(0, 4);
    this.jdField_int = null;
    this.t = -1;
    this.jdField_byte = a3.jdMethod_new(0, 4);
    this.j = null;
    this.n = -1;
    this.q = a3.jdMethod_new(0, 4);
    this.jdField_try = null;
    this.o = null;
    this.jdField_if = null;
    this.jdField_long = null;
  }
  
  public void jdMethod_new()
  {
    switch (this.k.jdField_do)
    {
    case -100: 
      jdMethod_int();
      this.k.a("确定发布该悬赏任务?", "确定", "取消");
      break;
    case -99: 
      jdMethod_int();
      break;
    case -98: 
      this.k.E();
      this.jdField_void.s();
      this.jdField_void.d9.a();
      break;
    case -97: 
      this.k.E();
      this.jdField_void.s();
      if (this.k.dx > 0) {
        this.jdField_void.x();
      }
      this.jdField_void.c();
      break;
    case -96: 
      this.k.E();
      this.jdField_void.d9.a();
      this.jdField_void.x();
      this.jdField_void.c();
      break;
    case -95: 
      this.k.E();
      this.jdField_void.a(this.r, -1, (byte)4, false);
      this.jdField_void.a((h.dU - 50) / 2, (h.fp - 70) / 2, this.k.gd, this.k.c9);
      this.jdField_void.x();
      this.jdField_void.c();
    }
  }
  
  public void a(int paramInt)
  {
    this.k.jdField_do = -95;
    this.k.gd = 0;
    this.h = ((byte)paramInt);
    this.k.c9 = null;
    int i1;
    switch (paramInt)
    {
    case 1: 
      jdMethod_do();
      jdMethod_try();
      break;
    case 2: 
      this.r = "请选择悬赏任务类型:";
      this.k.c9 = new String[] { "收集", "暗杀", "传言" };
      break;
    case 3: 
      this.r = "请选择收集类别:";
      this.k.c9 = new String[] { "药水", "装备", "矿石", "素材", "宠物" };
      break;
    case 4: 
      this.r = "请选择药水种类:";
      this.k.c9 = new String[] { "生命试剂", "魔力试剂", "清醒试剂", "复活试剂" };
      break;
    case 5: 
      this.r = "请选择生命试剂类型:";
      this.k.c9 = new String[] { "超生命试剂", "大生命试剂", "中生命试剂", "小生命试剂" };
      break;
    case 6: 
      this.r = "请选择魔力试剂类型:";
      this.k.c9 = new String[] { "超魔力试剂", "大魔力试剂", "中魔力试剂", "小魔力试剂" };
      break;
    case 7: 
      this.jdField_void.d9 = new w(this.jdField_void, "数量", 1, 99, a3.jdMethod_do(this.v, 4));
      this.k.jdField_do = -96;
      break;
    case 8: 
      this.jdField_void.d9 = new w(this.jdField_void, "等级", 5, 50, this.jdField_null);
      this.k.jdField_do = -96;
      break;
    case 60: 
      switch (this.u)
      {
      case 12: 
        this.r = "请选择装备类型:";
        this.k.c9 = new String[] { "武器", "其他装备" };
        break;
      case 13: 
        this.k.c9 = new String[] { "铂", "镭", "钛", "铀" };
        break;
      case 14: 
        this.k.c9 = new String[] { "皮", "肉", "骨", "爪" };
      }
      break;
    case 61: 
      this.r = "请选择武器类型:";
      this.k.c9 = new String[] { "剑", "杖", "匕", "枪" };
      break;
    case 62: 
      this.r = "请选择其他装备类型:";
      this.k.c9 = new String[] { "铠甲", "盾牌", "眼镜", "项链", "腰带", "靴子" };
      break;
    case 9: 
      this.r = "请选择稀有度:";
      switch (this.u)
      {
      case 12: 
        this.k.c9 = new String[] { "普通", "高级", "稀有", "极品" };
        break;
      case 13: 
        this.r = "请选择矿石类型:";
        this.k.c9 = new String[] { "碎片", "小块", "大块", "晶核" };
        break;
      case 14: 
        this.r = "请选择素材类型:";
        this.k.c9 = new String[] { "下等", "中等", "高等", "上等" };
      }
      break;
    case 10: 
      this.r = "请选择装备空数:";
      this.k.c9 = new String[] { "无孔", "2孔", "4孔" };
      break;
    case 11: 
      this.jdField_void.d9 = new w(this.jdField_void, "数量", 1, 99, a3.jdMethod_do(this.a, 4));
      this.k.jdField_do = -96;
      break;
    case 12: 
      this.r = "请选择宠物天性:";
      this.k.c9 = new String[] { "忽略", "攻击", "防御", "回复" };
      break;
    case 13: 
      this.r = "请选择宠物类型:";
      this.k.c9 = new String[] { "忽略", "物理", "魔法", "双性" };
      break;
    case 14: 
      this.jdField_void.d9 = new w(this.jdField_void, "等级>", 1, 99, this.e);
      this.k.jdField_do = -96;
      break;
    case 15: 
      this.jdField_void.d9 = new w(this.jdField_void, "活力>", 0, 9999, this.b);
      this.k.jdField_do = -96;
      break;
    case 16: 
      this.jdField_void.d9 = new w(this.jdField_void, "魔法>", 0, 9999, this.p);
      this.k.jdField_do = -96;
      break;
    case 17: 
      this.jdField_void.d9 = new w(this.jdField_void, "物攻>", 0, 9999, this.m);
      this.k.jdField_do = -96;
      break;
    case 18: 
      this.jdField_void.d9 = new w(this.jdField_void, "物防>", 0, 9999, this.jdField_goto);
      this.k.jdField_do = -96;
      break;
    case 19: 
      this.jdField_void.d9 = new w(this.jdField_void, "魔攻>", 0, 9999, this.l);
      this.k.jdField_do = -96;
      break;
    case 20: 
      this.jdField_void.d9 = new w(this.jdField_void, "魔防>", 0, 9999, this.jdField_else);
      this.k.jdField_do = -96;
      break;
    case 21: 
      this.r = "请选择要暗杀的玩家昵称,若选择手工输入,则需要与目标角色昵称完全匹配.";
      this.k.c9 = new String[] { "好友列表", "屏蔽列表", "手工输入" };
      break;
    case 22: 
      this.r = "请选择要传言的玩家昵称,若选择手工输入,则需要与目标角色昵称完全匹配.";
      this.k.c9 = new String[] { "好友列表", "屏蔽列表", "手工输入" };
      break;
    case 23: 
      jdMethod_byte();
      break;
    case 50: 
      this.r = "请设置任务奖励:";
      this.k.c9 = new String[] { "金钱", "经验", "普通道具", "特殊道具", "下一步" };
      break;
    case 51: 
      i1 = 99999999;
      if (i1 > this.jdField_void.cZ.a((byte)0)) {
        i1 = this.jdField_void.cZ.a((byte)0);
      }
      this.jdField_void.d9 = new w(this.jdField_void, "金额", 0, i1, a3.jdMethod_do(this.s, 4));
      this.k.jdField_do = -96;
      break;
    case 52: 
      i1 = 100000;
      if (i1 > this.jdField_void.cZ.a((byte)4)) {
        i1 = this.jdField_void.cZ.a((byte)4);
      }
      this.jdField_void.d9 = new w(this.jdField_void, "经验", 0, i1, a3.jdMethod_do(this.jdField_new, 4));
      this.k.jdField_do = -96;
      break;
    case 53: 
      a((byte)0);
      break;
    case 54: 
      a((byte)1);
      break;
    case 55: 
      this.r = "请选择委托人显示方式:";
      this.k.c9 = new String[] { "显示", "隐藏" };
      break;
    case 56: 
      String str1 = "";
      String str2 = null;
      String str3 = null;
      String str4 = "";
      switch (this.u)
      {
      case 11: 
        str2 = "收集药水";
        if (this.jdField_char == 2) {
          str3 = "收集清醒试剂";
        } else if (this.jdField_char == 3) {
          str3 = "收集复活试剂";
        } else if (this.jdField_char == 0) {
          switch (this.jdField_do)
          {
          case 0: 
            str3 = "收集超生命试剂";
            break;
          case 1: 
            str3 = "收集大生命试剂";
            break;
          case 2: 
            str3 = "收集中生命试剂";
            break;
          case 3: 
            str3 = "收集小生命试剂";
          }
        } else if (this.jdField_char == 1) {
          switch (this.jdField_do)
          {
          case 0: 
            str3 = "收集超魔力试剂";
            break;
          case 1: 
            str3 = "收集大魔力试剂";
            break;
          case 2: 
            str3 = "收集中魔力试剂";
            break;
          case 3: 
            str3 = "收集小魔力试剂";
          }
        }
        str3 = str3 + a3.jdMethod_do(this.v, 4) + "个";
        break;
      case 12: 
        str2 = "收集装备";
        str3 = "收集" + this.jdField_null + "级";
        str3 = str3 + this.d * 2 + "孔";
        switch (this.f)
        {
        case 0: 
          str3 = str3 + "普通";
          break;
        case 1: 
          str3 = str3 + "高级";
          break;
        case 2: 
          str3 = str3 + "稀有";
          break;
        case 3: 
          str3 = str3 + "极品";
        }
        switch (this.c)
        {
        case 0: 
          str3 = str3 + "剑";
          break;
        case 1: 
          str3 = str3 + "杖";
          break;
        case 2: 
          str3 = str3 + "匕";
          break;
        case 3: 
          str3 = str3 + "枪";
          break;
        case 4: 
          str3 = str3 + "铠甲";
          break;
        case 5: 
          str3 = str3 + "盾牌";
          break;
        case 6: 
          str3 = str3 + "眼镜";
          break;
        case 7: 
          str3 = str3 + "项链";
          break;
        case 8: 
          str3 = str3 + "腰带";
          break;
        case 9: 
          str3 = str3 + "靴子";
        }
        str3 = str3 + a3.jdMethod_do(this.a, 4) + "个";
        break;
      case 13: 
        str2 = "收集矿石";
        str3 = "收集" + this.jdField_null + "级";
        switch (this.c)
        {
        case 0: 
          str3 = str3 + "铂";
          break;
        case 1: 
          str3 = str3 + "镭";
          break;
        case 2: 
          str3 = str3 + "钛";
          break;
        case 3: 
          str3 = str3 + "铀";
        }
        switch (this.f)
        {
        case 0: 
          str3 = str3 + "晶碎片";
          break;
        case 1: 
          str3 = str3 + "晶小块";
          break;
        case 2: 
          str3 = str3 + "晶大块";
          break;
        case 3: 
          str3 = str3 + "晶核";
        }
        str3 = str3 + a3.jdMethod_do(this.a, 4) + "个";
        break;
      case 14: 
        str2 = "收集素材";
        str3 = "收集" + this.jdField_null + "级";
        switch (this.f)
        {
        case 0: 
          str3 = str3 + "下等";
          break;
        case 1: 
          str3 = str3 + "中等";
          break;
        case 2: 
          str3 = str3 + "高等";
          break;
        case 3: 
          str3 = str3 + "上等";
        }
        switch (this.c)
        {
        case 0: 
          str3 = str3 + "皮";
          break;
        case 1: 
          str3 = str3 + "肉";
          break;
        case 2: 
          str3 = str3 + "骨";
          break;
        case 3: 
          str3 = str3 + "爪";
        }
        str3 = str3 + a3.jdMethod_do(this.v, 4) + "个";
        break;
      case 15: 
        str2 = "收集宠物";
        str3 = "收集宠物.";
        str3 = str3 + "等级 " + this.e + ";";
        if (this.jdField_for >= 0) {
          str3 = str3 + "天性 " + a3.n[this.jdField_for] + ";";
        }
        if (this.i >= 0) {
          str3 = str3 + "类型 " + a3.ad[this.i] + ";";
        }
        if (this.b > 0) {
          str3 = str3 + "活力 " + this.b + ";";
        }
        if (this.p > 0) {
          str3 = str3 + "魔力 " + this.p + ";";
        }
        if (this.m > 0) {
          str3 = str3 + "物攻 " + this.m + ";";
        }
        if (this.jdField_goto > 0) {
          str3 = str3 + "物防 " + this.jdField_goto + ";";
        }
        if (this.l > 0) {
          str3 = str3 + "魔攻 " + this.l + ";";
        }
        if (this.jdField_else > 0) {
          str3 = str3 + "魔防 " + this.jdField_else + ";";
        }
        str3 = str3.substring(0, str3.length() - 1);
        break;
      case 16: 
        str2 = "暗杀";
        str3 = "暗杀" + this.jdField_try + ".";
        break;
      case 17: 
        str2 = "传言";
        str3 = "给" + this.o + "传言:" + this.jdField_if + ".";
      }
      if (a3.jdMethod_do(this.s, 4) > 0) {
        str4 = str4 + "金钱 " + a3.jdMethod_do(this.s, 4) + "\001";
      }
      if (a3.jdMethod_do(this.jdField_new, 4) > 0) {
        str4 = str4 + "经验 " + a3.jdMethod_do(this.jdField_new, 4) + "\001";
      }
      if (this.t >= 0) {
        str4 = str4 + this.jdField_int + a3.jdMethod_do(this.jdField_byte, 4) + "个\001";
      }
      if (this.n >= 0) {
        str4 = str4 + this.j + a3.jdMethod_do(this.q, 4) + "个\001";
      }
      str1 = str1 + "标题:" + this.w + "\001";
      str1 = str1 + "委托人:" + (this.g == 0 ? "显示" : "隐藏") + "\001";
      str1 = str1 + "类型:" + str2 + "\001";
      str1 = str1 + "奖励:\001" + str4;
      str1 = str1 + "内容:\001" + str3;
      this.jdField_long = this.jdField_void.jdMethod_do(str1, (h.a9 == 0 ? '' : '°') - 10);
      this.x = 0;
      this.k.jdField_do = -99;
    }
  }
  
  public void a()
  {
    switch (this.h)
    {
    case 1: 
      a(2);
      break;
    case 2: 
      if (this.k.gd == 0)
      {
        a(3);
      }
      else
      {
        this.u = ((byte)(15 + this.k.gd));
        switch (this.u)
        {
        case 11: 
          a(4);
          break;
        case 12: 
        case 13: 
        case 14: 
          a(60);
          break;
        case 15: 
          a(12);
          break;
        case 16: 
          a(21);
          break;
        case 17: 
          a(22);
        }
      }
      break;
    case 3: 
      this.u = ((byte)(11 + this.k.gd));
      switch (this.u)
      {
      case 11: 
        a(4);
        break;
      case 12: 
      case 13: 
      case 14: 
        a(60);
        break;
      case 15: 
        a(12);
        break;
      case 16: 
        a(21);
        break;
      case 17: 
        a(22);
      }
      break;
    case 4: 
      this.jdField_char = this.k.gd;
      switch (this.k.gd)
      {
      case 0: 
        a(5);
        break;
      case 1: 
        a(6);
        break;
      case 2: 
      case 3: 
        a(7);
      }
      break;
    case 5: 
    case 6: 
      this.jdField_do = this.k.gd;
      a(7);
      break;
    case 7: 
      this.v = this.k.mn;
      a(50);
      break;
    case 8: 
      this.jdField_null = ((byte)a3.jdMethod_do(this.k.mn, 4));
      this.jdField_null = ((byte)(this.jdField_null / 5 * 5));
      a(9);
      break;
    case 60: 
      if (12 == this.u)
      {
        if (this.k.gd == 0) {
          a(61);
        } else {
          a(62);
        }
      }
      else
      {
        this.c = this.k.gd;
        a(8);
      }
      break;
    case 61: 
      this.c = this.k.gd;
      a(8);
      break;
    case 62: 
      this.c = ((byte)(4 + this.k.gd));
      a(8);
      break;
    case 9: 
      this.f = this.k.gd;
      if (this.u == 12) {
        a(10);
      } else {
        a(11);
      }
      break;
    case 10: 
      this.d = this.k.gd;
      a(11);
      break;
    case 11: 
      this.a = this.k.mn;
      a(50);
      break;
    case 12: 
      this.jdField_for = ((byte)(this.k.gd - 1));
      a(13);
      break;
    case 13: 
      this.i = ((byte)(this.k.gd - 1));
      a(14);
      break;
    case 14: 
      this.e = ((byte)a3.jdMethod_do(this.k.mn, 4));
      a(15);
      break;
    case 15: 
      this.b = ((short)a3.jdMethod_do(this.k.mn, 4));
      a(16);
      break;
    case 16: 
      this.p = ((short)a3.jdMethod_do(this.k.mn, 4));
      a(17);
      break;
    case 17: 
      this.m = ((short)a3.jdMethod_do(this.k.mn, 4));
      a(18);
      break;
    case 18: 
      this.jdField_goto = ((short)a3.jdMethod_do(this.k.mn, 4));
      a(19);
      break;
    case 19: 
      this.l = ((short)a3.jdMethod_do(this.k.mn, 4));
      a(20);
      break;
    case 20: 
      this.jdField_else = ((short)a3.jdMethod_do(this.k.mn, 4));
      a(50);
      break;
    case 21: 
    case 22: 
      switch (this.k.gd)
      {
      case 0: 
        this.k.jdMethod_do(this.k.jdField_do, true);
        break;
      case 1: 
        this.k.jdMethod_if(this.k.jdField_do, true);
        break;
      case 2: 
        jdMethod_for();
      }
      break;
    case 23: 
      a(50);
      break;
    case 50: 
      switch (this.k.gd)
      {
      case 0: 
        a(51);
        break;
      case 1: 
        if (this.jdField_case[0] == 1)
        {
          this.k.a("暂不能用经验作为任务奖励.", (short)-95, false, 9999);
          return;
        }
        a(52);
        break;
      case 2: 
        a(53);
        break;
      case 3: 
        if (this.jdField_case[1] == 1)
        {
          this.k.a("暂不能用特殊道具作为任务奖励.", (short)-95, false, 9999);
          return;
        }
        a(54);
        break;
      case 4: 
        if ((a3.jdMethod_do(this.s, 4) <= 0) && (a3.jdMethod_do(this.jdField_new, 4) <= 0) && (this.t < 0) && (this.n < 0))
        {
          this.k.a("请先设置任务奖励,才能进行下一步.", (short)-95, false, 9999);
          return;
        }
        a(55);
      }
      break;
    case 51: 
      this.s = this.k.mn;
      a(50);
      break;
    case 52: 
      this.jdField_new = this.k.mn;
      a(50);
      break;
    case 53: 
    case 54: 
      a(50);
      break;
    case 55: 
      this.g = this.k.gd;
      a(56);
      break;
    case 56: 
      this.k.e3 = 0;
      this.k.jdField_do = -100;
    }
  }
  
  public void jdMethod_if()
  {
    switch (this.h)
    {
    case 1: 
      this.k.c9 = null;
      this.k.jdField_do = 0;
      this.k.ea = null;
      break;
    case 2: 
      a(1);
      break;
    case 3: 
      a(2);
      break;
    case 4: 
      a(3);
      break;
    case 5: 
    case 6: 
      a(4);
      break;
    case 7: 
      if ((this.jdField_char == 0) || (this.jdField_char == 1)) {
        a(5 + this.jdField_char);
      } else {
        a(4);
      }
      break;
    case 8: 
      a(60);
      break;
    case 60: 
      a(3);
      break;
    case 61: 
    case 62: 
      a(60);
      break;
    case 9: 
      a(8);
      break;
    case 10: 
      a(9);
      break;
    case 11: 
      if (this.u == 12) {
        a(10);
      } else {
        a(9);
      }
      break;
    case 12: 
      a(3);
      break;
    case 13: 
      a(12);
      break;
    case 14: 
      a(13);
      break;
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
      a(this.h - 1);
      break;
    case 21: 
    case 22: 
      a(2);
      break;
    case 23: 
      a(22);
      break;
    case 50: 
      switch (this.u)
      {
      case 11: 
        if ((this.jdField_char == 0) || (this.jdField_char == 1)) {
          a(5 + this.jdField_char);
        } else {
          a(4);
        }
        break;
      case 12: 
      case 13: 
      case 14: 
        a(11);
        break;
      case 15: 
        a(20);
        break;
      case 16: 
        a(21);
        break;
      case 17: 
        a(23);
      }
      break;
    case 51: 
    case 52: 
    case 53: 
    case 54: 
      a(50);
      break;
    case 55: 
      a(50);
      break;
    case 56: 
      a(55);
    }
  }
  
  public void jdMethod_if(int paramInt)
  {
    int i1;
    switch (this.k.jdField_do)
    {
    case -100: 
      switch (paramInt)
      {
      case 1: 
        this.k.e3 = 0;
        break;
      case 2: 
        this.k.e3 = 1;
        break;
      case 5: 
      case 6: 
        if (this.k.e3 == 0)
        {
          this.jdField_long = null;
          if (this.jdField_void.aG.jdMethod_int(5849))
          {
            this.jdField_void.aG.jdMethod_new(this.jdField_void.jdMethod_if((byte)126));
            this.jdField_void.aG.jdMethod_do(this.u);
            this.jdField_void.aG.jdMethod_if(this.w);
            this.jdField_void.aG.jdMethod_do(this.g);
            this.jdField_void.aG.jdMethod_for(this.s);
            this.jdField_void.aG.jdMethod_for(this.jdField_new);
            this.jdField_void.aG.jdMethod_new(this.t);
            this.jdField_void.aG.jdMethod_for(this.jdField_byte);
            this.jdField_void.aG.jdMethod_new(this.n);
            this.jdField_void.aG.jdMethod_for(this.q);
            switch (this.u)
            {
            case 11: 
              this.jdField_void.aG.jdMethod_do(this.jdField_char);
              this.jdField_void.aG.jdMethod_do(this.jdField_do);
              this.jdField_void.aG.jdMethod_for(this.v);
              break;
            case 12: 
              this.jdField_void.aG.jdMethod_do(this.jdField_null);
              this.jdField_void.aG.jdMethod_do(this.f);
              this.jdField_void.aG.jdMethod_for(this.a);
              this.jdField_void.aG.jdMethod_do(this.d);
              this.jdField_void.aG.jdMethod_do(this.c);
              break;
            case 13: 
            case 14: 
              this.jdField_void.aG.jdMethod_do(this.jdField_null);
              this.jdField_void.aG.jdMethod_do(this.f);
              this.jdField_void.aG.jdMethod_for(this.a);
              this.jdField_void.aG.jdMethod_do(this.c);
              break;
            case 15: 
              this.jdField_void.aG.jdMethod_do(this.jdField_for);
              this.jdField_void.aG.jdMethod_do(this.i);
              this.jdField_void.aG.jdMethod_do(this.e);
              this.jdField_void.aG.jdMethod_new(this.b);
              this.jdField_void.aG.jdMethod_new(this.p);
              this.jdField_void.aG.jdMethod_new(this.m);
              this.jdField_void.aG.jdMethod_new(this.jdField_goto);
              this.jdField_void.aG.jdMethod_new(this.l);
              this.jdField_void.aG.jdMethod_new(this.jdField_else);
              break;
            case 16: 
              this.jdField_void.aG.jdMethod_if(this.jdField_try);
              break;
            case 17: 
              this.jdField_void.aG.jdMethod_if(this.o);
              this.jdField_void.aG.jdMethod_if(this.jdField_if);
            }
            this.jdField_void.aG.jdMethod_if();
          }
          this.k.jdField_do = 21;
        }
        else
        {
          this.x = 0;
          this.k.jdField_do = -99;
        }
        break;
      }
      break;
    case -99: 
      switch (paramInt)
      {
      case 1: 
        this.x = ((byte)(this.x - 1));
        if (this.x < 0) {
          this.x = 0;
        }
        break;
      case 2: 
        this.x = ((byte)(this.x + 1));
        break;
      case 5: 
      case 6: 
        a();
        break;
      case 7: 
        this.jdField_long = null;
        jdMethod_if();
      }
      break;
    case -97: 
      switch (paramInt)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        this.jdField_void.i.jdMethod_do(paramInt);
        break;
      case 5: 
      case 6: 
        i1 = (byte)(this.k.lY + this.k.lX * 6);
        if (i1 > this.k.bs[0] - 1) {
          return;
        }
        if (this.jdField_void.jdMethod_try(this.k.nl[0][i1]) == 126)
        {
          this.k.a("该卡不能作为悬赏任务奖励.", this.k.jdField_do, false, 9999);
          return;
        }
        this.jdField_void.d9 = new w(this.jdField_void, "数量", 0, this.jdField_void.cZ.jdMethod_if(this.k.nl[0][i1]), a3.jdMethod_do(this.k.jv[0][i1], 2) > 0 ? a3.jdMethod_do(this.k.jv[0][i1], 2) : 1);
        this.k.jdField_do = -98;
        break;
      case 7: 
        this.jdField_void.i.jdMethod_if();
        jdMethod_if();
      }
      break;
    case -98: 
      switch (this.jdField_void.d9.a(paramInt))
      {
      case 2: 
        this.k.a("只能输入" + this.k.f4 + "-" + this.k.hG + "的数.", this.k.jdField_do, false, 9999);
        break;
      case 0: 
        i1 = (byte)(this.k.lY + this.k.lX * 6);
        if (a3.jdMethod_do(this.k.mn, 4) > 0)
        {
          if (this.h == 53)
          {
            this.t = this.k.nl[0][i1];
            this.jdField_byte = this.k.mn;
            this.jdField_int = this.jdField_void.i.a(this.t);
          }
          else if (this.h == 54)
          {
            this.n = this.k.nl[0][i1];
            this.q = this.k.mn;
            this.j = this.jdField_void.i.a(this.n);
          }
          a();
        }
        else
        {
          if (this.h == 53)
          {
            this.jdField_int = null;
            this.t = -1;
            this.jdField_byte = a3.jdMethod_new(0, 4);
          }
          else if (this.h == 54)
          {
            this.j = null;
            this.n = -1;
            this.q = a3.jdMethod_new(0, 4);
          }
          this.k.jv[0][i1] = ((short)a3.jdMethod_new(0, 2));
          this.k.jdField_do = -97;
        }
        break;
      case 1: 
        jdMethod_if();
      }
      break;
    case -96: 
      switch (this.jdField_void.d9.a(paramInt))
      {
      case 2: 
        this.k.a("只能输入" + this.k.f4 + "-" + this.k.hG + "的数.", this.k.jdField_do, false, 9999);
        break;
      case 0: 
        if ((this.h >= 15) && (this.h <= 20)) {
          a();
        } else if (a3.jdMethod_do(this.k.mn, 4) > 0) {
          a();
        }
        break;
      case 1: 
        jdMethod_if();
      }
      break;
    case -95: 
      switch (paramInt)
      {
      case 5: 
      case 6: 
      case 48: 
      case 49: 
      case 51: 
      case 55: 
      case 57: 
        i1 = this.jdField_void.jdMethod_do(paramInt, this.k.c9.length);
        if (i1 < 0) {
          return;
        }
        if (i1 > 0) {
          this.k.gd = ((byte)i1);
        }
        a();
        break;
      case 7: 
        jdMethod_if();
        break;
      case 1: 
        g tmp1729_1726 = this.k;
        tmp1729_1726.gd = ((byte)(tmp1729_1726.gd - 1));
        if (this.k.gd < 0) {
          this.k.gd = ((byte)(this.k.c9.length - 1));
        }
        break;
      case 2: 
        g tmp1774_1771 = this.k;
        tmp1774_1771.gd = ((byte)(tmp1774_1771.gd + 1));
        if (this.k.gd > this.k.c9.length - 1) {
          this.k.gd = 0;
        }
        break;
      }
      break;
    }
  }
  
  public void a(int paramInt1, int paramInt2, DataInputStream paramDataInputStream)
  {
    try
    {
      switch (paramInt1)
      {
      case 5849: 
        int i1 = paramDataInputStream.readByte();
        if (i1 == 1)
        {
          paramDataInputStream.readShort();
          this.k.a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          this.k.ea = null;
        }
        else
        {
          if (a3.jdMethod_do(this.s, 4) > 0) {
            this.jdField_void.cZ.jdMethod_for((byte)0, a3.jdMethod_do(this.s, 4));
          }
          if (a3.jdMethod_do(this.jdField_new, 4) > 0) {
            this.jdField_void.cZ.jdMethod_for((byte)4, a3.jdMethod_do(this.jdField_new, 4));
          }
          if (this.t >= 0) {
            this.jdField_void.cZ.a((byte)0, this.t, a3.jdMethod_do(this.jdField_byte, 4), false);
          }
          if (this.n >= 0) {
            this.jdField_void.cZ.a((byte)1, this.n, a3.jdMethod_do(this.q, 4), false);
          }
          this.k.a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          this.jdField_void.cZ.a((byte)1, paramDataInputStream.readShort(), 1, false);
          this.k.ea = null;
        }
        break;
      }
    }
    catch (Exception localException) {}
  }
  
  public void a(byte paramByte)
  {
    this.jdField_void.cZ.y();
    byte b1 = 0;
    short[] arrayOfShort1 = null;
    int i2;
    for (int i1 = 0; i1 < 2; i1 = (byte)(i1 + 1))
    {
      b1 = 0;
      for (i2 = 0; i2 < this.jdField_void.cZ.gJ[paramByte]; i2 = (byte)(i2 + 1)) {
        if ((!h.v(this.jdField_void.cZ.gw[paramByte][i2])) && (!h.o(this.jdField_void.cZ.gw[paramByte][i2])) && (this.jdField_void.jdMethod_try(this.jdField_void.cZ.gw[paramByte][i2]) != 7))
        {
          if (i1 == 1) {
            arrayOfShort1[b1] = this.jdField_void.cZ.gw[paramByte][i2];
          }
          b1 = (byte)(b1 + 1);
        }
      }
      if (i1 == 0) {
        arrayOfShort1 = new short[b1];
      }
    }
    this.jdField_void.i.a(1, (byte)0, b1, arrayOfShort1, new short[arrayOfShort1.length]);
    short[] arrayOfShort2 = new short[this.jdField_void.cZ.gJ[paramByte]];
    System.arraycopy(this.jdField_void.cZ.gw[paramByte], 0, arrayOfShort2, 0, this.jdField_void.cZ.gJ[paramByte]);
    this.jdField_void.i.a(arrayOfShort2, true);
    if ((this.h == 53) && (this.t >= 0)) {
      for (i2 = 0; i2 < this.k.bs[0]; i2 = (byte)(i2 + 1)) {
        if (this.k.nl[0][i2] == this.t) {
          this.k.jv[0][i2] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.jdField_byte, 4), 2));
        }
      }
    } else if ((this.h == 54) && (this.n >= 0)) {
      for (i2 = 0; i2 < this.k.bs[0]; i2 = (byte)(i2 + 1)) {
        if (this.k.nl[0][i2] == this.n) {
          this.k.jv[0][i2] = ((short)a3.jdMethod_new(a3.jdMethod_do(this.q, 4), 2));
        }
      }
    }
    this.k.jdField_do = -97;
  }
  
  public void jdMethod_int()
  {
    this.k.E();
    int i1 = 0;
    int i2 = 0;
    if (h.a9 == 0)
    {
      i1 = 128;
      i2 = 128;
    }
    else
    {
      i1 = 176;
      i2 = 203;
    }
    this.jdField_void.a((byte)2, 0, 0, i1, i2, true);
    int i3 = 5;
    int i4 = (byte)this.jdField_long.length;
    int i5 = (byte)((h.fp - i3 - h.eA) / (h.eA + 1));
    int i6 = (byte)(i4 / i5);
    if (i6 * i5 < i4) {
      i6 = (byte)(i6 + 1);
    }
    if (this.x >= i6) {
      this.x = ((byte)(i6 - 1));
    }
    this.jdField_void.fj.setColor(h.b2[2][1]);
    for (int i7 = 0; (i7 < i5) && (this.x * i5 + i7 <= this.jdField_long.length - 1); i7 = (byte)(i7 + 1)) {
      this.jdField_void.fj.drawString(this.jdField_long[(this.x * i5 + i7)], 5, i3 + i7 * (h.eA + 1), 20);
    }
    if (this.x > 0) {
      this.jdField_void.a(i1 - 20, i3 + (this.k.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.jdField_void.aH[4], 0);
    }
    if (this.x < i6 - 1) {
      this.jdField_void.a(i1 - 20, i2 - 20 + (this.k.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.jdField_void.aH[4], 3);
    }
    this.jdField_void.x();
    this.jdField_void.c();
  }
  
  public void jdMethod_for()
  {
    this.jdField_void.i.jdField_if = new Form(this.h == 21 ? "暗杀" : "传言");
    this.jdField_void.i.jdField_int = new TextField("输入玩家昵称:", "", 6, 0);
    if ((this.h == 21) && (this.jdField_try != null)) {
      this.jdField_void.i.jdField_int.setString(this.jdField_try);
    } else if ((this.h == 22) && (this.o != null)) {
      this.jdField_void.i.jdField_int.setString(this.o);
    }
    this.jdField_void.i.c = new Command("确定", 4, 0);
    this.jdField_void.i.j = new Command("取消", 8, 1);
    this.jdField_void.i.jdField_if.append(this.jdField_void.i.jdField_int);
    this.jdField_void.i.jdField_if.addCommand(this.jdField_void.i.c);
    this.jdField_void.i.jdField_if.addCommand(this.jdField_void.i.j);
    this.jdField_void.i.jdField_if.setCommandListener(this.k);
    Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void.i.jdField_if);
  }
  
  public void jdMethod_byte()
  {
    this.jdField_void.i.c = new Command("确定", 4, 0);
    this.jdField_void.i.j = new Command("返回", 8, 1);
    this.jdField_void.i.jdField_for = new TextBox("传言内容(请勿用特殊字符):", "", 30, 0);
    if (this.jdField_if != null) {
      this.jdField_void.i.jdField_for.setString(this.jdField_if);
    }
    this.jdField_void.i.jdField_for.addCommand(this.jdField_void.i.c);
    this.jdField_void.i.jdField_for.addCommand(this.jdField_void.i.j);
    this.jdField_void.i.jdField_for.setCommandListener(this.k);
    Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void.i.jdField_for);
  }
  
  public void jdMethod_try()
  {
    this.jdField_void.i.jdField_void = new Form("输入任务标题");
    this.jdField_void.i.c = new Command("确定", 4, 0);
    this.jdField_void.i.j = new Command("取消", 8, 1);
    this.jdField_void.i.jdField_int = new TextField("标题:", "", 6, 0);
    this.jdField_void.i.jdField_void.append(this.jdField_void.i.jdField_int);
    this.jdField_void.i.jdField_void.addCommand(this.jdField_void.i.c);
    this.jdField_void.i.jdField_void.addCommand(this.jdField_void.i.j);
    this.jdField_void.i.jdField_void.setCommandListener(this.k);
    Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void.i.jdField_void);
  }
  
  public void a(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramDisplayable == this.jdField_void.i.jdField_for)
    {
      if (paramCommand == this.jdField_void.i.c)
      {
        if (this.jdField_void.i.jdField_for.getString().trim().length() == 0)
        {
          this.jdField_void.jdMethod_char("内容不能为空.");
          return;
        }
        if (this.jdField_void.i.jdField_for.getString().trim().length() > 30)
        {
          this.jdField_void.jdMethod_char("内容过长,最多输入30个字.");
          return;
        }
        this.jdField_if = this.jdField_void.i.jdField_for.getString().trim();
        a();
        Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void);
      }
      else if (paramCommand == this.jdField_void.i.j)
      {
        jdMethod_if();
        Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void);
      }
    }
    else if (paramDisplayable == this.jdField_void.i.jdField_if)
    {
      if (paramCommand == this.jdField_void.i.c)
      {
        if (!h.jdMethod_try(this.jdField_void.i.jdField_int.getString()))
        {
          this.jdField_void.jdMethod_char("角色昵称长度要求3-6位.");
          return;
        }
        if (this.h == 21)
        {
          this.jdField_try = this.jdField_void.i.jdField_int.getString().trim();
          a(50);
          Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void);
        }
        else
        {
          this.o = this.jdField_void.i.jdField_int.getString().trim();
          a(23);
        }
      }
      else if (paramCommand == this.jdField_void.i.j)
      {
        a(this.h);
        Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void);
      }
    }
    else if (paramDisplayable == this.jdField_void.i.jdField_void) {
      if (paramCommand == this.jdField_void.i.c)
      {
        if (this.jdField_void.i.jdField_int.getString().trim().length() > 6)
        {
          this.jdField_void.jdMethod_char("任务标题过长,最多输入6个字.");
          return;
        }
        if (this.jdField_void.i.jdField_int.getString().trim().length() == 0)
        {
          this.jdField_void.jdMethod_char("任务标题不能为空.");
          return;
        }
        this.w = this.jdField_void.i.jdField_int.getString().trim();
        a();
        Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void);
      }
      else if (paramCommand == this.jdField_void.i.j)
      {
        jdMethod_if();
        Display.getDisplay(this.jdField_void.fG).setCurrent(this.jdField_void);
      }
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\af.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */