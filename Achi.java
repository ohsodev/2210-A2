
public class Achi {
	private final static int PRIME_TABLE_SIZE = 9973;	//Prime # for the size of the dictionary
	public Achi() 
	{
		// TODO Auto-generated constructor stub
	}
	public Dictionary createDictionary()
	{
		return new Dictionary(PRIME_TABLE_SIZE);
	}
	

}
