public class Logic {
    public static void initializeVariables() {
        String logicType = "Boolean Logic";
        int complexityLevel = 5;
        System.out.println("Logic Type: " + logicType);
        System.out.println("Complexity Level: " + complexityLevel);
    }

    public static void displayLogicInfo(String logicType, int complexityLevel) {
        System.out.println("Logic Type: " + logicType);
        System.out.println("Complexity Level: " + complexityLevel);
    }

    public static String getLogicCategory() {
        return "Mathematical Logic";
    }

    public static String[] getApplications(String logicType) {
        if (logicType.equals("Boolean Logic")) {
            return new String[]{"Digital Circuits", "Computer Algorithms", "Search Engines"};
        } else {
            return new String[]{"Unknown"};
        }
    }
}

