package com.kelompok2.selfOrderApp.selfOrderAppBackend.controllers;

import com.kelompok2.selfOrderApp.selfOrderAppBackend.models.Transaction;
import com.kelompok2.selfOrderApp.selfOrderAppBackend.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "http://localhost:3000")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepo;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionRepo.findAll();
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepo.save(transaction);
    }

    @GetMapping("/{id}")
    public Transaction getById(@PathVariable Integer id) {
        return transactionRepo.findById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable Integer id, @RequestBody Transaction updated) {
    Transaction transaction = transactionRepo.findById(id).orElse(null);
    if (transaction != null) {
        transaction.setProduct(updated.getProduct());
        transaction.setCustomer(updated.getCustomer());
        transaction.setQuantity(updated.getQuantity());
        transaction.setTotal(updated.getTotal());
        transaction.setDate(updated.getDate());
        return transactionRepo.save(transaction);
    }
    return null;
}


    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Integer id) {
    transactionRepo.deleteById(id);
    }

}
