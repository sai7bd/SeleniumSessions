package JavaInterViewQuestions;

public class SwapWithOutThirdVeriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using third variable
		int x = 99;
		int y =10;
//		int temp = x ; 
//		
//		x =y;
//		y = temp ;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		// 1 math 
		
//		x = x+ y ;
//		y = x - y ;
//		x = x -y ;
//		
		// math 2 * operator
		// 2 math 
		
//				x = x * y ;
//				y = x/ y ;
//				x = x /y ;
		
		// 3 math ^ (XOR) operator
		x = x ^ y ;
		y = x ^ y ;
		x = x ^ y ;
	System.out.println(x);
	System.out.println(y);
		
		
		
	}

}
