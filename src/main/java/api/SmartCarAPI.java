package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SmartCarAPI {
	
	public String getCarPreferenceByUsername(String username) throws IOException {	
		URL url = new URL("https://sma-smartcar-apirest.herokuapp.com/api/carpreference/findbyusername/"+username);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/json");
		
		int responseCode = con.getResponseCode();
		
		System.out.println("----------------------------------------");
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode+"\n");
		System.out.println("----------------------------------------");
		
		BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		return response.toString();
		
	}
	
}
