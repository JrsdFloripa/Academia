package com.example.academia.Controller;

import com.example.academia.Entity.Administracao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.GerenciamentoService;

@RestController
@RequestMapping("/api/academia")
public class GerControler {

    private final GerenciamentoService gerenciamentoService;

    public GerControler(GerenciamentoService gerenciamentoService) {
        this.gerenciamentoService = gerenciamentoService;
    }


    @GetMapping("/malhacao")
    public ResponseEntity<String> Malhacao(){
        return "malhando cabecao";
    }
    try {
        gerenciamentoService.salvarAdministracao(administracao);
    }catch (Exception exception)
        return new ResponseEntity<>("Erro",HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>("Administracao cadastrada com sucesso", HttpStatus.CREATED);
}

