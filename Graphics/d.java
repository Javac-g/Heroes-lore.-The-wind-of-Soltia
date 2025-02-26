package Graphics;

import javax.microedition.lcdui.Graphics;

public final class d extends GraphicParent {
  private byte c = 0;
  
  public d(GraphicParent paramcb) {
    super(paramcb, (byte)4);
  }
  
  public final synchronized boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (this.c != 0)
      return true; 
    if (a(paramInt1, paramInt2, false))
      return true; 
    if (paramInt2 == 53 || paramInt1 == 8) {
      boolean[][] arrayOfBoolean;
      switch (this.b) {
        case 0:
          if (w.c) {
            d();
            break;
          } 
          if (((ae)(arrayOfBoolean = n.a)).a != null) {
            a(new Object[] { ai.a.a(51), ai.a.a(52) });
            break;
          } 
          this.c = 2;
          b();
          break;
        case 1:
          this.b = new bt(this, true);
          break;
        case 2:
          this.b = new be(this, true);
          break;
        case 3:
          d();
          break;
      } 
      return true;
    } 
    return false;
  }
  
  public final void d() {
    if (w.c) {
      Object[] arrayOfObject1 = { bh.a(3919).toCharArray() };
      a((byte)12, (byte)2, arrayOfObject1, bh.j, (char[])bh.c);
      return;
    } 
    Object[] arrayOfObject = { bh.a };
    a((byte)2, (byte)2, arrayOfObject);
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    super.a(paramByte1, paramByte2);
    if (paramByte1 == 12 || paramByte1 == 2) {
      if (w.c) {
        if (paramByte2 == 0) {
          bh.a((String)w.a);
          return;
        } 
        n.a((byte)14, (byte)1);
        bw.f();
        bf.d = true;
        return;
      } 
      if (paramByte2 == 0) {
        n.a((byte)14, (byte)1);
        bw.f();
      } 
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt2 += 15;
    r.a(paramGraphics, ai.a.a(41), paramInt1 + 5, paramInt2);
    boolean bool = false;
    paramInt1 = r.g - 108 >> 1;
    GraphicParent.a(paramGraphics, paramInt1, paramInt2 + 15, 108, ai.a.a(42), (this.b == 0));
    GraphicParent.a(paramGraphics, paramInt1, paramInt2 + 37, 108, ai.a.a(43), (this.b == 1));
    GraphicParent.a(paramGraphics, paramInt1, paramInt2 + 59, 108, ai.a.a(44), (this.b == 2));
    GraphicParent.a(paramGraphics, paramInt1, paramInt2 + 81, 108, ai.a.a(45), (this.b == 3));
    if (this.c == 2) {
      this.c = 1;
      int i = r.i - 55;
      int j = r.j - 11;
      GraphicParent.a(paramGraphics, i, j, 110, 22);
      b(paramGraphics, i, j, 110, 22);
      paramGraphics.setColor(16777215);
      bh.a(paramGraphics, i + 5, j + 5, ai.a.a(53), 1);
      b();
      return;
    } 
    if (this.c == 1) {
      this.c = 0;
      try {
        n.o();
        a(new Object[] { ai.a.a(46) });
        return;
      } catch (Exception exception) {
        a(new Object[] { ai.a.a(47), ai.a.a(48) });
      } 
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */