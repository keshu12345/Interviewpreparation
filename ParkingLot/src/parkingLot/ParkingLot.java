package parkingLot;

import java.util.Scanner;

public class ParkingLot {
	private static Vehicle vehicle;

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int sizeOfLot=sc.nextInt();
		
		int spot[][]=new int[sizeOfLot][sizeOfLot];
		
		boolean isAvailable= isSpotAvaialble(vehicle);
			int row=0;
			int column=0; 
             generateTicket(isAvailable,spot,row,column);
		

	}

	private static void generateTicket(boolean isAvailable, int[][] spot,int row,int column) {
		if(isAvailable) {
			if(vehicle.size ==VehicleSize.MoterCycle &&(row!=0&&column!=0)&&(row!=spot.length-1&&column!=0)&&(row!=spot.length-1&&column!=spot[0].length-1)&&(row!=0&&column!=spot[0].length-1)) {
				spot[row][column]=1/4;
				
				System.out.println("Generate");
			}else if(vehicle.size==VehicleSize.large&&(row!=0&&column!=0)&&(row!=spot.length-1&&column!=0)&&(row!=spot.length-1&&column!=spot[0].length-1)&&(row!=0&&column!=spot[0].length-1)) {
				spot[row][column]=2;
			}else if(vehicle.size==VehicleSize.VeryLarge&&(row!=0&&column!=0)&&(row!=spot.length-1&&column!=0)&&(row!=spot.length-1&&column!=spot[0].length-1)&&(row!=0&&column!=spot[0].length-1)) {
				spot[row][column]=2;
			}
			
		}
		
	}

	private static boolean isSpotAvaialble(Vehicle vehicle) {
		if(vehicle.size ==VehicleSize.MoterCycle) {
			return true;
		}else if(vehicle.size==VehicleSize.large) {
			return true;
		}else if(vehicle.size==VehicleSize.VeryLarge) {
			return true;
		}
		return false;	
		
	}

}
