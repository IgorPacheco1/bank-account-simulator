package simulator.account.bank.menu;
import java.util.Scanner;

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

        public Menu() {
            this.scanner = new Scanner(System.in);
        }

        public void exibirMenu() {
            int opcao = -1;

            do {
                limparTela();
                exibirCabecalho();

                System.out.println("  │ " + GREEN + "[1]" + RESET + " Criar Conta                 │");
                System.out.println("  │ " + CYAN + "[2]" + RESET + " Consultar Saldo             │");
                System.out.println("  │ " + CYAN + "[3]" + RESET + " Depositar                   │");
                System.out.println("  │ " + CYAN + "[4]" + RESET + " Sacar                       │");
                System.out.println("  │ " + CYAN + "[5]" + RESET + " Transferir                  │");
                System.out.println("  │ " + PURPLE + "[6]" + RESET + " Consultar Dados do Titular  │");
                System.out.println("  │                                │");
                System.out.println("  │ " + RED + "[0]" + RESET + " Sair do Sistema             │");
                System.out.println("  └────────────────────────────────┘" + RESET);
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

        private void exibirCabecalho() {
            System.out.println(CYAN + "  ┌────────────────────────────────┐");
            System.out.println("  │ " + BOLD + YELLOW + "     🏦 BANCO DIGITAL POO     " + RESET + CYAN + "│");
            System.out.println("  ├────────────────────────────────┤" + RESET);
        }

        private void processarOpcao(int opcao) {
            System.out.println();
            switch (opcao) {
                case 1 -> System.out.println(GREEN + "  [⚙] Funcionalidade: Criar Conta" + RESET);
                case 2 -> System.out.println(CYAN + "  [⚙] Funcionalidade: Consultar Saldo" + RESET);
                case 3 -> System.out.println(CYAN + "  [⚙] Funcionalidade: Depositar" + RESET);
                case 4 -> System.out.println(CYAN + "  [⚙] Funcionalidade: Sacar" + RESET);
                case 5 -> System.out.println(CYAN + "  [⚙] Funcionalidade: Transferir" + RESET);
                case 6 -> System.out.println(PURPLE + "  [⚙] Funcionalidade: Consultar Dados do Titular" + RESET);
                case 0 -> System.out.println(YELLOW + "  👋 Obrigado por utilizar nossos serviços! Até logo." + RESET);
                default -> System.out.println(RED + "  [!] Opção inválida! Escolha entre 0 e 6." + RESET);
            }

            if (opcao != 0) {
                pausar();
            }
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
