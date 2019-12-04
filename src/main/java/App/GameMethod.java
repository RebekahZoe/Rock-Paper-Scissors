package App;

public class GameMethod {

	public static String getWinner(String user, String computer) {
		boolean userRock = user.equals("rock");
		boolean userPaper = user.equals("paper");
		boolean userScissors = user.equals("scissors");
		boolean computerRock = computer.equals("rock");
		boolean computerPaper = computer.equals("paper");
		boolean computerScissors = computer.equals("scissors");
		
		if (userRock && computerPaper) {
			return "Computer wins!";
		}
		else if (userRock && computerRock){
			return "Draw!";
		}
		else if (userRock && computerScissors) {
			return "User wins!";
		}
		else if (userPaper && computerScissors) {
			return "Computer wins!";
		} 
		else if (userPaper && computerRock) {
			return "User wins!";
		}
		else if (userPaper && computerPaper) {
			return "Draw!";
		}
		else if (userScissors && computerScissors) {
			return "Draw!";
		}
		else if (userScissors && computerRock) {
			return "Computer wins!";
		}
		else if(userScissors && computerPaper) {
			return "User wins!";
		} 
		return null;

}
}
