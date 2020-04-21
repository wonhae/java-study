package chap09.eg.sec9_0502;

public class Button {
	OnClickListner listner;

	 void setOnListner(OnClickListner listner) {
		this.listner = listner;
	}
	 void touch() {
		 listner.onClick();
	 }
	 
	 interface OnClickListner {
		 void onClick();
	 }
	
}
