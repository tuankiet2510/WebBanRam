package connect;
//import org.apache.log4j.Logger;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnect {
    private static final Logger logger = Logger.getLogger(DBConnect.class.getName());
	public Connection getConnection() throws SQLException, ClassNotFoundException {
        /*
		String url = "jdbc:sqlserver://35.220.233.228;databaseName=quanlybanram;user=sqlserver;password=12345;cloudSqlInstance=java-cloud-app-407108:asia-east2:banram;encrypt=false;trustServerCertificate=true";
		//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url);
        */
        //String url = "jdbc:sqlserver://35.220.233.228;databaseName=quanlybanram;cloudSqlInstance=java-cloud-app-407108:asia-east2:banram;encrypt=false;trustServerCertificate=true";
		/*String url = "jdbc:sqlserver://35.220.233.228;database=quanlybanram;"
        + "cloudSqlInstance=java-cloud-app-407108:asia-east2:banram;"
        + "socketFactory=com.google.cloud.sql.sqlserver.SocketFactory";*/
        /*
        String jdbcUrl = "jdbc:sqlserver://localhost;" 
            + "databaseName=<DATABASE_NAME>;" 
            + "socketFactoryClass=com.google.cloud.sql.sqlserver.SocketFactory;" 
            + "socketFactoryConstructorArg=<INSTANCE_CONNECTION_NAME>;" 
            + "user=<USER_NAME>;" 
            + "password=<PASSWORD>" */
            
        /*String jdbcUrl = "jdbc:sqlserver://localhost;" 
    + "databaseName=quanlybanram;" 
    + "socketFactoryClass=com.google.cloud.sql.sqlserver.SocketFactory;?ipTypes=PRIVATE;" 
    + "socketFactoryConstructorArg=java-cloud-app-407108:asia-east2:banram;" 
    + "user=sqlserver;" 
    + "password=12345"; */
    String jdbcUrl = "jdbc:sqlserver://localhost;"
    + "databaseName=quanlybanram;"
    + "socketFactoryClass=com.google.cloud.sql.sqlserver.SocketFactory;"
    + "ipTypes=PRIVATE;"
    + "socketFactoryConstructorArg=java-cloud-app-407108:asia-east2:banram;"
    + "user=sqlserver;"
    + "password=12345;"
    + "encrypt=true;"
    + "trustServerCertificate=true"; // Added this line

    //String jdbcUrl = "jdbc:google:sqlserver://java-cloud-app-407108:asia-east2:banram/quanlybanram?user=sqlserver&password=12345";

        Connection conn = null;
		//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        /*
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			//conn = DriverManager.getConnection(url,"sqlserver","12345");
            conn = DriverManager.getConnection(jdbcUrl);
		} catch (Exception ex) {
			ex.printStackTrace();
		} */
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(jdbcUrl);
        } catch (Exception ex) {
            // Log lỗi
            logger.severe("Error connecting to the database: " + ex.getMessage());
        }
		return conn;
	}

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnect().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
