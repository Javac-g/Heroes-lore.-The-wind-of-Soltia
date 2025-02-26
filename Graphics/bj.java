package Graphics;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bj extends f {
  private byte a;
  
  private byte b;
  
  private short c;
  
  private Image[] a;
  
  private Image[] b;
  
  private Object[] a;
  
  public bj(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2) {
    super(paramShort2);
    this.c = paramShort1;
    this.b = paramByte1;
    this.a = paramByte2;
    this.a = (Object[])new Image[2];
    Image[] arrayOfImage = (Image[])ce.a[12];
    this.a[0] = arrayOfImage[0];
    this.a[1] = arrayOfImage[1];
    this.b = (Image[])ce.a[12];
    this.a = (Object[])ce.d;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.c > 0) {
      this.c = (short)(this.c - 1);
      return;
    } 
    if (this.b == null && this.a == null) {
      switch (super.b) {
        case 0:
          paramGraphics.drawImage(this.b[7], paramInt1, paramInt2, 33);
          break;
        case 1:
          paramGraphics.drawImage(this.b[8], paramInt1, paramInt2 - 1, 33);
          break;
        case 2:
          paramGraphics.drawImage(this.b[7], paramInt1, paramInt2 - 2, 33);
          break;
        case 3:
          paramGraphics.drawImage(this.b[8], paramInt1, paramInt2 - 3, 33);
          break;
        case 4:
        case 5:
          paramGraphics.drawImage(this.b[9], paramInt1, paramInt2 - 4, 33);
          break;
      } 
    } else if ((this.b == null && this.a == 2) || (this.b == true && this.a == 2)) {
      switch (super.b % 4) {
        case 1:
          paramGraphics.drawImage((Image)this.a[0], paramInt1, paramInt2 + 9, 33);
          break;
        case 2:
          paramGraphics.drawImage((Image)this.a[0], paramInt1, paramInt2 + 9, 33);
          paramGraphics.drawImage((Image)this.a[1], paramInt1, paramInt2 + 12, 33);
          break;
        case 3:
          paramGraphics.drawImage((Image)this.a[1], paramInt1, paramInt2 + 12, 33);
          break;
      } 
    } else {
      as.b(paramGraphics, (byte[])this.a[this.a], (byte)super.b, paramInt1, paramInt2);
    } 
    super.b = (short)(super.b + 1);
    if (super.b >= super.a)
      super.a = true; 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */