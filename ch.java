import javax.microedition.lcdui.Graphics;

public final class ch extends GraphicParent {
  private e a;
  
  public ch(GraphicParent paramcb) {
    super(paramcb, (byte)2);
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
        if ((arrayOfByte = ao.a(false, (byte)-1)).length == 0) {
          a(new Object[] { cj.a.a(3935).toCharArray() });
        } else {
          this.b = new m(this, arrayOfByte, this.b, Second.a.a(3));
        } 
      } else if (this.b == 1) {
        if (this.a == null) {
          a(new Object[] { Second.a.a(3) });
        } else if (((g)ao.a).a < 100) {
          a(new Object[] { Second.a.a(8) });
        } else {
          a((byte)2, (byte)2, new Object[] { Second.a.a(19) });
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
      this.a.b = true;
      ((g)ao.a).a -= 100;
      byte[] arrayOfByte = { ao.a(this.a) };
      this.b = new m(this, arrayOfByte, (byte)10, Second.a.a(20));
      this.a = null;
      return;
    } 
    if (b instanceof m && paramByte1 == 0) {
      ad ad;
      if (paramByte2 >= 100) {
        ad = n.a().a(paramByte2 - 100);
      } else {
        ad = (n.a()).a.a(paramByte2);
      } 
      x.a(ad instanceof e);
      e e1;
      if ((e1 = (e)ad).b) {
        a(new Object[] { Second.a.a(21) });
        return;
      } 
      this.a = e1;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    ao ao = n.a();
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(paramInt1, paramInt2, 155, 170);
    GraphicParent.c(paramGraphics, paramInt1 + 2, paramInt2 + 4, 151, 162);
    r.a(paramGraphics, Second.a.a(13), paramInt1 + 3, paramInt2 - 2);
    GraphicParent.b(paramGraphics, paramInt1 + 3, paramInt2 + 7, 149, 17, 10452863);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 10, Second.a.a(23), 1);
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 30, this.a, (byte)1, Second.a.a(15), (this.b == 0));
    GraphicParent.a(paramGraphics, paramInt1 + 155 - 10, paramInt2 + 75, ((g)ao.a).a);
    GraphicParent.b(paramGraphics, paramInt1 + 4, paramInt2 + 83, 147, 20, 10452863);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 8, paramInt2 + 88, Second.a.a(24), 1);
    GraphicParent.a(paramGraphics, paramInt1 + 155 - 8, paramInt2 + 89, 100);
    int i = bh.a(155, 80);
    GraphicParent.a(paramGraphics, paramInt1 + (155 - i >> 1), paramInt2 + 138, i, Second.a.a(25), (this.b == 1));
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ch.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */