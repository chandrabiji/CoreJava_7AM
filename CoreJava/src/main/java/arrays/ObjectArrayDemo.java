package arrays;

import java.util.Scanner;

class Student
{
	public int sid;
	public String sname;
	public int marks;
	//default constructor
	public Student(){}
	//parameterized constructor
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
		
}

public class ObjectArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Array Size ?");
		int size = sc.nextInt();
		Student[] students = new Student[size];
		Student student = null;
		System.out.println("Enter Student Array Elements ?");
		for(int i=0;i<size;++i)
		{
			System.out.println("Enter Student Id ?");
			int sid = sc.nextInt();
			System.out.println("Enter Student Name ?");
			String sname = sc.next();
			System.out.println("Enter Student Marks ?");
			int marks = sc.nextInt();
			student = new Student(sid,sname,marks);
			students[i]=student;
			
		}
		System.out.println("Student Array Elements are :");
		for(Student s:students)
		{
			System.out.println(s.sid+"\t"+s.sname+"\t"+s.marks);
		}

	}

}
