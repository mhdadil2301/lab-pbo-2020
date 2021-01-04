public class prak3Lat6 {
    public static void main(String args[]) {
    int a, b;
    a = 10;
    
    b = (a == 1) ? 20: 30;
    System.out.println( "Value of b is : " + b );
    
    b = (a == 10) ? 20: 30;
    System.out.println( "Value of b is : " + b );
    
    }
}

/*
Jika true maka sebelah kiri, jika false maka sebelah kanan.

b =(a == 1) ? 20 : 30;
nilai a FALSE karena nilai a bukan 1, tapi 10.
Pada b = (a == 10) ? 20: 30; 
nilai a TRUE karena nilai a adalah 10.

*/
