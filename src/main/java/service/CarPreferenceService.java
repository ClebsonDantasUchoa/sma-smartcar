package service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import models.CarPreference;

public class CarPreferenceService {
	
	public CarPreference convertJsonStringToCarPreference(String jsonString) {
		JsonElement root = new JsonParser().parse(jsonString);
		JsonObject json = root.getAsJsonObject().getAsJsonObject(); 
		String username = json.get("username").getAsString();
		int steeringWheelHeight = json.get("steeringWheelHeight").getAsInt();
		int seatTilt = json.get("seatTilt").getAsInt();
		return new CarPreference(username, steeringWheelHeight, seatTilt);
	}

}
