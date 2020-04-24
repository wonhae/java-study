package chap10.exercise.ex07;

public class NotExistIDException extends Exception {
	public NotExistIDException() {super();}
	public NotExistIDException(String message) {
		super(message);
	}
}
