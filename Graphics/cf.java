package Graphics;

import javax.microedition.lcdui.Graphics;

public final class cf extends f {
  public byte a;
  
  private static final short[] a = new short[] { 40, 40, 40, 40, 40, 140, 160, 80 };
  
  public cf(byte paramByte) {
    super(a[paramByte]);
    this.a = paramByte;
  }
  
  public final void a() {
    this.b = (short)(this.b + 1);
    if (this.b >= super.a)
      super.a = true; 
  }
  
  public final void b() {
    super.a = true;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.drawImage(ce.D, paramInt1, paramInt2 - 30, 17);
    paramGraphics.drawImage(ce.v[this.a], paramInt1, paramInt2 - 29 + this.b % 2, 17);
  }
  
  public final void c() {
    this.b = 0;
  }
  
  public final short a() {
    return this.b;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/cf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */