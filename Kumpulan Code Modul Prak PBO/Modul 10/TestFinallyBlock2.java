public class TestFinallyBlock2{
 
    public static void main(String args[]){

        try{
            int data=25/5;
            System.out.println(data);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
} 

/*
Penjelasan code diatas :
ketika variabel data= 25/0 , pada saat di run menghaasilkan hasil:
java.lang.ArithmeticException: / by zero
finally block is always executed
rest of the code...

ketika variabel data =25/5 , pada saat di run menghasilkam hasil:
5
finally block is always executed
rest of the code...

*/