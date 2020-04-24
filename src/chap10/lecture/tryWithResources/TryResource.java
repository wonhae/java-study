package chap10.lecture.tryWithResources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {
	void method1() {

		FileReader fr = null;

		try {
			fr = new FileReader("src/myjava/Hello.java");
			// 읽는 작업을 함

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	// java 8 이후에 
	void method2() {


		try ( //변수 선언과 생성 값할당 동시에 함
				FileReader fr = new FileReader("src/myjava/Hello.java");
				FileReader fr2 = new FileReader("src/myjava/Hello2.java"); ) {			
			// 읽는 작업을 함

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
