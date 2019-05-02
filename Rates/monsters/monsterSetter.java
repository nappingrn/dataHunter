import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class monsterSetter {

	public static ArrayList<monster_template> monsterget(ResultSet list)
	{
		
		ArrayList<monster_template> monsterList= new ArrayList<monster_template>();
		
		try 
		{
			while(list.next())
			{
				monster_template add = new monster_template();
				add.setHp(list.getString("weaknesses"));
				add.setLevel("level");
				add.setName("name");
				add.setResistences("resistence");
				add.setType("type");
				//figure out how to set drops and ailments since they are arrays of strings
				//add.drops
				//add.ailments
				
				monsterList.add(add);
			}
		} catch (SQLException e) {e.printStackTrace();}
		
		return monsterList;
	}
	
	
	
}
