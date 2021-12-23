package A03.testing1;

import java.util.ArrayList;

public class Recommendation {
	
	Weather weather;
	Person person;
	Place place;
	
	public Recommendation(Weather w, Person p, Place pl) {
		this.weather = w;
		this.person = p;
		this.place = pl;
	}
	
	public boolean personIsSafe() {
		if(this.person.isHealthy() && !this.person.hasSymptoms() && !this.person.hadRecentContactPositive() 
				&& this.person.hasPassedCovid() && this.person.hasVaccinationCard())
			return true;
		else
			return false;
	}
	
	public boolean checkStayHome() {
		if(this.weather.getTemperature() < 0 && this.weather.getHumidity() < 0.15 
				&& this.weather.hasPrecipitation())
			return true;
		else
			return false;
	}
	
	public boolean checkGoSkiing() {
		if(this.weather.getTemperature() < 0 && this.weather.getHumidity() < 0.15 
			&& !this.weather.hasPrecipitation()
			&& !this.place.hasCapacityProblems())
			return true;
		else
			return false;
	}
	
	public boolean checkGoHiking() {
		if(0 <= this.weather.getTemperature() && this.weather.getTemperature() < 15 
				&& !this.weather.hasPrecipitation()
				&& !this.place.hasCapacityProblems())
			return true;
		else
			return false;
	}
	
	public boolean checkGoSightseeing() {
		if((15 <= this.weather.getTemperature() && this.weather.getTemperature() < 25) 
				&& !this.weather.hasPrecipitation()
				&& !(this.weather.getHumidity() > 0.60) 
				&& !this.place.hasCapacityProblems())
			return true;
		else
			return false;
	}
	
	public boolean checkGoBeering() {
		if((25 <= this.weather.getTemperature() && this.weather.getTemperature() < 35) 
				&& !this.weather.hasPrecipitation()
				&& !this.place.hasCapacityProblems())
			return true;
		else
			return false;
			
	}
	
	public boolean checkGoSwimming() {
		if(30 < this.weather.getTemperature() 
				&& !this.weather.hasPrecipitation())
			return true;
		else
			return false;
	}
	
	public ArrayList<String> getRecommendation() throws StayHomeException {
		ArrayList<String> actRecommended = new ArrayList<String>();
		if(!personIsSafe()) {
			throw new StayHomeException("You cannot perform any operation");
		}
		
		if(checkStayHome()) 
			actRecommended.add("Stay at home");
		
		if(checkGoSkiing())
			actRecommended.add("Go skiing");
		
		if(checkGoHiking())
			actRecommended.add("Go hiking");
		
		if(checkGoSightseeing())
			actRecommended.add("Go Sightseeing");
		
		if(checkGoBeering())
			actRecommended.add("Go Beering");
		
		if(checkGoSwimming())
			if(this.place.hasCapacityProblems())
				actRecommended.add("Go to the beach");
			else
				actRecommended.add("Go to the swimming pool");
		
		return actRecommended;
	}

}
