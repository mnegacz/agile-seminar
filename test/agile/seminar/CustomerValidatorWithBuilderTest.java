package agile.seminar;

import static agile.seminar.CustomerBuilder.aCustomer;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CustomerValidatorWithBuilderTest {

	@Test
	public void shouldValidateCustomer() {
		CustomerValidator validator = new CustomerValidator();
		Customer customer = aCustomer()
				.likeSomeWoodenCustomer()
				.build();

		boolean result = validator.validate(customer);
		
		assertTrue(result);
	}

	@Test
	public void shouldNotValidateCustomerWithBlankName() {
		CustomerValidator validator = new CustomerValidator();
		Customer customer = aCustomer()
				.likeSomeWoodenCustomer()
				.but()
				.withName("")
				.build();

		boolean result = validator.validate(customer);
		
		assertFalse(result);
	}

	@Test
	public void shouldNotValidateCustomerWithBlankAddressAndPhoneNumber() {
		CustomerValidator validator = new CustomerValidator();
		Customer customer = aCustomer()
				.likeSomeNegativeBalanceCustomer()
				.but()
				.withAddress("")
				.and()
				.withPhoneNumber("")
				.build();

		boolean result = validator.validate(customer);
		
		assertFalse(result);
	}

}
