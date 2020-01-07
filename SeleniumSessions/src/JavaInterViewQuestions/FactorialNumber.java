package JavaInterViewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(4));
		
	}
	
	public static int factorial(int num ) {
		
		if (num ==0)
			return  1  ;
		else
			
		return num = num* factorial(num -1);
		
	}
}
