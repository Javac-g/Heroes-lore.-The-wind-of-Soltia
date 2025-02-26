import javax.microedition.lcdui.Graphics;

public final class ah implements u {
  private static byte a = false;
  
  private static int a = false;
  
  private static int b = false;
  
  private static boolean b = false;
  
  private static char[] a = null;
  
  private static int c = false;
  
  private static int d = 0;
  
  private static int e = 0;
  
  private static int f = false;
  
  private static boolean c = true;
  
  private static boolean d = 0;
  
  private static byte[][] b;
  
  private static boolean e = 1;
  
  private static byte b = -1;
  
  private static byte c = false;
  
  private static byte d = 0;
  
  private static byte[] h;
  
  private static byte e;
  
  private static byte f = false;
  
  private static char[] b;
  
  private static char[] c;
  
  private static boolean f;
  
  public static boolean a = false;
  
  private static boolean g;
  
  public static final boolean a(ao paramao) {
    Object object;
    return (paramao.a != null || paramao.b != null) ? false : (((object = ((ae)n.a).c[paramao.b][paramao.a]) == null) ? false : a((byte)0, object));
  }
  
  public static final boolean a() {
    ao ao;
    Object object2;
    byte b1;
    Object object1;
    byte b2;
    return ((ao = n.a()).a != null || ao.b != null) ? false : (((b2 = (byte)Math.abs(object2 = ((ae)n.a).c[ao.b][ao.a])) >= 1 && b2 <= Byte.MAX_VALUE && a((byte)1, b2)) ? true : (((b1 = (byte)Math.abs(object1 = ((ae)n.a).c[ao.b + u.b[ao.i]][ao.a + u.a[ao.i]])) >= 1 && b1 <= Byte.MAX_VALUE && a((byte)2, b1))));
  }
  
  public static final boolean b() {
    ao ao;
    if ((ao = n.a()).a != null || ao.b != null)
      return false; 
    boolean bool = false;
    byte b;
    Object object;
    return ((b = (byte)Math.abs(object = ((ae)n.a).c[ao.b + u.b[ao.i]][ao.a + u.a[ao.i]])) < 1 || b > Byte.MAX_VALUE) ? false : a((byte)3, b);
  }
  
  public static final void a(byte paramByte) {
    a((byte)0, paramByte);
  }
  
  private static final boolean a(byte paramByte1, byte paramByte2) {
    byte[][] arrayOfByte = (byte[][])((ae)n.a).a[paramByte2 - 1];
    byte[] arrayOfByte1 = null;
    for (byte b = 0; b < arrayOfByte.length && (((arrayOfByte1 = arrayOfByte[b])[0] >> 6 & 0x3) != paramByte1 || !a(arrayOfByte1)); b++)
      arrayOfByte1 = null; 
    if (arrayOfByte1 == null)
      return false; 
    if (arrayOfByte1[6] == -1)
      return false; 
    a((byte[][])((ae)n.a).b[arrayOfByte1[6]]);
    return true;
  }
  
  public static final boolean a(byte paramByte) {
    byte[][] arrayOfByte = (byte[][])((ae)n.a).a[paramByte - 1];
    for (byte b = 0; b < arrayOfByte.length; b++) {
      if (a(arrayOfByte[b]))
        return true; 
    } 
    return false;
  }
  
  private static final boolean a(byte[] paramArrayOfbyte) {
    ao ao = n.a();
    int i = (paramArrayOfbyte[0] & 0xC) << 6 | paramArrayOfbyte[1] & 0xFF;
    int j = (paramArrayOfbyte[0] & 0x3) << 8 | paramArrayOfbyte[2] & 0xFF;
    boolean bool1 = (((paramArrayOfbyte[0] & 0xFF) >> 5 & 0x1) == 0) ? true : false;
    boolean bool2 = (((paramArrayOfbyte[0] & 0xFF) >> 4 & 0x1) == 0) ? true : false;
    x.a((i != -1));
    x.a((j != -1));
    boolean bool;
    return (bool1 && !n.a(i)) ? false : ((!bool1 && !n.b(i)) ? false : ((bool2 && !n.a(j)) ? false : ((!bool2 && !n.b(j)) ? false : (!(paramArrayOfbyte[3] != -1 && !(bool = ao.a.a(paramArrayOfbyte[3], paramArrayOfbyte[4], paramArrayOfbyte[5])))))));
  }
  
  private static final void b(byte paramByte) {
    b = false;
    a = paramByte;
  }
  
  private static final void a(byte[][] paramArrayOfbyte) {
    a = false;
    b = (char[])paramArrayOfbyte;
    n.a(4);
    n.k();
    a = false;
    b((byte)0);
    b = -1;
    e = 1;
    f = false;
  }
  
  private static final void c() {
    // Byte code:
    //   0: iconst_0
    //   1: putstatic ah.a : B
    //   4: aconst_null
    //   5: checkcast [[B
    //   8: putstatic ah.b : [[B
    //   11: iconst_0
    //   12: putstatic ah.a : Z
    //   15: iconst_m1
    //   16: putstatic ah.b : B
    //   19: iconst_1
    //   20: putstatic ah.e : Z
    //   23: getstatic bs.a : Las;
    //   26: invokevirtual b : ()V
    //   29: getstatic n.a : Lae;
    //   32: getfield a : [Lac;
    //   35: astore_0
    //   36: iconst_0
    //   37: istore_1
    //   38: iload_1
    //   39: aload_0
    //   40: arraylength
    //   41: if_icmpge -> 71
    //   44: aload_0
    //   45: iload_1
    //   46: aaload
    //   47: ifnull -> 65
    //   50: aload_0
    //   51: iload_1
    //   52: aaload
    //   53: getfield d : Z
    //   56: ifeq -> 65
    //   59: aload_0
    //   60: iload_1
    //   61: aaload
    //   62: invokevirtual g : ()V
    //   65: iinc #1, 1
    //   68: goto -> 38
    //   71: invokestatic c : ()V
    //   74: return
  }
  
