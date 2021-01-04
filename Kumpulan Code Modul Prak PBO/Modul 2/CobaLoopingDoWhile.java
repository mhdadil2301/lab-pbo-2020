public class CobaLoopingDoWhile{
	public static void main(String arg[]){
		int i=0;
        do{
            int j=0;
			while (j<i+1){
			    System.out.print('*');
			    j++;
			}
			System.out.println();
			i++;

        } while (i<10);
	}
}


/* 
-Operator do untuk melakukan pengulangan dengan jumlah yang tidak ditentukan.

-while (j<i+1)
    melakukan looping pada nilai j sampai batas yang ditentukan oleh nilai i, 
    yaitu while (i<10) atau kurang dari 11.

Contoh outputnya : 
*
**
***
****
*****
******
*******
********
*********
**********

*/