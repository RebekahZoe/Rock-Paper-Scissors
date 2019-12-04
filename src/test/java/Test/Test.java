package Test;

import org.junit.Assert;



public class Test {

	@org.junit.Test
	public void test() {
		
		GameMethod choice = new GameMethod("rock","paper");
		Assert.assertEquals("Computer wins!", choice);
		GameMethod choice2 = new GameMethod("rock","rock");
		Assert.assertEquals("Draw!", choice2);
		GameMethod choice3 = new GameMethod("rock","scissors");
		Assert.assertEquals("User wins!", choice3);
	    GameMethod choice4 = new GameMethod("paper","rock");
	    Assert.assertEquals("User wins!", choice4);
	    GameMethod choice5 = new GameMethod("paper","paper");
	    Assert.assertEquals("Draw!", choice5);
	    GameMethod choice6 = new GameMethod("paper","scissors");
	    Assert.assertEquals("Computer wins!", choice6);
	    GameMethod choice7 = new GameMethod("scissors","paper");
	    Assert.assertEquals("User wins!", choice7);
	    GameMethod choice8 = new GameMethod("scissors","rock");
	    Assert.assertEquals("Computer wins!", choice8);
	    GameMethod choice9 = new GameMethod("scissors","scissors");
	    Assert.assertEquals("Draw!", choice9);
	}
}
