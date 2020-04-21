package chap09.z;

public class Z {
	Object method(final int bM) {
		final int bY = 2020;
		
		class Local {
			int localY = bY;
			int localM = bM;
		}
		Local s = new Local();
		String ss = bY + "." + bM;
		return ss;
	}
	
	
}
