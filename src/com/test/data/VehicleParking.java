package com.test.data;

import java.time.LocalDateTime;

public class VehicleParking {
   LocalDateTime startTime ; 
   LocalDateTime endTime ; 
   
    Vehicle vehicle ; 
   
   double charge ;

public VehicleParking(LocalDateTime startTime, LocalDateTime endTime, Vehicle vehicle) {
	super();
	this.startTime = startTime;
	this.endTime = endTime;
	this.vehicle = vehicle;
	//this.charge = charge;
}

public LocalDateTime getStartTime() {
	return startTime;
}

public void setStartTime(LocalDateTime startTime) {
	this.startTime = startTime;
}

public LocalDateTime getEndTime() {
	return endTime;
}

public void setEndTime(LocalDateTime endTime) {
	this.endTime = endTime;
}

public Vehicle getVehicle() {
	return vehicle;
}

public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}

public double getCharge() {
	return charge;
}

public void setCharge(double charge) {
	this.charge = charge;
}
   
    
}
