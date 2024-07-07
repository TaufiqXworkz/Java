public class RoadRunner {
    public static void main(String[] args) {
        Road.initializeVariables();

        Road.displayRoadInfo("Highway 1", 500);

        String roadType = Road.getRoadType();
        System.out.println("Road Type: " + roadType);

        String[] connectingCities = Road.getConnectingCities("Highway 1");
        System.out.println("Connecting Cities on Highway 1:");
        for (String city : connectingCities) {
            System.out.println(city);
        }
    }
}
