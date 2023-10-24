package edu.serjmaks.opentelemetry.repository;

import edu.serjmaks.opentelemetry.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {}
