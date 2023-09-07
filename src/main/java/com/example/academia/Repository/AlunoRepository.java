package com.example.academia.Repository;

import com.example.academia.Entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
