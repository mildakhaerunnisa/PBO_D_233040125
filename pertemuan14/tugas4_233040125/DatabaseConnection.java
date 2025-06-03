package tugas4_233040125;

public class DatabaseConnection {
    private static String connectionString;
    static {
        connectionString = "jdbc:mysql://localhost:3306/my_database";
        System.out.println("connection String telah dilakukan");
    }
    
    public static String getConnectionString() {
        return connectionString;
    }
}
