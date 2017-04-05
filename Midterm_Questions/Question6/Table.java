package Question6;

import java.util.ArrayList;

public class Table {
	private ArrayList<Person> listPerson;
	
	public Table(){
		
		listPerson = new ArrayList<Person>(10);
		
	}
	
	public ArrayList<Person> getListPerson(){ return listPerson; }
	
	public int howManyPersonSit(){
		
		return listPerson.size();
		
	}
	
	public int howManyPersonTasteCheese(){
		
		int howMany = 0;
		
		for(Person eachPerson: listPerson){
			
			if(eachPerson == null) continue;
			
			else{
				
				if(eachPerson.getPrefer() == Prefer.cheese) howMany++;
				
			}
		}
		
		return howMany;
	}
	
	public int howManyPersonTasteDesset(){
		
		int howMany = 0;
		
		for(Person eachPerson: listPerson){
			
			if(eachPerson == null) continue;
			
			else{
				
				if(eachPerson.getPrefer() == Prefer.dessert) howMany++;
				
			}
		}
		
		return howMany;
	}
	
	public void addPerson(Person person, int index){
		
		if(person.getPrefer() == Prefer.dessert){
			
			int indexNotBoth = findNotBothPersonIndex();
			
			listPerson.add(indexNotBoth + 1, person);
			
		}
		else{
		
			listPerson.add(index, person);
		
		}
	}
	
	public void removePerson(int PID){
		
		for(Person eachPerson : listPerson){
			
			if(eachPerson.getPID() == PID)
				
				listPerson.remove(eachPerson);
			
		}
		
	}
	
	public int findNotBothPersonIndex(){
		
		int personNotBothIndex = 0;
		
		for(Person eachPerson : listPerson){
									
			if(eachPerson.getPrefer() == Prefer.notBoth){
				
				personNotBothIndex = listPerson.indexOf(eachPerson);
				break;
				
			}
			
		}
		
		return personNotBothIndex;
		
	}
	
	public void printTable(){
		
		for(Person eachPerson : listPerson){
			
			System.out.println(eachPerson.toString());
			
		}
		
	}
}
