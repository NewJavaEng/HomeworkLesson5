package by.http.lesson5homework;

public class City {
	
	private String cityName;
	private boolean regionCenter;
	
	//constructor
	public City(String cityName) {
		this.cityName = cityName;
		//System.out.println("City: " + cityName);
	}

	public String getCityName() {
		return cityName;
	}

	public boolean isRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(boolean regionCenter) {
		this.regionCenter = regionCenter;
	}
	
}
