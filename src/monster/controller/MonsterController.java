package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("gloober", 2.5, 3, true, 2, 1);
	
	}

	public void start()
	{
		System.out.println("here is my monster: " + firstMonster);
	}
}
