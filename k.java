import javax.microedition.lcdui.Graphics;

public final class k extends GraphicParent {
  private ad[] a = new ad[3];
  
  public k(GraphicParent paramcb) {
    super(paramcb, (byte)4);
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
    //   12: getfield b : Lcb;
    //   15: ifnull -> 32
    //   18: aload_0
    //   19: getfield b : Lcb;
    //   22: iload_1
    //   23: iload_2
    //   24: invokevirtual a : (II)Z
    //   27: ifeq -> 32
    //   30: iconst_1
    //   31: ireturn
    //   32: aload_0
    //   33: iload_1
    //   34: iload_2
    //   35: invokevirtual c : (II)Z
    //   38: ifeq -> 43
    //   41: iconst_1
    //   42: ireturn
    //   43: iload_2
    //   44: bipush #53
    //   46: if_icmpeq -> 55
    //   49: iload_1
    //   50: bipush #8
    //   52: if_icmpne -> 350
    //   55: invokestatic a : ()Lao;
    //   58: astore_3
    //   59: aload_0
    //   60: getfield b : B
    //   63: iconst_3
    //   64: if_icmpge -> 137
    //   67: aload_3
    //   68: getfield a : Lg;
    //   71: invokevirtual b : ()[B
    //   74: dup
    //   75: astore #4
    //   77: arraylength
    //   78: iconst_1
    //   79: if_icmpge -> 108
    //   82: iconst_1
    //   83: anewarray java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: getstatic ax.a : Lz;
    //   91: bipush #20
    //   93: invokevirtual a : (I)[C
    //   96: aastore
    //   97: astore #5
    //   99: aload_0
    //   100: aload #5
    //   102: invokevirtual a : ([Ljava/lang/Object;)V
    //   105: goto -> 134
    //   108: aload_0
    //   109: new m
    //   112: dup
    //   113: aload_0
    //   114: aload #4
    //   116: aload_0
    //   117: getfield b : B
    //   120: getstatic ax.a : Lz;
    //   123: bipush #21
    //   125: invokevirtual a : (I)[C
    //   128: invokespecial <init> : (Lcb;[BB[C)V
    //   131: putfield b : Lcb;
    //   134: goto -> 348
    //   137: iconst_0
    //   138: istore #4
    //   140: iconst_3
    //   141: anewarray java/lang/Object
    //   144: astore #5
    //   146: aload_0
    //   147: getfield a : [Lad;
    //   150: iconst_0
    //   151: aaload
    //   152: ifnull -> 171
    //   155: aload #5
    //   157: iconst_0
    //   158: iconst_1
    //   159: istore #4
    //   161: aload_0
    //   162: getfield a : [Lad;
    //   165: iconst_0
    //   166: aaload
    //   167: getfield a : [C
    //   170: aastore
    //   171: aload_0
    //   172: getfield a : [Lad;
    //   175: iconst_1
    //   176: aaload
    //   177: ifnull -> 201
    //   180: aload #5
    //   182: iload #4
    //   184: iload #4
    //   186: iconst_1
    //   187: iadd
    //   188: i2b
    //   189: istore #4
    //   191: aload_0
    //   192: getfield a : [Lad;
    //   195: iconst_1
    //   196: aaload
    //   197: getfield a : [C
    //   200: aastore
    //   201: aload_0
    //   202: getfield a : [Lad;
    //   205: iconst_2
    //   206: aaload
    //   207: ifnull -> 231
    //   210: aload #5
    //   212: iload #4
    //   214: iload #4
    //   216: iconst_1
    //   217: iadd
    //   218: i2b
    //   219: istore #4
    //   221: aload_0
    //   222: getfield a : [Lad;
    //   225: iconst_2
    //   226: aaload
    //   227: getfield a : [C
    //   230: aastore
    //   231: iload #4
    //   233: iconst_2
    //   234: if_icmpge -> 274
    //   237: iconst_2
    //   238: anewarray java/lang/Object
    //   241: dup
    //   242: iconst_0
    //   243: getstatic ax.a : Lz;
    //   246: bipush #22
    //   248: invokevirtual a : (I)[C
    //   251: aastore
    //   252: dup
    //   253: iconst_1
    //   254: getstatic ax.a : Lz;
    //   257: bipush #23
    //   259: invokevirtual a : (I)[C
    //   262: aastore
    //   263: astore #6
    //   265: aload_0
    //   266: aload #6
    //   268: invokevirtual a : ([Ljava/lang/Object;)V
    //   271: goto -> 348
    //   274: sipush #500
    //   277: aload_3
    //   278: getfield a : Lg;
    //   281: getfield a : I
    //   284: if_icmple -> 313
    //   287: iconst_1
    //   288: anewarray java/lang/Object
    //   291: dup
    //   292: iconst_0
    //   293: getstatic ax.a : Lz;
    //   296: bipush #24
    //   298: invokevirtual a : (I)[C
    //   301: aastore
    //   302: astore #6
    //   304: aload_0
    //   305: aload #6
    //   307: invokevirtual a : ([Ljava/lang/Object;)V
    //   310: goto -> 348
    //   313: aload_0
    //   314: new bo
    //   317: dup
    //   318: aload_0
    //   319: getstatic ax.a : Lz;
    //   322: bipush #25
    //   324: invokevirtual a : (I)[C
    //   327: aload #5
    //   329: getstatic ax.a : Lz;
    //   332: bipush #26
    //   334: invokevirtual a : (I)[C
    //   337: sipush #500
    //   340: bipush #20
    //   342: invokespecial <init> : (Lcb;[C[Ljava/lang/Object;[CIB)V
    //   345: putfield b : Lcb;
    //   348: iconst_1
    //   349: ireturn
    //   350: iconst_0
    //   351: ireturn
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    byte b = this.b;
    super.a(paramByte1, paramByte2);
    if (b instanceof af && paramByte1 == 2 && paramByte2 == 0) {
      ao ao = n.a();
      ad ad1;
      if ((ad1 = ad.a(this.a[0], this.a[1], this.a[2])) != null) {
        if (this.a[0] != null)
          ao.a.a(this.a[0], (byte)1); 
        if (this.a[1] != null)
          ao.a.a(this.a[1], (byte)1); 
        if (this.a[2] != null)
          ao.a.a(this.a[2], (byte)1); 
        if (ao.a.a(ad1, 1)) {
          byte[] arrayOfByte = { ao.a.a(ad1.f, ad1.g) };
          this.b = new m(this, arrayOfByte, (byte)10, ax.a.a(27));
          this.a[0] = null;
          this.a[1] = null;
          this.a[2] = null;
        } else {
          if (this.a[0] != null)
            ao.a.a(this.a[0], 1); 
          if (this.a[1] != null)
            ao.a.a(this.a[1], 1); 
          if (this.a[2] != null)
            ao.a.a(this.a[2], 1); 
          Object[] arrayOfObject = { ax.a.a(28), ax.a.a(29) };
          a(arrayOfObject);
        } 
      } else {
        if (this.a[0] != null)
          ao.a.a(this.a[0], (byte)1); 
        if (this.a[1] != null)
          ao.a.a(this.a[1], (byte)1); 
        if (this.a[2] != null)
          ao.a.a(this.a[2], (byte)1); 
        this.a[0] = null;
        this.a[1] = null;
        this.a[2] = null;
        Object[] arrayOfObject = { ax.a.a(30) };
        a(arrayOfObject);
      } 
      return;
    } 
    if (b instanceof m && (paramByte1 == 0 || paramByte1 == 1 || paramByte1 == 2)) {
      ad ad1;
      ao ao = n.a();
      if (paramByte2 >= 100) {
        ad1 = n.a().a(paramByte2 - 100);
      } else {
        ad1 = (n.a()).a.a(paramByte2);
      } 
      x.a(ad.c[ad1.f]);
      byte b1 = 0;
      for (byte b2 = 0; b2 < 3; b2++) {
        if (paramByte1 != b2 && this.a[b2] != null && (this.a[b2]).f == ad1.f && (this.a[b2]).g == ad1.g)
          b1++; 
      } 
      if (ao.a.a(ad1.f, ad1.g) <= b1) {
        Object[] arrayOfObject = { ax.a.a(31) };
        a(arrayOfObject);
      } else {
        this.a[paramByte1] = ad1;
      } 
      return;
    } 
    if (b instanceof bo && paramByte1 == 20) {
      Object[] arrayOfObject = { ax.a.a(32) };
      a((byte)2, (byte)2, arrayOfObject);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(paramInt1, paramInt2, 155, 170);
    GraphicParent.c(paramGraphics, paramInt1 + 2, paramInt2 + 4, 151, 162);
    r.a(paramGraphics, ax.a.a(14), paramInt1 + 3, paramInt2 - 2);
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 9, this.a[0], (byte)1, ax.a.a(33), (this.b == 0));
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 9 + 36, this.a[1], (byte)2, ax.a.a(33), (this.b == 1));
    GraphicParent.a(paramGraphics, paramInt1 + 4, paramInt2 + 9 + 72, this.a[2], (byte)3, ax.a.a(33), (this.b == 2));
    int i = bh.a(155, 80);
    GraphicParent.a(paramGraphics, paramInt1 + (155 - i >> 1), paramInt2 + 138, i, ax.a.a(25), (this.b == 3));
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */