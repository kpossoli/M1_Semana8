package br.com.gerenciamento.instituicao.controller;

import br.com.gerenciamento.instituicao.model.Curso;
import br.com.gerenciamento.instituicao.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    // Construtor com injeção de dependência
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    // Endpoint para cadastrar um novo curso (POST)
    @PostMapping
    public ResponseEntity<Curso> cadastrarCurso(@RequestBody Curso curso) {
        Curso novoCurso = cursoService.cadastrarCurso(curso.getNome(), curso.getDescricao(), curso.getCargaHoraria());
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCurso);
    }

    // Endpoint para consultar todos os cursos (GET)
    @GetMapping
    public ResponseEntity<List<Curso>> consultarTodosCursos() {
        List<Curso> cursos = cursoService.consultarTodosCursos();
        return ResponseEntity.ok(cursos);
    }
}
