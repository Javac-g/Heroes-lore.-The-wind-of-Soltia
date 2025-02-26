package Graphics;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bm extends GraphicParent {
  public bm(GraphicParent paramcb) {
    super(paramcb, (byte)5);
    ao ao = n.a();
    for (byte b = 0; b < 5; b = (byte)(b + 1)) {
      if (ao.a[b] == ao.a()) {
        this.b = b;
        return;
      } 
    } 
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (c(paramInt1, paramInt2))
      return true; 
    ao ao = n.a();
    if ((paramInt2 == 53 || paramInt1 == 8) && ao.a[this.b] != null) {
      Object[] arrayOfObject = { ai.a.a(22), ai.a.a(23) };
      a((byte)3, (byte)2, arrayOfObject);
    } 
    return false;
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    byte b = this.b;
    super.a(paramByte1, paramByte2);
    ao ao = n.a();
    if (b instanceof af && paramByte1 == 3) {
      Object[] arrayOfObject;
      switch (paramByte2) {
        case 0:
          if (ao.a(ao.a[this.b])) {
            char[] arrayOfChar = (cj.a.a(3933) + " " + new String(ce.b.a((ao.a[this.b]).f))).toCharArray();
            Object[] arrayOfObject1 = { arrayOfChar };
            a(arrayOfObject1);
            return;
          } 
          arrayOfObject = new Object[] { ai.a.a(27), ai.a.a(28), ai.a.a(29) };
          a(arrayOfObject);
          return;
        case 1:
          this.b = new bn(this, ao.a[this.b]);
          break;
      } 
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += 2;
    paramInt2 += 15;
    ao ao = n.a();
    r.a(paramGraphics, ai.a.a(30), paramInt1 + 5, paramInt2);
    a(paramGraphics, paramInt1, paramInt2, false);
    for (byte b = 0; b < 5; b++) {
      if (ao.a[b] != null)
        paramGraphics.drawImage(ce.b[(ao.a[b]).f], paramInt1 + 15, paramInt2 + 19 + b % 5 * 23, 3); 
    } 
    if (ao.a[this.b] == null) {
      paramGraphics.setColor(14663551);
      bh.a(paramGraphics, paramInt1 + 34, paramInt2 + 18, ai.a.a(31), 1);
      return;
    } 
    p p = ao.a[this.b];
    r.a(paramGraphics, ai.a.a(32), paramInt1 + 89, paramInt2 + 22);
    if (p == ao.a())
      paramGraphics.drawImage(ce.l, paramInt1 + 100, paramInt2 + 26, 36); 
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 34, paramInt2 + 18, ce.b.a((ao.a[this.b]).f), 1);
    paramGraphics.setColor(14663551);
    bh.a(paramGraphics, paramInt1 + 34, paramInt2 + 35, ce.b.a((ao.a[this.b]).f + 6), 1);
    paramGraphics.drawImage((Image)ce.g, paramInt1 + 34, paramInt2 + 53, 20);
    r.c(paramGraphics, p.a, paramInt1 + 50, paramInt2 + 53, 4);
    paramGraphics.drawImage((Image)ce.e, paramInt1 + 34, paramInt2 + 67, 20);
    r.c(paramGraphics, p.a, paramInt1 + 102, paramInt2 + 67, 8);
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(paramInt1 + 34, paramInt2 + 76, 72, 3);
    paramGraphics.setColor(16777215);
    paramGraphics.fillRect(paramInt1 + 35, paramInt2 + 77, p.a * 70 / p.b, 1);
    paramGraphics.drawImage(ce.h, paramInt1 + 38, paramInt2 + 81, 20);
    r.c(paramGraphics, p.b, paramInt1 + 102, paramInt2 + 81, 8);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */