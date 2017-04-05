package Question10;

import java.util.ArrayList;

public class Simulation {
	private Coin c1, c2, c3;
	private ArrayList<Coin> listCoin;
	private int count;
	
	public Simulation(){
		
		listCoin = new ArrayList<Coin>();
		
		c1 = new Coin();
		c2 = new Coin();
		c3 = new Coin();
		
		addCoinToList(c1);
		addCoinToList(c2);
		addCoinToList(c3);
		
		count = 3;
	}
	
	public void addCoinToList(Coin newCoin){
		
		System.out.println(newCoin.getType() + " is added.");
		
		listCoin.add(newCoin);
	
	}
	
	public Boolean isLastThreeEqual(){
		
		boolean isCorrect = false;
		int i = listCoin.size();
			
			if( (listCoin.get(i - 1).isEqualTo(listCoin.get(i - 2) ) ) && ( listCoin.get(i - 1).isEqualTo(listCoin.get(i - 3) ) ) ){
				
				isCorrect = true;
				
			}
		
		
		return isCorrect;
		
	}
	
	public void game(){
		
		while(true){
			
			if(isLastThreeEqual()){
				
				System.out.println(count + ". try, last three equals");
				
				break;
				
			}else{
				
				Coin newCoin = new Coin();
				addCoinToList(newCoin);
				
				count++;
				
			}
		}
	}
	
}
