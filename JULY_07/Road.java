public class Road {
    public static void initializeVariables() {
        String roadName = "Highway 1";
        int length = 500; // length in kilometers
        System.out.println("Road Name: " + roadName);
        System.out.println("Length: " + length + " km");
    }

    public static void displayRoadInfo(String roadName, int length) {
        System.out.println("Road Name: " + roadName);
        System.out.println("Length: " + length + " km");
    }

    public static String getRoadType() {
        return "Highway";
    }

    public static String[] getConnectingCities(String roadName) {
        if (roadName.equals("Highway 1")) {
            return new String[]{"CityA", "CityB", "CityC"};
        } else {
            return new String[]{"Unknown"};
        }
    }
}

