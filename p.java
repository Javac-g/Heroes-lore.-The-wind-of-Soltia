import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class p extends ck implements u {
  public static final short[] a = new short[] { 1, 1, 1, 1, 10, 20 };
  
  public static final byte[] h = new byte[] { 1, 9, 20, 30 };
  
  public static final short[] b = new short[] { 
      56, 280, 280, 220, 160, 270, 56, 270, 220, 80, 
      270, 270, 80, 270, 220, 80, 270, 270 };
  
  private static final byte[] i = new byte[] { 
      0, 0, 10, 4, 4, 10, 0, 4, 0, 4, 
      10, 8, 0, 6, 6, 0, 10, 8 };
  
  private static final short[] d = new short[] { 
      16, 9, 161, 9, 10, 81, 16, 9, 13, 25, 
      81, 8, 31, 81, 16, 31, 87, 8 };
  
  private byte[] j;
  
  public byte f;
  
  public byte g;
  
  public byte h;
  
  public short a;
  
  public int a;
  
  public int b;
  
  public byte i;
  
  public byte j = new byte[4];
  
  private short b;
  
  private short e;
  
  private byte k;
  
  private byte l;
  
  private byte m;
  
  private boolean d;
  
  public short[] c;
  
  public p(short paramShort1, short paramShort2, byte paramByte) {
    super(paramShort1, paramShort2, (byte)8, (byte)8);
    this.f = paramByte;
    this.c = new short[3];
    this.c[0] = b[paramByte * 3 + 0];
    this.c[1] = b[paramByte * 3 + 1];
    this.c[2] = b[paramByte * 3 + 2];
    this.a = a[paramByte];
    a();
    this.a = 0;
    d();
    a(true, (byte)0, true);
    a(false, (byte)1, true);
  }
  
  public final void a(int paramInt) {
    this.a += paramInt;
    while (this.a >= this.b) {
      this.a -= this.b;
      f();
    } 
  }
  
  private final void f() {
    this.a = (short)(this.a + 1);
    a();
    if (this.a == h[1])
      a(false, (byte)1, true); 
  }
  
  public final void a() {
    this.b = this.a * this.a * this.a - this.a * this.a + this.a * 80;
  }
  
  public final void c() {
    this.i = 0;
  }
  
  public final byte a() {
    return (this.f == 0 || this.f == 3) ? 1 : ((this.f == 1 || this.f == 4) ? 2 : ((this.f == 2 || this.f == 5) ? 3 : 0));
  }
  
  public final boolean a() {
    return (this.k - this.l < 10);
  }
  
  public final void d() {
    a(true, (byte)-1, true);
    a(false, (byte)-1, true);
  }
  
  public final boolean a(boolean paramBoolean1, byte paramByte, boolean paramBoolean2) {
    if (paramByte == -1) {
      if (paramBoolean1) {
        this.g = paramByte;
      } else {
        this.h = paramByte;
      } 
      return true;
    } 
    if (h[paramByte] > this.a)
      return false; 
    if (paramBoolean1) {
      this.g = paramByte;
      if (paramBoolean2 && paramByte != -1)
        this.c[paramByte] = b[this.f * 3 + paramByte]; 
    } else {
      this.h = paramByte;
      if (paramBoolean2 && paramByte != -1)
        this.c[paramByte] = b[this.f * 3 + paramByte]; 
    } 
    return true;
  }
  
  public final void a(boolean paramBoolean, byte paramByte, int paramInt1, int paramInt2) {
    if (paramBoolean && this.g >= 0 && this.g <= 2 && this.c[this.g] == 0) {
      this.m = this.g;
      this.c[this.g] = b[this.f * 3 + this.g];
    } else if (!paramBoolean && this.h >= 0 && this.h <= 2 && this.c[this.h] == 0) {
      this.m = this.h;
      this.c[this.h] = b[this.f * 3 + this.h];
    } else {
      return;
    } 
    this.i = 1;
    this.b = -1;
    this.k = i[this.f * 3 + this.m];
    this.l = this.k;
    this.d = false;
    a((short)((paramInt1 + u.a[paramByte]) * 16), (short)((paramInt2 + u.b[paramByte]) * 16));
    this.j = paramByte;
    super.b = (byte)(super.d >> 4);
    super.a = (byte)(super.c >> 4);
    super.b = false;
    super.a = false;
  }
  
  public final void e() {
    if ((this.i == 0 || this.m != this.g) && this.g != -1 && this.c[this.g] > 0)
      this.c[this.g] = (short)(this.c[this.g] - 1); 
    if ((this.i == 0 || this.m != this.h) && this.h != -1 && this.c[this.h] > 0)
      this.c[this.h] = (short)(this.c[this.h] - 1); 
    switch (this.i) {
      case 0:
        return;
      case 1:
        this.b = (short)(this.b + 1);
        if (this.b >= 10) {
          if (this.l > 0) {
            this.i = 2;
          } else {
            this.i = 3;
            this.b = 0;
            this.e = 0;
          } 
          this.b = 0;
        } 
        break;
      case 2:
        this.b = (short)(this.b + 1);
        this.l = (byte)(this.l - 1);
        if (this.b >= 4)
          this.b = 0; 
        if (this.l <= 0) {
          this.i = 3;
          this.b = 0;
          this.e = 0;
        } 
        break;
      case 3:
        this.b = (short)(this.b + 1);
        if (this.b >= 11) {
          this.b = 11;
          if (this.d) {
            this.i = 0;
            this.j = 0;
          } 
        } 
        break;
    } 
    if (this.i == 3) {
      a(this.f, this.m);
      this.e = (short)(this.e + 1);
    } 
  }
  
  private final void a(byte paramByte1, byte paramByte2) {
    ao ao = n.a();
    switch (paramByte1) {
      case 0:
        switch (paramByte2) {
          case 0:
            g();
            i();
            break;
          case 1:
            if (this.e == 0) {
              ao.a(new bj((short)0, (short)8, paramByte1, paramByte2));
              ao.a((byte)5);
              ao.d = 1;
              bw.a((byte)21, false);
            } 
            break;
          case 2:
            if (this.e == 0) {
              ao.a(new bj((short)0, (short)160, paramByte1, paramByte2));
              ao.g = 1;
              bw.a((byte)21, false);
            } 
            if (this.e == d[paramByte1 * 3 + paramByte2])
              ao.g = 0; 
            break;
        } 
        break;
      case 1:
        switch (paramByte2) {
          case 0:
            if (this.e == 0) {
              ao.a(new bj((short)0, (short)8, paramByte1, paramByte2));
              ao.c(30);
              bw.a((byte)20, false);
            } 
            break;
          case 1:
            if (this.e == 0) {
              ao.a(new bj((short)0, (short)9, paramByte1, paramByte2));
              ao.e(20);
              bw.a((byte)20, false);
            } 
            break;
          case 2:
            if (this.e == 0) {
              ao.a(new bj((short)0, (short)80, paramByte1, paramByte2));
              ao.a(new bj((short)4, (short)8, paramByte1, (byte)0));
              ao.a(new bj((short)24, (short)8, paramByte1, (byte)0));
              ao.a(new bj((short)44, (short)8, paramByte1, (byte)0));
              ao.h = 1;
              bw.a((byte)20, false);
            } 
            if (this.e == d[paramByte1 * 3 + paramByte2])
              ao.h = 0; 
            break;
        } 
        break;
      case 2:
        switch (paramByte2) {
          case 0:
            h();
            j();
            break;
          case 1:
            if (this.e == 0) {
              ao.a(new bj((short)0, (short)8, paramByte1, paramByte2));
              ao.a((byte)6);
              ao.e = 1;
              bw.a((byte)21, false);
            } 
            break;
          case 2:
            if (this.e == 0) {
              ao.a(new bj((short)0, (short)12, paramByte1, paramByte2));
              ao.b.removeAllElements();
              ao.d = 0;
              ao.e = 0;
              bw.a((byte)21, false);
            } 
            break;
        } 
        break;
      case 3:
        switch (paramByte2) {
          case 0:
            a(4, 3, 3, this.a * 3 + 35 + (n.a()).g);
            a(10, 3, 3, this.a * 3 + 35 + (n.a()).g);
            a(16, 3, 3, this.a * 3 + 35 + (n.a()).g);
            a((byte)5, 0, 3);
            a((byte)5, 6, 3);
            a((byte)5, 12, 3);
            if (this.e == 0 || this.e == 6 || this.e == 12)
              bw.a((byte)16, false); 
            break;
          case 1:
            b(2);
            a((short)80, this.a + 45 + (n.a()).g * 3 / 2);
            a(super.c, super.d, (short)80, (byte)6);
            if (this.e % 8 == 0)
              bw.a((byte)16, false); 
            break;
          case 2:
            if (this.e == 0) {
              a((byte)7);
              a((short)7);
              bw.a((byte)16, false);
            } 
            break;
        } 
        break;
      case 4:
        switch (paramByte2) {
          case 0:
            a(4, 5, 3, this.a * 3 + 35 + (n.a()).g);
            a(10, 5, 3, this.a * 3 + 35 + (n.a()).g);
            a(16, 5, 3, this.a * 3 + 35 + (n.a()).g);
            a((byte)7, 0, 5);
            a((byte)7, 6, 5);
            a((byte)7, 12, 5);
            if (this.e == 0 || this.e == 6 || this.e == 12 || this.e == 18 || this.e == 24)
              bw.a((byte)18, false); 
            break;
          case 1:
            b(2);
            if (Math.abs(super.a - ao.a) + Math.abs(super.b - ao.b) <= 2) {
              ao.f = 1;
            } else {
              ao.f = 0;
            } 
            a(super.c, super.d, (short)80, (byte)8);
            if (this.e % 8 == 0)
              bw.a((byte)18, false); 
            if (this.e == d[paramByte1 * 3 + paramByte2])
              ao.f = 0; 
            break;
          case 2:
            if (this.e == 0) {
              ao.a(new bj((short)0, (short)15, paramByte1, paramByte2));
              ao.c(20);
              ao.e(20);
              bw.a((byte)20, false);
            } 
            break;
        } 
        break;
      case 5:
        switch (paramByte2) {
          case 0:
            a(4, 5, 3, this.a * 3 + 35 + (n.a()).g);
            a(10, 5, 3, this.a * 3 + 35 + (n.a()).g);
            a(16, 5, 3, this.a * 3 + 35 + (n.a()).g);
            a((byte)4, 0, 5);
            a((byte)4, 6, 5);
            a((byte)4, 12, 5);
            if (this.e == 0 || this.e == 6 || this.e == 12 || this.e == 18 || this.e == 24)
              bw.a((byte)17, false); 
            break;
          case 1:
            b(2);
            a((short)80, this.a + 45 + (n.a()).g * 3 / 2);
            a(super.c, super.d, (short)80, (byte)9);
            if (this.e % 8 == 0)
              bw.a((byte)17, false); 
            break;
          case 2:
            if (this.e == 0) {
              a((byte)9);
              a((short)9);
              bw.a((byte)17, false);
            } 
            break;
        } 
        break;
    } 
    if (this.e == d[paramByte1 * 3 + paramByte2])
      this.d = true; 
  }
  
  private final void g() {
    int i = this.a * 3 + 40 + (n.a()).g;
    ck ck1;
    if ((this.e == 1 || this.e == 5) && (ck1 = a(this.j, (byte)0)) != null && ck1 instanceof al)
      ((al)ck1).a(i, a()); 
    if ((this.e == 2 || this.e == 6) && (ck1 = a(this.j, (byte)1)) != null && ck1 instanceof al)
      ((al)ck1).a(i, a()); 
    if ((this.e == 3 || this.e == 7) && (ck1 = a(this.j, (byte)2)) != null && ck1 instanceof al)
      ((al)ck1).a(i, a()); 
    if ((this.e == 5 || this.e == 9) && (ck1 = a(this.j, (byte)3)) != null && ck1 instanceof al)
      ((al)ck1).a(i, a()); 
    if (this.e == 8 || this.e == 12) {
      int j = super.a + u.a[this.j] * 3 + u.a[u.e[this.j]];
      int k = super.b + u.b[this.j] * 3 + u.b[u.e[this.j]];
      int m = super.a + u.a[this.j] * 3 + u.a[u.f[this.j]];
      int n = super.b + u.b[this.j] * 3 + u.b[u.f[this.j]];
      char c;
      if (j > 0 && j < ((ae)n.a).a - 1 && k > 0 && k < ((ae)n.a).b - 1 && (c = ((ae)n.a).a[k][j]) != null && c instanceof al)
        ((al)c).a(i, a()); 
      if (m > 0 && m < ((ae)n.a).a - 1 && n > 0 && n < ((ae)n.a).b - 1 && (c = ((ae)n.a).a[n][m]) != null && c instanceof al)
        ((al)c).a(i, a()); 
    } 
  }
  
  private final void h() {
    if (this.e >= 0 && this.e <= 5) {
      ((ae)n.a).e = h.a(-4, 4);
      ((ae)n.a).f = h.a(-4, 4);
    } 
    int i = this.a * 3 + 35 + (n.a()).g * 3 / 2;
    ck ck1;
    if ((this.e == 2 || this.e == 6) && (ck1 = a(this.j, (byte)0)) != null && ck1 instanceof al)
      ((al)ck1).a(i, a()); 
    if ((this.e == 3 || this.e == 7) && (ck1 = a(this.j, (byte)1)) != null && ck1 instanceof al)
      ((al)ck1).a(i, a()); 
    if ((this.e == 4 || this.e == 8) && (ck1 = a(this.j, (byte)2)) != null && ck1 instanceof al)
      ((al)ck1).a(i, a()); 
    if ((this.e == 5 || this.e == 9) && (ck1 = a(this.j, (byte)3)) != null && ck1 instanceof al)
      ((al)ck1).a(i, a()); 
  }
  
  private final void a(short paramShort, int paramInt) {
    boolean[][] arrayOfBoolean = n.a;
    if (this.e < paramShort) {
      int i = super.a + this.j[0];
      int j = super.b + this.j[1];
      char c;
      if (i >= 0 && j >= 0 && i < ((ae)arrayOfBoolean).a && j < ((ae)arrayOfBoolean).b && (c = ((ae)arrayOfBoolean).a[j][i]) != null && c instanceof al)
        ((al)c).a(paramInt, a()); 
      i = super.a + this.j[2];
      j = super.b + this.j[3];
      if (i >= 0 && j >= 0 && i < ((ae)arrayOfBoolean).a && j < ((ae)arrayOfBoolean).b && (c = ((ae)arrayOfBoolean).a[j][i]) != null && c instanceof al)
        ((al)c).a(paramInt, a()); 
    } 
  }
  
  private final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    int j = (i = this.e - paramInt1) / paramInt2;
    if (i < 0)
      return; 
    if (i % paramInt2 != 0)
      return; 
    if (j == 0) {
      ck ck1;
      if ((ck1 = a(this.j, (byte)0)) != null && ck1 instanceof al) {
        ((al)ck1).a(paramInt4, a());
        return;
      } 
    } else {
      byte b;
      for (b = 1; b <= 4; b = (byte)(b + 1)) {
        ck ck1;
        if ((ck1 = a(b, (byte)j)) != null && ck1 instanceof al)
          ((al)ck1).a(paramInt4, a()); 
      } 
    } 
  }
  
  private final void a(byte paramByte) {
    if (this.e == 0)
      for (byte b = 0; b <= 3; b++) {
        ck ck1;
        if ((ck1 = a(this.j, (byte)b)) != null && ck1 instanceof al && !(ck1 instanceof av) && ((al)ck1).a.c == a())
          ((al)ck1).c(paramByte); 
      }  
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = paramInt1 + super.c + super.c;
    int j = paramInt2 + super.d + super.d;
    int k = ce.a[0].getHeight();
    Image[] arrayOfImage;
    Image image1 = (arrayOfImage = (Image[])ce.a[12])[0];
    Image image2 = arrayOfImage[1];
    Image image3 = arrayOfImage[2];
    Image image4 = arrayOfImage[3];
    Image image5 = ce.a[0];
    Image image6 = ce.a[1];
    switch (this.i) {
      case 0:
        return;
      case 1:
        switch (this.b) {
          case 0:
            paramGraphics.drawImage(image3, i, j, 33);
            break;
          case 1:
            paramGraphics.drawImage(image4, i, j, 33);
            break;
          case 2:
            paramGraphics.drawImage(image4, i, j, 33);
            paramGraphics.drawImage(image1, i, j + 3, 33);
            break;
          case 3:
            paramGraphics.drawImage(image4, i, j, 33);
            paramGraphics.drawImage(image1, i, j + 3, 33);
            paramGraphics.drawImage(image2, i, j + 6, 33);
            break;
          case 4:
            paramGraphics.drawImage(image3, i, j, 33);
            paramGraphics.drawImage(image2, i, j + 6, 33);
            break;
          case 5:
            k = k * 7 / 10;
            as.a(paramGraphics, i - 20, j - 50, 40, 50);
            paramGraphics.drawImage(image5, i, j + k, 33);
            paramGraphics.setClip(0, 0, as.a, as.b);
            break;
          case 6:
            k = k * 5 / 10;
            as.a(paramGraphics, i - 20, j - 50, 40, 50);
            paramGraphics.drawImage(image5, i, j + k, 33);
            paramGraphics.setClip(0, 0, as.a, as.b);
            paramGraphics.drawImage(image3, i, j, 33);
            break;
          case 7:
            k = k * 3 / 10;
            as.a(paramGraphics, i - 20, j - 50, 40, 50);
            paramGraphics.drawImage(image5, i, j + k, 33);
            paramGraphics.setClip(0, 0, as.a, as.b);
            paramGraphics.drawImage(image4, i, j, 33);
            break;
          case 8:
            k = k * 1 / 5;
            as.a(paramGraphics, i - 20, j - 50, 40, 50);
            paramGraphics.drawImage(image5, i, j + k, 33);
            paramGraphics.setClip(0, 0, as.a, as.b);
            paramGraphics.drawImage(image4, i, j, 33);
            break;
          case 9:
            paramGraphics.drawImage(image5, i, j, 33);
            paramGraphics.drawImage(image3, i, j, 33);
            break;
        } 
        return;
      case 2:
        paramGraphics.drawImage(image6, i, j + ((this.l % 3 == 0) ? 1 : 0), 33);
        switch (this.b) {
          case 1:
            paramGraphics.drawImage(image1, i, j + 3, 33);
            break;
          case 2:
            paramGraphics.drawImage(image1, i, j + 3, 33);
            paramGraphics.drawImage(image2, i, j + 6, 33);
            break;
          case 3:
            paramGraphics.drawImage(image2, i, j + 6, 33);
            break;
        } 
        return;
      case 3:
        if (this.b < 6)
          paramGraphics.drawImage(image6, i, j, 33); 
        switch (this.b) {
          case 6:
            k = k * 1 / 10;
            as.a(paramGraphics, i - 20, j - 50, 40, 50);
            paramGraphics.drawImage(image5, i, j + k, 33);
            paramGraphics.setClip(0, 0, as.a, as.b);
            paramGraphics.drawImage(image4, i, j, 33);
            paramGraphics.drawImage(image1, i, j + 3, 33);
            paramGraphics.drawImage(image2, i, j + 6, 33);
            return;
          case 7:
            k = k * 3 / 10;
            as.a(paramGraphics, i - 20, j - 50, 40, 50);
            paramGraphics.drawImage(image5, i, j + k, 33);
            paramGraphics.setClip(0, 0, as.a, as.b);
            paramGraphics.drawImage(image4, i, j, 33);
            paramGraphics.drawImage(image1, i, j + 3, 33);
            return;
          case 8:
            k = k * 5 / 10;
            as.a(paramGraphics, i - 20, j - 50, 40, 50);
            paramGraphics.drawImage(image5, i, j + k, 33);
            paramGraphics.setClip(0, 0, as.a, as.b);
            paramGraphics.drawImage(image4, i, j, 33);
            return;
          case 9:
            k = k * 7 / 10;
            as.a(paramGraphics, i - 20, j - 50, 40, 50);
            paramGraphics.drawImage(image5, i, j + k, 33);
            paramGraphics.setClip(0, 0, as.a, as.b);
            paramGraphics.drawImage(image3, i, j, 33);
            break;
        } 
        break;
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    int i = (r.g - 80) / 2;
    boolean bool1 = false;
    GraphicParent.a(paramGraphics, i, 2, 80, 25, false);
    paramGraphics.setClip(0, 0, r.g, r.h);
    paramGraphics.translate(i + 2, 4);
    boolean bool2 = false;
    GraphicParent.a(paramGraphics, 0, 0, 80, 21, ce.c.a(this.f * 8 + this.m * 2), 0, 1, 6233919, 16777215);
    paramGraphics.setColor(0);
    paramGraphics.fillRect(3, 18, 74, 2);
    paramGraphics.translate(-(i + 2), -4);
    paramGraphics.setColor(16733525);
    paramGraphics.fillRect(i + 5, 22, 70 * (this.k - this.l + 1) / this.k, 2);
  }
  
  private final void i() {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean[][] arrayOfBoolean = n.a;
    switch (this.e) {
      case 0:
        bw.a((byte)16, false);
      case 5:
        a((ae)arrayOfBoolean, super.c, super.d, (byte)1);
        return;
      case 1:
      case 6:
        a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 16), (short)(super.d + u.b[this.j] * 16), (byte)1);
        return;
      case 2:
      case 7:
        a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 32), (short)(super.d + u.b[this.j] * 32), (byte)1);
        return;
      case 4:
      case 8:
        bw.a((byte)16, false);
        a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 48), (short)(super.d + u.b[this.j] * 48), (byte)2);
        a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 48 + u.a[u.e[this.j]] * 16), (short)(super.d + u.b[this.j] * 48 + u.b[u.e[this.j]] * 16), (byte)2);
        a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 48 + u.a[u.f[this.j]] * 16), (short)(super.d + u.b[this.j] * 48 + u.b[u.f[this.j]] * 16), (byte)2);
        break;
    } 
  }
  
  private final void j() {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean[][] arrayOfBoolean = n.a;
    switch (this.e) {
      case 0:
        bw.a((byte)17, false);
      case 4:
        a((ae)arrayOfBoolean, super.c, super.d, (byte)4);
        return;
      case 1:
      case 5:
        a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 16), (short)(super.d + u.b[this.j] * 16), (byte)4);
        return;
      case 2:
      case 6:
        a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 32), (short)(super.d + u.b[this.j] * 32), (byte)4);
        return;
      case 3:
      case 7:
        bw.a((byte)17, false);
        a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 48), (short)(super.d + u.b[this.j] * 48), (byte)4);
        break;
    } 
  }
  
  private final void a(int paramInt1, int paramInt2, short paramShort, byte paramByte) {
    boolean bool = false;
    boolean[][] arrayOfBoolean = n.a;
    if (this.e < paramShort) {
      byte b1 = this.j[0];
      byte b2 = this.j[1];
      a((ae)arrayOfBoolean, (short)(paramInt1 + 16 * b1), (short)(paramInt2 + 16 * b2), paramByte);
      b1 = this.j[2];
      b2 = this.j[3];
      a((ae)arrayOfBoolean, (short)(paramInt1 + 16 * b1), (short)(paramInt2 + 16 * b2), paramByte);
    } 
  }
  
  private final void a(byte paramByte, int paramInt1, int paramInt2) {
    int i;
    if ((i = this.e - paramInt1) < 0)
      return; 
    if (i % paramInt2 != 0)
      return; 
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean[][] arrayOfBoolean = n.a;
    if (i / paramInt2 == 0) {
      a((ae)arrayOfBoolean, super.c, super.d, paramByte);
      return;
    } 
    if (i / paramInt2 == 1) {
      a((ae)arrayOfBoolean, (short)(super.c + 16), super.d, paramByte);
      a((ae)arrayOfBoolean, (short)(super.c - 16), super.d, paramByte);
      a((ae)arrayOfBoolean, super.c, (short)(super.d + 16), paramByte);
      a((ae)arrayOfBoolean, super.c, (short)(super.d - 16), paramByte);
      return;
    } 
    if (i / paramInt2 == 2) {
      a((ae)arrayOfBoolean, (short)(super.c + 32), super.d, paramByte);
      a((ae)arrayOfBoolean, (short)(super.c - 32), super.d, paramByte);
      a((ae)arrayOfBoolean, super.c, (short)(super.d + 32), paramByte);
      a((ae)arrayOfBoolean, super.c, (short)(super.d - 32), paramByte);
      return;
    } 
    if (i / paramInt2 == 3) {
      a((ae)arrayOfBoolean, (short)(super.c + 48), super.d, paramByte);
      a((ae)arrayOfBoolean, (short)(super.c - 48), super.d, paramByte);
      a((ae)arrayOfBoolean, super.c, (short)(super.d + 48), paramByte);
      a((ae)arrayOfBoolean, super.c, (short)(super.d - 48), paramByte);
    } 
  }
  
  private final void a(short paramShort) {
    if (this.e == 0) {
      boolean[][] arrayOfBoolean = n.a;
      for (byte b = 1; b <= 3; b++) {
        ck ck1;
        if ((ck1 = a(this.j, (byte)b)) != null && ck1 instanceof al && !(ck1 instanceof av) && ((al)ck1).a.c == a()) {
          ((al)ck1).a(new bj((short)0, paramShort, this.f, this.m));
        } else {
          a((ae)arrayOfBoolean, (short)(super.c + u.a[this.j] * 16 * b), (short)(super.d + u.b[this.j] * 16 * b), (byte)10);
        } 
      } 
    } 
  }
  
  private static final void a(ae paramae, short paramShort1, short paramShort2, byte paramByte) {
    paramae.b(new y(paramShort1, paramShort2, paramByte));
  }
  
  private final void b(int paramInt) {
    this.j[0] = (byte)(ck.a.nextInt() % (paramInt + 1));
    this.j[1] = (byte)(ck.a.nextInt() % (paramInt - Math.abs(this.j[0]) + 1));
    this.j[2] = (byte)(ck.a.nextInt() % (paramInt + 1));
    this.j[3] = (byte)(ck.a.nextInt() % (paramInt - Math.abs(this.j[2]) + 1));
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */