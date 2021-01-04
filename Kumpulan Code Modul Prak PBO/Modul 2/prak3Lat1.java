public class prak3Lat1 {
    public static void main(String args[]) {
    int a = 10;
    int b = 20;
    int c = 25;
    int d = 25;
    System.out.println("a + b = " + (a + b) );
    System.out.println("a - b = " + (a - b) );
    System.out.println("a * b = " + (a * b) );
    System.out.println("b / a = " + (b / a) );
    System.out.println("b % a = " + (b % a) );
    System.out.println("c % a = " + (c % a) );
    System.out.println("a++ = " + (a++) );
    System.out.println("b-- = " + (a--) );
    System.out.println("d++ = " + (d++) );
    System.out.println("++d = " + (++d) );
    }
   }

/* Penjelasan kode di atas :
1. a+b = 10+20 = 30 
2. a-b = 10-20 = -10
3. a*b = 10*20 = 200
4. b/a = 20/10 = 2
5. b%a = 20%10 = 0 ( nilai b yang telah dideklarasi akan dimodulo dengan nilai a = 0)  
6. c%a = 25%10 = 5 nilai c yang telah  dideklarasi akan dimodulo dengan nilai a = 5)
7. a++ = ( nilai a=10)
8. b-- = ( nilai b=11)
9. d++ = ( nilai d =25, increment pada proses ini akan di tambah 1 = 26)
10. ++d = ( sebelumnya nila d telah mendapat postincrement 26, namun pada proses ini merupakan preincrement sehinggan akan ditambah 1 = 27 )
*/