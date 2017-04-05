package Question8;

public class Route {
	private double route;
	
	public double getRoute(){ return route; }
	
	public void setRoute(double route){
		
		if(route <= 0)
			
			this.route = 0;
		
		else{this.route = route;}
		
	}
	
	public Route(double route){
		
		setRoute(route);
		
	}
}
