package models;

public class CarPreference {
	
	private long id;
	public String username;
	public int steeringWheelHeight;
	public int seatTilt;
	
	public CarPreference(String username, int steeringWheelHeight, int seatTilt) {
		this.username = username;
		this.steeringWheelHeight = steeringWheelHeight;
		this.seatTilt = seatTilt;
	}
	
	public String toString() {
		return "Username: " + username + "\nsteeringWheelHeight: " +
				steeringWheelHeight + "cm\nseatTilt: " + seatTilt+"º";
	}
	
}
