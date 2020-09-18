class Parent
{
	Parent()
	{
		this(10);
		System.out.println("Parent Default Constructor");
	}
	Parent(int i)
	{
		System.out.println("Parent Parameterized Constructor");
	}
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Child Default Constructor");
	}
	Child(int i)
	{
		this();
		System.out.println("Child Parameterized Constructor");
	}
}
public class Test {

	public static void main(String[] args) {
		Child c = new Child(10);

	}

}
