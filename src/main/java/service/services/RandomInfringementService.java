package service.services;

import java.util.Random;

import service.enums.VehicleType;
import service.models.Infringement;

public class RandomInfringementService {
	private static final int MIN_SPEED = 80;
    private static final int MAX_SPEED = 100;
    
    public static Infringement createRandomInfringement() {
    	
        int speed = generateSpeed();
        
        String plate = generatePlate();
        
        VehicleType vehicleType = generateVehicleType();
        
        
        return new Infringement(speed, plate, vehicleType);
    }

    private static int generateSpeed() {
        return MIN_SPEED + (int) (Math.random() * (MAX_SPEED - MIN_SPEED + 1));
    }

    private static String generatePlate() {
    	
    	 String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         Random random = new Random();
         StringBuilder plate = new StringBuilder();

 
         for (int i = 0; i < 3; i++) {
             char letra = letters.charAt(random.nextInt(letters.length()));
             plate.append(letra);
         }

         plate.append("-");

     
         for (int i = 0; i < 4; i++) {
             int numero = random.nextInt(10);
             plate.append(numero);
         }
         
         return plate.toString();

    }

    private static VehicleType generateVehicleType() {
        return VehicleType.generate();
    }
}
