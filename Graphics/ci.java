package Graphics;

import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class ci implements PlayerListener {
  private Player a;
  
  public ci(String paramString) {
    a(paramString);
  }
  
  public final void a(int paramInt) {
    if (this.a != null)
      this.a.setLoopCount(paramInt); 
  }
  
  public final void a() {
    if (bs.a.a > null)
      d(); 
  }
  
  public final void b() {
    try {
      if (this.a != null)
        this.a.stop(); 
      return;
    } catch (MediaException mediaException2) {
      MediaException mediaException1;
      (mediaException1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void c() {
    if (this.a != null) {
      this.a.close();
      this.a = null;
    } 
  }
  
  public final boolean a() {
    return (this.a != null && this.a.getState() >= 400);
  }
  
  private static String a(String paramString) throws Exception {
    String str;
    if (paramString.endsWith("wav")) {
      str = "audio/x-wav";
    } else if (paramString.endsWith("jts")) {
      str = "audio/x-tone-seq";
    } else if (paramString.endsWith("mid")) {
      str = "audio/midi";
    } else {
      throw new Exception("Cannot guess content type from URL: " + paramString);
    } 
    return str;
  }
  
  private void a(String paramString) {
    if (this.a == null)
      try {
        if (paramString.startsWith("http:")) {
          this.a = Manager.createPlayer(paramString);
        } else if (paramString.startsWith("resource")) {
          int i = paramString.indexOf(':');
          String str1 = paramString.substring(i + 1);
          InputStream inputStream = getClass().getResourceAsStream(str1);
          String str2 = a(paramString);
          this.a = Manager.createPlayer(inputStream, str2);
          this.a.realize();
        } 
        this.a.addPlayerListener(this);
        return;
      } catch (Exception exception) {
        if (this.a != null) {
          this.a.close();
          this.a = null;
        } 
      }  
  }
  
  public final void b(int paramInt) {
    VolumeControl volumeControl;
    if (this.a != null && (volumeControl = (VolumeControl)this.a.getControl("VolumeControl")) != null)
      volumeControl.setLevel(paramInt); 
  }
  
  public final void d() {
    if (this.a != null)
      try {
        this.a.realize();
        this.a.prefetch();
        this.a.start();
        return;
      } catch (MediaException mediaException2) {
        MediaException mediaException1;
        (mediaException1 = null).printStackTrace();
        return;
      }  
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {}
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ci.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */