package br.com.gerenciamento.instituicao.service;

import br.com.gerenciamento.instituicao.model.Curso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    // Método para cadastrar um novo curso
    public Curso cadastrarCurso(String nome, String descricao, int cargaHoraria) {
        Curso novoCurso = new Curso(nome, descricao, cargaHoraria);
        return novoCurso;
    }

    // Método para consultar todos os cursos cadastrados
    public List<Curso> consultarTodosCursos() {
        return Curso.consultarTodosCursos();
    }
}
