class Student
{
  int roll,marks,id;
  String name;
  void get_detail(int x,int y,int z)
  {
     roll=x;
	 marks=y;
	 id=z;
	 System.out.println("roll:"+roll);
	 System.out.println("marks:"+marks);
     System.out.println("id:"+id);
  }
   void get_detail(String n)
   {
     name=n;
     System.out.println("name:"+name);
  }
}
public class Overload
{
  public static void main(String[] args)
  {
    Student s1=new Student();
    s1.get_detail("sambhu");
    s1.get_detail(1,90,103);
   }
}   
