package Question3;

public class Simulate {
	private Dice d1;
	private Dice d2;
	private Integer total;
	
	public void setTotal(){
	}
	
	public Integer getTotal(){
		total = d1.getFace() + d2.getFace();
		return total;
	}
	
	public Dice getD1() {
		return d1;
	}
	
	public Dice getD2() {
		return d2;
	}
	
	public Boolean givenNumber(int number) {
		if(getTotal() == number)
			return true;
		else{
			return false;
		}
	}
	
	public void simulate(int number){
		int count = 1;
		while(true){
			if(givenNumber(number)){
				System.out.println(count + " .try the sum of dice's are equally " + number);
				System.out.println("One dice face " + d1.getFace() + " and the other one " + d2.getFace());
				break;
			}
			else{
				d1.setFace();
				d2.setFace();
				count++;
			}
		}
	}
	
	public Simulate(int givenNumber) throws IllegalArgumentException {
		if(givenNumber > 12){
			throw new IllegalArgumentException("Input is invalid");
		}
		d1 = new Dice();
		d2 = new Dice();
		simulate(givenNumber);
	}
	
}
