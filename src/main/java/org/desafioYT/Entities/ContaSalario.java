package org.desafioYT.Entities;

public class ContaSalario extends Conta{
    @Override
    public double rendimentoConta() {
        return 0;
    }

    @Override
    public String toString() {
        return "ContaSalario -> {" +
                "nome='" + getNome() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                '}';
    }
}
