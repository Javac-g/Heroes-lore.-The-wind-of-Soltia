package Graphics;

public final class cg extends av {
  private ba a;
  
  private ak a;
  
  private boolean g;
  
  private byte v;
  
  public cg(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, ba paramba, ak paramak) {
    super(paramByte1, paramByte2, paramByte3, paramByte4, (byte)2);
    this.a = (ak)paramba;
    this.a = paramak;
    this.g = false;
    this.v = 0;
  }
  
  public final void d() {
    this.k = (byte)(this.k + 1);
    n();
    o();
  }
  
  public final void h() {
    if (this.k >= super.a.k)
      a((byte)1); 
  }
  
  public final void i() {
    if (this.v >= 3) {
      this.p = 40;
      this.v = 0;
    } 
    if (this.p == 0) {
      b((byte)2);
      q();
      this.v = (byte)(this.v + 1);
      return;
    } 
  }
  
  public final void j() {
    byte b;
    ao ao = n.a();
    boolean[][] arrayOfBoolean = n.a;
    switch (this.k) {
      case 6:
        a(ao, (ae)arrayOfBoolean, this.b);
        return;
      case 7:
        a(ao, (ae)arrayOfBoolean, (byte)(this.b + 1));
        return;
      case 8:
        a(ao, (ae)arrayOfBoolean, (byte)(this.b + 2));
        return;
      case 9:
        a(ao, (ae)arrayOfBoolean, (byte)(this.b + 3));
        return;
      case 11:
        a(ao, (ae)arrayOfBoolean, (byte)(this.b + 4));
        return;
      case 12:
        for (b = 6; b <= 9; b = (byte)(b + 1)) {
          if (((ae)arrayOfBoolean).a[this.b + 4][b] == this)
            ((ae)arrayOfBoolean).a[this.b + 4][b] = null; 
        } 
        if (ao.a >= 6 && ao.a <= 9 && ao.b >= this.b + 5 && ao.b <= this.b + 8)
          ao.a(this, (short)(super.a.b / 2), (byte)2); 
        break;
    } 
  }
  
  public final void k() {
    if (this.k >= super.a.m)
      this.k = (byte)(super.a.m - 1); 
  }
  
  private void a(ao paramao, ae paramae, byte paramByte) {
    byte b;
    for (b = 6; b <= 9; b = (byte)(b + 1)) {
      if (paramae.a[paramByte][b] == paramao) {
        paramao.a((byte)2, (byte)16);
        paramao.a(this, (byte)2);
        break;
      } 
    } 
    for (b = 6; b <= 9; b = (byte)(b + 1)) {
      if (paramae.a[paramByte - 1][b] == this)
        paramae.a[paramByte - 1][b] = null; 
    } 
    for (b = 6; b <= 9; b = (byte)(b + 1)) {
      x.a((paramae.a[paramByte][b] != paramao));
      paramae.a[paramByte][b] = this;
    } 
    g();
  }
  
  public final void l() {
    if (!this.g) {
      boolean[][] arrayOfBoolean = n.a;
      for (byte b = 6; b <= 9; b = (byte)(b + 1)) {
        ck ck = this.b;
        while (ck <= this.b + 2) {
          ((ae)arrayOfBoolean).c[ck][b] = true;
          byte b1 = (byte)(ck + 1);
        } 
      } 
      this.g = true;
    } 
  }
  
  public final void m() {
    this.q = 12;
    boolean[][] arrayOfBoolean = n.a;
    for (byte b = 6; b <= 9; b = (byte)(b + 1)) {
      for (int i = this.b + 1; i <= this.b + 5; i++) {
        if (((ae)arrayOfBoolean).a[i][b] == this)
          ((ae)arrayOfBoolean).a[i][b] = null; 
      } 
    } 
    n.a.a(this.a);
    n.a.a(this.a);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/cg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */