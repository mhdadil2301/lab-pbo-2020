public class Main {
 
    public static void main(String[] args) {
        //Membuat map Buku
        Map<Integer, Buku> map=new HashMap<Integer, Buku>();
        
        //Membuat objek Buku
        Buku b1=new Buku(101,"Design Patterns: Elements of Reusable ObjectOriented Software","Erich Gamma","Addison-Wesley Professional",8); 
         Buku b2=new Buku(102,"Problem Frames: Analysing & Structuring Software Development Problems","Michael Jackson","Addison-Wesley Professional",4);
        Buku b3=new Buku(103,"Software Architecture in Practice","Len Bass","Addison-Wesley Professional",6);

        //Menambahkan Buku ke map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        //Proses Traversing map
        for(Map.Entry<Integer, Buku> entry:map.entrySet()){
            int key=entry.getKey();
            Buku b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.nama+" "+b.pengarang+" "+b.publisher+" "+b.jumlah);
        }
    }
}

/*
Penjelasan code diatas :
code diatas menghasilkan compilasi error:
Main.java:5: error: cannot find symbol
               Map<Integer, Buku> map=new HashMap<Integer, Buku>();
               ^
symbol:   class Map
location: class Main
Main.java:5: error: cannot find symbol
               Map<Integer, Buku> map=new HashMap<Integer, Buku>();
                                          ^
symbol:   class HashMap
location: class Main
Main.java:18: error: package Map does not exist
               for(Map.Entry<Integer, Buku> entry:map.entrySet()){
                      ^
3 errors
*/