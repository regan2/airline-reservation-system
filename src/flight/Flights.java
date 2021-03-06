package flight;

import java.util.ArrayList;

import airport.Airport;
import utils.Date;

public class Flights {
	private Airport DepartureAirport;
	private Date DepartureDate;
	private ArrayList<Flight> FlightList;
	
	public void setDepartureAirport(Airport departureAirport){
		this.DepartureAirport = departureAirport;
	}
	
	public void setDepartureDate(Date departureDate){
		this.DepartureDate = departureDate;
	}
	
	public void setFlightList(ArrayList<Flight> flightList){
		this.FlightList = flightList;
	}
	
	
	public Airport getDepartureAirport(){
		return this.DepartureAirport;
	}
	
	public Date getDepartureDate(){
		return this.DepartureDate;
	}
	
	public ArrayList<Flight> getFlightList(){
		return this.FlightList;
	}
	
	public Flights(Airport departureAirport, Date departureDate, ArrayList<Flight> flightList){
		this.DepartureAirport = departureAirport;
		this.DepartureDate = departureDate;
		this.FlightList = flightList;
	}
	
}
