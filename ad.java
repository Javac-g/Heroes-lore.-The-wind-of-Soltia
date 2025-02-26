import java.util.Vector;

public class ad {
  public static z b;
  
  public static final boolean[] b = new boolean[] { 
      false, false, false, false, false, false, false, true, true, true, 
      true, true, true, true, true, true, true, true, false, false, 
      false, false, true, true };
  
  public static final boolean[] c = new boolean[] { 
      false, false, false, false, false, false, false, true, false, true, 
      false, false, true, true, true, true, true, false, false, false, 
      false, false, false, false };
  
  public byte f;
  
  public byte g;
  
  public char[] a;
  
  public char[] b;
  
  public int a;
  
  public byte h;
  
  public ad(byte paramByte1, byte paramByte2) {
    this.f = paramByte1;
    this.g = paramByte2;
    this.h = 1;
  }
  
  public final void a(boolean paramBoolean) {
    byte[] arrayOfByte = ce.a(this.f, this.g);
    boolean bool = false;
    a(paramBoolean, arrayOfByte, 1);
  }
  
  public int a(boolean paramBoolean, byte[] paramArrayOfbyte, int paramInt) {
    return paramInt = (paramInt = (paramInt += a(paramArrayOfbyte, paramInt)) + b(paramArrayOfbyte, paramInt)) + c(paramArrayOfbyte, paramInt);
  }
  
  public final int a(byte[] paramArrayOfbyte, int paramInt) {
    byte b = paramArrayOfbyte[paramInt++];
    this.a = bh.a(new String(paramArrayOfbyte, paramInt, b));
    return 1 + b;
  }
  
  public final int b(byte[] paramArrayOfbyte, int paramInt) {
    byte b = paramArrayOfbyte[paramInt++];
    this.b = bh.a(new String(paramArrayOfbyte, paramInt, b));
    return 1 + b;
  }
  
  public final int c(byte[] paramArrayOfbyte, int paramInt) {
    this.a += (paramArrayOfbyte[paramInt + 3] & 0xFF) * 16777216;
    this.a += (paramArrayOfbyte[paramInt + 2] & 0xFF) * 65536;
    this.a += (paramArrayOfbyte[paramInt + 1] & 0xFF) * 256;
    this.a += paramArrayOfbyte[paramInt] & 0xFF;
    return 4;
  }
  
  public byte[] a() {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[10])[0] = this.f;
    arrayOfByte[1] = this.g;
    arrayOfByte[2] = this.h;
    return arrayOfByte;
  }
  
  public final void a(byte paramByte) {
    this.h = (byte)(this.h + paramByte);
  }
  
  public final void b(byte paramByte) {
    this.h = (byte)(this.h - paramByte);
  }
  
  public final char[] a() {
    return b.a(this.f);
  }
  
  public final boolean a() {
    return (this.f == 10 || this.f == 7 || this.f == 8 || this.f == 9);
  }
  
  public final boolean b() {
    return (this.f == 18 || this.f == 19 || this.f == 20 || this.f == 21);
  }
  
  public static final ad a(byte paramByte1, byte paramByte2, boolean paramBoolean1, boolean paramBoolean2) {
    t t;
    e e;
    ad ad1;
    l l = null;
    switch (paramByte1) {
      case 0:
      case 1:
      case 2:
        l = new l(paramByte1, paramByte2);
        break;
      case 3:
        t = new t(paramByte1, paramByte2);
        break;
      case 4:
      case 5:
      case 6:
        e = new e(paramByte1, paramByte2);
        break;
      default:
        ad1 = new ad(paramByte1, paramByte2);
        break;
    } 
    if (paramBoolean1)
      ad1.a(paramBoolean2); 
    ad1.h = 1;
    return ad1;
  }
  
  public static final ad a(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    t t;
    e e;
    ad ad1;
    l l = null;
    byte b1 = paramArrayOfbyte[paramInt++];
    byte b2 = paramArrayOfbyte[paramInt++];
    switch (b1) {
      case 0:
      case 1:
      case 2:
        l = new l(b1, b2);
        break;
      case 3:
        t = new t(b1, b2);
        break;
      case 4:
      case 5:
      case 6:
        e = new e(b1, b2);
        break;
      default:
        ad1 = new ad(b1, b2);
        break;
    } 
    if (paramBoolean1)
      ad1.a(paramBoolean2, paramArrayOfbyte, paramInt); 
    return ad1;
  }
  
  public static final ad a(byte[] paramArrayOfbyte) {
    ad ad1;
    (ad1 = a(paramArrayOfbyte[0], paramArrayOfbyte[1], true, true)).h = paramArrayOfbyte[2];
    if (ad1 instanceof e) {
      ((e)ad1).b = (paramArrayOfbyte[3] == 1);
      ((e)ad1).e = paramArrayOfbyte[4];
      ((e)ad1).a(paramArrayOfbyte[5], paramArrayOfbyte[6], paramArrayOfbyte[7], paramArrayOfbyte[8]);
    } 
    if (ad1 instanceof t)
      ((t)ad1).c = paramArrayOfbyte[9]; 
    return ad1;
  }
  
  public static final Vector[] a() {
    Vector[] arrayOfVector = new Vector[6];
    for (byte b1 = 0; b1 < 6; b1++)
      arrayOfVector[b1] = new Vector(); 
    byte[] arrayOfByte = ce.a();
    int i = 0;
    while (i < arrayOfByte.length) {
      byte b = arrayOfByte[i++];
      ad ad1 = a(arrayOfByte, i, true, false);
      i += b;
      switch (ad1.f) {
        case 7:
        case 9:
        case 10:
          arrayOfVector[0].addElement(ad1);
        case 0:
        case 1:
        case 2:
          ((e)ad1).b = true;
          arrayOfVector[1].addElement(ad1);
        case 3:
          ((e)ad1).b = true;
          arrayOfVector[2].addElement(ad1);
        case 5:
          ((e)ad1).b = true;
          arrayOfVector[3].addElement(ad1);
        case 6:
          ((e)ad1).b = true;
          arrayOfVector[4].addElement(ad1);
        case 4:
          ((e)ad1).b = true;
          arrayOfVector[5].addElement(ad1);
      } 
    } 
    for (byte b2 = 0; b2 < 6; b2++)
      arrayOfVector[b2].trimToSize(); 
    return arrayOfVector;
  }
  
  public static final ad a(ad paramad1, ad paramad2, ad paramad3) {
    byte b1 = 0;
    if (paramad1 != null)
      b1++; 
    if (paramad2 != null)
      b1++; 
    if (paramad3 != null)
      b1++; 
    byte[] arrayOfByte = ce.a("/itm/mixtbl");
    byte b2 = 0;
    while (b2 < arrayOfByte.length) {
      ad[] arrayOfAd = { paramad1, paramad2, paramad3 };
      byte b3 = arrayOfByte[b2++];
      boolean bool = true;
      byte b;
      for (b = 0; b < b3; b++) {
        byte b5 = arrayOfByte[b2++];
        byte b6 = arrayOfByte[b2++];
        boolean bool1 = false;
        for (byte b7 = 0; b7 < 3; b7++) {
          if (arrayOfAd[b7] != null && (arrayOfAd[b7]).f == b5 && (arrayOfAd[b7]).g == b6) {
            bool1 = true;
            arrayOfAd[b7] = null;
            break;
          } 
        } 
        if (!bool1)
          bool = false; 
      } 
      b = arrayOfByte[b2++];
      byte b4 = arrayOfByte[b2++];
      if (b3 != b1)
        bool = false; 
      if (bool)
        return a(b, b4, true, true); 
    } 
    return null;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ad.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */