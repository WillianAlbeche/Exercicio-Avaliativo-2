
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        StreamArquivo ea = new StreamArquivo();
        ea.leituraArquivo();
        Scanner in= new Scanner(System.in);
        int opcao =0;
        do {
            System.out.println("================MENU================");
            System.out.println("1 - Consultar cliente");
            System.out.println("2 - Consultar vendas de um cliente");
            System.out.println("3 - Salva vendas de um cliente");
            System.out.println("4 - Recupera vendas de um cliente");
            System.out.println("5 - Sair");
            System.out.println("====================================");

            opcao = in.nextInt();
            switch ( opcao){
                case 1:
                    System.out.println("Digite o codigo do cliente que deseja consultar");
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
                    System.out.println("Por favor, digite as informações pedidas a seguir ");
                    salvarVenda();
                    break;

                case 4:
                    System.out.println("Sua venda esta sendo recuperada: ");
                    recuperarVenda();
                    break;

                case 5:
                    System.out.println("Saindo do programa, obrigado e volte sempre, não deixe de lavar as mãos  ;)");
                    break;

                default:
                    System.out.println("Talves o numero seja invalido");
                    break;
            }

        }while(opcao !=5 || opcao == 0 );

    }
    public static void salvarVenda(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nomeCli= in.nextLine();
        System.out.println("Digite o codigo do cliente: ");
        String codigoCli= in.nextLine();

        System.out.println("Digite a quantidade de itens que foram comprados: ");
        int quantidadeComprada = in.nextInt();
        System.out.println("Digite o preço de cada compra");
        double preco = in.nextDouble();

        Venda venda1 = new Venda(quantidadeComprada,preco);
        Cliente cliente= new Cliente(codigoCli,nomeCli,venda1);
        if(SalvarArquivos.gravarArquivos(cliente)){
            System.out.println("O resumo da sua venda foi salvo");
        }
        else{
            System.out.println("Codigo do cliente esta invalido");
        }
    }
    public static void recuperarVenda(){
        try{
            SalvarArquivos.lerArquivo();
        }
        catch (Exception e){
            System.out.println("Arquivo de vendas do cliente não localizado");
        }

    }

}