public class Siswa3 {
    private int nrp;
 	private String nama;

 	public Siswa3()
 	{
 		this.nrp = 12345;
 		this.nama = "nama default";
 	}

 	public Siswa3(int nrp, String nama)
 	{
 		this.nrp = nrp;
 		this.nama = nama;
 	}

 	public void setNrp(int nrp)
 	{
 		this.nrp = nrp;
 	}

 	public int getNrp()
 	{
 		return this.nrp;
 	}

 	public void setNama(String nama)
 	{
 		this.nama = nama;
 	}

 	public String getNama()
 	{
 		return this.nama;
 	}
}

/**
pada code diatas terdapat method overloading yaitu :
public Siswa3()
 	{
 		this.nrp = 12345;
 		this.nama = "nama default";
 	}
 	public Siswa3(int nrp, String nama)
 	{
 		this.nrp = nrp;
 		this.nama = nama;
    }
Method overloading adalah beberapa method yang memiliki nama method yang sama namun berbeda
dari jumlah parameter, tipe data parameter dan urutan parameter.  
 */
