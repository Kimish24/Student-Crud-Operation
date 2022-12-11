package CompanyProject;
import java.util.*;


public class TestStudent {
	
	static int op,op2,oo,m;
	
	
	static List<Student> students=new ArrayList();
	
	public static void addStudents()
	{
	  Scanner sc=new Scanner(System.in);
	  Scanner sc1=new Scanner(System.in);
	  System.out.println("Enter your name");
	  String n=sc1.nextLine();
	  System.out.println("Enter your age");
	  int a=sc.nextInt();
	  System.out.println("Enter your roll_no");
	  int r=sc.nextInt();
	  System.out.println("Enter your gender");
	  String g=sc1.nextLine();
	  
	  Student s2=new Student(n,a,r,g);
	  students.add(s2);
	  System.out.println("============================RESULT=======================");
	  s2.showStudentInfo();
	  System.out.println("Students added Successfully...");
	  System.out.println("=========================================================");
	}
	
	public static void searchStudents()
	{
		int count=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter RollNumber:");
		int rolln=ob.nextInt();
		for(Student k:students)
		{
		if(rolln==k.getRoll_no())
		{
			System.out.println("============================RESULT=======================");
			k.showStudentInfo();
			  System.out.println("Students searched Successfully...");
			System.out.println("=========================================================");
			count++;
			break;
		}
		
		}
		if(count==0)
		{
			System.out.println("============================RESULT=======================");
			System.out.println("Invalid Roll Number");
			System.out.println("=========================================================");
		}
		
	}
	
	public static void deleteStudents()
	{
		int count=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter RollNumber:");
		int rolln=ob.nextInt();
		for(Student k:students)
		{
		if(rolln==k.getRoll_no())
		{
			System.out.println("============================RESULT=======================");
			k.showStudentInfo();
		
			students.remove(k);
			count++;
			
			System.out.println("student deleted successfully");
			System.out.println("=========================================================");
			break;
		}
		
		}
		if(count==0)
		{
			System.out.println("============================RESULT=======================");
			System.out.println("Invalid Roll Number");
			System.out.println("=========================================================");
		}	
	}
	
	public static void updateStudents()
	{
		int count=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("You can update only age by roll number.!!");
		System.out.println("Enter RollNumber:");
		int rolln=ob.nextInt();
		for(Student k:students)
		{
		if(rolln==k.getRoll_no())
		{
			
			System.out.println("Enter new age:");
			int new_age=ob.nextInt();
			k.setAge(new_age);
			count++;
			System.out.println("============================RESULT=======================");
			k.showStudentInfo();
			System.out.println("update Age successfully");
			System.out.println("=========================================================");
			break;
		}
		
		}
		if(count==0)
		{
			System.out.println("============================RESULT=======================");
			System.out.println("Invalid Roll Number");
			System.out.println("=========================================================");
		}	
				
    }
		
	

	
	public static void availableStudents()
	{
		System.out.println("============================RESULT=======================");
		for(Student k:students)
		{
			
			k.showStudentInfo();
			
		}
		System.out.println("=========================================================");
	}
	
	public static void no_of_Students()
	{
		int count=0;

		for(Student k:students)
		{
			count++;
		}
		System.out.println("============================RESULT=======================");
		System.out.println("total student is: "+count);
		System.out.println("=========================================================");
	}
	
	
	public static void main(String args[])
	{
	
		Student s1=new Student("Prshant",23,05,"Male");
		students.add(s1);
		
		while(true)
		{
			 Scanner ss=new Scanner(System.in);
		
		System.out.println("Press the Number key of your choice:\n"+"1:Add Students\n"+
	    "2:Search Students\n"+"3:Delete Student\n"+"4:Update Student\n"+
		"5:Available Students\n"+"6:Number of Students\n"+"7: Exit\n");
		 System.out.print("Enter here: ");
		  int u=ss.nextInt();
		switch(u)
		 { 
		 
		  case 1:addStudents();break;
		  
		  case 2: searchStudents();break;
		  
		  case 3:deleteStudents();break;
		  
		  case 4: updateStudents();break;
		  
		  case 5: availableStudents();break;
		  
		  case 6: no_of_Students();break;
		  
		  case 7:
			  System.out.println("============================RESULT=======================");
				
			  System.out.println("Thank You");
			  System.out.println("=========================================================");
		  		  System.exit(0);break;
		  
		  default: 
			  System.out.println("============================RESULT=======================");
				
			  System.out.println("Invalid Choice:"); 
			  System.out.println("=========================================================");
			  break;
		 
	

		  }
		  
		}
		
		}		
	
}
	
	



