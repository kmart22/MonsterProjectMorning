package monster.controller;

import monster.model.MarshmallowMonster;

import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("gloober", 2.5, 3, true, 2, 1);
		 keyboardInput = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("here is my monster: " + firstMonster);
		System.out.println("my momster has this many eyes: " + firstMonster.getEyeCount());

		
		//		if(firstMonster.getEyeCount() > 3)
//		{
//			System.out.println("thats a lot of eyes!!! - scary");
//		}
		
		
		System.out.println("do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equals("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
			
		}
		else
		{
			System.out.println("Fine dont change my name!");
		}
		System.out.println(firstMonster);
	}
}
