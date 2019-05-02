import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class SFMIDlet
  extends MIDlet
{
  h a;
  
  public SFMIDlet()
  {
    h.gg = getAppProperty("MIDlet-Version");
  }
  
  protected void pauseApp()
  {
    this.a.dp = 0;
    this.a.fK = true;
  }
  
  protected void startApp()
    throws MIDletStateChangeException
  {
    Displayable localDisplayable = Display.getDisplay(this).getCurrent();
    if (localDisplayable == null)
    {
      this.a = new h(this);
      Display.getDisplay(this).setCurrent(this.a);
      this.a.t();
    }
    else
    {
      Display.getDisplay(this).setCurrent(localDisplayable);
    }
  }
  
  protected void destroyApp(boolean paramBoolean)
  {
    try
    {
      if (this.a.aG != null) {
        this.a.aG.du = null;
      }
      this.a.dM = null;
      this.a.O();
    }
    catch (Exception localException) {}
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\SFMIDlet.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */