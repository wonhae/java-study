package chap08.eg.sec8_0505;

public class VehicleEx {
	public static void main(String[] args) {
//		Vehicle vehicle = new Bus();
		Vehicle vehicle = new Taxi();
		
		vehicle.run();
		//vehicle.checkFare();
		
		
		System.out.println(vehicle instanceof Bus); // false
		System.out.println(vehicle instanceof Taxi);  // true
		System.out.println(vehicle instanceof Vehicle);  // true
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		}
		
	}
}
