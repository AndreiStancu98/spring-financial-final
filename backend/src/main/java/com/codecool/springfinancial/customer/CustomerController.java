//package com.codecool.springfinancial.customer;
//
//import org.apache.tomcat.jni.Local;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.Optional;
//
//@RestController
//public class CustomerController {
//    private final CustomerService customerService;
//
//    @Autowired
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping(path = "api/customer/id={id}")
//    public Optional<Customer> getCustomerById(@PathVariable("id") Long id) {
//        return customerService.getCustomerById(id);
//    }
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping(path = "api/customer/pid={pid}")
//    public Optional<Customer> getCustomerByPid(@PathVariable("pid") String pid) {
//        return customerService.getCustomerByPid(pid);
//    }
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @PostMapping(path = "api/customer/new-customer")
//    public void addNewCustomer (@RequestBody Customer customer){
//        customerService.addNewCustomer(customer);
//    }
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @DeleteMapping(path = "api/customer/delete/id={id}")
//    public void deleteCustomer(@PathVariable("id") Long id) {
//        customerService.deleteCustomer(id);
//    }
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @PutMapping(path = "api/customer/update/pid={pid}")
//    public void updateCustomer(
//            @PathVariable("pid") String pid,
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName,
//            @RequestParam(required = false) String address,
//            @RequestParam(required = false) String email,
//            @RequestParam(required = false) LocalDate idIssued,
//            @RequestParam(required = false) LocalDate idExpiry) {
//        customerService.updateCustomer(pid, firstName, lastName, address, email, idIssued, idExpiry);
//    }
//
//}
