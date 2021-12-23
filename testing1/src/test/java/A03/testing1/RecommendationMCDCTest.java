package A03.testing1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RecommendationMCDCTest {

	@Test
	public void testPersonIsSafe() {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-100, 0.0, true);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		assertTrue(r.personIsSafe());
		
		p.setHealthy(true); p.setHasSymptoms(true); p.setHadRecentContactPositive(true); 
		p.setHasVaccinationCard(true); p.setPassedCovid(true);
		try {
			r.getRecommendation();
			fail("Exception not thrown");
		} catch (StayHomeException e) {
			assertEquals("You cannot perform any operation", e.getMessage());
		}
		
		p.setHealthy(true); p.setHasSymptoms(false); p.setHadRecentContactPositive(true); 
		p.setHasVaccinationCard(true); p.setPassedCovid(true);
		assertFalse(r.personIsSafe());
		
		p.setHealthy(true); p.setHasSymptoms(false); p.setHadRecentContactPositive(false); 
		p.setHasVaccinationCard(true); p.setPassedCovid(false);
		assertFalse(r.personIsSafe());
		
		p.setHealthy(true); p.setHasSymptoms(false); p.setHadRecentContactPositive(false); 
		p.setHasVaccinationCard(false); p.setPassedCovid(true);
		assertFalse(r.personIsSafe());
		
		p.setHealthy(false); p.setHasSymptoms(true); p.setHadRecentContactPositive(true); 
		p.setHasVaccinationCard(true); p.setPassedCovid(true);
		assertFalse(r.personIsSafe());
	}
	
	@Test
	public void testCheckStayHome() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-1, 0.14, true);
		Place pl = new Place(true);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Stay at home");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setPrecipitation(false);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setHumidity(0.61); w.setPrecipitation(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(15);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		
	}
	
	@Test
	public void testCheckGoSkiing() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-2147483647, 0.14, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go skiing");
		assertEquals(r.getRecommendation(), actRecommended);
		
		
		w.setPrecipitation(true); pl.setCapacityProblems(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setPrecipitation(false); pl.setCapacityProblems(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setHumidity(0.61); w.setPrecipitation(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(-1); w.setHumidity(0.14);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testCheckGoHiking() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(0, 0.61, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go hiking");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setPrecipitation(true); pl.setCapacityProblems(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setPrecipitation(false); pl.setCapacityProblems(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(15); w.setPrecipitation(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testCheckGoSightseeing() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(24, 0.59, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go Sightseeing");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setPrecipitation(true); w.setHumidity(0.61); pl.setCapacityProblems(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setPrecipitation(false);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setHumidity(0.59);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(25); w.setPrecipitation(true); w.setHumidity(0.61); pl.setCapacityProblems(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testCheckGoBeering() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(26, 0.61, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go Beering");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setPrecipitation(true); pl.setCapacityProblems(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setPrecipitation(false);
		assertNotEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(35); w.setPrecipitation(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testCheckGoSwimming() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(35, 0.15, false);
		Place pl = new Place(true);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		//Check to the beach
		actRecommended.add("Go to the beach");
		assertEquals(r.getRecommendation(), actRecommended);
		
		//Check to the swimming pool
		pl.setCapacityProblems(false);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}

}