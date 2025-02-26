package Graphics;

import javax.microedition.lcdui.Graphics;

public final class ba extends av {
  private byte v;
  
  public ba(ae paramae, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    super(paramByte1, (byte)(paramByte2 + 5), paramByte3, paramByte4, (byte)2);
    paramae.a[paramByte2 + 5][paramByte1] = null;
    paramae.a[paramByte2 + 5][paramByte1 + 1] = null;
    this.a.h = 2;
    this.v = 0;
  }
  
  public final void d() {
    this.k = (byte)(this.k + 1);
    this.v = (byte)(this.v + 1);
    if (this.v > 100)
      this.a.h = 0; 
    n();
    if (this.h == 2) {
      switch (this.i) {
        case 1:
          this.d = (short)(this.d - 8);
          break;
        case 2:
          this.d = (short)(this.d + 8);
          break;
      } 
      b();
    } 
    o();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    byte b = this.j;
    this.j = 1;
    paramInt2 -= 80;
    super.a(paramGraphics, paramInt1, paramInt2);
    this.j = b;
  }
  
  public final void i() {
    ao ao;
    int i = (ao = n.a()).b - this.b - 5 + 3;
    if (this.p == 0 && i >= -2 && i <= 3 && ao.a <= this.a + 5) {
      q();
      return;
    } 
    if (this.o == 0) {
      if (i > 3) {
        a((byte)2);
        b((byte)2);
        return;
      } 
      if (i < -2) {
        a((byte)2);
        b((byte)1);
        return;
      } 
      a((byte)1);
      b((byte)2);
    } 
  }
  
  public final void j() {
    ao ao = n.a();
    if (this.k == 6) {
      ((ae)n.a).e = 2;
      ((ae)n.a).f = 3;
    } else if (this.k == 7) {
      ((ae)n.a).e = -3;
      ((ae)n.a).f = -1;
    } else if (this.k == 8) {
      ((ae)n.a).e = 2;
      ((ae)n.a).f = -3;
    } 
    if (this.k == 5) {
      byte b1 = (byte)(this.a + 2);
      byte b2 = (byte)(this.a + 5);
      byte b3 = (byte)(this.b - 5 + 1);
      byte b4 = (byte)(this.b - 5 + 6);
      if (ao.a >= b1 && ao.a <= b2 && ao.b >= b3 && ao.b <= b4) {
        ao.a(this, (byte)2);
        this.v = 0;
        this.a.h = 2;
      } 
    } 
  }
  
  public final void m() {
    this.q = 0;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ba.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */