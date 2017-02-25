package classes;

public class FlightPlans {
	private FlightPlan[] FlightPlansList;
	
	public void setFlightPlansList(FlightPlan[] flightPlansList){
		this.FlightPlansList = flightPlansList;
	}
	
	public FlightPlan[] getFlightPlansList(){
		return this.FlightPlansList;
	}
	
	public FlightPlans(FlightPlan[] flightPlansList){
		this.FlightPlansList = flightPlansList;
	}

}
