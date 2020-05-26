import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SalvarArquivos {

    //utilizando a serialização para gravar o objeto em arquivo
    public static boolean gravarArquivos(Cliente cliente){
        Path arq1 = Paths.get("Resumo.bin");
        boolean concluido = false;
        try(ObjectOutputStream oarq = new ObjectOutputStream(Files.newOutputStream(arq1))){
            oarq.writeObject(cliente);
            concluido =true;
        }
        catch (IOException e){
            System.out.println("Problemas na gravacao do arquivo: " + e.getMessage());
        }
        return concluido;
    }
    public static void lerArquivo(){
        Cliente cliente = null;
       Path arq1 = Paths.get("Resumo.bin");
        try (ObjectInputStream iarq= new ObjectInputStream(Files.newInputStream(arq1))) {
            cliente = (Cliente) iarq.readObject();
        }
        catch (ClassNotFoundException e){
            System.out.println("Problemas na leitura dos arquivos(cast): "+e.getMessage());
        }
        catch (IOException e){
            System.out.println("Problema na leitura do arquivo: " + e.getMessage());
        }
        System.out.println( cliente.toString());
    }
}
