import javax.microedition.lcdui.Graphics;

public abstract class av extends al {
  public byte f;
  
  public byte g;
  
  public av(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5) {
    super((short)(paramByte1 << 4), (short)(paramByte2 << 4), paramByte3, paramByte4);
    this.e = paramByte5;
    g();
  }
  
  public void d() {
    this.k = (byte)(this.k + 1);
    ao ao = n.a();
    this.f = a(ao);
    this.g = b(ao);
    n();
    e();
    o();
  }
  
  public abstract void m();
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = paramInt1 + this.c + this.c + (this.e - 1) * 8;
    int j = paramInt2 + this.d + this.d;
    int k = 0;
    switch (this.h) {
      case 2:
        k = this.n * 16 + 4 + this.j - 1;
        break;
      case 3:
        k = this.n * 16 + 12 + this.j - 1;
        break;
      case 5:
        k = this.n * 16 + 8 + this.j - 1;
        break;
      default:
        k = this.n * 16 + 0 + this.j - 1;
        break;
    } 
    if (ce.h[k] == null)
      k = this.n * 16 + 0 + this.j - 1; 
    as.b(paramGraphics, (byte[])ce.h[k], this.k, i, j);
    c(paramGraphics, i, j - this.a.a * 3);
    b(paramGraphics, i, j);
  }
  
  public final void a(int paramInt, byte paramByte) {
    if (this.h == 6 || this.h == 5)
      return; 
    if (paramInt < 0)
      paramInt = 0; 
    paramInt = paramInt * u.a[paramByte][this.a.c] / 10;
    this.a = (short)(this.a - paramInt);
    this.a.addElement(new aw((byte)7, (short)4, (short)paramInt));
    this.a.addElement(new aw((byte)1));
    if (this.a <= 0) {
      a((byte)5);
      this.k = 0;
      m();
    } 
  }
  
  public final void a(int paramInt, boolean paramBoolean1, byte paramByte1, boolean paramBoolean2, byte paramByte2, byte paramByte3, ao paramao) {
    if (this.h == 6 || this.h == 5)
      return; 
    bs.a.a(this, false);
    l l = (l)paramao.a(0);
    byte b = paramao.a().a();
    if ((paramInt -= this.a.c) < 0)
      paramInt = 0; 
    paramInt = paramInt * u.a[b][this.a.c] / 10;
    if (paramBoolean2)
      paramInt += paramInt * l.b / 10; 
    boolean bool;
    if (!(bool = (h.a(0, 99) < (this.a.d - paramao.f + paramao.o - l.e / 5 + 10) * 2) ? true : false)) {
      switch (paramByte3) {
        case 3:
          paramao.d(paramInt * 30 / 100);
          break;
        case 4:
          paramao.b(paramInt / 2);
          break;
        case 8:
          paramInt *= 2;
          break;
      } 
      this.a.addElement(new aw(paramByte2));
      b(paramInt);
      if (this.a <= 0)
        m(); 
    } else {
      this.a.addElement(new aw((byte)2));
    } 
    if (bool) {
      bw.a((byte)14, false);
      return;
    } 
    if (paramBoolean2) {
      bw.a((byte)15, false);
      return;
    } 
    bw.a((byte)13, false);
  }
  
  public void l() {
    n.a.a(this);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/av.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */