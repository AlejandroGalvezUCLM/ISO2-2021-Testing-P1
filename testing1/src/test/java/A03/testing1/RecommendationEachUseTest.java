package A03.testing1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RecommendationEachUseTest {

	@Test
	public void testPersonGetRecommendationEU1() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-1, 0.14, true);
		Place pl = new Place(true);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Stay at home");
		assertEquals(r.getRecommendation(), actRecommended);
		
	}
	
	@Test
	public void testPersonGetRecommendationEU2() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(-2147483647, 0.14, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go skiing");
		assertEquals(r.getRecommendation(), actRecommended);
		
	}
	
	@Test
	public void testPersonGetRecommendationEU3() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(14, 0.15, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go hiking");
		assertEquals(r.getRecommendation(), actRecommended);
		
	}
	
	@Test
	public void testPersonGetRecommendationEU4() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(16, 0.16, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go Sightseeing");
		assertEquals(r.getRecommendation(), actRecommended);
		
	}

	@Test
	public void testPersonGetRecommendationEU5() throws StayHomeException {
		Person p = new Person(true, false, false, true, true);
		Weather w = new Weather(34, 0.61, false);
		Place pl = new Place(false);
		Recommendation r = new Recommendation(w, p, pl);
		ArrayList<String> actRecommended = new ArrayList<String>();
		actRecommended.add("Go Beering");
		actRecommended.add("Go to the swimming pool");
		assertEquals(r.getRecommendation(), actRecommended);
		
	}

}
