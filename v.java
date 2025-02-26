import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class v extends GraphicParent {
  private ad[] a;
  
  public byte c;
  
  public v(GraphicParent paramcb, Vector paramVector, byte paramByte) {
    super(paramcb, (byte)paramVector.size());
    this.a = new ad[paramVector.size()];
    for (byte b = 0; b < this.a.length; b++)
      this.a[b] = paramVector.elementAt(b); 
    this.c = paramByte;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (c(paramInt1, paramInt2)) {
      super.a.a = 1;
      return true;
    } 
    if (paramInt2 == 53 || paramInt1 == 8) {
      this.b = new ab(this, this.a[this.b], true);
      return true;
    } 
    if (paramInt2 == 35) {
      byte[] arrayOfByte;
      if ((arrayOfByte = (n.a()).a.a()).length > 0) {
        this.b = new bb(this, arrayOfByte);
      } else {
        a((byte)1, (byte)0, new Object[] { bp.a.a(16), bp.a.a(17) });
      } 
      return true;
    } 
    return false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool;
    bh.a(paramGraphics, bh.i, (char[])bh.e);
    paramInt1 += 2;
    paramInt2 += 15;
    a(paramGraphics, paramInt1, paramInt2, true);
    byte b = -1;
    ao ao = n.a();
    switch (this.c) {
      case 1:
        if (ao.a() != null)
          bool = (ao.a()).a; 
        break;
      case 2:
        if (ao.a() != null)
          bool = (ao.a()).a; 
        break;
      case 3:
        if (ao.a() != null)
          bool = (ao.a()).a; 
        break;
      case 4:
        if (ao.b() != null)
          bool = (ao.b()).a; 
        break;
      case 5:
        if (ao.c() != null)
          bool = (ao.c()).a; 
        break;
    } 
    for (int i = c(); i <= d(); i++) {
      ad ad2;
      if ((ad2 = this.a[i]) != null) {
        GraphicParent.a(paramGraphics, paramInt1 + 13, paramInt2 + 18 + 23 * i % 5, ad2, false);
        if (this.c != 0) {
          boolean bool1 = ((e)this.a[this.b]).a;
          if (bool > bool1) {
            paramGraphics.drawImage((Image)ce.q, paramInt1 + 20, paramInt2 + 18 + this.b % 5 * 23, 33);
          } else if (bool < bool1) {
            paramGraphics.drawImage(ce.p, paramInt1 + 20, paramInt2 + 18 + this.b % 5 * 23, 33);
          } 
        } 
      } 
    } 
    ad ad1;
    if ((ad1 = this.a[this.b]) != null)
      GraphicParent.a(paramGraphics, paramInt1 + 33, paramInt2 + 14, ad1);
    paramGraphics.drawImage(ce.c, bp.a + 155 - 38, bp.b + 170 - 22, 20);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */