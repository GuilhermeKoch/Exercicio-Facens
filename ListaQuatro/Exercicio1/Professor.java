package ListaQuatro.Exercicio1;

import java.util.ArrayList;

public class Professor extends Funcionario {

    private String urlCurriculoLattes;
    private ArrayList<String> disciplina;

    public Professor() {
    }

    public Professor(String nome, String cpf, int numeroCracha, double salario, String urlCurriculoLattes) {
        super(nome, cpf, numeroCracha, salario);
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nUrl Curriculo Lattes do Professor: " + urlCurriculoLattes +
                "\nDisciplinas do Professor: " + disciplina;
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public void adicionarDisciplina(String l) {
        disciplina.add((String) l);
    }

    public void removerDisciplina(Disciplina l) {
        disciplina.add(String.valueOf(l));
    }

    public void removerDisciplina(int index) {
        disciplina.remove(index);
        this.disciplina.remove((index));

    }

    public Disciplina getDisciplina(int index) {
        disciplina.get(index);
        this.disciplina.get(index);
        return null;
    }

}
