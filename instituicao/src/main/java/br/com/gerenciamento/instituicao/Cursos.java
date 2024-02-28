package br.com.gerenciamento.instituicao;

public class Curso {

    // Atributos
    private static int proximoID = 1;
    private int ID;
    private String nome;
    private String descricao;
    private int cargaHoraria;

    public Curso(String nome, String descricao, int cargaHoraria) {
        this.ID = proximoID++; // Incrementado a cada novo curso
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Método estático para controlar a sequência dos IDs
    public static void resetProximoID() {
        proximoID = 1;
    }
}
