package by.fomkin.homework_dragon.dao;

import by.fomkin.homework_dragon.bean.DragonCave;
import by.fomkin.homework_dragon.bean.Treasure;

public class Repository {
	
	private static final Repository instance = new Repository();
	
	private Treasure crown = new Treasure("Crown", 100);
	private Treasure necklace = new Treasure("Necklace", 80);
	private Treasure ring = new Treasure("Ring", 10);
	private Treasure coin = new Treasure("Coin", 2);
	private Treasure cup = new Treasure("Cup", 50);
	private Treasure diadem = new Treasure("Diadem", 75);
	private Treasure earring = new Treasure("Earring", 8);
	private Treasure spoon = new Treasure("Spoon", 7);
	private Treasure chain = new Treasure("Chain", 100);
	private Treasure bracelet = new Treasure("Bracelet", 64);
	private Treasure cross = new Treasure("Cross", 18);
	private Treasure medal = new Treasure("Medal", 74);
	private Treasure diamond = new Treasure("Diamond", 51);
	private Treasure goldBar = new Treasure("Gold bar", 90);
	private Treasure pearl = new Treasure("Pearl", 21);
	private Treasure ruby = new Treasure("Ruby", 34);
	private Treasure sapphire = new Treasure("Sapphire", 38);
	private Treasure emerald = new Treasure("Emerald", 31);
	private Treasure amber = new Treasure("Amber", 19);
	private Treasure amethyst = new Treasure("Amethyst", 17);
	                                                                                                              					
	private DragonCave dragonCave = new DragonCave(crown, necklace, ring, coin, cup, diadem, earring, spoon, chain, bracelet, 
			cross, medal, diamond, goldBar, pearl, ruby, sapphire, emerald, amber, amethyst);
	
	private Repository() {
		
	}
	
	public static Repository getInstance() {
		return instance;
	}
	
	public DragonCave getCave() {
		return dragonCave;
	}

}
