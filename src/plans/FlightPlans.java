package plans;

import java.util.ArrayList;

public class FlightPlans {
	private ArrayList<FlightPlan> FlightPlansList;
	
	public void setFlightPlansList(ArrayList<FlightPlan> flightPlansList){
		this.FlightPlansList = flightPlansList;
	}
	
	public ArrayList<FlightPlan> getFlightPlansList(){
		return this.FlightPlansList;
	}
	
	public FlightPlans(ArrayList<FlightPlan> flightPlansList){
		this.FlightPlansList = flightPlansList;
	}

}
