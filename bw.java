public final class bw {
  public static int a = 10;
  
  private static int b = false;
  
  private static ci a;
  
  private static ci b;
  
  private static ci c;
  
  private static ci[] a = new ci[32];
  
  private static final String[] a = new String[] { 
      "00.mid", "01.mid", "02.mid", "03.mid", "04.mid", "05.mid", "06.mid", "07.mid", "08.wav", "def.mid", 
      "def.mid", "def.mid", "12.mid", "13.wav", "14.wav", "15.wav", "16.wav", "17.wav", "18.wav", "def.mid", 
      "20.wav", "21.wav", "22.mid", "23.mid", "24.mid", "25.mid", "26.mid", "27.mid", "28.mid", "29.mid", 
      "30.mid", "31.mid" };
  
  public static final void a() {
    if (a != null) {
      a.b();
      return;
    } 
    if (b != null)
      b.b(); 
  }
  
  public static final void b() {
    if (a != null) {
      a.a();
      return;
    } 
    if (b != null)
      b.a(); 
  }
  
  public static final void c() {
    if (b != null)
      b.b(); 
  }
  
  public static final void d() {
    if (c != null)
      c.b(); 
  }
  
  public static final void e() {
    if (a != null)
      a.b(); 
  }
  
  public static final void f() {
    if (a != null) {
      a.c();
      a = null;
    } 
    if (b != null) {
      b.c();
      b = null;
    } 
  }
  
  public static final void a(byte paramByte, boolean paramBoolean) {
    if (a[paramByte] != null) {
      c = (ci)a[paramByte];
      c.b(b);
      c.a();
    } 
  }
  
  public static final void a(int paramInt) {
    String[] arrayOfString;
    if (paramInt <= 0) {
      paramInt = 0;
    } else if (paramInt > a) {
      arrayOfString = a;
    } 
    if (b == null && arrayOfString != null)
      b(); 
    b = arrayOfString * 10;
    if (b == null)
      a(); 
    for (byte b = 0; b < a.length; b++) {
      if (a[b] != null)
        a[b].b(b); 
    } 
  }
  
  public static final void g() {
    System.out.println("readySound");
    try {
      bs.a.j();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    a(bs.a.a);
  }
  
  public static final void a(byte paramByte) {
    if (a[paramByte] == null) {
      String str = "resource:/snd/" + a[paramByte];
      a[paramByte] = (String)new ci(str);
      a[paramByte].b(b);
    } 
  }
  
  public static final void b(byte paramByte) {
    if (a[paramByte] != null) {
      a[paramByte].c();
      a[paramByte] = null;
    } 
  }
  
  public static final void b(int paramInt) {
    a = (String[])a[paramInt];
    if (a != null && !a.a()) {
      a.b(b);
      a.a(-1);
      a.a();
    } 
  }
  
  public static final void c(int paramInt) {
    b = (ci)a[paramInt];
    if (b != null && !b.a()) {
      b.b(b);
      b.a(-1);
      b.a();
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */