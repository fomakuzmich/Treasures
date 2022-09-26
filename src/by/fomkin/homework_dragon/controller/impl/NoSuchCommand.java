package by.fomkin.homework_dragon.controller.impl;

import by.fomkin.homework_dragon.controller.Command;
import by.fomkin.homework_dragon.controller.CommandName;
import by.fomkin.homework_dragon.to.Request;
import by.fomkin.homework_dragon.to.Response;

public class NoSuchCommand implements Command{
	
	public Response execute(Request request) {
		Response response = new Response();
		
		response.setCommand(CommandName.NO_SUCH_COMMAND.toString());
		response.setErrorMessage("No such command");
		return response;
	}
	
	
}
