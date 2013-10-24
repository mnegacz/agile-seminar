package agile.seminar;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = {CalculatorTest.class, FooTest.class})
public class CalculatorAndFooTest {

}
