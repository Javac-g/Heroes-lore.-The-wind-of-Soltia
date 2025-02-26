import javax.microedition.lcdui.Graphics;
import rpg.GameMIDlet;

public final class bf extends GraphicParent {
  public static int a;
  
  public static int b;
  
  private boolean e;
  
  private byte[] h;
  
  private byte c;
  
  private byte d;
  
  private long a;
  
  private static int c = true;
  
  private static int d = true;
  
  private static bf a;
  
  public static boolean c;
  
  public static boolean d;
  
  public static final bf a() {
    return a;
  }
  
  private bf(boolean paramBoolean, byte[] paramArrayOfbyte) {
    super(null, (byte)6);
    if (w.a != null)
      super.a = (byte)(super.a + 1); 
    this.e = paramBoolean;
    this.h = paramArrayOfbyte;
    this.c = false;
    if (d || c) {
      ce.w();
      this.a = System.currentTimeMillis() + 5000L;
      if (d) {
        this.d = true;
        d = false;
        return;
      } 
      if (c) {
        this.d = true;
        c = false;
      } 
    } 
  }
  
  public static final void a(boolean paramBoolean, byte[] paramArrayOfbyte) {
    a = r.i - 77;
    b = r.j - 85;
    a = new bf(paramBoolean, paramArrayOfbyte);
    if (w.a != null) {
      c = true;
      d = true;
    } 
  }
  
  public static final void d() {
    a = null;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (this.a > 0L) {
      if (!w.c && w.b)
        if (paramInt2 == 53) {
          bh.a((String)w.a);
        } else if (paramInt2 == -8) {
          GameMIDlet.a.a();
        }  
      return true;
    } 
    if (b(paramInt1, paramInt2))
      return true; 
    if (a(paramInt1, paramInt2, false)) {
      if (!this.e && super.b == 1)
        if (paramInt1 == 6 || paramInt2 == 56) {
          super.b = (byte)(super.b + 1);
        } else {
          super.b = (byte)(super.b - 1);
        }  
      this.c = false;
      return true;
    } 
    if (paramInt2 == -8) {
      Object[] arrayOfObject = { bh.a };
      a((byte)2, (byte)2, arrayOfObject);
      this.d = true;
    } 
    if (paramInt1 == 8 || paramInt2 == 53) {
      switch (super.b) {
        case 0:
          if (this.e) {
            this.d = false;
            Object[] arrayOfObject = { bh.a(3929).toCharArray() };
            a((byte)12, (byte)2, arrayOfObject, (char[])bh.d, (char[])bh.e);
          } else {
            super.b = new c(this);
          } 
          return false;
        case 1:
          super.b = new First(this, this.h);
          return false;
        case 2:
          super.b = new be(this, false);
          return false;
        case 3:
          super.b = new bt(this, false);
          return false;
        case 4:
          super.b = new bl(this, false);
          return false;
      } 
      if (super.b == c) {
        Object[] arrayOfObject = { bh.a };
        this.d = true;
        a((byte)2, (byte)2, arrayOfObject);
      } else if (super.b == d) {
        Object[] arrayOfObject = { bh.a(3918).toCharArray() };
        this.d = true;
        a((byte)12, (byte)2, arrayOfObject);
      } 
    } 
    return false;
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    super.a(paramByte1, paramByte2);
    if (paramByte1 == 2 || paramByte1 == 12) {
      if (paramByte2 == 0) {
        switch (this.d) {
          case true:
            if (w.c) {
              Object[] arrayOfObject = { bh.a(3919).toCharArray() };
              this.d = true;
              a((byte)12, (byte)2, arrayOfObject, bh.j, (char[])bh.c);
              break;
            } 
            ce.w();
            this.a = System.currentTimeMillis() + 5000L;
            break;
          case true:
          case true:
            bh.a((String)w.a);
            break;
          case false:
            super.b = new c(this);
            break;
        } 
        return;
      } 
      switch (this.d) {
        case true:
          ce.w();
          this.a = System.currentTimeMillis() + 5000L;
          break;
      } 
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    if (this.a > 0L) {
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(0, 0, r.g, r.h);
      paramGraphics.drawImage(ce.i[4], r.i, as.d, 3);
      paramGraphics.setColor(0);
      bh.a(paramGraphics, r.g >> 1, r.h - 23, (char[])bh.b, 1);
      bh.a(paramGraphics, r.g >> 1, 10, cj.a.a(3941).toCharArray(), 1);
      if (!w.c && w.b)
        bh.a(paramGraphics, w.a().toCharArray(), (char[])bh.c); 
      if (System.currentTimeMillis() > this.a)
        GameMIDlet.a.a(); 
      return;
    } 
    b(paramGraphics, a, b);
    if (this.c < 2 && super.b == null) {
      super.a = 1;
      this.c = (byte)(this.c + 1);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt2 += 13;
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(0, 0, r.g, r.h);
    b(paramGraphics, paramInt1, paramInt2 - 12, 4);
    byte b = 18;
    if (!this.c) {
      b = 14;
    } else if (this.c == true) {
      b = 16;
    } 
    paramGraphics.drawImage(ce.l[b], paramInt1 + 155 - ce.l[b].getWidth() >> 1, paramInt2 + 12 + super.b * 16, 20);
    for (byte b1 = 0; b1 < super.a; b1++) {
      int i = paramInt2 + 14 + b1 * 16;
      b = (byte)(b1 * 2);
      if (super.b != b1 || this.c < 2)
        b = (byte)(b + 1); 
      bh.a(paramGraphics, b, paramInt1 + 155 >> 1, i);
    } 
    bh.a(paramGraphics, (char[])bh.d, (char[])bh.c);
  }
  
  public static final void c(Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool = false;
    int i = paramInt1;
    paramGraphics.drawImage(ce.l[0], i, paramInt2, 20);
    i += 12;
    paramGraphics.drawImage(ce.l[1], i, paramInt2, 20);
    byte b;
    for (b = 0; b < 3; b++) {
      i += 32;
      paramGraphics.drawImage(ce.l[1], i, paramInt2, 20);
    } 
    i += 32;
    paramGraphics.drawImage(ce.l[2], i, paramInt2, 20);
    i = paramInt1;
    paramGraphics.drawImage(ce.l[11], i, paramInt2 + 12, 20);
    i += 12;
    paramGraphics.drawImage(ce.l[12], i, paramInt2 + 12, 20);
    for (b = 0; b < 3; b++) {
      i += 32;
      paramGraphics.drawImage(ce.l[12], i, paramInt2 + 12, 20);
    } 
    i += 32;
    paramGraphics.drawImage(ce.l[13], i, paramInt2 + 12, 20);
  }
  
  public static final void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool = false;
    paramInt3++;
    int i = paramInt1;
    paramGraphics.drawImage(ce.l[3], i, paramInt2, 20);
    i += 12;
    paramGraphics.drawImage(ce.l[4], i, paramInt2, 20);
    byte b1;
    for (b1 = 0; b1 < 3; b1++) {
      i += 32;
      paramGraphics.drawImage(ce.l[4], i, paramInt2, 20);
    } 
    i += 32;
    paramGraphics.drawImage(ce.l[5], i, paramInt2, 20);
    i = paramInt1;
    paramGraphics.drawImage(ce.l[6], i, paramInt2 + 12, 20);
    i += 12;
    paramGraphics.drawImage(ce.l[7], i, paramInt2 + 12, 20);
    for (b1 = 0; b1 < 3; b1++) {
      i += 32;
      paramGraphics.drawImage(ce.l[7], i, paramInt2 + 12, 20);
    } 
    i += 32;
    paramGraphics.drawImage(ce.l[8], i, paramInt2 + 12, 20);
    i = paramInt1;
    byte b2;
    for (b2 = 0; b2 < paramInt3; b2++) {
      paramGraphics.drawImage(ce.l[9], i, paramInt2 + 36 + 24 * b2, 20);
      paramGraphics.drawImage(ce.l[10], i + 12 + 128, paramInt2 + 36 + 24 * b2, 20);
    } 
    paramGraphics.setColor(16763769);
    paramGraphics.fillRect(i + 12, paramInt2 + 36, 128, 24 * paramInt3);
    i = paramInt1;
    paramGraphics.drawImage(ce.l[11], i, paramInt2 + 36 + 24 * paramInt3, 20);
    i += 12;
    paramGraphics.drawImage(ce.l[12], i, paramInt2 + 36 + 24 * paramInt3, 20);
    for (b2 = 0; b2 < 3; b2++) {
      i += 32;
      paramGraphics.drawImage(ce.l[12], i, paramInt2 + 36 + 24 * paramInt3, 20);
    } 
    i += 32;
    paramGraphics.drawImage(ce.l[13], i, paramInt2 + 36 + 24 * paramInt3, 20);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */