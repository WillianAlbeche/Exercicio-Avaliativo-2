import java.io.Serializable;

public class Cliente implements Serializable {
        private String codigo;
        private String nome;
        private Venda venda;
        private String listaVendas="Vendas desse cliente: ";

        public Cliente(String codigo, String nome){
            this.nome= nome;
            this.codigo= codigo;

        }
        public void insereVenda(int quantidadeDeCompras, double valorTotal,String codigoVenda){
            venda = new Venda(quantidadeDeCompras,valorTotal,codigoVenda);
            salvarVendas(venda);
        }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void salvarVendas(Venda venda){

            listaVendas+=  venda.toString();
    }
    @Override
    public String toString() {
        return "Cliente:"+"\nNome: "+getNome()+"\nCodigo: "+getCodigo()+"\n"+"\n============================"+"\n"+listaVendas;

    }
}
