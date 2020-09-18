import java.util.Scanner;

public class SpeedCalcualtion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Traveling Distance ?");
		double distance = sc.nextDouble();
		System.out.println("Enter Your Traveling Time ?");
		double time = sc.nextDouble();
		double speed = distance/time;
		System.out.println("Your Traveling Speed  =  "+speed);

	}

}
