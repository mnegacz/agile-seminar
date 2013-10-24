package agile.seminar;

import static java.util.Arrays.asList;

import java.util.List;

import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

@RunWith(JUnitReportingRunner.class)
public class CalculatorJBehaveTest extends JUnitStories {

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new CalculatorSteps());
	}

	@Override
	protected List<String> storyPaths() {
		return asList("agile/seminar/calculator.story");
	}

}
