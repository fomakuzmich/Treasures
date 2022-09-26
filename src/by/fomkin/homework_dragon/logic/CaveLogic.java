package by.fomkin.homework_dragon.logic;

import java.util.ArrayList;
import java.util.List;

import by.fomkin.homework_dragon.bean.DragonCave;
import by.fomkin.homework_dragon.bean.Treasure;
import by.fomkin.homework_dragon.controller.CommandProvider;
import by.fomkin.homework_dragon.dao.Repository;


public final class CaveLogic {
	
	private final Repository repository = Repository.getInstance();
	
	private List<Treasure> treasures = repository.getCave().getTreasures();
	
	private static final CaveLogic instance = new CaveLogic();
	
	private CaveLogic() {
		
	}
	
	public static CaveLogic getInstance() {
		return instance;
	}
	
	public int maxCostTreasures(List<Treasure> treasures) {
		
		int max = 0;
		
		for (Treasure treasure : treasures) {
			
			if (treasure.getCost() > max) {
				max = treasure.getCost();
			}
		}
		return max;
	}
	
	public List<Treasure> getMostExpensive() {
		
		List<Treasure> newTreasures = new ArrayList<Treasure>();
		
		int max = maxCostTreasures(treasures);
		
		for (Treasure treasure : treasures) {
			
			if (treasure.getCost() == max) {
				newTreasures.add(treasure);
			}
		}
		return newTreasures;
	}
	
	public int minCostTreasures(List<Treasure> treasures) {
		
		int min = treasures.get(0).getCost();
		
		for (Treasure treasure : treasures) {
			
			if (treasure.getCost() < min) {
				min = treasure.getCost();
			}
		}
		return min;
	}
	
	public List<Treasure> getMostCheap() {
		
		List<Treasure> newTreasures = new ArrayList<Treasure>();
		
		int min = minCostTreasures(treasures);
		
		for (Treasure treasure : treasures) {
			
			if (treasure.getCost() == min) {
				newTreasures.add(treasure);
			}
		}
		return newTreasures;
	}
	
	
	public List<Treasure> getAllCommand() {
		
		return treasures;
	}
	
	public List<Treasure> getAllSortCommand() {
		
		return sort(treasures);
	}
	
	public List<Treasure> getByCost(int sum) {
		
		List<Treasure> sortTreasures = sort(treasures);
		List<Treasure> newTreasures = new ArrayList<>();
		List<Treasure> remainingTreasures = new ArrayList<>();
		
		for (int i = 0; i < sortTreasures.size(); i++) {
			if (sortTreasures.get(i).getCost() <= sum) {
				newTreasures.add(sortTreasures.get(i));
				sum -= sortTreasures.get(i).getCost();
			}
			else {
				remainingTreasures.add(sortTreasures.get(i));
			}
		}
		return newTreasures;
	}
	
	public List<Treasure> sort(List<Treasure> treasures) {
		
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
