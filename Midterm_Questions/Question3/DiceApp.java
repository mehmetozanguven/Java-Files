package Question3;

public class DiceApp {
	public static void main (String[] args){
		try{
			Simulate s1 = new Simulate(5);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			
		}
		
		Simulate s1 = new Simulate(15);
	}
}
