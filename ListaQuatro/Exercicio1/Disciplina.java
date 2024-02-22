package ListaQuatro.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private int codigo;
    private String nome;
    List<String> disciplinas = new ArrayList<String>();

    public Disciplina() {
    }

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNome: " + nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina(String professor) {
        disciplinas.add(professor);
    }

    @SuppressWarnings("unlikely-arg-type")
    public void removerDisciplina(Professor professor) {
        disciplinas.remove(professor);
    }

}
