package codingbat;

public class WarmUP1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {

		return !weekday || vacation;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile == bSmile;
	}

	public int sumDouble(int a, int b) {
		int r = a + b;
		r = (a == b) ? r * 2 : r;
		return r;
	}

	public int diff21(int n) {
		int r = 21 - n;
		r = (r < 0) ? -r : r;
		r = (n > 21) ? r * 2 : r;

		return r;
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public boolean makes10(int a, int b) {
		boolean r = a == 10 || b == 10 || (a + b) == 10;
		return r;
	}

	public boolean nearHundred(int n) {
		boolean r = (90 <= n && n <= 110)
				|| (190 <= n && n <= 210);

		return r;
	}

	public String notString(String str) {
		int len = str.length();

		if (len < 3) {
			return "not " + str;
		} else {
			String f = str.substring(0, 3);
			if (f.equals("not")) {
				return str;
			} else {
				return "not " + str;
			}
		}

	}

	public String missingChar(String str, int n) {
		String left = str.substring(0, n);
		String right = str.substring(n + 1);

		return left + right;
	}

	public String frontBack(String str) {
		if (str.length() > 1) {
			char c1 = str.charAt(0);
			char c2 = str.charAt(str.length() - 1);

			String mid = str.substring(1, str.length() - 1);

			return c2 + mid + c1;
		} else {
			return str;
		}

	}

	public String front3(String str) {
		if (str.length() > 3) {
			String f3 = str.substring(0, 3);
			return f3 + f3 + f3;
		} else {
			return str + str + str;
		}

	}

	public String backAround(String str) {
		int len = str.length();
		char last = str.charAt(len - 1);
		return last + str + last;
	}

	public boolean or35(int n) {
		boolean m3 = n % 3 == 0;
		boolean m5 = n % 5 == 0;

		return m3 || m5;
	}

	public String front22(String str) {
		String s2;

		if (str.length() >= 2) {
			s2 = str.substring(0, 2);
		} else {
			s2 = str;
		}

		return s2 + str + s2;
	}

	public boolean startHi(String str) {
		return str.startsWith("hi");
	}

	public boolean icyHot(int temp1, int temp2) {
		boolean negative = temp1 < 0 || temp2 < 0;
		boolean over100 = temp1 > 100 || temp2 > 100;

		return negative && over100;
	}

	public boolean in1020(int a, int b) {
		boolean ain = a >= 10 && a <= 20;
		boolean bin = b >= 10 && b <= 20;
		return ain || bin;
	}

	public boolean hasTeen(int a, int b, int c) {
		boolean ateen = a >= 13 && a <= 19;
		boolean bteen = b >= 13 && b <= 19;
		boolean cteen = c >= 13 && c <= 19;

		return ateen || bteen || cteen;
	}

	public boolean loneTeen(int a, int b) {
		boolean ateen = a >= 13 && a <= 19;
		boolean bteen = b >= 13 && b <= 19;

		return ateen ^ bteen;
	}

	public String delDel(String str) {
		if (str.indexOf("del") == 1) {
			String left = str.substring(0, 1);
			String right = str.substring(4);
			return left + right;
		}
		return str;
	}

	public boolean mixStart(String str) {
		return str.indexOf("ix") == 1;
	}

}
