package befaster.solutions.FIZ;


public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {
		if ((number % 15) == 0)
			return "fizz buzz";
		if (isFizz(number))
			return "fizz";
		if ((number % 5) == 0)
			return "buzz";

		return String.valueOf(number);
	}
	
	private boolean isFizz(Integer number) {
		return ( (number % 3) == 0) || (String.valueOf(number).indexOf("3")>=0);
	}

}




