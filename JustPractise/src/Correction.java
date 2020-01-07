import java.util.ArrayList;
import java.util.Iterator;

public class Correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empoyee e1 = new Empoyee("Saif",40,"IT");
		Empoyee e2 = new Empoyee("Kala",20,"Act");
		Empoyee e3 = new Empoyee("Lala",30,"Admin");
		
		ArrayList<Empoyee> ar  = new ArrayList<Empoyee>();
		
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Iterator<Empoyee> it = ar.iterator();
		
		while(it.hasNext()) {
			Empoyee emp = it.next();
			System.out.println("Name : " + emp.Name + " Age : " + emp.Age + " Dept : " + emp.Dept );
		}
	}

	
}
