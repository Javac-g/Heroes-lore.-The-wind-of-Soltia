package Graphics;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

public final class g {
  private static final byte[] a = new byte[] { 7, 8, 9, 10 };
  
  private ad[] a;
  
  private byte a;
  
  private byte b;
  
  public int a;
  
  public g(byte paramByte) {
    this.a = new ad[paramByte];
    a();
  }
  
  public final void a() {
    this.a = -1;
    this.b = -1;
    b();
  }
  
  public final ad a(int paramInt) {
    return this.a[paramInt];
  }
  
  public final byte[] a() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.a.length; b2 = (byte)(b2 + 1)) {
      if (this.a[b2] != null)
        b1++; 
    } 
    byte[] arrayOfByte = new byte[b1];
    byte b3 = 0;
    byte b4;
    for (b4 = 0; b4 < this.a.length; b4 = (byte)(b4 + 1)) {
      if (this.a[b4] != null)
        arrayOfByte[b3++] = b4; 
    } 
    return arrayOfByte;
  }
  
  public final byte[] a(boolean paramBoolean, byte paramByte) {
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b2 < this.a.length; b2 = (byte)(b2 + 1)) {
      if (this.a[b2] != null && this.a[b2] instanceof e && (!paramBoolean || this.a[b2] instanceof t) && (paramByte != 1 || ((e)this.a[b2]).b) && (paramByte != -1 || !((e)this.a[b2]).b))
        b1++; 
    } 
    byte[] arrayOfByte = new byte[b1];
    byte b3 = 0;
    byte b4;
    for (b4 = 0; b4 < this.a.length; b4 = (byte)(b4 + 1)) {
      if (this.a[b4] != null && this.a[b4] instanceof e && (!paramBoolean || this.a[b4] instanceof t) && (paramByte != 1 || ((e)this.a[b4]).b) && (paramByte != -1 || !((e)this.a[b4]).b))
        arrayOfByte[b3++] = b4; 
    } 
    return arrayOfByte;
  }
  
  public final byte[] a(byte paramByte) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.a.length; b2 = (byte)(b2 + 1)) {
      if (this.a[b2] != null && (this.a[b2]).f == paramByte)
        b1++; 
    } 
    byte[] arrayOfByte = new byte[b1];
    byte b3 = 0;
    byte b4;
    for (b4 = 0; b4 < this.a.length; b4 = (byte)(b4 + 1)) {
      if (this.a[b4] != null && (this.a[b4]).f == paramByte)
        arrayOfByte[b3++] = b4; 
    } 
    return arrayOfByte;
  }
  
  public final byte[] b() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.a.length; b2 = (byte)(b2 + 1)) {
      if (this.a[b2] != null && ad.c[(this.a[b2]).f])
        b1++; 
    } 
    byte[] arrayOfByte = new byte[b1];
    byte b3 = 0;
    byte b4;
    for (b4 = 0; b4 < this.a.length; b4 = (byte)(b4 + 1)) {
      if (this.a[b4] != null && ad.c[(this.a[b4]).f])
        arrayOfByte[b3++] = b4; 
    } 
    return arrayOfByte;
  }
  
  public final ad a(ad paramad, byte paramByte) {
    int i = this.a[paramByte];
    this.a[paramByte] = paramad;
    return i;
  }
  
  public final ad a() {
    return (this.a == -1) ? null : this.a[this.a];
  }
  
  public final byte a() {
    return a[this.b];
  }
  
  public final void b() {
    this.b = (byte)(this.b + 1);
    if (this.b == 4)
      this.b = 0; 
    this.a = a(a[this.b], (byte)0);
  }
  
  private final void f() {
    if (this.a != -1) {
      if (this.a[this.a] == null) {
        this.a = -1;
        return;
      } 
      if ((this.a[this.a]).f != a[this.b])
        this.a = a(a[this.b], (byte)0); 
    } 
  }
  
  private final void g() {
    if (this.a == -1)
      this.a = a(a[this.b], (byte)0); 
  }
  
  public final boolean a(ad paramad, int paramInt) {
    if (!a(paramad.f, paramad.g, paramInt))
      return false; 
    byte b = b();
    if (ad.b[paramad.f] == '\000') {
      if (b != -1) {
        x.a((paramad.h == 1));
        this.a[b] = paramad;
        return true;
      } 
    } else {
      ad[] arrayOfAd = a(paramad.f, paramad.g);
      for (byte b1 = 0; b1 < arrayOfAd.length; b1++) {
        if ((arrayOfAd[b1]).h + paramInt <= 99) {
          arrayOfAd[b1].a((byte)paramInt);
          e();
          g();
          return true;
        } 
      } 
      if (b != -1) {
        paramad.h = (byte)paramInt;
        this.a[b] = paramad;
        e();
        g();
        return true;
      } 
    } 
    return false;
  }
  
  public final void a(byte paramByte1, byte paramByte2, byte paramByte3) {
    for (int i = this.a.length; i > 0 && paramByte3 > 0; i--) {
      ad ad1;
      if ((ad1 = a(paramByte1, paramByte2)) != null) {
        byte b = (ad1.h < paramByte3) ? ad1.h : paramByte3;
        a(ad1, b);
        paramByte3 = (byte)(paramByte3 - b);
      } 
    } 
    x.a((paramByte3 == 0));
    e();
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    a(this.a[paramByte1], paramByte2);
  }
  
  public final void a(ad paramad, byte paramByte) {
    x.a((paramad.h >= paramByte));
    paramad.b(paramByte);
    if (paramad.h < 1)
      a(paramad); 
    f();
    e();
  }
  
  private void a(ad paramad) {
    for (byte b = 0; b < this.a.length; b++) {
      if (this.a[b] == paramad) {
        this.a[b] = null;
        d();
        return;
      } 
    } 
  }
  
  public final void c() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield a : [Lad;
    //   7: arraylength
    //   8: if_icmpge -> 49
    //   11: aload_0
    //   12: getfield a : [Lad;
    //   15: iload_1
    //   16: aaload
    //   17: ifnull -> 43
    //   20: aload_0
    //   21: getfield a : [Lad;
    //   24: iload_1
    //   25: aaload
    //   26: invokevirtual b : ()Z
    //   29: ifeq -> 43
    //   32: aload_0
    //   33: getfield a : [Lad;
    //   36: iload_1
    //   37: aconst_null
    //   38: aastore
    //   39: aload_0
    //   40: invokevirtual d : ()V
    //   43: iinc #1, 1
    //   46: goto -> 2
    //   49: return
  }
  
  public final void d() {
    for (byte b = 0; b < this.a.length; b++) {
      if (this.a[b] == null) {
        byte b1;
        for (b1 = b; b1 < this.a.length - 1; b1++)
          this.a[b1] = this.a[b1 + 1]; 
        this.a[b1] = null;
        return;
      } 
    } 
  }
  
  public final ad a(byte paramByte1, byte paramByte2) {
    byte b;
    return ((b = a(paramByte1, paramByte2)) == -1) ? null : this.a[b];
  }
  
  public final ad[] a(byte paramByte1, byte paramByte2) {
    Vector vector = new Vector(2);
    for (byte b1 = 0; b1 < this.a.length; b1++) {
      if (this.a[b1] != null && (this.a[b1]).f == paramByte1 && (this.a[b1]).g == paramByte2)
        vector.addElement(this.a[b1]); 
    } 
    ad[] arrayOfAd = new ad[vector.size()];
    for (byte b2 = 0; b2 < vector.size(); b2++)
      arrayOfAd[b2] = (ad)vector.elementAt(b2); 
    return arrayOfAd;
  }
  
  public final int a(byte paramByte1, byte paramByte2) {
    int i = 0;
    for (byte b = 0; b < this.a.length; b++) {
      if (this.a[b] != null && (this.a[b]).f == paramByte1 && (this.a[b]).g == paramByte2)
        i += (this.a[b]).h; 
    } 
    return i;
  }
  
  public final byte a(ad paramad) {
    for (byte b = 0; b < this.a.length; b = (byte)(b + 1)) {
      if (this.a[b] == paramad)
        return b; 
    } 
    return -1;
  }
  
  public final byte a(byte paramByte1, byte paramByte2) {
    for (byte b = 0; b < this.a.length; b = (byte)(b + 1)) {
      if (this.a[b] != null && (this.a[b]).f == paramByte1 && (this.a[b]).g == paramByte2)
        return b; 
    } 
    return -1;
  }
  
  public final boolean a(byte paramByte1, byte paramByte2, int paramInt) {
    e();
    byte b = b();
    if (paramInt > 99)
      return false; 
    if (b != -1)
      return true; 
    if (ad.b[paramByte1] == '\000')
      return false; 
    ad[] arrayOfAd = a(paramByte1, paramByte2);
    for (byte b1 = 0; b1 < arrayOfAd.length; b1++) {
      if ((arrayOfAd[b1]).h + paramInt <= 99)
        return true; 
    } 
    return false;
  }
  
  private final byte b() {
    for (byte b = 0; b < this.a.length; b = (byte)(b + 1)) {
      if (this.a[b] == null)
        return b; 
    } 
    return -1;
  }
  
  public final boolean a(byte paramByte1, byte paramByte2, byte paramByte3) {
    for (byte b = 0; b < this.a.length; b++) {
      if (this.a[b] != null && (this.a[b]).f == paramByte1 && (this.a[b]).g == paramByte2 && (this.a[b]).h >= paramByte3)
        return true; 
    } 
    return false;
  }
  
  public final void e() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield a : [Lad;
    //   7: arraylength
    //   8: iconst_1
    //   9: isub
    //   10: if_icmpge -> 226
    //   13: aload_0
    //   14: getfield a : [Lad;
    //   17: iload_1
    //   18: aaload
    //   19: ifnull -> 218
    //   22: getstatic ad.b : [Z
    //   25: aload_0
    //   26: getfield a : [Lad;
    //   29: iload_1
    //   30: aaload
    //   31: getfield f : B
    //   34: baload
    //   35: ifeq -> 218
    //   38: aload_0
    //   39: getfield a : [Lad;
    //   42: iload_1
    //   43: aaload
    //   44: getfield h : B
    //   47: bipush #99
    //   49: if_icmpge -> 218
    //   52: iload_1
    //   53: iconst_1
    //   54: iadd
    //   55: i2b
    //   56: istore_2
    //   57: iload_2
    //   58: aload_0
    //   59: getfield a : [Lad;
    //   62: arraylength
    //   63: if_icmpge -> 218
    //   66: aload_0
    //   67: getfield a : [Lad;
    //   70: iload_2
    //   71: aaload
    //   72: ifnull -> 210
    //   75: aload_0
    //   76: getfield a : [Lad;
    //   79: iload_2
    //   80: aaload
    //   81: getfield f : B
    //   84: aload_0
    //   85: getfield a : [Lad;
    //   88: iload_1
    //   89: aaload
    //   90: getfield f : B
    //   93: if_icmpne -> 210
    //   96: aload_0
    //   97: getfield a : [Lad;
    //   100: iload_2
    //   101: aaload
    //   102: getfield g : B
    //   105: aload_0
    //   106: getfield a : [Lad;
    //   109: iload_1
    //   110: aaload
    //   111: getfield g : B
    //   114: if_icmpne -> 210
    //   117: aload_0
    //   118: getfield a : [Lad;
    //   121: iload_1
    //   122: aaload
    //   123: getfield h : B
    //   126: istore_3
    //   127: aload_0
    //   128: getfield a : [Lad;
    //   131: iload_2
    //   132: aaload
    //   133: getfield h : B
    //   136: istore #4
    //   138: iload_3
    //   139: iload #4
    //   141: iadd
    //   142: bipush #99
    //   144: if_icmpgt -> 181
    //   147: aload_0
    //   148: getfield a : [Lad;
    //   151: iload_1
    //   152: aaload
    //   153: iload #4
    //   155: invokevirtual a : (B)V
    //   158: aload_0
    //   159: getfield a : [Lad;
    //   162: iload_2
    //   163: aconst_null
    //   164: aastore
    //   165: aload_0
    //   166: getfield a : B
    //   169: iload_2
    //   170: if_icmpne -> 210
    //   173: aload_0
    //   174: iload_1
    //   175: putfield a : B
    //   178: goto -> 210
    //   181: bipush #99
    //   183: iload_3
    //   184: isub
    //   185: i2b
    //   186: istore #5
    //   188: aload_0
    //   189: getfield a : [Lad;
    //   192: iload_1
    //   193: aaload
    //   194: iload #5
    //   196: invokevirtual a : (B)V
    //   199: aload_0
    //   200: getfield a : [Lad;
    //   203: iload_2
    //   204: aaload
    //   205: iload #5
    //   207: invokevirtual b : (B)V
    //   210: iload_2
    //   211: iconst_1
    //   212: iadd
    //   213: i2b
    //   214: istore_2
    //   215: goto -> 57
    //   218: iload_1
    //   219: iconst_1
    //   220: iadd
    //   221: i2b
    //   222: istore_1
    //   223: goto -> 2
    //   226: return
  }
  
  public final byte[] c() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_1
    //   12: new java/io/DataOutputStream
    //   15: dup
    //   16: aload_1
    //   17: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   20: dup
    //   21: astore_2
    //   22: aload_0
    //   23: getfield a : I
    //   26: invokevirtual writeInt : (I)V
    //   29: iconst_0
    //   30: istore_3
    //   31: iload_3
    //   32: aload_0
    //   33: getfield a : [Lad;
    //   36: arraylength
    //   37: if_icmpge -> 81
    //   40: aload_0
    //   41: getfield a : [Lad;
    //   44: iload_3
    //   45: aaload
    //   46: ifnonnull -> 57
    //   49: aload_2
    //   50: iconst_0
    //   51: invokevirtual writeByte : (I)V
    //   54: goto -> 75
    //   57: aload_2
    //   58: iconst_1
    //   59: invokevirtual writeByte : (I)V
    //   62: aload_2
    //   63: aload_0
    //   64: getfield a : [Lad;
    //   67: iload_3
    //   68: aaload
    //   69: invokevirtual a : ()[B
    //   72: invokevirtual write : ([B)V
    //   75: iinc #3, 1
    //   78: goto -> 31
    //   81: aload_1
    //   82: invokevirtual toByteArray : ()[B
    //   85: astore_3
    //   86: aload_2
    //   87: invokevirtual close : ()V
    //   90: aload_1
    //   91: invokevirtual close : ()V
    //   94: goto -> 98
    //   97: pop
    //   98: aload_3
    //   99: areturn
    //   100: dup
    //   101: astore_3
    //   102: invokevirtual printStackTrace : ()V
    //   105: aload_2
    //   106: ifnull -> 113
    //   109: aload_2
    //   110: invokevirtual close : ()V
    //   113: aload_1
    //   114: ifnull -> 121
    //   117: aload_1
    //   118: invokevirtual close : ()V
    //   121: goto -> 153
    //   124: pop
    //   125: goto -> 153
    //   128: astore #5
    //   130: aload_2
    //   131: ifnull -> 138
    //   134: aload_2
    //   135: invokevirtual close : ()V
    //   138: aload_1
    //   139: ifnull -> 146
    //   142: aload_1
    //   143: invokevirtual close : ()V
    //   146: goto -> 150
    //   149: pop
    //   150: aload #5
    //   152: athrow
    //   153: aconst_null
    //   154: areturn
    // Exception table:
    //   from	to	target	type
    //   4	86	100	java/io/IOException
    //   4	86	128	finally
    //   86	94	97	java/io/IOException
    //   100	105	128	finally
    //   105	121	124	java/io/IOException
    //   128	130	128	finally
    //   130	146	149	java/io/IOException
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    ByteArrayInputStream byteArrayInputStream = null;
    DataInputStream dataInputStream = null;
    try {
      byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
      dataInputStream = new DataInputStream(byteArrayInputStream);
      this.a = dataInputStream.readInt();
      byte b1 = 0;
      for (byte b2 = 0; b2 < this.a.length; b2++) {
        byte b;
        if ((b = dataInputStream.readByte()) != 0) {
          byte[] arrayOfByte = new byte[10];
          dataInputStream.read(arrayOfByte);
          this.a[b1++] = ad.a(arrayOfByte);
        } 
      } 
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
    } finally {
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
        if (byteArrayInputStream != null)
          byteArrayInputStream.close(); 
      } catch (IOException iOException) {}
    } 
    a();
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */