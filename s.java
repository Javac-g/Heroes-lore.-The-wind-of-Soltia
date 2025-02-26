import javax.microedition.lcdui.Graphics;

public final class s extends GraphicParent {
  private byte[] h;
  
  private byte c;
  
  private byte d;
  
  private char[] a;
  
  private char[] b;
  
  public s(GraphicParent paramcb) {
    super(paramcb, (byte)0);
    int i = (n.a[n.a - 6]).length;
    byte b = 0;
    this.h = new byte[i * 2];
    byte b1;
    for (b1 = 0; b1 < i; b1 = (byte)(b1 + 1)) {
      if (!n.b(1 + b1 * 3 + 1))
        if (n.b(1 + b1 * 3 + 2)) {
          if (n.b(1 + b1 * 3) && (ce.f.a(b1 * 7 + 2)).length > 0) {
            this.h[b++] = b1;
            this.h[b++] = 2;
          } 
        } else if (n.b(1 + b1 * 3) && (ce.f.a(b1 * 7)).length > 0) {
          this.h[b++] = b1;
          this.h[b++] = 0;
        }  
    } 
    super.a = (byte)(b / 2);
    d();
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (c(paramInt1, paramInt2)) {
      super.a.a = 1;
      d();
      return true;
    } 
    if (paramInt2 == 53 || paramInt1 == 8) {
      if (super.a > 0)
        super.b = new am(this, this.a, this.b, (byte)0); 
      return true;
    } 
    return false;
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    super.a(paramByte1, paramByte2);
    if (paramByte1 == 0 && paramByte2 == 1)
      super.b = new am(this, ai.a.a(54), ce.f.a(this.c * 7 + 6), (byte)1); 
  }
  
  private final void d() {
    this.c = this.h[super.b * 2];
    this.d = this.h[super.b * 2 + 1];
    if (this.d == 2) {
      int j = this.c * 7 + 2;
      this.a = ce.f.a(j);
      this.b = ce.f.a(j + 1);
      return;
    } 
    int i = this.c * 7 + 0;
    this.a = ce.f.a(i);
    this.b = ce.f.a(i + 1);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += 2;
    paramInt2 += 15;
    r.a(paramGraphics, ai.a.a(39), paramInt1 + 5, paramInt2);
    if (super.a > 0) {
      a(paramGraphics, paramInt1, paramInt2, true);
      int i;
      for (i = c(); i <= d(); i++)
        paramGraphics.drawImage(ce.d[18], paramInt1 + 13, paramInt2 + 18 + 23 * i % 5, 3); 
      i = paramInt2 + 14;
      paramGraphics.setColor(16777215);
      bh.a(paramGraphics, paramInt1 + 33, i, 105, 1, this.a);
      i += bh.a(this.a, 105) * 15;
      paramGraphics.setColor(14663551);
      bh.a(paramGraphics, paramInt1 + 33, i, n.a[n.a - 6][this.c] ? ai.a.a(55) : ai.a.a(56), 1);
      i += 15;
      bh.a(paramGraphics, paramInt1 + 33, i, ai.a.a(57), 1);
      i += 15;
      if ((ce.f.a(this.c * 7 + 4)).length > 0) {
        paramGraphics.setColor(16777215);
        bh.a(paramGraphics, paramInt1 + 33, i, ce.f.a(this.c * 7 + 4), 1);
        i += 15;
      } 
      if ((ce.f.a(this.c * 7 + 5)).length > 0) {
        paramGraphics.setColor(16777215);
        bh.a(paramGraphics, paramInt1 + 33, i, ce.f.a(this.c * 7 + 5), 1);
      } 
      return;
    } 
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 10, 143, 137, 4136767, 10452799, 4144959);
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 10, 143, 137, 6242111);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 10, paramInt2 + 15, 96, 1, ai.a.a(58));
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */