import java.util.Scanner;
class Student
{
   int roll,marks,id;
   void get_roll(int x)
   {
     roll=x;
   }
    void get_marks(int y)
    {
      marks=y;
    }
    void get_id(int z)
    {
      id=z;
    }
}
 class Student_details extends Student
{
  void disp()
  {
    System.out.println("roll:"+roll);
	System.out.println("marks:"+marks);
    System.out.println("id:"+id);
  }
}
  
public class Inharitance
{
  public static void main(String [] args)
  {
    int roll,marks,id;
    Scanner obj=new Scanner(System.in);
	System.out.println("enter roll marks and id");
	roll=obj.nextInt();
	marks=obj.nextInt();
	id=obj.nextInt();
	Student_details obj1=new Student_details();
	obj1.get_roll(roll);
	obj1.get_marks(marks);
	obj1.get_id(id);
	obj1.disp();
  }
}  
	
	
    
      