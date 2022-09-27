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
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			System.out.println("Input your request:");
		
			String userRequest = reader.readLine();
		
			if (userRequest.equalsIgnoreCase("STOP")) {
			
				System.out.println("See you next time!");
				break;
			}
		
			Request request = new Request(userRequest);
		
			Response response = controller.doAction(request);
		
			ToConsole.responseToConsole(response);
		}
		


	}

}
