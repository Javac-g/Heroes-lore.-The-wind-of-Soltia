import javax.microedition.lcdui.Graphics;

public final class ap extends GraphicParent {
  private t a;
  
  private ad a;
  
  public ap(GraphicParent paramcb) {
    super(paramcb, (byte)3);
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (c(paramInt1, paramInt2))
      return true; 
    if (paramInt2 == 53 || paramInt1 == 8) {
      ao ao = n.a();
      if (this.b == 0) {
        byte[] arrayOfByte;
        x.a(((arrayOfByte = ao.a(true, (byte)1)).length > 0));
        this.b = new m(this, arrayOfByte, this.b, ax.a.a(3));
      } else if (this.b == 1) {
        byte[] arrayOfByte;
        if ((arrayOfByte = ao.a.a((byte)17)).length > 0) {
          this.b = new m(this, arrayOfByte, this.b, ax.a.a(4));
        } else {
          Object[] arrayOfObject = { ax.a.a(5) };
          a(arrayOfObject);
        } 
      } else if (this.b == 2) {
        if (this.a == null) {
          Object[] arrayOfObject = { ax.a.a(6) };
          a(arrayOfObject);
        } else if (this.a == null) {
          Object[] arrayOfObject = { ax.a.a(7) };
          a(arrayOfObject);
        } else if (((g)ao.a).a < 500) {
          Object[] arrayOfObject = { ax.a.a(8) };
          a(arrayOfObject);
        } else {
          Object[] arrayOfObject = { ax.a.a(9) };
          a((byte)2, (byte)2, arrayOfObject);
        } 
      } 
      return true;
    } 
    return false;
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    byte b = this.b;
    super.a(paramByte1, paramByte2);
    if (b instanceof af && paramByte1 == 2 && paramByte2 == 0) {
      ao ao = n.a();
      ((t)this.a).c = this.a.g;
      ((g)ao.a).a -= 500;
      ao.a.a(this.a, (byte)1);
      byte[] arrayOfByte = { ao.a(this.a) };
      this.b = new m(this, arrayOfByte, (byte)10, ax.a.a(10));
      this.a = null;
      this.a = null;
      return;
    } 
    if (b instanceof m && (paramByte1 == 0 || paramByte1 == 1)) {
      ad ad1;
      if (paramByte2 >= 100) {
        ad1 = n.a().a(paramByte2 - 100);
      } else {
        ad1 = (n.a()).a.a(paramByte2);
      } 
      if (paramByte1 == 0) {
        x.a(ad1 instanceof t);
        t t1;
        if (!(t1 = (t)ad1).b) {
          Object[] arrayOfObject = { ax.a.a(11), ax.a.a(13) };
          a(arrayOfObject);
        } else if (t1.c != -1) {
          Object[] arrayOfObject = { ax.a.a(12), ax.a.a(13) };
          a(arrayOfObject);
        } else {
          this.a = ad1;
        } 
        return;
      } 
      x.a((ad1.f == 17));
      this.a = ad1;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(paramInt1, paramInt2, 155, 170);
    GraphicParent.c(paramGraphics, paramInt1 + 2, paramInt2 + 4, 151, 162);
    r.a(paramGraphics, ax.a.a(14), paramInt1 + 3, paramInt2 - 2);
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 9, this.a, (byte)1, ax.a.a(15), (this.b == 0));
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 9 + 36, this.a, (byte)2, ax.a.a(16), (this.b == 1));
    GraphicParent.b(paramGraphics, paramInt1 + 4, paramInt2 + 9 + 72, 147, 31, 12558207);
    if (this.a != null && this.a != null) {
      paramGraphics.setColor(16777215);
      int j = (j = (j = paramInt1 + 6) + 2 + bh.a(paramGraphics, j, paramInt2 + 9 + 72 + 4, t.a.a(this.a.g), 1)) + 2 + bh.a(paramGraphics, j, paramInt2 + 9 + 72 + 4, ax.a.a(17), 1);
      bh.a(paramGraphics, j, paramInt2 + 9 + 72 + 4, ax.a.a(18), 1);
      GraphicParent.a(paramGraphics, paramInt1 + 155 - 10, paramInt2 + 9 + 72 + 5, 500);
      GraphicParent.a(paramGraphics, paramInt1 + 155 - 10, paramInt2 + 9 + 72 + 20, ((g)(n.a()).a).a);
    } 
    int i = bh.a(155, 80);
    GraphicParent.a(paramGraphics, paramInt1 + (155 - i >> 1), paramInt2 + 138, i, ax.a.a(19), (this.b == 2));
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ap.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */