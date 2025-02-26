package Graphics;

public final class bd extends av {
  private byte v;
  
  private byte w;
  
  public bd(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    super(paramByte1, paramByte2, paramByte3, paramByte4, (byte)2);
  }
  
  public final void d() {
    this.k = (byte)(this.k + 1);
    n();
    o();
  }
  
  public final void h() {
    if (this.k >= this.a.j)
      a((byte)1); 
  }
  
  public final void i() {
    if (this.p == 0) {
      q();
      return;
    } 
  }
  
  public final void j() {
    ao ao = n.a();
    if (this.k == 4) {
      a(ao.a, ao.b);
      this.v = ao.a;
      this.w = ao.b;
    } 
    if (this.k == 7 && this.v == ao.a && this.w == ao.b)
      ao.a(this, this.i); 
  }
  
  public final void m() {
    this.q = 0;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */