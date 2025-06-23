package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "gemstones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gemstone {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    private String meaning;
}