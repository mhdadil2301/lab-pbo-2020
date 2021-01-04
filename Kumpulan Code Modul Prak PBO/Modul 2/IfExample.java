import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        int age=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan umur anda:");
        age = sc.nextInt();

        if(age>=17)
            System.out.print("Anda sudah boleh buat KTP");

    }
}

/*
-Digunakan import scanner untuk membaca nilai yang akan diinput.
-User diminta untuk menginput umur dalam bentuk integer.
-terdapat kondisi dimana "jika umur lebih besar dari 17" maka program akan menampilkan status "Anda sudah boleh buat KTP".

*/