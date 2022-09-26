package by.fomkin.homework_dragon.controller;

import java.io.IOException;

import by.fomkin.homework_dragon.to.Request;
import by.fomkin.homework_dragon.to.Response;

public interface Command {
	
	Response execute (Request request) throws NumberFormatException, IOException;

}
