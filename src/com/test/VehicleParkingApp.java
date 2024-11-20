package com.test;

import java.time.LocalDateTime;

import com.test.data.Vehicle;
import com.test.data.VehicleParking;
import com.test.data.VehicleType;
import com.test.service.ParkingCostCalculation;

public class VehicleParkingApp {
   
	public static void main (String args[]) { 
		 Vehicle vehicle1 =  new Vehicle(VehicleType.TWO_WHEELER, "RJ14") ;
		  Vehicle vehicle2 = new Vehicle(VehicleType.FOUR_WHEELER , "RJ154") ; 
		  
		   LocalDateTime  time1  = LocalDateTime.of(2024, 11, 18, 10, 30);
		   LocalDateTime  time2  = LocalDateTime.of(2024, 11, 18, 12, 30);
		  
		  VehicleParking vehicleParking1= new VehicleParking(time1 , time2 , vehicle1 )  ; 
		  VehicleParking vehicleParking2 = new VehicleParking(time1 , time2 , vehicle2) ; 
		  
		  ParkingCostCalculation.updateCharge(vehicleParking1) ; 
		  ParkingCostCalculation.updateCharge(vehicleParking2);
		  
		  
		 System.out.println(" which vechicle1 : " + vehicleParking1.getVehicle().getVehilceId()) ;  
		 System.out.println("vehicle1 start time:" + vehicleParking1.getStartTime() ) ;
		 System.out.println("vehicle1 end time:" + vehicleParking1.getEndTime() ) ;
		 System.out.println("vehicle1 type: " + vehicleParking1.getVehicle().getVehicleType()) ; 
	     System.out.println("vehicle1 charge: " + vehicleParking1.getCharge()) ; 
	      
	     System.out.println(" which vechicle2 : " + vehicleParking2.getVehicle().getVehilceId()) ;  
		 System.out.println("vehicle2 start time:" + vehicleParking2.getStartTime() ) ;
		 System.out.println("vehicle2 end time:" + vehicleParking2.getEndTime() ) ;
		 System.out.println("vehicle2 type: " + vehicleParking2.getVehicle().getVehicleType()) ; 
	     System.out.println("vehicle2 charge: " + vehicleParking2.getCharge()) ; 
	}
} 
