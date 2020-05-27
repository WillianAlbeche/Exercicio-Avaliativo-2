import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class StreamArquivo {

    public void leituraArquivo() {    
        Path path = Paths.get("CLIENTES.TXT");
         try (BufferedReader br = Files.newBufferedReader(path, Charset.defaultCharset())) {
           String linha = null;
           while ((linha = br.readLine()) != null) {   
              // separador: :
              Scanner sc = new Scanner(linha).useDelimiter(":");
              System.out.println(sc.next()+" - "+sc.next());
           }
        } 
        catch (IOException e) {
        		System.err.format("Erro de E/S: %s%n", e);
        } 
    }

    /* Descrição
     * procura o codigo do cliente na lista de clientes, se não existir avisa que não foi encontrado
     * @Param codigo - recebe um codigo de um cliente
     */
    public void confereOcliente(String codigo){
        Path path = Paths.get("CLIENTES.TXT");
        try (BufferedReader br = Files.newBufferedReader(path, Charset.defaultCharset())) {
            String linha = null;
            boolean resultado = false;
            while ((linha = br.readLine()) != null) {
                // separador: :
                Scanner sc = new Scanner(linha).useDelimiter(":");
                if( linha.contains(codigo)){
                    System.out.println(sc.next()+" - "+sc.next());
                    resultado=true;
                    break;
                }


            }
          if(resultado == false){
                System.out.println("Código de cliente inválido");
            }
        }
        catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }

    /* Descrição
     * procura as vendas relacionadas a um codigo de um cliente especifico, se não achar ele avisa que o codigo esta invalido
     * @Param codigo - recebe um codigo de cliente
     */
    public void cosultaVenda(String codigo){
        Path path = Paths.get("VENDAS.TXT");
        try (BufferedReader br = Files.newBufferedReader(path, Charset.defaultCharset())) {
            String linha = null;
            String vendas ="";
            int numeroVendas =0;
            double valorVendas=0;
            boolean resultado = false;
            while ((linha = br.readLine()) != null) {
                // separador: :

                if( linha.contains(codigo)){
                    resultado=true;
                    Scanner sc = new Scanner(linha);//.useDelimiter(":");
                    numeroVendas++;
                   vendas = linha;
//                    System.out.println(vendas);
                    String valores[]= vendas.split(";");

                  for(int i = 0;i<valores.length;i++){
                      if(valores[i].contains(".")){
                          valorVendas+= Double.parseDouble(valores[i]);
                      }
                  }

                }

            }
            if(resultado == true){
                System.out.println("O numero de vendas desse cliente é de: "+numeroVendas);
                System.out.println("O valor total dessa venda é de: "+valorVendas);
            }
            else{
                System.out.println("Código de cliente inválido");
            }


        }
        catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }

}
