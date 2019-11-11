package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import models.CarPreference;

public class SmartCarAPI {

	public String getCarPreferenceByUsername(String username) throws IOException {
		URL url = new URL("https://sma-smartcar-apirest.herokuapp.com/api/carpreference/findbyusername/" + username);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/json");

		int responseCode = con.getResponseCode();

		System.out.println("----------------------------------------");
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode + "\n");
		System.out.println("----------------------------------------");

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		return response.toString();

	}

	public void saveCarChange(String carPreferenceJson) throws IOException {
		URL url = new URL("https://sma-smartcar-apirest.herokuapp.com/api/carpreference/save");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
	
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		con.setRequestProperty("Accept", "application/json");
		con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestMethod("POST");


		try (OutputStream os = con.getOutputStream()) {
			byte[] input = carPreferenceJson.getBytes("utf-8");
			os.write(input, 0, input.length);
		}

		try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
			System.out.println("Response: " + response.toString());
		}

		int responseCode = con.getResponseCode();
        
        System.out.println("----------------------------------------");
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Response Code : " + responseCode + "\n");
        System.out.println("----------------------------------------");

	}

}
