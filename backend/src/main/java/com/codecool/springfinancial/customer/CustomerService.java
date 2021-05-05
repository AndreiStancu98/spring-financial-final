//package com.codecool.springfinancial.customer;
//
//import com.codecool.springfinancial.location.Location;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.time.LocalDate;
//import java.util.Objects;
//import java.util.Optional;
//
//@Service
//public class CustomerService {
//    private final CustomerRepository customerRepository;
//
//    @Autowired
//    public CustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    public Optional<Customer> getCustomerById(Long id) {
//        return customerRepository.findById(id);
//    }
//
//    public Optional<Customer> getCustomerByPid(String pid) {
//        return customerRepository.findCustomerByPid(pid);
//    }
//
//    public void addNewCustomer(Customer customer) {
//        Optional<Customer> customerOptional = customerRepository.findCustomerByPid(customer.getPid());
//        if (customerOptional.isPresent()) {
//            throw new IllegalStateException("Customer with PID already exists !");
//        }
//        customerRepository.save(customer);
//    }
//
//
//    public void deleteCustomer(Long id) {
//        boolean exists = customerRepository.existsById(id);
//        if (!exists) {
//            throw new IllegalStateException("No customer with id" + id + " found !");
//        }
//
//        customerRepository.deleteById(id);
//    }
//
//    @Transactional
//    public void updateCustomer(String pid, String firstName, String lastName , String address, String email, LocalDate idIssued, LocalDate idExpiry) {
//        Customer customer = customerRepository.findCustomerByPid(pid).orElseThrow(() ->
//                new IllegalStateException("Customer with pid " + pid + " does not exist !"));
//
//        if (firstName != null && firstName.length() > 0 && !Objects.equals(customer.getFirstName(), firstName)) {
//            customer.setFirstName(firstName);
//        }
//
//        if (lastName != null && lastName.length() > 0 && !Objects.equals(customer.getLastName(), lastName)) {
//            customer.setLastName(lastName);
//        }
//
//        if (address != null && address.length() > 0 && !Objects.equals(customer.getAddress(), address)) {
//            customer.setAddress(address);
//        }
//
//        if (email != null && email.length() > 0 && !Objects.equals(customer.getEmail(), email)) {
//            customer.setEmail(email);
//        }
//
//        if (idIssued != null && !Objects.equals(customer.getId_issued(), idIssued)) {
//            customer.setId_issued(idIssued);
//        }
//
//        if (idExpiry != null && !Objects.equals(customer.getId_expiry(), idExpiry)) {
//            customer.setId_expiry(idExpiry);
//        }
//    }
//}
