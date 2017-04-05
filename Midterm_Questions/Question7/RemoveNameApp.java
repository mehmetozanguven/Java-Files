package Question7;



import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNameApp {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		RemoveName r1 = new RemoveName();
		System.out.println("Enter character");
		String character = keyboard.nextLine();
		
		r1.removeElementHavingCharacter(character);
		
		
	}
}
