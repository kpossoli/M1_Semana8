package br.com.gerenciamento.instituicao.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class AlunoModel {
    private static Integer proximoID = 1;

    // Lista estática para armazenar os alunos cadastrados
    @Getter private static List<AlunoModel> alunos = new ArrayList<>();
    @Setter (AccessLevel.NONE) private Integer id;
    private String nome;
    private LocalDate dataNascimento;

    // Método estático para controlar a sequência dos IDs
    private static Integer getProximoId() {
        return proximoID++;
    }

    public static AlunoModel inserir(AlunoModel aluno) {
        aluno.id = getProximoId();
        alunos.add(aluno);
        return aluno;
    }

    public static AlunoModel buscarPorId(Integer id) throws Exception {
        for (AlunoModel aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        throw new Exception("Aluno não encontrado");
    }
}
