package Graphics;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class ai extends GraphicParent implements u {
  public static int a;
  
  public static int b;
  
  private byte[] h = new byte[5];
  
  private byte c;
  
  public static z a;
  
  private static ai a;
  
  public static final ai a() {
    if (a == null) {
      a = new ai();
      a.b = new q(a);
      a = r.i - 77;
      b = r.j - 85;
    } 
    return a;
  }
  
  private ai() {
    super(null, (byte)6);
  }
  
  public final void d() {
    ao ao;
    p p = (ao = n.a()).a();
    for (byte b = 0; b < 5; b = (byte)(b + 1))
      this.h[b] = -1; 
    if (ao.a() != null)
      this.h[0] = bu.a[n.a - 6][(ao.a()).g]; 
    if (ao.a() != null)
      this.h[1] = bu.b[(ao.a()).g]; 
    if (ao.a() != null)
      this.h[2] = bu.b[n.a - 6][(ao.a()).g]; 
    if (ao.b() != null)
      this.h[3] = bu.a[(ao.b()).g]; 
    this.c = -1;
    if (p != null)
      this.c = p.f; 
    try {
      a = (ai)new z("/sgui/gm");
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
    } 
    bs.a.h();
  }
  
  public final void e() {
    super.b = 6;
    d d;
    (d = new d(this)).d();
    super.b = d;
    super.b.b = 1;
  }
  
  public final void a(boolean paramBoolean) {
    ao ao;
    p p = (ao = n.a()).a();
    a = null;
    if (!paramBoolean)
      return; 
    if (ao.a() != null && this.h[1] != bu.b[(ao.a()).g])
      ao.e((byte)1); 
    if (ao.a() != null && this.h[2] != bu.b[n.a - 6][(ao.a()).g])
      ao.e((byte)2); 
    if (ao.b() != null && this.h[3] != bu.a[(ao.b()).g])
      ao.e((byte)3); 
    if (p != null && this.c != p.f) {
      ao.l();
    } else {
      if (ao.a() != null && this.h[0] != bu.a[n.a - 6][(ao.a()).g])
        ao.e((byte)0); 
      n.a(2);
      bs.a.f();
    } 
    super.b = null;
    a = null;
    this.h = null;
    a = null;
    bs.a.b();
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (paramInt2 == -8) {
      n.a((byte)14, (byte)0);
      return true;
    } 
    return d(paramInt1, paramInt2);
  }
  
  public final void a(Graphics paramGraphics) {
    b(paramGraphics, a, b);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (super.b != null) {
      bh.a(paramGraphics);
      bh.a(paramGraphics, (char[])bh.d, (char[])bh.e);
    } 
    boolean bool = false;
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(paramInt1, paramInt2, 155, 176);
    c(paramGraphics, paramInt1 + 2, paramInt2 + 15, 151, 160);
    paramGraphics.setColor(16768959);
    paramGraphics.fillRect(paramInt1 + 5 + super.b * 16 + 1, paramInt2, 14, 1);
    paramGraphics.fillRect(paramInt1 + 5 + super.b * 16, paramInt2 + 1, 1, 16);
    paramGraphics.setColor(12558207);
    paramGraphics.fillRect(paramInt1 + 5 + super.b * 16 + 15, paramInt2 + 1, 1, 15);
    paramGraphics.setColor(14663551);
    paramGraphics.fillRect(paramInt1 + 5 + super.b * 16 + 1, paramInt2 + 1, 14, 16);
    int i = paramInt1 + 7;
    byte b;
    for (b = 0; b < 6; b = (byte)(b + 1)) {
      paramGraphics.drawImage(ce.n[b], i, paramInt2 + 1, 20);
      i += 16;
    } 
  }
  
  public final void a(byte paramByte) {
    super.a(paramByte);
    super.b = null;
    switch (super.b) {
      case 0:
        super.b = new q(this);
        break;
      case 1:
        super.b = new ay(this);
        break;
      case 2:
        super.b = new bz(this);
        break;
      case 3:
        super.b = new bm(this);
        break;
      case 4:
        super.b = new s(this);
        break;
      case 5:
        super.b = new d(this);
        break;
    } 
    super.a = 1;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ai.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */