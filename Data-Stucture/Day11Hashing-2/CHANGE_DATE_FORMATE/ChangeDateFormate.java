package CHANGE_DATE_FORMATE;

import java.util.Scanner;
import java.util.HashMap;

public class ChangeDateFormate {

	public String solve(String A) {
		HashMap<String, String> mapDay = solveDay();
		HashMap<String, String> mapMonth = solveMonth();
		String day = "";
		String month = "";
		String year = "";
		int count = 0;
		int start = 0;
		int end = 0;
		int pos = 0;
		for (int i = 0; i < A.length(); i++) {

			if (A.charAt(i) == ' ' && count == 0) {

				day = A.substring(start, end);
				start = pos++;
				count++;

			}
			if (A.charAt(i) == ' ' && count == 1) {
				month = A.substring(start, end);
				start = pos++;
			}
			end++;
			pos = end;
		}
		year = A.substring(start, A.length());
		return (year + "-" + mapMonth.get(month) + "-" + mapDay.get(day)).trim();
	}

	private HashMap<String, String> solveMonth() {
		HashMap<String, String> mapMonth = new HashMap<String, String>();

		mapMonth.put("Jan", "01");
		mapMonth.put("Feb", "02");
		mapMonth.put("Mar", "03");
		mapMonth.put("Apr", "04");
		mapMonth.put("May", "05");
		mapMonth.put("Jun", "06");
		mapMonth.put("Jul", "07");
		mapMonth.put("Aug", "08");
		mapMonth.put("Sep", "09");
		mapMonth.put("Oct", "10");
		mapMonth.put("Nov", "11");
		mapMonth.put("Dec", "12");

		return mapMonth;
	}

	private HashMap<String, String> solveDay() {
		HashMap<String, String> mapDay = new HashMap<String, String>();

		mapDay.put("1st", "01");
		mapDay.put("2nd", "02");
		mapDay.put("3rd", "03");
		mapDay.put("4th", "04");
		mapDay.put("5th", "05");
		mapDay.put("6th", "06");
		mapDay.put("7th", "07");
		mapDay.put("8th", "08");
		mapDay.put("9th", "09");
		mapDay.put("10th", "10");
		mapDay.put("11th", "11");
		mapDay.put("12th", "12");
		mapDay.put("13th", "13");
		mapDay.put("14th", "14");
		mapDay.put("15th", "15");
		mapDay.put("16th", "16");
		mapDay.put("17th", "17");
		mapDay.put("18th", "18");
		mapDay.put("19th", "19");
		mapDay.put("20th", "20");
		mapDay.put("21st", "21");
		mapDay.put("22nd", "22");
		mapDay.put("23rd", "23");
		mapDay.put("24th", "24");
		mapDay.put("25th", "25");
		mapDay.put("25th", "25");
		mapDay.put("26th", "26");
		mapDay.put("27th", "27");
		mapDay.put("28th", "28");
		mapDay.put("29th", "29");
		mapDay.put("30th", "30");
		mapDay.put("31st", "31");
		

		return mapDay;
	}

}

class Solution {
	public static void main(String args[]) {
		ChangeDateFormate cdf = new ChangeDateFormate();
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		System.out.println(cdf.solve(A));
	}
}
