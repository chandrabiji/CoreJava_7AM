
public class MethodTypes {
	//Instance Methods
	public void greet()
	{
		System.out.println("Welcome to Java");
	}

	public int add(int i,int j)
	{
		return i+j;
	}
	//Static Method
	public static void m1()
	{
		System.out.println("From Static Method m1");
	}
	//final Method
	public final void m2()
	{
		System.out.println("From final Method m2");
	}
	//synchronized Method
	public synchronized void m3()
	{
		System.out.println("From synchronized method m3");
	}
	//Var-args Method
	public void marks(int... i){
		System.out.println("Var-args");
	}
	//abstract Method
	//public abstract void m4();
	
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();//instance or object
		obj.greet();
		System.out.println(obj.add(10, 5));
		m1();
		obj.m2();
		obj.m3();
		obj.marks();
		obj.marks(10);
		obj.marks(10,20);
		obj.marks(10,20,30);

	}

}
