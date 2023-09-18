package ListaDois.Exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

    private int numero;
    private String nome;
    private int idade;
    private String sexo;
    private double valorAutomovel;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }
    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor(){
        if(getSexo() == "M" && getIdade() <= 25){
            return (getValorAutomovel()*10)/10;
        } else if(getSexo() == "M" && getIdade() > 25){
            return (getValorAutomovel()*5)/100;
        } else {
            return (getValorAutomovel()*2)/100;
        }
    }

    public String Apolice(){
        return "Número: " + this.getNumero() + "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\nValor do Automóvel: " + this.getValorAutomovel() + "\nValor Apólice: " + this.calcularValor();
    }

    public String imprimir() {
        return Apolice();
    }

    public void menu() {
        Object[] itens = { "Criar Apólice", "Ver Dados Apólice", "Sair" };
        Object selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        
        while (selectedItem != "Sair") {
           if (selectedItem == "Criar Apólice") {
                int inputNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da apólice:"));
                this.setNumero(inputNumero);
                
                String inputNome = JOptionPane.showInputDialog("Informe o Nome:");
                this.setNome(inputNome);
                
                String inputSexo = JOptionPane.showInputDialog("Insira seu sexo:");
                this.setSexo(inputSexo);

                int inputIdade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Idade:"));
                this.setIdade(inputIdade);

                double inputValorAutomovel = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do Automóvel"));
                this.setValorAutomovel(inputValorAutomovel);

            } else {
                if (selectedItem == "Ver Dados Apólice") {
                    JOptionPane.showMessageDialog(null, this.imprimir());                    
                }
            }
            selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        }
    }

}
