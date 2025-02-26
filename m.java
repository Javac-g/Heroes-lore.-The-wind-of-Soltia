import javax.microedition.lcdui.Graphics;

public class m extends GraphicParent {
  public byte[] h;
  
  public byte c;
  
  private char[] a;
  
  public m(GraphicParent paramcb, byte[] paramArrayOfbyte, byte paramByte, char[] paramArrayOfchar) {
    super(paramcb, (byte)paramArrayOfbyte.length);
    this.h = paramArrayOfbyte;
    this.c = paramByte;
    this.a = paramArrayOfchar;
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokevirtual b : (II)Z
    //   6: ifeq -> 11
    //   9: iconst_1
    //   10: ireturn
    //   11: aload_0
    //   12: iload_1
    //   13: iload_2
    //   14: invokevirtual c : (II)Z
    //   17: ifeq -> 22
    //   20: iconst_1
    //   21: ireturn
    //   22: iload_2
    //   23: bipush #53
    //   25: if_icmpeq -> 34
    //   28: iload_1
    //   29: bipush #8
    //   31: if_icmpne -> 56
    //   34: aload_0
    //   35: getfield a : Lcb;
    //   38: aload_0
    //   39: getfield c : B
    //   42: aload_0
    //   43: getfield h : [B
    //   46: aload_0
    //   47: getfield b : B
    //   50: baload
    //   51: invokevirtual a : (BB)V
    //   54: iconst_1
    //   55: ireturn
    //   56: iload_2
    //   57: bipush #-8
    //   59: if_icmpne -> 73
    //   62: aload_0
    //   63: getfield a : Lcb;
    //   66: iconst_m1
    //   67: iconst_m1
    //   68: invokevirtual a : (BB)V
    //   71: iconst_1
    //   72: ireturn
    //   73: iconst_1
    //   74: ireturn
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    ad ad;
    ao ao = n.a();
    paramInt2 -= 3;
    paramInt1 += 2;
    paramInt2 += 14;
    GraphicParent.c(paramGraphics, paramInt1, paramInt2 - 14, 151, 170);
    boolean bool = (b() > 1) ? true : false;
    GraphicParent.b(paramGraphics, paramInt1 + 3, paramInt2 - 13 + (bool ? 0 : 3), 145, 14, 10452863);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 6, paramInt2 - 10 + (bool ? 0 : 3), this.a, 1);
    a(paramGraphics, paramInt1, paramInt2, bool);
    for (int i = c(); i <= d(); i++) {
      if (this.h[i] >= 100) {
        ad = ao.a(this.h[i] - 100);
      } else if (this.h[i] < 0) {
        ad = ao.b.a(-this.h[i] - 1);
      } else {
        ad = ao.a.a(this.h[i]);
      } 
      if (ad != null)
        GraphicParent.a(paramGraphics, paramInt1 + 13, paramInt2 + 18 + 23 * i % 5, ad, true);
    } 
    if (this.h[this.b] >= 100) {
      ad = ao.a(this.h[this.b] - 100);
    } else if (this.h[this.b] < 0) {
      ad = ao.b.a(-this.h[this.b] - 1);
    } else {
      ad = ao.a.a(this.h[this.b]);
    } 
    if (ad != null)
      GraphicParent.a(paramGraphics, paramInt1 + 33, paramInt2 + 14, ad);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */