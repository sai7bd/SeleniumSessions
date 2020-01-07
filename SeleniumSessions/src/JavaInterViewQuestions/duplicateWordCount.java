package JavaInterViewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCount("Saif,love,jhumur,love,annhara,love,arham");
	}

	
	public static void duplicateCount(String Inputstring) {
		String Words[] = Inputstring.split(",");
		Map<String, Integer> WordCounts = new HashMap<String, Integer>();
		
		for (String word: Words) {
			
			if (WordCounts.containsKey(word)){
				WordCounts.put(word, WordCounts.get(word)+1);
			}else
			{
				WordCounts.put(word ,1);
			}
			
		}
		
		Set<String> wordInString = WordCounts.keySet();
		
		for (String word:wordInString) {
			if (WordCounts.get(word)>1) {
				System.out.println(word +  ": " + WordCounts.get(word));
			}
			
		}
		
		
		
	}
}
