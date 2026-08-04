import java.util.Scanner;

public class MenuSwitchCase {
    public void menu (){

        // parte feita apenas para testes
        Scanner leitura = new Scanner(System.in);

        System.out.println("Para iniarmos seu atendimento por favor informe os seguintes dados:");
        System.out.println();
        System.out.println("Qual o seu nome:");
        String nome = leitura.nextLine();
        System.out.println("Informe qual o saldo que tem no banco: ");
        double saldoAtual = leitura.nextDouble();


        System.out.println("=====================================");
        System.out.println("DADOS DA CONTA:");
        System.out.println("Nome: " + nome);
        System.out.println("Saldo atual: R$" + saldoAtual);
        System.out.println("Última transação: Deposito: 1000 ");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("MENU DE ESCOLHAS");
        System.out.println();
        System.out.println("1- Consultar saldo");
        System.out.println("2- Realizar deposito");
        System.out.println("3- Realizar transferencia");
        System.out.println("4- Sair");
        int escolha = leitura.nextInt();
        double valorDeposito = 0;
        double valorTransferencia = 0;




        switch (escolha) {
            case 1:
                System.out.println("Saldo atual: R$ " + saldoAtual);
                break;
            case 2:
                System.out.println("Informe o valor a ser depositado: ");
                valorDeposito = leitura.nextDouble();
                saldoAtual += valorDeposito;
                System.out.println("Operação concluída");
                System.out.println();
                System.out.println("Saldo Atual: R$" + saldoAtual);
                break;
            case 3:
                System.out.println("Informe o valor a ser transferido: ");
                valorTransferencia = leitura.nextDouble();
                saldoAtual -= valorTransferencia;
                if (saldoAtual < 0) {
                    System.out.println("Saldo insuficiente para realizar essa operação");
                } else {
                    System.out.println();
                    System.out.println("Saldo Atual: R$" + saldoAtual);
                }

                break;
            case 4:
                System.out.println("Obrigado por usar o usa o nosso banco!!!");
                System.out.println();
                System.out.println("Tenha um bom dia.");
                break;
            default:
                System.out.println("Insira uma opção válida");
                break;
        }
    }
}
