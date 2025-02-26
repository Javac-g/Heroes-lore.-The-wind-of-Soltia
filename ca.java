public final class ca {
  private static final int[] a;
  
  private int a = -1;
  
  public final void a() {
    this.a = -1;
  }
  
  public final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt2 + paramInt1; i++)
      this.a = this.a >>> 8 & 0xFFFFFF ^ a[(this.a ^ paramArrayOfbyte[i]) & 0xFF]; 
  }
  
  public final int a() {
    return this.a ^ 0xFFFFFFFF;
  }
  
  static {
    // Byte code:
    //   0: sipush #256
    //   3: newarray int
    //   5: putstatic ca.a : [I
    //   8: iconst_0
    //   9: istore_1
    //   10: iload_1
    //   11: sipush #256
    //   14: if_icmpge -> 69
    //   17: iload_1
    //   18: istore_0
    //   19: iconst_1
    //   20: istore_2
    //   21: iload_2
    //   22: bipush #9
    //   24: if_icmpge -> 55
    //   27: iload_0
    //   28: iconst_1
    //   29: iand
    //   30: iconst_1
    //   31: if_icmpne -> 43
    //   34: iload_0
    //   35: iconst_1
    //   36: iushr
    //   37: ldc -306674912
    //   39: ixor
    //   40: goto -> 46
    //   43: iload_0
    //   44: iconst_1
    //   45: iushr
    //   46: istore_0
    //   47: iload_2
    //   48: iconst_1
    //   49: iadd
    //   50: i2b
    //   51: istore_2
    //   52: goto -> 21
    //   55: getstatic ca.a : [I
    //   58: iload_1
    //   59: iload_0
    //   60: iastore
    //   61: iload_1
    //   62: iconst_1
    //   63: iadd
    //   64: i2s
    //   65: istore_1
    //   66: goto -> 10
    //   69: return
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ca.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */