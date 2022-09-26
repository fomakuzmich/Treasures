package by.fomkin.homework_dragon.to;

import java.util.List;

import by.fomkin.homework_dragon.bean.Treasure;

public class Response {
	
	String command;
	List<Treasure> treasures;
	String errorMessage;
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public List<Treasure> getTreasures() {
		return treasures;
	}
	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	

}
