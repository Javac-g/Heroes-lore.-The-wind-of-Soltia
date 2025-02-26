package Graphics;

import javax.microedition.lcdui.Graphics;

public final class at extends GraphicParent {
  private e a;
  
  private int a;
  
  private byte c;
  
  private byte d;
  
  private boolean c;
  
  public at(GraphicParent paramcb) {
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
        if ((arrayOfByte = ao.a.a(false, (byte)0)).length > 0) {
          this.b = new m(this, arrayOfByte, this.b, Second.a.a(3));
        } else {
          a(new Object[] { cj.a.a(3936).toCharArray() });
        } 
      } else if (this.b == 1) {
        int i = ao.a.a((byte)11, (byte)0);
        byte b = ao.a.a((byte)11, (byte)0);
        if (this.a == null) {
          a(new Object[] { Second.a.a(3) });
        } else if (this.a.e >= this.a.d) {
          a(new Object[] { Second.a.a(6), Second.a.a(7) });
        } else if (b < 0 || i < this.c) {
          a(new Object[] { Second.a.a(5) });
        } else if (((g)ao.a).a < this.a) {
          a(new Object[] { Second.a.a(8) });
        } else {
          a((byte)2, (byte)2, new Object[] { Second.a.a(9) });
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
      ao ao;
      x.a(((ao = n.a()).a.a((byte)11, (byte)0) != -1));
      ao.a.a((byte)11, (byte)0, this.c);
      ((g)ao.a).a -= this.a;
      if (100 * (this.a.d - this.a.e) / this.a.d + 30 < h.a(1, 100)) {
        this.d = 2;
        this.c = false;
      } else {
        this.d = 2;
        this.c = true;
      } 
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
      if (!(e1 = (e)ad).b) {
        a(new Object[] { Second.a.a(11), Second.a.a(12) });
        return;
      } 
      this.a = (e)ad;
      this.a = this.a.e * 100;
      this.c = (byte)(this.a.e + 1);
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
    bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 11, Second.a.a(14), 1);
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 30, this.a, (byte)1, Second.a.a(15), (this.b == 0));
    GraphicParent.a(paramGraphics, paramInt1 + 155 - 8, paramInt2 + 65, ((g)ao.a).a);
    GraphicParent.b(paramGraphics, paramInt1 + 4, paramInt2 + 73, 147, 38, 10452863);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 8, paramInt2 + 80, Second.a.a(16), 1);
    if (this.a != null) {
      GraphicParent.a(paramGraphics, paramInt1 + 155 - 8, paramInt2 + 80, this.a);
      char[] arrayOfChar = h.a(Second.a.a(17), (" : " + this.c + "개").toCharArray());
      bh.a(paramGraphics, paramInt1 + 8, paramInt2 + 93, arrayOfChar, 1);
    } 
    if (this.d == 2) {
      this.d = 1;
      int j = r.i - 55;
      int k = r.j - 11;
      GraphicParent.a(paramGraphics, j, k, 110, 22);
      GraphicParent.b(paramGraphics, j, k, 110, 22);
      paramGraphics.setColor(16777215);
      bh.a(paramGraphics, j + 5, k + 5, Second.a.a(28), 1);
      super.a = 1;
    } else if (this.d == 1) {
      this.d = 0;
      try {
        Thread.sleep(500L);
        if (this.c) {
          Thread.sleep(1000L);
          this.a.e = (byte)(this.a.e + 1);
          byte[] arrayOfByte = { ao.a(this.a) };
          this.b = new m(this, arrayOfByte, (byte)10, Second.a.a(10));
          this.a = this.a.e * 100;
          this.c = (byte)(this.a.e + 1);
        } else {
          (n.a()).a.a(this.a, (byte)1);
          this.a = null;
          n.o();
          a(new Object[] { Second.a.a(26), Second.a.a(29) });
        } 
      } catch (Exception exception) {}
    } 
    int i = bh.a(155, 80);
    GraphicParent.a(paramGraphics, paramInt1 + (155 - i >> 1), paramInt2 + 138, i, Second.a.a(18), (this.b == 1));
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/at.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */