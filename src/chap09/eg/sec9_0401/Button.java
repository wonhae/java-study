package chap09.eg.sec9_0401;

public class Button {
	OnclickListner listner;
	
	void setOnclickListner(OnclickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
	
	interface OnclickListner {
		void onClick();
	}
}
