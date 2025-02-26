import javax.microedition.lcdui.Graphics;

public final class ay extends GraphicParent {
  public ay(GraphicParent paramcb) {
    super(paramcb, (byte)30);
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (c(paramInt1, paramInt2)) {
      this.a.a = 1;
      return true;
    } 
    if (paramInt2 == 53 || paramInt1 == 8) {
      ad ad;
      if ((ad = (n.a()).a.a(this.b)) != null)
        if (ad instanceof e) {
          e e;
          if ((e = (e)ad).b) {
            if (e instanceof l) {
              if ((n.a == 6 && e.f == 0) || (n.a == 7 && e.f == 2) || (n.a == 8 && e.f == 1)) {
                Object[] arrayOfObject = { ai.a.a(11), ai.a.a(10) };
                a((byte)4, (byte)2, arrayOfObject);
              } else {
                Object[] arrayOfObject = new Object[2];
                if (e.f == 0) {
                  arrayOfObject[0] = ai.a.a(8);
                } else if (e.f == 2) {
                  arrayOfObject[0] = ai.a.a(9);
                } else if (e.f == 1) {
                  arrayOfObject[0] = ai.a.a(50);
                } 
                arrayOfObject[1] = ai.a.a(12);
                a((byte)6, (byte)2, arrayOfObject);
              } 
            } else if (e.f == 3 && n.a != 8) {
              Object[] arrayOfObject = { ai.a.a(12) };
              a((byte)6, (byte)2, arrayOfObject);
            } else {
              Object[] arrayOfObject = { ai.a.a(11), ai.a.a(10) };
              a((byte)4, (byte)2, arrayOfObject);
            } 
          } else {
            Object[] arrayOfObject = { ai.a.a(12) };
            a((byte)6, (byte)2, arrayOfObject);
          } 
        } else if (ad.a()) {
          Object[] arrayOfObject = { ai.a.a(13), ai.a.a(10) };
          a((byte)5, (byte)2, arrayOfObject);
        } else if (ad.b()) {
          Object[] arrayOfObject = { ai.a.a(14) };
          a(arrayOfObject);
        } else {
          Object[] arrayOfObject = { ai.a.a(12) };
          a((byte)6, (byte)2, arrayOfObject);
        }  
      return true;
    } 
    return false;
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    super.a(paramByte1, paramByte2);
    ao ao;
    p p = (ao = n.a()).a;
    if (paramByte1 == 4 && paramByte2 == 0) {
      e e;
      switch ((e = (e)p.a(this.b)).f) {
        case 0:
        case 1:
        case 2:
          ao.b(this.b, (byte)0);
          break;
        case 5:
          ao.b(this.b, (byte)2);
          break;
        case 6:
          ao.b(this.b, (byte)3);
          break;
        case 3:
          ao.b(this.b, (byte)1);
          break;
        case 4:
          ao.b(this.b, (byte)4);
          break;
      } 
      return;
    } 
    if (paramByte1 == 5 && paramByte2 == 0) {
      ao.a(p.a(this.b));
      return;
    } 
    if ((paramByte1 == 4 && paramByte2 == 1) || (paramByte1 == 5 && paramByte2 == 1)) {
      Object[] arrayOfObject = { ai.a.a(12) };
      a((byte)6, (byte)2, arrayOfObject);
      return;
    } 
    if (paramByte1 == 6 && paramByte2 == 0)
      p.a(this.b, (byte)1); 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += 2;
    paramInt2 += 15;
    p p = (n.a()).a;
    r.a(paramGraphics, ce.g.a(2), paramInt1 + 5, paramInt2);
    a(paramGraphics, paramInt1, paramInt2, true);
    for (int i = c(); i <= d(); i++) {
      ad ad1;
      if ((ad1 = p.a(i)) != null)
        GraphicParent.a(paramGraphics, paramInt1 + 13, paramInt2 + 18 + 23 * i % 5, ad1, true);
    } 
    ad ad;
    if ((ad = p.a(this.b)) != null) {
      GraphicParent.a(paramGraphics, paramInt1 + 33, paramInt2 + 14, ad);
      return;
    } 
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 33, paramInt2 + 14, ai.a.a(15), 1);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ay.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */