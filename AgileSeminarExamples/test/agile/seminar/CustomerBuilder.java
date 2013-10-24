package agile.seminar;

public class CustomerBuilder {

	private Long id;

	private String name;

	private String address;

	private String phoneNumber;

	private Double balance;

	private String facebook;

	private String twitter;

	private CustomerType type;

	public static CustomerBuilder aCustomer() {
        return new CustomerBuilder();
    }
	
	public CustomerBuilder but() {
		return this;
	}
	
	public CustomerBuilder and() {
		return this;
	}
	
	public CustomerBuilder likeSomeWoodenCustomer() {
		id = 1L;
		name = "Bob";
		address = "Beverly Hills 90210";
		balance = 100.10;
		phoneNumber = "691999555";
		twitter = "bobino";
		facebook = "bobski";
		type = CustomerType.WOODEN;
		return this;
	}
	
	public CustomerBuilder likeSomeNegativeBalanceCustomer() {
		id = 1L;
		name = "Alice";
		address = "Wybrze¿e Wyspiañskiego 5";
		balance = -1.0;
		phoneNumber = "691999555";
		return this;
	}
	
	public CustomerBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public CustomerBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public CustomerBuilder withAddress(String address) {
		this.address = address;
		return this;
	}

	public CustomerBuilder withPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public CustomerBuilder withBalance(Double balance) {
		this.balance = balance;
		return this;
	}

	public CustomerBuilder withFacebook(String facebook) {
		this.facebook = facebook;
		return this;
	}

	public CustomerBuilder withTwitter(String twitter) {
		this.twitter = twitter;
		return this;
	}

	public CustomerBuilder withType(CustomerType type) {
		this.type = type;
		return this;
	}
	
	public Customer build() {
		Customer customer = new Customer();
		customer.setAddress(address);
		customer.setBalance(balance);
		customer.setFacebook(facebook);
		customer.setId(id);
		customer.setName(name);
		customer.setPhoneNumber(phoneNumber);
		customer.setTwitter(twitter);
		customer.setType(type);
		return customer;
	}
}
