package by.fomkin.homework_dragon.logic;

import java.util.ArrayList;
import java.util.List;

import by.fomkin.homework_dragon.bean.Treasure;
import by.fomkin.homework_dragon.dao.Repository;


public final class CaveLogic {
	
	private final Repository repository = Repository.getInstance();
	
	private static final CaveLogic instance = new CaveLogic();
	
	private CaveLogic() {
		
	}
	
	public static CaveLogic getInstance() {
		return instance;
	}
	
	public List<Treasure> mostExpensive() {
		
		List<Treasure> treasures = repository.getCave().getTreasures();
		
		List<Treasure> newTreasures = new ArrayList<Treasure>();
		
		int max = 0;
		
		for (Treasure treasure : treasures) {
			
			if (treasure.getCost() > max) {
				max = treasure.getCost();
			}
		}
		
		for (Treasure treasure : treasures) {
			
			if (treasure.getCost() == max) {
				newTreasures.add(treasure);
			}
		}
		return newTreasures;
	}
	
	
	public List<Treasure> bySum(int sum) {
		
		List<Treasure> treasures = sortTreasures();
		
		List<Treasure> newTreasures = new ArrayList<>();
		
		for (int i = 0; i < treasures.size(); i++) {
			if (treasures.get(i).getCost() <= sum) {
				newTreasures.add(treasures.get(i));
				sum -= treasures.get(i).getCost();
			}
		}
		return newTreasures;
	}
	
	public List<Treasure> sortTreasures() {
		
		List<Treasure> treasures = repository.getCave().getTreasures();
		
		List<Treasure> newTreasures = treasures;
		
		for(int i = 1; i < newTreasures.size(); i++) {
			
			for (int j = 0; j < i; j++) {
				
				if (newTreasures.get(i).getCost() > newTreasures.get(j).getCost()) {
					Treasure x = newTreasures.get(i);
					newTreasures.set(i, newTreasures.get(j));
					newTreasures.set(j, x);
				}
			}
		}
		
		return newTreasures;
	}
	
}
