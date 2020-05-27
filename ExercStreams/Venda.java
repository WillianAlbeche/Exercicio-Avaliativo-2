import java.io.Serializable;

public class Venda implements Serializable {
    private String codigoVenda;
    private int quantidadeDeCompras;
    private double valorTotal;
    public Venda(int quantidadeDeCompras, double valorTotal,String codigoVenda){
        this.quantidadeDeCompras = quantidadeDeCompras;
        this.valorTotal = valorTotal;
        this.codigoVenda = codigoVenda;
    }

    public String getCodigoVenda() {
        return codigoVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getQuantidadeDeCompras() {
        return quantidadeDeCompras;
    }

    @Override
    public String toString() {
        return "\nInformações da venda:"+"\nValor total: "+getValorTotal()+"\nQuantidade de compras feitas: "+getQuantidadeDeCompras()+"\nCodigo da venda: "+getCodigoVenda()
                +"\n============================";

    }
}
