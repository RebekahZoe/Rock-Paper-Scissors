package App;

import java.util.Scanner;

public class App {  

	public static void main(String[] args) {
		
			
		GameRunner();
	

	}
	public static  void GameRunner() {
	
		int gamesPlayed =1;
		
		while (true) {
			
		System.out.println("Please enter your enter your move");
		Scanner readInput = new Scanner(System.in);
		String move = readInput.nextLine();
		move.toLowerCase();
		System.out.println(GameMethod.getWinner(move, GameMethod.getComputerInput())); 
		
		System.out.println("Do you want to play another game?");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		answer.toLowerCase();
		if (answer.equals("yes")) {
			gamesPlayed +=1;
			
		}
		else if (answer.contentEquals("no")) {
			double countC = GameMethod.countComputer;
			double countU =GameMethod.countUser;
			double countD = GameMethod.countDraw;
			double percentageC = 0;
			double percentageU = 0;
			double percentageD =0;
			System.out.println("Game count: " + gamesPlayed);
			percentageC = (countC/gamesPlayed)*100;
			System.out.println("Computer wins: " + countC + ", Percentage of games: "+ percentageC+"%");
			percentageU = (countU/gamesPlayed)*100;
			System.out.println("User wins: " + countU+ ", Percentage of games: "+ percentageU+"%");
			percentageD = (countD/gamesPlayed)*100;
			System.out.println("Draws: "+ countD+ ", Percentage of games: "+ percentageD+"%");
			readInput.close();
			input.close();
			break;
		}
		else {
			System.out.println("Error, try again");
			readInput.close();
			input.close();
			break;
		}
		}
		
		
		
		
	}
}

