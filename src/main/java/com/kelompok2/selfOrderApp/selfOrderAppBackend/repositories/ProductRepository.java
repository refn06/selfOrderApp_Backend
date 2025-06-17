package com.kelompok2.selfOrderApp.selfOrderAppBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelompok2.selfOrderApp.selfOrderAppBackend.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // bisa tambah query custom kalau mau nanti
}