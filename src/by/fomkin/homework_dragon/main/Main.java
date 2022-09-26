package by.fomkin.homework_dragon.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import by.fomkin.homework_dragon.controller.CaveController;
import by.fomkin.homework_dragon.to.Request;
import by.fomkin.homework_dragon.to.Response;
import by.fomkin.homework_dragon.view.ToConsole;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		CaveController controller = new CaveController();
		
		System.out.println("Input your request:");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Request request = new Request(reader.readLine());
		
		Response response = controller.doAction(request);
		
		ToConsole.responseToConsole(response);
		


	}

}
