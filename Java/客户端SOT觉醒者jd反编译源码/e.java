import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import kava.lang.Threak;

public class e
{
  h jdField_case = null;
  g jdField_char = null;
  byte jdField_do;
  static byte jdField_if = 0;
  static String[] jdField_try = null;
  static byte[] jdField_int = null;
  static byte[] a = null;
  static byte[] jdField_new = null;
  static String[] jdField_byte = null;
  public static final String[] jdField_for = { "神州行", "联通卡", "骏网一卡通" };
  
  public e(h paramh)
  {
    this.jdField_case = paramh;
    this.jdField_char = paramh.cJ;
    this.jdField_case.i.jdMethod_for();
    this.jdField_char.j1 = -36;
    if (this.jdField_char.ip == null) {
      this.jdField_char.ip = new Vector();
    }
    this.jdField_char.ip.removeAllElements();
    for (int i = 0; i < try.length; i = (byte)(i + 1)) {
      this.jdField_char.ip.addElement(try[i]);
    }
  }
  
  public void jdMethod_do()
  {
    switch (this.jdField_char.jdField_do)
    {
    case -38: 
      this.jdField_char.E();
      this.jdField_char.a("确定发送短信充值?", "确定", "取消");
      break;
    case -102: 
      this.jdField_char.E();
      if (this.jdField_case.a(byte[this.jdField_char.hZ], g.gf, (byte)4, false)) {
        jdMethod_if();
      }
      break;
    case -37: 
      this.jdField_char.E();
      if (this.jdField_case.a(g.he[if], g.gf, (byte)4, false))
      {
        this.jdField_char.e3 = 0;
        this.jdField_char.jdField_do = -38;
      }
      break;
    case -36: 
      this.jdField_char.a(this.jdField_char.ip, true);
      this.jdField_case.x();
      this.jdField_case.c();
      break;
    case -106: 
      this.jdField_char.a(this.jdField_char.c8, true);
      this.jdField_case.x();
      this.jdField_case.c();
      break;
    case -108: 
      break;
    case -109: 
      this.jdField_char.a(this.jdField_char.nk, true);
      this.jdField_case.x();
      this.jdField_case.c();
    }
  }
  
