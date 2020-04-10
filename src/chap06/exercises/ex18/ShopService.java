package chap06.exercises.ex18;

public class ShopService {
	static ShopService shopService = new ShopService();

	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		
		return shopService;
	}
	
}
