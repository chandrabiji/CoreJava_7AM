package flowcontrol;

import java.util.Scanner;
/**
 * 
 * @author chandra
 *
 */

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice  ?");
		
	/*	int choice = sc.nextInt();  multi line comment
		switch(choice)
		{
		case 1:System.out.println("One");
		      // break;  single line comment
		case 2:System.out.println("Two");
		       //break;
		case 3:System.out.println("Three");
		       break;
		default:System.out.println("Please select Your choice range 1 - 3 only");       
		}*/
	/*	String choice = sc.next();
		switch(choice)
		{
		case "cricket":System.out.println("12 players required");
		               break;
		case "chess": System.out.println("2 Players required");
		               break;
		default:System.out.println("Please select cricket or chess only");               
		}*/
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'a':System.out.println("Apple");
		       //  break;
		case 'b':System.out.println("Bat");
		         break;
		default:System.out.println("Please select Your choice range a - b only");         
		}

	}

}
