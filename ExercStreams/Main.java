
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        StreamArquivo ea = new StreamArquivo();
        ea.leituraArquivo();
        Scanner in= new Scanner(System.in);
        System.out.println("================MENU================");
        System.out.println("1 - Consultar cliente");
        System.out.println("2 - Consultar vendas de um cliente");
        System.out.println("3 - Salva vendas de um cliente");
        System.out.println("4 - Recupera vendas de um cliente");
        System.out.println("5 - Sair");
        System.out.println("====================================");
        int opcao =0;
        opcao = in.nextInt();
        switch ( opcao){
            case 1:
                System.out.println("Digite o codigo do cliente que deseja conslutar");
                String codigo;
                codigo = in.nextLine();
                codigo = in.nextLine();
                ea.confereOcliente(codigo);

                break;

            case 2:
                System.out.println("Digite o codigo do cliente para descobrir a venda");
                String venda="";
                venda =in.nextLine();
                venda =in.nextLine();
                ea.cosultaVenda(venda);
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            default:
                System.out.println("Talves o numero seja invalido");
                    break;
        }

    }

}