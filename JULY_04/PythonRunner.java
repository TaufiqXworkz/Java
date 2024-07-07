public class PythonRunner {
    public static void main(String[] args) {
        Python.initializeVariables();
				
        Python.displayLanguageInfo("Python", 1991);
		
		System.out.println("Features of Python:");
        Python.getFeatures();
		
        System.out.println("Popular Libraries in Python:");
		String[] libraries = {"NumPy", "Pandas", "TensorFlow", "Matplotlib"};
        Python.getPopularLibraries(libraries);
       
    }
}
