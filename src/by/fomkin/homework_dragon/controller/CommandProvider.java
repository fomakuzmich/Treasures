package by.fomkin.homework_dragon.controller;

import java.util.HashMap;
import java.util.Map;

import by.fomkin.homework_dragon.controller.impl.ByCostCommand;
import by.fomkin.homework_dragon.controller.impl.GetAllCommand;
import by.fomkin.homework_dragon.controller.impl.GetAllSortCommand;
import by.fomkin.homework_dragon.controller.impl.MostCheapCommand;
import by.fomkin.homework_dragon.controller.impl.MostExpensiveCommand;
import by.fomkin.homework_dragon.controller.impl.NoSuchCommand;

public class CommandProvider {
	
	private static final CommandProvider instance = new CommandProvider();
	
	private Map<CommandName, Command> commands = new HashMap<>();

	private CommandProvider() {
		
		commands.put(CommandName.MOST_EXPENSIVE, new MostExpensiveCommand());
		commands.put(CommandName.BY_COST, new ByCostCommand());
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
		commands.put(CommandName.GET_ALL, new GetAllCommand());
		commands.put(CommandName.GET_ALL_SORT, new GetAllSortCommand());
		commands.put(CommandName.MOST_CHEAP, new MostCheapCommand());
	}
	
	
	public static CommandProvider getInstance() {
		
		return instance;
	}
	
	public Command getCommand(String strCommand) {
		
	     CommandName commandName;
		 Command command;
		 
		 try {
		    commandName = CommandName.valueOf(strCommand);
			command = commands.get(commandName);
			
			if (command == null) {
			    command = commands.get(CommandName.NO_SUCH_COMMAND);
			}
		 } catch(Exception e) {
		    command = commands.get(CommandName.NO_SUCH_COMMAND);
		 }
		 
		 return command;
	}

}
