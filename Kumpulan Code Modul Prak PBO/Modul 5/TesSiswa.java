public class TesSiswa {
    public static void main(String[] ar) {
        Siswa s = new Siswa(12345);
        s.nrp = 8030001;
        System.out.println(s.nrp);
       
       s.nrp = 8030002;
        System.out.println(s.nrp);
    }
}

/**
Code diatas akan mengalami error. Karena Hak akses pada class Siswa bersifat private solusinya pada class Siswa harus diberi
hak ases public
 */
