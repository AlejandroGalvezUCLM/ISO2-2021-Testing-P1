package A03.testing1;

public class Place {
	private boolean capacityProblems;
	
	public Place(boolean cP) {
		this.setCapacityProblems(cP);
	}

	public boolean hasCapacityProblems() {
		return capacityProblems;
	}

	public void setCapacityProblems(boolean capacityProblems) {
		this.capacityProblems = capacityProblems;
	}
	
}
