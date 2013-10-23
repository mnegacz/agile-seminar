package agile.seminar;

public class CustomerValidator {

	public boolean validate(Customer customer) {
		if (customer.getName() == null || customer.getName().isEmpty()) {
			return false;
		}
		
		if ((customer.getAddress() == null || customer.getAddress().isEmpty()) && (customer.getPhoneNumber() == null || customer.getPhoneNumber().isEmpty())) {
			return false;
		}
		return true;
	}
	
}
