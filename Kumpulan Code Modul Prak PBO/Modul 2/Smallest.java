public class Smallest
{
    public static void main(String arg[])
        {
            int a, b;
        
            Mulai:
            for(a=0; a<2; a++)
            {

            for(b=0; b<3; b++)
            {
                if(b==2)
                    break Mulai;
                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }
}

/*
	for(a=0; a<2; a++) looping pertama  
	for(b=0; b<3; b++) looping kedua
	if(b==2)
	break Mulai; bermakna keluar dari loop for ke-1.

dan hasil outputnya : 
	a=0 ; b=0 pada Program, break akan menghentikan operasi pada statement Mulai
	a=0 ; b=1

*/