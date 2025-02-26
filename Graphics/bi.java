package Graphics;

import javax.microedition.lcdui.Graphics;

public final class bi extends GraphicParent {
  private short a;
  
  private short[] a = (short[])(n.a()).a;
  
  public bi(q paramq) {
    super(paramq, (byte)4);
    this.a = new short[4];
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
    //   25: if_icmpeq -> 33
    //   28: iload_1
    //   29: iconst_2
    //   30: if_icmpne -> 40
    //   33: aload_0
    //   34: iconst_3
    //   35: invokespecial b : (B)V
    //   38: iconst_1
    //   39: ireturn
    //   40: iload_2
    //   41: bipush #54
    //   43: if_icmpeq -> 51
    //   46: iload_1
    //   47: iconst_5
    //   48: if_icmpne -> 58
    //   51: aload_0
    //   52: iconst_4
    //   53: invokespecial b : (B)V
    //   56: iconst_1
    //   57: ireturn
    //   58: iload_2
    //   59: bipush #53
    //   61: if_icmpeq -> 70
    //   64: iload_1
    //   65: bipush #8
    //   67: if_icmpne -> 168
    //   70: aload_0
    //   71: getfield a : [S
    //   74: iconst_0
    //   75: saload
    //   76: ifne -> 106
    //   79: aload_0
    //   80: getfield a : [S
    //   83: iconst_1
    //   84: saload
    //   85: ifne -> 106
    //   88: aload_0
    //   89: getfield a : [S
    //   92: iconst_2
    //   93: saload
    //   94: ifne -> 106
    //   97: aload_0
    //   98: getfield a : [S
    //   101: iconst_3
    //   102: saload
    //   103: ifeq -> 132
    //   106: iconst_1
    //   107: anewarray java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: getstatic ai.a : Lz;
    //   115: bipush #33
    //   117: invokevirtual a : (I)[C
    //   120: aastore
    //   121: astore_3
    //   122: aload_0
    //   123: iconst_2
    //   124: iconst_2
    //   125: aload_3
    //   126: invokevirtual a : (BB[Ljava/lang/Object;)V
    //   129: goto -> 166
    //   132: iconst_2
    //   133: anewarray java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: getstatic ai.a : Lz;
    //   141: bipush #34
    //   143: invokevirtual a : (I)[C
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: getstatic ai.a : Lz;
    //   152: bipush #35
    //   154: invokevirtual a : (I)[C
    //   157: aastore
    //   158: astore_3
    //   159: aload_0
    //   160: iconst_1
    //   161: iconst_1
    //   162: aload_3
    //   163: invokevirtual a : (BB[Ljava/lang/Object;)V
    //   166: iconst_1
    //   167: ireturn
    //   168: iload_2
    //   169: bipush #-8
    //   171: if_icmpne -> 185
    //   174: aload_0
    //   175: getfield a : Lcb;
    //   178: iconst_m1
    //   179: iconst_m1
    //   180: invokevirtual a : (BB)V
    //   183: iconst_1
    //   184: ireturn
    //   185: iconst_1
    //   186: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += 36;
    paramInt2 += 37;
    ao ao = n.a();
    GraphicParent.b(paramGraphics, paramInt1, paramInt2, 101, 26, 4136767);
    paramGraphics.setColor(16777215);
    r.a(paramGraphics, ai.a.a(36), paramInt1 + 3, paramInt2 + 3);
    r.a(paramGraphics, ai.a.a(37), paramInt1 + 3, paramInt2 + 10 + 4);
    r.c(paramGraphics, this.a, paramInt1 + 65, paramInt2 + 10 + 4, 8);
    paramGraphics.setColor(6242111);
    paramGraphics.fillRect(paramInt1, paramInt2 + 30, 101, 62);
    byte b;
    for (b = 0; b < 4; b = (byte)(b + 1)) {
      int i;
      if (this.b == b) {
        paramGraphics.setColor(16777215);
        paramGraphics.drawImage(ce.d, paramInt1 + 2, paramInt2 + 35 + b * 15, 20);
      } else {
        paramGraphics.setColor(14663551);
      } 
      short s = this.a[b];
      switch (b) {
        case 0:
          i = s + ao.b + ao.m;
          break;
        case 1:
          i += ao.e + ao.n;
          break;
        case 2:
          i += ao.f + ao.o;
          break;
        case 3:
          i += ao.g + ao.p;
          break;
      } 
      bh.a(paramGraphics, paramInt1 + 10, paramInt2 + 35 + b * 15, ce.a.a(9 + b), 1);
      paramGraphics.drawImage(ce.o, paramInt1 + 45 + 25, paramInt2 + 35 + b * 15, 20);
      r.c(paramGraphics, i, paramInt1 + 65 + 25, paramInt2 + 35 + b * 15, 8);
      paramGraphics.drawImage(ce.d, paramInt1 + 67 + 25, paramInt2 + 35 + b * 15, 20);
    } 
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lcb;
    //   4: astore_3
    //   5: aload_0
    //   6: iload_1
    //   7: iload_2
    //   8: invokespecial a : (BB)V
    //   11: aload_3
    //   12: instanceof af
    //   15: ifeq -> 122
    //   18: iload_1
    //   19: iconst_2
    //   20: if_icmpne -> 122
    //   23: iload_2
    //   24: ifne -> 122
    //   27: invokestatic a : ()Lao;
    //   30: dup
    //   31: astore #4
    //   33: dup
    //   34: getfield b : S
    //   37: aload_0
    //   38: getfield a : [S
    //   41: iconst_0
    //   42: saload
    //   43: iadd
    //   44: i2s
    //   45: putfield b : S
    //   48: aload #4
    //   50: dup
    //   51: getfield e : S
    //   54: aload_0
    //   55: getfield a : [S
    //   58: iconst_1
    //   59: saload
    //   60: iadd
    //   61: i2s
    //   62: putfield e : S
    //   65: aload #4
    //   67: dup
    //   68: getfield f : S
    //   71: aload_0
    //   72: getfield a : [S
    //   75: iconst_2
    //   76: saload
    //   77: iadd
    //   78: i2s
    //   79: putfield f : S
    //   82: aload #4
    //   84: dup
    //   85: getfield g : S
    //   88: aload_0
    //   89: getfield a : [S
    //   92: iconst_3
    //   93: saload
    //   94: iadd
    //   95: i2s
    //   96: putfield g : S
    //   99: aload #4
    //   101: aload_0
    //   102: getfield a : S
    //   105: putfield a : S
    //   108: aload #4
    //   110: invokevirtual n : ()V
    //   113: aload_0
    //   114: getfield a : Lcb;
    //   117: iconst_m1
    //   118: iconst_m1
    //   119: invokevirtual a : (BB)V
    //   122: return
  }
  
  private void b(byte paramByte) {
    if (paramByte == 4 && this.a > null) {
      this.a[this.b] = (short)(this.a[this.b] + 1);
      this.a = (short)(this.a - 1);
      return;
    } 
    if (paramByte == 3 && this.a[this.b] > 0) {
      this.a[this.b] = (short)(this.a[this.b] - 1);
      this.a = (short)(this.a + 1);
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */