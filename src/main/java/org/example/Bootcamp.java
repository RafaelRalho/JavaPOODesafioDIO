package org.example;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private final Set<Dev> devsInscritos = new LinkedHashSet<>();
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() { return nome; }
    public Bootcamp setNome(String nome) { this.nome = nome; return this; }

    public String getDescricao() { return descricao; }
    public Bootcamp setDescricao(String descricao) { this.descricao = descricao; return this; }

    public LocalDate getDataInicial() { return dataInicial; }
    public LocalDate getDataFinal() { return dataFinal; }

    public Set<Dev> getDevsInscritos() { return devsInscritos; }
    public Set<Conteudo> getConteudos() { return conteudos; }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Bootcamp b) && Objects.equals(nome, b.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
