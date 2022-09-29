package by.fomkin.homework_dragon.main;

import java.util.Scanner;

import by.fomkin.homework_dragon.controller.CaveController;
import by.fomkin.homework_dragon.to.Request;
import by.fomkin.homework_dragon.to.Response;
import by.fomkin.homework_dragon.view.ToConsole;

public class Main {

	public static void main(String[] args) {
		
		
		CaveController controller = new CaveController();
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Input your request:");
		
			String userRequest = scan.next();
			
			Request request;
		
			if (userRequest.equalsIgnoreCase("STOP")) {
			
				System.out.println("See you next time!");
				break;
			}
			else if (userRequest.equals("BY_COST")) {
				
				System.out.println("Input sum:");
				
				if (!scan.hasNextInt()) {
					
					System.out.println("Sum entered incorrectly. \"" + scan.next() + "\" is not sum.");
					request = new Request("NO_SUCH_COMMAND");
					
				}
				else {
				int sum = scan.nextInt();
				request = new Request(userRequest, sum);
				}
			}
			else {
		
				request = new Request(userRequest);
			}
		
			Response response = controller.doAction(request);
		
			ToConsole.responseToConsole(response);
		}
		


	}

}
