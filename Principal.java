package Exercicio.Projeto06.ex01;

import Exercicio.Projeto06.ex01.Appication.Carro;
import Exercicio.Projeto06.ex01.Appication.ModeloCarro;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro("Fiat Uno", 3000.00, 7000.00, 2500.00);

        meuCarro.mostrarInformacoes();

    }
}
