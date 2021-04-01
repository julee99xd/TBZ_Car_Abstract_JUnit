import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsedCarTest {
	UsedCar uCar2;
	
	@BeforeEach
	void setUp() throws Exception {
		uCar2 = new UsedCar(10000,"Fiat",100000);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetCarPrice() {
		 
		assertTrue(95000 == uCar2.getCarPrice());
	}
}
