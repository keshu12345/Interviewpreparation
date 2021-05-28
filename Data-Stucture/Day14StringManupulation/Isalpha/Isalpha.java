package Isalpha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Isalpha {

	public int solve(ArrayList<Character> A) {
	
		for(int i=0;i<A.size();i++) {
			if(check(A.get(i))==false) {
				return 0;
			}
		}
		
		
		return 1;
	}

	private boolean check(Character val) {
		HashSet<Character>set=new HashSet(Arrays.asList('A','E','I','O','U','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
		if(set.contains(val)) {
			return true;
		}
		return false;
		
	}

}

class main{
	public static void main(String args[]) {
		Isalpha isalpha=new Isalpha();
		
		ArrayList<Character>A=new ArrayList(Arrays.asList('S', 'c', 'a', 'l', 'e', 'r' ,'*','A', 'c', 'a', 'd', 'e', 'm', 'y'));
		
		System.out.println(isalpha.solve(A));
	}
}