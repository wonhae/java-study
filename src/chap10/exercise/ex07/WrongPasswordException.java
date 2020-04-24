package chap10.exercise.ex07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {super();}
	public WrongPasswordException(String message) {
		super(message);
	}
}
