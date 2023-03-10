package org.desafioYT.Entities;

public abstract class Conta {
    private String nome;
    private String codigo;
    protected static final double RENDIMENTO = 10d;
    protected static final int DEPOSITO = 0;

    public abstract double rendimentoConta();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