  public static final void a(int paramInt1, int paramInt2) {
    if (paramInt2 == -8)
      a = true; 
    switch (a) {
      case true:
        if (paramInt1 == 8 || paramInt2 == 53) {
          b = true;
          return;
        } 
        break;
      case true:
        if (paramInt1 == 6 || paramInt1 == 1 || paramInt2 == 50 || paramInt2 == 56) {
          c = (c == null) ? 1 : 0;
          return;
        } 
        if (paramInt1 == 8 || paramInt2 == 53) {
          d = 1;
          return;
        } 
        break;
      case true:
        if (paramInt1 == 8 || paramInt2 == 53)
          f = true; 
        break;
    } 
  }
  
  public static final void a() {
    // Byte code:
    //   0: getstatic ah.a : B
    //   3: iconst_3
    //   4: if_icmpeq -> 21
    //   7: getstatic ah.a : Z
    //   10: ifeq -> 21
    //   13: iconst_1
    //   14: putstatic ah.b : Z
    //   17: iconst_1
    //   18: putstatic ah.f : Z
    //   21: invokestatic a : ()Lao;
    //   24: astore_0
    //   25: getstatic ah.a : B
    //   28: ifne -> 1115
    //   31: getstatic ah.b : [[B
    //   34: getstatic ah.a : I
    //   37: aaload
    //   38: iconst_0
    //   39: baload
    //   40: tableswitch default -> 1115, 1 -> 459, 2 -> 539, 3 -> 452, 4 -> 452, 5 -> 452, 6 -> 452, 7 -> 634, 8 -> 643, 9 -> 649, 10 -> 685, 11 -> 691, 12 -> 679, 13 -> 667, 14 -> 673, 15 -> 452, 16 -> 452, 17 -> 452, 18 -> 697, 19 -> 661, 20 -> 1101, 21 -> 1115, 22 -> 910, 23 -> 925, 24 -> 987, 25 -> 940, 26 -> 998, 27 -> 1087, 28 -> 1115, 29 -> 998, 30 -> 655, 31 -> 596, 32 -> 615, 33 -> 1115, 34 -> 452, 35 -> 452, 36 -> 452, 37 -> 452, 38 -> 452, 39 -> 452, 40 -> 709, 41 -> 715, 42 -> 703, 43 -> 1115, 44 -> 586, 45 -> 566, 46 -> 721, 47 -> 756, 48 -> 576, 49 -> 799, 50 -> 846, 51 -> 1115, 52 -> 1115, 53 -> 1115, 54 -> 1115, 55 -> 1115, 56 -> 1115, 57 -> 1115, 58 -> 1115, 59 -> 1115, 60 -> 1115, 61 -> 1115, 62 -> 1115, 63 -> 1115, 64 -> 1115, 65 -> 1115, 66 -> 1115, 67 -> 1115, 68 -> 1115, 69 -> 1115, 70 -> 1115, 71 -> 1115, 72 -> 1115, 73 -> 1115, 74 -> 1115, 75 -> 1115, 76 -> 1115, 77 -> 1115, 78 -> 1115, 79 -> 1115, 80 -> 1115, 81 -> 1115, 82 -> 1115, 83 -> 1115, 84 -> 1115, 85 -> 1115, 86 -> 1115, 87 -> 1115, 88 -> 1115, 89 -> 1115, 90 -> 1115, 91 -> 1115, 92 -> 1115, 93 -> 1115, 94 -> 1115, 95 -> 1115, 96 -> 1115, 97 -> 1115, 98 -> 1115, 99 -> 558
    //   452: iconst_1
    //   453: invokestatic b : (B)V
    //   456: goto -> 1115
    //   459: getstatic ah.a : Z
    //   462: ifeq -> 476
    //   465: getstatic ah.a : I
    //   468: iconst_1
    //   469: iadd
    //   470: putstatic ah.a : I
    //   473: goto -> 1115
    //   476: getstatic n.a : Lae;
    //   479: getfield c : [Ljava/lang/Object;
    //   482: getstatic ah.b : [[B
    //   485: getstatic ah.a : I
    //   488: aaload
    //   489: iconst_1
    //   490: baload
    //   491: aaload
    //   492: checkcast [C
    //   495: checkcast [C
    //   498: putstatic ah.a : [C
    //   501: iconst_0
    //   502: putstatic ah.c : I
    //   505: getstatic ah.a : [C
    //   508: getstatic ah.c : I
    //   511: getstatic r.g : I
    //   514: bipush #28
    //   516: isub
    //   517: iconst_3
    //   518: invokestatic a : ([CIII)I
    //   521: putstatic ah.d : I
    //   524: iconst_0
    //   525: putstatic ah.e : I
    //   528: iconst_0
    //   529: putstatic ah.f : I
    //   532: iconst_2
    //   533: invokestatic b : (B)V
    //   536: goto -> 1115
    //   539: iconst_0
    //   540: putstatic ah.d : Z
    //   543: iconst_1
    //   544: putstatic ah.c : Z
    //   547: iconst_0
    //   548: putstatic ah.a : Z
    //   551: iconst_3
    //   552: invokestatic b : (B)V
    //   555: goto -> 1115
    //   558: invokestatic c : ()V
    //   561: iconst_2
    //   562: invokestatic a : (I)V
    //   565: return
    //   566: bipush #11
    //   568: iconst_0
    //   569: invokestatic a : (BB)V
    //   572: invokestatic c : ()V
    //   575: return
    //   576: bipush #11
    //   578: iconst_1
    //   579: invokestatic a : (BB)V
    //   582: invokestatic c : ()V
    //   585: return
    //   586: bipush #11
    //   588: iconst_2
    //   589: invokestatic a : (BB)V
    //   592: invokestatic c : ()V
    //   595: return
    //   596: getstatic ah.a : I
    //   599: getstatic ah.b : [[B
    //   602: getstatic ah.a : I
    //   605: aaload
    //   606: iconst_1
    //   607: baload
    //   608: iadd
    //   609: putstatic ah.a : I
    //   612: goto -> 1115
    //   615: getstatic ah.a : I
    //   618: getstatic ah.b : [[B
    //   621: getstatic ah.a : I
    //   624: aaload
    //   625: iconst_1
    //   626: baload
    //   627: isub
    //   628: putstatic ah.a : I
    //   631: goto -> 1115
    //   634: invokestatic i : ()V
    //   637: invokestatic c : ()V
    //   640: goto -> 1115
    //   643: invokestatic s : ()V
    //   646: goto -> 1115
    //   649: invokestatic j : ()V
    //   652: goto -> 1115
    //   655: invokestatic k : ()V
    //   658: goto -> 1115
    //   661: invokestatic l : ()V
    //   664: goto -> 1115
    //   667: invokestatic m : ()V
    //   670: goto -> 1115
    //   673: invokestatic n : ()V
    //   676: goto -> 1115
    //   679: invokestatic o : ()V
    //   682: goto -> 1115
    //   685: invokestatic p : ()V
    //   688: goto -> 1115
    //   691: invokestatic q : ()V
    //   694: goto -> 1115
    //   697: invokestatic r : ()V
    //   700: goto -> 1115
    //   703: invokestatic t : ()V
    //   706: goto -> 1115
    //   709: invokestatic u : ()V
    //   712: goto -> 1115
    //   715: invokestatic v : ()V
    //   718: goto -> 1115
    //   721: getstatic n.a : Lae;
    //   724: getfield a : [Lac;
    //   727: getstatic ah.b : [[B
    //   730: getstatic ah.a : I
    //   733: dup
    //   734: iconst_1
    //   735: iadd
    //   736: putstatic ah.a : I
    //   739: aaload
    //   740: iconst_1
    //   741: baload
    //   742: aaload
    //   743: dup
    //   744: astore_1
    //   745: iconst_0
    //   746: putfield d : Z
    //   749: aload_1
    //   750: invokevirtual f : ()V
    //   753: goto -> 1115
    //   756: getstatic n.a : Lae;
    //   759: getfield a : [Lac;
    //   762: getstatic ah.b : [[B
    //   765: getstatic ah.a : I
    //   768: dup
    //   769: iconst_1
    //   770: iadd
    //   771: putstatic ah.a : I
    //   774: aaload
    //   775: iconst_1
    //   776: baload
    //   777: aaload
    //   778: dup
    //   779: astore_1
    //   780: iconst_1
    //   781: putfield d : Z
    //   784: aload_1
    //   785: aload_1
    //   786: getfield c : S
    //   789: aload_1
    //   790: getfield d : S
    //   793: invokevirtual a : (SS)V
    //   796: goto -> 1115
    //   799: getstatic ah.b : [[B
    //   802: getstatic ah.a : I
    //   805: aaload
    //   806: iconst_1
    //   807: baload
    //   808: istore_2
    //   809: aload_0
    //   810: invokevirtual c : ()V
    //   813: iload_2
    //   814: ifeq -> 835
    //   817: aload_0
    //   818: new aw
    //   821: dup
    //   822: bipush #10
    //   824: iconst_m1
    //   825: iload_2
    //   826: iconst_1
    //   827: isub
    //   828: i2s
    //   829: invokespecial <init> : (BSS)V
    //   832: invokevirtual a : (Lf;)V
    //   835: getstatic ah.a : I
    //   838: iconst_1
    //   839: iadd
    //   840: putstatic ah.a : I
    //   843: goto -> 1115
    //   846: getstatic n.a : Lae;
    //   849: getfield a : [Lac;
    //   852: getstatic ah.b : [[B
    //   855: getstatic ah.a : I
    //   858: aaload
    //   859: iconst_1
    //   860: baload
    //   861: aaload
    //   862: astore_1
    //   863: getstatic ah.b : [[B
    //   866: getstatic ah.a : I
    //   869: aaload
    //   870: iconst_2
    //   871: baload
    //   872: istore_3
    //   873: aload_1
    //   874: invokevirtual c : ()V
    //   877: iload_3
    //   878: ifeq -> 899
    //   881: aload_1
    //   882: new aw
    //   885: dup
    //   886: bipush #10
    //   888: iconst_m1
    //   889: iload_3
    //   890: iconst_1
    //   891: isub
    //   892: i2s
    //   893: invokespecial <init> : (BSS)V
    //   896: invokevirtual a : (Lf;)V
    //   899: getstatic ah.a : I
    //   902: iconst_1
    //   903: iadd
    //   904: putstatic ah.a : I
    //   907: goto -> 1115
    //   910: iconst_1
    //   911: putstatic ah.f : B
    //   914: getstatic ah.a : I
    //   917: iconst_1
    //   918: iadd
    //   919: putstatic ah.a : I
    //   922: goto -> 1115
    //   925: iconst_0
    //   926: putstatic ah.f : B
    //   929: getstatic ah.a : I
    //   932: iconst_1
    //   933: iadd
    //   934: putstatic ah.a : I
    //   937: goto -> 1115
    //   940: bipush #6
    //   942: newarray byte
    //   944: putstatic ah.h : [B
    //   947: iconst_0
    //   948: istore #4
    //   950: iload #4
    //   952: bipush #6
    //   954: if_icmpge -> 980
    //   957: getstatic ah.h : [B
    //   960: iload #4
    //   962: bipush #-5
    //   964: iconst_5
    //   965: invokestatic a : (II)I
    //   968: i2b
    //   969: bastore
    //   970: iload #4
    //   972: iconst_1
    //   973: iadd
    //   974: i2b
    //   975: istore #4
    //   977: goto -> 950
    //   980: iconst_5
    //   981: invokestatic b : (B)V
    //   984: goto -> 1115
    //   987: iconst_5
    //   988: putstatic ah.e : B
    //   991: iconst_5
    //   992: invokestatic b : (B)V
    //   995: goto -> 1115
    //   998: getstatic ah.b : [[B
    //   1001: getstatic ah.a : I
    //   1004: aaload
    //   1005: iconst_1
    //   1006: baload
    //   1007: istore #4
    //   1009: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1012: new java/lang/StringBuffer
    //   1015: dup
    //   1016: invokespecial <init> : ()V
    //   1019: ldc '=====[EVENT BGM] '
    //   1021: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1024: iload #4
    //   1026: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1029: invokevirtual toString : ()Ljava/lang/String;
    //   1032: invokevirtual println : (Ljava/lang/String;)V
    //   1035: iload #4
    //   1037: iconst_5
    //   1038: if_icmpeq -> 1055
    //   1041: iload #4
    //   1043: bipush #6
    //   1045: if_icmpeq -> 1055
    //   1048: iload #4
    //   1050: bipush #7
    //   1052: if_icmpne -> 1063
    //   1055: iload #4
    //   1057: invokestatic c : (I)V
    //   1060: goto -> 1076
    //   1063: iload #4
    //   1065: bipush #8
    //   1067: if_icmpne -> 1076
    //   1070: iload #4
    //   1072: iconst_0
    //   1073: invokestatic a : (BZ)V
    //   1076: getstatic ah.a : I
    //   1079: iconst_1
    //   1080: iadd
    //   1081: putstatic ah.a : I
    //   1084: goto -> 1115
    //   1087: invokestatic c : ()V
    //   1090: getstatic ah.a : I
    //   1093: iconst_1
    //   1094: iadd
    //   1095: putstatic ah.a : I
    //   1098: goto -> 1115
    //   1101: invokestatic c : ()V
    //   1104: getstatic bs.a : Las;
    //   1107: invokevirtual g : ()V
    //   1110: bipush #12
    //   1112: invokestatic a : (I)V
    //   1115: getstatic ah.a : B
    //   1118: tableswitch default -> 1188, 1 -> 1152, 2 -> 1173, 3 -> 1167, 4 -> 1179, 5 -> 1185
    //   1152: invokestatic d : ()V
    //   1155: invokestatic n : ()V
    //   1158: getstatic n.a : Lae;
    //   1161: invokevirtual c : ()V
    //   1164: goto -> 1188
    //   1167: invokestatic f : ()V
    //   1170: goto -> 1188
    //   1173: invokestatic e : ()V
    //   1176: goto -> 1188
    //   1179: invokestatic g : ()V
    //   1182: goto -> 1188
    //   1185: invokestatic h : ()V
    //   1188: getstatic ah.b : [[B
    //   1191: ifnull -> 1211
    //   1194: getstatic ah.a : I
    //   1197: getstatic ah.b : [[B
    //   1200: arraylength
    //   1201: if_icmplt -> 1211
    //   1204: invokestatic c : ()V
    //   1207: iconst_2
    //   1208: invokestatic a : (I)V
    //   1211: return
  }
  
  private static final void d() {
    // Byte code:
    //   0: getstatic ah.b : I
    //   3: ifle -> 29
    //   6: getstatic ah.b : I
    //   9: iconst_1
    //   10: isub
    //   11: putstatic ah.b : I
    //   14: getstatic ah.b : I
    //   17: ifne -> 28
    //   20: getstatic ah.a : I
    //   23: iconst_1
    //   24: iadd
    //   25: putstatic ah.a : I
    //   28: return
    //   29: invokestatic a : ()Lao;
    //   32: astore_0
    //   33: getstatic ah.a : I
    //   36: getstatic ah.b : [[B
    //   39: arraylength
    //   40: if_icmpge -> 516
    //   43: getstatic ah.b : [[B
    //   46: getstatic ah.a : I
    //   49: aaload
    //   50: iconst_0
    //   51: baload
    //   52: iconst_4
    //   53: if_icmpeq -> 516
    //   56: getstatic ah.b : [[B
    //   59: getstatic ah.a : I
    //   62: aaload
    //   63: iconst_0
    //   64: baload
    //   65: tableswitch default -> 500, 3 -> 228, 4 -> 500, 5 -> 249, 6 -> 257, 7 -> 500, 8 -> 500, 9 -> 500, 10 -> 500, 11 -> 500, 12 -> 500, 13 -> 500, 14 -> 500, 15 -> 273, 16 -> 311, 17 -> 336, 18 -> 500, 19 -> 500, 20 -> 500, 21 -> 500, 22 -> 500, 23 -> 500, 24 -> 500, 25 -> 500, 26 -> 500, 27 -> 500, 28 -> 500, 29 -> 500, 30 -> 500, 31 -> 500, 32 -> 500, 33 -> 500, 34 -> 369, 35 -> 394, 36 -> 400, 37 -> 418, 38 -> 448, 39 -> 454
    //   228: aload_0
    //   229: iconst_2
    //   230: invokevirtual a : (B)V
    //   233: aload_0
    //   234: getstatic ah.b : [[B
    //   237: getstatic ah.a : I
    //   240: aaload
    //   241: iconst_1
    //   242: baload
    //   243: invokevirtual b : (B)V
    //   246: goto -> 505
    //   249: aload_0
    //   250: iconst_1
    //   251: invokevirtual a : (B)V
    //   254: goto -> 505
    //   257: aload_0
    //   258: getstatic ah.b : [[B
    //   261: getstatic ah.a : I
    //   264: aaload
    //   265: iconst_1
    //   266: baload
    //   267: invokevirtual b : (B)V
    //   270: goto -> 505
    //   273: getstatic n.a : Lae;
    //   276: getfield a : [Lac;
    //   279: getstatic ah.b : [[B
    //   282: getstatic ah.a : I
    //   285: aaload
    //   286: iconst_1
    //   287: baload
    //   288: aaload
    //   289: dup
    //   290: astore_1
    //   291: iconst_2
    //   292: invokevirtual a : (B)V
    //   295: aload_1
    //   296: getstatic ah.b : [[B
    //   299: getstatic ah.a : I
    //   302: aaload
    //   303: iconst_2
    //   304: baload
    //   305: invokevirtual b : (B)V
    //   308: goto -> 505
    //   311: getstatic n.a : Lae;
    //   314: getfield a : [Lac;
    //   317: getstatic ah.b : [[B
    //   320: getstatic ah.a : I
    //   323: aaload
    //   324: iconst_1
    //   325: baload
    //   326: aaload
    //   327: dup
    //   328: astore_1
    //   329: iconst_1
    //   330: invokevirtual a : (B)V
    //   333: goto -> 505
    //   336: getstatic n.a : Lae;
    //   339: getfield a : [Lac;
    //   342: getstatic ah.b : [[B
    //   345: getstatic ah.a : I
    //   348: aaload
    //   349: iconst_1
    //   350: baload
    //   351: aaload
    //   352: dup
    //   353: astore_1
    //   354: getstatic ah.b : [[B
    //   357: getstatic ah.a : I
    //   360: aaload
    //   361: iconst_2
    //   362: baload
    //   363: invokevirtual b : (B)V
    //   366: goto -> 505
    //   369: invokestatic w : ()V
    //   372: iconst_1
    //   373: putstatic ah.e : Z
    //   376: invokestatic b : ()V
    //   379: getstatic n.a : I
    //   382: putstatic n.c : I
    //   385: getstatic n.b : I
    //   388: putstatic n.d : I
    //   391: goto -> 505
    //   394: invokestatic w : ()V
    //   397: goto -> 505
    //   400: invokestatic w : ()V
    //   403: getstatic ah.b : [[B
    //   406: getstatic ah.a : I
    //   409: aaload
    //   410: iconst_1
    //   411: baload
    //   412: putstatic ah.b : B
    //   415: goto -> 505
    //   418: invokestatic w : ()V
    //   421: getstatic ah.b : [[B
    //   424: getstatic ah.a : I
    //   427: aaload
    //   428: iconst_1
    //   429: baload
    //   430: putstatic ah.c : B
    //   433: getstatic ah.b : [[B
    //   436: getstatic ah.a : I
    //   439: aaload
    //   440: iconst_2
    //   441: baload
    //   442: putstatic ah.d : B
    //   445: goto -> 505
    //   448: invokestatic w : ()V
    //   451: goto -> 505
    //   454: invokestatic w : ()V
    //   457: getstatic ah.b : [[B
    //   460: getstatic ah.a : I
    //   463: aaload
    //   464: iconst_1
    //   465: baload
    //   466: bipush #16
    //   468: imul
    //   469: ineg
    //   470: getstatic r.i : I
    //   473: iadd
    //   474: putstatic n.a : I
    //   477: getstatic ah.b : [[B
    //   480: getstatic ah.a : I
    //   483: aaload
    //   484: iconst_2
    //   485: baload
    //   486: bipush #16
    //   488: imul
    //   489: ineg
    //   490: getstatic r.j : I
    //   493: iadd
    //   494: putstatic n.b : I
    //   497: goto -> 505
    //   500: iconst_0
    //   501: invokestatic b : (B)V
    //   504: return
    //   505: getstatic ah.a : I
    //   508: iconst_1
    //   509: iadd
    //   510: putstatic ah.a : I
    //   513: goto -> 33
    //   516: getstatic ah.a : I
    //   519: getstatic ah.b : [[B
    //   522: arraylength
    //   523: if_icmpeq -> 554
    //   526: getstatic ah.b : [[B
    //   529: getstatic ah.a : I
    //   532: aaload
    //   533: iconst_1
    //   534: baload
    //   535: iconst_1
    //   536: isub
    //   537: putstatic ah.b : I
    //   540: getstatic ah.b : I
    //   543: ifne -> 554
    //   546: getstatic ah.a : I
    //   549: iconst_1
    //   550: iadd
    //   551: putstatic ah.a : I
    //   554: return
  }
  
  private static final void e() {
    if (e < d) {
      if (b != null || bs.a.c) {
        e = d;
      } else {
        e = bh.a(a, c, e);
        if (e + 1 >= d)
          e = d; 
      } 
    } else if (c + d >= a.length && b != null) {
      a = null;
      a++;
      b((byte)0);
    } else if (b != null) {
      c += d;
      d = bh.a(a, c, r.g - 28, 3);
      e = 0;
      f = false;
    } 
    b = false;
  }
  
  private static final void f() {
    if (g) {
      if (d != 0) {
        if (c == true)
          try {
            System.out.println("save!!!!!!");
            n.o();
          } catch (Exception exception2) {
            Exception exception1;
            (exception1 = null).printStackTrace();
          }  
        i();
        c();
        g = false;
      } 
      return;
    } 
    if (d != 0) {
      if (c == true) {
        a++;
        b((byte)0);
        return;
      } 
      a += b[a][2];
      b((byte)0);
    } 
  }
  
  private static final void g() {
    if (f) {
      b = null;
      c = null;
      c();
      n.a(2);
    } 
  }
  
  private static final void h() {
    switch (b[a][0]) {
      case '\031':
        if (h != null && h.length > 0) {
          ((ae)n.a).e = h[0];
          ((ae)n.a).f = h[1];
          byte[] arrayOfByte = new byte[h.length - 2];
          System.arraycopy(h, 2, arrayOfByte, 0, arrayOfByte.length);
          h = arrayOfByte;
          return;
        } 
        b((byte)0);
        a++;
        return;
      case '\030':
        if (e > 0) {
          if (e % 2 == 1) {
            f = true;
          } else {
            f = false;
          } 
          e = (byte)(e - 1);
          return;
        } 
        b((byte)0);
        a++;
        f = false;
        break;
    } 
  }
  
  private static final void i() {
    char c1 = b[a][1];
    char c2 = b[a][2];
    a++;
    if (b[a][0] != '\b') {
      System.out.println("[ERROR:EventScript] No hero position after map change.");
      return;
    } 
    char c3 = b[a][1];
    char c4 = b[a][2];
    n.b(c1, c2, c3, c4);
  }
  
  private static final void j() {
    int i = (i = b[a][1] & 0xFF) | (b[a][2] & 0xFF) << 2 & 0x300;
    switch (b[a][2] & 0x3) {
      case 0:
        n.b(i);
        break;
      case 1:
        n.c(i);
        break;
      case 2:
        n.d(i);
        break;
    } 
    a++;
  }
  
  private static final void k() {
    int i = (i = b[a][1] & 0xFF) | (b[a][2] & 0xFF) << 2 & 0x300;
    switch (b[a][2] & 0x3) {
      case 0:
        n.e(i);
        break;
      case 1:
        n.f(i);
        break;
      case 2:
        n.g(i);
        break;
    } 
    a++;
  }
  
  private static final void l() {
    n.a().d(b[a][1]);
    a++;
  }
  
  private static final void m() {
    int i = (i = b[a][2] & 0xFF) | (b[a][1] & 0xFF) << 8;
    n.a().b(i);
    a++;
  }
  
  private static final void n() {
    int i = (i = b[a][2] & 0xFF) | (b[a][1] & 0xFF) << 8;
    n.a().d(i);
    a++;
  }
  
  private static final void o() {
    int i = (i = b[a][2] & 0xFF) | (b[a][1] & 0xFF) << 8;
    n.a().f(i);
    a++;
  }
  
  private static final void p() {
    int i = (i = b[a][2] & 0xFF) | (b[a][1] & 0xFF) << 8;
    n.a().g(i);
    a++;
  }
  
  private static final void q() {
    char c1 = b[a][1];
    char c2 = b[a][2];
    a++;
    if (b[a][0] != '\025') {
      System.out.println("[ERROR:EventScript] No CMD_HANDLE_ITEM_NUM after CMD_HANDLE_ITEM.");
      return;
    } 
    ao ao = n.a();
    char c3 = b[a][1];
    a++;
    if (c3 > '\000') {
      ad ad;
      if (ad = ad.a(c1, c2, true, true) instanceof e)
        ((e)ad).b = true; 
      if (!ao.a.a(ad, c3))
        a(cj.a.a(3938).toCharArray(), "".toCharArray()); 
      return;
    } 
    if (c3 < '\000') {
      byte b = (byte)-c3;
      if (ao.a.a(c1, c2) >= b) {
        ao.a.a(c1, c2, b);
        return;
      } 
      a(cj.a.a(3939).toCharArray(), "".toCharArray());
    } 
  }
  
  private static final void r() {
    byte b;
    switch (b[a][1]) {
      case '\000':
        b = 4;
        break;
      case '\001':
        b = 3;
        break;
      case '\002':
        b = 5;
        break;
      default:
        return;
    } 
    a++;
    n.a().a(b);
  }
  
  private static final void s() {
    ao ao;
    (ao = n.a()).f();
    ao.a((short)(b[a][1] * 16), (short)(b[a][2] * 16));
    ao.g();
    a++;
  }
  
  private static final void t() {
    boolean[][] arrayOfBoolean = n.a;
    char c1 = b[a][1];
    char c2 = b[a][2];
    a++;
    if (b[a][0] != '+') {
      System.out.println("[ERROR:EventScript] No CMD_TILE_PROPERTY after CMD_CHANGE_TILE.");
      return;
    } 
    char c3 = b[a][1];
    char c4 = b[a][2];
    a++;
    ((ae)arrayOfBoolean).c[c2][c1] = c4;
    ((ae)arrayOfBoolean).b[c2][c1] = c3;
  }
  
  private static final void u() {
    boolean[][] arrayOfBoolean = n.a;
    char c1 = b[a][1];
    char c2 = b[a][2];
    a++;
    char c3;
    (c3 = ((ae)arrayOfBoolean).a[c1]).a = ce.f[c2];
  }
  
  private static final void v() {
    boolean[][] arrayOfBoolean = n.a;
    char c1 = b[a][1];
    char c2 = b[a][2];
    a++;
    (((ae)arrayOfBoolean).a[c1]).f = c2;
  }
  
  public static final void a(Graphics paramGraphics) {
    if (!a)
      return; 
    n.a(false, false);
    if (a != 3 && a)
      return; 
    if (!f) {
      n.a.a(paramGraphics);
    } else {
      if (f == true) {
        paramGraphics.setColor(0);
      } else if (f == 2) {
        paramGraphics.setColor(16777215);
      } 
      paramGraphics.fillRect(0, 0, as.a, as.b);
    } 
    bs.a.a(paramGraphics);
    switch (a) {
      case true:
        c(paramGraphics);
        bh.a(paramGraphics, (char[])bh.d, (char[])null);
        return;
      case true:
        b(paramGraphics);
        bs.a.b();
        bh.a(paramGraphics, (char[])bh.g, (char[])bh.f);
        return;
      case true:
        a(paramGraphics, (r.g >> 1) - 60, (r.h >> 1) - 25, 120, 45, b, c);
        bh.a(paramGraphics, (char[])bh.d, (char[])null);
        break;
    } 
  }
  
  private static final void b(Graphics paramGraphics) {
    int i = r.g - 8;
    boolean bool = false;
    int j = r.i - i / 2;
    int k = r.h - 41 - 10;
    paramGraphics.translate(j, k);
    paramGraphics.setColor(2039615);
    paramGraphics.drawRect(0, 0, i - 1, 40);
    paramGraphics.setColor(6250367);
    paramGraphics.drawRect(1, 1, i - 3, 38);
    paramGraphics.setColor(0);
    paramGraphics.fillRect(2, 2, i - 4, 37);
    paramGraphics.drawImage(ce.r[0], 2, 2, 20);
    paramGraphics.drawImage(ce.r[1], 0 + i - 2, 2, 24);
    paramGraphics.drawImage(ce.r[2], 2, 39, 36);
    paramGraphics.drawImage(ce.r[3], 0 + i - 2, 39, 40);
    paramGraphics.setColor(16777215);
    bh.c(paramGraphics, 10, 5, i - 20, 1, a, c, f, e);
    f = e;
    paramGraphics.translate(-j, -k);
    paramGraphics.setClip(0, 0, r.g, r.h);
    char c;
    if ((c = b[a][2]) > '\000') {
      paramGraphics.drawImage(ce.h[c - 1], j, k, 36);
      return;
    } 
    if (c < '\000')
      paramGraphics.drawImage(ce.h[-c - 1], j + i, k, 40); 
  }
  
