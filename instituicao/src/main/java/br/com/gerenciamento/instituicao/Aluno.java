package br.com.gerenciamento.instituicao;

public class Aluno {
    private static int proximoID = 1;
    private int ID;
    private String nome;
    private String dataNascimento;

    // Atributos
    public Aluno(String nome, String dataNascimento) {
        this.ID = proximoID++; // Incrementado a cada novo aluno
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

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
}
