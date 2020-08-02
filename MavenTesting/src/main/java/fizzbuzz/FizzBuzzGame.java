package fizzbuzz;

public class FizzBuzzGame {

	public String play(int testVal) {
		boolean factorOfThree = isMultipleOf(testVal, 3);
		boolean factorOfFive = isMultipleOf(testVal, 5);
		
		if (factorOfThree 
		  && factorOfFive)
		{
			return "FizzBuzz";
		}
		else if (factorOfThree)
		{
			return "Fizz";
		}
		else if (factorOfFive)
		{
			return "Buzz";
		}
		else
		{
			return Integer.toString(testVal);
		}
	}

	private boolean isMultipleOf(int testVal, int divisor)
	{
		return (testVal % divisor == 0);
	}
}
