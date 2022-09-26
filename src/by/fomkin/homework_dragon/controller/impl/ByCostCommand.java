package by.fomkin.homework_dragon.controller.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import by.fomkin.homework_dragon.bean.Treasure;
import by.fomkin.homework_dragon.controller.Command;
import by.fomkin.homework_dragon.controller.CommandName;
import by.fomkin.homework_dragon.logic.CaveLogic;
import by.fomkin.homework_dragon.to.Request;
import by.fomkin.homework_dragon.to.Response;

public class ByCostCommand implements Command {
	
	private final CaveLogic caveLogic = CaveLogic.getInstance();
	
	public Response execute(Request request) throws NumberFormatException, IOException {
		
		Response response = new Response();
		
		System.out.println("Input sum:");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = Integer.parseInt(reader.readLine());
		
		List<Treasure> treasures = caveLogic.getByCost(sum);
		response.setCommand(CommandName.BY_COST.toString());
		response.setTreasures(treasures);
		return response;
	}
	
	
}
