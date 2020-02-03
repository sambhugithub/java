package B;
import java.util.Scanner;
import A.Student;
class Example
{
  public static void main(String[] args)
  {
   int roll;
   String name;
   Scanner obj=new Scanner(System.in);
   System.out.println("enter roll and name");
   roll=obj.nextInt();
   name=obj.nextLine();
   Student obj1=new Student();
   obj1.get_roll(roll);
   obj1.get_name(name);
   System.out.println("roll is:"+obj1.roll());
   System.out.println("name is:"+obj1.name());
  }
}  
  
   