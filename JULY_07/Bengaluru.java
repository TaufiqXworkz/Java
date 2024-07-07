public class Bengaluru {
    public static void initializeVariables() {
        String cityName = "Bengaluru";
        int population = 8400000;
        System.out.println("City Name: " + cityName);
        System.out.println("Population: " + population);
    }

    public static void displayCityInfo(String cityName, int population) {
        System.out.println("City Name: " + cityName);
        System.out.println("Population: " + population);
    }

    public static String[] getLanguages() {
        String[] languages = {"Kannada", "English", "Hindi", "Tamil"};
		System.out.println("the languages are: ");
		for(int i =0 ; i<languages.length ; i++ ){
			System.out.println("- "+languages[i]);
		}
        return languages;
    }

    public static String[] getMajorAttractions(String cityName) {
        String[] attractions = {"Lalbagh Botanical Garden", "Bangalore Palace", "Cubbon Park","Vidhana Soudha"};
		for(int i =0 ; i<attractions.length ; i++ ){
			System.out.println("- "+attractions[i]);
		}
        return attractions;
    }
}

