import java.util.*;

class StudentDetails
{
	private String name;
	private String course;
	private String rollNo;
	
	
	public StudentDetails(String name  ,String course , String rollNo)
	{
		this.name = name;
		this.course = course;
		this.rollNo = rollNo;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public String getRollNo()
	{
		return rollNo;
	}
	
}


class Main
{
	public static void main(String args[])
	{
		ArrayList<StudentDetails>  obj = new ArrayList<>();
		char name = 'A';
		int roll = 1;
		for(int i = 0 ; i < 10 ; i++)
		{
			obj.add(new StudentDetails(""+name++ , "MCA" , ""+roll++));
		}
		
		for(int j = 0 ; j < 10 ; j++)
		{
			System.out.println(obj.get(j).getName());
			System.out.println(obj.get(j).getCourse());
			System.out.println(obj.get(j).getRollNo());
		}
	}
}
