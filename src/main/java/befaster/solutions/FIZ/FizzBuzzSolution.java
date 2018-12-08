package befaster.solutions.FIZ;


public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {
		if (isFizz(number) && isBuzz(number))
			return "fizz buzz";
		if (isFizz(number))
			return "fizz";
		if (isBuzz(number))
			return "buzz";

		return String.valueOf(number);
	}
	
	private boolean isFizz(Integer number) {
		return ( (number % 3) == 0) || (String.valueOf(number).indexOf("3")>=0);
	}
	
	private boolean isBuzz(Integer number) {
		return ( (number % 5) == 0) || (String.valueOf(number).indexOf("5")>=0);
	}

}

