// product models:
package com.kelompok2.selfOrderApp.selfOrderAppBackend.models;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Integer idCustomer;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "phone_number")
    private String phoneNumber;

    // Constructors
    public Customer() {}

    public Customer(Integer idCustomer, String customerName, String phoneNumber) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    // Getters & Setters (atau pakai Lombok biar simple)
    public Integer getIdCustomer() { return idCustomer; }
    public void setIdCustomer(Integer idCustomer) { this.idCustomer = idCustomer; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
