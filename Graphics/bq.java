package Graphics;

public final class bq {
  public static final byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte1.length + 1];
    int i = 0;
    byte b2 = 0;
    for (byte b1 = 0; b1 < paramArrayOfbyte1.length; b1++) {
      byte b = paramArrayOfbyte1[b1];
      if (++b2 == paramArrayOfbyte2.length)
        b2 = 0; 
      int j = b ^ paramArrayOfbyte2[b2];
      i += paramArrayOfbyte2[b2] & 0xFF;
      arrayOfByte[b1] = (byte)j;
    } 
    arrayOfByte[paramArrayOfbyte1.length] = (byte)i;
    return arrayOfByte;
  }
  
  public static final byte[] b(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte b1;
    byte[] arrayOfByte = new byte[paramArrayOfbyte1.length + 1];
    int i = 0;
    if (paramArrayOfbyte1.length < 1)
      return null; 
    byte b2 = 0;
    try {
      for (b1 = 0; b1 < paramArrayOfbyte1.length - 1; b1++) {
        byte b = paramArrayOfbyte1[b1];
        if (++b2 == paramArrayOfbyte2.length)
          b2 = 0; 
        int j = b ^ paramArrayOfbyte2[b2];
        i += paramArrayOfbyte2[b2] & 0xFF;
        arrayOfByte[b1] = (byte)j;
      } 
    } catch (Exception exception) {
      return null;
    } 
    return ((i & 0xFF) != (paramArrayOfbyte1[b1] & 0xFF)) ? null : arrayOfByte;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */