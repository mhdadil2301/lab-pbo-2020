public class Siswa {
    private int nrp;
	public Siswa(int nrpx) {
		nrp = nrpx;
	}
	public void setNrp(int nrpx) {
		nrp = nrpx;
	}
	public int getNrp() {
		return nrp;
	}
}

/**
Dapat dilihat pada class TesSiswa, atribut nrp dapat dengan mudah diubah di luar dari class Siswa.
Artinya nilai nrp bisa sangat bebas diubah dimanapun. Hal ini sangat berbahaya. Maka dari itu atribut
di-enkapsulasi dengan hak akses private. Ubah hak akses atribut nrp menjadi private. Kemudian coba
kompilasi class TesSiswa maka akan muncul error.
 */
