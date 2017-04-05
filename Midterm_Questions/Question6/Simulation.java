package Question6;

import java.util.Scanner;

public class Simulation {
	private Table table;
	private Person personNotTaste;
	private Person personTasteCheese;
	private Scanner keyboard = new Scanner(System.in);
	
	public Simulation(){
		
		table = new Table();
		
		personNotTaste = new Person();
		personNotTaste.setPrefer(Prefer.notBoth);
		
		personTasteCheese = new Person();
		personTasteCheese.setPrefer(Prefer.cheese);
		
		table.addPerson(personTasteCheese, 0);
		table.addPerson(personNotTaste, 1);
	}
	
	public void createPerson(Person newPerson){
		
		if(newPerson.getPrefer() == Prefer.cheese) table.addPerson(newPerson, 0);
		
		else if(newPerson.getPrefer() == Prefer.dessert) table.addPerson(newPerson, 2);
		
	}
	
	public void game(){
		
		
		System.out.println("Do you want to add person. If yes enter 1, no enter 2, to exit enter 3");
		int choose = keyboard.nextInt();
		
		while(true){
		
			if(choose == 1){
				
				System.out.println("enter the person's PID");
				int PID = keyboard.nextInt();
				
				System.out.println("If person taste cheese enter 1, taste dessert enter 2");
				int tasteChoose = keyboard.nextInt();
				
				Person newPerson = new Person();
				newPerson.setPID(PID);
				
				if(tasteChoose == 1) { newPerson.setPrefer(Prefer.cheese); table.addPerson(newPerson, 0); }
				
				if(tasteChoose == 2){ newPerson.setPrefer(Prefer.dessert); table.addPerson(newPerson, 2);}
				
				System.out.println("Do you want another person. If yes enter 1, no enter 2, to exit enter 3");
				choose = keyboard.nextInt();
				
			}
			
			else if(choose == 2){
				
				System.out.println("Do you want to remove any person. If yes enter 1, no enter 2");
				int choose2 = keyboard.nextInt();
				
				if(choose2 == 1){
					
					System.out.println("Enter the PID");
					int PID = keyboard.nextInt();
					
					table.removePerson(PID);
					
				}
				else{
					
					System.out.println("You have " + table.howManyPersonSit() + " person. " +
					table.howManyPersonTasteCheese() + " person has same taste CHEESE" +
							table.howManyPersonTasteDesset() + " person has same taste DESSERT");
					
					System.out.println("All person::");
					table.printTable();
				}
			}
			
			else if(choose == 3) System.exit(0);
		}//end while
		
	}
}
