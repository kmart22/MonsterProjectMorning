package monster.model;

public class MarshmallowMonster
{

	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	
	public MarshmallowMonster()
	{
		this.name = "no name here";
		this.antennaCount = 2.5;
		this.eyeCount = 3;
		this.hasBellyButton = true;
		this.armCount = 2;
		this.noseCount = 1;
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, boolean hasBellyButton, int armCount, int noseCount)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;
				
	}
	/*
	 * name = Gloober
	 * antennacount = 2.5
	 * eyecount = 3
	 * hasbellybutton = true
	 * armcount = 2
	 * nosecount = 1
	 */
}
