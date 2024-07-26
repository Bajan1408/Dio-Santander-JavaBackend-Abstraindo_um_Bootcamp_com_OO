package com.br.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> cursosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> cursosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.cursosInscritos.addAll(bootcamp.getCursosEmentorias());
        bootcamp.getDevs().add(this);
    }

    public void progredir() {
        Optional<Conteudo> atividade = this.cursosInscritos.stream()
        .findFirst();
        if(atividade.isPresent()) {
            this.cursosConcluidos.add(atividade.get());
            this.cursosInscritos.remove(atividade.get());
        } else {
            System.err.println("Você ainda não concluiu nenhum curso!");
        }
    
    }

    public double calcularTotalXp() {
        return this.cursosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCursosInscritos(Set<Conteudo> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public void setCursosConcluidos(Set<Conteudo> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
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
