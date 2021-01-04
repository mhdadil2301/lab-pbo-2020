class EnumExample5{

	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
	SATURDAY}
 
 	public static void main(String args[]){
 		Day day=Day.MONDAY;
 		
 		switch(day){
 			case SUNDAY: System.out.println("sunday");
 			break;
 			case MONDAY: System.out.println("monday");
 			break;
 			default:
 			System.out.println("other day");
 		}
 	}
}
 
/*
Penjelasan code diatas :
code diatas menghasilkan compilasi :
monday 

Terdapat deklarasi variabel day dengan type data Day 
Day day=Day.MONDAY;

Terdapat switch case:
karena diatas telah dideklarasi maka swtich case, maka:
case MONDAY: System.out.println("monday");
 			break;
==>case ini lah yang menajdi hasilnya.
*/