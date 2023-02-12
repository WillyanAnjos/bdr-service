package service.models;

import service.enums.VehicleType;

public class Infringement {
	
    private int speed;
    private String plate;
    private VehicleType vehicleType;
    
    
	public Infringement() {}
	
	public Infringement(int speed, String plate, VehicleType vehicleType) {
		super();
		this.speed = speed;
		this.plate = plate;
		this.vehicleType = vehicleType;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Infringement [speed=" + speed + ", plate=" + plate + ", vehicleType=" + vehicleType + "]";
	}
    
    

}
