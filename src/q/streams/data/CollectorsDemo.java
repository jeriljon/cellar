package q.streams.data;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		
		People bostonPeople = new People("Boston", 20300, true, 4);
		People delhiPeople = new People("Delhi", 133300, false, 8);
		People maliPeople = new People("Mali", 4200, true, 9);
		People londonPeople = new People("London", 98000, true, 6);
		People tokyoPeople = new People("Tokyo", 12900, true, 7);
		People beijingPeople = new People("Beijing", 475000, false, 12);
		People capetownPeople = new People("Cape Town", 120300, true, 2);
		
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
			    .mapToInt(People::getPopulationCount) // Map each People instance to its count (population)
			    .sum(); // Sum the population counts

		System.out.println("Total Population of Non-Democratic Cities: " + totalPopulationNonDemocratic);
		
		// Get List of Cities and Total Population for Democratic Cities
		
		Map.Entry<List<String>, Integer> democraticCitiesInfo = 
			    new AbstractMap.SimpleEntry<>(
			        peopleList.stream()
			                  .filter(People::isDemocratic)
			                  .map(People::getCity)
			                  .collect(Collectors.toList()),
			        peopleList.stream()
			                  .filter(People::isDemocratic)
			                  .mapToInt(People::getPopulationCount)
			                  .sum());

		System.out.println("Democratic cities and total population: " + democraticCitiesInfo);

		// Get  List of Cities and Total Population for Non-Democratic Cities
		Map.Entry<List<String>, Integer> nonDemocraticCitiesInfo = 
			    new AbstractMap.SimpleEntry<>(
			        peopleList.stream()
			                  .filter(people -> !people.isDemocratic())
			                  .map(People::getCity)
			                  .collect(Collectors.toList()),
			        peopleList.stream()
			                  .filter(people -> !people.isDemocratic())
			                  .mapToInt(People::getPopulationCount)
			                  .sum());

		System.out.println("Non-democratic cities and total population: " + nonDemocraticCitiesInfo);

		// Get List of Cities That Are Non-Democratic, Total Population, and Wavering Factor < 5
		
		List<People> nonDemocraticCitiesLowWaver = 
			    peopleList.stream()
			              .filter(people -> !people.isDemocratic())
			              .filter(people -> people.getWaveringFactor() < 5)
			              .collect(Collectors.toList());

		System.out.println("Non-democratic cities with wavering factor < 5: " + nonDemocraticCitiesLowWaver);

	}

}

class People {
	private String city;
	private Integer populationCount;
	private boolean isDemocratic;
	private Integer waveringFactor;
	
	public People(String city, Integer populationCount, boolean isDemocratic, Integer waveringFactor) {
		this.city = city;
		this.populationCount = populationCount;
		this.isDemocratic = isDemocratic;
		this.waveringFactor = waveringFactor;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPopulationCount() {
		return populationCount;
	}
	public void setPopulationCount(Integer populationCount) {
		this.populationCount = populationCount;
	}
	public boolean isDemocratic() {
		return isDemocratic;
	}
	public void setDemocratic(boolean isDemocratic) {
		this.isDemocratic = isDemocratic;
	}
	public Integer getWaveringFactor() {
		return waveringFactor;
	}
	public void setWaveringFactor(Integer waveringFactor) {
		this.waveringFactor = waveringFactor;
	}
	
}