  public void a(int paramInt)
  {
    switch (this.jdField_char.jdField_do)
    {
    case -36: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.L();
        break;
      case 2: 
        this.jdField_char.u();
        break;
      case 5: 
      case 6: 
        if (a[this.jdField_char.hZ] == 0)
        {
          if (g.dM.equals("0"))
          {
            this.jdField_char.a("当前短信充值功能暂时关闭，无法使用.", (short)this.jdField_do, false, 9999);
            this.jdField_case.bv = null;
            return;
          }
          if (this.jdField_char.bB)
          {
            this.jdField_char.a(this.jdField_char.fM, (short)this.jdField_do, false, 9999);
            this.jdField_case.bv = null;
            return;
          }
          if = new[this.jdField_char.hZ];
          g.gf = 0;
          this.jdField_char.jdField_do = -37;
        }
        else if (byte[this.jdField_char.hZ].trim().length() > 0)
        {
          g.gf = 0;
          this.jdField_char.jdField_do = -102;
        }
        else
        {
          jdMethod_if();
        }
        break;
      case 7: 
        this.jdField_char.jdField_do = ((short)this.jdField_do);
        this.jdField_case.bv = null;
      }
      break;
    case -38: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_char.e3 = 0;
        break;
      case 2: 
        this.jdField_char.e3 = 1;
        break;
      case 5: 
      case 6: 
        switch (this.jdField_char.e3)
        {
        case 0: 
          try
          {
            this.jdField_char.jdMethod_new(if);
            if ((g.kv[if] == 1) && (this.jdField_case.fG.platformRequest(h.ea + "?fromGame=" + int[this.jdField_char.hZ] + "&user=" + this.jdField_case.dv.trim() + "&zone=" + this.jdField_case.fA)))
            {
              this.jdField_char.J();
            }
            else
            {
              this.jdField_char.jdField_do = 0;
              this.jdField_char.jdMethod_if(6);
            }
          }
          catch (Exception localException)
          {
            this.jdField_char.a("短信充值失败.", (short)this.jdField_do, false, 9999);
          }
          this.jdField_case.bv = null;
          break;
        case 1: 
          this.jdField_char.jdField_do = ((short)this.jdField_do);
          this.jdField_case.bv = null;
        }
        break;
      }
      break;
    }
  }
  
  public void a()
  {
    this.jdField_char.jdField_do = -49;
    this.jdField_case.i.q = new Form("手机直充");
    this.jdField_case.i.c = new Command("确定", 4, a.ac);
    this.jdField_case.i.j = new Command("取消", 8, a.char);
    this.jdField_case.i.q.append("[" + this.jdField_case.fl + "]" + this.jdField_case.dv);
    this.jdField_case.i.g = new ChoiceGroup("金额:", 1);
    this.jdField_case.i.g.append("" + a.J, null);
    this.jdField_case.i.g.append("" + a.n, null);
    this.jdField_case.i.g.append("" + a.o, null);
    this.jdField_case.i.g.append("" + a.void, null);
    this.jdField_case.i.g.append("" + a.U, null);
    this.jdField_case.i.q.append(this.jdField_case.i.g);
    this.jdField_case.i.q.append("注意:每手机号每月充值上限为100元(超出上限不予扣费;自然月由每月1日算起)");
    this.jdField_case.i.q.addCommand(this.jdField_case.i.c);
    this.jdField_case.i.q.addCommand(this.jdField_case.i.j);
    this.jdField_case.i.q.setCommandListener(this.jdField_char);
    Display.getDisplay(this.jdField_case.fG).setCurrent(this.jdField_case.i.q);
  }
  
  public void a(byte paramByte)
  {
    this.jdField_char.jdField_do = -49;
    this.jdField_case.i.k = new Form(for[paramByte] + "充值");
    this.jdField_case.i.s = new TextField("卡号:", "", a.p, 0);
    this.jdField_case.i.i = new TextField("密码:", "", a.p, 0);
    this.jdField_case.i.c = new Command("确定", 4, a.ac);
    this.jdField_case.i.j = new Command("取消", 8, a.char);
    this.jdField_case.i.k.append("[" + this.jdField_case.fl + "]" + this.jdField_case.dv);
    this.jdField_case.i.g = new ChoiceGroup("充值卡面额:", 1);
    switch (paramByte)
    {
    case 0: 
      this.jdField_case.i.g.append("" + a.n, null);
      this.jdField_case.i.g.append("" + a.void, null);
      this.jdField_case.i.g.append("" + a.U, null);
      this.jdField_case.i.g.append("" + a.new, null);
      this.jdField_case.i.g.setSelectedIndex(2, true);
      break;
    case 1: 
      this.jdField_case.i.g.append("" + a.U, null);
      this.jdField_case.i.g.append("" + a.new, null);
      this.jdField_case.i.g.setSelectedIndex(0, true);
      break;
    case 2: 
      this.jdField_case.i.g.append("" + a.char, null);
      this.jdField_case.i.g.append("" + a.J, null);
      this.jdField_case.i.g.append("" + a.L, null);
      this.jdField_case.i.g.append("" + a.n, null);
      this.jdField_case.i.g.append("" + a.T, null);
      this.jdField_case.i.g.append("" + a.void, null);
      this.jdField_case.i.g.append("" + a.U, null);
      this.jdField_case.i.g.append("" + a.R, null);
      this.jdField_case.i.g.append("" + a.new, null);
      this.jdField_case.i.g.setSelectedIndex(3, true);
    }
    this.jdField_case.i.k.append(this.jdField_case.i.g);
    this.jdField_case.i.k.append(this.jdField_case.i.s);
    this.jdField_case.i.k.append(this.jdField_case.i.i);
    this.jdField_case.i.k.append("请注意,充值卡面额和选择的充值面额务必一致，否则会导致充值失败");
    this.jdField_case.i.k.addCommand(this.jdField_case.i.c);
    this.jdField_case.i.k.addCommand(this.jdField_case.i.j);
    this.jdField_case.i.k.setCommandListener(this.jdField_char);
    Display.getDisplay(this.jdField_case.fG).setCurrent(this.jdField_case.i.k);
  }
  
  public void a(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramDisplayable == this.jdField_case.i.q)
    {
      if (paramCommand == this.jdField_case.i.c)
      {
        int i = Short.parseShort(this.jdField_case.i.g.getString(this.jdField_case.i.g.getSelectedIndex()));
        this.jdField_char.lt = ("您已选择充值{" + i + "}元,点击确认后将直接从您当前手机卡的{话费余额}中扣除{" + i + "}元.是否充值?");
        g.gf = (byte)a.ac;
        this.jdField_char.jdField_do = -103;
        Display.getDisplay(this.jdField_case.fG).setCurrent(this.jdField_case);
      }
      else
      {
        this.jdField_char.jdField_do = ((short)this.jdField_do);
        Display.getDisplay(this.jdField_case.fG).setCurrent(this.jdField_case);
        this.jdField_case.bv = null;
      }
    }
    else if (paramDisplayable == this.jdField_case.i.k) {
      if (paramCommand == this.jdField_case.i.c)
      {
        String str1 = this.jdField_case.i.s.getString().trim();
        String str2 = this.jdField_case.i.i.getString().trim();
        if (str1.length() == a.ac)
        {
          this.jdField_case.jdMethod_char("请输入卡号.");
          return;
        }
        if (str2.length() == a.ac)
        {
          this.jdField_case.jdMethod_char("请输入密码.");
          return;
        }
        int j = Short.parseShort(this.jdField_case.i.g.getString(this.jdField_case.i.g.getSelectedIndex()));
        if (this.jdField_case.aG.jdMethod_int(8103))
        {
          this.jdField_case.aG.jdMethod_if(h.bL);
          this.jdField_case.aG.jdMethod_if(this.jdField_case.dv);
          this.jdField_case.aG.jdMethod_new(j);
          this.jdField_case.aG.jdMethod_if(str1);
          this.jdField_case.aG.jdMethod_if(str2);
          this.jdField_case.aG.jdMethod_do(new[this.jdField_char.hZ]);
          this.jdField_case.aG.jdMethod_if();
        }
        this.jdField_char.jdField_do = 21;
        Display.getDisplay(this.jdField_case.fG).setCurrent(this.jdField_case);
        this.jdField_case.bv = null;
      }
      else if (paramCommand == this.jdField_case.i.j)
      {
        this.jdField_char.jdField_do = ((short)this.jdField_do);
        Display.getDisplay(this.jdField_case.fG).setCurrent(this.jdField_case);
        this.jdField_case.bv = null;
      }
    }
  }
  
  private void jdMethod_if()
  {
    if (int[this.jdField_char.hZ] == 11)
    {
      aw localaw = new aw(this.jdField_case, false);
      Threak localThreak = new Threak(localaw);
      localThreak.start();
      this.jdField_char.jdField_do = 21;
      Display.getDisplay(this.jdField_case.fG).setCurrent(this.jdField_case);
    }
    else if ((a[this.jdField_char.hZ] == 1) && (new[this.jdField_char.hZ] > 0))
    {
      a((byte)(int[this.jdField_char.hZ] - 1));
    }
    else
    {
      try
      {
        if (this.jdField_case.fG.platformRequest(h.ea + "?fromGame=" + int[this.jdField_char.hZ] + "&user=" + this.jdField_case.dv.trim() + "&zone=" + this.jdField_case.fA))
        {
          this.jdField_char.J();
          this.jdField_case.bv = null;
        }
        else
        {
          this.jdField_char.jdField_do = 0;
          this.jdField_char.jdMethod_if(6);
          this.jdField_case.bv = null;
        }
      }
      catch (Exception localException)
      {
        h.a(localException);
      }
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */