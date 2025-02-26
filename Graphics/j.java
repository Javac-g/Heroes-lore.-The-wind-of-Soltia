package Graphics;

public final class j {
  public static j[] a;
  
  public static final byte[] a = new byte[] { 
      3, 2, 6, 2, 2, 1, 3, 4, 3, 2, 
      3, 4, 2, 3, 2, 2, 2, 3, 3, 3, 
      3, 3, 6, 3, 3, 3, 2, 2, 2, 3, 
      3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 
      1, 1 };
  
  public char[] a;
  
  public byte a;
  
  public byte b;
  
  public byte c;
  
  public byte d;
  
  public boolean a;
  
  public boolean b;
  
  public boolean c;
  
  public boolean d;
  
  public byte e;
  
  public byte f;
  
  public short a;
  
  public short b;
  
  public short c;
  
  public short d;
  
  public byte g;
  
  public byte h;
  
  public byte i;
  
  public short e;
  
  public byte[] b;
  
  public byte j;
  
  public byte k;
  
  public byte l;
  
  public byte m;
  
  public static final void a(int paramInt) {
    a = new j[paramInt];
  }
  
  public static final void a(byte[] paramArrayOfbyte, byte paramByte1, byte paramByte2) {
    int i = 1;
    for (byte b1 = 0; b1 < paramByte1; b1++) {
      short s = h.a(paramArrayOfbyte, i);
      i += 2 + s;
    } 
    i += 2;
    j j1 = new j();
    i++;
    byte b = paramArrayOfbyte[++i];
    j1.a = bh.a(new String(paramArrayOfbyte, i, b));
    i += b;
    b = paramArrayOfbyte[i++];
    j1.a = (byte)(b >> 6 & 0x3);
    j1.b = (byte)(b >> 4 & 0x3);
    j1.c = (byte)(b >> 2 & 0x3);
    j1.d = (byte)(b & 0x3);
    b = paramArrayOfbyte[i++];
    j1.a = ((b >> 3 & 0x1) == 1) ? 1 : 0;
    j1.b = ((b >> 2 & 0x1) == 1) ? 1 : 0;
    j1.c = ((b >> 1 & 0x1) == 1) ? 1 : 0;
    j1.d = ((b & 0x1) == 1) ? 1 : 0;
    if (j1.c != 0)
      j1.e = (byte)(b >> 6 & 0x3); 
    j1.f = paramArrayOfbyte[i++];
    j1.a = h.a(paramArrayOfbyte, i);
    i += 2;
    j1.b = h.a(paramArrayOfbyte, i);
    i += 2;
    j1.c = h.a(paramArrayOfbyte, i);
    i += 2;
    j1.d = h.a(paramArrayOfbyte, i);
    i += 2;
    j1.g = paramArrayOfbyte[i++];
    j1.h = paramArrayOfbyte[i++];
    j1.i = paramArrayOfbyte[i++];
    j1.e = h.a(paramArrayOfbyte, i);
    i += 2;
    b = paramArrayOfbyte[i++];
    j1.b = new byte[3 * b];
    System.arraycopy(paramArrayOfbyte, i, j1.b, 0, j1.b.length);
    a[paramByte2] = j1;
  }
  
  public static final void a(byte paramByte) {
    short s = a[paramByte];
    byte[] arrayOfByte;
    x.a(((arrayOfByte = (byte[])ce.e[paramByte * 12 + 0]) != null));
    s.j = arrayOfByte[0];
    x.a(((arrayOfByte = (byte[])ce.e[paramByte * 12 + 4]) != null));
    s.k = arrayOfByte[0];
    x.a(((arrayOfByte = (byte[])ce.e[paramByte * 12 + 8]) != null));
    s.l = arrayOfByte[0];
  }
  
  public static final void b(byte paramByte) {
    short s = a[paramByte];
    byte[] arrayOfByte;
    x.a(((arrayOfByte = (byte[])ce.h[paramByte * 16 + 0]) != null));
    s.j = arrayOfByte[0];
    if ((arrayOfByte = (byte[])ce.h[paramByte * 16 + 4]) != null) {
      s.k = arrayOfByte[0];
    } else {
      s.k = -1;
    } 
    if ((arrayOfByte = (byte[])ce.h[paramByte * 16 + 12]) != null) {
      s.l = arrayOfByte[0];
    } else {
      s.l = -1;
    } 
    if ((arrayOfByte = (byte[])ce.h[paramByte * 16 + 8]) != null) {
      s.m = arrayOfByte[0];
      return;
    } 
    s.m = -1;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */