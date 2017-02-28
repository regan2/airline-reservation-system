package utils;

public class Date {
	private int Day, Month, Year;
	
	public void setDay(int day){
		this.Day = day;
	}
	
	public void setMonth(int month){
		this.Month = month;
	}
	
	public void setYear(int year){
		this.Year = year;
	}
	
	
	public int getDay(){
		return this.Day;
	}
	
	public int getMonth(){
		return this.Month;
	}
	
	public int getYear(){
		return this.Year;
	}
	
	public Date(int day, int month, int year){
		this.Day = day;
		this.Month = month;
		this.Year = year;
	}
}
