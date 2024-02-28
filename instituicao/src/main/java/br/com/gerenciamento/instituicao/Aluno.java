package br.com.gerenciamento.instituicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // Atributos
    private static int proximoID = 1;
    private int ID;
    private String nome;
    private String dataNascimento;

    // Lista estática para armazenar os alunos cadastrados
    private static List<Aluno> alunosCadastrados = new ArrayList<>();

    // Construtor
    public Aluno(String nome, String dataNascimento) {
        this.ID = proximoID++; // Incrementado a cada novo aluno
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        alunosCadastrados.add(this); // Adicionando o aluno à lista de alunos cadastrados
    }

    //Métodos de acesso
    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Método estático para controlar a sequência dos IDs
    public static void resetProximoID() {
        proximoID = 1;
    }

    // Método estático para consultar todos os alunos cadastrados
    public static List<Aluno> consultarTodosAlunos() {
        return alunosCadastrados;
    }

    // Método estático para cadastrar um novo aluno
    public static void cadastrarAluno(String nome, String dataNascimento) {
        new Aluno(nome, dataNascimento); // Criando uma nova instância de Aluno e adicionando à lista de alunos cadastrados
    }
}
