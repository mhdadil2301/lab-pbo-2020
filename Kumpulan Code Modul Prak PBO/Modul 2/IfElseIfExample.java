public class IfElseIfExample {
    public static void main(String[] args) {
    int marks=65;
    
    if(marks<50){
        System.out.println("fail");
    }
    else if(marks>=50 && marks<60){
        System.out.println("D grade");
    }
    else if(marks>=60 && marks<70){
        System.out.println("C grade");
    }
    else if(marks>=70 && marks<80){
        System.out.println("B grade");
    }
    else if(marks>=80 && marks<90){
        System.out.println("A grade"); 
    }
    else if(marks>=90 && marks<100){
        System.out.println("A+ grade");

    }else{
        System.out.println("Invalid!");

         }
    }
}

/*
marks=65, artinya marks bertipe integer
    jika marks kurang dari 50, maka program akan print Fail.
    jika marks lebih dari atau sama dengan 50 dan lebih kecil dari 60, maka program akan print D grade.
    jika marks lebih dari atau sama dengan 60 dan lebih kecil dari 70, maka program akan print C grade.
    jika marks lebih dari atau sama dengan 70 dan lebih kecil dari 80, maka program akan print B grade.
    jika marks lebih dari atau sama dengan 80 dan lebih kecil dari 90, maka program akan print A grade.
    jika marks lebih dari atau sama dengan 90 dan lebih kecil dari 100, maka program akan print A+ grade.
    dan jika nilai marks tidak ada di antara nilai kondisi yang di tetapkan, maka program akan print Invalid.

*/