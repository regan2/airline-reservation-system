package classes;

public class Flights {
	private Airport DepartureAirport;
	private Date DepartureDate;
	private Flight[] FlightList;
	
	public void setDepartureAirport(Airport departureAirport){
		this.DepartureAirport = departureAirport;
	}
	
	public void setDepartureDate(Date departureDate){
		this.DepartureDate = departureDate;
	}
	
	public void setFlightList(Flight[] flightList){
		this.FlightList = flightList;
	}
	
	
	public Airport getDepartureAirport(){
		return this.DepartureAirport;
	}
	
	public Date getDepartureDate(){
		return this.DepartureDate;
	}
	
	public Flight[] getFlightList(){
		return this.FlightList;
	}
	
	public Flights(Airport departureAirport, Date departureDate, Flight[] flightList){
		this.DepartureAirport = departureAirport;
		this.DepartureDate = departureDate;
		this.FlightList = flightList;
	}
	
}
