package Graphics;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class y extends ck {
  private static final short[] a = new short[] { 
      -1, 4, 8, 6, 10, 11, 7, 9, 6, 4, 
      3 };
  
  private static final byte[] i = new byte[] { 
      -1, 0, -1, -1, 0, 0, 1, 0, 1, 1, 
      -1 };
  
  public short a;
  
  public short b;
  
  private byte f;
  
  private Image[] a;
  
  public byte[] h;
  
  public y(short paramShort1, short paramShort2, byte paramByte) {
    super(paramShort1, paramShort2, (byte)8, (byte)9);
    this.a = (Image[])a[paramByte];
    this.b = 0;
    this.f = paramByte;
    this.a = (Image[])ce.a[12];
    if (i[paramByte] != -1)
      this.h = (byte[])ce.d[i[paramByte]]; 
  }
  
  public y(byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte) {
    super((short)(paramByte1 << 4), (short)(paramByte2 << 4), (byte)8, (byte)9);
    this.a = (short)paramArrayOfbyte[0];
    this.b = 0;
    this.f = 100;
    this.h = paramArrayOfbyte;
  }
  
  public void a() {}
  
  public boolean a() {
    return (this.b >= this.a);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    n.a.c(this);
    int i = paramInt1 + this.c + this.c;
    int j = paramInt2 + this.d + this.d;
    switch (this.f) {
      case 2:
        c(paramGraphics, i, j);
        break;
      case 4:
        a(paramGraphics, i, j, a[4], this.a[8]);
        break;
      case 5:
        a(paramGraphics, i, j, a[5], this.a[11]);
        break;
      case 7:
        a(paramGraphics, i, j, a[7], this.a[11]);
        break;
      case 1:
      case 6:
      case 8:
      case 9:
      case 100:
        b(paramGraphics, i, j);
        break;
      case 10:
        d(paramGraphics, i, j);
        break;
    } 
    this.b = (short)(this.b + 1);
    if (a())
      n.a.a(this); 
  }
  
  private void c(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.b >= 0 && this.b < this.a)
      as.b(paramGraphics, ce.m, (byte)this.b, paramInt1, paramInt2); 
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, Image paramImage) {
    if (this.b >= paramInt3)
      return; 
    int i = paramImage.getHeight();
    switch (this.b) {
      case 0:
        i = i * 7 / 10;
        as.a(paramGraphics, paramInt1 - 20, paramInt2 - 50, 40, 50);
        paramGraphics.drawImage(paramImage, paramInt1, paramInt2 + i, 33);
        paramGraphics.setClip(0, 0, as.a, as.b);
        return;
      case 1:
        i = i * 5 / 10;
        as.a(paramGraphics, paramInt1 - 20, paramInt2 - 50, 40, 50);
        paramGraphics.drawImage(paramImage, paramInt1, paramInt2 + i, 33);
        paramGraphics.setClip(0, 0, as.a, as.b);
        return;
      case 2:
        i = i * 3 / 10;
        as.a(paramGraphics, paramInt1 - 20, paramInt2 - 50, 40, 50);
        paramGraphics.drawImage(paramImage, paramInt1, paramInt2 + i, 33);
        paramGraphics.setClip(0, 0, as.a, as.b);
        return;
    } 
    as.b(paramGraphics, this.h, (byte)(this.b - 3), paramInt1, paramInt2);
  }
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.b >= 0 && this.b < this.a)
      as.b(paramGraphics, this.h, (byte)this.b, paramInt1, paramInt2); 
  }
  
  private void d(Graphics paramGraphics, int paramInt1, int paramInt2) {
    switch (this.b) {
      case 0:
        paramGraphics.drawImage(this.a[0], paramInt1, paramInt2, 33);
        return;
      case 1:
        paramGraphics.drawImage(this.a[0], paramInt1, paramInt2, 33);
        paramGraphics.drawImage(this.a[1], paramInt1, paramInt2 + 3, 33);
        return;
      case 2:
        paramGraphics.drawImage(this.a[1], paramInt1, paramInt2 + 3, 33);
        break;
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/y.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */