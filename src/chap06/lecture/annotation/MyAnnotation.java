package chap06.lecture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)

@Retention(RetentionPolicy.RUNTIME)//언제까지 유지?

public @interface MyAnnotation {
	//method 처럼 element 작성  -> 어노테이션 사용시 값을 꼭 넣어줘야 
	String value() default "python";  //default 쓰면 쓸 때, 값 안넣어줘도 컴파일 에러 안난다 
	int number();
}
