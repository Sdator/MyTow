import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public class az
{
  h a = null;
  g jdField_if = null;
  
  public az(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramCommand == this.a.i.c)
    {
      if (!h.jdMethod_try(this.a.i.jdField_int.getString()))
      {
        this.a.jdMethod_char("角色昵称长度要求3-6位.");
        return;
      }
      if (this.a.i.jdField_int.getString().trim().equals(this.a.cZ.O))
      {
        this.a.jdMethod_char("请输入与当前昵称不同的新昵称.");
        return;
      }
      int i = this.a.jdMethod_if((byte)110);
      if (i == -1)
      {
        this.jdField_if.jdField_do = 0;
        this.a.bM = null;
      }
      else
      {
        this.jdField_if.jdField_do = 21;
        if (this.a.aG.jdMethod_int(6708))
        {
          this.a.aG.jdMethod_new(i);
          this.a.aG.jdMethod_if(this.a.cZ.O);
          this.a.aG.jdMethod_if(this.a.i.jdField_int.getString().trim());
          this.a.aG.jdMethod_if();
        }
      }
      Display.getDisplay(this.a.fG).setCurrent(this.a);
    }
    if (paramCommand == this.a.i.j)
    {
      this.jdField_if.jdField_do = 0;
      this.a.bM = null;
      Display.getDisplay(this.a.fG).setCurrent(this.a);
    }
  }
  
  public void a()
  {
    this.jdField_if.jdField_do = 35;
    this.a.i.b = new Form("输入新昵称");
    this.a.i.c = new Command("确定", 4, 0);
    this.a.i.j = new Command("取消", 8, 1);
    this.a.i.jdField_int = new TextField("角色昵称:", "", 7, 0);
    this.a.i.b.append(this.a.i.jdField_int);
    this.a.i.b.addCommand(this.a.i.c);
    this.a.i.b.addCommand(this.a.i.j);
    this.a.i.b.setCommandListener(this.jdField_if);
    Display.getDisplay(this.a.fG).setCurrent(this.a.i.b);
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\az.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */