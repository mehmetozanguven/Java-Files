package Question8;

public class Truck {
	private Route route;
	private Cargo cargo;
	
	public Route getRoute(){ return route; }
	
	public Cargo getCargo(){ return cargo; }
	
	public void setCargo(Cargo cargo){
		
		this.cargo = cargo;
		
	}
	
	public void setRoute(Route route){
		
		this.route = route;
		
	}
	
}
