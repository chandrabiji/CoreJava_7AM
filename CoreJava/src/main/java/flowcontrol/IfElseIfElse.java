package flowcontrol;

public class IfElseIfElse {

	public static void main(String[] args) {
		int a = 250,b=30,c=250;
		if(a>b&a>c)
		{
			System.out.println("A value is big");
		}else if(b>a&b>c)
		{
			System.out.println("B value is big");
		}else if(c>a&c>b){
			System.out.println("C value is big");
		}else{
			System.out.println("Any two or three values are equals");
		}

	}

}
