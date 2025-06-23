package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BirthstoneDay;

import java.util.Optional;

public interface BirthstoneDayRepository extends JpaRepository<BirthstoneDay, Long> {
    Optional<BirthstoneDay> findByMonthAndDay(int month, int day);
}
