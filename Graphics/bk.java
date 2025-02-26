package Graphics;

import javax.microedition.lcdui.Graphics;

public final class bk extends GraphicParent {
  private boolean c;
  
  private boolean d;
  
  private byte c = 0;
  
  private boolean[] b = new boolean[3];
  
  private boolean e = true;
  
  private byte d = 0;
  
  public bk(by paramby, byte paramByte) {
    super(paramby, (byte)3);
    this.d = 0;
    this.c = paramByte;
    a(new Object[] { ce.g.a(16), ce.g.a(13) });
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
    //   12: getfield c : Z
    //   15: ifne -> 136
    //   18: aload_0
    //   19: iload_1
    //   20: iload_2
    //   21: invokevirtual d : (II)Z
    //   24: ifeq -> 34
    //   27: aload_0
    //   28: iconst_0
    //   29: putfield d : B
    //   32: iconst_1
    //   33: ireturn
    //   34: iload_2
    //   35: bipush #53
    //   37: if_icmpeq -> 46
    //   40: iload_1
    //   41: bipush #8
    //   43: if_icmpne -> 119
    //   46: aload_0
    //   47: getfield b : [Z
    //   50: aload_0
    //   51: getfield b : B
    //   54: aload_0
    //   55: getfield b : [Z
    //   58: aload_0
    //   59: getfield b : B
    //   62: baload
    //   63: ifne -> 70
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: bastore
    //   72: iconst_0
    //   73: istore_3
    //   74: iconst_0
    //   75: istore #4
    //   77: iload #4
    //   79: iconst_3
    //   80: if_icmpge -> 104
    //   83: aload_0
    //   84: getfield b : [Z
    //   87: iload #4
    //   89: baload
    //   90: ifeq -> 98
    //   93: iload_3
    //   94: iconst_1
    //   95: iadd
    //   96: i2b
    //   97: istore_3
    //   98: iinc #4, 1
    //   101: goto -> 77
    //   104: iload_3
    //   105: iconst_2
    //   106: if_icmpne -> 119
    //   109: aload_0
    //   110: iconst_1
    //   111: putfield c : Z
    //   114: aload_0
    //   115: iconst_0
    //   116: putfield d : Z
    //   119: iload_2
    //   120: bipush #-8
    //   122: if_icmpne -> 324
    //   125: aload_0
    //   126: getfield a : Lcb;
    //   129: iconst_m1
    //   130: iconst_m1
    //   131: invokevirtual a : (BB)V
    //   134: iconst_1
    //   135: ireturn
    //   136: iload_1
    //   137: lookupswitch default -> 220, 2 -> 172, 5 -> 172, 8 -> 191
    //   172: aload_0
    //   173: aload_0
    //   174: getfield d : Z
    //   177: ifne -> 184
    //   180: iconst_1
    //   181: goto -> 185
    //   184: iconst_0
    //   185: putfield d : Z
    //   188: goto -> 324
    //   191: aload_0
    //   192: getfield d : Z
    //   195: ifeq -> 205
    //   198: aload_0
    //   199: invokespecial d : ()V
    //   202: goto -> 324
    //   205: aload_0
    //   206: iconst_3
    //   207: newarray boolean
    //   209: putfield b : [Z
    //   212: aload_0
    //   213: iconst_0
    //   214: putfield c : Z
    //   217: goto -> 324
    //   220: iload_2
    //   221: lookupswitch default -> 324, -8 -> 283, 52 -> 264, 53 -> 298, 54 -> 264
    //   264: aload_0
    //   265: aload_0
    //   266: getfield d : Z
    //   269: ifne -> 276
    //   272: iconst_1
    //   273: goto -> 277
    //   276: iconst_0
    //   277: putfield d : Z
    //   280: goto -> 324
    //   283: aload_0
    //   284: iconst_3
    //   285: newarray boolean
    //   287: putfield b : [Z
    //   290: aload_0
    //   291: iconst_0
    //   292: putfield c : Z
    //   295: goto -> 324
    //   298: aload_0
    //   299: getfield d : Z
    //   302: ifeq -> 312
    //   305: aload_0
    //   306: invokespecial d : ()V
    //   309: goto -> 324
    //   312: aload_0
    //   313: iconst_3
    //   314: newarray boolean
    //   316: putfield b : [Z
    //   319: aload_0
    //   320: iconst_0
    //   321: putfield c : Z
    //   324: iconst_1
    //   325: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(0, 0, r.g, r.h);
    bf.c(paramGraphics, paramInt1, paramInt2);
    bh.a(paramGraphics, 1, paramInt1 + 155 >> 1, paramInt2 + 5);
    bf.b(paramGraphics, paramInt1, paramInt2 + 24, 3);
    paramInt1 += 15;
    paramInt2 += 10;
    paramGraphics.drawImage(ce.l[19], paramInt1 + 11, paramInt2 + 82, 20);
    byte b;
    for (b = 0; b < 3; b = (byte)(b + 1)) {
      if (this.b[b]) {
        paramGraphics.drawImage(ce.b[b][1], paramInt1 + 22 + b * 34, paramInt2 + 66 - 5, 3);
      } else {
        paramGraphics.drawImage(ce.b[b][0], paramInt1 + 22 + b * 34, paramInt2 + 59 - 5 + ((super.b == b) ? this.d : 0), 3);
      } 
    } 
    if (this.c == 0)
      paramGraphics.drawImage(ce.l[20], paramInt1 + 19 + super.b * 34, paramInt2 + 73, 20); 
    paramGraphics.setColor(0);
    if (this.c == 0) {
      bh.a(paramGraphics, paramInt1 + 11, paramInt2 + 94, ce.b.a(super.b), 1);
      bh.a(paramGraphics, paramInt1 + 11, paramInt2 + 109, 100, 1, ce.b.a(12 + super.b));
    } else {
      paramGraphics.drawImage(ce.l[17], paramInt1 + 60 + ((this.d != 0) ? 0 : 28), paramInt2 + 118, 20);
      bh.a(paramGraphics, paramInt1 + 11, paramInt2 + 104, ce.g.a(17), 1);
      if (this.d != 0) {
        paramGraphics.setColor(16777215);
      } else {
        paramGraphics.setColor(0);
      } 
      bh.a(paramGraphics, paramInt1 + 64, paramInt2 + 121, ce.g.a(14), 1);
      if (this.d != 0) {
        paramGraphics.setColor(0);
      } else {
        paramGraphics.setColor(16777215);
      } 
      bh.a(paramGraphics, paramInt1 + 92, paramInt2 + 121, ce.g.a(15), 1);
    } 
    if (this.d == 0) {
      this.d = (byte)(this.d + 1);
      this.e = true;
    } else if (this.d == 3) {
      this.d = (byte)(this.d - 1);
      this.e = false;
    } else if (this.e) {
      this.d = (byte)(this.d + 1);
    } else {
      this.d = (byte)(this.d - 1);
    } 
    if (super.b == null)
      this.a = 1; 
    bh.a(paramGraphics, (char[])bh.d, (char[])bh.e);
  }
  
  private void d() {
    n.a(false, this.c, this.b);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */