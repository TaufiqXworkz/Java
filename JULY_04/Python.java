class Python {
    public static void initializeVariables() {
        String languageName = "Python";
        int releaseYear = 1991;
        System.out.println("Language Name: " + languageName);
        System.out.println("Release Year: " + releaseYear);
    }

    public static void displayLanguageInfo(String languageName, int releaseYear) {
        System.out.println("Language Name: " + languageName);
        System.out.println("Release Year: " + releaseYear);
    }

    public static String[] getFeatures() {
		String[] features = {"Dynamic Typing", "Interpreted", "High-Level", "Easy to Learn"};
		for(int i =0 ; i<features.length ; i++ ){
			System.out.println("- "+features[i]);
		}
        return features;
    }

    public static String getPopularLibraries(String[] languageName) {
		for(int i =0 ; i<languageName.length ; i++ ){
			System.out.println("- "+languageName[i]);
		}
        return null;
    }
}

