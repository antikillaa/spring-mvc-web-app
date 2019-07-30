package by.peshkur.springdemo.springdemo.dao;


import by.peshkur.springdemo.springdemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerDAO extends JpaRepository<Customer, UUID> {

	
}
