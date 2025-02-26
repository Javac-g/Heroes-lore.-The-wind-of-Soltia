package Graphics;

import java.util.Random;
import javax.microedition.lcdui.Graphics;

public abstract class ck implements u {
  public byte a;
  
  public byte b;
  
  public boolean a;
  
  public boolean b;
  
  public short c;
  
  public short d;
  
  public byte c;
  
  public byte d;
  
  public byte e = 1;
  
  public static Random a = new Random();
  
  public ck a;
  
  public ck b;
  
  public boolean c = false;
  
  public ck(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2) {
    a(paramShort1, paramShort2);
    b();
    this.c = paramByte1;
    this.d = paramByte2;
  }
  
  public void a(short paramShort1, short paramShort2) {
    this.c = paramShort1;
    this.d = paramShort2;
  }
  
  public final void b() {
    this.b = (byte)(this.d >> 4);
    this.a = (byte)(this.c >> 4);
    this.b = ((this.d & 0xF) != 0) ? 1 : 0;
    this.a = ((this.c & 0xF) != 0) ? 1 : 0;
  }
  
  public final ck a(byte paramByte1, byte paramByte2) {
    boolean[][] arrayOfBoolean = n.a;
    switch (paramByte1) {
      case 1:
        return (this.b - paramByte2 < 0) ? null : ((ae)arrayOfBoolean).a[this.b - paramByte2][this.a];
      case 2:
        return (this.b + paramByte2 >= ((ae)arrayOfBoolean).b) ? null : ((ae)arrayOfBoolean).a[this.b + paramByte2][this.a];
      case 3:
        return (this.a - paramByte2 < 0) ? null : ((ae)arrayOfBoolean).a[this.b][this.a - paramByte2];
      case 4:
        return (this.a + paramByte2 >= ((ae)arrayOfBoolean).a) ? null : ((ae)arrayOfBoolean).a[this.b][this.a + paramByte2];
    } 
    return null;
  }
  
  public abstract void a(Graphics paramGraphics, int paramInt1, int paramInt2);
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ck.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */