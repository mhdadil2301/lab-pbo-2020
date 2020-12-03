Nama : Muhammad Adil
NIM : 1908107010086

=== PENJELASAN CODE PROGRAM ===

Pada program ini terdiri dari 3 Class yaitu :
1.  Class Penumpang
•   Class ini mewakili entitas penumpang bus
•   Satu objek penumpang mewakili satu penumpang
•   Setiap penumpang mempunyai attribut nama, umur, dan status hamil
•   Method Penumpang() merupakan method constructor yang akan memberikan nilai awal kepada attribute.
•   Method getNama(), getUmur(), dan getHamil() adalah method accessor yang mengembalikan nilai yang diminta.

2.  Class Bus
•   Class ini mewakili bus
•   Class ini memiliki attribute berupa objek dari Class Penumpang
•   Attribute penumpangBiasa berisi penumpang biasa (minimal 0, maksimal 4)
•   Attribute penumpangPrioritas berisi penumpang prioritas (minimal 0, maksimal 2)
•   Anda boleh menggunakan Struktur data Array ataupun ArrayList untuk menampung data penumpang.
•   Method getPenumpang….() mengembalikan list penumpang yang diminta.
•   Method getJumlahPenumpang….() mengembalikan jumlah penumpang yang diminta.
•   Method NaikPenumpang() berfungsi untuk menambahkan penumpang ke dalam Bus (jika ada kursi untuk penumpang tsb). 
•   Method ini mengembalikan true jika penumpang berhasil naik dan menambahkan penumpang tsb ke dalam Array penumpang, dan mengembalikan false jika penumpang tidak bias naik.
    Note : ikuti aturan penumpang seperti hasil observasi di atas,
•   Method turunkanPenumpang(nama) menerima parameter nama penumpag. Jika nama penumpang ditemukan, maka hapus penumpang tersebut dari Array penumpang dan kembalikan nilai true. Sebaliknya, kembalikan false.
•   Method  toString()  untuk  mencetak  daftar  nama  Penumpang  Biasa,  Penumpang Prioritas, dan Jumlah semua penumpang.

3.  Class Main
•   Pada method main() dideklarasikan sebuah objek Bus. Pada method ini anda akan mensimulasikan proses naik dan turunnya penumpang dari bus.


=== CARA INSTALISASI PROGRAM ===

>cd Tugas 1 Lab PBO
>dir
Bus.java
Penumpang.java
Main.java
README

=== Compile and Run Program ===
>javac Bus.java
>java Bus

>javac Penumpang.java
>java Penumpang

>javac Main.java
>java Main


=== RUN PROGRAM di BlueJ ===
1. Pertama kita buka aplikasi BlueJ pada laptop/komputer kita.
2. Kemudian KLIK menu PROJECT, lalu New Project. Lalu kita buat nama Projectnya TUGAS 1 LAB PBO atau variasi lainnya.
3. Setelah itu, kita akan membuat class baru. Caranya KLIK New Class, lalu isi nama classnya (Bus,Penumpang, Main) 
   dalam format .java dan type Class.
4. Kemudian buat kode program pada masing-masing class.
5. Compile dan lihat apakah ada error atau tidak. Jika tidak maka lanjut untuk run program.
6. Kemudian kita KLIK pada Class yang kita pilih, misalnya Class Main. Lalu KLIK kanan, 
   dan pilih void menu() lalu KLIK enter.
7. Setelah itu akan muncul hasil output yang sudah kita buat pada kode program tiap classnya.
8. Kemudian kita tinggal pilih saja menu pilihan yang tersedia di output tampilan programnya.
9. isi/tampilkan/hapus data sesuai yang kita inginkan pada menu program yang tersedia.
10. Selesai.