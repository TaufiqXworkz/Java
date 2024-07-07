public class Engineer {
    public static void checkVariables() {
        String engineerName = "TAUFIQ";
        int totalEngineers = 150;
        System.out.println("Engineer Team Name: " + engineerName);
        System.out.println("Total Engineers: " + totalEngineers);
    }

    public static void displayEngineerInfo(String engineerName, int engineerExperience) {
        System.out.println("Engineer Name: " + engineerName);
        System.out.println("Engineer Experience: " + engineerExperience + " years");
    }

    public static String[] getSkills() {
        String[] skills = {"Java", "Python", "C++", "Machine Learning"};
		for(int i =0 ; i<skills.length ; i++ ){
			System.out.println("- "+skills[i]);
		}
        return skills;
    }

    public static int[] getProjectHours(String engineerName) {
        int[] projectHours = {120, 150, 100, 90};
		for(int i =0 ; i<projectHours.length ; i++ ){
			System.out.println("- "+projectHours[i]);
		}
        return projectHours;
    }
}

