package Test;

import org.junit.Assert;

import App.GameMethod;



public class GameTest {

	@org.junit.Test
	public void test() {
		
		GameMethod choice = new GameMethod();
		String choice1 = GameMethod.getWinner("rock","paper");
		Assert.assertEquals("Computer wins!", choice1);
		String choice2 = GameMethod.getWinner("rock","rock");
		Assert.assertEquals("Draw!", choice2);
		String choice3 = GameMethod.getWinner("rock","scissors");
		Assert.assertEquals("User wins!", choice3);
	    String choice4 = GameMethod.getWinner("paper","rock");
	    Assert.assertEquals("User wins!", choice4);
	    String choice5 = GameMethod.getWinner("paper","paper");
	    Assert.assertEquals("Draw!", choice5);
	    String choice6 = GameMethod.getWinner("paper","scissors");
	    Assert.assertEquals("Computer wins!", choice6);
	    String choice7 = GameMethod.getWinner("scissors","paper");
	    Assert.assertEquals("User wins!", choice7);
	    String choice8 = GameMethod.getWinner("scissors","rock");
	    Assert.assertEquals("Computer wins!", choice8);
	    String choice9 = GameMethod.getWinner("scissors","scissors");
	    Assert.assertEquals("Draw!", choice9);
	}
}
