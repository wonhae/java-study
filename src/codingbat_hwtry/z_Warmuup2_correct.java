package codingbat_hwtry;

public class z_Warmuup2_correct {
	
	//20.04.10_1번
	public String stringTimes(String str, int n) { 
		  String r = "";
		  for (int i =0; i<n; i++) {
		    r += str;
		  }
		  
		  return r;
		}

	
	public String frontTimes(String str, int n) {
		  String r = "";
		  
		  for (int i=0; i<n ; i++ ) {
		     if (str.length()<=3) {
		     r += str;
		  } else{
		    r += str.substring(0,3);
		  }
		  }
		  
		  
		  return r;
		}
	
	
	public String stringBits(String str) {
		  String r = "";
		  
		  for (int i =0; i<str.length(); i+=2) {  
		    String a = str.substring(i,i+1);
		    r += a;
		    
		  }
		  
		 return r; 
		}

	//샘이 수정해주심 
	public String altPairs(String str) {
		  String result = "";
		  
		    for (int j =0; j<str.length(); j+=4) {
		      
		      result += str.substring(j,j+1);
		      
		      if (j+1 >= str.length()) break;
		      result += str.substring(j+1, j+2);
		      
		    }
	  
		  return result;
		}
	
	
}
