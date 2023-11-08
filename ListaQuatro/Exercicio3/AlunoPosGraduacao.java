package ListaQuatro.Exercicio3;

public class AlunoPosGraduacao implements Aluno {

    private String anoConclusaoGraduacao;
    private double nota1;
    private double nota2;
    private String ra;
    private String nome;
    private String curso;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
        this.ra = ra;
        this.nome = nome; 
        this.curso = curso;
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nRA: " + getRa() + " \nAno de Conclusão da Graduação: "
                + getAnoConclusaoGraduacao()
                + "\nNota Avaliação 1: " + getNota1() + "\nNota Avaliação 2: " + getNota2() + "\nMédia Final: "
                + calcularMedia() + "\nSituação do Aluno: "
                + verificarAprovacao();
    }

    @Override
    public String Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        throw new UnsupportedOperationException("Unimplemented method 'Aluno'");
    }
}
