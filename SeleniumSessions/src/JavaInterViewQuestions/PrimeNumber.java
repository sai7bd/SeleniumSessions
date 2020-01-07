package JavaInterViewQuestions ;

public class PrimeNumber {

	public static  boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false ;	
		}
		
		for (int i = 2; i<num; i ++)
		{
			if (num % i == 0 ) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void getPrimeNumber(int num) {
		System.out.println("Prime number out of : " + num);
		for (int i = 2; i<num; i ++)
		{
			if (isPrimeNumber(i) ) {
				System.out.print("Prime number : " + i);
				System.out.println(" ");
			}
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getPrimeNumber(7);
		
	}

}
