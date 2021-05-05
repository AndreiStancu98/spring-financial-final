package com.codecool.springfinancial.payload.response;

import java.time.LocalDate;
import java.util.List;

public class JwtResponse {
    private String token;
    private String type = "Bearer";

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String address;
    private String email;
    private LocalDate idIssued;
    private LocalDate idExpiry;
    private String gender;
    private String username;
    private List<String> roles;

    public JwtResponse(String accessToken, Long id, String firstName, String lastName, LocalDate dob, String address, String email, LocalDate idIssued, LocalDate idExpiry, String gender, String username, List<String> roles) {
        this.token = accessToken;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.idIssued = idIssued;
        this.idExpiry = idExpiry;
        this.gender = gender;
        this.username = username;
        this.roles = roles;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
