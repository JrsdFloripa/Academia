package com.example.academia;

import com.example.academia.Entity.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
public class AcademiaApplication {

    public static void main(String[] args) {
            SpringApplication.run(AcademiaApplication.class, args);
            {

                    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Academia");

                    EntityManager entityManager = entityManagerFactory.createEntityManager();
                    entityManager.getTransaction().begin();
                    Aluno aluno = new Aluno();
                    aluno.setCodigo(1L);
                    aluno.setNome("Jair");
                    aluno.setIdade(45);
                    aluno.setPeso(95);
                    aluno.setCpf(123321L);

                    entityManager.persist(aluno);
                    entityManager.getTransaction().commit();
                    entityManager.close();
                    entityManagerFactory.close();

                    System.out.println("hello world");
            }
    }
}
