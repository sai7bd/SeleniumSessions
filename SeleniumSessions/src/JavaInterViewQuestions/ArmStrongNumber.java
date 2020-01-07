package JavaInterViewQuestions;

public class ArmStrongNumber {

	public static void isArmStrongNumber(int num){
		int r = 0;
		int cube = 0 ;
		int temp = num ;
		
		while (num > 0) {
			
			r = num%10 ;
			num = num/10;
			cube = cube+(r*r*r);
			}
		
		if (temp == cube) {
			System.out.println("This is an ArmstrongNumber");
			
		}else 
		{
			System.out.println("This is not an ArmstrongNumber");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmStrongNumber(455);

	}

}
