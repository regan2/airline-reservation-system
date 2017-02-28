package utils;

public class DateTime {
	private Date date;
	private Time time;
	
	public void setDate(Date inDate){
		this.date = inDate;
	}
	
	public void setTime(Time inTime){
		this.time = inTime;
	}
	
	
	public Date getDate(){
		return this.date;
	}
	
	public Time getTime(){
		return this.time;
	}
	
	
	public DateTime(Date inDate, Time inTime){
		this.date = inDate;
		this.time = inTime;
	}
}
