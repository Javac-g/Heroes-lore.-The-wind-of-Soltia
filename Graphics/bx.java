package Graphics;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bx extends GraphicParent {
  private char[] a;
  
  private char[] b;
  
  private boolean c;
  
  private short[] a;
  
  public bx(bt parambt, char[] paramArrayOfchar1, boolean paramBoolean, char[] paramArrayOfchar2) {
    super(parambt, (byte)1);
    this.a = (short[])paramArrayOfchar1;
    this.b = paramArrayOfchar2;
    this.c = paramBoolean;
    short[] arrayOfShort = new short[20];
    int i = 0;
    byte b = 0;
    while (i < paramArrayOfchar1.length) {
      arrayOfShort[b++] = (short)i;
      i += bh.a(paramArrayOfchar1, i, 130, 11);
    } 
    this.a = new short[b];
    System.arraycopy(arrayOfShort, 0, this.a, 0, this.a.length);
    super.a = (byte)this.a.length;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokevirtual b : (II)Z
    //   6: ifeq -> 11
    //   9: iconst_1
    //   10: ireturn
    //   11: aload_0
    //   12: iload_1
    //   13: iload_2
    //   14: invokevirtual c : (II)Z
    //   17: ifeq -> 22
    //   20: iconst_1
    //   21: ireturn
    //   22: iload_2
    //   23: bipush #-8
    //   25: if_icmpne -> 39
    //   28: aload_0
    //   29: getfield a : Lcb;
    //   32: iconst_m1
    //   33: iconst_m1
    //   34: invokevirtual a : (BB)V
    //   37: iconst_1
    //   38: ireturn
    //   39: iconst_1
    //   40: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool = false;
    if (this.c) {
      paramInt1 += 2;
      paramInt2 += 15;
      GraphicParent.b(paramGraphics, paramInt1 + 4, paramInt2 + 10, 143, 139);
      paramInt1 += 8;
      paramInt2 += 25;
      paramGraphics.setColor(16777215);
      bh.a(paramGraphics, bh.m, (char[])bh.e);
    } else {
      paramGraphics.setColor(4136767);
      paramGraphics.fillRect(0, 0, r.g, r.h);
      bf.c(paramGraphics, paramInt1, paramInt2);
      bh.a(true);
      paramGraphics.setColor(0);
      bh.a(paramGraphics, paramInt1 + 155 >> 1, paramInt2 + 5 + 4, this.b, 1);
      bh.a(false);
      bf.b(paramGraphics, paramInt1, paramInt2 + 24, 3);
      paramInt1 += 10;
      paramInt2 += 43;
      paramGraphics.setColor(6242111);
      bh.a(paramGraphics, (char[])null, (char[])bh.e);
    } 
    r.d(paramGraphics, paramInt1 + 155 - 25, paramInt2 - 8, super.b + 1, super.a);
    if (super.a > 1) {
      if (super.b > 0)
        paramGraphics.drawImage(ce.k, paramInt1 + 62, paramInt2 - 6, 20); 
      if (super.b < super.a - 1)
        paramGraphics.drawImage((Image)ce.n, paramInt1 + 62, paramInt2 + 114, 20); 
    } 
    short s1 = this.a[super.b];
    short s2 = (super.b == super.a - 1) ? (short)this.a.length : this.a[super.b + 1];
    if (this.a[0] == 33 && s1 == 0)
      s1 = 1; 
    if (this.c) {
      paramGraphics.setColor(16777215);
    } else {
      paramGraphics.setColor(0);
    } 
    bh.a(paramGraphics, paramInt1, paramInt2 + 3, 130, 1, (char[])this.a, s1, 0, s2 - s1);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */