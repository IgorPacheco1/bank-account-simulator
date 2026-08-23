package simulator.account.bank.main;

import simulator.account.bank.display.Menu;

public class Main {
    public static void main(String[] args) {
        // Lembrar das observações do professor, como eu imaginei essa classe main com esse tanto de metodo não se enquadra na forma certa de POO
        // Posteriormente mudar menu para uma classe static para não precisar instanciar e distribuir os metodos para outras classes

        Menu menu = new Menu();
        menu.exibirMenu();
    }
}

