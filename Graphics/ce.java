package Graphics;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class ce implements u {
  public static Object[] a;
  
  public static Object[] b;
  
  public static Object[] c;
  
  public static Object[] d = new Object[3];
  
  public static byte[] h;
  
  public static Object[] e = new Object[60];
  
  public static Object[] f = new Object[5];
  
  public static Object[] g = new Object[3];
  
  public static Object[] h = new Object[80];
  
  public static Object[] i = new Object[12];
  
  public static Object[] j = new Object[60];
  
  public static byte[] i = new byte[5];
  
  public static byte[] j = new byte[5];
  
  public static byte[] k = new byte[5];
  
  public static byte[] l = new byte[5];
  
  public static Image[][] a = new Image[38][];
  
  public static z a;
  
  public static Image[] a;
  
  public static Image[] b;
  
  public static Image[] c;
  
  public static z b;
  
  public static z c;
  
  public static Image[] d;
  
  public static Image[] e;
  
  public static Image[] f;
  
  public static Image[] g;
  
  public static Image[] h;
  
  public static z d;
  
  public static Image[] i;
  
  public static Image[] j;
  
  public static Image[] k;
  
  public static Image[] l;
  
  public static Image[] m;
  
  public static Image[][] b;
  
  public static Image[] n;
  
  public static Image[] o;
  
  public static Image a;
  
  public static Image b;
  
  public static Image c;
  
  public static Image d;
  
  public static Image e;
  
  public static Image f;
  
  public static Image g;
  
  public static Image h;
  
  public static Image i;
  
  public static Image j;
  
  public static Image k;
  
  public static Image l;
  
  public static Image m;
  
  public static Image n;
  
  public static Image o;
  
  public static Image[] p;
  
  public static Image p;
  
  public static Image q;
  
  public static z e;
  
  public static Image[] q;
  
  public static Image r;
  
  public static Image[] r;
  
  public static z f;
  
  public static byte[] m;
  
  public static Image[] s;
  
  public static Image[] t;
  
  public static Image[] u;
  
  public static Image s;
  
  public static Image t;
  
  public static Image u;
  
  public static Image v;
  
  public static Image w;
  
  public static Image x;
  
  public static Image y;
  
  public static Image z;
  
  public static Image A;
  
  public static Image B;
  
  public static Image C;
  
  public static Image D;
  
  public static Image[] v;
  
  public static Image[] w;
  
  public static z g;
  
  public static byte[] n = new byte[512];
  
  public static final void a(byte paramByte) {
    try {
      br br;
      (br = new br("/img/atteff1")).a = true;
      a(br, paramByte);
      s = (Image)new Image[3];
      s[0] = br.a(0);
      s[1] = br.a(1);
      s[2] = br.a(2);
      r.k();
      br.a("/img/atteff2");
      a(br, paramByte);
      t = (Image)new Image[3];
      t[0] = br.a(0);
      t[1] = br.a(1);
      t[2] = br.a(2);
      r.k();
      br.a("/img/atteff3");
      u = (Image)new Image[3];
      u[0] = br.a(0);
      u[1] = br.a(1);
      u[2] = br.a(2);
      r.k();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void a() {
    s = null;
    t = null;
    u = null;
  }
  
  private static final void a(br parambr, byte paramByte) {
    switch (paramByte) {
      case 1:
        parambr.a(12574719, 16777152);
        parambr.a(10469375, 16760703);
        parambr.a(6258623, 16744255);
        return;
      case 3:
        parambr.a(12574719, 14679999);
        parambr.a(10469375, 12574655);
        parambr.a(6258623, 10469247);
        break;
    } 
  }
  
  public static final void b() {
    e = null;
  }
  
  public static final void c() {
    f = null;
  }
  
  public static final void d() {
    g = null;
  }
  
  public static final void e() {
    e = (z)new Object[60];
    h = (Image)new Object[80];
    k = (Image)new byte[5];
    for (byte b = 0; b < 10; b++)
      a[15 + b] = null; 
  }
  
  public static final void a(byte paramByte1, byte paramByte2) {
    if (paramByte1 == 0 && paramByte2 == 0) {
      d[paramByte2] = (Image)a("/grd/spr/0_01.eif");
      a(true, (byte[])d[paramByte2], 0, (byte)12, (byte)-1, null);
      m = a("/grd/spr/0_02.eif");
      a(true, m, 0, (byte)12, (byte)-1, null);
    } else {
      String str = "/grd/spr/" + paramByte1 + "_" + paramByte2 + ".eif";
      d[paramByte2] = (Image)a(str);
      a(true, (byte[])d[paramByte2], 0, (byte)12, (byte)-1, null);
    } 
    "GuardianSprite : " + paramByte1 + ", " + paramByte2;
  }
  
  public static final void f() {
    d = (Image)new Object[3];
    m = null;
  }
  
  public static final void a(boolean paramBoolean, byte[] paramArrayOfbyte, int paramInt, byte paramByte1, byte paramByte2, br parambr) {
    byte b = paramArrayOfbyte[paramInt++];
    if (parambr != null) {
      parambr.a = true;
      if (a[paramByte1] == null)
        a[paramByte1] = (Image)new Image[parambr.a()]; 
      if (paramByte2 != -1 && a[paramByte2] == null)
        a[paramByte2] = (Image)new Image[parambr.a()]; 
    } 
    r.k();
    for (byte b1 = 0; b1 < b; b1++) {
      byte b2;
      if (paramBoolean) {
        b2 = paramArrayOfbyte[paramInt++];
      } else {
        b2 = 1;
      } 
      for (byte b3 = 0; b3 < b2; b3++) {
        paramInt++;
        paramInt++;
        boolean bool = (paramArrayOfbyte[++paramInt] != 0) ? true : false;
        byte b5 = paramArrayOfbyte[paramInt++];
        byte b4 = bool ? paramByte2 : paramByte1;
        x.a((b4 > 0));
        Image[] arrayOfImage;
        if (parambr != null && (arrayOfImage = (Image[])a[b4])[b5] == null) {
          arrayOfImage[b5] = bool ? parambr.b(b5) : parambr.a(b5);
          r.k();
        } 
      } 
    } 
  }
  
  public static final void g() {
    br br = null;
    try {
      (br = new br("/img/uifrm")).a = true;
      q = new Image[7];
      for (byte b = 0; b < 7; b++) {
        q[b] = br.a(b);
        r.k();
      } 
      r = new Image[4];
      r[0] = br.a(7);
      r[1] = br.b(7);
      r.k();
      r[2] = br.a(8);
      r[3] = br.b(8);
      r.k();
      (br = new br("/img/etcui")).a = true;
      s = bh.a("_img_etcui__0.png");
      t = bh.a("_img_etcui__1.png");
      br.a(2);
      r.k();
      u = br.a(3);
      v = (Image[])bh.a("_img_etcui__4.png");
      w = (Image[])br.a(5);
      x = br.a(6);
      r.k();
      y = br.a(7);
      z = br.a(8);
      A = br.a(9);
      B = br.a(10);
      C = br.a(11);
      r.k();
      br = new br("/char/lvup");
      h = (Image)a("/char/lvup.eif");
      r.k();
      a(true, (byte[])h, 0, (byte)13, (byte)-1, br);
      return;
    } catch (Exception exception) {
      System.out.println(exception);
      return;
    } 
  }
  
  public static final void h() {
    q = null;
    r = null;
    s = null;
    t = null;
    u = null;
    v = null;
    w = null;
    x = null;
    y = null;
    z = null;
    A = null;
    B = null;
    C = null;
    h = null;
    a[13] = null;
  }
  
  public static final void i() {
    br br = null;
    try {
      (br = new br("/img/keepst")).a = true;
      D = br.a(0);
      r.k();
      v = new Image[8];
      for (byte b = 0; b < 8; b++)
        v[b] = br.a(b + 1); 
      r.k();
      w = (br = new br("/img/emoti")).a();
      r.k();
      return;
    } catch (Exception exception) {
      System.out.println(exception);
      return;
    } 
  }
  
  public static final void j() {
    D = null;
    v = null;
    w = null;
  }
  
  public static final void b(byte paramByte) {
    a = (Image)new Image[2];
    br br = null;
    try {
      switch (paramByte) {
        case 0:
        case 3:
          br = new br("/grd/fi");
          break;
        case 1:
        case 4:
          br = new br("/grd/wa");
          break;
        case 2:
        case 5:
          br = new br("/grd/gr");
          break;
      } 
      a[12] = (Image)br.a();
      (br = new br("/grd/" + paramByte)).a = true;
      a[0] = br.a(0);
      a[1] = br.a(1);
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void k() {
    a = null;
    a[12] = null;
  }
  
  public static final void a(short paramShort, byte paramByte, boolean paramBoolean) {
    try {
      br br;
      (br = new br("/enm/" + ((paramShort < 10) ? "0" : "") + paramShort)).a = true;
      r.k();
      byte[] arrayOfByte = a("/enm/spr/" + ((paramShort < 10) ? "0" : "") + paramShort);
      r.k();
      int i = 0;
      while (i < arrayOfByte.length) {
        byte b1 = arrayOfByte[i++];
        byte b2 = arrayOfByte[i++];
        byte b3 = arrayOfByte[i++];
        if (paramBoolean) {
          if (b1 == 0) {
            i[paramByte] = arrayOfByte[i];
          } else if (b1 == 1) {
            j[paramByte] = arrayOfByte[i];
          } 
          j[paramByte * 12 + b1 * 4 + b2] = (Image)new byte[b3];
          a(true, arrayOfByte, i, (byte)(27 + paramByte), (byte)(27 + paramByte + 5), br);
          System.arraycopy(arrayOfByte, i, j[paramByte * 12 + b1 * 4 + b2], 0, b3);
        } else {
          e[paramByte * 12 + b1 * 4 + b2] = (z)new byte[b3];
          a(true, arrayOfByte, i, (byte)(15 + paramByte), (byte)(15 + paramByte + 5), br);
          System.arraycopy(arrayOfByte, i, e[paramByte * 12 + b1 * 4 + b2], 0, b3);
        } 
        i += b3;
        r.k();
      } 
      if (!paramBoolean && (j.a[paramByte]).d >= 2) {
        arrayOfByte = a("/enm/atef/" + ((paramShort < 10) ? "0" : "") + paramShort);
        a(true, arrayOfByte, 0, (byte)(15 + paramByte), (byte)(15 + paramByte + 5), br);
        f[paramByte] = (z)arrayOfByte;
      } 
      r.k();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void c(byte paramByte) {
    a[15 + paramByte] = null;
    a[15 + paramByte + 5] = null;
    for (byte b = 0; b < 12; b++)
      e[paramByte * 12 + b] = null; 
  }
  
  public static final void l() {
    try {
      br br;
      (br = new br("/enm/die/bang")).a = true;
      for (byte b = 0; b < 3; b++) {
        byte[] arrayOfByte = a("/enm/die/" + b);
        a(true, arrayOfByte, 0, (byte)37, (byte)-1, br);
        g[b] = (z)arrayOfByte;
      } 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  public static final void b(byte paramByte1, byte paramByte2) {
    try {
      br br;
      (br = new br("/npc/" + ((paramByte1 < 10) ? "0" : "") + paramByte1)).a = true;
      r.k();
      byte[] arrayOfByte = a("/npc/spr/" + ((paramByte1 < 10) ? "0" : "") + paramByte1);
      r.k();
      int i = 0;
      while (i < arrayOfByte.length) {
        byte b1 = arrayOfByte[i++];
        byte b2 = arrayOfByte[i++];
        byte b3 = arrayOfByte[i++];
        j[paramByte2 * 12 + b1 * 4 + b2] = (Image)new byte[b3];
        if (b1 == 0) {
          i[paramByte2] = arrayOfByte[i];
        } else if (b1 == 1) {
          j[paramByte2] = arrayOfByte[i];
        } 
        a(true, arrayOfByte, i, (byte)(27 + paramByte2), (byte)(27 + paramByte2 + 5), br);
        System.arraycopy(arrayOfByte, i, j[paramByte2 * 12 + b1 * 4 + b2], 0, b3);
        i += b3;
        r.k();
      } 
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void d(byte paramByte) {
    a[27 + paramByte] = null;
    a[27 + paramByte + 5] = null;
    for (byte b = 0; b < 12; b++)
      j[paramByte * 12 + b] = null; 
  }
  
  public static final void e(byte paramByte) {
    try {
      byte b1;
      byte b2;
      br br;
      (br = new br("/boss/" + paramByte)).a = true;
      switch (paramByte) {
        case 1:
          b1 = 32;
          b2 = 32;
          break;
        case 2:
          b1 = 35;
          b2 = 38;
          break;
        case 3:
          b1 = 39;
          b2 = 41;
          break;
        case 4:
          b1 = 42;
          b2 = 42;
          break;
        default:
          x.a(false);
          b1 = -1;
          b2 = -1;
          break;
      } 
      byte b3;
      for (b3 = b1; b3 <= b2; b3 = (byte)(b3 + 1)) {
        byte[] arrayOfByte = a("/boss/spr/" + paramByte + "_" + b3);
        int i = 0;
        while (i < arrayOfByte.length) {
          byte b4 = a(b3);
          byte b5 = arrayOfByte[i++];
          byte b6 = arrayOfByte[i++];
          byte b7;
          byte[] arrayOfByte1 = new byte[(b7 = arrayOfByte[i++]) & 0xFF];
          a(true, arrayOfByte, i, (byte)25, (byte)26, br);
          System.arraycopy(arrayOfByte, i, arrayOfByte1, 0, arrayOfByte1.length);
          i += arrayOfByte1.length;
          if (b5 <= 3)
            h[b4 * 16 + b5 * 4 + b6] = (Image)arrayOfByte1; 
          if (paramByte == 1 && b5 >= 3)
            i[(b5 - 3) * 4 + b6] = (Image)arrayOfByte1; 
        } 
        if ((arrayOfByte = a("/boss/atef/" + ((b3 < 10) ? "0" : "") + b3)) != null) {
          a(true, arrayOfByte, 0, (byte)25, (byte)26, br);
          f[a(b3)] = (z)arrayOfByte;
        } 
      } 
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void m() {
    a[25] = null;
    a[26] = null;
    i = (Image)new Object[12];
  }
  
  public static final void n() {
    br br = null;
    n = (byte[])new Image[6];
    o = (Image)new Image[5];
    try {
      (br = new br("/sgui/gmico")).a = true;
      byte b;
      for (b = 0; b < 6; b = (byte)(b + 1))
        n[b] = br.a((b == 5) ? 6 : b); 
      for (b = 0; b < 5; b = (byte)(b + 1))
        o[b] = br.a(b + 7); 
      return;
    } catch (Exception exception) {
      System.out.println(exception);
      return;
    } 
  }
  
  public static final void o() {
    br br = null;
    try {
      (br = new br("/img/glb")).a = true;
      k = br.a(0);
      n = (byte[])br.a(1);
      o = br.a(2);
      d = br.a(3);
      r = (Image[])br.a(5);
      l = br.a(6);
      m = (byte[])br.a(7);
      a = br.a(8);
      e = (z)bh.a("_img_glb__9.png");
      f = (z)bh.a("_img_glb__10.png");
      g = (z)bh.a("_img_glb__11.png");
      h = bh.a("_img_glb__12.png");
      bh.a("_img_glb__13.png");
      i = br.a(14);
      j = bh.a("_img_glb__15.png");
      br.a(16);
      e = new z("/sgui/help");
      return;
    } catch (Exception exception) {
      System.out.println(exception);
      return;
    } 
  }
  
  public static final void p() {
    try {
      br br;
      d = (Image)(br = new br("/img/icoitm")).a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void q() {
    d = null;
  }
  
  public static final void r() {
    r.k();
    p = (Image)new Image[6];
    br br = null;
    try {
      (br = new br("/sgui/shop")).a = true;
      r.k();
      for (byte b = 0; b < 6; b = (byte)(b + 1))
        p[b] = br.a(b); 
      q = (Image[])br.a(6);
      p = br.a(7);
      r.k();
      b = bh.a("_sgui_shop__8.png");
      c = bh.a("_sgui_shop__9.png");
      return;
    } catch (Exception exception) {
      System.out.println(exception);
      return;
    } 
  }
  
  public static final void s() {
    p = null;
    q = null;
    p = null;
    b = null;
    c = null;
  }
  
  public static final void t() {
    b = (Image)new Image[6];
    c = (Image)new Image[24];
    br br = null;
    try {
      (br = new br("/grd/grdico")).a = true;
      for (byte b = 0; b < 6; b = (byte)(b + 1)) {
        b[b] = br.a(b);
        for (byte b1 = 0; b1 < 4; b1 = (byte)(b1 + 1))
          c[b * 4 + b1] = br.a(6 + b * 4 + b1); 
        r.k();
      } 
      return;
    } catch (Exception exception) {
      System.out.println(exception);
      return;
    } 
  }
  
  public static final void u() {
    b = null;
    c = null;
  }
  
  public static final byte[] a(byte paramByte1, byte paramByte2) {
    InputStream inputStream = null;
    byte[] arrayOfByte = null;
    String str = String.valueOf(paramByte1);
    if (paramByte1 < 10)
      str = "0" + str; 
    try {
      inputStream = (new Object()).getClass().getResourceAsStream("/itm/" + str);
      int i = 0;
      for (byte b = 0; b < paramByte2; b++) {
        i = inputStream.read();
        inputStream.skip(i);
      } 
      arrayOfByte = new byte[i = inputStream.read()];
      inputStream.read(arrayOfByte);
      inputStream.close();
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
    } 
    return arrayOfByte;
  }
  
  public static final byte[] a() {
    return a("/itm/forshop");
  }
  
  public static final void f(byte paramByte) {
    r.k();
    b(paramByte);
    switch (paramByte) {
      case 0:
        a(paramByte, (byte)0);
        a(paramByte, (byte)1);
        return;
      case 1:
        a(paramByte, (byte)0);
        a(paramByte, (byte)1);
        return;
      case 2:
      case 3:
      case 4:
      case 5:
        a(paramByte, (byte)0);
        a(paramByte, (byte)1);
        a(paramByte, (byte)2);
        break;
    } 
  }
  
  public static final void v() {
    k();
    f();
  }
  
  public static final void w() {
    try {
      br br;
      i = (Image)(br = new br("/img/logo")).a();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  public static final void x() {
    i = null;
  }
  
  public static final void y() {
    try {
      br br;
      j = (Image)(br = new br("/img/title1")).a();
      r.k();
      (br = new br("/img/title2")).a = true;
      k = (Image)new Image[10];
      for (byte b = 0; b < 5; b++) {
        k[b] = br.a(b);
        k[b + 5] = br.b(b);
        r.k();
      } 
      r.k();
      bw.a((byte)22);
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void z() {
    j = null;
    k = null;
    bw.b((byte)22);
  }
  
  public static final void A() {
    try {
      br br;
      (br = new br("/sgui/mm/face")).a = true;
      m = (byte[])new Image[6];
      m[0] = br.a(0);
      m[1] = br.a(1);
      m[2] = br.a(2);
      r.k();
      m[3] = br.c(0);
      m[4] = br.c(1);
      m[5] = br.c(2);
      r.k();
      l = (Image)(br = new br("/sgui/mm/etc")).a();
      b = (Image)new Image[3][2];
      for (byte b = 0; b < 3; b++) {
        (br = new br("/grd/" + b)).a = true;
        b[b][0] = br.a(0);
        b[b][1] = br.a(1);
        r.k();
      } 
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final void B() {
    l = null;
    m = null;
    b = (Image)null;
  }
  
  public static final byte[] a(String paramString) {
    System.gc();
    String str = paramString;
    InputStream inputStream = null;
    byte[] arrayOfByte = null;
    try {
      if ((inputStream = (new Object()).getClass().getResourceAsStream(paramString)) == null)
        return null; 
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      int i;
      while ((i = inputStream.read(n)) != -1)
        byteArrayOutputStream.write(n, 0, i); 
      arrayOfByte = byteArrayOutputStream.toByteArray();
      byteArrayOutputStream.close();
    } catch (Exception exception) {
      "miss - " + str;
      exception.printStackTrace();
    } 
    while (n.e == 15) {
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException2) {
        InterruptedException interruptedException1;
        (interruptedException1 = null).printStackTrace();
      } 
    } 
    return arrayOfByte;
  }
  
  public static final byte a(byte paramByte) {
    for (byte b = 0; b < k.length; b = (byte)(b + 1)) {
      if (k[b] == paramByte)
        return b; 
    } 
    return -1;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ce.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */