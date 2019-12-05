package Test;

import org.junit.Assert;

import App.GameMethod;



public class GameTest {

	@org.junit.Test
	public void test() { 
		
		GameMethod gameMethod = new GameMethod();
		String choice1 = GameMethod.getWinner("rock","PAPER");
		Assert.assertEquals("Computer wins!", choice1); 
		String choice2 = gameMethod.getWinner("rock","ROCK");
		Assert.assertEquals("Draw!", choice2);
		String choice3 = gameMethod.getWinner("rock","SCISSORS");
		Assert.assertEquals("User wins!", choice3);
	    String choice4 = gameMethod.getWinner("paper","ROCK");
	    Assert.assertEquals("User wins!", choice4); 
	    String choice5 = gameMethod.getWinner("paper","PAPER");
	    Assert.assertEquals("Draw!", choice5);
	    String choice6 = gameMethod.getWinner("paper","SCISSORS");
	    Assert.assertEquals("Computer wins!", choice6);
	    String choice7 = gameMethod.getWinner("scissors","PAPER");
	    Assert.assertEquals("User wins!", choice7);
	    String choice8 = gameMethod.getWinner("scissors","ROCK");
	    Assert.assertEquals("Computer wins!", choice8);
	    String choice9 = gameMethod.getWinner("scissors","SCISSORS"); 
	    Assert.assertEquals("Draw!", choice9);
	}
}
