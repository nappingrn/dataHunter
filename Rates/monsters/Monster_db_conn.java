import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Monster_db_conn {

	/*yoinked from https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/java-rds.html#java-rds-javase*/
	public static Connection getRemoteConnection() {

	      try {
	      Class.forName("org.postgresql.Driver");
	      String dbName = "monsters";
	      String userName = "UserHunter"; // fill in later
	      String password = "verysecurepassword"; // save in text file
	      String hostname = "bankingapp.c3povt7bydjz.us-east-2.rds.amazonaws.com";
	      String port = "5432";
	      String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
	      
	      Connection con = DriverManager.getConnection(jdbcUrl);
	      return con;
	    }
	    catch (SQLException e) { e.printStackTrace();} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return null;
	  
	}
	
	
}
