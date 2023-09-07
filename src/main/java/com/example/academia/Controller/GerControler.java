package com.example.academia.Controller;

import com.example.academia.Entity.Aluno;
import com.example.academia.Repository.AlunoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/academia")
public class GerControler {
    private final AlunoRepository alunoRepository;

    public GerControler(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping("/malhacao")
    public String Malhacao(){
        return "malhando cabecao";
    }

    @GetMapping("/hello")
    public ResponseEntity<Aluno> helloWorld() {
        Aluno aluno = new Aluno();
        aluno.setNome("Jair");
        aluno.setPeso(94);
        aluno.setIdade(45);
        aluno.setCpf(123321L);
        aluno.setCodigo(1);
        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }
    @PostMapping
    public String CadastrarAluno(@RequestBody Aluno aluno){

        return "aluno cadasrado com sucesso";
    }
    @PutMapping("/alterar/{nome}")
    public String AlterarAluno(@RequestBody Aluno aluno, @PathVariable("nome") String nome){
        log.info("o nome é "+ nome);
        return "Aluno alterado com sucesso";
    }

    @PatchMapping("/alteracaopeso/{codigo}")
    public String alterarPeso(@RequestBody Aluno peso, @PathVariable("85")int codigo){
        return String.valueOf(peso);

    }

}



