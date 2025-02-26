public final class ag extends av {
  private cd a;
  
  private bd a;
  
  public ag(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    super(paramByte1, paramByte2, paramByte3, paramByte4, (byte)3);
  }
  
  public final void a(cd paramcd, bd parambd) {
    this.a = (bd)paramcd;
    this.a = parambd;
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
    if (this.p == 0) {
      b((byte)2);
      q();
      return;
    } 
  }
  
  public final void j() {
    if (this.k == 2) {
      n.a.b(new i((byte)(super.a - 1), (byte)(this.b - 1), (byte[])ce.f[this.n], this, this.i, (byte)13, (byte)2));
      n.a.b(new i((byte)(super.a + 3), (byte)(this.b - 1), (byte[])ce.f[this.n], this, this.i, (byte)13, (byte)2));
      n.a.b(new i(super.a, this.b, (byte[])ce.f[this.n], this, this.i, (byte)13, (byte)2));
      n.a.b(new i((byte)(super.a + 2), this.b, (byte[])ce.f[this.n], this, this.i, (byte)13, (byte)2));
      n.a.b(new i((byte)(super.a + 1), (byte)(this.b + 1), (byte[])ce.f[this.n], this, this.i, (byte)13, (byte)2));
    } 
  }
  
  public final void k() {
    if (this.q > 8) {
      n.a.b(new y((byte)(super.a + h.a(-2, 2)), (byte)(this.b + h.a(-2, 2)), (byte[])ce.f[this.a.n]));
      n.a.b(new y((byte)(super.a + h.a(-2, 2)), (byte)(this.b + h.a(-2, 2)), (byte[])ce.f[this.a.n]));
    } 
  }
  
  public final void l() {
    super.l();
    ah.a((byte)1);
  }
  
  public final void m() {
    this.a.l();
    this.a.l();
    this.q = 24;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ag.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */