package POO.ListaQuatro.Exercicio2;

public class AlunoGraduacao extends Aluno {

    private String anoConclusaoEM;
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusaoEM) {
        super(ra, nome, curso);
        this.anoConclusaoEM = anoConclusaoEM;
    }

    public String getAnoConclusaoEM() {
        return anoConclusaoEM;
    }

    public void setAnoConclusaoEM(String anoConclusaoEM) {
        this.anoConclusaoEM = anoConclusaoEM;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }

    @Override
    public double calcularMedia() {
        return (getAc1() * 0.1) + (getAc2() * 0.3) + (getAg() * 0.2) + (getAf() * 0.4);
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
        return "Nome: " + getNome() + "\nRA: " + getRa() + " \nAno de Conclusão do Ensino Médio: " + getAnoConclusaoEM()
                + "\nNota AC1: " + getAc1() + "\nNota AC2: " + getAc2() + "\nNota AF: " + getAf()
                + "\nNota AG: " + getAg() + "\nMédia Final: " + calcularMedia() + "\nSituação do Aluno: "
                + verificarAprovacao();
    }

}
