public class CopyArray3 {
    public static void main(String args[]) {
        String str1 = "Informatika Universitas Syiah Kuala";
        System.out.println(str1.startsWith("Inf"));
        System.out.println(str1.endsWith("kuala"));
        System.out.println(str1.startsWith("Inf",1));
        System.out.println(str1.startsWith("Inf",2));
        System.out.println(str1.startsWith("Inf",3));
    }
}
/* Program copy Array
-line 3 : input data str1
-line 4 : Karena diawali dengan "inf" maka true
-line 5 : Karena diakhiri dengan "Kuala (K kapital)" maka false
-line 6 : Karena diawali dengan "nfo" maka false
-line 7 : Karena diawali dengan "for" maka false 
-line 8 : Karena diawali dengan "orm" maka false
 */
