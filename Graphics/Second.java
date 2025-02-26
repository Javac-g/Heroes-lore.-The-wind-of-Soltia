package Graphics;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class Second extends GraphicParent {
  public static int a;
  
  public static int b;
  
  public static z a;
  
  private static Second a;
  
  public static final Second a() {
    if (a == null) {
      a = new Second();
      a = r.i - 77;
      b = r.j - 85;
    } 
    return a;
  }
  
  public Second() {
    super(null, (byte)0);
  }
  
  public final void d() {
    try {
      a = (Second)new z("/sgui/blak");
    } catch (IOException iOException) {}
    a((byte)8, (byte)2, new Object[] { a.a(0), a.a(1), a.a(2) });
  }
  
  public final void e() {
    a = null;
    a = null;
    super.b = null;
    n.a(2);
    bs.a.b();
    System.gc();
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2))
      return true; 
    if (paramInt2 == -8)
      e(); 
    return false;
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokespecial a : (BB)V
    //   6: iload_1
    //   7: bipush #8
    //   9: if_icmpne -> 84
    //   12: iload_2
    //   13: ifne -> 84
    //   16: aload_0
    //   17: new at
    //   20: dup
    //   21: aload_0
    //   22: invokespecial <init> : (Lcb;)V
    //   25: putfield b : Lcb;
    //   28: aload_0
    //   29: getfield b : Lcb;
    //   32: iconst_4
    //   33: anewarray java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: getstatic aa.a : Lz;
    //   41: bipush #30
    //   43: invokevirtual a : (I)[C
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: getstatic aa.a : Lz;
    //   52: bipush #31
    //   54: invokevirtual a : (I)[C
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: getstatic aa.a : Lz;
    //   63: bipush #32
    //   65: invokevirtual a : (I)[C
    //   68: aastore
    //   69: dup
    //   70: iconst_3
    //   71: getstatic aa.a : Lz;
    //   74: bipush #33
    //   76: invokevirtual a : (I)[C
    //   79: aastore
    //   80: invokevirtual a : ([Ljava/lang/Object;)V
    //   83: return
    //   84: iload_1
    //   85: bipush #8
    //   87: if_icmpne -> 108
    //   90: iload_2
    //   91: iconst_1
    //   92: if_icmpne -> 108
    //   95: aload_0
    //   96: new ch
    //   99: dup
    //   100: aload_0
    //   101: invokespecial <init> : (Lcb;)V
    //   104: putfield b : Lcb;
    //   107: return
    //   108: aload_0
    //   109: invokevirtual e : ()V
    //   112: return
  }
  
  public final void a(Graphics paramGraphics) {
    b(paramGraphics, a, b);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    bh.a(paramGraphics);
    bh.a(paramGraphics, (char[])bh.d, (char[])bh.e);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/aa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */