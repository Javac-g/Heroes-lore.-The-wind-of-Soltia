public class t extends e implements u {
  public static final byte[] h = new byte[] { 0, 1, -1, -1, -1, 4, 3, 2, -1 };
  
  public static z a;
  
  public static final byte[] i = new byte[] { 20, 16, 6, 13, 13, 10, 10, 10, 10 };
  
  public byte c;
  
  public t(byte paramByte1, byte paramByte2) {
    super(paramByte1, paramByte2);
  }
  
  public int a(boolean paramBoolean, byte[] paramArrayOfbyte, int paramInt) {
    paramInt = super.a(paramBoolean, paramArrayOfbyte, paramInt);
    this.c = paramArrayOfbyte[paramInt++];
    return paramInt;
  }
  
  public final byte[] a() {
    byte[] arrayOfByte;
    (arrayOfByte = super.a())[9] = this.c;
    return arrayOfByte;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/t.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */