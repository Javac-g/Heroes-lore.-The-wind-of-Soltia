import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class ax extends GraphicParent {
  public static int a;
  
  public static int b;
  
  public static z a;
  
  private static ax a;
  
  public static final ax a() {
    if (a == null) {
      a = new ax();
      a = r.i - 77;
      b = r.j - 85;
    } 
    return a;
  }
  
  public ax() {
    super(null, (byte)0);
  }
  
  public final void d() {
    try {
      a = (ax)new z("/sgui/refi");
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
    } 
    Object[] arrayOfObject = { a.a(0), a.a(1), a.a(2) };
    a((byte)8, (byte)2, arrayOfObject);
  }
  
  public final void e() {
    a = null;
    a = null;
    super.b = null;
    n.a(2);
    bs.a.b();
    System.gc();
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (paramInt2 == -8)
      e(); 
    return false;
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    super.a(paramByte1, paramByte2);
    if (paramByte1 == 8 && paramByte2 == 0) {
      super.b = new ap(this);
      return;
    } 
    if (paramByte1 == 8 && paramByte2 == 1) {
      super.b = new k(this);
      return;
    } 
    e();
  }
  
  public final void a(Graphics paramGraphics) {
    b(paramGraphics, a, b);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    bh.a(paramGraphics);
    bh.a(paramGraphics, (char[])bh.d, (char[])bh.e);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ax.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */