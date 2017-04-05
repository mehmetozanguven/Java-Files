package Question7;

import java.util.ArrayList;

public class RemoveName {
	private ArrayList<String> listName;
	
	public RemoveName(){
		
		listName = new ArrayList<String>();
		listName.add("ekrem");
		listName.add("ozan");
		listName.add("ceren");
		listName.add("kamil");
	
	}
	
	public void removeElementHavingCharacter(String character){
		ArrayList<String> copyList = new ArrayList<String>(listName);
		
		for(String eachName : copyList){
			
			if(eachName.indexOf(character, 0) != -1){
				
				System.out.println(eachName + " has having character " + character + " and will be removed");
				listName.remove(eachName);
				
			}
		}
	}
	
	
}
