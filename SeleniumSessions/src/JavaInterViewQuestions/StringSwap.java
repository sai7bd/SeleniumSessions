package JavaInterViewQuestions;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Lala";
		String b = "Baba" ;
		System.out.println("**** Before swaping ****");
		System.out.println("a is ::" + a);
        System.out.println("b is ::" +b);
        
		a = a+ b ;
		b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        
        System.out.println("**** After swaping ****");
		System.out.println("a is ::" + a);
        System.out.println("b is ::" +b);
	}

}
