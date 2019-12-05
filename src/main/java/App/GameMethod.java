package App;

import java.util.Random;

public class GameMethod {
	static int countComputer = 0;
	static int countUser = 0;
	static int countDraw = 0;
	
	public static String getComputerInput () {
	
		Random rand = new Random(); 
		int n = rand.nextInt(3);
		n +=1;
		if (n==1) {
			String computerInput = ComputerInput.ROCK.toString(); 
			return computerInput;
		}
		else if (n==2) {
			String computerInput = ComputerInput.PAPER.toString(); 
			return computerInput;
		}
		else if (n==3) {
			String computerInput = ComputerInput.SCISSORS.toString();  
			return computerInput;
		}
		
		
		
		return null;
	}

	public static String getWinner(String user, String computerInput) {
		
		
		boolean userRock = user.equals("rock");
		boolean userPaper = user.equals("paper");
		boolean userScissors = user.equals("scissors");
		boolean computerRock = computerInput.equals("ROCK");
		boolean computerPaper = computerInput.equals("PAPER");
		boolean computerScissors = computerInput.equals("SCISSORS");
		
		if (userRock && computerPaper) {
			String result = "Computer wins!";
			countComputer +=1;
			return result; 
		}
		else if (userRock && computerRock){
			String result = "Draw!";
			countDraw +=1;
			return result;
		}
		else if (userRock && computerScissors) {
			String result = "User wins!";
			countUser +=1;
			return result;
		}
		else if (userPaper && computerScissors) {
			String result = "Computer wins!";
			countComputer +=1;
			return result;
		} 
		else if (userPaper && computerRock) {
			String result = "User wins!";
			countUser +=1;
			return result;
		}
		else if (userPaper && computerPaper) {
			String result = "Draw!";
			countDraw +=1;
			return result;
		}
		else if (userScissors && computerScissors) {
			String result = "Draw!" ;
			countDraw +=1;
			return result;
		}
		else if (userScissors && computerRock) {
			String result = "Computer wins!";
			countComputer +=1;
			return result;
		}
		else if(userScissors && computerPaper) {
			String result = "User wins!";
			countUser +=1;
			return result;
		} 
		return null; 

}
}
