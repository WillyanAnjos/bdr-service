package service.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import service.models.Infringement;

public class SendToApiService {
	
    private static final String URL_API = "http://localhost:8080/api/v1/infringement/create";
    

	 public static void sendToAPI(Infringement infringement) {
		 
		 System.out.println(infringement.toString());
	    	
	    	Gson gson = new Gson();

	    	String json = gson.toJson(infringement);

	    	
	        try {
	            URL url = new URL(URL_API);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("POST");
	            connection.setRequestProperty("Content-Type", "application/json");
	            connection.setDoOutput(true);

	            connection.getOutputStream().write(json.getBytes());

	            if (connection.getResponseCode() == HttpURLConnection.HTTP_CREATED) {
	                System.out.println("Infracao enviada com sucesso!");
	            } else {
	                System.err.println("Erro ao enviar infracao: " + connection.getResponseCode());
	            }

	            connection.disconnect();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	    }
	}
