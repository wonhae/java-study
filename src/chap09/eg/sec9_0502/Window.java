package chap09.eg.sec9_0502;

public class Window {
	
	//3개의 필드를 가진 것 뿐
	
	
	Button button1 = new Button();
	Button button2 = new Button();
	
	//field 초기값으로 대입
	Button.OnClickListner listner = new Button.OnClickListner() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	
	Window() {
		//2개 실행
		button1.setOnListner(listner);
		
		button2.setOnListner(new Button.OnClickListner() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다");
			}
		});
	}
	
}
