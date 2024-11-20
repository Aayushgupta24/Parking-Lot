package com.test.data;

public class Vehicle {
   VehicleType vehicleType ; 
	String vehilceId ;
	public Vehicle(VehicleType vehicleType, String vehilceId) {
		super();
		this.vehicleType = vehicleType;
		this.vehilceId = vehilceId;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehilceId() {
		return vehilceId;
	}
	public void setVehilceId(String vehilceId) {
		this.vehilceId = vehilceId;
	} 
	
	
	 
}
