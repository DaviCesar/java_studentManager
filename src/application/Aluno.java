package application;

import java.util.ArrayList;

public class Aluno {
    float total;
    ArrayList<Float> notasAluno = new ArrayList<>();

    String nome, cpf, situacao = "reprovado";

    public Aluno(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    void insertNotas(float nota){
        notasAluno.add(nota);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void listar() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("CPF: " + this.cpf);

        for (int i = 0; i < notasAluno.size(); i++) {
            System.out.println("Nota " + ( i + 1) + ": " + this.notasAluno.get(i));
        }
    }
    void situacoes(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nTotal: " + this.total);
        System.out.println("\nSituação: " + this.situacao);
    }

    void calcularNotas(){
        for(float nota:notasAluno){
            total = total + nota;
        }

        if (total >= 60){
            this.situacao = "aprovado";
        }else {
            this.situacao = "reprovado";
        }
    }

    public ArrayList<Float> getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(ArrayList<Float> notasAluno) {
        this.notasAluno = notasAluno;
    }
}
