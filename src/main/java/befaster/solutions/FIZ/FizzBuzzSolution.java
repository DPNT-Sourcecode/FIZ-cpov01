package befaster.solutions.FIZ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {
		boolean even  = ((number%2)==0);
		if (even) {
		if (isFizz(number) && isBuzz(number) && isDeluxe(number))
			return "fizz buzz deluxe";
		if (isFizz(number) && isDeluxe(number))
			return "fizz deluxe";
		if (isBuzz(number) && isDeluxe(number))
			return "buzz deluxe";
		if (isFizz(number) && isBuzz(number))
			return "fizz buzz";
		if (isFizz(number))
			return "fizz";
		if (isBuzz(number))
			return "buzz";
		if (isDeluxe(number))
			return "deluxe";
		return String.valueOf(number);
		}else {
			if (isFizz(number) && isBuzz(number) && isDeluxe(number))
				return "fizz buzz fake deluxe";
			if (isFizz(number) && isDeluxe(number))
				return "fizz fake deluxe";
			if (isBuzz(number) && isDeluxe(number))
				return "buzz fake deluxe";
			if (isFizz(number) && isBuzz(number))
				return "fizz buzz";
			if (isFizz(number))
				return "fizz";
			if (isBuzz(number))
				return "buzz";
			if (isDeluxe(number))
				return "fake deluxe";
			return String.valueOf(number);
		}
	}

	private boolean isFizz(Integer number) {
		return ((number % 3) == 0) || (String.valueOf(number).indexOf("3") >= 0);
	}

	private boolean isBuzz(Integer number) {
		return ((number % 5) == 0) || (String.valueOf(number).indexOf("5") >= 0);
	}
	
	private boolean isDeluxe(Integer number) {
		return (((number % 3) == 0) && (String.valueOf(number).indexOf("3") >= 0)
				||
				((number % 5) == 0) && (String.valueOf(number).indexOf("5") >= 0));
	}

	private boolean isDeluxeDepr(Integer number) {
		if (number < 11)
			return false;
		Set s = new HashSet(Arrays.asList(String.valueOf(number).split("")));
		return (s.size() == 1);
	}

}


