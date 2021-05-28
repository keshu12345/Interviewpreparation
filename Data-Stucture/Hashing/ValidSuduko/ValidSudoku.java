package ValidSuduko;

import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {

	public void solve(List<String> A) {

		int maze[][] = new int[A.size()][A.get(0).length()];

		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(0).length(); j++) {
				if (A.get(i).charAt(j) != '.') {
					maze[i][j] = A.get(i).charAt(j) - '0';
				} else {
					maze[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(0).length(); j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
		System.out.println(isValid(maze));
	}

	private Boolean isValid(int[][] maze) {
		
	 for(int i=3;i<maze.length;i=i+3) {
		 for(int j=3;j<maze[i].length;j=j+3) {
			 if(!isCheck3by3(maze,i,j))  return false;
		 }
	 }
		return true;

	}

	private boolean isCheck3by3(int[][] maze, int i, int j) {
		int gridval=maze[i][j];
		for(int k=i+1;k<i+3;k++) {
			for(int l=j+1;l<j+3;l++) {
				if(maze[k][l]!=0&&maze[k][l]!=maze[k][l+1]) {
					System.out.println("mazee-->"+maze[i][j]+"---"+i+j);
					return true;
				}
			}
		}
		return false;
	}

}

class main {
	public static void main(String args[]) {
		ValidSudoku valid = new ValidSudoku();
		List<String> list = new ArrayList<String>();
		list.add("53..7....");
		list.add("6..195...");
		list.add(".98....6.");
		list.add("8...6...3");
		list.add("4..8.3..1");
		list.add("7...2...6");
		list.add(".6....28.");
		list.add("....8..79");
		list.add("...419.5");

		valid.solve(list);

	}
}