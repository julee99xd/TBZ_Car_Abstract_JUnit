
public class Starter {

	public static void main(String[] args) {
		
		UsedCar uCar1 = new UsedCar(10000,"Porsche",50000);
        System.out.println(uCar1.getMileage());
        System.out.println(uCar1.getCarPrice());
        
        CrashedCar cCar2 = new CrashedCar("kein Porsche",100000,0);
        System.out.println(cCar2.getDamage());
        System.out.println(cCar2.getCarPrice()); 

	}

}
