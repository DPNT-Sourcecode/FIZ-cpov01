package befster.solutions.HLO;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import befaster.solutions.HLO.HelloSolution;

public class HelloSolutionTest {

	HelloSolution helloSolution;
	@Before
	public void setUp() throws Exception {
		
		helloSolution = new HelloSolution();
	}

	@Test
	public void test() {
		//Given input
		String friendName = "John";
		//when 
		String actual = helloSolution.hello(friendName);
		//then
		assertThat("Hello, "+friendName+"!",is(equalTo(actual)));
	}

}
