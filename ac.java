import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ac extends o {
  public byte f;
  
  public byte g;
  
  public boolean d;
  
  public ac(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2) {
    super(paramShort1, paramShort2, (byte)8, (byte)8);
    this.f = paramByte1;
    this.d = true;
    this.g = paramByte2;
  }
  
  public final void a(short paramShort1, short paramShort2) {
    f();
    super.a(paramShort1, paramShort2);
    b();
    if (this.h == 1)
      g(); 
  }
  
  public final void a(int paramInt) {
    f();
    this.c = (short)(this.c + paramInt * u.a[this.i]);
    super.d = (short)(super.d + paramInt * u.b[this.i]);
    b();
    if (this.h == 1)
      g(); 
  }
  
  public final boolean a() {
    return (this.a != null || this.b != null) ? false : false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.d)
      return; 
    int i = paramInt1 + this.c + this.c;
    int j = paramInt2 + super.d + super.d;
    if (i + 16 < 0 || j < 0 || i - 16 > as.a || j > as.b + 32)
      return; 
    paramGraphics.drawImage(ce.u, i, j - 3, 17);
    if (this.f >= 18) {
      paramGraphics.drawImage((Image)ce.g[this.f - 18], i, j, 33);
    } else {
      int k = 0;
      if (this.h == 2) {
        k = this.g * 12 + 4 + this.j - 1;
      } else {
        k = this.g * 12 + 0 + this.j - 1;
      } 
      as.b(paramGraphics, (byte[])ce.j[k], this.k, i, j);
      this.k = (byte)(this.k + 1);
      if (this.h == 1 && ce.i[this.g] <= this.k) {
        this.k = 0;
      } else if (this.h == 2 && ce.j[this.g] <= this.k) {
        this.k = 0;
      } 
    } 
    b(paramGraphics, i, j);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ac.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */