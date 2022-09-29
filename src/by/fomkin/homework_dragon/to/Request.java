package by.fomkin.homework_dragon.to;

public class Request {
	
	private String command;
	private int sum;
		
	public Request() {
		
	}
	public Request(String strCommand) {
		
		this.command = strCommand;
	}
	public Request(String strCommand, int sum) {
		
		this.command = strCommand;
		this.sum = sum;
	}
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String strCommand) {
		this.command = strCommand;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
