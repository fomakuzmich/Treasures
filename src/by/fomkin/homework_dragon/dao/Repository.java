package by.fomkin.homework_dragon.dao;

import by.fomkin.homework_dragon.bean.DragonCave;
import by.fomkin.homework_dragon.bean.Treasure;
import by.fomkin.homework_dragon.logic.CaveLogic;

public class Repository {
	
	private static final Repository instance = new Repository();
	
	private Repository() {
		
	}
	
	public static Repository getInstance() {
		return instance;
	}
	
	Treasure crown = new Treasure("Crown", 100);
	Treasure necklace = new Treasure("Necklace", 80);
	Treasure ring = new Treasure("Ring", 10);
	Treasure coin = new Treasure("Coin", 2);
	Treasure cup = new Treasure("Cup", 50);
	Treasure diadem = new Treasure("Diadem", 75);
	Treasure earring = new Treasure("Earring", 8);
	Treasure spoon = new Treasure("Spoon", 7);
	Treasure chain = new Treasure("Chain", 100);
	Treasure bracelet = new Treasure("Bracelet", 64);
	Treasure cross = new Treasure("Cross", 18);
	Treasure medal = new Treasure("Medal", 74);
	Treasure diamond = new Treasure("Diamond", 51);
	Treasure goldBar = new Treasure("Gold bar", 90);
	Treasure pearl = new Treasure("Pearl", 21);
	Treasure ruby = new Treasure("Ruby", 34);
	Treasure sapphire = new Treasure("Sapphire", 38);
	Treasure emerald = new Treasure("Emerald", 31);
	Treasure amber = new Treasure("Amber", 19);
	Treasure amethyst = new Treasure("Amethyst", 17);
	                                                                                                              					
	DragonCave dragonCave = new DragonCave(crown, necklace, ring, coin, cup, diadem, earring, spoon, chain, bracelet, 
			cross, medal, diamond, goldBar, pearl, ruby, sapphire, emerald, amber, amethyst);
	
	public DragonCave getCave() {
		return dragonCave;
	}

}
