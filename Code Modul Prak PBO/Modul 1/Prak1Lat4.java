import java.util.Scanner;
public class Prak1Lat4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nilai1, nilai2, hasil;

		System.out.print("Masukkan integer pertama:");
		nilai1 = input.nextInt();
		
		System.out.print("Masukkan integer kedua:");
		nilai2 = input.nextInt();

		hasil = nilai1 + nilai2;
		System.out.println("Hasil " +nilai1+ " + " +nilai2+ " = "+ hasil);
	}
}

/**
Code di atas merupakan aplikasi untuk melakukan penambahan 2 nilai integer
yang dimasukkan melalui layar konsol sewaktu run program
dengan memanfaatkan method pada class Scanner
 */
