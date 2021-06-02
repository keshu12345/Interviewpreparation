package parkingLot;

public class Bus extends Vehicle{
	public Bus() {
		spotsNeeded=1;
		size=VehicleSize.VeryLarge;
	}
	public boolean canFitinSpot(Bus bus) {
		
		return ParkingSpot.canFitVehicle(bus);
	}

}
