package br.com.gerenciamento.instituicao;

import java.util.List;

public class AlunoService {

    // Método para cadastrar um novo aluno
    public void cadastrarAluno(String nome, String dataNascimento) {
        Aluno.cadastrarAluno(nome, dataNascimento);
    }

    // Método para consultar todos os alunos cadastrados
    public List<Aluno> consultarTodosAlunos() {
        return Aluno.consultarTodosAlunos();
    }
}

