package airport;

import java.util.ArrayList;

public class Airports {
	private ArrayList<Airport> AirportList;
	
	public void setAirportList(ArrayList<Airport> airportList){
		this.AirportList = airportList;
	}
	
	public ArrayList<Airport> getAirportList(){
		return this.AirportList;
	}
	
	public Airports(ArrayList<Airport> airportList){
		this.AirportList = airportList;
	}
	
}
