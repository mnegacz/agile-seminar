package agile.seminar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	static Calculator calculator;

	@BeforeClass
	public static void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void shouldReturnTwoWhenDivideEightByFour() {
		int result = calculator.divide(8, 4);
		assertEquals(2, result);
	}

	@Test(expected = ArithmeticException.class)
	public void shouldThrowExceptionWhenDivideByZero() {
		calculator.divide(8, 0);
	}

	@Test
	@Ignore
	public void shouldFail() {
		fail();
	}

}
