package by.fomkin.homework_dragon.controller;

import by.fomkin.homework_dragon.to.Request;
import by.fomkin.homework_dragon.to.Response;

public interface Command {
	
	Response execute (Request request) ;

}
