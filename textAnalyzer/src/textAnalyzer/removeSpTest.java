package textAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class removeSpTest {
//the test method that will run jUnit 
	@Test
	void test() {
		Main test = new Main();
		//method that is expected to remove special characters
		String output = test.removeSp("Hello!@^");
		//expected outcome. if does not match, then the test will fail
		assertEquals("Hello", output);
	}

}
