package Graphics;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public abstract class o extends ck implements u {
  public Vector a;
  
  public Vector b;
  
  public byte h;
  
  public byte i;
  
  public byte j;
  
  public byte k;
  
  public byte l = 0;
  
  public o(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2) {
    super(paramShort1, paramShort2, paramByte1, paramByte2);
    a();
  }
  
  public void a() {
    if (this.a == null)
      this.a = new Vector(2); 
    if (this.b == null)
      this.b = new Vector(3); 
    this.h = 1;
    this.i = 2;
    this.j = 2;
    this.k = -1;
  }
  
  public final void c() {
    this.a = new Vector(2);
  }
  
  public void a(byte paramByte) {
    this.k = -1;
    this.h = paramByte;
  }
  
  public final void b(byte paramByte) {
    this.i = paramByte;
    this.j = paramByte;
  }
  
  public void d() {
    e();
  }
  
  public final void e() {
    if (this.h == 2 || this.h == 4)
      a(); 
    if (this.h == 2 || this.h == 4)
      a(8); 
  }
  
  public final void f() {
    boolean[][] arrayOfBoolean = n.a;
    for (byte b = 0; b < this.e; b = (byte)(b + 1)) {
      ((ae)arrayOfBoolean).a[super.b][super.a + b] = null;
      if (super.b != null) {
        ((ae)arrayOfBoolean).a[super.b + 1][super.a + b] = null;
      } else if (super.a != null) {
        ((ae)arrayOfBoolean).a[super.b][super.a + 1 + b] = null;
      } 
    } 
  }
  
  public final void g() {
    boolean[][] arrayOfBoolean = n.a;
    for (byte b = 0; b < this.e; b = (byte)(b + 1)) {
      ((ae)arrayOfBoolean).a[super.b][super.a + b] = this;
      if (super.b != null) {
        ((ae)arrayOfBoolean).a[super.b + 1][super.a + b] = this;
      } else if (super.a != null) {
        ((ae)arrayOfBoolean).a[super.b][super.a + 1 + b] = this;
      } 
    } 
  }
  
  public boolean a() {
    boolean[][] arrayOfBoolean = n.a;
    if (super.a != null || super.b != null)
      return false; 
    if (!arrayOfBoolean.a(this, this.i)) {
      a((byte)1);
      return true;
    } 
    return false;
  }
  
  public void a(int paramInt) {
    f();
    switch (this.i) {
      case 1:
        x.a((this.d > 0));
        this.d = (short)(this.d - paramInt);
        if (super.b != null) {
          super.b = false;
          break;
        } 
        super.b = true;
        super.b = (byte)(super.b - 1);
        break;
      case 2:
        x.a((this.d < ((ae)n.a).d - 16));
        this.d = (short)(this.d + paramInt);
        if (super.b != null) {
          super.b = false;
          super.b = (byte)(super.b + 1);
          break;
        } 
        super.b = true;
        break;
      case 3:
        x.a(this.c);
        this.c = (short)(this.c - paramInt);
        if (super.a != null) {
          super.a = false;
          break;
        } 
        super.a = true;
        super.a = (byte)(super.a - 1);
        break;
      case 4:
        x.a((this.c < ((ae)n.a).c - 16));
        this.c = (short)(this.c + paramInt);
        if (super.a != null) {
          super.a = false;
          super.a = (byte)(super.a + 1);
          break;
        } 
        super.a = true;
        break;
    } 
    if (paramInt != 8)
      b(); 
    g();
  }
  
  public final void a(ck paramck, byte paramByte) {
    byte b;
    ck ck1 = paramck.a;
    ck ck2 = paramck.b;
    boolean[][] arrayOfBoolean = n.a;
    int i = 100;
    int j;
    for (j = 0; j < this.e; j = (byte)(j + 1)) {
      if (Math.abs(i) > Math.abs(ck1 - super.a + j))
        i = ck1 - super.a + j; 
    } 
    j = ck2 - super.b;
    int k = Math.abs(i);
    int m = Math.abs(j);
    int n = ck.a.nextInt();
    if ((k + m <= paramByte && k * m == 0) || paramck == a(this.j, paramck)) {
      if (j != 0) {
        if (j < 0) {
          b = 1;
        } else {
          b = 2;
        } 
      } else if (i < 0) {
        b = 3;
      } else {
        b = 4;
      } 
      b(b);
      return;
    } 
    byte b1 = 0;
    if (m == k) {
      byte b2 = (i > 0) ? 4 : 3;
      boolean bool1 = (j > 0) ? true : true;
      boolean bool2 = arrayOfBoolean.a(this, b2);
      boolean bool3 = arrayOfBoolean.a(this, bool1);
      if (bool2 && bool3) {
        b1 = (ck.a.nextInt() > 0) ? b2 : bool1;
      } else if (bool2) {
        b1 = b2;
      } else {
        b1 = bool1;
      } 
    } else if (m > k) {
      if (j > 0) {
        b1 = 2;
      } else {
        b1 = 1;
      } 
    } else if (i > 0) {
      b1 = 4;
    } else {
      b1 = 3;
    } 
    if ((k <= paramByte || m <= paramByte) && k != m)
      if (k <= paramByte && m < k) {
        if (j > 0 && arrayOfBoolean.a(this, (byte)2)) {
          b1 = 2;
        } else if (j < 0 && arrayOfBoolean.a(this, (byte)1)) {
          b1 = 1;
        } 
      } else if (m <= paramByte && m > k) {
        if (i > 0 && arrayOfBoolean.a(this, (byte)4)) {
          b1 = 4;
        } else if (i < 0 && arrayOfBoolean.a(this, (byte)3)) {
          b1 = 3;
        } 
      }  
    boolean bool = false;
    if (arrayOfBoolean.a(this, b1)) {
      b = b1;
      bool = true;
    } else {
      boolean bool1 = true;
      if ((b1 == 1 && i > 0) || (b1 == 2 && i < 0) || (b1 == 3 && j < 0) || (b1 == 4 && j > 0))
        bool1 = false; 
      if ((b = a(paramck, b1, bool1)) != 0) {
        bool = true;
      } else if ((b = a(paramck, b1, !bool1)) != 0) {
        bool = true;
      } else if (bool1 && arrayOfBoolean.a(this, u.f[b1])) {
        b = u.f[b1];
        bool = true;
      } else if (!bool1 && arrayOfBoolean.a(this, u.e[b1])) {
        b = u.e[b1];
        bool = true;
      } 
    } 
    if (!bool)
      b = (byte)((n & 0xFF) % 4 + 1); 
    a((byte)2);
    b(b);
  }
  
  private final byte a(ck paramck, byte paramByte, boolean paramBoolean) {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    byte b;
    boolean[][] arrayOfBoolean = n.a;
    if (!paramBoolean) {
      arrayOfByte1 = u.e;
      arrayOfByte2 = u.c;
    } else {
      arrayOfByte1 = u.f;
      arrayOfByte2 = u.d;
    } 
    if (paramByte == 1 || paramByte == 2) {
      b = this.e;
    } else {
      b = 1;
    } 
    for (int i = -b + 1; i < b; i++) {
      if (arrayOfBoolean.a(this, super.a + i + u.a[arrayOfByte1[paramByte]], super.b + u.b[arrayOfByte1[paramByte]]) && (arrayOfBoolean.a(this, super.a + i + u.a[arrayOfByte2[paramByte]], super.b + u.b[arrayOfByte2[paramByte]]) || paramck == ((ae)arrayOfBoolean).a[super.b + u.b[arrayOfByte2[paramByte]]][super.a + i + u.a[arrayOfByte2[paramByte]]]))
        return arrayOfByte1[paramByte]; 
    } 
    return 0;
  }
  
  public final al a() {
    ck ck1;
    return (ck1 = a(this.i, (ck)null) instanceof al) ? (al)ck1 : null;
  }
  
  public final al a(byte paramByte) {
    ck ck1;
    return (ck1 = a(paramByte, (ck)null) instanceof al) ? (al)ck1 : null;
  }
  
  public final ck a(byte paramByte, ck paramck) {
    boolean[][] arrayOfBoolean = n.a;
    Object object = null;
    for (byte b = 0; b < this.e; b++) {
      int i = super.a + u.a[paramByte] + b;
      int j = super.b + u.b[paramByte];
      x.a((i >= 0));
      x.a((i < ((ae)arrayOfBoolean).a));
      x.a((j >= 0));
      x.a((j < ((ae)arrayOfBoolean).b));
      char c;
      if ((c = ((ae)arrayOfBoolean).a[j][i]) != this) {
        if (paramck == null && c != null)
          return c; 
        if (paramck != null && c == paramck)
          return c; 
      } 
    } 
    return null;
  }
  
  public final void a(f paramf) {
    this.a.addElement(paramf);
  }
  
  public final boolean a(byte paramByte) {
    x.a((paramByte >= 0 && paramByte < 8));
    boolean bool = false;
    for (byte b = 0; b < this.b.size(); b++) {
      cf cf;
      if (!(cf = this.b.elementAt(b)).a && cf.a == paramByte) {
        cf.c();
        bool = true;
        break;
      } 
    } 
    if (!bool)
      this.b.addElement(new cf(paramByte)); 
    return bool;
  }
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      f f;
      (f = this.a.elementAt(i)).a(paramGraphics, paramInt1, paramInt2);
      if (f.a)
        this.a.removeElementAt(i); 
    } 
  }
  
  public final void c(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = -6 * (this.b.size() - 1);
    for (int j = this.b.size() - 1; j >= 0; j--) {
      cf cf;
      (cf = this.b.elementAt(j)).a(paramGraphics, paramInt1 + i, paramInt2);
      i += 12;
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/o.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */