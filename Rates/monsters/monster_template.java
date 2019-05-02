
public class monster_template {
	
	private String name;
	private String hp;
	private String level;
	private String type;
	private String weaknesses;
	private String[] ailments;
	private String resistences;
	private String[] drops;

	public String format()
	{
		return "formatted";
		// use this to format the string to later insert into the list that will appear on the webpage
		
	}
	
	
	public String[] getDrops() {
		return drops;
	}
	public void setDrops(String[] drops) {
		this.drops = drops;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeaknesses() {
		return weaknesses;
	}
	public void setWeaknesses(String weaknesses) {
		this.weaknesses = weaknesses;
	}
	public String[] getAilments() {
		return ailments;
	}
	public void setAilments(String[] ailments) {
		this.ailments = ailments;
	}
	public String getResistences() {
		return resistences;
	}
	public void setResistences(String resistences) {
		this.resistences = resistences;
	}
	
	
}
