package permuation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permutation {

	public void solve(List<Integer> list,List<Integer> tmp, List<List<Integer>> res) {
		
		if(list.size()==0) {
			res.add(tmp);
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			tmp.add(list.get(i));
			solve(list,tmp,res);
			list.remove(tmp.size()-1);
			
		}
	}

}


class Main{
	public static void main(String[] args) {
		Permutation p=new Permutation();
		
		Scanner sc=new Scanner(System.in);
		
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3));
		List<List<Integer>>res=new ArrayList();
	   List<Integer>tem = new ArrayList();
		p.solve(list,tem,res);
		System.out.println(res);
	}
}
