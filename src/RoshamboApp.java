import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// declare/initialize variables.
		Scanner scan = new Scanner(System.in);
		Player human =new User();
		Player computer = null;
		String userName;
		String userChoice;
		String  userInput = null;
		Roshambo userValue;
		Roshambo value = null;
		
		//prompt user to enter name. Validate input
		userName = Validator.getString(scan, "Please enter your name");
		human.setName(userName);
		
			
		//prompt user to select opponent. Validate input
		userChoice = Validator.getString(scan, "Would you like to play against theJets or TheSharks (j/s)?: ");
		
		//prompt user to select rock, paper, scissors. Validate input
		 userInput = Validator.getString(scan, "Rock. Paper, or Scissor? (R/P/S):  ");
			 
		
		if (userChoice.equalsIgnoreCase("j")){
			computer = new Dummy();
			computer.setName("TheJets");
			value = computer.generateRoshambo();
			System.out.println("TheJets: " + value);	
		}
		else if (userChoice.equalsIgnoreCase("s")){
			computer = new RandomUser();
			computer.setName("TheSharks");
			value = computer.generateRoshambo();
			System.out.println("TheSharks: " + value);
			
		}
		
		//Display users choice
		userValue = human.generateRoshambo(userInput);
		System.out.println(userName + ": " + userInput);
		
		// Display results of match. write a separate method.
		System.out.println(displayResults(computer, human,  userValue, value));
		
		//Prompt user to continue, Validate input.
       
		scan.close();
	}

	public static String displayResults(Player computer, Player humane, Roshambo userValue, Roshambo value) {
		 
	 

	if(userValue==value) {
		return "Its a draw!";
	} else if(userValue==Roshambo.ROCK && value==Roshambo.PAPER
			  || userValue ==Roshambo.PAPER &&value==Roshambo.SCISSORS
			  || userValue == Roshambo.ROCK){
		return computer.getName()+"Wins!";
} else {
		return humane.getName() + "Wins!";
}
	}}

