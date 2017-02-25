package classes;

public class Reservation {
	private	boolean IsRoundTrip;
	private boolean FirstFlightSelected;
	private FlightPlan OutgoingFlight;
	private FlightPlan ReturningFlight;
	
	public void setIsRoundTrip(boolean isRoundTrip){
		this.IsRoundTrip = isRoundTrip;
	}
	
	public void setFirstFlightSelected(boolean firstFlightSelected){
		this.FirstFlightSelected = firstFlightSelected;
	}
	
	public void setOutgoingFlight(FlightPlan outgoingFlight){
		this.OutgoingFlight = outgoingFlight;
	}
	
	public void setReturningFlight(FlightPlan returningFlight){
		this.ReturningFlight = returningFlight;
	}
	
	
	public boolean getIsRoundTrip(){
		return this.IsRoundTrip;
	}
	
	public boolean getFirstFlightSelected(){
		return this.FirstFlightSelected;
	}
	
	public FlightPlan getOutgoingFlight(){
		return this.OutgoingFlight;
	}
	
	public FlightPlan getReturningFlight(){
		return this.ReturningFlight;
	}
	
	public Reservation(boolean isRoundTrip, boolean firstFlightSelected, FlightPlan outgoingFlight, FlightPlan returningFlight){
		this.IsRoundTrip = isRoundTrip;
		this.FirstFlightSelected = firstFlightSelected;
		this.OutgoingFlight = outgoingFlight;
		this.ReturningFlight = returningFlight;
	}
	
}
