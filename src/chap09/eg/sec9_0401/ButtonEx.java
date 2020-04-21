package chap09.eg.sec9_0401;

public class ButtonEx {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnclickListner(new CallListner());
		btn.touch();
		
		btn.setOnclickListner(new MessageListner());
		btn.touch();
		
	}
}
