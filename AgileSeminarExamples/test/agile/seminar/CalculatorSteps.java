package agile.seminar;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CalculatorSteps {
	private Calculator calculator;
	private int x;
	private int y;
	private int result;
	
	@Given("a calculator")
	public void givenCalculator() {
		calculator = new Calculator();
	}
	
	@Given("a variable x with value $value")
	public void givenXValue(@Named("value") int value) {
		x = value;
	}
	
	@Given("a variable y with value $value")
	public void givenYValue(@Named("value") int value) {
		y = value;
	}
 
	@When("I multiply x by y with calculator")
	public void whenImultiplyXByY() {
		result = calculator.multiply(x, y);
	}
	
	@When("I add x to y with calculator")
	public void whenIaddXToY() {
		result = calculator.add(x, y);
	}
 
	@Then("result should equal $value")
	public void thenXshouldBe(@Named("value") int value) {
		assertEquals(value, result);
	}
}
