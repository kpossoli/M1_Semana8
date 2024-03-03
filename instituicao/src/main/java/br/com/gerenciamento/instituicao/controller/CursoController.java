package br.com.gerenciamento.instituicao.controller;

import br.com.gerenciamento.instituicao.model.CursoModel;
import br.com.gerenciamento.instituicao.model.AlunoModel;
import br.com.gerenciamento.instituicao.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {

    private final CursoService cursoService;

    // Construtor com injeção de dependência
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    // Endpoint para consultar todos os cursos (GET)
    @GetMapping
    public List<CursoModel> get() {
        return cursoService.buscarTodos();
    }

    @PostMapping
    public CursoModel post(@RequestBody CursoModel curso) throws Exception {
        return cursoService.salvar(curso);
    }

    @PostMapping("{id}/add-aluno")
    public CursoModel post(@PathVariable Integer id, @RequestBody AlunoModel aluno) throws Exception {
        return cursoService.matricular(id, aluno.getId());
    }
}
