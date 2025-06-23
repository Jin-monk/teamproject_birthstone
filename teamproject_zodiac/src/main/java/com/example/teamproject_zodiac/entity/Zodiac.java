package com.example.teamproject_zodiac.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="zodiac_sign")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Zodiac {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int startMonth;
    private int startDay;
    private int endMonth;
    private int endDay;
    private String description;
}
