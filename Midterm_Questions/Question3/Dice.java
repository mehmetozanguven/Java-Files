package Question3;

public class Dice {
	private Integer face;
	
	public Integer getFace(){
		return face;
	}
	
	public void setFace(){
		int random =(int) (Math.random()*6 + 1);
		face = random;
	}
	
	public Dice() {
		setFace();
	}
}
