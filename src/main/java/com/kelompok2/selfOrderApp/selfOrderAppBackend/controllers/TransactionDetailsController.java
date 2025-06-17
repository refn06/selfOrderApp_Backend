package com.kelompok2.selfOrderApp.selfOrderAppBackend.controllers;

import com.kelompok2.selfOrderApp.selfOrderAppBackend.models.TransactionDetails;
import com.kelompok2.selfOrderApp.selfOrderAppBackend.repositories.TransactionDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction_details")
@CrossOrigin(origins = "http://localhost:3000") 
public class TransactionDetailsController {

    @Autowired
    private TransactionDetailsRepository transactionDetailsRepo;

    @GetMapping
    public List<TransactionDetails> getAllTransactions() {
        return transactionDetailsRepo.findAll();
    }

    @PostMapping
    public TransactionDetails createTransaction(@RequestBody TransactionDetails transactionDetails) {
        return transactionDetailsRepo.save(transactionDetails);
    }

    @GetMapping("/{id}")
    public TransactionDetails getById(@PathVariable Integer id) {
        return transactionDetailsRepo.findById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public TransactionDetails updateTransactionDetails(@PathVariable Integer id, @RequestBody TransactionDetails updated) {
    TransactionDetails transactionDetails = transactionDetailsRepo.findById(id).orElse(null);
    if (transactionDetails != null) {
        transactionDetails.setProduct(updated.getProduct());
        transactionDetails.setTransaction(updated.getTransaction());
        transactionDetails.setQuantity(updated.getQuantity());
        transactionDetails.setSubTotal(updated.getSubTotal());
        return transactionDetailsRepo.save(transactionDetails);
    }
    return null;
}


    @DeleteMapping("/{id}")
    public void deleteTransactionDetails(@PathVariable Integer id) {
    transactionDetailsRepo.deleteById(id);
    }

}
