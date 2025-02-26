import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class n implements u {
  private static byte[] h = new byte[] { 60, 30, 10 };
  
  private static byte[] i = new byte[] { 5, 11, 8, 81, 3, 20 };
  
  private static final byte[] j = new byte[] { 0, 22, 4, 60, 5, 36, 77, 10, 18 };
  
  public static final String[] a = new String[] { "/k", "/s", "/w" };
  
  public static ae a;
  
  public static int a;
  
  public static int b;
  
  public static int c;
  
  public static int d;
  
  private static ao a;
  
  public static byte a;
  
  public static int e = 0;
  
  public static byte b = 0;
  
  public static byte c;
  
  public static byte d;
  
  public static byte e;
  
  public static byte f;
  
  private static byte h = 0;
  
  private static byte i = 0;
  
  private static byte[] k = new byte[128];
  
  private static byte[] l = new byte[128];
  
  public static byte g;
  
  public static final boolean[][] a = new boolean[][] { { 
        true, true, true, true, true, true, false, false, false, false, 
        false, false, false, false, false }, { 
        true, false, true, false, false, false, false, true, true, true, 
        true, false, false, true, true }, { 
        true, true, true, true, false, false, false, false, false, false, 
        false, false, false, false, false } };
  
  public static final void a() {
    g = 0;
    a.c(a);
    try {
      byte[] arrayOfByte1 = new byte[2];
      au au;
      (au = new au("/o", 1)).b(arrayOfByte1, 0, arrayOfByte1.length);
      byte[] arrayOfByte2 = new byte[(arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF];
      au.b(arrayOfByte2, 0, arrayOfByte2.length);
      arrayOfByte2 = bq.b(arrayOfByte2, i);
      ((ao)a).b.a(arrayOfByte2);
      au.a();
    } catch (Exception exception) {}
    l();
    m();
    b(0);
    f = j[(a - 6) * 3];
    c = j[(a - 6) * 3 + 1];
    d = j[(a - 6) * 3 + 2];
  }
  
  public static final void b() {
    l();
    m();
    b(0);
    try {
      r();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      a();
      return;
    } 
  }
  
  public static final void c() {
    ((ao)a).f = (byte)(((ao)a).f + a(a));
    if (((ao)a).f > 100)
      ((ao)a).f = 100; 
    g = 1;
    bs.a.b = 1;
    try {
      bs.a.i();
    } catch (Exception exception) {}
    l();
    m();
    b(0);
    ((ao)a).a.c();
    ((ao)a).a = ((ao)a).d;
    ((ao)a).b = ((ao)a).e;
    f = j[(a - 6) * 3];
    c = j[(a - 6) * 3 + 1];
    d = j[(a - 6) * 3 + 2];
  }
  
  public static final synchronized void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    c = paramByte2;
    d = paramByte3;
    e = paramByte4;
    b = paramByte1;
  }
  
  public static final synchronized void a(byte paramByte1, byte paramByte2, byte paramByte3) {
    c = paramByte2;
    d = paramByte3;
    e = 0;
    b = paramByte1;
  }
  
  public static final synchronized void a(byte paramByte1, byte paramByte2) {
    c = paramByte2;
    d = 0;
    e = 0;
    b = paramByte1;
  }
  
  public static final synchronized void a(byte paramByte) {
    c = 0;
    d = 0;
    e = 0;
    b = paramByte;
  }
  
  public static final void d() {
    b = 0;
    c = 0;
    d = 0;
    e = 0;
  }
  
  public static final void e() {
    if (b == 0)
      return; 
    byte b = b;
    b = 0;
    switch (b) {
      case 1:
        a(1);
        bs.a.g();
        bu.b();
        return;
      case 11:
        switch (c) {
          case 0:
            a(6);
            bp.a().d();
            break;
          case 1:
            a(7);
            ax.a().d();
            break;
          case 2:
            a(8);
            Second.a().d();
            break;
        } 
        return;
      case 12:
        a(2);
        switch (c) {
          case 1:
            ax.a().e();
            break;
          case 2:
            Second.a().e();
            break;
        } 
        return;
      case 13:
        a(5);
        ai.a().d();
        if ((x.a && c == 1) || (w.c && ((ao)a).g >= 8)) {
          ai.a().e();
          return;
        } 
        break;
      case 14:
        if (c == 1) {
          ai.a().a(false);
          a(1);
          bu.d();
          return;
        } 
        ai.a().a(true);
        return;
      case 2:
        a(c);
        if (d == 0) {
          bs.a.a(e);
          return;
        } 
        if (d == 1) {
          bs.a.f();
          return;
        } 
        if (d == 2) {
          bs.a.g();
          return;
        } 
        if (d == 3) {
          bs.a.h();
          return;
        } 
        break;
      case 15:
        f();
        return;
      case 16:
        a(10);
        bw.a((byte)12);
        bw.a((byte)12, false);
        as.e = 16;
        return;
      case 21:
        if (c == 1) {
          b();
        } else if (c == 0) {
          a();
        } else if (c == 2) {
          c();
          ai.a().a(false);
          a(1);
          bu.d();
          bw.f();
          return;
        } 
        a(1);
        bs.a.g();
        bu.a();
        break;
    } 
  }
  
  public static final void b(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    System.gc();
    a((byte)1, paramByte2, paramByte3, paramByte4);
    bw.e();
    bw.f();
    f = paramByte1;
  }
  
  public static final void f() {
    a.b((ck)a);
    a.m();
    a.a();
    a.b((byte)(c + 1));
    g();
    c = a;
    d = b;
    d();
    f = -1;
    a.a((byte)1);
    a.j();
    bs.a.b();
    a((byte)2, (byte)2, (byte)1);
  }
  
  public static final void g() {
    a = as.c - ((ck)a).c;
    b = as.d - ((ck)a).d;
  }
  
  public static final void a(int paramInt) {
    e = paramInt;
  }
  
  public static final void a(ae paramae) {
    a = (boolean[][])paramae;
  }
  
  public static final void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean2) {
      byte b = b();
      if (paramBoolean1) {
        b -= 15 * u.b[b];
        a -= 15 * u.a[b];
      } 
      if (!u.a[b] && d != b)
        d += (b - d + 1) / 2 - 1; 
      if (u.a[b] && c != a)
        c += (a - c + 1) / 2 - 1; 
      return;
    } 
    c += (a - c + 1) / 2 - 1;
    d += (b - d + 1) / 2 - 1;
  }
  
  public static final void b(byte paramByte) {
    if (a() == 1) {
      h = 0;
      i = 0;
      c((byte)2);
      d(paramByte);
      return;
    } 
    if (a() == 2) {
      h = 2;
      i = paramByte;
    } 
  }
  
  public static final void h() {
    h = 1;
    i = b();
  }
  
  public static final void a(boolean paramBoolean) {
    if (!a.a(paramBoolean))
      return; 
    if (a() == 2) {
      h = 3;
      i = b();
      return;
    } 
    if (a() == 1) {
      a.a((byte)3);
      a.i();
    } 
  }
  
  public static final void i() {
    q();
    n();
    a.b();
  }
  
  public static final void j() {
    ah.a();
  }
  
  private static final void q() {
    if (!b())
      return; 
    if (h == 0)
      return; 
    c(h);
    d(i);
    h = 0;
    i = 0;
  }
  
  public static final void k() {
    h = 0;
  }
  
  public static final boolean a() {
    byte[] arrayOfByte;
    if ((arrayOfByte = a.a(((ck)a).a, ((ck)a).b)) != null) {
      if (arrayOfByte[2] == -1) {
        int i;
        if ((i = arrayOfByte[3] * 100 + arrayOfByte[4]) > 0)
          i *= 9; 
        a.g(i);
        bs.a.a((bh.a + i + bh.d).toCharArray(), 16);
      } else if (arrayOfByte[2] == 22) {
        ((ao)a).b.a(ad.a(arrayOfByte[2], arrayOfByte[3], true, true), arrayOfByte[4]);
        char[] arrayOfChar = h.a(bh.a.toCharArray(), ad.b.a(arrayOfByte[2]));
        bs.a.a(arrayOfChar, 16);
      } else {
        ad ad;
        if (ad = ad.a(arrayOfByte[2], arrayOfByte[3], true, true) instanceof e && !((e)ad).a)
          ((e)ad).b = true; 
        ((ao)a).a.a(ad, arrayOfByte[4]);
        char[] arrayOfChar = h.a(bh.a.toCharArray(), ad.b.a(arrayOfByte[2]));
        bs.a.a(arrayOfChar, 16);
      } 
      return true;
    } 
    if (a.a(((ck)a).a, ((ck)a).b))
      bs.a.a(bh.t, 16); 
    return false;
  }
  
  public static final void l() {
    for (byte b = 0; b < ''; b++)
      k[b] = 0; 
  }
  
  public static final boolean a(int paramInt) {
    byte b;
    return (((b = k[paramInt / 8]) >> paramInt % 8 & 0x1) == 1);
  }
  
  public static final void b(int paramInt) {
    byte b = k[paramInt / 8];
    k[paramInt / 8] = (byte)(b | 1 << paramInt % 8);
  }
  
  public static final void c(int paramInt) {
    byte b = k[paramInt / 8];
    k[paramInt / 8] = (byte)(b & (1 << paramInt % 8 ^ 0xFFFFFFFF));
  }
  
  public static final void d(int paramInt) {
    if (a(paramInt)) {
      c(paramInt);
      return;
    } 
    b(paramInt);
  }
  
  public static final void m() {
    for (byte b = 0; b < ''; b++)
      l[b] = 0; 
  }
  
  public static final boolean b(int paramInt) {
    byte b;
    return (((b = l[paramInt / 8]) >> paramInt % 8 & 0x1) == 1);
  }
  
  public static final void e(int paramInt) {
    byte b = l[paramInt / 8];
    l[paramInt / 8] = (byte)(b | 1 << paramInt % 8);
    if (paramInt == 29 && a == 6) {
      ao ao1;
      (ao1 = a()).d((byte)2);
    } 
  }
  
  public static final void f(int paramInt) {
    byte b = l[paramInt / 8];
    l[paramInt / 8] = (byte)(b & (1 << paramInt % 8 ^ 0xFFFFFFFF));
  }
  
  public static final void g(int paramInt) {
    if (b(paramInt)) {
      f(paramInt);
      return;
    } 
    e(paramInt);
  }
  
  public static final ao a() {
    return (ao)a;
  }
  
  public static final byte a() {
    return ((o)a).h;
  }
  
  public static final byte b() {
    return ((o)a).i;
  }
  
  public static final void c(byte paramByte) {
    a.a(paramByte);
  }
  
  public static final void d(byte paramByte) {
    a.b(paramByte);
  }
  
  public static final void n() {
    a.d();
    a.c((ck)a);
    p p;
    if ((p = a.a()) != null) {
      p.e();
      a.c(p);
    } 
  }
  
  public static final void a(int paramInt1, int paramInt2) {
    a.a((short)(paramInt1 * 16), (short)(paramInt2 * 16));
    a.g();
  }
  
  public static final boolean b() {
    return (((ck)a).a == null && ((ck)a).b == null);
  }
  
  private static final byte[] a() {
    ByteArrayOutputStream byteArrayOutputStream = null;
    DataOutputStream dataOutputStream = null;
    try {
      byteArrayOutputStream = new ByteArrayOutputStream();
      (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).write(k);
      dataOutputStream.write(l);
      dataOutputStream.writeByte(g);
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
    } finally {
      try {
        if (dataOutputStream != null)
          dataOutputStream.close(); 
        if (byteArrayOutputStream != null)
          byteArrayOutputStream.close(); 
      } catch (IOException iOException) {}
    } 
    return null;
  }
  
  private static final void a(byte[] paramArrayOfbyte) {
    ByteArrayInputStream byteArrayInputStream = null;
    DataInputStream dataInputStream = null;
    try {
      byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
      (dataInputStream = new DataInputStream(byteArrayInputStream)).read(k);
      dataInputStream.read(l);
      g = dataInputStream.readByte();
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
  }
  
  public static final void o() throws Exception {
    boolean[][] arrayOfBoolean;
    byte[] arrayOfByte1 = (arrayOfBoolean = a).a();
    byte[] arrayOfByte2 = ((ao)arrayOfBoolean).a.c();
    byte[] arrayOfByte3 = a();
    byte[] arrayOfByte4 = { ((ae)a).a, ((ck)arrayOfBoolean).a, ((ck)arrayOfBoolean).b };
    int i = 0;
    arrayOfByte1 = bq.a(arrayOfByte1, i);
    arrayOfByte2 = bq.a(arrayOfByte2, i);
    arrayOfByte3 = bq.a(arrayOfByte3, i);
    arrayOfByte4 = bq.a(arrayOfByte4, i);
    byte[] arrayOfByte5;
    (arrayOfByte5 = new byte[arrayOfByte1.length + arrayOfByte2.length + arrayOfByte3.length + arrayOfByte4.length + 8])[0] = (byte)((arrayOfByte1.length & 0xFF00) >> 8);
    arrayOfByte5[1] = (byte)(arrayOfByte1.length & 0xFF);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte5, 2, arrayOfByte1.length);
    i = 2 + arrayOfByte1.length;
    arrayOfByte5[i++] = (byte)((arrayOfByte2.length & 0xFF00) >> 8);
    arrayOfByte5[i++] = (byte)(arrayOfByte2.length & 0xFF);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte5, i, arrayOfByte2.length);
    i += arrayOfByte2.length;
    arrayOfByte5[i++] = (byte)((arrayOfByte3.length & 0xFF00) >> 8);
    arrayOfByte5[i++] = (byte)(arrayOfByte3.length & 0xFF);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte5, i, arrayOfByte3.length);
    i += arrayOfByte3.length;
    arrayOfByte5[i++] = (byte)((arrayOfByte4.length & 0xFF00) >> 8);
    arrayOfByte5[i++] = (byte)(arrayOfByte4.length & 0xFF);
    System.arraycopy(arrayOfByte4, 0, arrayOfByte5, i, arrayOfByte4.length);
    au au1;
    (au1 = new au((String)a[a - 6], 0)).a(arrayOfByte5, 0, arrayOfByte5.length);
    au1.a();
    byte[] arrayOfByte6 = bq.a(arrayOfByte6 = ((ao)arrayOfBoolean).b.c(), i);
    au au2 = new au("/o", 0);
    arrayOfByte5 = new byte[] { (byte)((arrayOfByte6.length & 0xFF00) >> 8), (byte)(arrayOfByte6.length & 0xFF) };
    au2.a(arrayOfByte5, 0, arrayOfByte5.length);
    au2.a(arrayOfByte6, 0, arrayOfByte6.length);
    au2.a();
  }
  
  private static final void r() throws Exception {
    byte[] arrayOfByte1 = new byte[2];
    au au;
    (au = new au((String)a[a - 6], 1)).b(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[(arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF];
    au.b(arrayOfByte2, 0, arrayOfByte2.length);
    arrayOfByte2 = bq.b(arrayOfByte2, i);
    a.a(arrayOfByte2);
    au.b(arrayOfByte1, 0, arrayOfByte1.length);
    arrayOfByte2 = new byte[(arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF];
    au.b(arrayOfByte2, 0, arrayOfByte2.length);
    arrayOfByte2 = bq.b(arrayOfByte2, i);
    ((ao)a).a.a(arrayOfByte2);
    au.b(arrayOfByte1, 0, arrayOfByte1.length);
    arrayOfByte2 = new byte[(arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF];
    au.b(arrayOfByte2, 0, arrayOfByte2.length);
    a(arrayOfByte2 = bq.b(arrayOfByte2, i));
    au.b(arrayOfByte1, 0, arrayOfByte1.length);
    arrayOfByte2 = new byte[(arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF];
    au.b(arrayOfByte2, 0, arrayOfByte2.length);
    f = (arrayOfByte2 = bq.b(arrayOfByte2, i))[0];
    c = arrayOfByte2[1];
    d = arrayOfByte2[2];
    au.a();
    (au = new au("/o", 1)).b(arrayOfByte1, 0, arrayOfByte1.length);
    arrayOfByte2 = new byte[(arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF];
    au.b(arrayOfByte2, 0, arrayOfByte2.length);
    arrayOfByte2 = bq.b(arrayOfByte2, i);
    ((ao)a).b.a(arrayOfByte2);
    au.a();
  }
  
  private static final byte[] a(byte paramByte) {
    System.out.println("getSavedDataFor");
    byte[] arrayOfByte = null;
    try {
      if (au.a((String)a[paramByte - 6])) {
        au au;
        arrayOfByte = new byte[(au = new au((String)a[paramByte - 6], 1)).a()];
        System.out.println("::::" + au.a());
        au.b(arrayOfByte, 0, arrayOfByte.length);
        au.a();
      } 
    } catch (Exception exception) {}
    return arrayOfByte;
  }
  
  public static final byte a(byte paramByte) {
    if (g >= 3)
      return 0; 
    byte b = 0;
    byte b1;
    for (b1 = 0; b1 < 20; b1++) {
      if (b(1 + b1 * 3 + 1))
        b = (byte)(b + 1); 
    } 
    for (b1 = 100; b1 <= 105; b1++) {
      if (a(b1))
        b = (byte)(b + 1); 
    } 
    switch (paramByte) {
      case 6:
        return (byte)(b * h[g] / 19);
      case 7:
        return (byte)(b * h[g] / 21);
      case 8:
        return (byte)(b * h[g] / 16);
    } 
    return 0;
  }
  
  public static final void p() {
    byte b1 = 0;
    Object[] arrayOfObject = new Object[3];
    for (byte b2 = 6; b2 <= 8; b2 = (byte)(b2 + 1)) {
      arrayOfObject[b2 - 6] = a(b2);
      if (arrayOfObject[b2 - 6] != null)
        b1++; 
    } 
    byte[] arrayOfByte = new byte[b1 * 4];
    byte b3 = 0;
    byte b4;
    for (b4 = 6; b4 <= 8; b4 = (byte)(b4 + 1)) {
      if (arrayOfObject[b4 - 6] != null) {
        byte[] arrayOfByte1 = (byte[])arrayOfObject[b4 - 6];
        int i = 0;
        try {
          short s;
          byte[] arrayOfByte2 = new byte[s = h.a(arrayOfByte1, 0)];
          System.arraycopy(arrayOfByte1, 2, arrayOfByte2, 0, s);
          i = 2 + s;
          arrayOfByte2 = bq.b(arrayOfByte2, i);
          s = h.a(arrayOfByte1, i);
          i += 2 + s;
          s = h.a(arrayOfByte1, i);
          i += 2;
          byte[] arrayOfByte3 = new byte[s];
          System.arraycopy(arrayOfByte1, i, arrayOfByte3, 0, s);
          a(arrayOfByte3 = bq.b(arrayOfByte3, i));
          arrayOfByte[b3++] = b4;
          arrayOfByte[b3++] = arrayOfByte2[1];
          arrayOfByte[b3++] = (byte)(arrayOfByte2[0] + a(b4));
          arrayOfByte[b3++] = g;
        } catch (Exception exception2) {
          Exception exception1;
          (exception1 = null).printStackTrace();
        } 
      } 
    } 
    bf.a((b1 > 0), arrayOfByte);
    (bf.a()).b = (b1 > 0) ? 1 : 0;
    a((byte)2, (byte)9, (byte)3);
  }
  
  public static final void a(boolean paramBoolean, byte paramByte, boolean[] paramArrayOfboolean) {
    bf.d();
    ce.B();
    a = paramByte;
    a = (boolean[][])new ao((short)0, (short)0, (byte)8, (byte)8, paramByte);
    if (!paramBoolean) {
      if (paramArrayOfboolean[0])
        a.a((byte)0); 
      if (paramArrayOfboolean[1])
        a.a((byte)1); 
      if (paramArrayOfboolean[2])
        a.a((byte)2); 
    } 
    a(0);
    a((byte)21, paramBoolean ? 1 : 0);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/n.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */