package br.com.gerenciamento.instituicao.controller;

import br.com.gerenciamento.instituicao.model.AlunoModel;
import br.com.gerenciamento.instituicao.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    private final AlunoService alunoService;

    // Construtor com injeção de dependência
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    // Endpoint para consultar todos os alunos (GET)
    @GetMapping
    public List<AlunoModel> get() {
        return alunoService.buscarTodos();
    }

    // Endpoint para cadastrar um novo aluno (POST)
    @PostMapping
    public AlunoModel post(@RequestBody AlunoModel aluno) throws Exception {
        return alunoService.salvar(aluno);
    }


}

