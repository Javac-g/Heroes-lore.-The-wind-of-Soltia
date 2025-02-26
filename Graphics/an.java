package Graphics;

public final class an {
  private int a = 1;
  
  public final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.a & 0xFFFF;
    int j;
    for (j = this.a >> 16 & 0xFFFF; paramInt2 > 0; j %= 65521) {
      int k = (paramInt2 < 5552) ? paramInt2 : 5552;
      paramInt2 -= k;
      while (k-- > 0) {
        i += paramArrayOfbyte[paramInt1++] & 0xFF;
        j += i;
      } 
      i %= 65521;
    } 
    this.a = j << 16 | i;
  }
  
  public final void a() {
    this.a = 1;
  }
  
  public final long a() {
    return this.a & 0xFFFFFFFFFFFFFFFFL;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/an.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */