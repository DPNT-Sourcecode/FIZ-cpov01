package befaster.solutions.FIZ;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionTest {
  
	FizzBuzzSolution fizzBuzzSolution;
	@Before
	public void setUp() throws Exception {
		
		fizzBuzzSolution  = new FizzBuzzSolution ();
	}

	@Test
	public void testFizz() {
		//given
		int input = 3;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(3);
		//then
		assertThat("fizz",is(equalTo(actual)));
	}

}

