import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class monster_dao {


	
	
	public static Connection getRemoteConnection() {

	      try {
	      Class.forName("org.postgresql.Driver");
	      String dbName = "monsters";
	      String userName = "UserHunter"; // fill in later
	      String password = ""; // save in text file
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
	
	public ResultSet getMonster(String choice)
	{
		
		String sql = "select name, weaknesses, mapnumber from monsters where name = ?";
		ResultSet monsters = null;
		PreparedStatement states;
		try {
			states = getRemoteConnection().prepareStatement(sql);
		
			states.setString(1, choice);
			monsters = states.executeQuery();
			
			return monsters;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return monsters;
		
	}
	
	public ResultSet MapMonsters(String choice)
	{
		String sql = "select monsters from maps where name = ?";
		ResultSet monsters = null;
		PreparedStatement states;
		
		try 
		{
			
			states = getRemoteConnection().prepareStatement(sql);
			states.setString(1, choice);
			monsters = states.executeQuery();
			return monsters;
		} 
		catch (SQLException e) {e.printStackTrace();}
		
		return monsters;
	}
	
	public ResultSet ItemRates(String item)
	{
		String sql = "select item, droprate from items,monsters where item  = ? and itemtable.monid = montable.id";
		ResultSet monsters = null;
		PreparedStatement states;
		
		try 
		{
			states = getRemoteConnection().prepareStatement(sql);
			states.setString(1, item);
			monsters = states.executeQuery();
			return monsters;
		} 
		catch (SQLException e) {e.printStackTrace();}
		
		return monsters;
		
	}
	
	public ResultSet AllItems()
	{
		String sql = "select * from items";
		ResultSet monsters = null;
		
		try 
		{
			Statement state = getRemoteConnection().createStatement();
			monsters = state.executeQuery(sql);
		}
		catch(SQLException i ) {i.printStackTrace();}
		
		return monsters;
		
	}
	
	public ResultSet AllMonsters()
	{
		String sql = "select * from monsters";
		
		ResultSet monsters = null;
		try
		{
			Statement state = getRemoteConnection().createStatement();
			monsters = state.executeQuery(sql);
		}
		catch(SQLException i ) {i.printStackTrace();}
		
		return monsters;
		
	}
	
	
	
}
