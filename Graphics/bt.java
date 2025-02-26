package Graphics;

import javax.microedition.lcdui.Graphics;

public final class bt extends GraphicParent {
  private boolean c;
  
  private char[][] a;
  
  public bt(GraphicParent paramcb, boolean paramBoolean) {
    super(paramcb, (byte)4);
    if (w.a() || w.b())
      super.a = (byte)(super.a + 1); 
    this.c = paramBoolean;
    ((az)bh.a).b = 0;
    bh.b.b = 0;
    bh.c.b = 0;
    this.a = new char[super.a][];
    for (byte b = 0; b < super.a; b = (byte)(b + 1)) {
      if (b == 4) {
        this.a[b] = w.a().toCharArray();
      } else {
        this.a[b] = ce.e.a(b);
      } 
    } 
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
    //   23: bipush #53
    //   25: if_icmpeq -> 34
    //   28: iload_1
    //   29: bipush #8
    //   31: if_icmpne -> 180
    //   34: aload_0
    //   35: getfield b : B
    //   38: bipush #6
    //   40: iadd
    //   41: i2b
    //   42: istore_3
    //   43: getstatic x.a : Z
    //   46: ifeq -> 62
    //   49: aload_0
    //   50: getfield b : B
    //   53: iconst_5
    //   54: if_icmpne -> 62
    //   57: iload_3
    //   58: iconst_1
    //   59: iadd
    //   60: i2b
    //   61: istore_3
    //   62: getstatic ce.e : Lz;
    //   65: iload_3
    //   66: invokevirtual a : (I)[C
    //   69: astore #4
    //   71: aload_0
    //   72: getfield b : B
    //   75: aload_0
    //   76: getfield a : B
    //   79: iconst_1
    //   80: isub
    //   81: if_icmpne -> 151
    //   84: invokestatic a : ()Z
    //   87: ifeq -> 110
    //   90: getstatic cj.a : Lcj;
    //   93: sipush #3930
    //   96: invokevirtual a : (I)Ljava/lang/String;
    //   99: dup
    //   100: astore #5
    //   102: invokevirtual toCharArray : ()[C
    //   105: astore #4
    //   107: goto -> 151
    //   110: invokestatic b : ()Z
    //   113: ifeq -> 151
    //   116: getstatic cj.a : Lcj;
    //   119: sipush #3934
    //   122: invokevirtual a : (I)Ljava/lang/String;
    //   125: dup
    //   126: astore #5
    //   128: ldc 'XXX'
    //   130: new java/lang/String
    //   133: dup
    //   134: invokestatic a : ()Ljava/lang/String;
    //   137: invokespecial <init> : (Ljava/lang/String;)V
    //   140: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   143: dup
    //   144: astore #5
    //   146: invokevirtual toCharArray : ()[C
    //   149: astore #4
    //   151: aload_0
    //   152: new bx
    //   155: dup
    //   156: aload_0
    //   157: aload #4
    //   159: aload_0
    //   160: getfield c : Z
    //   163: aload_0
    //   164: getfield a : [[C
    //   167: aload_0
    //   168: getfield b : B
    //   171: aaload
    //   172: invokespecial <init> : (Lbt;[CZ[C)V
    //   175: putfield b : Lcb;
    //   178: iconst_1
    //   179: ireturn
    //   180: iload_2
    //   181: bipush #-8
    //   183: if_icmpne -> 218
    //   186: aload_0
    //   187: getfield a : Lcb;
    //   190: iconst_m1
    //   191: iconst_m1
    //   192: invokevirtual a : (BB)V
    //   195: getstatic bh.a : Lb;
    //   198: iconst_1
    //   199: putfield b : Z
    //   202: getstatic bh.b : Lb;
    //   205: iconst_1
    //   206: putfield b : Z
    //   209: getstatic bh.c : Lb;
    //   212: iconst_1
    //   213: putfield b : Z
    //   216: iconst_1
    //   217: ireturn
    //   218: iconst_1
    //   219: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = 16777215;
    int j = 0;
    if (this.c) {
      paramInt1 += 6;
      paramInt2 += 25;
      GraphicParent.a(paramGraphics, paramInt1, paramInt2, 143, 139);
      b(paramGraphics, paramInt1, paramInt2, 143, 139);
      j = 10452799;
      paramInt2 += 8;
    } else {
      paramGraphics.setColor(4136767);
      paramGraphics.fillRect(0, 0, r.g, r.h);
      bf.c(paramGraphics, paramInt1, paramInt2);
      bf.b(paramGraphics, paramInt1, paramInt2 + 24, 3);
      bh.a(paramGraphics, 7, r.g >> 1, paramInt2 + 5);
      paramInt2 += 41;
    } 
    paramInt2 += 10;
    bh.a(true);
    byte b;
    for (b = 0; b < super.a; b = (byte)(b + 1)) {
      if (this.b == b) {
        paramGraphics.setColor(i);
      } else {
        paramGraphics.setColor(j);
      } 
      bh.a(paramGraphics, r.g >> 1, paramInt2 + b * 15, this.a[b], 1);
    } 
    bh.a(false);
    if (!this.c)
      bh.a(paramGraphics, (char[])bh.d, (char[])bh.e); 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */