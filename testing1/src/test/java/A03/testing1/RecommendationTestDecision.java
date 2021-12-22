package A03.testing1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.*;

import junit.framework.TestCase;

public class RecommendationTestDecision extends TestCase {
	
	
	public void testPersonIsSafe() {
		boolean thrown = false;
		Person p = new Person(false, true, true, false, false);
		Weather w = new Weather(-100, 0.0, true);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		try {
			r.getRecommendation();
			fail("Exception not thrown");
		} catch (StayHomeException e) {
			assertEquals("You cannot perform any operation", e.getMessage());
		}
	}
	
	public void testCheckStayHome() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-1, 0.14, true);
		Place pl = new Place(true);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Stay at home");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(15);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	public void testCheckGoSkiing() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-2147483647, 0.14, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go skiing");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(16);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	public void testCheckGoHiking() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(0, 0.61, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go hiking");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(15);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	public void testCheckGoSightseeing() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(24, 0.59, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go Sightseeing");
		assertEquals(r.getRecommendation(), actRecommended);
		
		pl.setCapacityProblems(true);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	public void testCheckGoBeering() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(26, 0.61, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go Beering");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(35);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	
	public void testCheckGoSwimming() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(35, 0.15, false);
		Place pl = new Place(true);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go to the beach");
		assertEquals(r.getRecommendation(), actRecommended);
		
		w.setTemperature(30);
		assertNotEquals(r.getRecommendation(), actRecommended);
	}
	

}
