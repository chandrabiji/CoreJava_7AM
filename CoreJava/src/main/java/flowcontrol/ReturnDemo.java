package flowcontrol;

public class ReturnDemo {
	//instance method
	public int add(int i, int j)
	{
		return i+j;
	}

	public static void main(String[] args) {
		ReturnDemo obj = new ReturnDemo();//instance or object
		System.out.println(obj.add(10, 5));

	}

}
