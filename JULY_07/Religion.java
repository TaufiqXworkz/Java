public class Religion {
    public static void initializeVariables() {
        String religionName = "Hinduism";
        int followers = 1000000000;
        System.out.println("Religion Name: " + religionName);
        System.out.println("Followers: " + followers);
    }

    public static void displayReligionInfo(String religionName, int followers) {
        System.out.println("Religion Name: " + religionName);
        System.out.println("Followers: " + followers);
    }

    public static String[] getHolyBooks() {
        String[] holyBooks = {"Vedas", "Upanishads", "Bhagavad Gita", "Ramayana"};
		for(int i =0 ; i<holyBooks.length ; i++ ){
			System.out.println("- "+holyBooks[i]);
		}
        return holyBooks;
    }

    public static String[] getMajorFestivals(String religionName) {
        String[] festivals = {"Diwali", "Holi", "Navratri", "Dussehra"};
		for(int i =0 ; i<festivals.length ; i++ ){
			System.out.println("- "+festivals[i]);
		}
        return festivals;
    }
}

