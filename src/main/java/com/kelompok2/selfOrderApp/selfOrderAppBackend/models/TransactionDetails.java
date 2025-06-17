package com.kelompok2.selfOrderApp.selfOrderAppBackend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "transaction_details")
public class TransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_transaction")
    private Transaction transaction;

    private Integer quantity;

    private Integer subTotal;


    // Constructors
    public TransactionDetails() {}

    public TransactionDetails(Product product, Transaction transaction, Integer quantity, Integer subTotal) {
        this.product = product;
        this.transaction = transaction;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    // Getters & Setters (atau pakai Lombok biar simple)
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public Transaction getTransaction() { return transaction; }
    public void setTransaction(Transaction transaction) { this.transaction = transaction; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Integer getSubTotal() { return subTotal; }
    public void setSubTotal(Integer subTotal) { this.subTotal = subTotal; }
}
