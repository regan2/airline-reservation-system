package classes;

//idk which format to use so here's code for both
public class Price {
	private float Money;
	
	public void setMoney(float money){
		this.Money = money;
	}
	
	public float getMoney(){
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
