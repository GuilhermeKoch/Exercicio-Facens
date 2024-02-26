package POO.ListaDois.Exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    
    private int codigo;
    private String nome;
    private double percentualComissao;

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

    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public String vendedor(){
        return "Código do Vendedor: " + this.getCodigo() + "\nNome do Vendedor: " + this.getNome() + "\nPercentual Comissão do Vendedor: " + this.getPercentualComissao() + "% ";
    }

    public double calcularPagamentoComissao(double valorVenda){
        return (valorVenda*getPercentualComissao())/10;
    }

    public double calcularPagamentoComissao(double percentualComissao, double desconto){
        return calcularPagamentoComissao(percentualComissao)-desconto;
    }

    public String imprimir(double valorVenda, double desconto){
        return vendedor() + "\nValor Venda: " + valorVenda + "\nValor Desconto: " + desconto + "\nPagamento Comissão: " + calcularPagamentoComissao(percentualComissao, desconto);
    }

    public void menu() {
        Object[] itens = { "Cadastrar Vendedor", "Calcular Venda", "Sair" };
        Object selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        
        while (selectedItem != "Sair") {
           if (selectedItem == "Cadastrar Vendedor") {
                int inputCodigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Código do Vendedor:"));
                this.setCodigo(inputCodigo);
                
                String inputNome = JOptionPane.showInputDialog("Informe o Nome do Vendedor:");
                this.setNome(inputNome);
                
                double inputPercentualComissao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Percentual de Comissão do Vendedor:"));
                this.setPercentualComissao(inputPercentualComissao);

            } else {
                if (selectedItem == "Calcular Venda") {
                    double inputValorVenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Valor da Venda"));

                    double inputValorDesconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Valor do Desconto"));

                    JOptionPane.showMessageDialog(null, this.imprimir(inputValorVenda, inputValorDesconto));                    
                }
            }
            selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        }
    }
}
