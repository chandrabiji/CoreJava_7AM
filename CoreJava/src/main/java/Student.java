
public class Student {
	
	//instance variable
	public int sid;
	public String sname;
	public int marks;
	
	
   //Parameterized Constructor
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	
	public void grade()
	{
		if(marks>=90){
			System.out.println("Mr . "+sname+" Your Grade : A");
		}else{
			System.out.println("Mr . "+sname+" Your Grade : B");
		}
	}


	public static void main(String[] args) {
		Student s1 = new Student(100,"abc",90);
		s1.grade();

	}

}
