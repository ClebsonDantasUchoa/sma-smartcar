package models;

public class CarPreference {
	
	private static CarPreference carPreference;
	private long id;
	private String username = "";
	private int steeringWheelHeight;
	private int seatTilt;
	
	public void setAtributes(String username, int steeringWheelHeight, int seatTilt) {
		this.username = username;
		this.steeringWheelHeight = steeringWheelHeight;
		this.seatTilt = seatTilt;
	}
	
	private CarPreference() {
	}
	
	public static CarPreference getInstance() {
		if(carPreference == null) carPreference = new CarPreference();
		return carPreference;
	}
	
	public String toString() {
		return "Username: " + username + "\nsteeringWheelHeight: " +
				steeringWheelHeight + "cm\nseatTilt: " + seatTilt+"º";
	}

	public long getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}

	public int getSteeringWheelHeight() {
		return steeringWheelHeight;
	}

	public void setSteeringWheelHeight(int steeringWheelHeight) {
		this.steeringWheelHeight = steeringWheelHeight;
	}
		
}
