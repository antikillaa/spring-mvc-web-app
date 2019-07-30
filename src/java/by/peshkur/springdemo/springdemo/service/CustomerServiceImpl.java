package by.peshkur.springdemo.springdemo.service;


import by.peshkur.springdemo.springdemo.dao.CustomerDAO;
import by.peshkur.springdemo.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerServiceImpl {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.findAll();
	}

	@Transactional
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveAndFlush(theCustomer);
	}

	@Transactional
	public Optional<Customer> getCustomer(UUID theId) {
		
		return customerDAO.findById(theId);
	}

	@Transactional
	public void deleteCustomer(UUID theId) {
		
		customerDAO.deleteById(theId);
	}
}





