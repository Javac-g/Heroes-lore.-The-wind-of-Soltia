import java.awt.Graphics;


public final class c extends GraphicParent {
  public c(bf parambf) {
    super(parambf, (byte)3);
    this.b = 2;
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
    //   31: if_icmpne -> 144
    //   34: aload_0
    //   35: getfield b : B
    //   38: ifeq -> 49
    //   41: aload_0
    //   42: getfield b : B
    //   45: iconst_1
    //   46: if_icmpne -> 120
    //   49: getstatic bs.a : Lbs;
    //   52: getfield b : Z
    //   55: ifne -> 93
    //   58: iconst_2
    //   59: anewarray java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: getstatic ce.g : Lz;
    //   67: bipush #6
    //   69: invokevirtual a : (I)[C
    //   72: aastore
    //   73: dup
    //   74: iconst_1
    //   75: getstatic ce.g : Lz;
    //   78: bipush #7
    //   80: invokevirtual a : (I)[C
    //   83: aastore
    //   84: astore_3
    //   85: aload_0
    //   86: aload_3
    //   87: invokevirtual a : ([Ljava/lang/Object;)V
    //   90: goto -> 142
    //   93: iconst_0
    //   94: istore_3
    //   95: aload_0
    //   96: new by
    //   99: dup
    //   100: aload_0
    //   101: bipush #6
    //   103: iconst_2
    //   104: aload_0
    //   105: getfield b : B
    //   108: isub
    //   109: iadd
    //   110: i2b
    //   111: invokespecial <init> : (Lc;B)V
    //   114: putfield b : Lcb;
    //   117: goto -> 142
    //   120: aload_0
    //   121: new by
    //   124: dup
    //   125: aload_0
    //   126: bipush #6
    //   128: iconst_2
    //   129: aload_0
    //   130: getfield b : B
    //   133: isub
    //   134: iadd
    //   135: i2b
    //   136: invokespecial <init> : (Lc;B)V
    //   139: putfield b : Lcb;
    //   142: iconst_1
    //   143: ireturn
    //   144: iload_2
    //   145: bipush #-8
    //   147: if_icmpne -> 159
    //   150: aload_0
    //   151: getfield a : Lcb;
    //   154: invokevirtual a : ()V
    //   157: iconst_1
    //   158: ireturn
    //   159: iconst_1
    //   160: ireturn
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    super.a(paramByte1, paramByte2);
    if ((paramByte1 == 2 || paramByte1 == 12) && paramByte2 == 0) {
      bf.d();
      ce.B();
      bs.a.e();
      n.e = 0;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(0, 0, r.g, r.h);
    bf.c(paramGraphics, paramInt1, paramInt2);
    bh.a(paramGraphics, 1, paramInt1 + 155 >> 1, paramInt2 + 5);
    bf.b(paramGraphics, paramInt1, paramInt2 + 24, 3);
    paramInt1 += 15;
    paramInt2 += 10;
    if (this.b != 0)
      paramGraphics.drawImage(ce.m[5], paramInt1 + 6, paramInt2 + 38, 20); 
    if (this.b != 1)
      paramGraphics.drawImage(ce.m[4], paramInt1 + 34, paramInt2 + 38, 20); 
    if (this.b != 2)
      paramGraphics.drawImage(ce.m[3], paramInt1 + 59, paramInt2 + 38, 20); 
    if (this.b == 0)
      paramGraphics.drawImage(ce.m[2], paramInt1 + 6, paramInt2 + 38, 20); 
    if (this.b == 1)
      paramGraphics.drawImage(ce.m[1], paramInt1 + 34, paramInt2 + 38, 20); 
    if (this.b == 2)
      paramGraphics.drawImage(ce.m[0], paramInt1 + 59, paramInt2 + 38, 20); 
    paramGraphics.setColor(0);
    bh.a(paramGraphics, paramInt1 + 11, paramInt2 + 104, ce.g.a(12), 1);
    bh.a(paramGraphics, paramInt1 + 11, paramInt2 + 119, ce.g.a(13), 1);
    bh.a(paramGraphics, (char[])bh.d, (char[])bh.e);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */