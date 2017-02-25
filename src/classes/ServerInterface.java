package classes;

public class ServerInterface {
	private String URL;
	
	public void setURL(String url){
		this.URL = url;
	}
	
	public String getURL(){
		return this.URL;
	}
	
	public Airports[] PopulateAirports(){
		return null;
	}
	
	public FlightPlans[] PopulateFlights(SearchParams searchParams){
		return null;
	}
	
	public boolean ReserveTicket(Reservation reservation){
		return false;
	}
	
	public DateTime toLocal(DateTime rawDT){
		return null;
	}
	
	public void FailReserve(){
	
	}
	
	//probably redundant to have this because there is only one variable anyway,
	//but I like to have all classes to have a constructor
	public ServerInterface(String url){
		this.URL = url;
	}
}
