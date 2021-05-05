package com.codecool.springfinancial.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;

public class SignupRequest {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private LocalDate dob;
    @NotBlank
    private String address;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    @NotBlank
    private LocalDate idIssued;
    @NotBlank
    private LocalDate idExpiry;
    @NotBlank
    private String gender;
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    private Set<String> role;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getIdIssued() {
        return idIssued;
    }

    public void setIdIssued(LocalDate idIssued) {
        this.idIssued = idIssued;
    }

    public LocalDate getIdExpiry() {
        return idExpiry;
    }

    public void setIdExpiry(LocalDate idExpiry) {
        this.idExpiry = idExpiry;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
