package chap08.exercise.ex05;

public class ActionExample {
	public static void main(String[] args) {
		
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니당");
			}
		};
		
		action.work();
	}
}
