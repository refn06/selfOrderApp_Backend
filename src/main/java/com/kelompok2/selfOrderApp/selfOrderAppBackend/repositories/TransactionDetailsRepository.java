package com.kelompok2.selfOrderApp.selfOrderAppBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kelompok2.selfOrderApp.selfOrderAppBackend.models.TransactionDetails;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Integer> {
    // bisa tambah query custom kalau mau nanti
}
