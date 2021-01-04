public class prak3Lat7 {
    public static void main(String args[]) {
        String name = "James";
    
        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );

    }
}

/*
Program ini untuk mengecek apakah suatu objek termasuk ke dalam class tertentu atau tidak, 
nilai yang dikembalikan adalah false dan true. Output yang dihasilkan pada program adalah TRUE,
karena name adalah variabel bertipe String.

*/