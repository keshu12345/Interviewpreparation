package parkingLot;

public class ParkingSpot {
	
	private Vehicle vehicle;
	private VehicleSize spotSize;
    private int row;
    private int spotNumber;
	
	public boolean isAvailable() {
		return vehicle==null;
	}
	
	public static boolean canFitVehicle(Vehicle vehicle){
		if(vehicle.size ==VehicleSize.MoterCycle) {
			return true;
		}else if(vehicle.size==VehicleSize.large) {
			return true;
		}else if(vehicle.size==VehicleSize.VeryLarge) {
			return true;
		}
		return false;	
		
	}
	public boolean park(Vehicle vehicle) {
		if(vehicle.Bike) {
			return true;
		}else if(vehicle.Car) {
			return true;
		}else if(vehicle.Bus) {
			return true;
		}else if(vehicle.Truck) {
			return true;
		}
		return false;
	}
	
	public int getRow() {
		return row;
	}
	public int getSpotNumber() {
		return spotNumber;
	}
	public void removeVehicle() {
		
		Vehicle.parakingSpot.remove(Vehicle.parakingSpot.size()-1);
		
	}

}
