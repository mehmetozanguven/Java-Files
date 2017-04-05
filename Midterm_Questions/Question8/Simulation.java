package Question8;

import java.util.ArrayList;

public class Simulation {
	
	public double dailyTotalDistanceTraveled(ArrayList<Truck> listTruck){
		
		double totalDistance = 0;
		
		for(Truck eachTruck : listTruck){
			
			if(eachTruck == null)
				
				continue;
			
			else{
				
				totalDistance = totalDistance + eachTruck.getRoute().getRoute();
			
			}
		}
		
		return totalDistance;
		
	}
	
	public double dailyTotalWeightCarried(ArrayList<Truck> listTruck){
		
		double totalWeight = 0;
		
		for(Truck eachTruck : listTruck){
			
			if(eachTruck == null)
				
				continue;
			
			else{
				
				totalWeight = totalWeight + eachTruck.getCargo().getTon();
				
			}
		}
		
		return totalWeight;
	}
	
	public double dailyTotalCharged(ArrayList<Truck> listTruck){
		
		double totalCharged = 0;
		
		for(Truck eachTruck : listTruck){
			
			if(eachTruck == null) continue;
			
			if(eachTruck.getCargo().getTon() >= 1) totalCharged = totalCharged + 200.0;
			
			if(eachTruck.getCargo().getTon() < 1) totalCharged = totalCharged + 100.0;
			
			if(eachTruck.getRoute().getRoute() < 100) totalCharged = totalCharged + 0.0;
			
			if(eachTruck.getRoute().getRoute() >= 100){
				
				int extra = (int)(eachTruck.getRoute().getRoute() / 100);
				
				totalCharged = totalCharged + ((double) extra *100);
				
			}
		}
		
		return totalCharged;
		
	}
	
}
