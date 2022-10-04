package br.com.view.model;

import java.util.Objects;

public class cat {
    private String nome;
    private String cor;
    private String idade;

    public cat() {
    }

    public cat(String nome, String cor, String idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cat cat = (cat) o;
        return Objects.equals(nome, cat.nome) && Objects.equals(cor, cat.cor) && Objects.equals(idade, cat.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "cat{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
