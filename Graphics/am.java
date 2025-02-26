package Graphics;

import javax.microedition.lcdui.Graphics;

public final class am extends GraphicParent {
  private char[] a;
  
  private char[] b;
  
  private byte d;
  
  public byte c;
  
  public am(GraphicParent paramcb, char[] paramArrayOfchar1, char[] paramArrayOfchar2, byte paramByte) {
    super(paramcb, (byte)0);
    this.a = paramArrayOfchar1;
    this.b = paramArrayOfchar2;
    this.c = paramByte;
    this.d = 0;
    this.d = (byte)(this.d + bh.a(paramArrayOfchar1, 135));
    this.d = (byte)(this.d + bh.a(paramArrayOfchar2, 135));
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
    //   12: bipush #53
    //   14: if_icmpeq -> 23
    //   17: iload_1
    //   18: bipush #8
    //   20: if_icmpne -> 37
    //   23: aload_0
    //   24: getfield a : Lcb;
    //   27: aload_0
    //   28: getfield c : B
    //   31: iconst_1
    //   32: invokevirtual a : (BB)V
    //   35: iconst_1
    //   36: ireturn
    //   37: iload_2
    //   38: bipush #-8
    //   40: if_icmpne -> 57
    //   43: aload_0
    //   44: getfield a : Lcb;
    //   47: aload_0
    //   48: getfield c : B
    //   51: iconst_0
    //   52: invokevirtual a : (BB)V
    //   55: iconst_1
    //   56: ireturn
    //   57: iconst_1
    //   58: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = this.d * 15 + 10;
    paramInt1 = r.i - 72;
    paramInt2 = r.j - i / 2;
    GraphicParent.a(paramGraphics, paramInt1, paramInt2, 145, i);
    b(paramGraphics, paramInt1, paramInt2, 145, i);
    int j = paramInt2 + 5;
    paramGraphics.setColor(14663551);
    bh.a(paramGraphics, paramInt1 + 5, j, 135, 1, this.a);
    j += 15 * bh.a(this.a, 135);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1 + 5, j, 135, 1, this.b);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/am.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */