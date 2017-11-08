package by.http.lesson5homework;

public class District {
	
	private String districtName;
	private City cities [];
	
	//constructor
	public District(String districtName) {
		this.districtName = districtName;
		//System.out.println("District: " + districtName);
	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City cities[]) {
		this.cities = cities;
	}
	
	

}
