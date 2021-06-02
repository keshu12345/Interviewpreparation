package parkingLot;

public class Bike extends Vehicle{
	
	public Bike() {
		spotsNeeded=1/4;
		size=VehicleSize.MoterCycle;
		color="Back";
	}
	public boolean canFitinSpot(Bike bike) {
		
		return ParkingSpot.canFitVehicle(bike);
	}

}
