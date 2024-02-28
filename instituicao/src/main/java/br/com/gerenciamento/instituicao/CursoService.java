package br.com.gerenciamento.instituicao;

import java.util.List;

public class CursoService {

    // Método para cadastrar um novo curso
    public void cadastrarCurso(String nome, String descricao, int cargaHoraria) {
        Curso.cadastrarCurso(nome, descricao, cargaHoraria);
    }

    // Método para consultar todos os cursos cadastrados
    public List<Curso> consultarTodosCursos() {
        return Curso.consultarTodosCursos();
    }
}
