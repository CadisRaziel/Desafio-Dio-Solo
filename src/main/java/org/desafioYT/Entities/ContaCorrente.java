package org.desafioYT.Entities;

public class ContaCorrente extends Conta{


    @Override
    public double rendimentoConta() {
        return RENDIMENTO + 10;
    }

    @Override
    public String toString() {
        return "ContaCorrente -> {" +
                "nome='" + getNome() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                '}';
    }
}
