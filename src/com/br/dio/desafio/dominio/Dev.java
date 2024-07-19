package com.br.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> cursosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> cursosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {

    }

    public void progredir() {

    }

    public void calcularTotalXp() {

    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getCursosInscritos() {
        return cursosInscritos;
    }

    public Set<Conteudo> getCursosConcluidos() {
        return cursosConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cursosInscritos == null) ? 0 : cursosInscritos.hashCode());
        result = prime * result + ((cursosConcluidos == null) ? 0 : cursosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cursosInscritos == null) {
            if (other.cursosInscritos != null)
                return false;
        } else if (!cursosInscritos.equals(other.cursosInscritos))
            return false;
        if (cursosConcluidos == null) {
            if (other.cursosConcluidos != null)
                return false;
        } else if (!cursosConcluidos.equals(other.cursosConcluidos))
            return false;
        return true;
    }

    
}
