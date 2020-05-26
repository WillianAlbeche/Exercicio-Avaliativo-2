import java.io.Serializable;

public class Venda implements Serializable {
    private int quantidadeDeCompras;
    private double valorTotal;
    public Venda(int quantidadeDeCompras, double valorTotal){
        this.quantidadeDeCompras = quantidadeDeCompras;
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getQuantidadeDeCompras() {
        return quantidadeDeCompras;
    }

    @Override
    public String toString() {
        return "Informações da venda:"+"\nValor total: "+getValorTotal()+"\nQuantidade de compras feitas: "+getQuantidadeDeCompras();

    }
}
