public class Java {
    public static void initializeVariables() {
        String platformName = "Java Platform";
        int version = 17;
        System.out.println("Platform Name: " + platformName);
        System.out.println("Version: " + version);
    }

    public static void displayJavaInfo(String platformName, int version) {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Version: " + version);
    }

    public static String[] getFeatures() {
        String[] features = {"Strongly Typed", "Platform Independent", "Object-Oriented", "Automatic Memory Management"};
        for(int i =0 ; i<features.length ; i++ ){
			System.out.println("- "+features[i]);
		}
		return features;
    }

    public static String[] getLibraries(String platformName) {
        String[] libraries = {"JUnit", "Log4j", "Jackson", "Guava"};
		for(int i =0 ; i<libraries.length ; i++ ){
			System.out.println("- "+libraries[i]);
		}
        return libraries;
    }
}

