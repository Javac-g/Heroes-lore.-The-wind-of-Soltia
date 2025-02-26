package Graphics;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class aw extends f {
  public static final byte[] h = new byte[] { 
      -1, 3, 4, 11, 9, 3, 3, -1, 8, -1, 
      -1 };
  
  private Image[] a;
  
  private byte[] i;
  
  private byte a;
  
  private short c;
  
  public aw(byte paramByte) {
    this(paramByte, (short)h[paramByte], (short)0);
  }
  
  public aw(byte paramByte, short paramShort1, short paramShort2) {
    super(paramShort1);
    this.a = paramByte;
    this.c = paramShort2;
    a();
  }
  
  private final void a() {
    switch (this.a) {
      case 1:
        this.a = ce.s;
        return;
      case 5:
        this.a = ce.t;
        return;
      case 6:
        this.a = ce.u;
        return;
      case 4:
        this.i = (byte[])ce.h;
        return;
      case 9:
        this.i = (byte[])ce.f[this.c];
        super.a = (short)this.i[0];
        return;
      case 10:
        this.a = ce.w;
        break;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool;
    switch (this.a) {
      case 2:
        paramGraphics.drawImage(ce.t, paramInt1, paramInt2 - 30 - this.b * 4, 17);
        break;
      case 3:
        if (this.b % 4 < 3)
          paramGraphics.drawImage(ce.s, paramInt1, paramInt2 + 5, 33); 
        break;
      case 4:
      case 9:
        as.b(paramGraphics, this.i, (byte)this.b, paramInt1, paramInt2);
        break;
      case 7:
        if (this.b < 2) {
          bool = (this.c < 0) ? true : true;
        } else {
          bool = (this.c < 0) ? true : true;
        } 
        r.a(paramGraphics, (this.c < 0) ? -this.c : this.c, paramInt1 + 1, paramInt2 - 30 - this.b * 4, 1, bool);
        break;
      case 1:
        if (this.b == 0) {
          paramInt2 -= 10;
          paramInt1 -= 3;
        } else if (this.b == 1) {
          paramInt2 -= 8;
        } 
        paramGraphics.drawImage(this.a[this.b], paramInt1, paramInt2 + 3, 33);
        break;
      case 5:
        if (this.b == 2)
          paramInt2 -= 5; 
        paramGraphics.drawImage(this.a[this.b], paramInt1, paramInt2 + 3, 33);
        break;
      case 6:
        if (this.b == 1) {
          paramInt2 -= 2;
        } else if (this.b == 2) {
          paramInt2 -= 6;
        } 
        paramGraphics.drawImage(this.a[this.b], paramInt1, paramInt2 + 3, 33);
        break;
      case 10:
        if (this.c != 8 && this.c != 9)
          paramGraphics.drawImage(ce.D, paramInt1, paramInt2 - 40, 17); 
        paramGraphics.drawImage(this.a[this.c], paramInt1, paramInt2 - 39 + this.b % 2, 17);
        break;
      default:
        paramGraphics.drawImage(this.a[this.b], paramInt1, paramInt2 + 3, 33);
        break;
    } 
    this.b = (short)(this.b + 1);
    if (this.b >= super.a && super.a != -1)
      super.a = true; 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/aw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */