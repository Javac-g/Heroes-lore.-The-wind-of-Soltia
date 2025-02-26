import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class az {
  public boolean a;
  
  public boolean b;
  
  private int c;
  
  private Image a;
  
  public int a;
  
  private int d;
  
  public int b = 2;
  
  private int e;
  
  private int f;
  
  private short[] a;
  
  private boolean c = true;
  
  private static final int[] a = new int[256];
  
  public az(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.a = paramBoolean;
    InputStream inputStream = getClass().getResourceAsStream("/" + paramString + ".mf");
    a(inputStream, paramInt1, paramInt2);
  }
  
  public final void a(InputStream paramInputStream, int paramInt1, int paramInt2) {
    this.c = paramInt1;
    try {
      paramInputStream.read();
      paramInputStream.read();
      paramInputStream.read();
      paramInputStream.read();
      this.a = paramInputStream.read();
      this.c = false;
      if (this.a - 100 > 0) {
        this.a -= 100;
        this.c = true;
      } 
      this.d = paramInputStream.read();
      this.e = paramInputStream.read();
      this.f = paramInputStream.read();
      this.a = (int[])new short[95 + (this.c ? 9 : 0)];
      int i = 0;
      while (true) {
        if (i < 95 + (this.c ? 9 : 0)) {
          int i7 = paramInputStream.read();
          int i8 = paramInputStream.read();
          this.a[i] = (short)((i7 & 0xFF) << 8 | i8 & 0xFF);
          i++;
          continue;
        } 
        i = paramInputStream.read();
        int j = paramInputStream.read();
        int k = (i & 0xFF) << 8 | j & 0xFF;
        int m = paramInputStream.read();
        int n = paramInputStream.read();
        int i1 = (m & 0xFF) << 8 | n & 0xFF;
        int i2 = paramInputStream.read();
        int i3 = paramInputStream.read();
        boolean bool = (i2 == 255 && i3 == 255) ? true : ((i2 & 0xFF) << 8 | i3 & 0xFF);
        int i4 = paramInputStream.read();
        int i5 = paramInputStream.read();
        int i6 = (i4 & 0xFF) << 8 | i5 & 0xFF;
        DataInputStream dataInputStream = new DataInputStream(paramInputStream);
        byte[] arrayOfByte = new byte[k];
        dataInputStream.readFully(arrayOfByte);
        dataInputStream.close();
        if (bool)
          a(arrayOfByte, i1, bool, paramInt1, i6, paramInt2); 
        this.a = (int[])Image.createImage(arrayOfByte, 0, k);
        return;
      } 
    } catch (Exception exception) {
      throw new RuntimeException("MFont: " + exception);
    } 
  }
  
  public final int a(String paramString) {
    if (paramString == null)
      return 0; 
    char[] arrayOfChar = paramString.toCharArray();
    return a(arrayOfChar, 0, arrayOfChar.length);
  }
  
  public final int a(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = 0;
    int j = paramInt1 + paramInt2;
    for (int k = paramInt1; k < j; k++) {
      if (!a(paramArrayOfchar[k]))
        i += a(paramArrayOfchar[k]) - this.f; 
    } 
    return i;
  }
  
  public final int a(char paramChar) {
    if (paramChar == 'œ')
      return 7; 
    if (paramChar > ' ' && paramChar < 'Ā') {
      boolean bool;
      if (bool = ('À' <= paramChar && 'ß' > paramChar) ? true : false)
        paramChar = (char)(paramChar + 32); 
      if (paramChar > '')
        switch (paramChar) {
          case 'è':
          case 'é':
          case 'ê':
          case 'ë':
            paramChar = 'e';
            break;
          case 'à':
          case 'á':
          case 'â':
          case 'ã':
          case 'ä':
          case 'å':
            paramChar = 'a';
            break;
          case 'ù':
          case 'ú':
          case 'û':
          case 'ü':
            paramChar = 'u';
            break;
          case 'ò':
          case 'ó':
          case 'ô':
          case 'õ':
          case 'ö':
            paramChar = 'o';
            break;
          case 'ì':
          case 'í':
          case 'î':
          case 'ï':
            paramChar = 'i';
            break;
          case 'ñ':
            paramChar = 'n';
            break;
          case 'ß':
            paramChar = '';
            break;
          case '¡':
            paramChar = '';
            break;
          case '¿':
            paramChar = '';
            break;
          case 'ç':
            paramChar = bool ? '' : '';
            break;
          case 'æ':
            paramChar = bool ? '' : '';
            break;
          case '°':
            break;
          default:
            paramChar = '.';
            break;
        }  
      if (paramChar >= '')
        switch (paramChar) {
          case '':
            return 8;
          case '':
            return 5;
          case '':
            return 7;
          case '°':
            return 4;
        }  
      int i = this.a[paramChar - 33 + 1] - this.a[paramChar - 33];
      if ((this.a != null || bool) && paramChar >= 'a' && paramChar <= 'z') {
        paramChar = (char)(paramChar - 32);
        i = this.a[paramChar - 33 + 1] - this.a[paramChar - 33];
      } 
      return i;
    } 
    return (paramChar == ' ') ? this.e : 0;
  }
  
  public final int b(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = paramInt1 + paramInt2;
    for (int j = paramInt1; j < i; j++) {
      char c = paramArrayOfchar[j];
      if ("gjpqy,;_|ç¡¿".indexOf(c) != -1)
        return this.a; 
    } 
    return this.d + 1;
  }
  
  public final int a(Vector paramVector) {
    return (this.a + this.b) * paramVector.size();
  }
  
  public final int a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return a(paramGraphics, paramString, 0, paramString.length(), paramInt1, paramInt2, paramInt3);
  }
  
  public final int a(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    return a(paramGraphics, paramArrayOfchar, 0, paramArrayOfchar.length, paramInt1, paramInt2, paramInt3);
  }
  
  public final int a(Graphics paramGraphics, Vector paramVector, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt2;
    int j = this.a + this.b;
    Enumeration enumeration = paramVector.elements();
    while (enumeration.hasMoreElements()) {
      String str = enumeration.nextElement();
      if (i + j >= paramGraphics.getClipY() && i < paramInt3)
        a(paramGraphics, str.toCharArray(), 0, str.length(), paramInt1, i, paramInt4); 
      i += j;
    } 
    return i - paramInt2;
  }
  
  public final int a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return a(paramGraphics, paramString.substring(paramInt1, paramInt2).toCharArray(), 0, paramInt2 - paramInt1, paramInt3, paramInt4, paramInt5);
  }
  
  public final int a(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getClipX : ()I
    //   4: istore #8
    //   6: aload_1
    //   7: invokevirtual getClipY : ()I
    //   10: istore #9
    //   12: aload_1
    //   13: invokevirtual getClipWidth : ()I
    //   16: istore #10
    //   18: aload_1
    //   19: invokevirtual getClipHeight : ()I
    //   22: istore #11
    //   24: iload #7
    //   26: iconst_1
    //   27: iand
    //   28: ifeq -> 49
    //   31: iload #5
    //   33: aload_0
    //   34: aload_2
    //   35: iload_3
    //   36: iload #4
    //   38: invokevirtual a : ([CII)I
    //   41: iconst_2
    //   42: idiv
    //   43: isub
    //   44: istore #5
    //   46: goto -> 70
    //   49: iload #7
    //   51: bipush #8
    //   53: iand
    //   54: ifeq -> 70
    //   57: iload #5
    //   59: aload_0
    //   60: aload_2
    //   61: iload_3
    //   62: iload #4
    //   64: invokevirtual a : ([CII)I
    //   67: isub
    //   68: istore #5
    //   70: iload #7
    //   72: bipush #32
    //   74: iand
    //   75: ifeq -> 94
    //   78: iload #6
    //   80: aload_0
    //   81: aload_2
    //   82: iload_3
    //   83: iload #4
    //   85: invokevirtual b : ([CII)I
    //   88: isub
    //   89: istore #6
    //   91: goto -> 111
    //   94: iload #7
    //   96: bipush #64
    //   98: iand
    //   99: ifeq -> 111
    //   102: iload #6
    //   104: aload_0
    //   105: getfield d : I
    //   108: isub
    //   109: istore #6
    //   111: iconst_0
    //   112: istore #12
    //   114: iload_3
    //   115: iload #4
    //   117: iadd
    //   118: istore #13
    //   120: iconst_0
    //   121: istore #14
    //   123: iconst_0
    //   124: istore #15
    //   126: iload_3
    //   127: istore #16
    //   129: iload #16
    //   131: iload #13
    //   133: if_icmpge -> 1739
    //   136: iload #5
    //   138: iload #8
    //   140: iload #10
    //   142: iadd
    //   143: if_icmple -> 161
    //   146: aload_1
    //   147: iload #8
    //   149: iload #9
    //   151: iload #10
    //   153: iload #11
    //   155: invokevirtual setClip : (IIII)V
    //   158: iload #12
    //   160: ireturn
    //   161: aload_2
    //   162: iload #16
    //   164: caload
    //   165: istore #17
    //   167: aload_0
    //   168: iload #17
    //   170: invokespecial a : (C)Z
    //   173: ifeq -> 179
    //   176: goto -> 1733
    //   179: iconst_m1
    //   180: istore #18
    //   182: iconst_0
    //   183: istore #19
    //   185: iload #17
    //   187: bipush #32
    //   189: if_icmpne -> 213
    //   192: iload #5
    //   194: aload_0
    //   195: getfield e : I
    //   198: iadd
    //   199: istore #5
    //   201: iload #12
    //   203: aload_0
    //   204: getfield e : I
    //   207: iadd
    //   208: istore #12
    //   210: goto -> 1733
    //   213: iconst_0
    //   214: istore #20
    //   216: iload #17
    //   218: sipush #339
    //   221: if_icmpne -> 245
    //   224: aload_0
    //   225: getfield a : Z
    //   228: ifeq -> 237
    //   231: sipush #139
    //   234: goto -> 240
    //   237: sipush #140
    //   240: istore #17
    //   242: goto -> 1110
    //   245: iload #17
    //   247: bipush #32
    //   249: if_icmple -> 1733
    //   252: iload #17
    //   254: sipush #256
    //   257: if_icmplt -> 263
    //   260: goto -> 1733
    //   263: sipush #192
    //   266: iload #17
    //   268: if_icmpgt -> 283
    //   271: sipush #223
    //   274: iload #17
    //   276: if_icmple -> 283
    //   279: iconst_1
    //   280: goto -> 284
    //   283: iconst_0
    //   284: dup
    //   285: istore #20
    //   287: ifeq -> 298
    //   290: iload #17
    //   292: bipush #32
    //   294: iadd
    //   295: i2c
    //   296: istore #17
    //   298: iload #17
    //   300: bipush #127
    //   302: if_icmple -> 1076
    //   305: iload #17
    //   307: tableswitch default -> 1072, 161 -> 1001, 162 -> 1072, 163 -> 1072, 164 -> 1072, 165 -> 1072, 166 -> 1072, 167 -> 1072, 168 -> 1072, 169 -> 1072, 170 -> 1072, 171 -> 1072, 172 -> 1072, 173 -> 1072, 174 -> 1072, 175 -> 1072, 176 -> 1069, 177 -> 1072, 178 -> 1072, 179 -> 1072, 180 -> 1072, 181 -> 1072, 182 -> 1072, 183 -> 1072, 184 -> 1072, 185 -> 1072, 186 -> 1072, 187 -> 1072, 188 -> 1072, 189 -> 1072, 190 -> 1072, 191 -> 1009, 192 -> 1072, 193 -> 1072, 194 -> 1072, 195 -> 1072, 196 -> 1072, 197 -> 1072, 198 -> 1072, 199 -> 1072, 200 -> 1072, 201 -> 1072, 202 -> 1072, 203 -> 1072, 204 -> 1072, 205 -> 1072, 206 -> 1072, 207 -> 1072, 208 -> 1072, 209 -> 1072, 210 -> 1072, 211 -> 1072, 212 -> 1072, 213 -> 1072, 214 -> 1072, 215 -> 1072, 216 -> 1072, 217 -> 1072, 218 -> 1072, 219 -> 1072, 220 -> 1072, 221 -> 1072, 222 -> 1072, 223 -> 994, 224 -> 740, 225 -> 753, 226 -> 766, 227 -> 779, 228 -> 792, 229 -> 805, 230 -> 1043, 231 -> 1017, 232 -> 688, 233 -> 701, 234 -> 714, 235 -> 727, 236 -> 929, 237 -> 942, 238 -> 955, 239 -> 968, 240 -> 1072, 241 -> 981, 242 -> 864, 243 -> 877, 244 -> 890, 245 -> 903, 246 -> 916, 247 -> 1072, 248 -> 1072, 249 -> 812, 250 -> 825, 251 -> 838, 252 -> 851
    //   688: bipush #101
    //   690: istore #17
    //   692: iconst_0
    //   693: istore #18
    //   695: iconst_1
    //   696: istore #19
    //   698: goto -> 1076
    //   701: bipush #101
    //   703: istore #17
    //   705: iconst_1
    //   706: istore #18
    //   708: iconst_1
    //   709: istore #19
    //   711: goto -> 1076
    //   714: bipush #101
    //   716: istore #17
    //   718: iconst_2
    //   719: istore #18
    //   721: iconst_1
    //   722: istore #19
    //   724: goto -> 1076
    //   727: bipush #101
    //   729: istore #17
    //   731: iconst_3
    //   732: istore #18
    //   734: iconst_1
    //   735: istore #19
    //   737: goto -> 1076
    //   740: bipush #97
    //   742: istore #17
    //   744: iconst_0
    //   745: istore #18
    //   747: iconst_1
    //   748: istore #19
    //   750: goto -> 1076
    //   753: bipush #97
    //   755: istore #17
    //   757: iconst_1
    //   758: istore #18
    //   760: iconst_1
    //   761: istore #19
    //   763: goto -> 1076
    //   766: bipush #97
    //   768: istore #17
    //   770: iconst_2
    //   771: istore #18
    //   773: iconst_1
    //   774: istore #19
    //   776: goto -> 1076
    //   779: bipush #97
    //   781: istore #17
    //   783: iconst_3
    //   784: istore #18
    //   786: iconst_1
    //   787: istore #19
    //   789: goto -> 1076
    //   792: bipush #97
    //   794: istore #17
    //   796: iconst_4
    //   797: istore #18
    //   799: iconst_1
    //   800: istore #19
    //   802: goto -> 1076
    //   805: bipush #97
    //   807: istore #17
    //   809: goto -> 1076
    //   812: bipush #117
    //   814: istore #17
    //   816: iconst_0
    //   817: istore #18
    //   819: iconst_1
    //   820: istore #19
    //   822: goto -> 1076
    //   825: bipush #117
    //   827: istore #17
    //   829: iconst_1
    //   830: istore #18
    //   832: iconst_1
    //   833: istore #19
    //   835: goto -> 1076
    //   838: bipush #117
    //   840: istore #17
    //   842: iconst_2
    //   843: istore #18
    //   845: iconst_1
    //   846: istore #19
    //   848: goto -> 1076
    //   851: bipush #117
    //   853: istore #17
    //   855: iconst_4
    //   856: istore #18
    //   858: iconst_1
    //   859: istore #19
    //   861: goto -> 1076
    //   864: bipush #111
    //   866: istore #17
    //   868: iconst_0
    //   869: istore #18
    //   871: iconst_1
    //   872: istore #19
    //   874: goto -> 1076
    //   877: bipush #111
    //   879: istore #17
    //   881: iconst_1
    //   882: istore #18
    //   884: iconst_1
    //   885: istore #19
    //   887: goto -> 1076
    //   890: bipush #111
    //   892: istore #17
    //   894: iconst_2
    //   895: istore #18
    //   897: iconst_1
    //   898: istore #19
    //   900: goto -> 1076
    //   903: bipush #111
    //   905: istore #17
    //   907: iconst_3
    //   908: istore #18
    //   910: iconst_1
    //   911: istore #19
    //   913: goto -> 1076
    //   916: bipush #111
    //   918: istore #17
    //   920: iconst_4
    //   921: istore #18
    //   923: iconst_1
    //   924: istore #19
    //   926: goto -> 1076
    //   929: bipush #105
    //   931: istore #17
    //   933: iconst_0
    //   934: istore #18
    //   936: iconst_m1
    //   937: istore #19
    //   939: goto -> 1076
    //   942: bipush #105
    //   944: istore #17
    //   946: iconst_1
    //   947: istore #18
    //   949: iconst_0
    //   950: istore #19
    //   952: goto -> 1076
    //   955: bipush #105
    //   957: istore #17
    //   959: iconst_2
    //   960: istore #18
    //   962: iconst_m1
    //   963: istore #19
    //   965: goto -> 1076
    //   968: bipush #105
    //   970: istore #17
    //   972: iconst_4
    //   973: istore #18
    //   975: iconst_m1
    //   976: istore #19
    //   978: goto -> 1076
    //   981: bipush #110
    //   983: istore #17
    //   985: iconst_3
    //   986: istore #18
    //   988: iconst_1
    //   989: istore #19
    //   991: goto -> 1076
    //   994: bipush #127
    //   996: istore #17
    //   998: goto -> 1076
    //   1001: sipush #129
    //   1004: istore #17
    //   1006: goto -> 1076
    //   1009: sipush #130
    //   1012: istore #17
    //   1014: goto -> 1076
    //   1017: aload_0
    //   1018: getfield a : Z
    //   1021: ifne -> 1029
    //   1024: iload #20
    //   1026: ifeq -> 1035
    //   1029: sipush #128
    //   1032: goto -> 1038
    //   1035: sipush #137
    //   1038: istore #17
    //   1040: goto -> 1076
    //   1043: aload_0
    //   1044: getfield a : Z
    //   1047: ifne -> 1055
    //   1050: iload #20
    //   1052: ifeq -> 1061
    //   1055: sipush #136
    //   1058: goto -> 1064
    //   1061: sipush #138
    //   1064: istore #17
    //   1066: goto -> 1076
    //   1069: goto -> 1076
    //   1072: bipush #46
    //   1074: istore #17
    //   1076: aload_0
    //   1077: getfield a : Z
    //   1080: ifne -> 1088
    //   1083: iload #20
    //   1085: ifeq -> 1110
    //   1088: iload #17
    //   1090: bipush #97
    //   1092: if_icmplt -> 1110
    //   1095: iload #17
    //   1097: bipush #122
    //   1099: if_icmpgt -> 1110
    //   1102: iload #17
    //   1104: bipush #32
    //   1106: isub
    //   1107: i2c
    //   1108: istore #17
    //   1110: iconst_0
    //   1111: istore #21
    //   1113: iconst_0
    //   1114: istore #22
    //   1116: iload #17
    //   1118: lookupswitch default -> 1352, 136 -> 1176, 137 -> 1197, 138 -> 1221, 139 -> 1248, 140 -> 1278, 176 -> 1311
    //   1176: aload_0
    //   1177: getfield a : [S
    //   1180: aload_0
    //   1181: getfield a : [S
    //   1184: arraylength
    //   1185: iconst_1
    //   1186: isub
    //   1187: saload
    //   1188: istore #21
    //   1190: bipush #8
    //   1192: istore #22
    //   1194: goto -> 1398
    //   1197: aload_0
    //   1198: getfield a : [S
    //   1201: aload_0
    //   1202: getfield a : [S
    //   1205: arraylength
    //   1206: iconst_1
    //   1207: isub
    //   1208: saload
    //   1209: bipush #8
    //   1211: iadd
    //   1212: i2s
    //   1213: istore #21
    //   1215: iconst_5
    //   1216: istore #22
    //   1218: goto -> 1398
    //   1221: aload_0
    //   1222: getfield a : [S
    //   1225: aload_0
    //   1226: getfield a : [S
    //   1229: arraylength
    //   1230: iconst_1
    //   1231: isub
    //   1232: saload
    //   1233: bipush #8
    //   1235: iadd
    //   1236: iconst_5
    //   1237: iadd
    //   1238: i2s
    //   1239: istore #21
    //   1241: bipush #7
    //   1243: istore #22
    //   1245: goto -> 1398
    //   1248: aload_0
    //   1249: getfield a : [S
    //   1252: aload_0
    //   1253: getfield a : [S
    //   1256: arraylength
    //   1257: iconst_1
    //   1258: isub
    //   1259: saload
    //   1260: bipush #8
    //   1262: iadd
    //   1263: iconst_5
    //   1264: iadd
    //   1265: bipush #7
    //   1267: iadd
    //   1268: i2s
    //   1269: istore #21
    //   1271: bipush #7
    //   1273: istore #22
    //   1275: goto -> 1398
    //   1278: aload_0
    //   1279: getfield a : [S
    //   1282: aload_0
    //   1283: getfield a : [S
    //   1286: arraylength
    //   1287: iconst_1
    //   1288: isub
    //   1289: saload
    //   1290: bipush #8
    //   1292: iadd
    //   1293: iconst_5
    //   1294: iadd
    //   1295: bipush #7
    //   1297: iadd
    //   1298: bipush #7
    //   1300: iadd
    //   1301: i2s
    //   1302: istore #21
    //   1304: bipush #7
    //   1306: istore #22
    //   1308: goto -> 1398
    //   1311: aload_1
    //   1312: aload_0
    //   1313: getfield c : I
    //   1316: invokevirtual setColor : (I)V
    //   1319: aload_1
    //   1320: iload #5
    //   1322: iload #6
    //   1324: iconst_4
    //   1325: iconst_4
    //   1326: invokevirtual setClip : (IIII)V
    //   1329: aload_1
    //   1330: iload #5
    //   1332: iload #6
    //   1334: iconst_2
    //   1335: iconst_2
    //   1336: iconst_0
    //   1337: sipush #360
    //   1340: invokevirtual drawArc : (IIIIII)V
    //   1343: iinc #5, 4
    //   1346: iinc #12, 4
    //   1349: goto -> 1733
    //   1352: iload #17
    //   1354: bipush #33
    //   1356: isub
    //   1357: dup
    //   1358: istore #23
    //   1360: iflt -> 1398
    //   1363: iload #23
    //   1365: aload_0
    //   1366: getfield a : [S
    //   1369: arraylength
    //   1370: iconst_1
    //   1371: isub
    //   1372: if_icmpge -> 1398
    //   1375: aload_0
    //   1376: getfield a : [S
    //   1379: iload #23
    //   1381: saload
    //   1382: istore #21
    //   1384: aload_0
    //   1385: getfield a : [S
    //   1388: iload #23
    //   1390: iconst_1
    //   1391: iadd
    //   1392: saload
    //   1393: iload #21
    //   1395: isub
    //   1396: istore #22
    //   1398: aload_0
    //   1399: getfield c : Z
    //   1402: ifeq -> 1418
    //   1405: aload_0
    //   1406: getfield a : [S
    //   1409: bipush #98
    //   1411: iload #18
    //   1413: iadd
    //   1414: saload
    //   1415: goto -> 1419
    //   1418: iconst_0
    //   1419: istore #23
    //   1421: aload_0
    //   1422: getfield c : Z
    //   1425: ifeq -> 1446
    //   1428: aload_0
    //   1429: getfield a : [S
    //   1432: bipush #98
    //   1434: iload #18
    //   1436: iadd
    //   1437: iconst_1
    //   1438: iadd
    //   1439: saload
    //   1440: iload #23
    //   1442: isub
    //   1443: goto -> 1447
    //   1446: iconst_0
    //   1447: istore #24
    //   1449: iload #5
    //   1451: iload #22
    //   1453: iadd
    //   1454: aload_0
    //   1455: getfield f : I
    //   1458: isub
    //   1459: iload #8
    //   1461: if_icmpge -> 1491
    //   1464: iload #5
    //   1466: iload #22
    //   1468: aload_0
    //   1469: getfield f : I
    //   1472: isub
    //   1473: iadd
    //   1474: istore #5
    //   1476: iload #12
    //   1478: iload #22
    //   1480: aload_0
    //   1481: getfield f : I
    //   1484: isub
    //   1485: iadd
    //   1486: istore #12
    //   1488: goto -> 1733
    //   1491: aload_1
    //   1492: iload #8
    //   1494: iload #9
    //   1496: iload #10
    //   1498: iload #11
    //   1500: invokevirtual setClip : (IIII)V
    //   1503: iload #17
    //   1505: bipush #105
    //   1507: if_icmpne -> 1534
    //   1510: iload #18
    //   1512: iflt -> 1534
    //   1515: aload_1
    //   1516: iload #5
    //   1518: iload #6
    //   1520: iconst_1
    //   1521: iadd
    //   1522: iload #22
    //   1524: aload_0
    //   1525: getfield a : I
    //   1528: invokevirtual clipRect : (IIII)V
    //   1531: goto -> 1548
    //   1534: aload_1
    //   1535: iload #5
    //   1537: iload #6
    //   1539: iload #22
    //   1541: aload_0
    //   1542: getfield a : I
    //   1545: invokevirtual clipRect : (IIII)V
    //   1548: aload_1
    //   1549: aload_0
    //   1550: getfield a : Ljavax/microedition/lcdui/Image;
    //   1553: iload #5
    //   1555: iload #21
    //   1557: isub
    //   1558: iload #6
    //   1560: bipush #20
    //   1562: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1565: iload #18
    //   1567: iflt -> 1709
    //   1570: aload_1
    //   1571: iload #8
    //   1573: iload #9
    //   1575: iload #10
    //   1577: iload #11
    //   1579: invokevirtual setClip : (IIII)V
    //   1582: iload #18
    //   1584: iconst_4
    //   1585: if_icmpeq -> 1593
    //   1588: iload #24
    //   1590: goto -> 1597
    //   1593: iload #24
    //   1595: iconst_1
    //   1596: iadd
    //   1597: istore #24
    //   1599: iconst_0
    //   1600: istore #25
    //   1602: aload_0
    //   1603: getfield a : Z
    //   1606: ifne -> 1614
    //   1609: iload #20
    //   1611: ifeq -> 1617
    //   1614: iconst_2
    //   1615: istore #25
    //   1617: iload #17
    //   1619: bipush #105
    //   1621: if_icmpne -> 1659
    //   1624: iload #18
    //   1626: iflt -> 1659
    //   1629: aload_1
    //   1630: iload #5
    //   1632: iconst_1
    //   1633: isub
    //   1634: iload #6
    //   1636: iconst_1
    //   1637: isub
    //   1638: iload #25
    //   1640: isub
    //   1641: iload #24
    //   1643: iload #19
    //   1645: iadd
    //   1646: aload_0
    //   1647: getfield a : I
    //   1650: iload #25
    //   1652: iadd
    //   1653: invokevirtual clipRect : (IIII)V
    //   1656: goto -> 1684
    //   1659: aload_1
    //   1660: iload #5
    //   1662: iload #6
    //   1664: iconst_1
    //   1665: isub
    //   1666: iload #25
    //   1668: isub
    //   1669: iload #24
    //   1671: iload #19
    //   1673: iadd
    //   1674: aload_0
    //   1675: getfield a : I
    //   1678: iload #25
    //   1680: iadd
    //   1681: invokevirtual clipRect : (IIII)V
    //   1684: aload_1
    //   1685: aload_0
    //   1686: getfield a : Ljavax/microedition/lcdui/Image;
    //   1689: iload #5
    //   1691: iload #23
    //   1693: isub
    //   1694: iload #19
    //   1696: iadd
    //   1697: iload #6
    //   1699: iconst_1
    //   1700: isub
    //   1701: iload #25
    //   1703: isub
    //   1704: bipush #20
    //   1706: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1709: iload #5
    //   1711: iload #22
    //   1713: aload_0
    //   1714: getfield f : I
    //   1717: isub
    //   1718: iadd
    //   1719: istore #5
    //   1721: iload #12
    //   1723: iload #22
    //   1725: aload_0
    //   1726: getfield f : I
    //   1729: isub
    //   1730: iadd
    //   1731: istore #12
    //   1733: iinc #16, 1
    //   1736: goto -> 129
    //   1739: aload_1
    //   1740: iload #8
    //   1742: iload #9
    //   1744: iload #10
    //   1746: iload #11
    //   1748: invokevirtual setClip : (IIII)V
    //   1751: iload #12
    //   1753: ireturn
  }
  
  private boolean a(char paramChar) {
    if (this.b != 0)
      switch (paramChar) {
        case '$':
        case '@':
        case '|':
          return true;
      }  
    return false;
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = (paramArrayOfbyte[paramInt1] & 0xFF) << 24 | (paramArrayOfbyte[paramInt1 + 1] & 0xFF) << 16 | (paramArrayOfbyte[paramInt1 + 2] & 0xFF) << 8 | paramArrayOfbyte[paramInt1 + 3] & 0xFF;
    paramArrayOfbyte[paramInt2] = (byte)(paramInt3 >> 16);
    paramArrayOfbyte[paramInt2 + 1] = (byte)(paramInt3 >> 8);
    paramArrayOfbyte[paramInt2 + 2] = (byte)paramInt3;
    if (paramInt4 > 0 && paramInt5 >= 0) {
      paramArrayOfbyte[paramInt4] = (byte)(paramInt5 >> 16);
      paramArrayOfbyte[paramInt4 + 1] = (byte)(paramInt5 >> 8);
      paramArrayOfbyte[paramInt4 + 2] = (byte)paramInt5;
    } 
    int j = a(paramArrayOfbyte, paramInt1 + 4, i + 4);
    int k = paramInt1 + 8 + i;
    paramArrayOfbyte[k] = (byte)(j >> 24);
    paramArrayOfbyte[k + 1] = (byte)(j >> 16);
    paramArrayOfbyte[k + 2] = (byte)(j >> 8);
    paramArrayOfbyte[k + 3] = (byte)j;
  }
  
  private int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i;
    for (i = -1; --paramInt2 >= 0; i = a[(i ^ paramArrayOfbyte[paramInt1++]) & 0xFF] ^ i >>> 8);
    return i ^ 0xFFFFFFFF;
  }
  
  static {
    for (byte b = 0; b < 'Ā'; b++) {
      int i = b;
      for (byte b1 = 0; b1 < 8; b1++) {
        if ((i & 0x1) != 0) {
          i = 0xEDB88320 ^ i >>> 1;
        } else {
          i >>>= 1;
        } 
        a[b] = i;
      } 
    } 
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/az.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */