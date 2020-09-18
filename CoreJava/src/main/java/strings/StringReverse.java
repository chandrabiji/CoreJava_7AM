package strings;

import java.util.Scanner;

public class StringReverse {

	public String revers(String input) {
		String reverse = "";
		for (int i = input.length() - 1; i >= 0; --i) {
			reverse += input.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		StringReverse obj = new StringReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ?");
		String input = sc.next();
		System.out.println("Given String : " + input);
		String reverse = obj.revers(input);
		System.out.println("Reverse String : " + reverse);
		
		if(input.equals(reverse)){
			System.out.println("Given String is palindrom");
		}else{
			System.out.println("Given String is Not a Palindrom");
		}

	}

}
