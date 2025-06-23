package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "birthstone_days")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BirthstoneDay {

    @Id
    private Long id;

    @Column(name = "month", nullable = false)
    private int month;

    @Column(name = "day", nullable = false)
    private int day;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gemstone_id", referencedColumnName = "id")
    private Gemstone gemstone;
}
