package Test;

import org.junit.Assert;



public class Test {

	@org.junit.Test
	public void test() {
		
		GameMethod choice =  GameMethod();
		GameMethod choice = GameMethod.getWinner("rock","paper");
		Assert.assertEquals("Computer wins!", choice);
		GameMethod choice2 = GameMethod.getWinner("rock","rock");
		Assert.assertEquals("Draw!", choice2);
		GameMethod choice3 = GameMethod.getWinner("rock","scissors");
		Assert.assertEquals("User wins!", choice3);
	    GameMethod choice4 = GameMethod.getWinner("paper","rock");
	    Assert.assertEquals("User wins!", choice4);
	    GameMethod choice5 = GameMethod.getWinner("paper","paper");
	    Assert.assertEquals("Draw!", choice5);
	    GameMethod choice6 = GameMethod.getWinner("paper","scissors");
	    Assert.assertEquals("Computer wins!", choice6);
	    GameMethod choice7 = GameMethod.getWinner("scissors","paper");
	    Assert.assertEquals("User wins!", choice7);
	    GameMethod choice8 = GameMethod.getWinner("scissors","rock");
	    Assert.assertEquals("Computer wins!", choice8);
	    GameMethod choice9 = GameMethod.getWinner("scissors","scissors");
	    Assert.assertEquals("Draw!", choice9);
	}
}
