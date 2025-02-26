import java.util.Random;

public final class h {
  public static Random a = new Random();
  
  public static final int a(int paramInt1, int paramInt2) {
    x.a((paramInt1 <= paramInt2));
    int i;
    if ((i = paramInt2 - paramInt1 + 1) == 0)
      return 0; 
    int j = Math.abs(a.nextInt()) % i;
    return paramInt1 + j;
  }
  
  public static final short a(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte.length - 2 < paramInt)
      throw new ArrayIndexOutOfBoundsException(); 
    short s = 0;
    return s = (short)((s = (short)(0x0 | (paramArrayOfbyte[paramInt] & 0xFF) << 8)) | paramArrayOfbyte[paramInt + 1] & 0xFF);
  }
  
  public static final char[] a(char[] paramArrayOfchar1, char[] paramArrayOfchar2) {
    char[] arrayOfChar = new char[paramArrayOfchar1.length + paramArrayOfchar2.length];
    System.arraycopy(paramArrayOfchar1, 0, arrayOfChar, 0, paramArrayOfchar1.length);
    System.arraycopy(paramArrayOfchar2, 0, arrayOfChar, paramArrayOfchar1.length, paramArrayOfchar2.length);
    return arrayOfChar;
  }
  
  public static final int a(byte[] paramArrayOfbyte, int paramInt) {
    int i = 0;
    return (paramArrayOfbyte.length < paramInt + 4) ? -1 : (i = (paramArrayOfbyte[paramInt] & 0xFF) << 24 | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 16 | (paramArrayOfbyte[paramInt + 2] & 0xFF) << 8 | paramArrayOfbyte[paramInt + 3] & 0xFF);
  }
  
  public static final void a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    byte[] arrayOfByte = { 0, 0, 0, 0 };
    int i = paramInt1 & 0xFFFFFFFF;
    arrayOfByte[0] = (byte)(i >> 24 & 0xFF);
    arrayOfByte[1] = (byte)(i >> 16 & 0xFF);
    arrayOfByte[2] = (byte)(i >> 8 & 0xFF);
    arrayOfByte[3] = (byte)(i & 0xFF);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt2, 4);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */