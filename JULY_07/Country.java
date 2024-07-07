public class Country {
    public static void initializeVariables() {
        String countryName = "INDIA";
        int population = 5000000;
        System.out.println("Country Name: " + countryName);
        System.out.println("Population: " + population);
    }

    public static void displayCountryInfo(String countryName, int population) {
        System.out.println("Country Name: " + countryName);
        System.out.println("Population: " + population);
    }

    public static String[] getLanguages() {
        String[] languages = {"English", "Kannada", "Urdu", "Telgu"};
		System.out.println("the languages are: ");
		for(int i =0 ; i<languages.length ; i++ ){
			System.out.println("- "+languages[i]);
		}
        return languages;
    }

    public static String[] getMajorCities(String countryName) {
        String[] cities = {"Bengaluru", "Hyderabad", "Goa", "Mumbai"};
		System.out.println("the cities are: ");
		for(int i =0 ; i<cities.length ; i++ ){
			System.out.println("- "+cities[i]);
		}
        return cities;
    }
}

