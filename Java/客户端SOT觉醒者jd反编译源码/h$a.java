import java.util.TimerTask;
import javax.microedition.lcdui.Canvas;
import javax.microedition.midlet.MIDlet;
import kava.lang.Threak;

class h$a
  extends TimerTask
{
  private final h _$11924;
  
  private h$a(h paramh)
  {
    this._$11924 = paramh;
  }
  
  public void run()
  {
    try
    {
      if (h.access$100()) {
        return;
      }
      h.access$102(true);
      this._$11924.repaint();
      this._$11924.serviceRepaints();
      Threak.sleep(20L);
      if (h.bi)
      {
        this._$11924.fG.destroyApp(true);
        this._$11924.fG.notifyDestroyed();
      }
    }
    catch (Exception localException) {}
  }
  
  h$a(h paramh, h.0 param0)
  {
    this(paramh);
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\h$a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */