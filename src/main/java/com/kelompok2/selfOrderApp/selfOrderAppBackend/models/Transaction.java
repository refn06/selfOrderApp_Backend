// product models:
package com.kelompok2.selfOrderApp.selfOrderAppBackend.models;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaction")
    private Integer idTransaction;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    private Integer quantity;

    private Integer total;

    private LocalDate date;


    // Constructors
    public Transaction() {}

    public Transaction(Product product, Customer customer, Integer quantity, Integer total, LocalDate date) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
        this.total = total;
        this.date = date;
    }

    // Getters & Setters (atau pakai Lombok biar simple)
    public Integer getIdTransaction() { return idTransaction; }
    public void setIdTransaction(Integer idTransaction) { this.idTransaction = idTransaction; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Integer getTotal() { return total; }
    public void setTotal(Integer total) { this.total = total; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
