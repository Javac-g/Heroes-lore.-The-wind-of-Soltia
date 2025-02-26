package Graphics;

import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class br {
  private static final String[] a = new String[] { 
      "IHDR", "cHRM", "gAMA", "iCCP", "sBIT", "sRGB", "tEXt", "zTXt", "iTXt", "pHYs", 
      "sPLT", "tIME", "PLTE", "tRNS", "hIST", "bKGD", "IDAT", "IEND" };
  
  private static final byte[] a = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
  
  private static final byte[] b = new byte[] { 
      0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 
      96, -126 };
  
  private String a;
  
  private boolean b;
  
  private boolean c;
  
  private int a;
  
  private int[] a;
  
  private byte[] c;
  
  private Object[] a;
  
  private char[] a;
  
  private int b;
  
  private int c;
  
  public boolean a = false;
  
  private static ca a = new ca();
  
  private static an a = new an();
  
  public br() {}
  
  public br(String paramString) throws IOException {
    a(paramString);
  }
  
  public final void a(String paramString) throws IOException {
    this.a = null;
    this.c = null;
    this.a = null;
    this.a = null;
    this.a = (an)paramString;
    b();
  }
  
  private void b() throws IOException {
    this.c = ce.a(this.a + ".mph");
    c();
  }
  
  public final void a(int paramInt) throws IOException {
    this.a[paramInt] = (an)ce.a(this.a + "_" + paramInt + ".mpd");
  }
  
  public final void b(int paramInt) {
    this.a[paramInt] = null;
  }
  
  public final void a() {
    for (byte b = 0; b < this.a; b++)
      b(b); 
    System.gc();
  }
  
  private void c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : [B
    //   4: iconst_0
    //   5: invokestatic a : ([BI)I
    //   8: istore_1
    //   9: aload_0
    //   10: iload_1
    //   11: bipush #27
    //   13: ishr
    //   14: iconst_2
    //   15: irem
    //   16: iconst_1
    //   17: if_icmpne -> 24
    //   20: iconst_1
    //   21: goto -> 25
    //   24: iconst_0
    //   25: putfield b : Z
    //   28: aload_0
    //   29: iload_1
    //   30: bipush #26
    //   32: ishr
    //   33: iconst_2
    //   34: irem
    //   35: iconst_1
    //   36: if_icmpne -> 43
    //   39: iconst_1
    //   40: goto -> 44
    //   43: iconst_0
    //   44: putfield c : Z
    //   47: aload_0
    //   48: invokevirtual a : ()I
    //   51: istore_2
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield a : I
    //   57: iconst_0
    //   58: istore_3
    //   59: iload_3
    //   60: iload_2
    //   61: if_icmpge -> 113
    //   64: aload_0
    //   65: getfield a : I
    //   68: aload_0
    //   69: getfield c : [B
    //   72: bipush #8
    //   74: bipush #8
    //   76: iload_3
    //   77: imul
    //   78: iadd
    //   79: invokestatic a : ([BI)C
    //   82: iconst_1
    //   83: iadd
    //   84: if_icmpge -> 107
    //   87: aload_0
    //   88: aload_0
    //   89: getfield c : [B
    //   92: bipush #8
    //   94: bipush #8
    //   96: iload_3
    //   97: imul
    //   98: iadd
    //   99: invokestatic a : ([BI)C
    //   102: iconst_1
    //   103: iadd
    //   104: putfield a : I
    //   107: iinc #3, 1
    //   110: goto -> 59
    //   113: aload_0
    //   114: aload_0
    //   115: getfield a : I
    //   118: newarray int
    //   120: putfield a : [I
    //   123: iconst_0
    //   124: istore_3
    //   125: iload_3
    //   126: iload_2
    //   127: if_icmpge -> 159
    //   130: aload_0
    //   131: getfield a : [I
    //   134: aload_0
    //   135: getfield c : [B
    //   138: bipush #8
    //   140: bipush #8
    //   142: iload_3
    //   143: imul
    //   144: iadd
    //   145: invokestatic a : ([BI)C
    //   148: dup2
    //   149: iaload
    //   150: iconst_1
    //   151: iadd
    //   152: iastore
    //   153: iinc #3, 1
    //   156: goto -> 125
    //   159: aload_0
    //   160: aload_0
    //   161: getfield a : I
    //   164: anewarray java/lang/Object
    //   167: putfield a : [Ljava/lang/Object;
    //   170: aload_0
    //   171: iload_2
    //   172: newarray char
    //   174: putfield a : [C
    //   177: iconst_0
    //   178: istore_3
    //   179: iload_3
    //   180: iload_2
    //   181: if_icmpge -> 213
    //   184: aload_0
    //   185: getfield a : [C
    //   188: iload_3
    //   189: aload_0
    //   190: getfield c : [B
    //   193: bipush #8
    //   195: bipush #8
    //   197: iload_3
    //   198: imul
    //   199: iadd
    //   200: bipush #6
    //   202: iadd
    //   203: invokestatic a : ([BI)C
    //   206: castore
    //   207: iinc #3, 1
    //   210: goto -> 179
    //   213: aload_0
    //   214: aload_0
    //   215: getfield c : [B
    //   218: bipush #12
    //   220: invokestatic b : ([BI)I
    //   223: putfield b : I
    //   226: aload_0
    //   227: aload_0
    //   228: getfield c : [B
    //   231: bipush #13
    //   233: invokestatic b : ([BI)I
    //   236: putfield c : I
    //   239: return
  }
  
  public final int a() {
    return a(this.c, 4);
  }
  
  public final Image a(int paramInt) {
    byte[] arrayOfByte;
    Image image;
    return image = Image.createImage(arrayOfByte = b(paramInt), 0, arrayOfByte.length);
  }
  
  public final Image[] a() {
    this.a = true;
    int i;
    Image[] arrayOfImage = new Image[i = a()];
    for (byte b = 0; b < i; b++) {
      arrayOfImage[b] = a(b);
      r.k();
    } 
    a();
    return arrayOfImage;
  }
  
  public final Image b(int paramInt) {
    if (this.c == 0)
      return a(paramInt); 
    byte[] arrayOfByte;
    a(arrayOfByte = b(paramInt));
    return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public final Image c(int paramInt) {
    byte[] arrayOfByte;
    a(arrayOfByte = b(paramInt), 1);
    return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (this.b == 0)
      return; 
    b(this.c, this.b, 4, paramInt1, paramInt2);
  }
  
  private byte[] a(int paramInt) {
    int i = a(paramInt);
    if (this.a != null && this.a[i] == null) {
      a();
      try {
        a(i);
      } catch (IOException iOException) {
        System.out.println("[PNGMerger ERROR] cannot load mpd '" + this.a + "' no." + i);
        iOException.printStackTrace();
      } 
    } 
    return (byte[])this.a[i];
  }
  
  private int a(int paramInt) {
    return a(this.c, 8 + 8 * paramInt);
  }
  
  private byte[] b(int paramInt) {
    return (this.b != 0) ? d(paramInt) : c(paramInt);
  }
  
  private byte[] c(int paramInt) {
    byte[] arrayOfByte1 = a(paramInt);
    int i = 0;
    int j = a(this.c, 8 + paramInt * 8 + 2);
    int k = b(paramInt);
    int m = 0;
    m = 8 + k;
    m += 12;
    byte[] arrayOfByte2 = new byte[m];
    System.arraycopy(a, 0, arrayOfByte2, 0, 8);
    System.arraycopy(arrayOfByte1, j, arrayOfByte2, 8, k);
    i = 8 + k;
    System.arraycopy(b, 0, arrayOfByte2, i, 12);
    return arrayOfByte2;
  }
  
  private byte[] d(int paramInt) {
    byte[] arrayOfByte1 = a(paramInt);
    int i = 0;
    int m = a(this.c, 8 + paramInt * 8 + 2);
    int n = b(paramInt);
    int i1 = 0;
    i1 = (i1 = 8 + this.c.length - a(this.c, 4) * 8 + 8) + n;
    i1 += 12;
    byte[] arrayOfByte2 = new byte[i1];
    System.arraycopy(a, 0, arrayOfByte2, 0, 8);
    int j;
    if ((j = a(arrayOfByte1, 0, m, n)) == -1)
      return null; 
    int k = a(arrayOfByte1, j) + 12;
    System.arraycopy(arrayOfByte1, j, arrayOfByte2, 8, k);
    i = 8 + k;
    for (byte b = 0; b < 18; b++) {
      if (a(paramInt, b))
        switch (b) {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 9:
          case 10:
            if ((j = a(arrayOfByte1, b, m, n)) != -1) {
              k = a(arrayOfByte1, j) + 12;
              System.arraycopy(arrayOfByte1, j, arrayOfByte2, i, k);
              i += k;
            } 
            break;
        }  
    } 
    j = this.b;
    k = a(this.c, j) + 12;
    System.arraycopy(this.c, j, arrayOfByte2, i, k);
    i += k;
    if ((j = this.c) != -1) {
      k = a(this.c, j) + 12;
      System.arraycopy(this.c, j, arrayOfByte2, i, k);
      i += k;
    } 
    if (a(paramInt, 14) && (j = a(arrayOfByte1, 14, m, n)) != -1) {
      k = a(arrayOfByte1, j) + 12;
      System.arraycopy(arrayOfByte1, j, arrayOfByte2, i, k);
      i += k;
    } 
    if (a(paramInt, 15) && (j = a(arrayOfByte1, 15, m, n)) != -1) {
      k = a(arrayOfByte1, j) + 12;
      System.arraycopy(arrayOfByte1, j, arrayOfByte2, i, k);
      i += k;
    } 
    j = a(arrayOfByte1, 16, m, n);
    k = a(arrayOfByte1, j) + 12;
    System.arraycopy(arrayOfByte1, j, arrayOfByte2, i, k);
    i += k;
    System.arraycopy(b, 0, arrayOfByte2, i, 12);
    return arrayOfByte2;
  }
  
  private int b(int paramInt) {
    byte[] arrayOfByte = a(paramInt);
    int i = 0;
    int j = 0;
    i = a(this.c, 8 + paramInt * 8 + 2);
    if (paramInt == a() - 1 || a(this.c, 8 + paramInt * 8) != a(this.c, 8 + (paramInt + 1) * 8)) {
      j = arrayOfByte.length;
    } else {
      j = a(this.c, 8 + (paramInt + 1) * 8 + 2);
    } 
    return j - i;
  }
  
  private static int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int i;
    an an1 = a[paramInt1];
    if (paramInt3 == -1) {
      i = paramArrayOfbyte.length;
    } else {
      i = paramInt2 + paramInt3;
    } 
    int j;
    for (j = paramInt2; j < i; j += a(paramArrayOfbyte, j) + 12) {
      if (paramArrayOfbyte[j + 4] == an1.charAt(0) && paramArrayOfbyte[j + 5] == an1.charAt(1) && paramArrayOfbyte[j + 6] == an1.charAt(2) && paramArrayOfbyte[j + 7] == an1.charAt(3))
        return j; 
    } 
    return -1;
  }
  
  private static int a(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte.length - 4 < paramInt)
      throw new ArrayIndexOutOfBoundsException(); 
    int i = 0;
    return i = (i = (i = (i = 0 + (paramArrayOfbyte[paramInt] & 0xFF) * 16777216) + (paramArrayOfbyte[paramInt + 1] & 0xFF) * 65536) + (paramArrayOfbyte[paramInt + 2] & 0xFF) * 256) + (paramArrayOfbyte[paramInt + 3] & 0xFF);
  }
  
  private static char a(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte.length - 2 < paramInt)
      throw new ArrayIndexOutOfBoundsException(); 
    char c = Character.MIN_VALUE;
    return c = (char)((c = (char)(0 + (paramArrayOfbyte[paramInt] & 0xFF) * 256)) + (paramArrayOfbyte[paramInt + 1] & 0xFF));
  }
  
  private boolean a(int paramInt1, int paramInt2) {
    an an1 = this.a[paramInt1];
    return (paramInt2 < 1 || paramInt2 > 16) ? false : (((an1 >> paramInt2 - 1 & 0x1) == 1));
  }
  
  private static int b(byte[] paramArrayOfbyte, int paramInt) {
    an an1 = a[paramInt];
    int i = paramArrayOfbyte.length;
    byte b = 0;
    while (b < i - 3) {
      if (paramArrayOfbyte[b] != an1.charAt(0) || paramArrayOfbyte[b + 1] != an1.charAt(1) || paramArrayOfbyte[b + 2] != an1.charAt(2) || paramArrayOfbyte[b + 3] != an1.charAt(3)) {
        b++;
        continue;
      } 
      return b - 4;
    } 
    return -1;
  }
  
  public static final void a(byte[] paramArrayOfbyte) {
    int k = a(paramArrayOfbyte, 16, 8, paramArrayOfbyte.length);
    int m = a(paramArrayOfbyte, 0, 8, paramArrayOfbyte.length);
    int i = a(paramArrayOfbyte, m + 8);
    int j = a(paramArrayOfbyte, m + 12);
    byte b = paramArrayOfbyte[m + 16];
    a(paramArrayOfbyte, k, i, j, b);
  }
  
  private static void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = 8 / paramInt4;
    int j = paramInt3;
    int k = (paramInt2 - 1) / i + 1;
    byte b = (byte)(255 >> 8 - paramInt4);
    int m = paramInt1 + 15;
    int n = (k + 1) * j;
    int i1 = paramInt2 / 2;
    int i2;
    int i3 = (i2 = m + n) + 4;
    int i4 = paramInt1 + 4;
    int i5;
    for (i5 = 0; i5 < j; i5++) {
      if (paramArrayOfbyte[m + (k + 1) * i5] != 0)
        return; 
    } 
    for (byte b1 = 0; b1 < j; b1++) {
      i5 = m + (k + 1) * b1 + 1;
      for (byte b2 = 0; b2 < i1; b2++) {
        int i11 = paramInt2 - 1 - b2;
        int i7 = i5 + b2 / i;
        int i8 = i5 + i11 / i;
        int i9 = b2 % i;
        int i10 = i11 % i;
        byte b3 = (byte)((i - i9 - 1) * paramInt4);
        byte b4 = (byte)((i - i10 - 1) * paramInt4);
        byte b5 = (byte)(paramArrayOfbyte[i7] >> b3 & b);
        byte b6 = (byte)(paramArrayOfbyte[i8] >> b4 & b);
        paramArrayOfbyte[i7] = (byte)(paramArrayOfbyte[i7] & (b << b3 ^ 0xFFFFFFFF) | b6 << b3);
        paramArrayOfbyte[i8] = (byte)(paramArrayOfbyte[i8] & (b << b4 ^ 0xFFFFFFFF) | b5 << b4);
      } 
    } 
    a.a();
    a.a(paramArrayOfbyte, m, n);
    long l;
    System.arraycopy(e((int)(l = a.a())), 0, paramArrayOfbyte, i2, 4);
    a.a();
    a.a(paramArrayOfbyte, i4, n + 15);
    int i6;
    System.arraycopy(e(i6 = a.a()), 0, paramArrayOfbyte, i3, 4);
  }
  
  public static final void a(byte[] paramArrayOfbyte, int paramInt) {
    a(paramArrayOfbyte, paramInt, 0);
  }
  
  public static final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = a(paramArrayOfbyte, 12, 8, paramArrayOfbyte.length);
    b(paramArrayOfbyte, i, paramInt1, paramInt2, 0);
  }
  
  private static void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b1;
    byte b2;
    byte b3;
    byte b4;
    byte b5;
    byte b;
    int i = a(paramArrayOfbyte, paramInt1);
    int j;
    int k = (j = paramInt1 + 8) + i;
    switch (paramInt2) {
      case 0:
        switch (paramInt3) {
          case 0:
            for (m = 0; m < i / 3; m++) {
              byte b6 = paramArrayOfbyte[j + m * 3];
              paramArrayOfbyte[j + m * 3] = paramArrayOfbyte[j + m * 3 + 1];
              paramArrayOfbyte[j + m * 3 + 1] = b6;
            } 
            break;
          case 1:
            for (m = 0; m < i / 3; m++) {
              byte b6 = paramArrayOfbyte[j + m * 3 + 1];
              paramArrayOfbyte[j + m * 3 + 1] = paramArrayOfbyte[j + m * 3 + 2];
              paramArrayOfbyte[j + m * 3 + 2] = b6;
            } 
            break;
          case 2:
            for (m = 0; m < i / 3; m++) {
              byte b6 = paramArrayOfbyte[j + m * 3];
              paramArrayOfbyte[j + m * 3] = paramArrayOfbyte[j + m * 3 + 2];
              paramArrayOfbyte[j + m * 3 + 2] = b6;
            } 
            break;
          case 3:
            for (m = 0; m < i / 3; m++) {
              byte b6 = paramArrayOfbyte[j + m * 3];
              paramArrayOfbyte[j + m * 3] = paramArrayOfbyte[j + m * 3 + 2];
              paramArrayOfbyte[j + m * 3 + 2] = paramArrayOfbyte[j + m * 3 + 1];
              paramArrayOfbyte[j + m * 3 + 1] = b6;
            } 
            break;
          case 4:
            for (m = 0; m < i / 3; m++) {
              byte b6 = paramArrayOfbyte[j + m * 3];
              paramArrayOfbyte[j + m * 3] = paramArrayOfbyte[j + m * 3 + 1];
              paramArrayOfbyte[j + m * 3 + 1] = paramArrayOfbyte[j + m * 3 + 2];
              paramArrayOfbyte[j + m * 3 + 2] = b6;
            } 
            break;
        } 
        break;
      case 1:
        for (m = 0; m < i / 3; m++) {
          int n = paramArrayOfbyte[j + m * 3] & 0xFF;
          int i1 = paramArrayOfbyte[j + m * 3 + 1] & 0xFF;
          int i2 = paramArrayOfbyte[j + m * 3 + 2] & 0xFF;
          byte b6 = (byte)((n + i1 + i2) / 3);
          paramArrayOfbyte[j + m * 3] = b6;
          paramArrayOfbyte[j + m * 3 + 1] = b6;
          paramArrayOfbyte[j + m * 3 + 2] = b6;
        } 
        break;
      case 2:
        for (m = 0; m < i / 3; m++) {
          int n = paramArrayOfbyte[j + m * 3] & 0xFF;
          int i1 = paramArrayOfbyte[j + m * 3 + 1] & 0xFF;
          int i2 = paramArrayOfbyte[j + m * 3 + 2] & 0xFF;
          paramArrayOfbyte[j + m * 3] = (byte)((n * paramInt3 * 10 / 1000 < 255) ? (n * paramInt3 * 10 / 1000) : 255);
          paramArrayOfbyte[j + m * 3 + 1] = (byte)((i1 * paramInt3 * 10 / 1000 < 255) ? (i1 * paramInt3 * 10 / 1000) : 255);
          paramArrayOfbyte[j + m * 3 + 2] = (byte)((i2 * paramInt3 * 10 / 1000 < 255) ? (i2 * paramInt3 * 10 / 1000) : 255);
        } 
        break;
      case 3:
        for (m = 0; m < i / 3; m++) {
          paramArrayOfbyte[j + m * 3] = (byte)(paramArrayOfbyte[j + m * 3] ^ 0xFFFFFFFF);
          paramArrayOfbyte[j + m * 3 + 1] = (byte)(paramArrayOfbyte[j + m * 3 + 1] ^ 0xFFFFFFFF);
          paramArrayOfbyte[j + m * 3 + 2] = (byte)(paramArrayOfbyte[j + m * 3 + 2] ^ 0xFFFFFFFF);
        } 
        break;
      case 4:
        m = (byte)(paramInt3 >> 16 & 0xFF);
        b1 = (byte)(paramInt3 >> 8 & 0xFF);
        b2 = (byte)(paramInt3 & 0xFF);
        b3 = (byte)(paramInt4 >> 16 & 0xFF);
        b4 = (byte)(paramInt4 >> 8 & 0xFF);
        b5 = (byte)(paramInt4 & 0xFF);
        for (b = 0; b < i / 3; b++) {
          if (paramArrayOfbyte[j + b * 3] == m && paramArrayOfbyte[j + b * 3 + 1] == b1 && paramArrayOfbyte[j + b * 3 + 2] == b2) {
            paramArrayOfbyte[j + b * 3] = b3;
            paramArrayOfbyte[j + b * 3 + 1] = b4;
            paramArrayOfbyte[j + b * 3 + 2] = b5;
          } 
        } 
        break;
    } 
    a.a();
    a.a(paramArrayOfbyte, paramInt1 + 4, i + 4);
    int m;
    System.arraycopy(e(m = a.a()), 0, paramArrayOfbyte, k, 4);
  }
  
  private static byte[] e(int paramInt) {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[4])[0] = (byte)(paramInt >> 24 & 0xFF);
    arrayOfByte[1] = (byte)(paramInt >> 16 & 0xFF);
    arrayOfByte[2] = (byte)(paramInt >> 8 & 0xFF);
    arrayOfByte[3] = (byte)(paramInt & 0xFF);
    return arrayOfByte;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/br.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */