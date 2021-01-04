public class Array3 {
    public static void main(String args[]){

        int [][] arrx= new int [3][3];
        arrx [0][0]=1;
        arrx [0][1]=2;
        arrx [0][2]=3;
        arrx [1][0]=4;
        arrx [1][1]=5;
        arrx [1][2]=6;
        arrx [2][0]=7;
        arrx [2][1]=8;
        arrx [2][2]=9;
        
        System.out.println("Nilai arrx[0][0] : " + arrx[0][0]);
        System.out.println("Nilai arrx[0][1] : " + arrx[0][1]);
        System.out.println("Nilai arrx[0][2] : " + arrx[0][2]);
        System.out.println("Nilai arrx[1][0] : " + arrx[1][0]);
        System.out.println("Nilai arrx[1][1] : " + arrx[1][1]);
        System.out.println("Nilai arrx[1][2] : " + arrx[1][2]);
        System.out.println("Nilai arrx[2][0] : " + arrx[2][0]);
        System.out.println("Nilai arrx[2][1] : " + arrx[2][1]);
        System.out.println("Nilai arrx[2][2] : " + arrx[2][2]);
        
        int sum=0;
        for (int[] arrxs: arrx){
            for (int arrxss: arrxs){
                  sum+=arrxss;
            }
            System.out.println("\nJumlah elemen array : "+sum);
        
        }
    }
}
/* Program menampilkan jumlah elemen array
-line 5-13 = nilai array
-line 15-23 = menampilkan nilai array 2D
-line 26 = Looping For each untuk memindahkan semua data dari Array 2D arrxss ke array 1D arrxs
-line 27 = Looping For each untuk memindahkan semua data dari Array arrxs ke arrxss
-line 28 = Menjumlahkan semua data dari tiap array hingga batas arrx2 dan disimpan kedalam sum
-line 30 = Menampilkan nilai dari sum/jumlah data

 */
