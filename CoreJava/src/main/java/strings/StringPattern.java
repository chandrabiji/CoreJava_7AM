package strings;

import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Input String ?");
		String input = sc.next();
		for(int i=0;i<=input.length()-1;++i)
		{
			for(int j=0;j<=i;++j){
				System.out.print(input.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
