/*
 * Data class to format game states into a readable type to be stored in the dictionary
 */
public class ConfigData {

	private String config;
	private int score;
	
	/*
	 * 
	 */
	public ConfigData() 
	{
		/*
		 * Set this up to send an error if config data is called without having the proper parameters
		 */
	}
	
	/*
	 * 
	 */
	public ConfigData(String config, int score) 
	{
		this.config = config;
		this.score = score;
	}
	
	/*
	 * Getter method for config
	 */
	public String getConfig()
	{
		return this.config;
	}
	
	/*
	 *  Getter method for config
	 */
	public int getScore()
	{
		return this.score;
	
	}

}
