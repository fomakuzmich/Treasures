package by.fomkin.homework_dragon.view;

import by.fomkin.homework_dragon.bean.Treasure;
import by.fomkin.homework_dragon.to.Response;

public class ToConsole {
	
	public static void responseToConsole(Response response) {
		
		if (response.getErrorMessage() != null) {
			
			System.out.println(response.getErrorMessage());
		}
		else {
			
			for (Treasure treasure : response.getTreasures()) {
				
				System.out.println(treasure.getTitle() + " - $" + treasure.getCost());
			}
			System.out.println();
		}
		
	}

}
