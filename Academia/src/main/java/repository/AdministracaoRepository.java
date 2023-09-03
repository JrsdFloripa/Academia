package repository;

import com.example.academia.Entity.Administracao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AdministracaoRepository extends JpaRepository<Administracao, Long> {
}
