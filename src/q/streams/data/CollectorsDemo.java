package q.streams.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		
		People bostonPeople = new People("Boston", 20300, true);
		People delhiPeople = new People("Delhi", 133300, false);
		People maliPeople = new People("Mali", 4200, false);
		People londonPeople = new People("London", 98000, true);
		People tokyoPeople = new People("Tokyo", 12900, true);
		People beijingPeople = new People("Beijing", 475000, false);
		People capetownPeople = new People("Cape Town", 120300, true);
		
		List<People> peopleList = Arrays.asList(bostonPeople, delhiPeople, maliPeople,
				londonPeople,tokyoPeople, beijingPeople, capetownPeople);
		
		// Accumulate people cities based on democratic leanings
		List<String> democraticCities = peopleList.stream()
			    .filter(People::isDemocratic) // Filter to keep only those People instances where isDemocratic is true
			    .map(People::getCity) // Map each People instance to its city name
			    .collect(Collectors.toList()); // Collect the resulting city names into a List

		System.out.println("Democratic Cities: " + democraticCities);
		
		// Get Total Population of cities that are not democratic
		int totalPopulationNonDemocratic = peopleList.stream()
			    .filter(people -> !people.isDemocratic()) // Filter to keep only non-democratic cities
			    .mapToInt(People::getCount) // Map each People instance to its count (population)
			    .sum(); // Sum the population counts

		System.out.println("Total Population of Non-Democratic Cities: " + totalPopulationNonDemocratic);
		
		
	}

}

class People {
	private String city;
	private Integer count;
	private boolean isDemocratic;
	
	public People(String city, Integer count, boolean isDemocratic) {
		this.city = city;
		this.count = count;
		this.isDemocratic = isDemocratic;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public boolean isDemocratic() {
		return isDemocratic;
	}
	public void setDemocratic(boolean isDemocratic) {
		this.isDemocratic = isDemocratic;
	}
	
	
	
}
