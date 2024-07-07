public class StreamRunner {
    public static void main(String[] args) {
        Stream.initializeVariables();
        Stream.displayStreamInfo("Java Stream", 1000000);
		System.out.println("Topics covered:");
        Stream.getTopics();
		System.out.println("Hosts of Java Stream:");
        Stream.getHosts("Java Stream");
       
    }
}