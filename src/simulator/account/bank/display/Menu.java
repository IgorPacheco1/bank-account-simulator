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
                case 2 -> System.out.println(CYAN + "  [⚙] Funcionalidade: Consultar Saldo" + RESET); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 3 -> System.out.println(CYAN + "  [⚙] Funcionalidade: Depositar" + RESET); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 4 -> System.out.println(CYAN + "  [⚙] Funcionalidade: Sacar" + RESET); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 5 -> System.out.println(CYAN + "  [⚙] Funcionalidade: Transferir" + RESET); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 6 -> System.out.println(PURPLE + "  [⚙] Funcionalidade: Consultar Dados do Titular" + RESET); //tenho que adicionar as devidas funcionalidades assim que criar elas
                case 0 -> System.out.println(YELLOW + "   Obrigado por utilizar nossos serviços! Até logo." + RESET); //tenho que adicionar as devidas funcionalidades assim que criar elas
                default -> System.out.println(RED + "  [!] Opção inválida! Escolha entre 0 e 6." + RESET); //tenho que adicionar as devidas funcionalidades assim que criar elas
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
                opcao =  0;
                exibirMenu();

            };


        }

        private void consultarSaldo(){

        }

        private void depositar(){

        }

        private void sacar(){

        }

        private void tranferir(){

        }

        private void consultaDadosTitular(){

        }

        private void pausar() {
            System.out.print("\n  Pressione ENTER para continuar...");
            scanner.nextLine();
        }

        private void limparTela() {
            // Envia sequências de escape ANSI para limpar a tela do terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
