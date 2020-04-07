package chap06.lecture.constructor;

public class Person {
	String name;
	int age;
	
// 생성자로 객체를 만들 때	
	Person(String name, int a) {
		this.name = name; //자기 자신이라는 키워드  this //설계도에 작성된 this 는 아직 생성되지 않았지만 문법적으로 쓸 수있다. // this 가 어떤건지는 나중에 알 수 있다. 
		this.age = a;
		
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

