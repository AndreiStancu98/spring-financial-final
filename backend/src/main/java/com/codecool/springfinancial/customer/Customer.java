//package com.codecool.springfinancial.customer;
//
//import org.apache.tomcat.jni.Local;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.time.Period;
//import java.util.Objects;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//
//@Entity
//@Table
//public class Customer {
//    @Id
//    @SequenceGenerator(
//            name = "customer_sequence",
//            sequenceName = "customer_sequence",
//            allocationSize = 1
//    )
//
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "customer_sequence"
//    )
//
//    private Long id;
//    @NotBlank
//    private String firstName;
//    @NotBlank
//    private String lastName;
//    @NotBlank
//    private LocalDate dob;
//    @Transient
//    private Integer age;
//    @NotBlank
//    private String address;
//    @NotBlank
//    @Size(max = 20)
//    @Email
//    private String email;
//    @NotBlank
//    private LocalDate idIssued;
//    @NotBlank
//    private LocalDate idExpiry;
//    @NotBlank
//    private String gender;
//    @NotBlank
//    private String pid;
//    @NotBlank
//    private String password;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "user_roles",
//        joinColumns = @JoinColumn(name = "")
//    )
