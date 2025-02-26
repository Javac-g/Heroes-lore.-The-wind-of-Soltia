package Graphics;

public final class cd extends av {
  private ag a;
  
  private bd a;
  
  private byte v = 0;
  
  public cd(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    super(paramByte1, paramByte2, paramByte3, paramByte4, (byte)2);
  }
  
  public final void a(ag paramag, bd parambd) {
    this.a = (bd)paramag;
    this.a = parambd;
  }
  
  public final void d() {
    this.k = (byte)(this.k + 1);
    n();
    o();
  }
  
  public final void h() {
    if (this.k >= super.a.j)
      a((byte)1); 
  }
  
  public final void i() {
    if (this.p == 0) {
      q();
      return;
    } 
  }
  
  public final void j() {
    if (this.k == 5) {
      if (this.a.h != 6 && this.a.h != 5 && this.a.a < this.a.a.a / 2) {
        a(this.a);
        return;
      } 
      if (this.a.h != 6 && this.a.h != 5 && this.a.a < this.a.a.a / 2) {
        a(this.a);
        return;
      } 
      if (this.h != 6 && this.h != 5 && super.a < super.a.a / 2) {
        a(this);
        return;
      } 
      switch (this.v) {
        case 0:
          if (this.a.a < this.a.a.a)
            a(this.a); 
          this.v = 1;
          return;
        case 1:
          if (this.a.a < this.a.a.a)
            a(this.a); 
          this.v = 2;
          return;
        case 2:
          if (super.a < super.a.a)
            a(this); 
          this.v = 0;
          break;
      } 
    } 
  }
  
  private void a(al paramal) {
    paramal.a(new aw((byte)9, (short)-1, (short)this.n));
    paramal.c(this.a.a.a / 10);
    paramal.a(new aw((byte)7, (short)4, (short)-(this.a.a.a / 10)));
  }
  
  public final void m() {
    this.q = 0;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/cd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */