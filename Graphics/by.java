package Graphics;

import javax.microedition.lcdui.Graphics;

public final class by extends GraphicParent {
  private byte c;
  
  public by(c paramc, byte paramByte) {
    super(paramc, (byte)2);
    this.b = 1;
    this.c = paramByte;
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
    //   14: invokevirtual d : (II)Z
    //   17: ifeq -> 22
    //   20: iconst_1
    //   21: ireturn
    //   22: iload_1
    //   23: lookupswitch default -> 76, 8 -> 40
    //   40: aload_0
    //   41: getfield b : B
    //   44: ifne -> 66
    //   47: aload_0
    //   48: new bk
    //   51: dup
    //   52: aload_0
    //   53: aload_0
    //   54: getfield c : B
    //   57: invokespecial <init> : (Lby;B)V
    //   60: putfield b : Lcb;
    //   63: goto -> 147
    //   66: aload_0
    //   67: getfield a : Lcb;
    //   70: invokevirtual a : ()V
    //   73: goto -> 147
    //   76: iload_2
    //   77: lookupswitch default -> 147, -8 -> 104, 53 -> 114
    //   104: aload_0
    //   105: getfield a : Lcb;
    //   108: invokevirtual a : ()V
    //   111: goto -> 147
    //   114: aload_0
    //   115: getfield b : B
    //   118: ifne -> 140
    //   121: aload_0
    //   122: new bk
    //   125: dup
    //   126: aload_0
    //   127: aload_0
    //   128: getfield c : B
    //   131: invokespecial <init> : (Lby;B)V
    //   134: putfield b : Lcb;
    //   137: goto -> 147
    //   140: aload_0
    //   141: getfield a : Lcb;
    //   144: invokevirtual a : ()V
    //   147: iconst_1
    //   148: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(0, 0, r.g, r.h);
    bf.c(paramGraphics, paramInt1, paramInt2);
    bh.a(paramGraphics, 1, paramInt1 + 77, paramInt2 + 5);
    bf.b(paramGraphics, paramInt1, paramInt2 + 24, 3);
    paramInt2 += 5;
    paramInt1 += 10;
    paramGraphics.setColor(0);
    bh.a(paramGraphics, paramInt1 + 11, paramInt2 + 34, 133, 1, ce.a.a(15 + this.c - 6));
    paramGraphics.drawImage(ce.l[19], paramInt1 + 7, paramInt2 + 80, 20);
    bh.a(paramGraphics, paramInt1 + 11, paramInt2 + 84, ce.a.a(this.c - 6), 1);
    paramGraphics.drawImage(ce.m[this.c - 6], paramInt1 + 125, paramInt2 + 137, 40);
    paramGraphics.drawImage(ce.l[17], paramInt1 + 5 + ((this.b == 0) ? 0 : 28), paramInt2 + 118, 20);
    if (this.b == 0) {
      paramGraphics.setColor(16777215);
    } else {
      paramGraphics.setColor(0);
    } 
    bh.a(paramGraphics, paramInt1 + 9, paramInt2 + 121, ce.g.a(14), 1);
    if (this.b == 1) {
      paramGraphics.setColor(16777215);
    } else {
      paramGraphics.setColor(0);
    } 
    bh.a(paramGraphics, paramInt1 + 37, paramInt2 + 121, ce.g.a(15), 1);
    bh.a(paramGraphics, (char[])bh.d, (char[])bh.e);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/by.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */