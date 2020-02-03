import java.util.Scanner;
class Student
{
  int a,b,c;
  void getdata(int x,int y)
  {
     a=x;
	 b=y;
  }
  int add()
  {
   	c=a+b;
	return c;
	}
}	
	
	
class Add
{
  public static void main(String arg[])
  {
     int a1,a2,res;
	 Scanner obj=new Scanner(System.in);
     System.out.println("enter 1st number:");
	 a1=obj.nextInt();
	 System.out.println("enter 2nd number:");
	 a2=obj.nextInt();
	 Student st=new Student();
	 st.getdata(a1,a2);
	 res=st.add();
	 System.out.println("the addition result is:"+res);
	}
}	
	 
	 
     	 
	
	