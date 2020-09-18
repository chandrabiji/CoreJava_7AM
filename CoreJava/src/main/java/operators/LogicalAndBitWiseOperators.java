package operators;

public class LogicalAndBitWiseOperators {

	public static void main(String[] args) {
		int a = 10,b=20,c=30;
		//Logical Operators(&&)
		System.out.println((a<b)&&(b<c));
		//Bitwise Operators(&)
		System.out.println((a>b)&(b<c));
		//Logical Operator(||)
		System.out.println((a<b)||(b<c));
		//Bitwise Operators(|)
		System.out.println((a<b)|(b<c));
	}

}
