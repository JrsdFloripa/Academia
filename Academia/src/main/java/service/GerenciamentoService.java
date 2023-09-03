package service;

import com.example.academia.Entity.Administracao;
import org.springframework.stereotype.Service;
import repository.AdministracaoRepository;

@Service
public class GerenciamentoService {

    private final AdministracaoRepository administracaoRepository;

    public GerControler(AdministracaoRepository administracaoRepository) {
        this.administracaoRepository = administracaoRepository;
    }

    public Administracao salvarAdiministracao(Administracao administracao){
        administracaoRepository.save(administracao);

        return administracao;
    }

    public void excluirAdministracao(Long codigo){
        administracaoRepository.deleteById(codigo);
    }

    public Optional<Administracao> buscarAdministracaoPorcodigo(Long codigo){
        return administracaoRepository.findById(codigo);
    }
}
