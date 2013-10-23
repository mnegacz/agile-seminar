package agile.seminar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooTest {

	@Test
	public void shouldReturnFooBarString() {
		Foo foo = new Foo();
		assertEquals("FooBar", foo.bar());
	}
}
