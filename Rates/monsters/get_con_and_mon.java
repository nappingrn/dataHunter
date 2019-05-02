import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class get_con_and_mon {
	
	public void populate() {
		
		Connection con = Monster_db_conn.getRemoteConnection();
		
		try {
			
		Statement s1 = con.createStatement();
		
		ResultSet r1 = s1.executeQuery("select * from monsters");
		ArrayList<monster_template> list = monsterSetter.monsterget(r1);
		
		System.out.println("<ul>");
		
		list.forEach((n)->System.out.println( " <li>" + n.format() + "</li>"));
		
		System.out.println("</ul>");
		
		
		}
		catch(SQLException e)
		{
			System.out.println("broken");
		}
	}
	

}
