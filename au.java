import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.rms.RecordStore;

public final class au {
  public RecordStore a;
  
  public boolean a;
  
  public String a;
  
  public ByteArrayInputStream a;
  
  public ByteArrayOutputStream a = null;
  
  public au(String paramString, int paramInt) throws Exception {
    this.a = true;
    this.a = null;
    this.a = null;
    paramString = paramString.replace('/', '_');
    this.a = (ByteArrayOutputStream)paramString;
    try {
      System.out.println("XFile " + paramString);
      this.a = (ByteArrayOutputStream)RecordStore.openRecordStore(paramString, (paramInt != 1));
      if (this.a == null)
        throw new Exception(""); 
      return;
    } catch (Exception exception) {
      this.a = false;
      if (paramInt == 1)
        throw exception; 
      return;
    } 
  }
  
  public final void a() {
    if (this.a != null)
      try {
        if (this.a.getNumRecords() > 0) {
          this.a.closeRecordStore();
          RecordStore.deleteRecordStore((String)this.a);
          this.a = (ByteArrayOutputStream)RecordStore.openRecordStore((String)this.a, true);
        } 
        byte[] arrayOfByte = this.a.toByteArray();
        System.out.println("close : " + arrayOfByte.length);
        this.a.addRecord(arrayOfByte, 0, arrayOfByte.length);
      } catch (Exception exception) {} 
    try {
      this.a.closeRecordStore();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws Exception {
    System.out.println("write " + this.a);
    if (this.a == null)
      this.a = new ByteArrayOutputStream(); 
    this.a.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public final void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws Exception {
    System.out.println("read " + this.a);
    if (this.a == null)
      this.a = (ByteArrayOutputStream)new ByteArrayInputStream(this.a.getRecord(this.a.getNextRecordID() - 1)); 
    this.a.read(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public final int a() throws Exception {
    System.out.println("available " + this.a);
    if (this.a != null) {
      int j = this.a.getNextRecordID() - 1;
      int i;
      return i = this.a.getRecordSize(j);
    } 
    System.out.println("available false");
    throw new Exception("");
  }
  
  public static final boolean a(String paramString) {
    paramString = paramString.replace('/', '_');
    System.out.println("exists " + paramString);
    try {
      RecordStore recordStore;
      (recordStore = RecordStore.openRecordStore(paramString, false)).closeRecordStore();
    } catch (Exception exception) {
      System.out.println("exists false");
      return false;
    } 
    return true;
  }
  
  public static final void a(String paramString) {
    paramString = paramString.replace('/', '_');
    System.out.println("unlink " + paramString);
    try {
      RecordStore.deleteRecordStore(paramString);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/au.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */