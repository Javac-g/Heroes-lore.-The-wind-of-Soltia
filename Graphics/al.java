package Graphics;

import javax.microedition.lcdui.Graphics;

public class al extends o {
  public byte m;
  
  public byte n;
  
  private int a;
  
  private int b;
  
  public j a;
  
  public short a = super.a;
  
  private byte r = 0;
  
  public byte o = 0;
  
  public byte p = 0;
  
  public byte q = 0;
  
  private byte s = 0;
  
  private byte t = 0;
  
  private boolean d;
  
  private boolean e;
  
  private boolean[] b = (boolean[])super.b;
  
  private ck c;
  
  private byte u;
  
  private boolean f;
  
  public al(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2) {
    super(paramShort1, paramShort2, (byte)8, (byte)8);
    this.m = paramByte1;
    this.n = paramByte2;
    this.a = Graphics.j.a[paramByte2];
    this.a = this.a.a;
    this.o = this.a.h;
    this.p = this.a.i;
    this.u = -10;
    this.b = new boolean[5];
    this.d = false;
    if (this.a.d != 0)
      this.e = true; 
    super.e = (this.a.a == 2) ? 2 : 1;
    a(paramShort1, paramShort2);
    this.f = true;
  }
  
  public final void a(short paramShort1, short paramShort2) {
    f();
    super.a(paramShort1, paramShort2);
    b();
    g();
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = paramInt1 + super.c + super.c + (super.e - 1) * 8;
    int k = paramInt2 + super.d + super.d;
    if (i + 16 < 0 || k < 0 || i - 16 > as.a || k > as.b + 32) {
      b(paramGraphics, i, k);
      this.f = false;
      return;
    } 
    this.f = true;
    if (this.e)
      return; 
    int m = i;
    int n = k;
    if (this.s == 3 || this.s == 1) {
      n += u.b[this.t] * 3;
      m += u.a[this.t] * 3;
    } 
    if ((this.m != 22 && this.m != 16 && !(this instanceof av)) || this instanceof cc)
      if (super.e == 1) {
        paramGraphics.drawImage(ce.u, m, n - 3, 17);
      } else {
        paramGraphics.setColor(2047807);
        paramGraphics.fillArc(m - 11, n - 6, 22, 9, 0, 360);
      }  
    int i1 = 0;
    switch (this.h) {
      case 2:
        i1 = this.n * 12 + 4 + this.j - 1;
        break;
      case 3:
        i1 = this.n * 12 + 8 + this.j - 1;
        break;
      default:
        i1 = this.n * 12 + 0 + this.j - 1;
        break;
    } 
    as.b(paramGraphics, (byte[])ce.e[i1], this.k, m, n);
    c(paramGraphics, i, k - this.a.a * 3);
    b(paramGraphics, i, k);
  }
  
  public final void a(byte paramByte) {
    this.h = paramByte;
  }
  
  public void d() {
    this.k = (byte)(this.k + 1);
    s();
    if (!this.f) {
      ao ao = n.a();
      byte b1 = a(ao);
      byte b2 = b(ao);
      if ((b1 > this.a.g || b2 > this.a.g) && this.c == null)
        return; 
    } 
    if (this.s > 0)
      this.s = (byte)(this.s - 1); 
    n();
    e();
    o();
  }
  
  private final void s() {
    for (int i = super.b.size() - 1; i >= 0; i--) {
      cf cf;
      (cf = super.b.elementAt(i)).a();
      if (cf.a == 3 && cf.a() % 8 == 0)
        b(Graphics.h.a(15, 25));
      if (cf.a) {
        super.b.removeElementAt(i);
        this.b[cf.a] = false;
      } 
    } 
  }
  
  public void n() {
    boolean bool = (super.a == null && super.b == null) ? true : false;
    if (this.h == 5) {
      if (this.q < 1) {
        l();
        return;
      } 
      this.q = (byte)(this.q - 1);
      return;
    } 
    if (this.b[0] || this.b[2]) {
      a(false);
      return;
    } 
    switch (this.h) {
      case 2:
        if (bool) {
          h();
          return;
        } 
        break;
      case 1:
        i();
        return;
      case 3:
        if (this.k >= this.a.l) {
          a(false);
          i();
          return;
        } 
        break;
      case 4:
        if (this.l < 1)
          a((byte)1); 
        this.l = (byte)(this.l - 1);
        break;
    } 
  }
  
  public void h() {
    if (this.r < this.a.h * 2 && ck.a.nextInt() > 0) {
      this.r = (byte)(this.r + this.a.h);
      this.o = 0;
      i();
      return;
    } 
    a(false);
    i();
  }
  
  public void i() {
    ao ao;
    p p = (ao = n.a()).a();
    if (this.p == 0) {
      if ((this.a.d == 0 || this.a.d == 1) && a(this.i, ao) == ao) {
        q();
        return;
      } 
      if (this.a.d == 2 || this.a.d == 3)
        for (byte b = 1; b <= 3; b = (byte)(b + 1)) {
          if (a(this.i, b) == ao) {
            q();
            return;
          } 
        }  
    } 
    if (this.o == 0) {
      byte b = 1;
      if (this.a.d == 2 || this.a.d == 3)
        b = 3; 
      if (this.c == p && p.i == 2) {
        a(p, b);
        return;
      } 
      if (this.c == ao && !p.a()) {
        a(ao, b);
        return;
      } 
      ck ck1;
      if ((ck1 = a(ao, p)) != null) {
        a(ck1, b);
        this.c = ck1;
        return;
      } 
      r();
      return;
    } 
  }
  
  public void o() {
    if (this.a.c != 0 && this.d) {
      if (this.u > 0)
        this.u = (byte)(this.u - 1); 
      if (this.u == 0) {
        n.a.a(super.a, super.b, this.m, this.n, true, (byte)1, (byte)5);
        this.u = -10;
      } 
    } 
    switch (this.h) {
      case 2:
        if (this.k >= this.a.k) {
          this.k = 0;
          return;
        } 
        return;
      case 3:
        j();
        return;
      case 5:
        k();
        return;
    } 
    if (this.k >= this.a.j)
      this.k = 0; 
    if (this.p > 0)
      this.p = (byte)(this.p - 1); 
    if (this.o > 0)
      this.o = (byte)(this.o - 1); 
  }
  
  public void j() {
    ao ao = n.a();
    this.e = false;
    if (this.k == Graphics.j.a[this.m] - 1) {
      if ((this.a.d == 0 || this.a.d == 1) && a(this.i, ao) == ao) {
        ao.a(this, this.i);
        return;
      } 
      if (this.a.d == 2) {
        for (byte b = 1; b <= 3; b = (byte)(b + 1)) {
          if (a(this.i, b) == ao) {
            ao.a(new aw((byte)9, (short)-1, (short)this.n));
            ao.a(this, this.i);
            break;
          } 
        } 
        return;
      } 
      if (this.a.d == 3)
        for (byte b = 1; b <= 3; b = (byte)(b + 1)) {
          if (a(this.i, b) == ao) {
            n.a.b(new i((byte)(super.a + u.a[this.j]), (byte)(super.b + u.b[this.j]), (byte[])ce.f[this.n], this, this.j, (byte)3, (byte)2));
            return;
          } 
        }  
    } 
  }
  
  public void k() {
    if (this.k >= this.a.j)
      this.k = 0; 
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    n.a.b(new y(paramByte1, paramByte2, (byte[])ce.f[this.n]));
  }
  
  public final void p() {
    n.a.b(new y(super.a, super.b, (byte[])ce.g[this.a.a]));
  }
  
  public final void a(boolean paramBoolean) {
    this.o = (byte)(this.a.h + this.r);
    this.r = 0;
    if (this.b[1]) {
      this.p = (byte)(this.a.i * 2 + 1);
    } else {
      this.p = (byte)(this.a.i + 1);
    } 
    if (paramBoolean)
      this.p = (byte)(this.p * Graphics.h.a(1, 7) / 10);
    a((byte)1);
    this.k = 0;
  }
  
  public final void q() {
    this.e = false;
    this.o = (byte)(this.a.h + this.r);
    this.r = 0;
    if (this.b[1]) {
      this.p = (byte)(this.a.i * 2 + 1);
    } else {
      this.p = (byte)(this.a.i + 1);
    } 
    a((byte)3);
    this.k = 0;
  }
  
  public final void r() {
    if (ck.a.nextInt() > 0) {
      a((byte)2);
    } else {
      a(true);
    } 
    b((byte)((ck.a.nextInt() & 0xFF) % 4 + 1));
  }
  
  public void l() {
    a((byte)6);
    if (this.a.b != 2)
      n.a.a(this.m, this.a.e, this.a, this.b); 
    int i = Graphics.h.a(1, 150);
    int k = this.a.b.length / 3;
    byte b1 = -1;
    byte b2 = -1;
    int m;
    for (m = 0; m < k; m++) {
      if ((i -= this.a.b[m * 3 + 2]) <= 0)
        if (this.a.b[m * 3 + 2] == 1) {
          int i1;
          if ((i1 = Graphics.h.a(1, 100)) <= 20) {
            b1 = this.a.b[m * 3];
            b2 = this.a.b[m * 3 + 1];
            break;
          } 
        } else {
          b1 = this.a.b[m * 3];
          b2 = this.a.b[m * 3 + 1];
          break;
        }  
    } 
    if (b1 != -1)
      n.a.a(super.a, super.b, b1, b2); 
    if (Graphics.h.a(1, 100) <= 60)
      n.a.a(super.a, super.b, (short)(this.a.f * 3)); 
    if (Graphics.h.a(1, 100) <= 20 + this.a.f - (n.a()).g)
      n.a.a(super.a, super.b, (byte)11, (byte)0); 
    if ((m = 20 - (n.a()).g - this.a.f) > 26)
      m = 26; 
    int n;
    if ((n = this.a.f * m / 2) > 0)
      n.a().f(n); 
    p();
  }
  
  public final byte a(ck paramck) {
    int i;
    return ((i = paramck.a - super.a) > 0) ? (byte)i : (byte)-i;
  }
  
  public final byte b(ck paramck) {
    int i;
    return ((i = paramck.b - super.b) > 0) ? (byte)i : (byte)-i;
  }
  
  public void a(int paramInt, byte paramByte) {
    if (this.h == 6 || this.h == 5)
      return; 
    t();
    this.d = true;
    this.e = false;
    if (paramInt < 0)
      paramInt = 0; 
    paramInt = paramInt * u.a[paramByte][this.a.c] / 10;
    this.a = (short)(this.a - paramInt);
    super.a.addElement(new aw((byte)7, (short)4, (short)paramInt));
    super.a.addElement(new aw((byte)1));
    this.s = 4;
    this.t = 4;
    if (this.a <= 0) {
      a((byte)5);
      this.k = 0;
      this.q = 3;
    } 
  }
  
  public void a(int paramInt, boolean paramBoolean1, byte paramByte1, boolean paramBoolean2, byte paramByte2, byte paramByte3, ao paramao) {
    if (this.h == 6 || this.h == 5)
      return; 
    bs.a.a(this, false);
    l l = (l)paramao.a(0);
    byte b = paramao.a().a();
    if (!this.d && this.a.c != 0 && b != this.a.e)
      this.u = 40; 
    t();
    this.d = true;
    this.e = false;
    if (this.a.b != null)
      paramInt /= 2; 
    if (this.b[4]) {
      paramInt -= this.a.c / 2;
    } else {
      paramInt -= this.a.c;
    } 
    if (paramInt < 0)
      paramInt = 0; 
    paramInt = paramInt * u.a[b][this.a.c] / 10;
    if (paramBoolean2)
      paramInt += paramInt * l.b / 10; 
    int i = ((i = this.a.d - paramao.f + paramao.o - l.e / 5 + 10) > 50) ? 50 : i;
    boolean bool1 = (Graphics.h.a(0, 99) < i) ? true : false;
    boolean bool2 = (paramByte3 == -1) ? true : t.h[paramByte3];
    if (!bool1) {
      switch (paramByte3) {
        case 2:
          paramInt = this.a.a;
          break;
        case 3:
          paramao.d(paramInt * 80 / 100);
          break;
        case 4:
          paramao.b(paramInt / 2);
          break;
        case 8:
          paramInt *= 2;
          break;
      } 
      if (bool2 != -1) {
        a(bool2);
        this.b[bool2] = true;
      } 
      super.a.addElement(new aw(paramByte2));
      if (paramBoolean1 && this.a > 0 && super.a == null && super.b == null) {
        a((byte)4);
        this.l = 2;
        this.i = paramByte1;
      } 
      this.s = 4;
      this.t = paramByte1;
      b(paramInt);
    } else {
      super.a.addElement(new aw((byte)2));
    } 
    if (bool1) {
      bw.a((byte)14, false);
      return;
    } 
    if (paramBoolean2) {
      bw.a((byte)15, false);
      return;
    } 
    bw.a((byte)13, false);
  }
  
  private final void t() {
    if (this.b[0]) {
      this.b[0] = false;
      for (byte b = 0; b < super.b.size(); b++) {
        cf cf;
        if ((cf = super.b.elementAt(b)).a == null) {
          super.b.removeElementAt(b);
          return;
        } 
      } 
    } 
  }
  
  public final void b(int paramInt) {
    this.a = (short)(this.a - paramInt);
    super.a.addElement(new aw((byte)7, (short)4, (short)paramInt));
    if (this.a <= 0) {
      a((byte)5);
      this.k = -1;
      this.q = 3;
    } 
  }
  
  public final void c(int paramInt) {
    this.a = (short)(this.a + paramInt);
    if (this.a > this.a.a)
      this.a = this.a.a; 
  }
  
  public final void c(byte paramByte) {
    this.e = false;
    if (this.h == 6 || this.h == 5)
      return; 
    b(this.a.a);
  }
  
  private final ck a(ao paramao, p paramp) {
    byte b1 = a(paramp);
    byte b2 = b(paramp);
    byte b3 = this.d ? (byte)((this.a.a != 0) ? 100 : 8) : this.a.g;
    boolean bool1 = (a(paramao) <= b3 && b(paramao) <= b3) ? true : false;
    boolean bool2;
    return (ck)(((bool2 = (b1 <= b3 && b2 <= b3) ? true : false) && paramp.i == 2 && Graphics.h.a(0, 9) < 7) ? paramp : (bool1 ? paramao : null));
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/al.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */