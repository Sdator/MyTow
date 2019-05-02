import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public class aq
{
  h a = null;
  g jdField_if = null;
  
  public aq(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a()
  {
    this.a.i.jdField_new = new Form("公会申请卡");
    this.a.i.c = new Command("确定", 4, 0);
    this.a.i.jdField_int = new TextField("名称:", "", 6, 0);
    this.a.i.jdField_new.append(this.a.i.jdField_int);
    this.a.i.jdField_new.addCommand(this.a.i.c);
    this.a.i.jdField_new.setCommandListener(this.jdField_if);
    Display.getDisplay(this.a.fG).setCurrent(this.a.i.jdField_new);
  }
  
  public void a(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramCommand == this.a.i.c)
    {
      if (!h.jdMethod_try(this.a.i.jdField_int.getString().trim()))
      {
        this.a.jdMethod_char("公会名称长度要求" + a.i + "-" + a.L + "位.");
        return;
      }
      if (this.a.aG.jdMethod_int(3701))
      {
        this.a.aG.jdMethod_if(this.a.i.jdField_int.getString().trim());
        this.a.aG.jdMethod_if();
      }
      this.jdField_if.jdField_do = 21;
      Display.getDisplay(this.a.fG).setCurrent(this.a);
      this.a.fF = null;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\aq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */