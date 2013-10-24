package agile.seminar;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CustomerValidatorTest {

	@Test
	public void shouldValidateCustomer() {
		CustomerValidator validator = new CustomerValidator();
		Customer customer = new Customer();
		customer.setId(1L);
		customer.setName("Bob");
		customer.setAddress("Beverly Hills 90210");
		customer.setBalance(100.10);
		customer.setPhoneNumber("691999555");
		customer.setTwitter("bobino");
		customer.setFacebook("bobski");
		customer.setType(CustomerType.WOODEN);
		
		boolean result = validator.validate(customer);
		
		assertTrue(result);
	}
	
	@Test
	public void shouldNotValidateCustomerWithBlankName() {
		CustomerValidator validator = new CustomerValidator();
		Customer customer = new Customer();
		customer.setId(1L);
		customer.setName("");
		customer.setAddress("Beverly Hills 90210");
		customer.setBalance(100.10);
		customer.setPhoneNumber("691999555");
		customer.setTwitter("bobino");
		customer.setFacebook("bobski");
		customer.setType(CustomerType.WOODEN);
		
		boolean result = validator.validate(customer);
		
		assertFalse(result);
	}
	
	@Test
	public void shouldNotValidateCustomerWithBlankAddressAndPhoneNumber() {
		CustomerValidator validator = new CustomerValidator();
		Customer customer = new Customer();
		customer.setId(1L);
		customer.setName("Alice");
		customer.setAddress("");
		customer.setBalance(-1.0);
		customer.setPhoneNumber("");
		
		boolean result = validator.validate(customer);
		
		assertFalse(result);
	}
	
}
