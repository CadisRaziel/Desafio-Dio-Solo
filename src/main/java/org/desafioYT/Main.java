package org.desafioYT;

import org.desafioYT.Entities.ContaCorrente;
import org.desafioYT.Entities.ContaSalario;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaSalario contaSalario = new ContaSalario();

        contaCorrente.setNome("Conta1");
        contaCorrente.setCodigo("1010");
        double total = contaCorrente.rendimentoConta();
        System.out.println(contaCorrente);
        System.out.println(total);


        contaSalario.setNome("Conta2");
        contaSalario.setCodigo("2020");
        double total2 = contaSalario.rendimentoConta();
        System.out.println(contaSalario);
        System.out.println(total2);


    }
}