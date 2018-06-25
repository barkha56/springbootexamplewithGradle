package sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class mainclass {
	
	public static Map<String, String> firstChar(String[] strings) {
		  Map<String, String> map=new HashMap<String, String>();
		  for(String s: strings){
			 // if(map.containsKey(s.substring(0, 1))){
			  String df = s.substring(0, 1);
			  char sd = s.charAt(0);
			  if(df.equals(sd)) {
				  System.out.println("");
			  }
			  System.out.println(s.substring(0, 1));
			  System.out.println(s.charAt(0));
			  if(map.containsKey(s.charAt(0))){
				  String value=map.get(s.substring(0, 1));
				  map.put(s.substring(0, 1), value+s);
			  }else{
				  map.put(s.substring(0, 1), s);
			  }
		  }
		  return map;
	}

	public static void main(String[] args) {
		String[] a= {"salt", "tea", "soda", "toast"};
		firstChar(a);
//		String str = "abcdef";
//		String output ="";
//		for(int i=0;i<str.length();i=i*3) {
//			output =output +str.charAt(i);
//			if(i==0)
//				i++;		
//			
//		}
		//System.out.println(output);
//		int[] a = new int[4];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 10;
//
//		int[] m = new int[4];
//		m[0] = 2;
//		m[1] = 3;
//		m[2] = 4;
//		m[3] = 5;
//		int[] ad = new int[2];
//		ad[0] = 1234;
//		ad[1]= 2345;
//		int[] ad1 = new int[2];
//		ad1[0] = 2345;
//		ad1[1]=4567;
//		int moves = minimumMoves(ad, ad1);
//		System.out.println(moves);

	}
	
	static int getUmbrellas(int n, int[] p) {
		int noOfUmb = 0;
		if(p.length ==1){
			   if(p[0] >n) {
				   return -1;
			   }
		}
		for(int i=0;i<p.length;i++) {
		   if(p[i] ==n) {
			   return 1;
		   } else {
			   
		   }
		}		
		return noOfUmb;

    }

	static int minimumMoves(int[] a, int[] m) {
		int noOfMoves = 0;
		for (int k = 0; k < a.length; k++) {			
			char[] digits = Integer.toString(a[k]).toCharArray();
			char[] digits1 = Integer.toString(m[k]).toCharArray();
			for (int i = 0; i < digits.length; i++) {
				if (digits[i] != digits1[i]) {
					while (digits[i] != digits1[i]) {
						if (digits[i] > digits1[i]) {
							digits[i] = (char) (digits[i] - 1);
						} else {
							digits[i] = (char) (digits[i] + 1);
						}
						noOfMoves++;
					}
				}
			}

		}

		return noOfMoves;

	}

}
