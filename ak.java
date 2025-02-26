import javax.microedition.lcdui.Graphics;

public final class ak extends av {
  private byte v;
  
  private byte w = 2;
  
  public ak(ae paramae, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    super(paramByte1, (byte)(paramByte2 + 4), paramByte3, paramByte4, (byte)1);
    paramae.a[paramByte2 + 4][paramByte1] = null;
    paramae.a[paramByte2 + 4][paramByte1 + 1] = null;
    this.a.h = 2;
    this.v = 0;
  }
  
  public final void d() {
    this.k = (byte)(this.k + 1);
    this.v = (byte)(this.v + 1);
    if (this.v > 100)
      this.a.h = 0; 
    if (this.h == 3) {
      byte[] arrayOfByte = (byte[])ce.h[this.n * 16 + 12 + this.j - 1];
      if (this.k >= arrayOfByte[0]) {
        a(false);
        i();
      } 
    } else {
      n();
    } 
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
    if (this.h != 3)
      this.j = 1; 
    paramInt2 -= 64;
    super.a(paramGraphics, paramInt1, paramInt2);
    this.j = b;
  }
  
  public final void i() {
    ao ao;
    int i = (ao = n.a()).b - this.b - 4 + 2;
    if (this.p == 0 && i >= -1 && i <= 2 && ao.a >= this.a - 7) {
      q();
      this.w = u.g[this.w];
      b(this.w);
      return;
    } 
    if (this.o == 0) {
      if (i > 2) {
        a((byte)2);
        b((byte)2);
        return;
      } 
      if (i < -1) {
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
    if (this.k == 5 && this.w == 1) {
      byte b1 = (byte)(this.a - 7);
      byte b2 = (byte)(this.a - 1);
      byte b3 = (byte)(this.b - 4 + 1);
      byte b4 = (byte)(this.b - 4 + 4);
      if (ao.a >= b1 && ao.a <= b2 && ao.b >= b3 && ao.b <= b4)
        ao.a(this, (byte)3); 
      return;
    } 
    if (this.k == 8 && this.w == 2) {
      byte b1 = (byte)(this.a - 5);
      byte b2 = (byte)(this.a - 1);
      byte b3 = (byte)(this.b - 4 + 1);
      byte b4 = (byte)(this.b - 4 + 4);
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


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ak.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */