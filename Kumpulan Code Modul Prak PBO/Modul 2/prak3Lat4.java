public class prak3Lat4 {
    public static void main(String args[]) {
    int a = 60;           /* 60 = 0011 1100 */
    int b = 13;           /* 13 = 0000 1101 */
    int c = 0;

 c = a & b;               /* 12 = 0000 1100 (Menggunakan operator AND dari nilai a=60 nilai b=13, sehingga disimpan pada nilai c=12) */ 
 System.out.println("a & b = " + c );
 c = a | b;               /* 61 = 0011 1101 (Menggunakan operator OR dari nilai a=60 nilai b=13, sehingga disimpan pada nilai c=61)  */
 System.out.println("a | b = " + c );
 c = a ^ b;               /* 49 = 0011 0001 (Menggunakan operator XOR dari nilai a=60 nilai b=13, sehingga disimpan pada nilai c=49) */
 System.out.println("a ^ b = " + c );
 c = ~a;                  /*-61 = 1100 0011 (Menggunakan operator COMPIMENT dari nilai ~a=-1, sehingga disimpan pada nilai c=-61) */
 System.out.println("~a = " + c );
 c = a << 2;              /* 240 = 1111 0000 (Menggunakan operator shift kiri dari nilai a=60, sehingga disimpan pada nilai c=240) */
 System.out.println("a << 2 = " + c );
 c = a >> 2;              /* 15 = 1111 (Menggunakan operator shift kanan dari nilai a=60. sehingga disimpan pada nilai c=15) */
 System.out.println("a >> 2 = " + c );
 c = a >>> 2;             /* 15 = 0000 1111 (Menggunakan operator shift kanan dari nilai a=60, sehingga disimpan pada nilai c=15) */
 System.out.println("a >>> 2 = " + c );
 }
}