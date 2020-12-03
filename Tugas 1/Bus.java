import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    Scanner scan = new Scanner(System.in);
    private ArrayList <Penumpang> penumpangBiasa;
    private ArrayList <Penumpang> penumpangPrioritas; 

    public Bus() {
        penumpangBiasa = new ArrayList<Penumpang>();
        penumpangPrioritas = new ArrayList<Penumpang>();
    }

    public ArrayList<Penumpang> getPenumpangBiasa(){
        for (Penumpang penumpang : penumpangBiasa) {
            penumpang.getNama();
        }
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas(){
        for (Penumpang penumpang : penumpangPrioritas) {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa(){
        int jumlahPenumpangBiasa = penumpangBiasa.size();
        System.out.println("Jumlah penumpang Biasa yaitu " + jumlahPenumpangBiasa);
        return jumlahPenumpangBiasa;
    }

    public int getJumlahPenumpangPrioritas(){
        int jumlahPenumpangPrioritas = penumpangPrioritas.size();
        System.out.println("Jumlah penumpang Prioritas yaitu " + jumlahPenumpangPrioritas);
        return jumlahPenumpangPrioritas;
    }

    public boolean naikPenumpang(Penumpang penumpang){
        if ((penumpangPrioritas.size() < 2) && (penumpang.getUmur() < 10 || penumpang.getUmur() > 60) || (penumpang.getHamil() == true) ) {
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + "Berhasil ditambahkan");
            return penumpangPrioritas.add(penumpang);
        } else if (penumpangBiasa.size() < 5){
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + "Gagal ditambahkan");
            return penumpangBiasa.add(penumpang);
        } else {
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + "Gagal ditambahkan karena tidak ada kursi yang tersedia");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama){
        for (int i = 0; i < penumpangBiasa.size(); i++) {
            if (nama.equals(penumpangBiasa.get(i).getNama())) {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang berhasil diturunkan");
                return penumpangBiasa.equals(nama);
            } else {
                System.out.println("Tidak ada penumpang yang bernama " + nama);
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i++) {
            if (nama.equals(penumpangPrioritas.get(i).getNama())) {
                penumpangPrioritas.remove(i);
                System.out.println("Penumpang berhasil diturunkan");
                return penumpangPrioritas.equals(nama);
            } else {
                System.out.println("Tidak ada penumpang yang bernama " + nama);
                return false;
            }
        }
        return penumpangPrioritas.equals(nama);
    }

    public String toString(){
        String namaPenumpangBiasa =" ", namaPenumpangPrioritas =" ";
        boolean check1 = penumpangBiasa.isEmpty();
        boolean check2 = penumpangPrioritas.isEmpty();

        for (Penumpang penumpang : penumpangBiasa) {
            namaPenumpangBiasa += penumpang.getNama().toString();
        }
        for (Penumpang penumpang : penumpangPrioritas) {
            namaPenumpangPrioritas += penumpang.getNama().toString();
        }

        if (check1 == true) {
            System.out.println("tidak ada penumpang biasa");
        } else {
            System.out.println("daftar nama penumpang biasa = " + namaPenumpangBiasa);
        }

        if (check2 == true) {
            System.out.println("tidak ada penumpang prioritas");
        } else {
            System.out.println("daftar nama penumpang prioritas = " + namaPenumpangPrioritas);
        }
        
        System.out.println("jumlah semua penumpang adalah = " +penumpangBiasa.size() + penumpangPrioritas.size());
        return "daftar nama penumpang biasa = " + namaPenumpangBiasa + "daftar nama penumpang prioritas = " + namaPenumpangPrioritas
        + "jumlah1 semua penumpang = " + penumpangBiasa.size() + penumpangPrioritas.size();
    }
        
}
