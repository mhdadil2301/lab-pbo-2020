public class Manajer extends Pegawai {
	private String departemen;

	public Manajer(String nama, double gaji, String departemen) {
		Pegawai p = new Pegawai(nama, gaji);
		this.departemen = departemen;
	}

	public void setDepartemen(String departemen) {
	this.departemen = departemen;
	}

	public String getDepartemen() {
	return this.departemen;
	}
}

/**
Class diatas akan error disebabkan tidak adanya penurunan Method constructor tidak diturunkan ke sub class, 
disini kita harus menurunkan parameter method constructor.
 */
