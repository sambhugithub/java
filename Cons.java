import java.util.Scanner;
class Student
{
  private int roll,id,marks;
  
  Student(int x,int y,int z)
  {
    roll=x;
	id=y;
	marks=z;
  }
 
  void disp()
  {
    System.out.println("roll:"+roll);
    System.out.println("id:"+id);
	System.out.println("marks:"+marks); 

    
  }
}
public class Cons
{
  public static void main(String [] args)
  {
    int roll,id,marks;
    String name,standard;
    Scanner obj=new Scanner(System.in);
	System.out.println("enter roll,id,marks");
	roll=obj.nextInt();
	id=obj.nextInt();
	marks=obj.nextInt();
	Student s1=new Student(roll,id,marks);
	s1.disp();
  }
}  