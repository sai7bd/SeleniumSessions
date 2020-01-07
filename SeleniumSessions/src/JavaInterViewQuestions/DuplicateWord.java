package JavaInterViewQuestions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names [] = {"java", "kaba","lava","jkkava", "kaba"};
//		Set<String> store = new HashSet<String>(); 
//		for(String name: names) {
//			if (store.add(name)== false) {
//			System.out.println(name + " , is duplicate");
//				
//			}
//		}
//		
	// HashMap Example
		
		Map<String,Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name: names) {
			Integer count = storeMap.get(name); 
			if (count == null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
			
		}
	
	Set<Entry<String , Integer>> entrySet = storeMap.entrySet();
	for (Entry<String , Integer> entry: entrySet) {
		if(entry.getValue()>1) {
			System.out.println("Duplicate element is : " + entry.getKey());
		}
	}
	
	}
	
	

}
