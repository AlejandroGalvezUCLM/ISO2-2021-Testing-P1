package A03.testing1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RecommendationPairwiseTest {

	@Test
	public void testPersonGetRecommendationPW1() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(16, 0.14, true);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		assertEquals(r.getRecommendation(), actRecommended);
		
	}
	
	@Test
	public void testPersonGetRecommendationPW2() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(36, 0.15, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go to the swimming pool");
		
		assertEquals(r.getRecommendation(), actRecommended);
		
	}
	
	@Test
	public void testPersonGetRecommendationPW3() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-1, 0.14, true);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Stay at home");
		
		assertEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testPersonGetRecommendationPW4() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(1, 0.61, true);
		Place pl = new Place(true);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		
		assertEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testPersonGetRecommendationPW5() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-2147483647, 0.14, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go skiing");

		assertEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testPersonGetRecommendationPW6() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(1, 0.61, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go hiking");
		
		assertEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testPersonGetRecommendationPW7() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(26, 0.61, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go Beering");
		
		assertEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testPersonGetRecommendationPW8() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(16, 0.59, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go Sightseeing");
		
		assertEquals(r.getRecommendation(), actRecommended);
	}
	
	@Test
	public void testPersonGetRecommendationPW9() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(2147483647, 1.7976931348623156E308, false);
		Place pl = new Place(true);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go to the beach");
		
		assertEquals(r.getRecommendation(), actRecommended);
	}
}
