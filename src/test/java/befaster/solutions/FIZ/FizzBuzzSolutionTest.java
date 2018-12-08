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
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("fizz",is(equalTo(actual)));
	}
	
	@Test
	public void testBuzz() {
		//given
		int input = 5;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("buzz",is(equalTo(actual)));
	}
	
	@Test
	public void testFizzBuzz() {
		//given
		int input = 15;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("fizz buzz",is(equalTo(actual)));
	}

}