  private static final void c(Graphics paramGraphics) {
    try {
      char[] arrayOfChar = g ? cj.a.a(3940).toCharArray() : (char[])((ae)n.a).c[b[a][1]];
      Object[] arrayOfObject = { arrayOfChar, cj.a.a(3915).toCharArray(), cj.a.a(3916).toCharArray() };
      int i = bh.a(r.g, 70);
      a(paramGraphics, r.i - (i >> 1), r.j - 30, i, 60, arrayOfObject, 6, 1, (c != null) ? 1 : 2);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Object[] paramArrayOfObject, int paramInt5, int paramInt6, int paramInt7) {
    GraphicParent.a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    GraphicParent.b(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    paramGraphics.setColor(255, 255, 255);
    paramInt2 += 6;
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      if (b >= paramInt6 && paramInt6 != -1) {
        bh.a(paramGraphics, paramInt1 + paramInt5 + 9, paramInt2, (char[])paramArrayOfObject[b], 1);
        if (b == paramInt7)
          paramGraphics.drawImage(ce.d, paramInt1 + paramInt5, paramInt2, 20); 
        paramInt2 += bh.a() + 3;
      } else {
        paramInt2 += bh.a(paramGraphics, paramInt1 + paramInt5, paramInt2, paramInt3 - paramInt5 - paramInt5, 1, (char[])paramArrayOfObject[b]);
        paramInt2 += 5;
      } 
    } 
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, char[] paramArrayOfchar1, char[] paramArrayOfchar2) {
    GraphicParent.a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    GraphicParent.b(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    paramGraphics.setColor(255, 255, 255);
    bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 7, paramArrayOfchar1, 1);
    bh.a(paramGraphics, paramInt1 + 6, paramInt2 + 23, paramArrayOfchar2, 1);
  }
  
  private static void w() {
    e = 0;
    b = -1;
    c = false;
    d = 0;
  }
  
  private static final void a(char[] paramArrayOfchar1, char[] paramArrayOfchar2) {
    b = paramArrayOfchar1;
    c = paramArrayOfchar2;
    f = false;
    b((byte)4);
  }
  
  public static final void b() {
    if (e != 0) {
      n.g();
      return;
    } 
    if (e == 0 && b == -1 && c != null) {
      n.a -= d * u.a[c];
      n.b -= d * u.b[c];
    } 
  }
  
  static {
    (new String[100])[0] = "CMD_IDLE";
    (new String[100])[1] = "TALKTEXT";
    (new String[100])[2] = "YES/NO  ";
    (new String[100])[3] = "MV_H_MOV";
    (new String[100])[4] = "MV_DELAY";
    (new String[100])[5] = "MV_H_STP";
    (new String[100])[6] = "MV_H_DIR";
    (new String[100])[7] = "MAP_CHNG";
    (new String[100])[8] = "MAP_HERO";
    (new String[100])[9] = "SWI_DEF ";
    (new String[100])[10] = "MONEY   ";
    (new String[100])[11] = "ITEM    ";
    (new String[100])[12] = "EXP     ";
    (new String[100])[13] = "HP      ";
    (new String[100])[14] = "SP      ";
    (new String[100])[15] = "MV_N_MOV";
    (new String[100])[16] = "MV_N_STP";
    (new String[100])[17] = "MV_N_DIR";
    (new String[100])[18] = "GUARDIAN";
    (new String[100])[19] = "COMBO   ";
    (new String[100])[20] = "GAMEOVER";
    (new String[100])[21] = "ITEM_NUM";
    (new String[100])[22] = "SCR_DEL ";
    (new String[100])[23] = "SCR_SHOW";
    (new String[100])[24] = "SCR_FLAS";
    (new String[100])[25] = "SCR_SHAK";
    (new String[100])[26] = "BGM_PLAY";
    (new String[100])[27] = "BGM_STOP";
    (new String[100])[28] = "SYSBGM  ";
    (new String[100])[29] = "SOUND   ";
    (new String[100])[30] = "SWI_QUE ";
    (new String[100])[31] = "GOTO_FOR";
    (new String[100])[32] = "GOTO_BAK";
    (new String[100])[33] = "SWI_MAP ";
    (new String[100])[34] = "MV_FO_HE";
    (new String[100])[35] = "MV_FO_NO";
    (new String[100])[36] = "MV_FO_NP";
    (new String[100])[37] = "MV_CA_MV";
    (new String[100])[38] = "MV_CA_ST";
    (new String[100])[39] = "MV_CA_XY";
    (new String[100])[40] = "CHG_OBJ ";
    (new String[100])[41] = "CHG_NPC ";
    (new String[100])[42] = "CHGTL_XY";
    (new String[100])[43] = "CHGTL_VA";
    (new String[100])[44] = "OPN_BLAK";
    (new String[100])[45] = "OPEN_SHP";
    (new String[100])[46] = "HIDE_NPC";
    (new String[100])[47] = "SHOW_NPC";
    (new String[100])[48] = "OPN_REFI";
    (new String[100])[49] = "EMO_HERO";
    (new String[100])[50] = "EMO_NPC ";
    (new String[100])[51] = null;
    (new String[100])[52] = null;
    (new String[100])[53] = null;
    (new String[100])[54] = null;
    (new String[100])[55] = null;
    (new String[100])[56] = null;
    (new String[100])[57] = null;
    (new String[100])[58] = null;
    (new String[100])[59] = null;
    (new String[100])[60] = null;
    (new String[100])[61] = null;
    (new String[100])[62] = null;
    (new String[100])[63] = null;
    (new String[100])[64] = null;
    (new String[100])[65] = null;
    (new String[100])[66] = null;
    (new String[100])[67] = null;
    (new String[100])[68] = null;
    (new String[100])[69] = null;
    (new String[100])[70] = null;
    (new String[100])[71] = null;
    (new String[100])[72] = null;
    (new String[100])[73] = null;
    (new String[100])[74] = null;
    (new String[100])[75] = null;
    (new String[100])[76] = null;
    (new String[100])[77] = null;
    (new String[100])[78] = null;
    (new String[100])[79] = null;
    (new String[100])[80] = null;
    (new String[100])[81] = null;
    (new String[100])[82] = null;
    (new String[100])[83] = null;
    (new String[100])[84] = null;
    (new String[100])[85] = null;
    (new String[100])[86] = null;
    (new String[100])[87] = null;
    (new String[100])[88] = null;
    (new String[100])[89] = null;
    (new String[100])[90] = null;
    (new String[100])[91] = null;
    (new String[100])[92] = null;
    (new String[100])[93] = null;
    (new String[100])[94] = null;
    (new String[100])[95] = null;
    (new String[100])[96] = null;
    (new String[100])[97] = null;
    (new String[100])[98] = null;
    (new String[100])[99] = "END_EVNT";
  }
}


/* Location:              /home/markes/Downloads/wind_of_soltia/!/ah.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */