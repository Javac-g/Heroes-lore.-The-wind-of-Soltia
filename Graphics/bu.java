package Graphics;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bu implements Runnable {
  private static byte a = false;
  
  private static final String[] g = new String[] { "a", "b", "e", "hA", "hB", "w", "s" };
  
  public static final String[] a = new String[] { "/c1/s/", "/c2/s/", "/c3/s/" };
  
  public static final String[] b = new String[] { "/c1/i/", "/c2/i/", "/c3/i/" };
  
  public static final String[] c = new String[] { "a1", "a2", "a3", "a4", "a5", "a6" };
  
  public static final String[] d = new String[] { "h1", "h2", "h3", "h4", "h5", "h6", "h7" };
  
  public static final String[] e = new String[] { "w1", "w2", "w3", "w4", "w5" };
  
  public static final String[] f = new String[] { "s1", "s2", "s3", "s4", "s5" };
  
  public static final byte[][] a = new byte[][] { { 
        0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 
        1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 
        3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 
        0, 3, 3, 4, 1, 2, 3 }, { 
        0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 
        1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 
        3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 
        0, 1, 2, 4, 3, 4, 1 }, { 
        0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 
        1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 
        3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 
        0, 2, 4, 1, 2, 4, -1 } };
  
  public static final byte[][] b = new byte[][] { { 
        -1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 
        4, 5, 5, 2, 0, 4, 5, 4, 3 }, { 
        -1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 
        4, 5, 5, 2, 0, 4, 5, 4, 3 }, { 
        0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 
        4, 5, 5, 2, 0, 4, 5, 4, 3 } };
  
  public static final byte[] a = new byte[] { 
      0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 
      4, 4, 5, 5, 6, 6 };
  
  public static final byte[] b = new byte[] { 
      0, 0, 0, 1, 1, 1, 2, 2, 2, 4, 
      4, 4, 2, 0, 4 };
  
  private static boolean a = false;
  
  public static final void a() {
    a = true;
    r.a("- RESOURCE", 500);
    (new Thread(new bu())).start();
  }
  
  public static final void b() {
    bs.a.f();
    a = true;
    r.a("- MAP", 200);
    (new Thread(new bu())).start();
  }
  
  public static final void c() {
    a = true;
    r.a("가디언 소환중..", 120);
    (new Thread(new bu())).start();
  }
  
  public static final void d() {
    a = true;
    r.a("- MAIN MENU", 100);
    (new Thread(new bu())).start();
  }
  
  public final void run() {
    try {
      Thread.sleep(100L);
    } catch (InterruptedException interruptedException) {}
    switch (a) {
      case true:
        a();
        n.a(n.d, n.e);
        n.a.d();
        n.a((byte)15, n.c);
        return;
      case true:
        try {
          Thread.sleep(1000L);
          System.out.println("sleep");
        } catch (InterruptedException interruptedException2) {
          InterruptedException interruptedException1;
          (interruptedException1 = null).printStackTrace();
        } 
        r.k();
        if (!a)
          i(); 
        try {
          ce.f = new z("/sgui/q" + n.a);
          r.k();
        } catch (Exception exception) {}
        j();
        k();
        n.b(n.f, (byte)1, n.c, n.d);
        r.b = true;
        return;
      case true:
        h();
        k();
        n.a((byte)2, (byte)2, (byte)1);
        return;
      case true:
        g();
        h();
        ce.A();
        n.p();
        break;
    } 
  }
  
  private final ae a() {
    r.k();
    boolean[][] arrayOfBoolean = n.a;
    ao ao = n.a();
    arrayOfBoolean.a(ao);
    ao.a = null;
    ao.b = null;
    p p;
    if (arrayOfBoolean != null && (p = ao.a()) != null) {
      arrayOfBoolean.a(p);
      p.a = null;
      p.b = null;
    } 
    r.k();
    n.a = null;
    ae ae;
    n.a(ae = new ae(n.f));
    r.k();
    ae.a();
    r.k();
    return ae;
  }
  
  public static final void e() {
    try {
      ce.b = (Image)new z("/grd/grd");
      r.k();
      ce.a = (Image)new z("/char/hero");
      r.k();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  private final void i() {
    a = true;
    Object object = null;
    r.k();
    ce.n();
    r.k();
    ce.p();
    r.k();
    ce.t();
    r.k();
    ce.g();
    r.k();
    ce.i();
    r.k();
    ce.r();
    r.k();
    ce.l();
    r.k();
    try {
      ce.c = (Image)new z("/grd/grdsk");
      r.k();
      ce.d = (Image)new z("/m/name");
      r.k();
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
    } 
    byte b;
    for (b = 5; b <= 8; b = (byte)(b + 1))
      bw.a(b); 
    for (b = 12; b <= 15; b = (byte)(b + 1))
      bw.a(b); 
  }
  
  public static final void f() {
    a = false;
    ce.q();
    ce.u();
    ce.h();
    ce.j();
    ce.s();
    ce.c = null;
    ce.d = null;
    byte b;
    for (b = 5; b <= 8; b = (byte)(b + 1))
      bw.b(b); 
    for (b = 12; b <= 15; b = (byte)(b + 1))
      bw.b(b); 
  }
  
  private final void j() {
    ce.a = (Image)new Object[396];
    ao ao;
    if ((ao = n.a()).a() != null) {
      "HERO ARMOR " + b[n.a - 6][(ao.a()).g];
      r.k();
      a(n.a, (ao.a(2)).g);
    } 
    r.k();
    a(n.a, (byte)1, (byte)0, false, (byte)0);
    if (ao.b() != null) {
      "HERO HEAD " + a[(ao.b()).g];
      r.k();
      b(n.a, (ao.b()).g);
    } else {
      r.k();
      b(n.a, (byte)0);
    } 
    if (n.a == 8 && ao.a() != null) {
      "HERO SHIELD " + b[(ao.a()).g];
      r.k();
      c(n.a, (ao.a()).g);
    } 
  }
  
  public static final void g() {
    a(0);
    a(1);
    a(2);
    a(5);
  }
  
  private final void k() {
    ao ao;
    p p = (ao = n.a()).a();
    r.k();
    Object object = null;
    r.k();
    ce.f(p.f);
    r.k();
    if (ao.a(0) != null)
      a(n.a, (l)ao.a(0), false, p.a()); 
    r.k();
    d(n.a, p.a());
    r.k();
    ce.a(p.a());
    r.k();
    switch (p.f) {
      case 0:
        bw.a((byte)16);
        bw.a((byte)21);
        return;
      case 1:
        bw.a((byte)20);
        return;
      case 2:
        bw.a((byte)17);
        bw.a((byte)21);
        return;
      case 3:
        bw.a((byte)16);
        return;
      case 4:
        bw.a((byte)18);
        bw.a((byte)20);
        return;
      case 5:
        bw.a((byte)17);
        break;
    } 
  }
  
  public static final void h() {
    ce.v();
    a(3);
    a(4);
    ce.a();
    for (byte b = 16; b <= 21; b = (byte)(b + 1))
      bw.b(b); 
  }
  
  public static final void a(byte paramByte1, l paraml, boolean paramBoolean, byte paramByte2) {
    a(paramByte1, (byte)5, a[n.a - 6][paraml.g], paramBoolean, paramByte2);
  }
  
  public static final void a(byte paramByte1, byte paramByte2) {
    if (b[n.a - 6][paramByte2] == -1) {
      a(0);
      return;
    } 
    a(paramByte1, (byte)0, b[n.a - 6][paramByte2], false, (byte)0);
  }
  
  public static final void b(byte paramByte1, byte paramByte2) {
    byte b = 4;
    if (paramByte1 == 6 && paramByte2 >= 0 && paramByte2 <= 3)
      b = 3; 
    a(paramByte1, b, a[paramByte2], false, (byte)0);
  }
  
  public static final void c(byte paramByte1, byte paramByte2) {
    a(paramByte1, (byte)6, b[paramByte2], false, (byte)0);
  }
  
  public static final void d(byte paramByte1, byte paramByte2) {
    a(paramByte1, (byte)2, (byte)0, false, paramByte2);
  }
  
  private static final void a(byte paramByte1, byte paramByte2, byte paramByte3, boolean paramBoolean, byte paramByte4) {
    byte b = (byte)(paramByte1 - 6);
    try {
      br br = null;
      Image[] arrayOfImage1 = null;
      Image[] arrayOfImage2 = null;
      byte b1 = -1;
      switch (paramByte2) {
        case 0:
          br = new br(b[b] + c[paramByte3]);
          ce.a[0] = (Image)(arrayOfImage1 = new Image[br.a()]);
          ce.a[6] = (Image)(arrayOfImage2 = new Image[br.a()]);
          b1 = 0;
          break;
        case 1:
          br = new br(b[b] + "b");
          ce.a[1] = (Image)(arrayOfImage1 = new Image[br.a()]);
          ce.a[7] = (Image)(arrayOfImage2 = new Image[br.a()]);
          b1 = 1;
          break;
        case 3:
        case 4:
          br = new br(b[b] + d[paramByte3]);
          ce.a[2] = (Image)(arrayOfImage1 = new Image[br.a()]);
          ce.a[8] = (Image)(arrayOfImage2 = new Image[br.a()]);
          b1 = 2;
          break;
        case 5:
          br = new br(b[b] + e[paramByte3]);
          if (paramBoolean) {
            arrayOfImage1 = new Image[br.a()];
            arrayOfImage2 = new Image[br.a()];
          } else {
            ce.a[3] = (Image)(arrayOfImage1 = new Image[br.a()]);
            ce.a[9] = (Image)(arrayOfImage2 = new Image[br.a()]);
          } 
          b1 = 3;
          if (paramByte4 != 0)
            switch (paramByte4) {
              case 1:
                br.a(255, 16744255);
                break;
              case 2:
                br.a(255, 6258623);
                break;
              case 3:
                br.a(255, 8388479);
                break;
            }  
          break;
        case 2:
          br = new br(b[b] + "e");
          ce.a[4] = (Image)(arrayOfImage1 = new Image[br.a()]);
          ce.a[10] = (Image)(arrayOfImage2 = new Image[br.a()]);
          b1 = 4;
          switch (paramByte4) {
            case 1:
              br.a(12574719, 16777152);
              br.a(10469375, 16760703);
              br.a(6258623, 16744255);
              break;
            case 3:
              br.a(12574719, 14679999);
              br.a(10469375, 12574655);
              br.a(6258623, 10469247);
              break;
          } 
          if (paramByte1 == 8)
            a(br, (byte)4, (byte)10); 
          break;
        case 6:
          br = new br(b[b] + f[paramByte3]);
          ce.a[5] = (Image)(arrayOfImage1 = new Image[br.a()]);
          ce.a[11] = (Image)(arrayOfImage2 = new Image[br.a()]);
          b1 = 5;
          break;
      } 
      r.k();
      br.a = true;
      byte[] arrayOfByte = ce.a(a[b] + g[paramByte2]);
      r.k();
      byte b2 = 0;
      while (b2 < arrayOfByte.length) {
        byte b3 = arrayOfByte[b2++];
        byte b4 = arrayOfByte[b2++];
        byte b5 = arrayOfByte[b2++];
        byte b6 = arrayOfByte[b2++];
        if (paramByte2 != 2) {
          byte[] arrayOfByte1 = new byte[1 + b6 * 4];
          byte b7 = 0;
          b7++;
          arrayOfByte1[0] = b6;
          for (byte b8 = 0; b8 < b6; b8++) {
            arrayOfByte1[b7++] = arrayOfByte[b2++];
            arrayOfByte1[b7++] = arrayOfByte[b2++];
            boolean bool;
            if (bool = (arrayOfByte[b2++] != 0) ? true : false) {
              arrayOfByte1[b7++] = (byte)(b1 + 6);
            } else {
              arrayOfByte1[b7++] = b1;
            } 
            arrayOfByte1[b7++] = arrayOfByte[b2++];
            byte b9;
            if ((b9 = arrayOfByte[b2++]) != -1)
              if (!bool && arrayOfImage1[b9] == null) {
                arrayOfImage1[b9] = br.a(b9);
              } else if (bool && arrayOfImage2[b9] == null) {
                arrayOfImage2[b9] = br.b(b9);
              }  
          } 
          if (!paramBoolean) {
            ce.a[b4 * 36 + b5 * 9 + b3] = (Image)arrayOfByte1;
          } else {
            ce.c[b4 * 4 + b5] = (Image)arrayOfByte1;
          } 
        } else {
          byte b7 = b2;
          for (byte b8 = 0; b8 < b6; b8++) {
            byte b10 = arrayOfByte[b7++];
            for (byte b11 = 0; b11 < b10; b11++)
              b7 += 4; 
          } 
          byte[] arrayOfByte1 = new byte[1 + b7 - b2];
          b7 = 0;
          b7++;
          arrayOfByte1[0] = b6;
          for (byte b9 = 0; b9 < b6; b9++) {
            byte b10 = arrayOfByte1[b7++] = arrayOfByte[b2++];
            for (byte b11 = 0; b11 < b10; b11++) {
              arrayOfByte1[b7++] = arrayOfByte[b2++];
              arrayOfByte1[b7++] = arrayOfByte[b2++];
              boolean bool;
              if (bool = (arrayOfByte[b2++] != 0) ? true : false) {
                arrayOfByte1[b7++] = (byte)(b1 + 6);
              } else {
                arrayOfByte1[b7++] = b1;
              } 
              byte b12 = arrayOfByte1[b7++] = arrayOfByte[b2++];
              if (!bool && arrayOfImage1[b12] == null) {
                arrayOfImage1[b12] = br.a(b12);
              } else if (bool && arrayOfImage2[b12] == null) {
                arrayOfImage2[b12] = br.b(b12);
              } 
            } 
          } 
          ce.a[b4 * 36 + b5 * 9 + b3] = (Image)arrayOfByte1;
        } 
        r.k();
      } 
      br.a();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void a(int paramInt) {
    ce.a[paramInt] = null;
    ce.a[paramInt + 6] = null;
    if (paramInt == 3)
      ce.c = null; 
    for (byte b = 0; b < 11; b++) {
      for (byte b1 = 0; b1 < 4; b1++) {
        switch (paramInt) {
          case 0:
            ce.a[b * 36 + b1 * 9 + 2] = null;
            ce.a[b * 36 + b1 * 9 + 3] = null;
            ce.a[b * 36 + b1 * 9 + 4] = null;
            ce.a[b * 36 + b1 * 9 + 5] = null;
            break;
          case 1:
            ce.a[b * 36 + b1 * 9 + 0] = null;
            break;
          case 2:
            ce.a[b * 36 + b1 * 9 + 1] = null;
            break;
          case 3:
            ce.a[b * 36 + b1 * 9 + 6] = null;
            break;
          case 4:
            ce.a[b * 36 + b1 * 9 + 7] = null;
            break;
          case 5:
            ce.a[b * 36 + b1 * 9 + 8] = null;
            break;
        } 
      } 
    } 
  }
  
  public static final void a(br parambr, byte paramByte1, byte paramByte2) {
    parambr.a = true;
    ce.b = (Image)new Object[3];
    byte[] arrayOfByte = ce.a(a[2] + "ea2");
    ce.a(true, arrayOfByte, 0, paramByte1, paramByte2, parambr);
    ce.b[1] = (Image)(arrayOfByte = ce.a(a[2] + "ea3"));
    ce.a(true, arrayOfByte, 0, paramByte1, paramByte2, parambr);
    ce.b[2] = (Image)(arrayOfByte = ce.a(a[2] + "ea4"));
    ce.a(true, arrayOfByte, 0, paramByte1, paramByte2, parambr);
  }
  
  public static final void a(Graphics paramGraphics) {
    switch (a) {
      case true:
      case true:
        r.c(paramGraphics);
        return;
      case true:
        as.b(paramGraphics, r.g - 145 >> 1, r.j - 15, 145, 30);
        break;
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */