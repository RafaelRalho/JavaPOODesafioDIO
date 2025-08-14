package org.example;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() { return data; }
    public Mentoria setData(LocalDate data) { this.data = data; return this; }

    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() + " em " + data;
    }
}
