package com.noctowl.pdv.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor @AllArgsConstructor
@Data
@Entity
@Table(name="user_db")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String name;
    private boolean isEnabled;

    @OneToMany(mappedBy = "user")
    private List<Sale> sales;

}
