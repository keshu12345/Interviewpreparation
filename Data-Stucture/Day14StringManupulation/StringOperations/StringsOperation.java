package StringOperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class StringsOperation {

	public String solve(String A) {
		String s = A.concat(A);
		for(int i=0;i<s.length();i++) {
			if(checkUpperCaseVowel(s.charAt(i))) {
				String val=""+s.charAt(i);
				s=s.replaceAll(val, "");
			}else if(checkLowerCaseVowel(s.charAt(i))) {
				String val=""+s.charAt(i);
				s=s.replaceAll(val, "#");
			}
		}
		return s.trim();
	}

	private boolean checkLowerCaseVowel(char val) {
		HashSet<Character>set=new HashSet(Arrays.asList('a','e','i','o','u'));
		if(set.contains(val)) {
			return true;
		}
		return false;
	}

	private boolean checkUpperCaseVowel(char val) {
		HashSet<Character>set=new HashSet(Arrays.asList('A','E','I','O','U','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'));
		if(set.contains(val)) {
			return true;
		}
		return false;
	}

	public void sub(String A) {
		  HashMap<String,Integer>map=new HashMap();
	        for(int i=0;i<A.length();i++){
	            
	            for(int j=i;j<A.length();j++){
	                String s=A.substring(i,j+1);
	                if(map.containsKey(s)){
	                	int count=0;
	                    count++;
	                    count+=map.get(s);
	                }else{
	                 int count=0;
	                    count++;
	                    map.put(s,count);
	                }
	            }
	        }
	          map.get("bob");
	       System.out.println(map);
	       System.out.println(map.get("bob"));
	       
	}

}

class main {
	public static void main(String args[]) {
		StringsOperation so = new StringsOperation();

		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		System.out.println(so.solve(A));
		so.sub(A);
	}
}