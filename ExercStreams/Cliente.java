import java.io.Serializable;

public class Cliente implements Serializable {
        private String codigo;
        private String nome;
        private Venda venda;
        public Cliente(String codigo, String nome, Venda venda){
            this.nome= nome;
            this.codigo= codigo;
            this.venda= venda;
        }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Cliente:"+"\nNome: "+getNome()+"\nCodigo: "+getCodigo()+"\n"+venda.toString();

    }
}
