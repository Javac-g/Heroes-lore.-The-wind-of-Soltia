public class e extends ad {
  public short a;
  
  public byte d;
  
  public boolean a;
  
  public boolean b;
  
  public byte e;
  
  public byte[] j = new byte[4];
  
  public e(byte paramByte1, byte paramByte2) {
    super(paramByte1, paramByte2);
  }
  
  public int a(boolean paramBoolean, byte[] paramArrayOfbyte, int paramInt) {
    return paramInt = (paramInt = super.a(paramBoolean, paramArrayOfbyte, paramInt)) + a(paramArrayOfbyte, paramInt, paramBoolean);
  }
  
  public final int a(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    this.a = (short)(paramArrayOfbyte[paramInt++] & 0xFF);
    this.d = paramArrayOfbyte[paramInt++];
    this.a = (paramArrayOfbyte[paramInt++] != 0);
    boolean bool = false;
    for (byte b = 1; b <= 8; b++) {
      if (paramArrayOfbyte[paramInt + b] != 0) {
        bool = true;
        break;
      } 
    } 
    if (!bool)
      this.b = true; 
    if (paramBoolean && bool) {
      byte[] arrayOfByte1 = { paramArrayOfbyte[paramInt + 1], paramArrayOfbyte[paramInt + 3], paramArrayOfbyte[paramInt + 5], paramArrayOfbyte[paramInt + 7] };
      byte[] arrayOfByte2 = { paramArrayOfbyte[paramInt + 2], paramArrayOfbyte[paramInt + 4], paramArrayOfbyte[paramInt + 6], paramArrayOfbyte[paramInt + 8] };
      a(paramArrayOfbyte[paramInt], arrayOfByte1, arrayOfByte2, (byte)0);
    } 
    return 12;
  }
  
  public byte[] a() {
    byte[] arrayOfByte;
    (arrayOfByte = super.a())[3] = this.b ? 1 : 0;
    arrayOfByte[4] = this.e;
    System.arraycopy(this.j, 0, arrayOfByte, 5, 4);
    return arrayOfByte;
  }
  
  public final void a(byte paramByte1, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte paramByte2) {
    for (byte b = 0; b < paramByte1; b++) {
      int i;
      do {
        i = h.a(0, 3);
      } while (this.j[i] != 0 || (paramArrayOfbyte1[i] == 0 && paramArrayOfbyte2[i] == 0));
      this.j[i] = (byte)h.a(paramArrayOfbyte1[i], paramArrayOfbyte2[i]);
    } 
    this.e = paramByte2;
  }
  
  public final void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    this.j[0] = paramByte1;
    this.j[1] = paramByte2;
    this.j[2] = paramByte3;
    this.j[3] = paramByte4;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */