import javax.microedition.lcdui.Graphics;

public final class bn extends GraphicParent {
  private boolean c = true;
  
  private p a;
  
  public bn(bm parambm, p paramp) {
    super(parambm, (byte)3);
    this.a = paramp;
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
    //   23: bipush #52
    //   25: if_icmpeq -> 44
    //   28: iload_2
    //   29: bipush #54
    //   31: if_icmpeq -> 44
    //   34: iload_1
    //   35: iconst_2
    //   36: if_icmpeq -> 44
    //   39: iload_1
    //   40: iconst_5
    //   41: if_icmpne -> 62
    //   44: aload_0
    //   45: aload_0
    //   46: getfield c : Z
    //   49: ifne -> 56
    //   52: iconst_1
    //   53: goto -> 57
    //   56: iconst_0
    //   57: putfield c : Z
    //   60: iconst_1
    //   61: ireturn
    //   62: iload_2
    //   63: bipush #53
    //   65: if_icmpeq -> 74
    //   68: iload_1
    //   69: bipush #8
    //   71: if_icmpne -> 228
    //   74: aload_0
    //   75: getfield b : B
    //   78: iconst_3
    //   79: if_icmpne -> 119
    //   82: iconst_2
    //   83: anewarray java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: getstatic ai.a : Lz;
    //   91: bipush #59
    //   93: invokevirtual a : (I)[C
    //   96: aastore
    //   97: dup
    //   98: iconst_1
    //   99: getstatic ai.a : Lz;
    //   102: bipush #60
    //   104: invokevirtual a : (I)[C
    //   107: aastore
    //   108: astore_3
    //   109: aload_0
    //   110: iconst_1
    //   111: iconst_0
    //   112: aload_3
    //   113: invokevirtual a : (BB[Ljava/lang/Object;)V
    //   116: goto -> 226
    //   119: aload_0
    //   120: getfield a : Lp;
    //   123: getfield g : B
    //   126: aload_0
    //   127: getfield b : B
    //   130: if_icmpeq -> 147
    //   133: aload_0
    //   134: getfield a : Lp;
    //   137: getfield h : B
    //   140: aload_0
    //   141: getfield b : B
    //   144: if_icmpne -> 173
    //   147: iconst_1
    //   148: anewarray java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: getstatic ai.a : Lz;
    //   156: bipush #61
    //   158: invokevirtual a : (I)[C
    //   161: aastore
    //   162: astore_3
    //   163: aload_0
    //   164: iconst_1
    //   165: iconst_0
    //   166: aload_3
    //   167: invokevirtual a : (BB[Ljava/lang/Object;)V
    //   170: goto -> 226
    //   173: aload_0
    //   174: getfield a : Lp;
    //   177: aload_0
    //   178: getfield c : Z
    //   181: aload_0
    //   182: getfield b : B
    //   185: iconst_0
    //   186: invokevirtual a : (ZBZ)Z
    //   189: ifne -> 226
    //   192: iconst_2
    //   193: anewarray java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: getstatic ai.a : Lz;
    //   201: bipush #62
    //   203: invokevirtual a : (I)[C
    //   206: aastore
    //   207: dup
    //   208: iconst_1
    //   209: getstatic ai.a : Lz;
    //   212: bipush #63
    //   214: invokevirtual a : (I)[C
    //   217: aastore
    //   218: astore_3
    //   219: aload_0
    //   220: iconst_1
    //   221: iconst_0
    //   222: aload_3
    //   223: invokevirtual a : (BB[Ljava/lang/Object;)V
    //   226: iconst_1
    //   227: ireturn
    //   228: iload_2
    //   229: bipush #-8
    //   231: if_icmpne -> 243
    //   234: aload_0
    //   235: getfield a : Lcb;
    //   238: invokevirtual a : ()V
    //   241: iconst_1
    //   242: ireturn
    //   243: iconst_1
    //   244: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += 2;
    paramInt2 += 10;
    GraphicParent.a(paramGraphics, paramInt1, paramInt2, 132, 22);
    GraphicParent.b(paramGraphics, paramInt1, paramInt2, 132, 22);
    paramInt2 += 19;
    GraphicParent.a(paramGraphics, paramInt1, paramInt2, 149, 140, 2039615, 10452799, 4144959);
    GraphicParent.a(paramGraphics, paramInt1, paramInt2, 149, 140, 6242111);
    paramInt2 -= 19;
    int i = paramInt1 + (this.c ? 0 : 66);
    paramGraphics.setColor(6242111);
    paramGraphics.fillRect(i + 2, paramInt2 + 2, 62, 19);
    paramGraphics.setColor(4144959);
    paramGraphics.fillRect(i + 44 + 20, paramInt2 + 1, 1, 19);
    paramGraphics.setColor(2039615);
    paramGraphics.fillRect(i + 45 + 20, paramInt2 + 1, 1, 17);
    paramGraphics.fillRect(i, paramInt2 + 1, 1, 18);
    paramGraphics.fillRect(i + 1, paramInt2, 64, 1);
    paramGraphics.setColor(10452799);
    paramGraphics.fillRect(i + 1, paramInt2 + 2, 1, 18);
    paramGraphics.fillRect(i + 1, paramInt2 + 1, 63, 1);
    int j = paramInt2 + 5 + (this.c ? 0 : 2);
    int k = r.a(paramGraphics, ai.a.a(38), paramInt1 + 6, j);
    r.c(paramGraphics, 1, k + 3, j, 4);
    if (this.a.g != -1)
      paramGraphics.drawImage(ce.c[this.a.f * 4 + this.a.g], k + 13, j - 2, 20); 
    int m = paramInt2 + 5 + (this.c ? 2 : 0);
    k = r.a(paramGraphics, ai.a.a(38), paramInt1 + 51 + 20, m);
    r.c(paramGraphics, 3, k + 3, m, 4);
    if (this.a.h != -1)
      paramGraphics.drawImage(ce.c[this.a.f * 4 + this.a.h], k + 13, m - 2, 20); 
    paramGraphics.drawImage(ce.o, paramInt1, paramInt2 + 7, 20);
    paramGraphics.drawImage(ce.d, paramInt1 + 90 + 40, paramInt2 + 7, 20);
    paramGraphics.setColor(4136767);
    GraphicParent.b(paramGraphics, paramInt1 + 28, paramInt2 + 26, 114, 127, 4136767);
    GraphicParent.b(paramGraphics, paramInt1 + 3, paramInt2 + 31 + this.b * 20, 26, 19, 4136767);
    for (j = 0; j < 3; j++)
      paramGraphics.drawImage(ce.c[this.a.f * 4 + j], paramInt1 + 5, paramInt2 + 48 + j * 20, 36); 
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 34, paramInt2 + 29, ce.c.a(this.a.f * 8 + this.b * 2), 1);
    j = r.a(paramGraphics, bh.s, paramInt1 + 34, paramInt2 + 44);
    r.c(paramGraphics, p.h[this.b], j + 3, paramInt2 + 44, 4);
    paramGraphics.setColor(14663551);
    char[] arrayOfChar = ce.c.a(this.a.f * 8 + this.b * 2 + 1);
    bh.a(paramGraphics, paramInt1 + 34, paramInt2 + 53, 100, 1, arrayOfChar);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */