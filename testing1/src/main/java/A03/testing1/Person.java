package A03.testing1;

public class Person {
	private boolean isHealthy;
	private boolean symptoms;
	private boolean recentContactPositive;
	private boolean vaccinationCard;
	private boolean passedCovid;
	
	public Person(boolean h, boolean s, boolean c, boolean v, boolean p) {
		this.isHealthy = h;
		this.symptoms = s;
		this.recentContactPositive = c;
		this.vaccinationCard = v;
		this.passedCovid = p;
	}
	
	public boolean isHealthy() {
		return isHealthy;
	}
	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}
	public boolean hadRecentContactPositive() {
		return recentContactPositive;
	}
	public void setHadRecentContactPositive(boolean hadRecentContactPositive) {
		this.recentContactPositive = hadRecentContactPositive;
	}
	public boolean hasSymptoms() {
		return symptoms;
	}
	public void setHasSymptoms(boolean hasSymptoms) {
		this.symptoms = hasSymptoms;
	}
	public boolean hasVaccinationCard() {
		return vaccinationCard;
	}
	public void setHasVaccinationCard(boolean hasVaccinationCard) {
		this.vaccinationCard = hasVaccinationCard;
	}

	public boolean hasPassedCovid() {
		return passedCovid;
	}

	public void setPassedCovid(boolean passedCovid) {
		this.passedCovid = passedCovid;
	}
}
