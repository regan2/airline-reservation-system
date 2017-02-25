package classes;

public class Airports {
	private Airport[] AirportList;
	
	public void setAirportList(Airport[] airportList){
		this.AirportList = airportList;
	}
	
	public Airport[] getAirportList(){
		return this.AirportList;
	}
	
	public Airports(Airport[] airportList){
		this.AirportList = airportList;
	}
	
}
