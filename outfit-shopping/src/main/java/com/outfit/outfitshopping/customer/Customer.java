package com.outfit.outfitshopping.customer;

import javax.persistence.*;

@Entity
@Table
public class Customer {

    @Id
    @SequenceGenerator(

            name = " customer_sequence" ,
            sequenceName = " customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(

            strategy = GenerationType.SEQUENCE,
            generator = " customer_sequence "
    )
    private Long id;
    private String firstName;
    private String surName;
    private String email;
    private String phoneNumber;
    private String address;

    public Customer() {
    }

    public Customer(
            Long id,
            String firstName,
            String surName,
            String email,
            String phoneNumber,
            String address) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Customer(String firstName,
                    String surName,
                    String email,
                    String phoneNumber,
                    String address) {
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}

