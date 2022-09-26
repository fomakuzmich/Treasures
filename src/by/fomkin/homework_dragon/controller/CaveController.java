package by.fomkin.homework_dragon.controller;

import java.io.IOException;

import by.fomkin.homework_dragon.to.Request;
import by.fomkin.homework_dragon.to.Response;

public class CaveController {
	
	private final CommandProvider provider = CommandProvider.getInstance();
	
	public Response doAction(Request request) throws NumberFormatException, IOException {
		
		String commandName = request.getCommand();
		
		Command command = provider.getCommand(commandName);
		
		Response response = command.execute(request);
		
		return response;
	}

}
