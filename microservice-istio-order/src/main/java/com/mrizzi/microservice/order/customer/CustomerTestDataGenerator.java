package com.mrizzi.microservice.order.customer;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class CustomerTestDataGenerator {

	private final CustomerRepository customerRepository;

	public CustomerTestDataGenerator(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	private void createIfNotExist(String firstname, String name, String email, String street, String city) {
		if (customerRepository.findByName(name).size() == 0) {
			customerRepository.save(new Customer(firstname, name, email, street, city));
		}
	}

	@PostConstruct
	public void generateTestData() {
		createIfNotExist("Marwa", "Rizzi", "marwarizi88@gmail.com", "Port-Royal", "Paris");
		createIfNotExist("Cat", "Branchman", "cat@somewhere.com", "Meaw", "Furrr");
	}

}
