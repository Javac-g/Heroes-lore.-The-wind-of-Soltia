package Graphics;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class cj {
  public static cj a = new cj();
  
  public byte[] a;
  
  public byte a;
  
  public DataInputStream a;
  
  public final String[] a = false;
  
  public cj() {
    this.a = new String[] { "en-GB", "fr-FR", "de-DE", "it-IT", "es-ES" };
    (new String[5])[0] = "Select";
    (new String[5])[1] = "Sélection.";
    (new String[5])[2] = "Wählen";
    (new String[5])[3] = "Selez.";
    (new String[5])[4] = "Elegir";
    (new String[5])[0] = "Exit";
    (new String[5])[1] = "Quitter";
    (new String[5])[2] = "Beenden";
    (new String[5])[3] = "Esci";
    (new String[5])[4] = "Salir";
  }
  
  private int a(String paramString) {
    int i = -1;
    try {
      if (paramString == null)
        paramString = System.getProperty("microedition.locale"); 
    } catch (Exception exception) {
      paramString = null;
    } 
    if (paramString != null) {
      byte b;
      for (b = 0; b < this.a.length; b++) {
        if (this.a[b].toLowerCase().compareTo(paramString.toLowerCase()) == 0) {
          i = b;
          break;
        } 
      } 
      if (i == -1)
        for (b = 0; b < this.a.length; b++) {
          if (this.a[b].toLowerCase().substring(0, 2).compareTo(paramString.toLowerCase().substring(0, 2)) == 0) {
            i = b | 0x8000;
            break;
          } 
        }  
    } 
    return i;
  }
  
  public final void a(String paramString1, String paramString2, int paramInt) {
    try {
      int k;
      if (paramInt < 0 && (paramInt = a(paramString2)) == -1)
        paramInt = 0; 
      this.a = (byte)(paramInt & 0x7FFF);
      InputStream inputStream = Runtime.getRuntime().getClass().getResourceAsStream(paramString1 + "." + this.a[this.a]);
      DataInputStream dataInputStream;
      int i = (dataInputStream = new DataInputStream(inputStream)).readInt();
      this.a = (String[])new byte[i];
      int j = 0;
      do {
        k = dataInputStream.read((byte[])this.a, j, i - j);
      } while ((j += k) < i);
    } catch (IOException iOException) {
      System.out.println("ERROR: Couldn't load babble file." + iOException);
    } 
    this.a = (String[])new DataInputStream(new ByteArrayInputStream((byte[])this.a));
  }
  
  public final String a(int paramInt) {
    try {
      boolean bool = false;
      paramInt -= 0;
      this.a.reset();
      this.a.skip((paramInt << 2));
      this.a.skip(this.a.readInt());
      this.a.skip(2L);
      String str;
      return str = this.a.readUTF();
    } catch (Exception exception) {
      return paramInt + "." + exception.toString();
    } 
  }
  
  static {
    (new String[5])[0] = "English";
    (new String[5])[1] = "FranÇais";
    (new String[5])[2] = "Deutsch";
    (new String[5])[3] = "Italiano";
    (new String[5])[4] = "EspaÑol";
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/cj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */