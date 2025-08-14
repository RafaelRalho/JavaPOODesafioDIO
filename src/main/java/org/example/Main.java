package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Aprenda programação orientada a objetos em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Collections");
        curso2.setDescricao("Aprenda a trabalhar com coleções em Java");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Carreira em TI");
        mentoria.setDescricao("Mentoria sobre desenvolvimento de carreira");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para desenvolver habilidades em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlice = new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);
        devAlice.progredir();

        Dev devBob = new Dev();
        devBob.setNome("Bob");
        devBob.inscreverBootcamp(bootcamp);
        devBob.progredir();
        devBob.progredir();

        System.out.println("Conteúdos inscritos Alice: " + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Alice: " + devAlice.getConteudosConcluidos());
        System.out.println("XP total Alice: " + devAlice.calcularTotalXp());

        System.out.println("Conteúdos inscritos Bob: " + devBob.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Bob: " + devBob.getConteudosConcluidos());
        System.out.println("XP total Bob: " + devBob.calcularTotalXp());
    }
}
