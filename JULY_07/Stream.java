public class Stream {
    public static void initializeVariables() {
        String streamName = "Java Stream";
        int viewers = 1000000;
        System.out.println("Stream Name: " + streamName);
        System.out.println("Viewers: " + viewers);
    }

    public static void displayStreamInfo(String streamName, int viewers) {
        System.out.println("Stream Name: " + streamName);
        System.out.println("Viewers: " + viewers);
    }

    public static String[] getTopics() {
        String[] topics = {"Java Basics", "Object-Oriented Programming", "Collections", "Streams"};
		for(int i =0 ; i<topics.length ; i++ ){
			System.out.println("- "+topics[i]);
		}
        return topics;
    }

    public static String[] getHosts(String streamName) {
        String[] hosts = {"Alice", "Bob", "Charlie", "David"};
		for(int i =0 ; i<hosts.length ; i++ ){
			System.out.println("- "+hosts[i]);
		}
        return hosts;
    }
}

