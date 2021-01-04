import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        // 50% chance heads, 50% chance tails
            Random rand = new Random();
            double chance = rand.nextDouble();
            if (chance < 0.5) {
                    System.out.println("heads!");
                } 
            else {
                System.out.println("tails!");
            }
    }
}

/** 
Penjelasan code diatas :
code diatas tentang lempar koin.
terdapat import java.util.Random menghasilkan compilasi Random.
objek random diatas membuat nilai acak untuk double.
*/