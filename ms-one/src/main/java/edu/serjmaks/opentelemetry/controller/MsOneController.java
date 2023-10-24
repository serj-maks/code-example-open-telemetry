package edu.serjmaks.opentelemetry.controller;

import edu.serjmaks.opentelemetry.entity.Customer;
import edu.serjmaks.opentelemetry.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
public class MsOneController {

    private final RestTemplate restTemplate;
    private final CustomerRepository customerRepository;

    public MsOneController(RestTemplate restTemplate, CustomerRepository customerRepository) {
        this.restTemplate = restTemplate;
        this.customerRepository = customerRepository;
    }

    @PostMapping
    public ResponseEntity<Customer> post(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @GetMapping
    public ResponseEntity<String> get() {
        return restTemplate.getForEntity("http://ms-two:8081/", String.class);
    }
}
