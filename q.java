import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class q extends GraphicParent {
  private char[] a = ce.a.a(n.a - 6);
  
  private char[] b;
  
  public q(GraphicParent paramcb) {
    super(paramcb, (byte)4);
    int i = 3 + n.a - 6;
    if (n.g == 1) {
      i += 15;
    } else if (n.g >= 2) {
      i += 18;
    } 
    this.b = ce.a.a(i);
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (c(paramInt1, paramInt2))
      return true; 
    if (super.b == 3 && (paramInt2 == 53 || paramInt1 == 8)) {
      if ((n.a()).a > null) {
        super.b = new bi(this);
      } else {
        Object[] arrayOfObject = { ai.a.a(0), ai.a.a(1) };
        a(arrayOfObject);
      } 
      return true;
    } 
    return false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    byte b;
    char[] arrayOfChar2;
    paramInt1 += 2;
    paramInt2 += 15;
    ao ao = n.a();
    char[] arrayOfChar1 = ai.a.a(2);
    r.a(paramGraphics, arrayOfChar1, paramInt1 + 5, paramInt2);
    GraphicParent.a(paramGraphics, paramInt1 + 110, paramInt2 + 2, ((g)ao.a).a);
    a(paramGraphics, paramInt1, paramInt2, false);
    r.c(paramGraphics, 1, paramInt1 + 12, paramInt2 + 16, 4);
    r.c(paramGraphics, 2, paramInt1 + 12, paramInt2 + 16 + 23, 4);
    r.c(paramGraphics, 3, paramInt1 + 12, paramInt2 + 16 + 46, 4);
    paramGraphics.drawImage(ce.a, paramInt1 + 10, paramInt2 + 14 + 69, 20);
    if (ao.a > null)
      paramGraphics.drawImage(ce.l, paramInt1 + 3, paramInt2 + 18 + 69, 36); 
    switch (super.b) {
      case 0:
        paramGraphics.setColor(16777215);
        bh.a(paramGraphics, paramInt1 + 35, paramInt2 + 18, this.a, 1);
        paramGraphics.setColor(14663551);
        bh.a(paramGraphics, paramInt1 + 33, paramInt2 + 35, this.b, 1);
        paramGraphics.drawImage((Image)ce.g, paramInt1 + 35, paramInt2 + 52, 20);
        r.c(paramGraphics, ao.g, paramInt1 + 52, paramInt2 + 52, 4);
        paramGraphics.drawImage((Image)ce.e, paramInt1 + 34, paramInt2 + 70, 20);
        r.c(paramGraphics, ao.c, paramInt1 + 102, paramInt2 + 70, 8);
        paramGraphics.setColor(4136767);
        paramGraphics.fillRect(paramInt1 + 34, paramInt2 + 79, 72, 3);
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(paramInt1 + 34 + 1, paramInt2 + 79 + 1, ao.c * 70 / ao.f, 1);
        paramGraphics.drawImage(ce.h, paramInt1 + 38, paramInt2 + 84, 20);
        r.c(paramGraphics, ao.f, paramInt1 + 102, paramInt2 + 84, 8);
        paramGraphics.drawImage((Image)ce.f, paramInt1 + 34, paramInt2 + 97, 20);
        r.d(paramGraphics, paramInt1 + 102, paramInt2 + 96, ao.a, ao.d);
        paramGraphics.drawImage(ce.j, paramInt1 + 34, paramInt2 + 106, 20);
        r.d(paramGraphics, paramInt1 + 102, paramInt2 + 105, ao.b, ao.e);
        return;
      case 1:
        paramGraphics.setColor(14663551);
        for (b = 0; b < 6; b++)
          bh.a(paramGraphics, paramInt1 + 38, paramInt2 + 21 + b * 15, ce.a.a(9 + b), 1); 
        r.c(paramGraphics, ao.b + ao.m, paramInt1 + 100, paramInt2 + 22, 8);
        r.c(paramGraphics, ao.e + ao.n, paramInt1 + 100, paramInt2 + 22 + 15, 8);
        r.c(paramGraphics, ao.f + ao.o, paramInt1 + 100, paramInt2 + 22 + 30, 8);
        r.c(paramGraphics, ao.g + ao.p, paramInt1 + 100, paramInt2 + 22 + 45, 8);
        r.c(paramGraphics, ao.h, paramInt1 + 100, paramInt2 + 22 + 60, 8);
        r.c(paramGraphics, ao.i, paramInt1 + 100, paramInt2 + 22 + 75, 8);
        return;
      case 2:
        paramGraphics.setColor(14663551);
        bh.a(paramGraphics, paramInt1 + 34, paramInt2 + 18, this.a, 1);
        paramGraphics.setColor(16777215);
        arrayOfChar2 = ce.a.a(n.a);
        if (r.g > 128) {
          bh.a(paramGraphics, paramInt1 + 34, paramInt2 + 30, 110, 1, arrayOfChar2);
          return;
        } 
        bh.a(paramGraphics, paramInt1 + 34, paramInt2 + 30, 75, 1, arrayOfChar2);
        return;
      case 3:
        GraphicParent.b(paramGraphics, paramInt1 + 34, paramInt2 + 22, 100, 26, 4136767);
        paramGraphics.setColor(16777215);
        r.a(paramGraphics, ai.a.a(3), paramInt1 + 37, paramInt2 + 25);
        r.a(paramGraphics, ai.a.a(4), paramInt1 + 37, paramInt2 + 32 + 4);
        r.c(paramGraphics, (n.a()).a, paramInt1 + 99, paramInt2 + 32 + 4, 8);
        GraphicParent.b(paramGraphics, paramInt1 + 34, paramInt2 + 62, 100, 33, 4136767);
        paramGraphics.setColor(16777215);
        bh.a(paramGraphics, paramInt1 + 40, paramInt2 + 72, ai.a.a(5), 1);
        paramGraphics.setColor(14663551);
        bh.a(paramGraphics, paramInt1 + 60, paramInt2 + 67, ai.a.a(6), 1);
        bh.a(paramGraphics, paramInt1 + 60, paramInt2 + 80, ai.a.a(7), 1);
        break;
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/q.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */