package Graphics;

import javax.microedition.lcdui.Graphics;

public final class ab extends GraphicParent {
  private ad a;
  
  private byte c;
  
  private boolean c;
  
  public ab(GraphicParent paramcb, ad paramad, boolean paramBoolean) {
    super(paramcb, (byte)0);
    this.a = paramad;
    this.c = true;
    this.c = paramBoolean;
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
    //   22: iload_2
    //   23: bipush #53
    //   25: if_icmpeq -> 34
    //   28: iload_1
    //   29: bipush #8
    //   31: if_icmpne -> 192
    //   34: aload_0
    //   35: getfield c : Z
    //   38: ifeq -> 169
    //   41: iconst_1
    //   42: anewarray java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: getstatic bp.a : Lz;
    //   50: bipush #7
    //   52: invokevirtual a : (I)[C
    //   55: aastore
    //   56: astore_3
    //   57: aload_0
    //   58: getfield a : Lad;
    //   61: getfield f : B
    //   64: ifne -> 75
    //   67: getstatic n.a : B
    //   70: bipush #6
    //   72: if_icmpne -> 132
    //   75: aload_0
    //   76: getfield a : Lad;
    //   79: getfield f : B
    //   82: iconst_2
    //   83: if_icmpne -> 94
    //   86: getstatic n.a : B
    //   89: bipush #7
    //   91: if_icmpne -> 132
    //   94: aload_0
    //   95: getfield a : Lad;
    //   98: getfield f : B
    //   101: iconst_1
    //   102: if_icmpne -> 113
    //   105: getstatic n.a : B
    //   108: bipush #8
    //   110: if_icmpne -> 132
    //   113: aload_0
    //   114: getfield a : Lad;
    //   117: getfield f : B
    //   120: iconst_3
    //   121: if_icmpne -> 159
    //   124: getstatic n.a : B
    //   127: bipush #8
    //   129: if_icmpeq -> 159
    //   132: iconst_2
    //   133: anewarray java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: getstatic bp.a : Lz;
    //   141: bipush #26
    //   143: invokevirtual a : (I)[C
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: getstatic bp.a : Lz;
    //   152: bipush #7
    //   154: invokevirtual a : (I)[C
    //   157: aastore
    //   158: astore_3
    //   159: aload_0
    //   160: iconst_2
    //   161: iconst_2
    //   162: aload_3
    //   163: invokevirtual a : (BB[Ljava/lang/Object;)V
    //   166: goto -> 190
    //   169: aload_0
    //   170: iconst_2
    //   171: iconst_2
    //   172: iconst_1
    //   173: anewarray java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: getstatic bp.a : Lz;
    //   181: bipush #23
    //   183: invokevirtual a : (I)[C
    //   186: aastore
    //   187: invokevirtual a : (BB[Ljava/lang/Object;)V
    //   190: iconst_1
    //   191: ireturn
    //   192: iload_2
    //   193: bipush #-8
    //   195: if_icmpne -> 207
    //   198: aload_0
    //   199: getfield a : Lcb;
    //   202: invokevirtual a : ()V
    //   205: iconst_1
    //   206: ireturn
    //   207: iconst_1
    //   208: ireturn
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokespecial a : (BB)V
    //   6: invokestatic a : ()Lao;
    //   9: astore_3
    //   10: iload_1
    //   11: iconst_2
    //   12: if_icmpne -> 274
    //   15: iload_2
    //   16: ifne -> 274
    //   19: aload_0
    //   20: getfield c : Z
    //   23: ifeq -> 203
    //   26: aload_0
    //   27: getfield a : Lad;
    //   30: getfield f : B
    //   33: aload_0
    //   34: getfield a : Lad;
    //   37: getfield g : B
    //   40: iconst_1
    //   41: iconst_0
    //   42: invokestatic a : (BBZZ)Lad;
    //   45: dup
    //   46: astore #4
    //   48: instanceof e
    //   51: ifeq -> 63
    //   54: aload #4
    //   56: checkcast e
    //   59: iconst_1
    //   60: putfield b : Z
    //   63: aload #4
    //   65: getfield a : I
    //   68: aload_0
    //   69: getfield c : B
    //   72: imul
    //   73: istore #5
    //   75: aload_3
    //   76: getfield a : Lg;
    //   79: getfield a : I
    //   82: iload #5
    //   84: if_icmpge -> 109
    //   87: aload_0
    //   88: iconst_1
    //   89: anewarray java/lang/Object
    //   92: dup
    //   93: iconst_0
    //   94: getstatic bp.a : Lz;
    //   97: bipush #8
    //   99: invokevirtual a : (I)[C
    //   102: aastore
    //   103: invokevirtual a : ([Ljava/lang/Object;)V
    //   106: goto -> 202
    //   109: aload_3
    //   110: getfield a : Lg;
    //   113: aload #4
    //   115: aload_0
    //   116: getfield c : B
    //   119: invokevirtual a : (Lad;I)Z
    //   122: ifne -> 158
    //   125: aload_0
    //   126: iconst_2
    //   127: anewarray java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: getstatic bp.a : Lz;
    //   135: bipush #9
    //   137: invokevirtual a : (I)[C
    //   140: aastore
    //   141: dup
    //   142: iconst_1
    //   143: getstatic bp.a : Lz;
    //   146: bipush #10
    //   148: invokevirtual a : (I)[C
    //   151: aastore
    //   152: invokevirtual a : ([Ljava/lang/Object;)V
    //   155: goto -> 202
    //   158: aload_3
    //   159: getfield a : Lg;
    //   162: dup
    //   163: getfield a : I
    //   166: iload #5
    //   168: isub
    //   169: putfield a : I
    //   172: aload_0
    //   173: iconst_2
    //   174: anewarray java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: getstatic bp.a : Lz;
    //   182: bipush #11
    //   184: invokevirtual a : (I)[C
    //   187: aastore
    //   188: dup
    //   189: iconst_1
    //   190: getstatic bp.a : Lz;
    //   193: bipush #12
    //   195: invokevirtual a : (I)[C
    //   198: aastore
    //   199: invokevirtual a : ([Ljava/lang/Object;)V
    //   202: return
    //   203: aload_3
    //   204: getfield a : Lg;
    //   207: aload_0
    //   208: getfield a : Lad;
    //   211: aload_0
    //   212: getfield c : B
    //   215: invokevirtual a : (Lad;B)V
    //   218: aload_3
    //   219: getfield a : Lg;
    //   222: dup
    //   223: getfield a : I
    //   226: aload_0
    //   227: getfield a : Lad;
    //   230: getfield a : I
    //   233: aload_0
    //   234: getfield c : B
    //   237: imul
    //   238: iconst_5
    //   239: idiv
    //   240: iadd
    //   241: putfield a : I
    //   244: aload_0
    //   245: iconst_2
    //   246: anewarray java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: aload_0
    //   252: getfield a : Lad;
    //   255: getfield a : [C
    //   258: aastore
    //   259: dup
    //   260: iconst_1
    //   261: getstatic bp.a : Lz;
    //   264: bipush #24
    //   266: invokevirtual a : (I)[C
    //   269: aastore
    //   270: invokevirtual a : ([Ljava/lang/Object;)V
    //   273: return
    //   274: iload_1
    //   275: iconst_1
    //   276: if_icmpne -> 288
    //   279: aload_0
    //   280: getfield a : Lcb;
    //   283: iconst_m1
    //   284: iconst_m1
    //   285: invokevirtual a : (BB)V
    //   288: return
  }
  
  public final void a(byte paramByte) {
    if ((this.c && ad.b[this.a.f] != '\000') || (!this.c && this.a.h > 1)) {
      if (paramByte == 4 && this.c < (this.c ? true : this.a.h)) {
        this.c = (byte)(this.c + 1);
        return;
      } 
      if (paramByte == 4 && this.c && this.c == 99) {
        this.c = true;
        return;
      } 
      if (paramByte == 3 && this.c > true) {
        this.c = (byte)(this.c - 1);
        return;
      } 
      if (paramByte == 3 && this.c && this.c == true)
        this.c = true; 
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    bh.a(paramGraphics);
    if (this.c) {
      bh.a(paramGraphics, bh.j, (char[])bh.e);
    } else {
      bh.a(paramGraphics, bh.h, (char[])bh.e);
    } 
    paramInt1 += 3;
    paramInt2 += 20;
    boolean bool = false;
    GraphicParent.a(paramGraphics, paramInt1, paramInt2, 149, 29);
    b(paramGraphics, paramInt1, paramInt2, 149, 29);
    GraphicParent.a(paramGraphics, paramInt1, paramInt2 + 31, 149, 67);
    b(paramGraphics, paramInt1, paramInt2 + 31, 149, 67);
    paramInt1 += 15;
    paramGraphics.setColor(14663551);
    bh.a(paramGraphics, paramInt1 + 8, paramInt2 + 7, bp.a.a(13), 1);
    GraphicParent.a(paramGraphics, paramInt1 + 102, paramInt2 + 11, ((g)(n.a()).a).a);
    paramGraphics.setColor(16777215);
    if ((this.c && ad.b[this.a.f] != '\000') || (!this.c && this.a.h > 1)) {
      if (this.c) {
        bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 38, bp.a.a(14), 1);
      } else {
        bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 38, bp.a.a(25), 1);
      } 
      paramGraphics.drawImage(ce.o, paramInt1 + 32, paramInt2 + 65, 20);
      r.c(paramGraphics, this.c, paramInt1 + 68, paramInt2 + 65, 8);
      paramGraphics.drawImage(ce.d, paramInt1 + 77, paramInt2 + 65, 20);
    } else {
      bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 38, bp.a.a(15), 1);
    } 
    paramGraphics.drawImage(ce.d[this.a.f], paramInt1 + 45, paramInt2 + 57, 20);
    if (this.c) {
      GraphicParent.a(paramGraphics, paramInt1 + 77, paramInt2 + 85, this.c * this.a.a);
      return;
    } 
    GraphicParent.a(paramGraphics, paramInt1 + 77, paramInt2 + 85, this.c * this.a.a / 5);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ab.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */