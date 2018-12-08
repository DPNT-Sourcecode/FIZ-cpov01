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
	
	@Test
	public void testNumber() {
		//given
		int input = 4;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("4",is(equalTo(actual)));
	}
	
	@Test
	public void testContains3ButNotDivisibleBy3() {
		//given
		int input = 31;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("fizz",is(equalTo(actual)));
	}
	
	@Test
	public void testContains5ButNotDivisibleBy5() {
		//given
		int input = 52;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("buzz",is(equalTo(actual)));
	}
	
	@Test
	public void testContains3And5() {
		//given
		int input = 35;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("fizz buzz",is(equalTo(actual)));
	}
	
	@Test
	public void testFizBuzzDeluxe() {
		//given
		int input = 555;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("fizz buzz fake deluxe",is(equalTo(actual)));
	}
	
	//@Test
	public void testFizDeluxe() {
		//given
		int input = 111;
		//when 
		String actual = fizzBuzzSolution.fizzBuzz(input);
		//then
		assertThat("fizz fake deluxe",is(equalTo(actual)));
	}

}


