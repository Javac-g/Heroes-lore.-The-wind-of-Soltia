package Graphics;

import javax.microedition.lcdui.Graphics;

public final class i extends y {
  private o a;
  
  private boolean d;
  
  private byte f;
  
  private byte g;
  
  private byte h;
  
  private boolean e;
  
  private int a;
  
  private byte i;
  
  private boolean f;
  
  public i(byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte, o paramo, byte paramByte3, byte paramByte4, byte paramByte5) {
    super(paramByte1, paramByte2, paramArrayOfbyte);
    this.a = paramo;
    this.d = false;
    this.f = paramByte3;
    this.g = (byte)(paramByte4 - 1);
    this.h = paramByte5;
  }
  
  public i(byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte, o paramo, boolean paramBoolean1, byte paramByte3, byte paramByte4, byte paramByte5, int paramInt, byte paramByte6, boolean paramBoolean2) {
    super(paramByte1, paramByte2, paramArrayOfbyte);
    this.a = paramo;
    this.d = paramBoolean1;
    this.f = paramByte3;
    this.g = (byte)(paramByte4 - 1);
    this.h = paramByte5;
    this.a = paramInt;
    this.i = paramByte6;
    this.f = paramBoolean2;
  }
  
  public final void a() {
    if (this.b == this.h && this.g > 0 && (this.d || !this.e)) {
      boolean[][] arrayOfBoolean = n.a;
      byte b1 = (byte)(super.a + u.a[this.f]);
      byte b2 = (byte)(this.b + u.b[this.f]);
      if (b1 >= 0 && b1 < ((ae)arrayOfBoolean).a && b2 >= 0 && b2 < ((ae)arrayOfBoolean).b)
        if (this.a instanceof al) {
          arrayOfBoolean.b(new i(b1, b2, super.h, this.a, this.f, this.g, this.h));
        } else if (this.a instanceof ao) {
          arrayOfBoolean.b(new i(b1, b2, super.h, this.a, this.d, this.f, this.g, this.h, this.a, this.i, this.f));
        }  
    } 
    if ((this.d || !this.e) && this.b == 1) {
      char c = ((ae)n.a).a[this.b][super.a];
      if (this.a instanceof al) {
        if (c != null && c instanceof ao) {
          ((ao)c).a((al)this.a, this.f);
          this.e = true;
          return;
        } 
      } else if (this.a instanceof ao && c != null && c instanceof al) {
        ((al)c).a(this.a, false, this.f, this.f, (byte)1, this.i, (ao)this.a);
        this.e = true;
      } 
    } 
  }
  
  public final boolean a() {
    return (this.b == super.a || (super.a == 2 && !this.d && this.e && this.b >= 1));
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int j = paramInt1 + this.c + this.c;
    int k = paramInt2 + super.d + super.d;
    if (super.a == 2 && this.b == 1) {
      j += u.a[this.f] * 8;
      k += u.b[this.f] * 8;
    } 
    b(paramGraphics, j, k);
    this.b = (short)(this.b + 1);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */