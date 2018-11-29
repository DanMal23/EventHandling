package grouplayout;

public class Info {
	private String developerName;
	private String programmingLanguage;
	private int year;

	public Info() {
	}

	public Info(String dn, String pl, int y) {
		developerName = dn;
		programmingLanguage = pl;
		year = y;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return programmingLanguage + ":  by " + developerName + ",  in: " + year;
	}

}
