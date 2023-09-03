package com.example.academia.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String aula;
    private String turno;
    private Administracao matricula;

    @OneToMany(mappedBy = "aula")
    private List<Aluno> alunos;
}
