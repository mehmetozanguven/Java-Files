package Question10;

public class Coin {
	private Face type;
	
	public Coin(){
		
		toss();
		
	}
	public void setType(Face type){
		
		this.type = type;
	
	}
	
	public Face getType(){
		
		return type;
	
	}
	
	public void toss(){
		
		int random = (int)(Math.random() * 5);
		if(random == 1)
			
			setType(Face.HEADS);
		
		else{
			
			setType(Face.TAILS);
			
		}
		
	}
	
	public Boolean isEqualTo(Coin anotherCoin){
		
		if(getType().equals(anotherCoin.getType()))
				
				return true;
		
		else{
			
			return false;
	
		}

	}
	
	public String toString(){
		
		return "Coin face is " + getType();
		
	}
	
}
