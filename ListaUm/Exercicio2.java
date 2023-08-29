package ListaUm;

import javax.swing.JOptionPane;

public class Exercicio2 {

    private String RA;
    private String Nome;
    private float ACum;
    private float ACdois;
    private float AG;
    private float AF;

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getACum() {
        return ACum;
    }

    public void setACum(float inputACum) {
        this.ACum = inputACum;
    }

    public float getACdois() {
        return ACdois;
    }

    public void setACdois(float inputACdois) {
        this.ACdois = inputACdois;
    }

    public float getAF() {
        return AF;
    }

    public void setAF(float aF) {
        AF = aF;
    }

    public float getAG() {
        return AG;
    }

    public void setAG(float aG) {
        AG = aG;
    }

    public double calcularMedia() {
        return (ACum * 0.15) + (ACdois * 0.30) + (AG * 0.10) + (AF * 0.45);
    }
    
    public String validarAprovacao() {
        if (calcularMedia() >= 5){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String imprimir() {
        return "RA: " + this.RA + " Nome: " + this.Nome + " AC1: " + this.ACum + " AC2: " + this.ACdois + " AG: " + this.AG + " AF: " + this.AF + "Média:" + calcularMedia() + " Situação: " + validarAprovacao();
    }
    
    public void menu() {
        Object[] itens = { "Criar Aluno", "Mostrar Aluno", "Sair" };
        Object selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        
        while (selectedItem != "Sair") {
           if (selectedItem == "Criar Aluno") {
                String inputRA = JOptionPane.showInputDialog("Informe o RA:");
                this.setRA(inputRA);
                
                String inputNome = JOptionPane.showInputDialog("Informe o Nome:");
                this.setNome(inputNome);
                
                float inputACum = JOptionPane.showInputDialog("Insira sua nota da AC1:").charAt(0);
                this.setACum(inputACum);

                float inputACdois = JOptionPane.showInputDialog("Insira sua nota da AC2:").charAt(0);
                this.setACdois(inputACdois);

                float inputAG = JOptionPane.showInputDialog("Insira sua nota da AG:").charAt(0);
                this.setAG(inputAG);

                float inputAF = JOptionPane.showInputDialog("Insira sua nota da AF:").charAt(0);
                this.setAF(inputAF);

            } else {
                if (selectedItem == "Mostrar Pessoa") {
                    JOptionPane.showMessageDialog(null, this.imprimir());                    
                }
            }
            selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        }
    }

}