import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Para iniarmos seu atendimento por favor informe os seguintes dados:");
        System.out.println();
        System.out.println("Qual o seu nome:");
        String nome = leitura.nextLine();
        System.out.println("Informe qual o saldo que tem no banco: ");
        double saldoAtual = leitura.nextDouble();


        System.out.println("=====================================");
        System.out.println("DADOS DA CONTA:");
        System.out.println("Nome: " + nome); //fazer aparecer de forma dinamina
        System.out.println("Saldo atual: " + saldoAtual); //fazer aparecer de forma dinamina
        System.out.println("Última transação: Deposito: 1000 "); //fazer aparecer de forma dinamina
        System.out.println("=====================================");
        System.out.println();
        System.out.println("MENU DE ESCOLHAS");
        System.out.println();
        System.out.println("1- Consultar saldo");
        System.out.println("2- Realizar deposito");
        System.out.println("3- Realizar transferencia");
        System.out.println("4- Sair");
    }
}