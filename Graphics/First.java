package Graphics;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class First extends GraphicParent {
  private byte[] paramArrayOfbyte;
  
  private byte one;
  
  public First(bf parambf, byte[] paramArrayOfbyte) {
    super(parambf, (byte)(paramArrayOfbyte.length / 4));
    this.paramArrayOfbyte = paramArrayOfbyte;
    this.one = 0;
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
    //   12: getfield a : B
    //   15: iconst_1
    //   16: if_icmple -> 35
    //   19: aload_0
    //   20: iload_1
    //   21: iload_2
    //   22: invokevirtual c : (II)Z
    //   25: ifeq -> 35
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield c : B
    //   33: iconst_1
    //   34: ireturn
    //   35: iload_2
    //   36: bipush #53
    //   38: if_icmpeq -> 47
    //   41: iload_1
    //   42: bipush #8
    //   44: if_icmpne -> 100
    //   47: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   50: new java/lang/StringBuffer
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: ldc 'continue game with '
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   62: aload_0
    //   63: getfield h : [B
    //   66: aload_0
    //   67: getfield b : B
    //   70: iconst_4
    //   71: imul
    //   72: baload
    //   73: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   76: invokevirtual toString : ()Ljava/lang/String;
    //   79: invokevirtual println : (Ljava/lang/String;)V
    //   82: iconst_1
    //   83: aload_0
    //   84: getfield h : [B
    //   87: aload_0
    //   88: getfield b : B
    //   91: iconst_4
    //   92: imul
    //   93: baload
    //   94: aconst_null
    //   95: invokestatic a : (ZB[Z)V
    //   98: iconst_1
    //   99: ireturn
    //   100: iload_2
    //   101: bipush #-8
    //   103: if_icmpne -> 117
    //   106: aload_0
    //   107: getfield a : Lcb;
    //   110: iconst_m1
    //   111: iconst_m1
    //   112: invokevirtual a : (BB)V
    //   115: iconst_1
    //   116: ireturn
    //   117: iconst_1
    //   118: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(0, 0, r.g, r.h);
    bf.c(paramGraphics, paramInt1, paramInt2);
    bh.a(paramGraphics, 3, r.g >> 1, paramInt2 + 5);
    bf.b(paramGraphics, paramInt1, paramInt2 + 24, 3);
    paramInt2 += 5;
    paramInt1 += 10;
    byte b;
    for (b = 0; b < 5; b++)
      paramGraphics.drawImage(ce.l[19], paramInt1 + 13, paramInt2 + 49 + b * 16, 20); 
    switch (this.c) {
      case 0:
        paramGraphics.drawImage(ce.l[14], paramInt1 + 5, paramInt2 + 31 + this.b * 16, 20);
        break;
      case 1:
        paramGraphics.drawImage(ce.l[16], paramInt1 + 5, paramInt2 + 31 + this.b * 16, 20);
        break;
      default:
        paramGraphics.drawImage(ce.l[18], paramInt1 + 5, paramInt2 + 31 + this.b * 16, 20);
        break;
    } 
    if (this.c < 2) {
      this.a = 1;
      this.c = (byte)(this.c + 1);
    } 
    for (b = 0; b < this.a; b = (byte)(b + 1)) {
      if (this.b == b) {
        paramGraphics.setColor(16777215);
      } else {
        paramGraphics.setColor(10452863);
      } 
      bh.a(paramGraphics, paramInt1 + 21, paramInt2 + 36 + b * 16, ce.a.a(this.h[b * 4] - 6), 1);
    } 
    paramGraphics.drawImage((Image)ce.g, paramInt1 + 15, paramInt2 + 104, 20);
    r.c(paramGraphics, this.h[this.b * 4 + 1], paramInt1 + 30, paramInt2 + 104, 4);
    paramGraphics.setColor(8347487);
    bh.a(paramGraphics, paramInt1 + 15, paramInt2 + 117, (bh.b + this.h[this.b * 4 + 2] + "%").toCharArray(), 1);
    if (r.g > 128) {
      paramGraphics.drawImage(ce.m[this.h[this.b * 4] - 6], paramInt1 + 61 + 22, paramInt2 + 74 + 15, 20);
    } else {
      paramGraphics.drawImage(ce.m[this.h[this.b * 4] - 6], paramInt1 + 61, paramInt2 + 74, 20);
    } 
    bh.a(paramGraphics, (char[])bh.d, (char[])bh.e);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */