package Question6;

public class Person {
	private int PID;
	private Prefer prefer;
	
	public int getPID(){ return PID; }
	
	public Prefer getPrefer(){ return prefer; }
	
	public void setPID(int PID){
		
		this.PID = PID;
		
	}

	public void setPrefer(Prefer prefer){
		
		this.prefer = prefer;
		
	}
	
	public String toString(){
		
		return "Person PID = " + getPID() + " and his prefer = " + getPrefer();
		
	}


}

