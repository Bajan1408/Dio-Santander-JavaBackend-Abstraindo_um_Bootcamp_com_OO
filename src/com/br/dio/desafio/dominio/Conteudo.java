package com.br.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10;
    protected String titulo;
    protected String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp(int multiplicador);

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    

    
}
