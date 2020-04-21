package chap08.eg.sec8_0504;
//import 하면 안됨 
public class Driver {
	public void drive(Vehicle vehicle) {
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
