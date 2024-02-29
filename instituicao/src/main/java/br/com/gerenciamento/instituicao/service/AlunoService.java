package br.com.gerenciamento.instituicao.service;

import br.com.gerenciamento.instituicao.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    // Método para cadastrar um novo aluno
    public Aluno cadastrarAluno(String nome, String dataNascimento) {
        return Aluno.cadastrarAluno(nome, dataNascimento);
    }

    // Método para consultar todos os alunos cadastrados
    public List<Aluno> consultarTodosAlunos() {
        return Aluno.consultarTodosAlunos();
    }
}



