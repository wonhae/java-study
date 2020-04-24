package codingbat;

public class WarmUP2 {
	public String stringTimes(String str, int n) {
		String r = "";

		for (int i = 0; i < n; i++) {
			r += str;
		}

		return r;
	}

	public String frontTimes(String str, int n) {
		String r = "";
		String sub = null;

		if (str.length() > 3) {
			sub = str.substring(0, 3);
		} else {
			sub = str;
		}

		for (int i = 0; i < n; i++) {
			r += sub;
		}

		return r;
	}

	int countXX(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				cnt++;
			}
		}
		return cnt;
	}

	boolean doubleX(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				if (str.charAt(i + 1) == 'x') {
					return true;
				} else {
					break;
				}
			}
		}
		return false;
	}

	public String stringBits(String str) {
		String r = "";

		for (int i = 0; i < str.length(); i += 2) {
			r += str.charAt(i);
		}
		return r;
	}

	public String stringSplosion(String str) {
		String r = "";

		for (int i = 1; i <= str.length(); i++) {
			r += str.substring(0, i);
		}
		return r;
	}

	public int last2(String str) {
		if (str.length() < 3) {
			return 0;
		}

		int cnt = 0;
		String last = str.substring(str.length() - 2);

		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals(last)) {
				cnt++;
			}
		}

		return cnt;

	}

	public int arrayCount9(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				cnt++;
			}
		}

		return cnt;
	}

	public boolean arrayFront9(int[] nums) {

		int loop = 4;
		if (nums.length < 4) {
			loop = nums.length;
		}

		for (int i = 0; i < loop; i++) {
			if (nums[i] == 9) {
				return true;
			}
		}

		return false;
	}

	public boolean array123(int[] nums) {

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] == 3 && nums[i - 1] == 2
					&& nums[i - 2] == 1) {
				return true;
			}
		}
		return false;
	}

	public int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int cnt = 0;

		for (int i = 0; i < len - 1; i++) {
			String suba = a.substring(i, i + 2);
			String subb = b.substring(i, i + 2);
			if (suba.equals(subb)) {
				cnt++;
			}
		}

		return cnt;

	}

	public String stringX(String str) {
		String r = "";

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || i == str.length() - 1) {
				r += str.charAt(i);
			} else {
				if (str.charAt(i) != 'x') {
					r += str.charAt(i);
				}
			}
		}

		return r;
	}

	public String altPairs(String str) {
		String r = "";

		int i = 0;

		while (i < str.length()) {
			r += str.charAt(i);
			i = i + 1;
			if (i >= str.length()) {
				break;
			}
			r += str.charAt(i);
			i = i + 3;
		}

		return r;
	}

	public String stringYak(String str) {
		return str.replace("yak", "");
	}

	public int array667(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6) {
				if (nums[i + 1] == 6 || nums[i + 1] == 7) {
					cnt++;
				}
			}
		}

		return cnt;
	}

	public boolean noTriples(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1]
					&& nums[i] == nums[i + 2]) {
				return false;
			}
		}

		return true;
	}

	public boolean has271(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			int second = nums[i] + 5;
			int third = nums[i] - 1;

			if (second == nums[i + 1]) {
				if (third - 2 <= nums[i + 2]
						&& nums[i + 2] <= third + 2) {
					return true;
				}
			}
		}
		return false;
	}
}
