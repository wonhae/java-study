package chap07.example.sec7_07_4;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}
		
		public static Vehicle getVehicle() {
			Taxi t = new Taxi();
			return t;
		}
}	
