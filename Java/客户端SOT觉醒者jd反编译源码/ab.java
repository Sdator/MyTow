import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public class ab
{
  h a = null;
  g jdField_if = null;
  
  public ab(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramCommand == this.a.i.c)
    {
      if (!h.jdMethod_try(this.a.i.jdField_int.getString().trim()))
      {
        this.a.jdMethod_char("帐号要求3-6位.");
        return;
      }
      if (!h.j(this.a.i.r.getString().trim()))
      {
        this.a.jdMethod_char("密码长度不得低于4位.");
        return;
      }
      if (this.a.i.g.getSelectedIndex() == -1)
      {
        this.a.jdMethod_char("请选择内测游戏区.");
        return;
      }
      if (this.a.aG.jdMethod_int(8999))
      {
        this.a.aG.jdMethod_do(this.a.i.g.getSelectedIndex());
        this.a.aG.jdMethod_if(this.a.i.jdField_int.getString().trim());
        this.a.aG.jdMethod_if(this.a.i.r.getString().trim());
        this.a.aG.jdMethod_if();
      }
      this.jdField_if.jdField_do = 21;
      Display.getDisplay(this.a.fG).setCurrent(this.a);
    }
    else if (paramCommand == this.a.i.j)
    {
      this.a.i.jdField_try = null;
      this.jdField_if.jdField_do = 0;
      Display.getDisplay(this.a.fG).setCurrent(this.a);
    }
    this.a.ac = null;
  }
  
  public void a()
  {
    this.a.i.jdField_try = new Form("内测奖励");
    this.a.i.c = new Command("确定", 4, 0);
    this.a.i.j = new Command("取消", 8, 1);
    this.a.i.jdField_int = new TextField("内测帐号:", "", 6, 0);
    this.a.i.r = new TextField("内测密码:", "", 10, 65536);
    this.a.i.g = new ChoiceGroup("内测游戏区", 1);
    this.a.i.g.append("亚提斯", null);
    this.a.i.g.append("海伯利安", null);
    this.a.i.g.setSelectedIndex(0, true);
    this.a.i.jdField_try.append(this.a.i.g);
    this.a.i.jdField_try.append(this.a.i.jdField_int);
    this.a.i.jdField_try.append(this.a.i.r);
    this.a.i.jdField_try.addCommand(this.a.i.c);
    this.a.i.jdField_try.addCommand(this.a.i.j);
    this.a.i.jdField_try.setCommandListener(this.jdField_if);
    Display.getDisplay(this.a.fG).setCurrent(this.a.i.jdField_try);
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ab.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */