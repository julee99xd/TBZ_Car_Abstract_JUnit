
public class UsedCar extends Car {
	
	private double mileage;
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//Konstruktor: 
	
	public UsedCar(double mileage, String model, double price) {
		super(model, price);
		this.mileage = mileage;
	}

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//Methoden: 
	
	public double getMileage() {
		return mileage;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//Override:
	
	@Override
	public double getCarPrice() {
		double newprice = price;
		
		int reduction = (int) (mileage / 10000);
		
		newprice = price - (price * reduction * 0.05);
		
		if (newprice < 0) {
			return 0;
		}else {
			return newprice;
		}
	}
}
