package CompanyProject;

public class Student {
	String name;
	int age;
	int roll_no;
	String gender;
	
	Student()
	{
		
	}
	
	Student(String name,int age,int roll_no,String gender)
	{
		this.name=name;
		this.age=age;
		this.roll_no=roll_no;
		this.gender=gender;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void showStudentInfo()
	{
		System.out.println("Name:"+name+" Age:"+age+" Roll_No:"+roll_no+" Gender: "+gender);
	}
	
	
}
