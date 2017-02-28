package utils;

//idk which format to use so here's code for both
public class Price {
	private double Money;
	
	public void setMoney(double money){
		this.Money = money;
	}
	
	public double getMoney(){
		return this.Money;
	}
	
	public Price(float money){
		this.Money = money;
	}
	
	/*
	private int Dollars;
	private int Cents;
	
	public void setDollars(int dollars){
		this.Dollars = dollars;
	}
	
	public void setCents(int cents){
		this.Cents = cents;
	}
	
	
	public int getDollars(){
		return this.Dollars;
	}
	
	public int getCents(){
		return this.Cents;
	}
	
	public Price(int dollars, int cents){
		this.Dollars = dollars;
		this.Cents = cents;
	}
	*/
}
