package flight;

import airport.Airport;
import utils.Price;
import utils.Time;

public class Flight {
	private Flights FlightGroup;
	private int FlightNumber;
	private int PlaneType;
	private int FlightTime;
	private Time DepartureTime;
	private Airport ArrivalAirport;
	private Time ArrivalTime;
	private int FlightLength;
	private int SeatFc;
	private int SeatC;
	private Price PriceFc;
	private Price PriceC;
	
	public void setFlightGroup(Flights flightGroup){
		this.FlightGroup = flightGroup;
	}
	
	public void setFlightNumber(int flightNumber){
		this.FlightNumber = flightNumber;
	}
	
	public void setPlaneType(int planeType){
		this.PlaneType = planeType;
	}
	
	public void setFlightTime(int flightTime){
		this.FlightTime = flightTime;
	}
	
	public void setDepartureTime(Time departureTime){
		this.DepartureTime = departureTime;
	}
	
	public void setArrivalAirport(Airport arrivalAirport){
		this.ArrivalAirport = arrivalAirport;
	}
	
	public void setArrivalTime(Time arrivalTime){
		this.ArrivalTime = arrivalTime;
	}
	
	public void setFlightLength(int flightLength){
		this.FlightLength = flightLength;
	}
	
	public void setSeatFc(int seatFc){
		this.SeatFc = seatFc;
	}
	
	public void setSeatC(int seatC){
		this.SeatC = seatC;
	}
	
	public void setPriceFc(Price priceFc){
		this.PriceFc = priceFc;
	}
	
	public void setPriceC(Price priceC){
		this.PriceC = priceC;
	}
	
	
	public Flights getFlightGroup(){
		return this.FlightGroup;
	}
	
	public int getFlightNumber(int flightNumber){
		return this.FlightNumber;
	}
	
	public int getPlaneType(){
		return this.PlaneType;
	}
	
	public int getFlightTime(){
		return this.FlightTime;
	}
	
	public Time getDepartureTime(){
		return this.DepartureTime;
	}
	
	public Airport getArrivalAirport(){
		return this.ArrivalAirport;
	}
	
	public Time getArrivalTime(){
		return this.ArrivalTime;
	}
	
	public int getFlightLength(){
		return this.FlightLength;
	}
	
	public int getSeatFc(int seatFc){
		return this.SeatFc;
	}
	
	public int getSeatC(int seatC){
		return this.SeatC;
	}
	
	public Price getPriceFc(Price priceFc){
		return this.PriceFc;
	}
	
	public Price getPriceC(){
		return this.PriceC;
	}
	
	//super long constructor we can copy/paste and break down later as needed.
	public Flight(Flights flightGroup, int flightNumber, int planeType, int flightTime, Time departureTime, 
			Airport arrivalAirport, Time arrivalTime, int flightLength, int seatFc, int seatC, Price priceFc,
			Price priceC){
		this.FlightGroup = flightGroup;
		this.FlightNumber = flightNumber;
		this.PlaneType = planeType;
		this.FlightTime = flightTime;
		this.DepartureTime = departureTime;
		this.ArrivalAirport = arrivalAirport;
		this.ArrivalTime = arrivalTime;
		this.FlightLength = flightLength;
		this.SeatFc = seatFc;
		this.SeatC = seatC;
		this.PriceFc = priceFc;
		this.PriceC = priceC;
	}
	
}
