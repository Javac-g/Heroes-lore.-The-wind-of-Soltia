import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

public final class bs implements Runnable {
  public static final int[] a = new int[] { 8, 10, 14, 18 };
  
  private Display a;
  
  private r a;
  
  public static as a;
  
  private int c;
  
  private int d;
  
  public int a;
  
  public boolean a;
  
  public boolean b;
  
  public boolean c;
  
  public boolean d;
  
  public byte a;
  
  public byte b;
  
  public int b;
  
  private long a = bw.a;
  
  public boolean e;
  
  private boolean f;
  
  public static Object a = new Object();
  
  public static bs a;
  
  public static final void a(Display paramDisplay) {
    a = new bs(paramDisplay);
  }
  
  private bs(Display paramDisplay) {
    this.a = !x.a ? 1 : 0;
    this.b = 0;
    this.c = false;
    this.d = true;
    this.a = 2;
    this.b = 0;
    this.b = 0;
    this.f = true;
    this.a = (bs)paramDisplay;
    this.c = a[this.a];
    f();
    this.b = (byte)(this.b | 0x8);
  }
  
  public final void run() {
    if (this.f) {
      this.f = false;
      this.a = (bs)new bg();
      this.a.setCurrent((Displayable)this.a);
      ((bg)this.a).a();
      bw.g();
      g();
    } 
    synchronized (a) {
      if (this.e)
        return; 
      a();
      this.a.i();
      this.a.j();
      this.a.callSerially(this);
      return;
    } 
  }
  
  public final void a() {
    this.a = System.currentTimeMillis();
  }
  
  public final void b() {
    if (!ah.a)
      a(this.a, this.d); 
  }
  
  public final void a(long paramLong1, long paramLong2) {
    long l;
    if ((l = System.currentTimeMillis() - paramLong1) < paramLong2)
      try {
        Thread.sleep(paramLong2 - l);
        return;
      } catch (InterruptedException interruptedException) {
        return;
      }  
    Thread.yield();
  }
  
  public final void c() {
    this.f = true;
    (new Thread(this)).start();
  }
  
  public final void d() {
    this.a = (bs)new as();
    a = this.a;
    this.a.setCurrent((Displayable)this.a);
    n.p();
  }
  
  public final void e() {
    this.a = (bs)new bg();
    a = null;
    ((bg)this.a).a(false, (byte)2);
    this.a.setCurrent((Displayable)this.a);
    a.g();
  }
  
  public final void a(int paramInt) {
    this.d = 1000 / paramInt;
  }
  
  public final void f() {
    a(this.c);
  }
  
  public final void g() {
    a(5);
  }
  
  public final void h() {
    a(20);
  }
  
  public final void a(byte paramByte) {
    this.a = paramByte;
    this.c = a[paramByte];
  }
  
  public final byte[] a() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: aload_0
    //   4: getfield a : I
    //   7: bipush #15
    //   9: iand
    //   10: iconst_4
    //   11: ishl
    //   12: ior
    //   13: istore_1
    //   14: getstatic x.a : Z
    //   17: ifeq -> 32
    //   20: aload_0
    //   21: getfield a : Z
    //   24: ifeq -> 32
    //   27: iload_1
    //   28: bipush #8
    //   30: ior
    //   31: istore_1
    //   32: aload_0
    //   33: getfield b : Z
    //   36: ifeq -> 43
    //   39: iload_1
    //   40: iconst_4
    //   41: ior
    //   42: istore_1
    //   43: aload_0
    //   44: getfield c : Z
    //   47: ifeq -> 54
    //   50: iload_1
    //   51: iconst_2
    //   52: ior
    //   53: istore_1
    //   54: aload_0
    //   55: getfield d : Z
    //   58: ifeq -> 65
    //   61: iload_1
    //   62: iconst_1
    //   63: ior
    //   64: istore_1
    //   65: bipush #6
    //   67: newarray byte
    //   69: dup
    //   70: astore_2
    //   71: iconst_0
    //   72: iload_1
    //   73: i2b
    //   74: bastore
    //   75: aload_2
    //   76: iconst_1
    //   77: aload_0
    //   78: getfield a : B
    //   81: bipush #15
    //   83: iand
    //   84: iconst_4
    //   85: ishl
    //   86: aload_0
    //   87: getfield b : B
    //   90: ior
    //   91: i2b
    //   92: bastore
    //   93: aload_0
    //   94: getfield b : I
    //   97: ldc -504331042
    //   99: ixor
    //   100: aload_2
    //   101: iconst_2
    //   102: invokestatic a : (I[BI)V
    //   105: aload_2
    //   106: areturn
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    this.a = (byte)((paramArrayOfbyte[0] & 0xF0) >> 4);
    if (x.a)
      this.a = ((paramArrayOfbyte[0] & 0x8) != 0) ? 1 : 0; 
    this.b = ((paramArrayOfbyte[0] & 0x4) != 0) ? 1 : 0;
    this.c = ((paramArrayOfbyte[0] & 0x2) != 0);
    this.d = ((paramArrayOfbyte[0] & 0x1) != 0);
    this.a = (byte)((paramArrayOfbyte[1] & 0xF0) >> 4);
    this.b = (byte)(paramArrayOfbyte[1] & 0xF);
    bw.a(this.a);
    a(this.a);
    this.b = h.a(paramArrayOfbyte, 2) ^ 0xE1F084DE;
  }
  
  public final void i() throws Exception {
    byte[] arrayOfByte = a();
    au au;
    (au = new au("/c", 0)).a(arrayOfByte, 0, arrayOfByte.length);
    au.a();
  }
  
  public final void j() throws Exception {
    byte[] arrayOfByte = new byte[6];
    au au;
    (au = new au("/c", 1)).b(arrayOfByte, 0, arrayOfByte.length);
    au.a();
    a(arrayOfByte);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */