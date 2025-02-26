public final class ar extends av {
  public ar(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    super(paramByte1, paramByte2, paramByte3, paramByte4, (byte)1);
  }
  
  public final boolean a() {
    return false;
  }
  
  public final void i() {
    ao ao = n.a();
    if (this.p == 0 && this.f <= 1) {
      b((byte)2);
      q();
      return;
    } 
    if (this.o == 0)
      if (this.f > 1) {
        if (ao.a > this.a) {
          a((byte)2);
          b((byte)4);
          return;
        } 
        if (ao.a < this.a) {
          a((byte)2);
          b((byte)3);
          return;
        } 
      } else {
        a((byte)1);
        b((byte)2);
      }  
  }
  
  public final void j() {
    if (this.k == 2) {
      n.a.b(new i((byte)(this.a - 1), this.b, (byte[])ce.f[this.n], this, this.i, (byte)13, (byte)2));
      n.a.b(new i((byte)(this.a + 1), this.b, (byte[])ce.f[this.n], this, this.i, (byte)13, (byte)2));
      n.a.b(new i(this.a, (byte)(this.b + 1), (byte[])ce.f[this.n], this, this.i, (byte)13, (byte)2));
    } 
  }
  
  public final void l() {
    super.l();
    n.a.a(false);
  }
  
  public final void m() {
    this.q = 0;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ar.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */