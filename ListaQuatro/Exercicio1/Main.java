package ListaQuatro.Exercicio1;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Disciplina> disciplinas = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Atendente> atendentes = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();

        boolean Valido = false;
        boolean sair = true;
        Object[] opcao = {"Inserir Disciplina", "Inserir Professor", "Inserir Atendente", "Inserir Aluno", "Adicionar Disciplina ao professor", "Mostrar Pessoas", "Sair"};
        while (sair) {
            Object selectValue = JOptionPane.showInputDialog(null, "Escolha uma opção", "Instituição",
                    JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (selectValue == null || selectValue.equals("Sair")) {
                sair = false;
            } else if (selectValue.equals("Inserir Disciplina")) {
                String codigo = JOptionPane.showInputDialog("Digite o codigo da disciplina:");
                String nomeDoCurso = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
                Disciplina d1 = new Disciplina(Integer.parseInt(codigo), nomeDoCurso);
                disciplinas.add(d1);
            } else if (selectValue.equals("Inserir Professor")) {
                String nome = JOptionPane.showInputDialog("Digite o nome:");
                String cpf = JOptionPane.showInputDialog("Digite o cpf:");
                String cracha = JOptionPane.showInputDialog("Digite o numero do cracha:");
                String salario = JOptionPane.showInputDialog("Digite o salario:");
                String url = JOptionPane.showInputDialog("Digite o url do curriculo lattes: ");
                Professor p1 = new Professor(nome, cpf, Integer.parseInt(cracha), Double.parseDouble(salario), url);
                professores.add(p1);
            } else if (selectValue.equals("Inserir Atendente")) {
                String nome = JOptionPane.showInputDialog("Digite o nome:");
                String cpf = JOptionPane.showInputDialog("Digite o cpf:");
                String cracha = JOptionPane.showInputDialog("Digite o numero do cracha:");
                String salario = JOptionPane.showInputDialog("Digite o salario:");
                String setor = JOptionPane.showInputDialog("Digite o setor:");
                String funcao = JOptionPane.showInputDialog("Digite a função:");
                Atendente a1 = new Atendente(nome, cpf, Integer.parseInt(cracha), Double.parseDouble(salario), setor, funcao);
                atendentes.add(a1);
            } else if (selectValue.equals("Inserir Aluno")) {
                String nome = JOptionPane.showInputDialog("Digite o nome:");
                String cpf = JOptionPane.showInputDialog("Digite o cpf:");
                String ra = JOptionPane.showInputDialog("Digite o numero do ra:");
                String curso = JOptionPane.showInputDialog("Digite o curso:");
                Aluno a1 = new Aluno(nome, cpf, ra, curso);
                alunos.add(a1);
            } else if (selectValue.equals("Adicionar Disciplina ao professor")) {
                String codigo4 = JOptionPane.showInputDialog("Digite o codigo da disciplina: ");
                String codProf = JOptionPane.showInputDialog("Digite o n54umero de crachá: ");
                boolean encontrado = disciplinas.contains(codigo4);
                professores.add((Professor) disciplinas);

                for (Disciplina c : disciplinas) {
                    if (c.getCodigo() == Integer.parseInt(codigo4)) {
                        c.adicionarDisciplina(codProf);
                    }
                }
            } else if (selectValue.equals("Mostrar Pessoas")) {
                for (Aluno c : alunos) {
                    JOptionPane.showMessageDialog(null, "Alunos");
                    JOptionPane.showMessageDialog(null, c.toString());
                }
                for (Professor c : professores) {
                    JOptionPane.showMessageDialog(null, "Professores");
                    JOptionPane.showMessageDialog(null, c.toString());
                }
                for (Atendente c : atendentes) {
                    JOptionPane.showMessageDialog(null, "Atendentes");
                    JOptionPane.showMessageDialog(null, c.toString());
                }
            }
            while (Valido) ;
        }
    }

}
