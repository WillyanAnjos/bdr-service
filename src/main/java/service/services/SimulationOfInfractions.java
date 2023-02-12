package service.services;


import service.models.Infringement;

public class SimulationOfInfractions {


    public void start() {
        while (true) {
        	Infringement infraInfringement = RandomInfringementService.createRandomInfringement();
        	
        	SendToApiService.sendToAPI(infraInfringement);
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
