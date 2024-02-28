package br.com.gerenciamento.instituicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    // Atributos
    private static int proximoID = 1;
    private int ID;
    private String nome;
    private String descricao;
    private int cargaHoraria;

    // Lista estática para armazenar os cursos cadastrados
    private static List<Curso> cursosCadastrados = new ArrayList<>();

    public Curso(String nome, String descricao, int cargaHoraria) {
        this.ID = proximoID++; // Incrementado a cada novo curso
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        cursosCadastrados.add(this); // Adicionando o curso à lista de cursos cadastrados
    }

    // Métodos de acesso
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

    // Método estático para consultar todos os cursos cadastrados
    public static List<Curso> consultarTodosCursos() {
        return cursosCadastrados;
    }

    // Método estático para cadastrar um novo curso
    public static void cadastrarCurso(String nome, String descricao, int cargaHoraria) {
        new Curso(nome, descricao, cargaHoraria); // Criando uma nova instância de Curso e adicionando à lista de cursos cadastrados
    }
}
