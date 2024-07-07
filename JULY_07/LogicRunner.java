public class LogicRunner {
    public static void main(String[] args) {
        Logic.initializeVariables();

        Logic.displayLogicInfo("Boolean Logic", 5);

        String category = Logic.getLogicCategory();
        System.out.println("Logic Category: " + category);

        String[] applications = Logic.getApplications("Boolean Logic");
        System.out.println("Applications of Boolean Logic:");
        for (String application : applications) {
            System.out.println(application);
        }
    }
}
