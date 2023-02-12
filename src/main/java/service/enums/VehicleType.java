package service.enums;

import java.util.Random;

public enum VehicleType {
	 CAR,
	 MOTORBIKE,
	 TRUCK,
	 BUS,
	 VAN;
	 
	 private static final Random random = new Random();

	 public static VehicleType generate() {
		 return values()[random.nextInt(values().length)];
	 }

}
