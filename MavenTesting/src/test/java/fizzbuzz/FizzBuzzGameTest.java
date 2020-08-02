package fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzGameTest {

  private FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

  @Test
  public void leaveNormalNumbersAlone() 
  {
    assertEquals(Integer.toString(1), fizzBuzzGame.play(1));
  }

  @Test
  public void multiplesOfThreeReturnFizz()
  {
	  assertEquals("Fizz", fizzBuzzGame.play(3));
	  assertEquals("Fizz", fizzBuzzGame.play(12));
  }
  
  @Test
  public void multiplesOfFiveReturnBuzz()
  {
	  assertEquals("Buzz", fizzBuzzGame.play(5));
	  assertEquals("Buzz", fizzBuzzGame.play(20));
  }
  
  @Test
  public void multiplesOfThreeAndFiveReturnFizzBuzz()
  {
	  assertEquals("FizzBuzz", fizzBuzzGame.play(15));
	  assertEquals("FizzBuzz", fizzBuzzGame.play(30));
  }
}