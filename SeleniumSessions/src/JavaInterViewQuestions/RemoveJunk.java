package JavaInterViewQuestions;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String JunkRemove= "%^(**_))_Saif";
			
			// RegularExpression
			
			
			JunkRemove= JunkRemove.replaceAll("[^a-zA-Z0-9]", "");
			
			System.out.println(JunkRemove);
	
	
	}

}
