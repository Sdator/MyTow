import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public class ad
{
  h a = null;
  g jdField_if = null;
  static String jdField_do = "";
  static String jdField_for = "";
  
  public ad(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a()
  {
    this.a.i.h = new Form("身份登记卡");
    this.a.i.c = new Command("确定", 4, 0);
    this.a.i.jdField_long = new TextField("帐号:", "" + do, 15, 0);
    this.a.i.jdField_int = new TextField("角色昵称:", "" + do, 7, 0);
    this.a.i.r = new TextField("密码:", "" + for, 10, 0);
    this.a.i.p = new TextField("确认密码:", "" + for, 10, 0);
    this.a.i.h.append(this.a.i.jdField_long);
    this.a.i.h.append("(帐号支持3-12位英文字母、数字及下划线.)");
    this.a.i.h.append(this.a.i.jdField_int);
    this.a.i.h.append(this.a.i.r);
    this.a.i.h.append(this.a.i.p);
    this.a.i.h.addCommand(this.a.i.c);
    this.a.i.h.setCommandListener(this.jdField_if);
    this.a.i.h.setItemStateListener(this.jdField_if);
    Display.getDisplay(this.a.fG).setCurrent(this.a.i.h);
  }
  
  public void a(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramCommand == this.a.i.c)
    {
      if ((this.a.i.jdField_long.getString().trim().length() > 12) || (this.a.i.jdField_long.getString().trim().length() < 3))
      {
        this.a.jdMethod_char("帐号长度要求3-12位.");
        return;
      }
      if (!h.jdMethod_try(this.a.i.jdField_int.getString()))
      {
        this.a.jdMethod_char("角色昵称长度要求3-6位.");
        return;
      }
      if (!this.a.i.r.getString().trim().equals(this.a.i.p.getString().trim()))
      {
        this.a.jdMethod_char("两次输入密码不同.");
        return;
      }
      if (!h.j(this.a.i.r.getString().trim()))
      {
        this.a.jdMethod_char("密码长度不得低于4位.");
        return;
      }
      if (this.a.aG.jdMethod_int(1002))
      {
        this.a.aG.jdMethod_if(this.a.i.jdField_long.getString().trim());
        this.a.aG.jdMethod_if(this.a.i.jdField_int.getString().trim());
        this.a.aG.jdMethod_if(this.a.i.r.getString().trim());
        this.a.aG.jdMethod_do(this.a.cZ.gD);
        this.a.aG.jdMethod_do(this.a.cZ.bo);
        this.a.aG.a(Long.parseLong("13000000000"));
        this.a.aG.jdMethod_if(h.bL);
        this.a.aG.jdMethod_if();
      }
      this.jdField_if.jdField_do = 21;
      Display.getDisplay(this.a.fG).setCurrent(this.a);
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ad.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */