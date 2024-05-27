import java.util.Scanner;

/**
 * Students
 
*/

 class Students {
    int rollno;
    String Name;
    int Marks;


    
}
public class ArrEx1 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Students s1 = new Students();
   s1.rollno=11;
   s1.Name="Subrahmanya";
   s1.Marks=88;

   Students s2 = new Students();
   s2.rollno=12;
   s2.Name="Sujay";
   s2.Marks=87;

   Students s3 = new Students();
   s3.rollno=13;
   s3.Name="Mahesh";
   s3.Marks=86;
   Students student[]= new Students[3];
   student[0]=s1;
   student[1]=s2;
   student[2]=s3;


   for(int i=0;i<student.length;i++){

    System.out.println(student[i].rollno + " "+student[i].Name+" "+student[i].Marks);
   }
   
    }
    
}
