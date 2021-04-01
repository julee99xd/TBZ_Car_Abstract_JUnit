
public class CrashedCar extends Car {
	
	private int damage;
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public CrashedCar(String model, double price, int damage) {
		super(model, price);
		this.damage = damage;
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public int getDamage() {
		return damage;
	}
		
	
	public void setDamage(int damage) {
		if (damage < 0 || damage > 3) {
			System.out.println("Keine gültige Schadensskala");
		}else {
			this.damage = damage;
		}
	}

	
	@Override
	public double getCarPrice() {
		double newprice = price;
		double reduction;
		
		switch (damage) {
		
		//low
		case 0:
			reduction = 0.1;
		break;
		
		//medium
		case 1:
			reduction = 0.5;
		break;
		
		//high
		case 2:
			reduction = 0.9;
		break;
		
		//total
		default:
			reduction = 1;
		}
		
		newprice = price -(price * reduction);
		return newprice;
	}
		
		
}
