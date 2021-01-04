public class CopyArray {
    public static void main(String args[]) {
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
        int[] array2 = new int[3];
        System.arraycopy(array1,0,array2,0,3);
        System.out.print("Array1 : ");
            for (int i=0; i<array1.length; i++)
        System.out.print(array1[i] + " ");
        System.out.println();
        System.out.print("Array2 : ");
            for (int i=0; i<array2.length; i++)
        System.out.print(array2[i] + " ");
    }
}

/* Program copy Array
-line 5 : Mengcopy nilai array1 dan array2 sebanyak 3 kali
-line 7 : Looping panjang array1 sampai batas array
-line 11 : Looping panjang array2 sampai batas array

 */
