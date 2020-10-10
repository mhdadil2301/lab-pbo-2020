public class prak3Lat2 {
    public static void main(String args[]) {
    int a = 10;
    int b = 20;
    int c = 0;
    
    c = a + b;
    System.out.println("c = a + b = " + c );
    
    c += a ;
    System.out.println("c += a = " + c );
    
    c -= a ;
    System.out.println("c -= a = " + c );
    
    c *= a ;
    System.out.println("c *= a = " + c );
    
    a = 10;
    c = 15;
    c /= a ;
    System.out.println("c /= a = " + c );
    
    a = 10;
    c = 15;
    c %= a ;
    System.out.println("c %= a = " + c );
    
    c <<= 2 ;
    System.out.println("c <<= 2 = " + c );
    
    c >>= 2 ;
    System.out.println("c >>= 2 = " + c );
    
    c >>= 2 ;
    System.out.println("c >>= 2 = " + c );
    
    c &= a ;
    System.out.println("c &= a = " + c );
    
    c ^= a ;
    System.out.println("c ^= a = " + c );
    
    c |= a ;
    System.out.println("c |= a = " + c );
    }
   }

/*
c= a+b = 10+20 = 30 (nilai variabel a ditambah b akan menjadi nilai c)
c += a >>> c = c+a = 30+10 = 40 ( nilai variabel c(30) ditambah dengan nilai variabel a(10) maka hasilnya 40)
c -= a >>> c = c-a = 40-10 = 30 (nilai c(40) akan dikurang dengan 10 maka hasilnya adalah 30 dan disimpan dengan nilai variabel c)
c *= a >>> c = c*a = 30*10 = 300 (nilai c(30) dikalikan dengan 10 maka hasilnya adalah 300)
c /= a >>> c= c/a = 15/10 = 1 (hasilnya 1 karena integer)
c %= a >>> c= c%a = 15%10 = 5 (hasil 15 dibagi 10 adalah 5, maka nilai c sekarang disimpan dengan nilai 5)
c <<= 2 >>> c= c << 2 = 5 << 2 = 20 (operasi ini disebut shift left pada angka biner)
c >>= 2 >>> c= c >> 2 = 20 >> 2 = 5 (operasi ini disebut shift right pada angka biner)
c >>= 2 >>> c= c >> 2 = 5 >> 2 = 1 (operasi ini disebut shift pada angka biner)
c &= a >>> c = c%a = 1&10 = 0 (operasi ini disebut AND pada angka biner)
c ^= a >>> c = c^a = 0^10 = 10 (operasi ini disebut XOR pada angka biner)
c |= a >>> c = c | a = 10 | 10 = 10 (operasi ini disebut OR pada angka biner)


*/