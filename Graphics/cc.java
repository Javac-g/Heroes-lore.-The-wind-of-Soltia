package Graphics;

public final class cc extends av {
  private static final byte[] h = new byte[] { 1, 1, 2, 3, 2, 3 };
  
  private static final byte[] i = new byte[] { 2, 2, 12, 24, 12, 24 };
  
  private byte v = 0;
  
  private byte w;
  
  private byte x;
  
  public cc(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    super(paramByte1, paramByte2, paramByte3, paramByte4, (byte)1);
    d(h[this.v]);
  }
  
  public final void d() {
    this.k = (byte)(this.k + 1);
    ao ao = n.a();
    this.f = a(ao);
    this.g = b(ao);
    n();
    o();
  }
  
  public final void n() {
    switch (super.h) {
      case 2:
        if (this.k >= this.a.k) {
          a(false);
          i();
          return;
        } 
        break;
      case 1:
        i();
        return;
      case 3:
        if (this.k >= this.x) {
          a(false);
          this.v = (byte)(this.v + 1);
          if (this.v >= h.length)
            this.v = 0; 
          d(h[this.v]);
          this.p = i[this.v];
          this.o = i[this.v];
          i();
          return;
        } 
        break;
      case 4:
        if (this.l < 1)
          a((byte)1); 
        this.l = (byte)(this.l - 1);
        return;
      case 5:
        if (this.q < 1)
          l(); 
        this.q = (byte)(this.q - 1);
        break;
    } 
  }
  
  public final void i() {
    if (this.p == 0)
      switch (this.w) {
        case 1:
          if (this.f < 4 && this.g < 4) {
            q();
            return;
          } 
          break;
        case 2:
          if (this.f * this.g == 0 && this.f < 4 && this.g < 4) {
            q();
            return;
          } 
          break;
        case 3:
          q();
          return;
      }  
    if (this.o == 0)
      switch (this.w) {
        case 1:
          if (this.f >= 4 || this.g >= 4) {
            a((byte)2);
            this.k = 0;
            return;
          } 
          break;
        case 2:
          if (this.f * this.g != 0 || this.f >= 4 || this.g >= 4) {
            a((byte)2);
            this.k = 0;
            return;
          } 
          break;
        case 3:
          if (this.f >= 3 || this.g >= 3) {
            a((byte)2);
            this.k = 0;
          } 
          break;
      }  
  }
  
  public final void o() {
    switch (super.h) {
      case 2:
        if (this.k == 5) {
          boolean[][] arrayOfBoolean = n.a;
          ao ao = n.a();
          byte b1 = -1;
          byte b2 = -1;
          byte b3;
          for (b3 = 3; b3 > 0 && !arrayOfBoolean.a(b1, b2); b3 = (byte)(b3 - 1)) {
            if (ao.a > this.a) {
              b1 = (byte)h.a(this.a, ao.a + 1);
            } else {
              b1 = (byte)h.a(ao.a - 1, this.a);
            } 
            if (ao.b > this.b) {
              b2 = (byte)h.a(this.b, ao.b + 1);
            } else {
              b2 = (byte)h.a(ao.b - 1, this.b);
            } 
          } 
          if (b3 > 0)
            a((short)(b1 << 4), (short)(b2 << 4)); 
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
  
  public final void j() {
    ao ao = n.a();
    switch (this.w) {
      case 1:
        if (this.k == 7) {
          boolean[][] arrayOfBoolean = n.a;
          for (byte b = 1; b <= 4; b = (byte)(b + 1)) {
            if (arrayOfBoolean.a(this, ao.a + u.a[b], ao.b + u.b[b])) {
              a((short)(ao.a + u.a[b] << 4), (short)(ao.b + u.b[b] << 4));
              break;
            } 
          } 
        } 
        if (this.k == 11 && this.f + this.g <= 1) {
          ao.a(this, super.i);
          return;
        } 
        break;
      case 2:
        if (this.k == 7) {
          for (byte b = 1; b <= 4; b = (byte)(b + 1))
            n.a.b(new i((byte)(this.a + u.a[b]), (byte)(this.b + u.b[b]), (byte[])ce.f[this.n], this, b, (byte)3, (byte)2)); 
          return;
        } 
        break;
      case 3:
        if (this.k == 4 && this.f <= 2 && this.g <= 2)
          ao.a(this, (short)(this.a.b * 2), super.i); 
        break;
    } 
  }
  
  public final void k() {
    if (this.q > 8)
      n.a.b(new y((byte)(this.a + h.a(-1, 1)), (byte)(this.b + h.a(0, 3)), (byte[])ce.f[this.n])); 
  }
  
  private final void d(byte paramByte) {
    this.w = paramByte;
    int i = (paramByte - 1) * 4;
    for (byte b = 0; b < 4; b++)
      ce.h[this.n * 16 + 12 + b] = ce.i[i + b]; 
    byte[] arrayOfByte = (byte[])ce.h[this.n * 16 + 12];
    this.x = arrayOfByte[0];
  }
  
  public final void l() {
    super.l();
    ah.a((byte)1);
  }
  
  public final void m() {
    this.q = 24;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/cc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */