package chap11.example.sec11_0603;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			//Class clazz = Class.forName("chap11.example.sec11_0603.SendAction");
			Class clazz = Class.forName("chap11.example.sec11_0603.RecieveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		//말 속도는 제어가 안되시나봄 ㅋㅋ
		//랩 잘하실것 같지 않아?ㅋㅋ
	}
}
