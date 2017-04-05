package Question8;

public class Cargo {
	private double ton;
	
	public double getTon(){ return ton; }
	
	public void setTon(double ton){
		
		this.ton = ton;
		
	}
	
	public Cargo(double ton){
		
		setTon(ton);
		
	}
}
