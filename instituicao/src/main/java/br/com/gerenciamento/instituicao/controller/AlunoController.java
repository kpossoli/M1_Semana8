package br.com.gerenciamento.instituicao.controller;


import br.com.gerenciamento.instituicao.model.Aluno;
import br.com.gerenciamento.instituicao.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    // Construtor com injeção de dependência
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    // Endpoint para cadastrar um novo aluno (POST)
    @PostMapping
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {
        Aluno novoAluno = alunoService.cadastrarAluno(aluno.getNome(), aluno.getDataNascimento());
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAluno);
    }

    // Endpoint para consultar todos os alunos (GET)
    @GetMapping
    public ResponseEntity<List<Aluno>> consultarTodosAlunos() {
        List<Aluno> alunos = alunoService.consultarTodosAlunos();
        return ResponseEntity.ok(alunos);
    }
}

