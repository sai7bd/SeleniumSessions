import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Saif");
		ar.add("40");
		for (int i =0 ; i<ar.size(); i ++) {
		System.out.println(ar.get(i));
		}
		System.out.println("**************");
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("annhara");
		ar1.add("5");
		ar.addAll(ar1);
		for (int i =0 ; i<ar.size(); i ++) {
			System.out.println(ar.get(i));
			}
		
		System.out.println("**************");
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("annhara");
		ar3.add("5");
		ar3.retainAll(ar1);
		for (int i =0 ; i<ar3.size(); i ++) {
			System.out.println(ar3.get(i));
			}
		
		
		
		
		
		
	}

}
