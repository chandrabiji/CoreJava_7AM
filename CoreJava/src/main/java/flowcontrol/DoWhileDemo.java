package flowcontrol;

public class DoWhileDemo {

	public static void main(String[] args) {
		int i=1,sum=0;
		do
		{
			System.out.println(i);
			sum +=i;//sum = sum+i;
			++i;
		}while(i<=10);
		System.out.println("Sum = "+sum);

	}

}
