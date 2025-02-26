import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import rpg.GameMIDlet;

public final class bh {
  public static String a;
  
  public static String b;
  
  public static char[] a;
  
  public static char[] b;
  
  public static char[] c;
  
  public static char[] d;
  
  public static char[] e;
  
  public static char[] f;
  
  public static char[] g;
  
  public static char[] h;
  
  public static char[] i;
  
  public static char[] j;
  
  public static char[] k;
  
  public static char[] l;
  
  public static char[][] a = new char[7][];
  
  public static char[] m = "               ".toCharArray();
  
  public static char[] n = null;
  
  public static char[] o = null;
  
  public static char[] p = null;
  
  public static String c = null;
  
  public static char[] q = null;
  
  public static char[] r = null;
  
  public static char[] s;
  
  public static char[] t = null;
  
  public static String d = null;
  
  public static boolean a = false;
  
  private static b g;
  
  public static b a;
  
  public static b b;
  
  public static b c;
  
  public static b d;
  
  public static b e;
  
  public static b f;
  
  public static Vector a = new Vector();
  
  public static String e = "";
  
  public static final void a(Graphics paramGraphics, char[] paramArrayOfchar1, char[] paramArrayOfchar2) {
    paramGraphics.setClip(0, 0, r.g, r.h);
    int i = a() + 5;
    if (paramArrayOfchar1 != null) {
      char[] arrayOfChar;
      int j = a(arrayOfChar = paramArrayOfchar1) + 2;
      boolean bool = false;
      int k = r.h - i + 3;
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, k, j, i);
      paramGraphics.setColor(16777215);
      a(paramGraphics, 1, k + 1, arrayOfChar, 1);
    } 
    if (paramArrayOfchar2 != null) {
      char[] arrayOfChar;
      int j = a(arrayOfChar = paramArrayOfchar2) + 2;
      int k = r.g - j;
      int m = r.h - i + 3;
      paramGraphics.setColor(0);
      paramGraphics.fillRect(k, m, j, i);
      paramGraphics.setColor(16777215);
      a(paramGraphics, k + 1, m + 1, arrayOfChar, 1);
    } 
  }
  
  public static final void a(Graphics paramGraphics) {
    paramGraphics.setClip(0, 0, r.g, r.h);
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, r.g, r.h);
  }
  
  public static final void a(String paramString) {
    try {
      GameMIDlet.a.platformRequest((String)w.a);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    GameMIDlet.a.a();
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    paramInt2 = r.g >> 1;
    a(true);
    int i = paramInt1 >> 1;
    if (paramInt1 % 2 == 0) {
      paramGraphics.setColor(16777215);
    } else {
      paramGraphics.setColor(0);
    } 
    a(paramGraphics, paramInt2, paramInt3 + 4, (char[])a[i], 1);
    a(false);
  }
  
  public static final void a(boolean paramBoolean) {
    a = paramBoolean;
    if (a != null) {
      g = d;
      return;
    } 
    g = (b)a;
  }
  
  public static final int a(int paramInt1, int paramInt2) {
    return paramInt1 * paramInt2 / 100;
  }
  
  public static final void a(cj paramcj) {
    a = (Vector)(a(3902) + " ");
    b = (b)a(3903);
    a = (Vector)a(3904).toCharArray();
    b = (b)a(3906).toCharArray();
    c = (b)a(3907).toCharArray();
    d = (b)a(3908).toCharArray();
    e = (String)a(3909).toCharArray();
    f = (b)a(3910).toCharArray();
    g = (b)a(3911).toCharArray();
    h = a(3912).toCharArray();
    i = a(3913).toCharArray();
    j = a(3914).toCharArray();
    k = a(3915).toCharArray();
    l = a(3916).toCharArray();
    a[0] = (Vector)a(3920).toCharArray();
    a[1] = (Vector)a(3921).toCharArray();
    a[2] = (Vector)a(3922).toCharArray();
    a[3] = (Vector)a(3923).toCharArray();
    a[4] = (Vector)a(3924).toCharArray();
    a[5] = (Vector)a(3924).toCharArray();
    a[6] = (Vector)a(3926).toCharArray();
    s = a(3932).toCharArray();
    n = a(3946).toCharArray();
    t = a(3947).toCharArray();
    d = (b)a(3948);
    c = (b)a(3949);
    q = a(3950).toCharArray();
  }
  
  public static final String a(int paramInt) {
    return cj.a.a(paramInt).replace(';', '\n');
  }
  
  public static final char[] a(String paramString) {
    try {
      return cj.a.a(Integer.parseInt(paramString.trim())).replace(';', '\n').toCharArray();
    } catch (Exception exception) {
      return ("2." + exception.toString()).toCharArray();
    } 
  }
  
  public static final void a() {
    a = (Vector)b.a("fonts/small", 0, false);
    b = (b)b.a("fonts/small", 16777215, false);
    c = (b)b.a("fonts/small", 16746496, false);
    d = (b)b.a("fonts/big", 0, 16777215, true);
    e = (String)b.a("fonts/big", 16777215, 0, true);
    f = d;
    ((az)a).b = 1;
    b.b = 1;
    c.b = 1;
    d.b = 1;
    ((az)e).b = 1;
    f.b = 1;
    g = (b)a;
  }
  
  public static final int a() {
    return g.a;
  }
  
  public static final int a(char[] paramArrayOfchar) {
    return g.a(a(paramArrayOfchar));
  }
  
  private static final boolean a(char paramChar) {
    return (paramChar == ';');
  }
  
  public static final int a(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = paramInt1 + paramInt2;
    boolean bool = false;
    while (i < paramArrayOfchar.length) {
      if (a(paramArrayOfchar[i])) {
        i++;
        continue;
      } 
      if (bool == true)
        return i + 1 - paramInt1; 
      bool = true;
      i++;
    } 
    return paramArrayOfchar.length - paramInt1;
  }
  
  public static final int a(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    String str = new String(paramArrayOfchar, paramInt1, paramArrayOfchar.length - paramInt1);
    return g.a(str, paramInt2, paramInt3);
  }
  
  public static final int a(char[] paramArrayOfchar, int paramInt) {
    String str;
    Vector vector;
    return (vector = a(str = a(paramArrayOfchar), paramInt)).size();
  }
  
  public static final int a(int paramInt1, int paramInt2, char[] paramArrayOfchar, int paramInt3, int paramInt4, int paramInt5) {
    return a(new String(paramArrayOfchar), 0, 0, paramInt1);
  }
  
  private static int b() {
    return g.b;
  }
  
  private static int a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    int i;
    return (i = g.a(a(paramString, paramInt3))) - b();
  }
  
  private static Vector a(String paramString, int paramInt) {
    if (!paramString.equals(e)) {
      a.setSize(0);
      g.a(a, paramString, paramInt);
    } 
    return a;
  }
  
  public static final int a(Graphics paramGraphics, int paramInt1, int paramInt2, char[] paramArrayOfchar, int paramInt3) {
    az az;
    return (az = a(paramGraphics.getColor())).a(paramGraphics, paramArrayOfchar, paramInt1, paramInt2, 20);
  }
  
  private static az a(int paramInt) {
    return (az)((a != null) ? ((paramInt == 0) ? d : ((paramInt == 16777215) ? e : f)) : ((paramInt == 0) ? a : ((paramInt == 16777215) ? b : c)));
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, char[] paramArrayOfchar, int paramInt3) {
    az az;
    (az = a(paramGraphics.getColor())).a(paramGraphics, paramArrayOfchar, paramInt1, paramInt2, 17);
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, char[] paramArrayOfchar, int paramInt5, int paramInt6, int paramInt7) {
    paramGraphics.setClip(0, 0, r.g, r.h);
    az az = a(paramGraphics.getColor());
    if (paramInt5 + paramInt7 > paramArrayOfchar.length)
      paramInt7 = paramArrayOfchar.length - paramInt5; 
    String str = new String(paramArrayOfchar, paramInt5, paramInt7);
    az.a(paramGraphics, a(str, paramInt3), paramInt1, paramInt2, r.h, 20);
  }
  
  public static final void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, char[] paramArrayOfchar, int paramInt5, int paramInt6, int paramInt7) {
    paramGraphics.setClip(0, 0, r.g, r.h);
    az az = a(paramGraphics.getColor());
    if (paramInt5 + paramInt7 > paramArrayOfchar.length)
      paramInt7 = paramArrayOfchar.length - paramInt5; 
    String str = new String(paramArrayOfchar, paramInt5, paramInt7);
    az.a(paramGraphics, a(str, paramInt3), paramInt1, paramInt2, r.h, 17);
  }
  
  public static final void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, char[] paramArrayOfchar, int paramInt5, int paramInt6, int paramInt7) {
    paramGraphics.setClip(0, 0, r.g, r.h);
    az az = a(paramGraphics.getColor());
    Vector vector;
    int i = Math.min((vector = a(new String(paramArrayOfchar, paramInt5, paramArrayOfchar.length - paramInt5), paramInt3)).size(), 3);
    for (byte b1 = 0; b1 < i; b1++) {
      String str = (String)vector.elementAt(b1);
      if (paramInt7 <= str.length()) {
        az.a(paramGraphics, str, 0, paramInt7, paramInt1, paramInt2, 20);
        return;
      } 
      az.a(paramGraphics, str, paramInt1, paramInt2, 20);
      paramInt7 -= str.length() + 1;
      paramInt2 += g.a + 2;
    } 
    paramGraphics.setColor(16777215);
  }
  
  public static final int a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, char[] paramArrayOfchar, int paramInt5) {
    paramGraphics.setClip(0, 0, r.g, r.h);
    az az = a(paramGraphics.getColor());
    String str = a(paramArrayOfchar);
    return az.a(paramGraphics, a(str, paramInt3), paramInt1, paramInt2, r.h, paramInt5);
  }
  
  public static final int a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, char[] paramArrayOfchar) {
    return a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfchar, 20);
  }
  
  public static final String a(char[] paramArrayOfchar) {
    return new String(paramArrayOfchar);
  }
  
  public static final String a(String paramString1, String paramString2, String paramString3) {
    int i;
    while ((i = paramString1.indexOf(paramString2)) >= 0) {
      String str1 = paramString1.substring(0, i);
      String str2 = paramString1.substring(i + paramString2.length());
      paramString1 = str1 + paramString3 + str2;
    } 
    return paramString1;
  }
  
  public static final Image a(String paramString) throws IOException {
    return Image.createImage(paramString = "/" + ((cj)cj.a).a[((cj)cj.a).a] + "/" + paramString);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/bh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */