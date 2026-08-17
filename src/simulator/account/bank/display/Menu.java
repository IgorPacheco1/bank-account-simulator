package simulator.account.bank.display;
import java.util.Scanner;
import simulator.account.bank.models.Conta;

    public class Menu {



        // Códigos de cores ANSI para estilizar o terminal
        private static final String RESET = "\u001B[0m";
        private static final String BOLD = "\u001B[1m";
        private static final String CYAN = "\u001B[36m";
        private static final String GREEN = "\u001B[32m";
        private static final String YELLOW = "\u001B[33m";
        private static final String RED = "\u001B[31m";
        private static final String PURPLE = "\u001B[35m";

        private final Scanner scanner;
        private final Conta conta;

        public Menu() {
            this.scanner = new Scanner(System.in);
            this.conta = new Conta();
        }

        public void exibirMenu() {
            int opcao = -1;

            do {
                limparTela();
                exibirCabecalho("Bank-Account-Sistem");

                System.out.println("  │ " + GREEN + "[1]" + RESET + " Criar Conta                 │");
                System.out.println("  │ " + CYAN + "[2]" + RESET + " Consultar Saldo             │");
                System.out.println("  │ " + CYAN + "[3]" + RESET + " Depositar                   │");
                System.out.println("  │ " + CYAN + "[4]" + RESET + " Sacar                       │");
                System.out.println("  │ " + CYAN + "[5]" + RESET + " Transferir                  │");
                System.out.println("  │ " + PURPLE + "[6]" + RESET + " Consultar Dados do Titular  │");
                System.out.println("  │                                 │");
                System.out.println("  │ " + RED + "[0]" + RESET + " Sair do Sistema             │");
                System.out.println("  └─────────────────────────────────┘" + RESET);
                System.out.print(BOLD + "\n  ➔ Selecione uma opção: " + RESET);

                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer do teclado
                    processarOpcao(opcao);
                } else {
                    System.out.println(RED + "\n  [!] Opção inválida! Digite um número." + RESET);
                    scanner.nextLine(); // Limpar entrada incorreta
                    pausar();
                }

            } while (opcao != 0);
        }

        private void exibirCabecalho(String titulo) {
            System.out.println(CYAN + "  ┌─────────────────────────────────┐");
            System.out.println("  │ " + BOLD + YELLOW + "      " + titulo + "     " + RESET + CYAN + "  │");
            System.out.println("  ├─────────────────────────────────┤" + RESET);
        }

        private void processarOpcao(int opcao) {
            System.out.println();
            switch (opcao) {
                case 1 -> criarConta(); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 2 -> consultarSaldo(); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 3 -> depositar(); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 4 -> sacar(); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 5 -> tranferir(); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 6 -> consultaDadosTitular(); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 0 -> System.out.println(BOLD + YELLOW + "   Obrigado por utilizar nossos serviços! Até logo." + RESET);
                default -> System.out.println(BOLD + RED + "  [!] Opção inválida! Escolha entre 0 e 6." + RESET);
            }

            if (opcao != 0) {
                pausar();
            }
        }

        private void criarConta(){
            int opcao = -1;
            String nome ="";
            String cpf = "";
            boolean contaCorrente=false;
            boolean contaPoupanca=false;

            while (opcao!=0){
                exibirCabecalho("Criação de conta   ");
                System.out.println("  │ " + GREEN + "[]" + RESET + " Insira seu nome              │");
                System.out.println("  │ " + CYAN + "[]" + RESET + " Informe seu CPF              │");
                System.out.println("  │ " + CYAN + "[]" + RESET + " Escolha o tipo de conta      │");
                System.out.println("  │ " + RED + "[0]" + RESET + " Sair do Sistema             │");
                System.out.println("  └─────────────────────────────────┘" + RESET);
                System.out.println(BOLD + "\n  ➔ Lembrando os dados devem ser digitados respectivamente " + RESET);
                //perguntar o professor se seria o correto instaciar o obj aqui ou na main

                nome = scanner.nextLine();
                if (nome.contains("0")){ // preciso arrumar um jeito de comparar para sair caso aperte errado
                    exibirMenu();
                    return;
                }
                cpf = scanner.nextLine();
                exibirCabecalho("Criação de conta   ");
                System.out.println("  │ " + GREEN + "[1]" + RESET + " Conta corrente              │");
                System.out.println("  │ " + CYAN + "[2]" + RESET + " Conta poupança              │");
                System.out.println("  │ " + RED + "[0]" + RESET + " Sair do Sistema             │");
                System.out.println("  └─────────────────────────────────┘" + RESET);
                int escolha = scanner.nextInt();
                if (escolha == 1){
                    contaCorrente = true;
                    contaPoupanca = false;
                } else if (escolha == 2) {
                    contaCorrente = false;
                    contaPoupanca = true;
                }
                conta.setTitularConta(nome);
                conta.setCpf(cpf);
                conta.setContaCorrente(contaCorrente);
                conta.setContaPoupanca(contaPoupanca);
                exibirCabecalho("Dados cadastrados  ");
                System.out.println("");
                System.out.println("");
                pausar();
                System.out.println("");
                opcao =  0;
                exibirMenu();

            };


        }

        private void consultarSaldo(){
            // fazer veriricar se a pessoa tem conta, caso não tiver solicitar a criação e enviar para o menu criarConta
            exibirCabecalho("Consulta de saldo  ");
            System.out.println("  │ " + GREEN + "[Saldo atual] " + RESET +    "R$"+ conta.getSaldoConta() +           "          │");
            System.out.println("  └─────────────────────────────────┘" + RESET);
            pausar();

        }

        private void depositar(){
            // fazer veriricar se a pessoa tem conta, caso não tiver solicitar a criação e enviar para o menu criarConta
            exibirCabecalho("Depósito           ");
            System.out.println("  │ " + GREEN + "[Saldo atual] " + RESET +    "R$"+ conta.getSaldoConta() +           "          │");
            System.out.println("  └─────────────────────────────────┘" + RESET);
            System.out.println(BOLD + "\n  ➔ Insira o valor que deseja depositar " + RESET);
            conta.setSaldoConta(scanner.nextDouble());
//            double valorDeposito = scanner.nextDouble();
//            double saldoFinal = conta.getSaldoConta();
//            saldoFinal += valorDeposito;


            exibirCabecalho("Operação conluída  ");
            System.out.println("");
            System.out.println("");
            pausar();
            System.out.println("");
            exibirMenu();

        }

        private void sacar(){
            // fazer veriricar se a pessoa tem conta, caso não tiver solicitar a criação e enviar para o menu criarConta
            exibirCabecalho("Saque            ");
            System.out.println("  │ " + GREEN + "[Saldo atual] " + RESET +    "R$"+ conta.getSaldoConta() +           "          │");
            System.out.println("  └─────────────────────────────────┘" + RESET);
            System.out.println(BOLD + "\n  ➔ Insira o valor que deseja sacar " + RESET);
            double valorSaque = scanner.nextDouble();
            conta.setSaldoConta(conta.getSaldoConta() - valorSaque);

            exibirCabecalho("Operação conluída  ");
            System.out.println("");
            System.out.println("");
            pausar();
            System.out.println("");
            exibirMenu();

        }

        private void tranferir(){
            // fazer veriricar se a pessoa tem conta, caso não tiver solicitar a criação e enviar para o menu criarConta
            //quero deixar ele de forma que realmente transfira entre contas e não apenas realize o debito da conta
        }

        private void consultaDadosTitular(){
            // fazer veriricar se a pessoa tem conta, caso não tiver solicitar a criação e enviar para o menu criarConta
            String tipoDeconta ="";
            if (conta.isContaCorrente()){
                tipoDeconta = "Conta corrente";
            } else if (conta.isContaPoupanca()) {
                tipoDeconta = "Conta poupança";
            }
            exibirCabecalho("Dados do titular   ");
            System.out.println("  │ " + GREEN + "[Nome] " + RESET + conta.getTitularConta() + "              │");
            System.out.println("  │ " + CYAN + "[CPF] " + RESET + conta.getCpf() +"               │");
            System.out.println("  │ " + CYAN + "[Tipo de conta] " + RESET + tipoDeconta + "  │");
            System.out.println("  └─────────────────────────────────┘" + RESET);

        }

        private void pausar() {
            System.out.print("\n  Pressione ENTER para continuar...");
            scanner.nextLine();
        }

        private void limparTela() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
