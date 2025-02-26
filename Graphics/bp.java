package Graphics;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class bp extends GraphicParent {
  private Vector[] a = ad.a();
  
  public static int a;
  
  public static int b;
  
  public static z a;
  
  private static bp a;
  
  public static final bp a() {
    if (a == null) {
      a = new bp();
      a = r.i - 77;
      b = r.j - 85;
    } 
    return a;
  }
  
  private bp() {
    super(null, (byte)6);
    super.b = new v(this, (Vector)this.a[super.b], super.b);
  }
  
  public final void d() {
    try {
      a = (bp)new z("/sgui/shop");
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  private void e() {
    a = null;
    a = null;
    this.a = null;
    super.b = null;
    n.a(2);
    bs.a.b();
    System.gc();
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (d(paramInt1, paramInt2))
      return true; 
    if (paramInt2 == -8) {
      e();
      return true;
    } 
    return false;
  }
  
  public final void a(byte paramByte) {
    super.a(paramByte);
    super.b = new v(this, (Vector)this.a[super.b], super.b);
  }
  
  public final void a(Graphics paramGraphics) {
    b(paramGraphics, a, b);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    bh.a(paramGraphics);
    bh.a(paramGraphics, (char[])bh.d, (char[])bh.e);
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(paramInt1, paramInt2, 155, 170);
    c(paramGraphics, paramInt1 + 2, paramInt2 + 15, 151, 155);
    paramGraphics.setColor(16768959);
    paramGraphics.fillRect(paramInt1 + 11 + super.b * 16 + 1, paramInt2, 14, 1);
    paramGraphics.fillRect(paramInt1 + 11 + super.b * 16, paramInt2 + 1, 1, 16);
    paramGraphics.setColor(12558207);
    paramGraphics.fillRect(paramInt1 + 11 + super.b * 16 + 15, paramInt2 + 1, 1, 15);
    paramGraphics.setColor(14663551);
    paramGraphics.fillRect(paramInt1 + 11 + super.b * 16 + 1, paramInt2 + 1, 14, 16);
    for (byte b = 0; b < 6; b++)
      paramGraphics.drawImage(ce.p[b], paramInt1 + 13 + b * 16, paramInt2 + 1, 20); 
    r.a(paramGraphics, a.a(super.b + 1), paramInt1 + 3, paramInt2 + 15);
    paramGraphics.drawImage(ce.o, paramInt1 + 4, paramInt2 + 4, 20);
    paramGraphics.drawImage(ce.d, paramInt1 + 109, paramInt2 + 4, 20);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */