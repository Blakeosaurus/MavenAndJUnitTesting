package pirate;

public class Pirate {
	
	//Instance variables
	private String name = "";
	private int limbsRemaining = 4;
	private int numVillagesPlundered = 0;
	private String parrotName = "";
	
	
	//Statics
	private static int numPirates = 0;
	private static Object NUM_PIRATES_SYNC_OBJECT = new Object();
	
	private static int totalLimbsLost = 0;
	private static Object TOTAL_LIMBS_LOST_SYNC_OBJECT = new Object();
	
	
	public Pirate(String pirateName) 
	{
		this.name = pirateName;
		
		synchronized (NUM_PIRATES_SYNC_OBJECT)
		{
			numPirates++;
		}
	}
	public Pirate(String pirateName, int limbsRemaining)
	{
		this.name = pirateName;
		this.limbsRemaining = limbsRemaining;
		
		synchronized (NUM_PIRATES_SYNC_OBJECT)
		{
			numPirates++;
		}
	}
	
	public void loseALimb() 
	{
		limbsRemaining--;
		
		synchronized (TOTAL_LIMBS_LOST_SYNC_OBJECT)
		{
			totalLimbsLost++;
		}
	}
	
	public boolean isDead() 
	{
		return limbsRemaining == 0;
	}
	
	public void plunderVillage() {
		numVillagesPlundered++;
	}
	
	

	/**
	 * Gets/Sets
	 */
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getLimbsRemaining() 
	{
		return limbsRemaining;
	}
	public void setLimbsRemaining(int limbsRemaining) 
	{
		this.limbsRemaining = limbsRemaining;
	}
	public static int getNumPirates() 
	{
		return numPirates;
	}
	public static int getTotalLimbsLost() 
	{
		return totalLimbsLost;
	}
	public int getNumVillagesPlundered() 
	{
		return numVillagesPlundered;
	}
	public void setNumVillagesPlundered(int numVillagesPlundered) 
	{
		this.numVillagesPlundered = numVillagesPlundered;
	}
	public String getParrotName() 
	{
		return parrotName;
	}
	public void setParrotName(String parrotName) 
	{
		this.parrotName = parrotName;
	}
}
