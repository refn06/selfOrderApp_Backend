package com.kelompok2.selfOrderApp.selfOrderAppBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kelompok2.selfOrderApp.selfOrderAppBackend.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    // bisa tambah query custom kalau mau nanti
}
