package A03.testing1;

public class Weather {
	
	private int temperature;
	private double humidity;
	private boolean precipitation;

	public Weather(int t, double d, boolean p) {
		this.temperature = t;
		this.humidity = d;
		this.precipitation = p;
	}
	
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
	public boolean hasPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(boolean precipitation) {
		this.precipitation = precipitation;
	}
	

}
