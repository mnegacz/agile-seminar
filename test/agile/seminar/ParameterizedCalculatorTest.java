package agile.seminar;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedCalculatorTest {

	static Calculator calculator;

	int firstNumber;

	int secondNumber;

	int expectedResult;

	public ParameterizedCalculatorTest(int firstNumber, int secondNumber, int expectedResult) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> getTestParameters() {
		Collection<Object[]> parameters = Arrays.asList(new Object[][] {
				{1, 2, 3}, // firstNumer, secondNumber, expectedResult
				{0, 0, 0}, // firstNumer, secondNumber, expectedResult
				{5, 5, 10} // firstNumer, secondNumber, expectedResult
		});
		return parameters;
	}

	@BeforeClass
	public static void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void shouldAddNumbers() {
		int result = calculator.add(firstNumber, secondNumber);
		Assert.assertEquals(expectedResult, result);
	}

}
