package br.com.gerenciamento.instituicao.service;

import br.com.gerenciamento.instituicao.model.AlunoModel;
import br.com.gerenciamento.instituicao.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final AlunoService alunoService;

    public CursoService(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public List<CursoModel> buscarTodos() {
        return CursoModel.getCursos();
    }

    public CursoModel buscarPorId(Integer id) throws Exception {
        return CursoModel.buscarPorId(id);
    }

    public CursoModel salvar(CursoModel curso) throws Exception {
        if (!validar(curso)) {
            return null;
        }
        return CursoModel.inserir(curso);
    }

    public CursoModel matricular(Integer id, Integer alunoId) throws Exception {
        CursoModel curso = buscarPorId(id);
        AlunoModel aluno = alunoService.buscarPorId(alunoId);
        CursoModel.matricular(curso, aluno);
        return curso;
    }

    private boolean validar(CursoModel curso) throws Exception {
        if (curso.getNome() == null || curso.getNome().isBlank()) {
            throw new Exception("Nome é obrigatório!");
        }

        if (curso.getCargaHoraria() == null) {
            throw new Exception("Carga horária é obrigatório!");
        }

        return true;
    }
}
