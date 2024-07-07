public class Program {
    public static void initializeVariables() {
        String programName = "Java Program";
        int version = 1;
        System.out.println("Program Name: " + programName);
        System.out.println("Version: " + version);
    }

    public static void displayProgramInfo(String programName, int version) {
        System.out.println("Program Name: " + programName);
        System.out.println("Version: " + version);
    }

    public static String getProgramLanguage() {
		String language = "JAVA";
		System.out.println("Programming Language: " + language);
        return "Java";
    }

    public static String[] getSupportedPlatforms(String programName) {
        if (programName.equals("Java Program")) {
            return new String[]{"Windows", "MacOS", "Linux"};
        } else {
            return new String[]{"Unknown"};
        }
    }
}

