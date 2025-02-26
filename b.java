import java.util.Vector;

public final class b extends az {
  private b(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(paramString, paramInt1, paramInt2, paramBoolean);
  }
  
  public final int a(String paramString, int paramInt1, int paramInt2) {
    byte b1;
    if (!(b1 = (paramString == null) ? 0 : paramString.length()))
      return 0; 
    char[] arrayOfChar = paramString.toCharArray();
    if (b1 < 64 && paramString.indexOf('\n') == -1 && a(arrayOfChar, 0, b1) <= paramInt1)
      return paramString.length(); 
    int i = 0;
    int j = 0;
    while (paramInt2 > 0) {
      int k = i;
      int m = 0;
      byte b2 = 1;
      while (paramInt2 > 0) {
        if ((j = k + b2 - 1) >= b1)
          return j + 1; 
        char c = arrayOfChar[j];
        m += a(c);
        if (c == '\n') {
          for (i = j + 1; i < b1 && arrayOfChar[i] == ' '; i++);
          paramInt2--;
          break;
        } 
        if (m < paramInt1) {
          b2++;
          continue;
        } 
        while (j > k && arrayOfChar[j] != ' ')
          j--; 
        if (arrayOfChar[j] == ' ') {
          i = j + 1;
          paramInt2--;
          continue;
        } 
        i = i + b2 - 1;
        paramInt2--;
      } 
    } 
    return j + 1;
  }
  
  public final Vector a(Vector paramVector, String paramString, int paramInt) {
    paramVector.removeAllElements();
    byte b1;
    if (!(b1 = (paramString == null) ? 0 : paramString.length()))
      return paramVector; 
    char[] arrayOfChar = paramString.toCharArray();
    if (b1 < 64 && paramString.indexOf('\n') == -1 && a(arrayOfChar, 0, b1) <= paramInt) {
      paramVector.addElement(paramString);
      return paramVector;
    } 
    int i = 0;
    label47: while (true) {
      int m;
      int j = i;
      int k = 0;
      byte b2 = 1;
      while (true) {
        if ((m = j + b2 - 1) >= b1) {
          if (j < b1)
            paramVector.addElement(new String(arrayOfChar, j, b1 - j)); 
          return paramVector;
        } 
        char c = arrayOfChar[m];
        k += a(c);
        if (c == '\n') {
          for (i = m + 1; i < b1 && arrayOfChar[i] == ' '; i++);
          paramVector.addElement(new String(arrayOfChar, j, m - j));
          continue label47;
        } 
        if (k < paramInt) {
          b2++;
          continue;
        } 
        break;
      } 
      while (m > j && arrayOfChar[m] != ' ')
        m--; 
      if (arrayOfChar[m] == ' ') {
        i = m + 1;
        paramVector.addElement(new String(arrayOfChar, j, m - j));
        continue;
      } 
      i = i + b2 - 1;
      paramVector.addElement(new String(arrayOfChar, j, i - j));
    } 
  }
  
  public static final az a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    return new b(paramString, paramInt1, paramInt2, paramBoolean);
  }
  
  public static final az a(String paramString, int paramInt, boolean paramBoolean) {
    return a(paramString, paramInt, -1, paramBoolean);
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */