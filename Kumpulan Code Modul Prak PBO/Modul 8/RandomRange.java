import java.util.Random;
	
public class RandomRange {
 	public static void main(String[] args) {
 		Random num = new Random();
 		int randomnum = num.nextInt(10)+4;
 		System.out.println("Random Number: " + randomnum);
 	}
}


/**
Hasil compile code diatas menghasilkan :
Random Number: 4
Nilai acak tersebut bisa didapatkan dengan menggunakan class Random.
 */