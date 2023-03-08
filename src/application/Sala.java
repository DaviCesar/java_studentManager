package application;

import java.util.ArrayList;


public class Sala {


    ArrayList<Aluno> listaDeAlunos;
    public Sala(){
        this.listaDeAlunos = new ArrayList<>();
    }

    void insertAluno(Aluno novoAluno){
        novoAluno.calcularNotas();
         listaDeAlunos.add(novoAluno);
    }

    void listarAlunos(){
        System.out.println("\nLista de alunos");

        for(Aluno alunoNaLista : listaDeAlunos){
            alunoNaLista.listar();
        }
    }

    void listarSituacoes(){
        System.out.println("\nSituações");

        for(Aluno alunoNaLista : listaDeAlunos){
            alunoNaLista.situacoes();
        }
    }
}
