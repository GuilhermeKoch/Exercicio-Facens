package ListaUm;

import javax.swing.JOptionPane;

public class Exercicio3 {

    private int Cracha;
    private String Nome;
    private String TipoVinculo;
    private float ValorHora;
    private float QtdeHora;
    private float Salario;
    private float ValorDesconto;

    public int getCracha() {
        return Cracha;
    }
    public void setCracha(int cracha) {
        Cracha = cracha;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTipoVinculo() {
        return TipoVinculo;
    }
    public void setTipoVinculo(String tipoVinculo) {
        TipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return ValorHora;
    }
    public void setValorHora(float valorHora) {
        ValorHora = valorHora;
    }

    public float getQtdeHora() {
        return QtdeHora;
    }
    public void setQtdeHora(float qtdeHora) {
        QtdeHora = qtdeHora;
    }

    public float getSalario() {
        return Salario;
    }
    public void setSalario(float salario) {
        Salario = salario;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }
    public void setValorDesconto(float valorDesconto) {
        ValorDesconto = valorDesconto;
    }

    public float calcularValorSalario() {
        if (getTipoVinculo() == "H"){
            return (getValorHora()*getQtdeHora())-getValorDesconto();
        } else {
            return getSalario() - getValorDesconto();
        }
    }

    public float metodoSalario() {
        if(getTipoVinculo() == "H"){
            return (getValorHora() * getQtdeHora());
        } else {
            return getSalario();
        }
    }

    public String Imprimir() {
        return "Crachá: " + getCracha() + "\nNome: " + getNome() + "\nTipo de Vínculo: " + getTipoVinculo() + "\nSalario: " + metodoSalario() + "\nDesconto: " + getValorDesconto() + "\nValor a Receber: " + calcularValorSalario();
    }

    public void menu() {
        Object[] itens = { "Criar Funcionario", "Mostrar Folha de Pagamento", "Alterar Remuneração", "Sair" };
        Object selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        
        while (selectedItem != "Sair") {
           if (selectedItem == "Criar Funcionario") {
                int inputCracha = JOptionPane.showInputDialog("Informe o numero do Crachá:").charAt(Cracha);
                this.setCracha(inputCracha);
                
                String inputNome = JOptionPane.showInputDialog("Informe o Nome:");
                this.setNome(inputNome);

                String inputTipoVinculo = JOptionPane.showInputDialog("Informe o Tipo de Vinculo:");
                this.setTipoVinculo(inputTipoVinculo);
                
                float inputValorHora = JOptionPane.showInputDialog("Informe o Valor Hora:").charAt(0);
                this.setValorHora(inputValorHora);

                float inputQtdeHora = JOptionPane.showInputDialog("Insira a Quantidade de Horas Trabalhadas:").charAt(0);
                this.setQtdeHora(inputQtdeHora);

                float inputSalario = JOptionPane.showInputDialog("Insira o Salario:").charAt(0);
                this.setSalario(inputSalario);

                float inputValorDesconto = JOptionPane.showInputDialog("Insira o valor do Desconto:").charAt(0);
                this.setValorDesconto(inputValorDesconto);

            } else if (selectedItem == "Mostrar Folha de Pagamento") {
                JOptionPane.showMessageDialog(null, this.Imprimir());                      
            } else {
                if (selectedItem == "Alterar Remuneração") {
                    float inputSalario = JOptionPane.showInputDialog("Insira o novo Salario:").charAt(0);
                    this.setSalario(inputSalario);

                    float inputValorHora = JOptionPane.showInputDialog("Informe o novo Valor Hora:").charAt(0);
                    this.setValorHora(inputValorHora);
                    
                    float inputQtdeHora = JOptionPane.showInputDialog("Insira a nova Quantidade de Horas Trabalhadas:").charAt(0);
                    this.setQtdeHora(inputQtdeHora);
                }
            }
            selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        }
    }

}
