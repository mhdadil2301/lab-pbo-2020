public class prak3Lat5 {
    public static void main(String args[]) {
    boolean a = true;
    boolean b = false;
    System.out.println("a && b = " + (a&&b));
    System.out.println("a || b = " + (a||b) );
    System.out.println("!(a && b) = " + !(a && b));
 }
}
/*
a && b = false, karena operator AND akan benar jika keduanya benar, namun karena nilai b adalah false maka outputnya adalah false
a || b = true, karena operator OR akan bernilai benar jika salah satu nilai benar.
!(a && b)= true, karena operator membalikkan nilai boolean.

*/ 
