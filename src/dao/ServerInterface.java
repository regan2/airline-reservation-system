package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import airport.Airports;
import flight.Flights;
import plans.FlightPlans;
import plans.Reservation;
import plans.SearchParams;
import utils.QueryFactory;

public class ServerInterface {
	private String ServerLocation = "http://cs509.cs.wpi.edu:8181/CS509.server/ReservationSystem";
	private String TeamName = "TeamG";
	
	public void setURL(String serverLocation){
		this.ServerLocation = serverLocation;
	}
	
	public String getURL(){
		return this.ServerLocation;
	}
	
	public Airports PopulateAirports(){
		URL url;
		HttpURLConnection connection;
		BufferedReader reader;
		String line;
		StringBuffer result = new StringBuffer();
		
		String xmlAirports;
		Airports airports;

		try {
			/**
			 * Create an HTTP connection to the server for a GET 
			 */
			url = new URL(ServerLocation + QueryFactory.getAirports(TeamName));
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("User-Agent", TeamName);

			/**
			 * If response code of SUCCESS read the XML string returned
			 * line by line to build the full return string
			 */
			int responseCode = connection.getResponseCode();
			if (responseCode >= HttpURLConnection.HTTP_OK) {
				InputStream inputStream = connection.getInputStream();
				String encoding = connection.getContentEncoding();
				encoding = (encoding == null ? "UTF-8" : encoding);

				reader = new BufferedReader(new InputStreamReader(inputStream));
				while ((line = reader.readLine()) != null) {
					result.append(line);
				}
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		xmlAirports = result.toString();
		airports = DaoAirport.addAll(xmlAirports);
		return airports;
	}
	
	public Flights GetFlights(SearchParams searchParams){
		return null;
	}
	
	public FlightPlans MakeFlightPlans(SearchParams userParams){
		return null;
	}
	
	public boolean ReserveTicket(Reservation plan){
		return false;
	}
	
	public FlightPlans ToLocal(FlightPlans rawTimePlans){
		return null;
	}
	
	public void FailReserve(){
	
	}
	
	//probably redundant to have this because there is only one variable anyway,
	//but I like to have all classes to have a constructor
	public ServerInterface(String serverLocation){
		this.ServerLocation = serverLocation;
	}
}
