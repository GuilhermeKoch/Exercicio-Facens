package ListaUm;

import javax.swing.JOptionPane;

public class Exercicio1 {

    private String CPF;
    private String Nome;
    private char Sexo;
    private int Idade;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char inputSexo) {
        this.Sexo = inputSexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int inputIdade) {
        this.Idade = inputIdade;
    }
    
    public String imprimir() {
        return "O(a) Pessoa(a) " + this.getNome() + " tem CPF nº " + this.getCPF() + " tem a idade de " + this.getIdade() + " é do sexo " + this.getSexo();
    }
    
    public void menu() {
        Object[] itens = { "Criar Pessoa", "Mostrar Pessoa", "Sair" };
        Object selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        
        while (selectedItem != "Sair") {
           if (selectedItem == "Criar Pessoa") {
                String inputCPF = JOptionPane.showInputDialog("Informe o CPF:");
                this.setCPF(inputCPF);
                
                String inputNome = JOptionPane.showInputDialog("Informe o Nome:");
                this.setNome(inputNome);
                
                char inputSexo = JOptionPane.showInputDialog("Insira seu sexo:").charAt(0);
                this.setSexo(inputSexo);

                int inputIdade = Integer.parseInt( JOptionPane.showInputDialog(null, "Informe a Idade:"));
                this.setIdade(inputIdade);

            } else {
                if (selectedItem == "Mostrar Pessoa") {
                    JOptionPane.showMessageDialog(null, this.imprimir());                    
                }
            }
            selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        }
    }
    
}
