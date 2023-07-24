package parkingLot;

import java.util.ArrayList;

public class Vehicle {
	
	protected static ArrayList<ParkingSpot> parakingSpot=new ArrayList<ParkingSpot>();
	
	protected String licensePlate;
	protected int spotsNeeded;
	protected VehicleSize size;
	protected String color;

	public boolean Bike;

	public boolean Car;

	public boolean Bus;

	public boolean Truck;

	public int getSpotsNeeded() {
		return spotsNeeded;
	}
	
  public VehicleSize getType() {
	  return size;
  }
  public void parkingSpots(ParkingSpot spot) {
	  parakingSpot.add(spot);
  }
  
}
