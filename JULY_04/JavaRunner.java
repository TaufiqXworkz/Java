public class JavaRunner {
    public static void main(String[] args) {
        Java.initializeVariables();
        Java.displayJavaInfo("Java Platform", 17);
		
		System.out.println("Features of Java:");
        Java.getFeatures();
        
		System.out.println("Libraries used in Java:");
        Java.getLibraries("Java Platform");
        
    }
}