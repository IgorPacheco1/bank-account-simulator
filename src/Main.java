import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Para iniciarmos seu atendimento por favor informe os seguintes dados:");
        System.out.println();
        System.out.println("Qual o seu nome:");
        String nome = leitura.nextLine();
        System.out.println("Informe qual o saldo que tem no banco: ");
        double saldoAtual = leitura.nextDouble();
        System.out.println("=====================================");
        System.out.println("DADOS DA CONTA:");
        System.out.println("Nome: " + nome);
        System.out.println("Saldo atual: R$" + saldoAtual);
        String menu = """
                =====================================,
                1-Consultar saldo,
                2-Realizar deposito,
                3-Realizar transferencia,
                4-Sair
                """;

    }
}
