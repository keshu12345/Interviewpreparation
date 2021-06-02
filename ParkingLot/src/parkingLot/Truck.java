package parkingLot;

public class Truck extends Vehicle{
	public Truck() {
		spotsNeeded=1;
		size=VehicleSize.VeryLarge;
		}
		public boolean canFitinSpot(Truck truck) {
			
			return ParkingSpot.canFitVehicle(truck);
		}
}
