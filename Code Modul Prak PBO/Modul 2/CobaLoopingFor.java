public class CobaLoopingFor
{
    public static void main(String arg[])
    {
        for (int i=0; i<10; i++)
        {
            for (int j=0; j<i+1; j++)
                System.out.print('*');
            System.out.println();
        }
    }
} 

/* 
for (int i=0; i<10; i++) untuk looping yang pertama
for (int j=0; j<i+1; j++) untuk looping yang kedua atau looping didalam looping, akan menampilkan (*)
nilai j sampai batas nilai j terpenuhi.

contoh outputnya :
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