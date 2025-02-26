import com.hellomoto.fullscreen.FullCn;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class r extends FullCn {
  public boolean a = false;
  
  public int f = 0;
  
  public static int g;
  
  public static int h;
  
  public static int i;
  
  public static int j;
  
  public static boolean b = false;
  
  public static int k = 0;
  
  public static int l = 100;
  
  public static int m = 0;
  
  public r() {
    System.out.println("MyGameCanvas");
    setFullScreenMode(true);
    g = getWidth();
    i = g / 2;
  }
  
  public final void i() {
    this.a = false;
    if (this.f != 0) {
      KEYRELEASED(this.f);
      this.f = 0;
    } 
  }
  
  public static final void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    Image image;
    byte[] arrayOfByte = new byte[9];
    byte b1 = 0;
    byte b2 = 0;
    byte b3 = 0;
    Image[] arrayOfImage = null;
    switch (paramInt5) {
      case 0:
        b1 = 5;
        b2 = 4;
        b3 = 7;
        arrayOfImage = ce.r;
        break;
      case 1:
        b1 = 7;
        b2 = 6;
        b3 = 9;
        arrayOfImage = ce.w;
        break;
      case 2:
        b1 = 7;
        b2 = 6;
        b3 = 9;
        image = ce.x;
        break;
      case 3:
        b1 = 9;
        b2 = 8;
        b3 = 14;
        image = ce.y;
        break;
      case 4:
        b1 = 9;
        b2 = 8;
        b3 = 14;
        image = ce.z;
        break;
    } 
    int i = paramGraphics.getClipX();
    int j = paramGraphics.getClipY();
    int k = paramGraphics.getClipWidth();
    int m = paramGraphics.getClipHeight();
    byte b = 0;
    while (true) {
      byte b4 = (byte)(paramInt1 % 10);
      paramInt1 /= 10;
      b = (byte)(b + 1);
      arrayOfByte[b] = b4;
      if (paramInt1 == 0) {
        int n = paramInt2;
        if ((paramInt4 | 0x1) == paramInt4) {
          n -= b * b2 / 2;
        } else if ((paramInt4 | 0x8) == paramInt4) {
          n -= b * b2;
        } 
        for (byte b5 = 0; b5 < b; b5++) {
          if (paramInt5 != 0) {
            as.a(paramGraphics, n + b5 * b2, paramInt3, b1, b3);
          } else {
            paramGraphics.setClip(n + b5 * b2, paramInt3, b1, b3);
          } 
          paramGraphics.drawImage(image, n + b5 * b2 - arrayOfByte[b - b5 - 1] * b1, paramInt3, 20);
        } 
        paramGraphics.setClip(i, j, k, m);
        return;
      } 
    } 
  }
  
  public static final void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    c(paramGraphics, paramInt4, paramInt1, paramInt2, 8);
    int i = a(paramInt4);
    paramGraphics.drawImage(ce.i, paramInt1 - i, paramInt2, 24);
    c(paramGraphics, paramInt3, paramInt1 - i - 9, paramInt2, 8);
  }
  
  public static final int a(int paramInt) {
    boolean bool = true;
    while (true) {
      paramInt /= 10;
      bool += true;
      if (paramInt == 0)
        return bool; 
    } 
  }
  
  public static final int a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2) {
    return a(paramGraphics, paramString.toCharArray(), paramInt1, paramInt2);
  }
  
  public static final int a(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = bh.a(paramArrayOfchar) + 2;
    int j = bh.a() + 2;
    paramGraphics.setColor(0);
    paramGraphics.fillRect(paramInt1 - 1, paramInt2 - 1, i, j);
    paramGraphics.setColor(16777215);
    bh.a(paramGraphics, paramInt1, paramInt2, paramArrayOfchar, 1);
    return paramInt1 + i;
  }
  
  public static final void c(Graphics paramGraphics) {
    if (m >= 3) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, g, h);
      paramGraphics.setColor(14663551);
      bh.a(paramGraphics, i - 48, j - 12, bh.p, 0);
      paramGraphics.drawLine(i - 50, j, i + 48, j);
      paramGraphics.fillRect(i - 51, j + 1, 2, 2);
      paramGraphics.fillRect(i + 48, j + 1, 2, 2);
      paramGraphics.setColor(10452799);
      paramGraphics.drawLine(i - 50, j + 5, i + 48, j + 5);
      paramGraphics.fillRect(i - 51, j + 3, 2, 2);
      paramGraphics.fillRect(i + 48, j + 3, 2, 2);
      char[] arrayOfChar = bh.o;
      bh.a(paramGraphics, i - bh.a(arrayOfChar) / 2, j + 50, arrayOfChar, 0);
    } 
    if (m > 3) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(i + 20, j - 12, 18, 10);
      paramGraphics.setColor(14663551);
      bh.a(paramGraphics, i + 20, j - 12, "...".substring(0, m % 4).toCharArray(), 0);
      paramGraphics.setColor(14655295);
      paramGraphics.fillRect(i - 48, j + 2, 95 * ((k < l) ? k : l) / l, 1);
      paramGraphics.setColor(16777087);
      paramGraphics.fillRect(i - 48, j + 3, 95 * ((k < l) ? k : l) / l, 1);
    } else if (m < 3) {
      paramGraphics.setColor(0);
      int i = (h + 11) / 12;
      for (byte b = 0; b < i; b++)
        paramGraphics.fillRect(0, b * 12 + m * 4, g, 4); 
    } 
    m++;
  }
  
  public static final void a(String paramString, int paramInt) {
    bs.a.g();
    if (b) {
      if (m < 3)
        m = 3; 
      b = false;
      return;
    } 
    l = paramInt;
    k = 0;
    m = 0;
  }
  
  public final void j() {
    repaint();
  }
  
  public final void a(int paramInt) {
    if (paramInt < 0 || paramInt < 350) {
      h = paramInt;
    } else {
      h = getHeight();
    } 
    j = h / 2;
  }
  
  public static final void k() {
    k++;
    if (k % 6 == 0)
      try {
        Thread.sleep(50L);
        return;
      } catch (InterruptedException interruptedException) {} 
  }
  
  static {
    (new int[26])[0] = 5;
    (new int[26])[1] = 5;
    (new int[26])[2] = 5;
    (new int[26])[3] = 5;
    (new int[26])[4] = 5;
    (new int[26])[5] = 5;
    (new int[26])[6] = 5;
    (new int[26])[7] = 5;
    (new int[26])[8] = 3;
    (new int[26])[9] = 4;
    (new int[26])[10] = 5;
    (new int[26])[11] = 5;
    (new int[26])[12] = 7;
    (new int[26])[13] = 5;
    (new int[26])[14] = 5;
    (new int[26])[15] = 5;
    (new int[26])[16] = 5;
    (new int[26])[17] = 5;
    (new int[26])[18] = 5;
    (new int[26])[19] = 5;
    (new int[26])[20] = 5;
    (new int[26])[21] = 5;
    (new int[26])[22] = 7;
    (new int[26])[23] = 5;
    (new int[26])[24] = 5;
    (new int[26])[25] = 5;
    (new int[26])[0] = 0;
    (new int[26])[1] = 4;
    (new int[26])[2] = 8;
    (new int[26])[3] = 12;
    (new int[26])[4] = 16;
    (new int[26])[5] = 20;
    (new int[26])[6] = 24;
    (new int[26])[7] = 28;
    (new int[26])[8] = 32;
    (new int[26])[9] = 34;
    (new int[26])[10] = 37;
    (new int[26])[11] = 41;
    (new int[26])[12] = 45;
    (new int[26])[13] = 51;
    (new int[26])[14] = 55;
    (new int[26])[15] = 59;
    (new int[26])[16] = 63;
    (new int[26])[17] = 67;
    (new int[26])[18] = 71;
    (new int[26])[19] = 75;
    (new int[26])[20] = 79;
    (new int[26])[21] = 83;
    (new int[26])[22] = 87;
    (new int[26])[23] = 93;
    (new int[26])[24] = 97;
    (new int[26])[25] = 101;
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/r.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */