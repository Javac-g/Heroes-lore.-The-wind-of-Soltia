import java.util.Vector;
import javax.microedition.midlet.MIDlet;
import rpg.GameMIDlet;

public final class w {
  public static MIDlet a;
  
  public static String[] a = ((cj)cj.a).a;
  
  public static String a;
  
  public static boolean a;
  
  public static boolean b;
  
  public static boolean c;
  
  public static boolean[] a;
  
  public static final void a(MIDlet paramMIDlet) {
    a = (boolean[])paramMIDlet;
    c = c();
    x.a = c;
  }
  
  public static final void a() {
    if (a(true))
      a = true; 
    if (a(false))
      b = true; 
    if (a != null) {
      bh.a[5] = (Vector)a().toCharArray();
    } else {
      bh.a[5] = bh.a[6];
    } 
    a = (boolean[])b();
    try {
      String str;
      if ((str = GameMIDlet.a.getAppProperty("MIDlet-Version")) != null) {
        if (c)
          str = str + " " + bh.a(3917); 
        bh.r = str.toCharArray();
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static boolean c() {
    String str = a.getAppProperty("HO-Demo");
    boolean bool = true;
    if (str != null && str.trim().equals("BEJ8K52N7A"))
      bool = false; 
    return bool;
  }
  
  public static final boolean a() {
    return (c && a != null && a != null);
  }
  
  public static final boolean b() {
    return (!c && a != null && a != null);
  }
  
  public static final int a() {
    int i;
    a = new boolean[i = a.length];
    byte b = 0;
    byte b1 = -1;
    String str;
    if ((str = a.getAppProperty("HO-LangList")) != null)
      for (byte b2 = 0; b2 < i; b2++) {
        if (str.indexOf(a[b2]) >= 0) {
          System.out.println(a[b2]);
          a[b2] = true;
          b1 = b2;
          b++;
        } 
      }  
    if (b == 1)
      return b1; 
    if (b == 0)
      for (byte b2 = 0; b2 < i; b2++)
        a[b2] = true;  
    return -1;
  }
  
  public static final String a() {
    String str1 = "HO-Label-" + a[((cj)cj.a).a];
    String str2;
    if ((str2 = a.getAppProperty(str1)) == null || str2.length() == 0)
      return c ? cj.a.a(3931) : cj.a.a(3925); 
    if (str2.indexOf("\\u") >= 0) {
      StringBuffer stringBuffer = new StringBuffer(str2);
      byte b = 0;
      char[] arrayOfChar = new char[4];
      while (true) {
        if (stringBuffer.charAt(b++) == '\\' && stringBuffer.charAt(b) == 'u') {
          stringBuffer.getChars(b + 1, b + 5, arrayOfChar, 0);
          stringBuffer.setCharAt(b - 1, (char)Integer.parseInt(bh.a(arrayOfChar), 16));
          stringBuffer.delete(b, b + 5);
        } 
        if (b >= stringBuffer.length()) {
          String str;
          int j = (str = stringBuffer.toString()).length();
          return str.substring(0, (j < 16) ? j : 16);
        } 
      } 
    } 
    String str3;
    int i = (str3 = str2).length();
    return str3.substring(0, (i < 16) ? i : 16);
  }
  
  private static String b() {
    String str1 = "HO-URL-" + a[((cj)cj.a).a];
    String str2;
    return ((str2 = a.getAppProperty(str1)) == null || str2.length() == 0) ? null : str2;
  }
  
  private static boolean a(boolean paramBoolean) {
    String str1 = a.getAppProperty("HO-BuySetup");
    String str2 = "HO-URL-" + a[((cj)cj.a).a];
    String str3 = a.getAppProperty(str2);
    return (str1 == null || str1.length() == 0) ? false : ((str3 == null || str3.length() == 0) ? false : (paramBoolean ? ((str1.indexOf("menu") > -1)) : ((str1.indexOf("exit") > -1))));
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/w.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */