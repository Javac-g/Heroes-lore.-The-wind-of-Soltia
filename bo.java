import javax.microedition.lcdui.Graphics;

public final class bo extends GraphicParent {
  private char[] a;
  
  private Object[] a;
  
  private char[] b;
  
  private int a;
  
  private byte c;
  
  public bo(GraphicParent paramcb, char[] paramArrayOfchar1, Object[] paramArrayOfObject, char[] paramArrayOfchar2, int paramInt, byte paramByte) {
    super(paramcb, (byte)0);
    this.a = paramArrayOfchar1;
    this.c = paramByte;
    this.a = paramArrayOfObject;
    this.b = paramArrayOfchar2;
    this.a = paramInt;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokevirtual b : (II)Z
    //   6: ifeq -> 11
    //   9: iconst_1
    //   10: ireturn
    //   11: iload_2
    //   12: bipush #-8
    //   14: if_icmpne -> 26
    //   17: aload_0
    //   18: getfield a : Lcb;
    //   21: invokevirtual a : ()V
    //   24: iconst_1
    //   25: ireturn
    //   26: iload_2
    //   27: bipush #53
    //   29: if_icmpeq -> 38
    //   32: iload_1
    //   33: bipush #8
    //   35: if_icmpne -> 52
    //   38: aload_0
    //   39: getfield a : Lcb;
    //   42: aload_0
    //   43: getfield c : B
    //   46: iconst_0
    //   47: invokevirtual a : (BB)V
    //   50: iconst_1
    //   51: ireturn
    //   52: iconst_1
    //   53: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool = false;
    paramInt1 = r.i - 67;
    paramInt2 = r.j - 60;
    ao ao = n.a();
    GraphicParent.c(paramGraphics, paramInt1, paramInt2, 135, 120);
    GraphicParent.b(paramGraphics, paramInt1 + 3, paramInt2 + 3, 129, 17, 10452863);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 4, this.a, 1);
    GraphicParent.b(paramGraphics, paramInt1 + 3, paramInt2 + 25, 129, 60, 10452863);
    paramGraphics.setColor(16777215);
    for (byte b = 0; b < this.a.length; b++) {
      if (this.a[b] != null)
        bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 27 + b * 18, (char[])this.a[b], 1); 
    } 
    GraphicParent.a(paramGraphics, paramInt1 + 135 - 5, paramInt2 + 90, ((g)ao.a).a);
    GraphicParent.b(paramGraphics, paramInt1 + 3, paramInt2 + 98, 129, 15, 10452863);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 99, this.b, 1);
    GraphicParent.a(paramGraphics, paramInt1 + 135 - 5, paramInt2 + 105, this.a);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */