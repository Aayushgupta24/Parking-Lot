package com.test.service;

import java.time.Duration;

import com.test.data.VehicleParking;
import com.test.data.VehicleType;

public class ParkingCostCalculation {
     
	final static double TWO_WHEELLER_CHARGE_HOUR = 10 ; 
	final  static double FOUR_WHEELER_CHARGE_HOUR = 20 ; 
	 
	public static void updateCharge ( VehicleParking parking) { 
		  Duration duration = Duration.between(parking.getStartTime(), parking.getEndTime());
		  long hours = duration.toHours();
		  
		  double chargingCalculate = 0; 
		    if (parking.getVehicle().getVehicleType().equals(VehicleType.TWO_WHEELER)) { 
		    	chargingCalculate = (hours*TWO_WHEELLER_CHARGE_HOUR) ; 
		    	
		    } 
		    else { 
		    	chargingCalculate = (hours*FOUR_WHEELER_CHARGE_HOUR) ; 
		    }
		    parking.setCharge(chargingCalculate) ; 
		    
	}
	
}
