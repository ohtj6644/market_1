package com.example.market.market.repository;


import com.example.market.market.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerketRepository extends JpaRepository<Market, Integer> {
}
