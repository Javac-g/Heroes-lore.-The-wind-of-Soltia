import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class aj extends ck {
  public Image a;
  
  private short a;
  
  private short b;
  
  private short e;
  
  public aj(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2, Image paramImage) {
    super(paramShort1, paramShort2, paramByte1, paramByte2);
    this.a = paramImage;
    if (paramImage != null) {
      this.a = (short)-(paramImage.getWidth() >> 1);
      this.b = (short)(as.a + (paramImage.getWidth() >> 1));
      this.e = (short)(as.b + paramImage.getHeight());
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = paramInt1 + this.c + this.c;
    int j = paramInt2 + this.d + this.d;
    if (i < this.a || i > this.b || j < 0 || j > this.e)
      return; 
    paramGraphics.drawImage(this.a, i, j, 33);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/aj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */