package com.example.academia.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Administracao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricula;
    private Date inicio;
    private boolean mensalidade;
    @ManyToOne
    @JoinColumn(name = "aluno")
    private Aluno nome;
}
