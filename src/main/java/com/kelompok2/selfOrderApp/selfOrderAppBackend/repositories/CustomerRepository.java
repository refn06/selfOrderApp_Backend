package com.kelompok2.selfOrderApp.selfOrderAppBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelompok2.selfOrderApp.selfOrderAppBackend.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // bisa tambah query custom kalau mau nanti
}