public class SqlRunner {
    public static void main(String[] args) {
        Sql.initializeVariables();
		
        Sql.displayDatabaseInfo("MySQL", 3306);
		
        Sql.getDatabaseVersion();
		
		System.out.println("Supported Engines in MySQL:");
        Sql.getSupportedEngines("MySQL");
        
    }
}