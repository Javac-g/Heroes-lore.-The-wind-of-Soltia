package Graphics;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import rpg.GameMIDlet;

public final class bl extends GraphicParent {
  private char[] a;
  
  private short[] a;
  
  public bl(GraphicParent paramcb, boolean paramBoolean) {
    super(paramcb, (byte)1);
    GameMIDlet gameMIDlet = GameMIDlet.a;
    String str1 = bh.a(3927);
    String str2 = bh.a(3928);
    String str3 = gameMIDlet.getAppProperty("MIDlet-Name").toUpperCase();
    String str4 = bh.a(bh.r);
    String str5 = gameMIDlet.getAppProperty("MIDlet-Vendor");
    String str6 = bh.a((char[])bh.b);
    String str7 = bh.a(3905);
    String str8 = str3 + "\n\n" + str7 + "\n\n" + str1 + '\n' + str5 + '\n' + str6 + "\n\n" + str2 + "\nv." + str4;
    this.a = (short[])str8.toCharArray();
    short[] arrayOfShort = new short[20];
    int i = 0;
    byte b = 0;
    while (i < this.a.length) {
      arrayOfShort[b++] = (short)i;
      i += bh.a((char[])this.a, i, 130, 11);
    } 
    this.a = new short[b];
    System.arraycopy(arrayOfShort, 0, this.a, 0, this.a.length);
    super.a = (byte)this.a.length;
    ((az)bh.a).b = 0;
    bh.b.b = 0;
    bh.c.b = 0;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokevirtual b : (II)Z
    //   6: ifeq -> 11
    //   9: iconst_1
    //   10: ireturn
    //   11: aload_0
    //   12: iload_1
    //   13: iload_2
    //   14: invokevirtual c : (II)Z
    //   17: ifeq -> 22
    //   20: iconst_1
    //   21: ireturn
    //   22: iload_2
    //   23: bipush #-8
    //   25: if_icmpne -> 58
    //   28: aload_0
    //   29: getfield a : Lcb;
    //   32: invokevirtual a : ()V
    //   35: getstatic bh.a : Lb;
    //   38: iconst_1
    //   39: putfield b : Z
    //   42: getstatic bh.b : Lb;
    //   45: iconst_1
    //   46: putfield b : Z
    //   49: getstatic bh.c : Lb;
    //   52: iconst_1
    //   53: putfield b : Z
    //   56: iconst_1
    //   57: ireturn
    //   58: iconst_1
    //   59: ireturn
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool1 = false;
    boolean bool2 = false;
    paramGraphics.setColor(4136767);
    paramGraphics.fillRect(0, 0, r.g, r.h);
    bf.c(paramGraphics, paramInt1, paramInt2);
    bh.a(paramGraphics, 9, paramInt1 + 155 >> 1, paramInt2 + 5);
    bf.b(paramGraphics, paramInt1, paramInt2 + 24, 3);
    paramInt1 += 12;
    paramInt2 += 42;
    if (super.a > 1) {
      if (this.b > 0)
        paramGraphics.drawImage(ce.k, paramInt1 + 62, paramInt2 - 6, 20); 
      if (this.b < super.a - 1)
        paramGraphics.drawImage((Image)ce.n, paramInt1 + 62, paramInt2 + 114, 20); 
    } 
    r.d(paramGraphics, paramInt1 + 155 - 25, paramInt2 - 8, this.b + 1, super.a);
    short s1 = this.a[this.b];
    short s2 = (this.b == super.a - 1) ? (short)this.a.length : this.a[this.b + 1];
    if (this.a[0] == 33 && s1 == 0)
      s1 = 1; 
    paramGraphics.setColor(0);
    bh.b(paramGraphics, paramInt1 + 155 >> 1, paramInt2 + 3, 130, 1, (char[])this.a, s1, 0, s2 - s1);
    bh.a(paramGraphics, (char[])null, (char[])bh.e);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */