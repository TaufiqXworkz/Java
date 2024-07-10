/* Write a class
1. declare 10 static variables and assign values using methods
 */
 
 
public class SocialMedia {
	
    static String platformName;
    static int activeUsers;
    static String founder;
    static int launchYear;
    static double dailyActiveUsers;
    static String headquarters;
    static String ceo;
    static int monthlyActiveUsers;
    static boolean isPubliclyTraded;
    static double revenue;

    public static void setPlatformName() {
        platformName = "TechConnect";
        System.out.println("Platform Name: " + platformName);
    }

    public static void setActiveUsers() {
        activeUsers = 50000000;
        System.out.println("Active Users: " + activeUsers);
    }

    public static void setFounder() {
        founder = "Jane Doe";
        System.out.println("Founder: " + founder);
    }

    public static void setLaunchYear() {
        launchYear = 2010;
        System.out.println("Launch Year: " + launchYear);
    }

    public static void setDailyActiveUsers() {
        dailyActiveUsers = 20000000.5;
        System.out.println("Daily Active Users: " + dailyActiveUsers);
    }

    public static void setHeadquarters() {
        headquarters = "Silicon Valley";
        System.out.println("Headquarters: " + headquarters);
    }

    public static void setCeo() {
        ceo = "John Smith";
        System.out.println("CEO: " + ceo);
    }

    public static void setMonthlyActiveUsers() {
        monthlyActiveUsers = 40000000;
		System.out.println("Monthly Active Users: " + monthlyActiveUsers);
    }

    public static void setIsPubliclyTraded() {
        isPubliclyTraded = true;
        System.out.println("Is Publicly Traded: " + isPubliclyTraded);

    }

    public static void setRevenue() {
        revenue = 10.5;
		System.out.println("Revenue: " + revenue);

    }

    public static void main(String[] args) {
        SocialMedia.setPlatformName();
        SocialMedia.setActiveUsers();
        SocialMedia.setFounder();
        SocialMedia.setLaunchYear();
        SocialMedia.setDailyActiveUsers();
        SocialMedia.setHeadquarters();
        SocialMedia.setCeo();
        SocialMedia.setMonthlyActiveUsers();
        SocialMedia.setIsPubliclyTraded();
        SocialMedia.setRevenue();

    }
}
