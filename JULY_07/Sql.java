class Sql {
    public static void initializeVariables() {
        String databaseName = "MySQL";
        int port = 3306;
        System.out.println("Database Name: " + databaseName);
        System.out.println("Port: " + port);
    }

    public static void displayDatabaseInfo(String databaseName, int port) {
        System.out.println("Database Name: " + databaseName);
        System.out.println("Port: " + port);
    }

    public static String getDatabaseVersion() {
		String version = "8.0.23";
		System.out.println("Database Version: " + version);
        return "8.0.23";
    }

    public static String[] getSupportedEngines(String databaseName) {
		String[] engines= {"InnoDB", "MyISAM", "Memory", "CSV"};
		for(int i =0 ; i<engines.length ; i++ ){
			System.out.println("- "+engines[i]);
		}
        return engines;
    }
}

