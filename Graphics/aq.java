package Graphics;

public final class aq {
  public int a;
  
  public ck a = null;
  
  public ck b = null;
  
  public aq() {
    this.a = false;
  }
  
  public final void a(ck paramck) {
    paramck.a = this.a;
    paramck.b = null;
    if (this.a != null)
      this.a.b = paramck; 
    this.a = paramck;
    if (this.b == null)
      this.b = this.a; 
    this.a++;
  }
  
  public final void b(ck paramck) {
    paramck.b = this.b;
    paramck.a = null;
    if (this.b != null)
      this.b.a = paramck; 
    this.b = paramck;
    if (this.a == null)
      this.a = this.b; 
    this.a++;
  }
  
  public final ck a(ck paramck) {
    ck ck1;
    for (ck1 = this.a; ck1 != null && !ck1.equals(paramck); ck1 = ck1.a);
    if (ck1 != null) {
      if (ck1.b != null) {
        ck1.b.a = ck1.a;
      } else {
        this.a = ck1.a;
      } 
      if (ck1.a != null) {
        ck1.a.b = ck1.b;
      } else {
        this.b = ck1.b;
      } 
      this.a--;
      return ck1;
    } 
    return null;
  }
  
  public final void c(ck paramck) {
    if (paramck.b != null && paramck.d + paramck.d < paramck.b.d + paramck.b.d) {
      paramck.b.a = paramck.a;
      if (paramck.a == null) {
        this.b = paramck.b;
      } else {
        paramck.a.b = paramck.b;
      } 
      ck ck1;
      for (ck1 = paramck.b; ck1 != null && paramck.d + paramck.d < ck1.d + ck1.d; ck1 = ck1.b);
      if (ck1 == null) {
        a(paramck);
        return;
      } 
      ck1.a.b = paramck;
      paramck.a = ck1.a;
      ck1.a = paramck;
      paramck.b = ck1;
      return;
    } 
    if (paramck.a != null && paramck.d + paramck.d > paramck.a.d + paramck.a.d) {
      paramck.c = true;
      paramck.a.b = paramck.b;
      if (paramck.b == null) {
        this.a = paramck.a;
      } else {
        paramck.b.a = paramck.a;
      } 
      ck ck1;
      for (ck1 = paramck.a; ck1 != null && paramck.d + paramck.d > ck1.d + ck1.d; ck1 = ck1.a);
      if (ck1 == null) {
        b(paramck);
        return;
      } 
      ck1.b.a = paramck;
      paramck.b = ck1.b;
      ck1.b = paramck;
      paramck.a = ck1;
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/aq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */