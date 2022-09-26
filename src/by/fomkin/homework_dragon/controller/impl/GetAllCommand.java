package by.fomkin.homework_dragon.controller.impl;

import java.util.List;

import by.fomkin.homework_dragon.bean.Treasure;
import by.fomkin.homework_dragon.controller.Command;
import by.fomkin.homework_dragon.controller.CommandName;
import by.fomkin.homework_dragon.logic.CaveLogic;
import by.fomkin.homework_dragon.to.Request;
import by.fomkin.homework_dragon.to.Response;

public class GetAllCommand implements Command {
	
	private final CaveLogic caveLogic = CaveLogic.getInstance();
		
	public Response execute(Request request) {
		Response response = new Response();
		
		List<Treasure> treasures = caveLogic.getAllCommand();
		response.setCommand(CommandName.GET_ALL.toString());
		response.setTreasures(treasures);
		return response;
	}

}
