public class SumOfArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 5, 6, 9};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}
/*
Program di atas untuk mencari nilai sum pada array
 */