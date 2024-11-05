package com.HomeworkJPA.JPA.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "identity_card")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cnp", nullable = false, unique = true)
    private String CNP;

    private int number;
    private String serie;

    @OneToOne(mappedBy = "ci", fetch = FetchType.EAGER)
    @JsonBackReference
    private Author author;
}
