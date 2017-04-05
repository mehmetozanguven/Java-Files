package Question8;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
	private Scanner keyboard = new Scanner(System.in);
	private ArrayList<Truck> listTruck;
	private Simulation simulation;
	public Company(){
		
		listTruck = new ArrayList<Truck>();
		
		simulation = new Simulation();
		
	}
	
	public ArrayList<Truck> getListTruck(){ return listTruck; }
	
	public Boolean isThereAvailableTruck(ArrayList<Truck> listTruck){
		
		if(listTruck.size() > 9)
			
			return false;
		
		else{ return true; }
		
	}
	
	public void game(){
		
		while(true){
			int general = 0;
			if(isThereAvailableTruck(listTruck)){
				
				Truck newOne = new Truck();
				listTruck.add(newOne);
					
				System.out.println("Enter the cargo weight");
				double weight = keyboard.nextDouble();
				Cargo newCargo = new Cargo(weight);
					
				System.out.println("Enter the route");
				double route= keyboard.nextDouble();
				Route newRoute = new Route(route);
					
				newOne.setCargo(newCargo);
				newOne.setRoute(newRoute);
					
				System.out.println("If you do not want to add any another cargo enter 0, or not enter 1");
				general = keyboard.nextInt();
					
				}
				
				
			if(general == 0){
				
				break;
			
			}
			
			if(!isThereAvailableTruck(listTruck)){
				
				System.out.println("you can not more add cargo, there are no available trucks");
				
				break;
			}
		}//end while
	}//end method
	
	public void dailyCalculation(){
		
		double totalCharged = simulation.dailyTotalCharged(listTruck);
		
		double totalCarried = simulation.dailyTotalWeightCarried(listTruck);
		
		double totalRoute = simulation.dailyTotalDistanceTraveled(listTruck);
		
		System.out.println("Totally all " + listTruck.size() + " trucks have carried " + totalCarried +
				" and have routed " + totalRoute + " and price is " + totalCharged);
		
	}
}
