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
                =====================================
                1-Consultar saldo
                2-Realizar deposito
                3-Realizar transferencia
                4-Sair
                =====================================
                """;
        System.out.println();
        System.out.println(menu);
        int escolha = leitura.nextInt();
        double valorDepositado=0;
        double valorTransferencia=0;

        while(escolha != 4){
            System.out.println();
            System.out.println(menu);
            escolha = leitura.nextInt();

            if (escolha ==1){
                System.out.println("Saldo atual: R$" + saldoAtual);
                System.out.println();
            } else if (escolha ==2) {
                System.out.println("Insira o valor a ser depositado: ");
                valorDepositado = leitura.nextInt();
                saldoAtual += valorDepositado;
            } else if (escolha ==3) {
                System.out.println("Insira o valor a ser tranferido:");
                valorTransferencia = leitura.nextDouble();
                if (saldoAtual<valorTransferencia){
                    System.out.println("Saldo insuficiente para realizar operação");
                }else {
                    System.out.println();
                    System.out.println("Operação concluída");
                    saldoAtual -= valorTransferencia;
                }
            }

        }
    }
}
