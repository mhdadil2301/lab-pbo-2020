public class TesSiswa {
    public static void main(String[] ar)
 	{
 		Siswa s = new Siswa(12345);
            System.out.println(s.getNrp());

 		s.setNrp(8030001);
 		    System.out.println(s.getNrp());
 	}
}

/**
Didalam class TesSiswa terdapat class main dimana akan menghasilkan output, yaitu:
12345 > Akan masuk pada method accessor pada Class Siswa  
8030001 > Akan masuk pada method mutator pada Class Siswa
 */