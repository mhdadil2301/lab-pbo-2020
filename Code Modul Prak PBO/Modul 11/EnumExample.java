class EnumExample{
 
    public enum Season { WINTER, SPRING, SUMMER, FALL}
        public static void main(String[] args) {
        for (Season s : Season.values())
        System.out.println(s); 
    }
} 

/*
Penjelasan code diatas :
Enum merupakan tipe data yang mengandung
kumpulan konstan yang tetap. Enum juga dapat dianggap seperti class yang memiliki beberapa nilai
konstan yang tetap. Secara implicit, modifier enum adalah static dan final. Enum secara bawaan
merupakan turunan dari class Enum sehingga Enum tidak bisa extends class yang lain. 

Hasil dari code diatas  adalah :
WINTER
SPRING
SUMMER
FALL

*/
