import desafioPoo.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição Curso Java");
        curso.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria java");
        mentoria.setData(LocalDate.now());
       ;

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Elizeu");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos"+ dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudos Concluidos"+ dev.getConteudosConcluidos());
        System.out.println(dev.getNome()+" Xp adquirido : "+ dev.calcularXp());

        System.out.println("------------------");
        Dev devDois = new Dev();
        devDois.setNome("Maria");
        devDois.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos"+ devDois.getConteudosInscritos());
        devDois.progredir();
        System.out.println("Conteudos Concluidos"+ devDois.getConteudosConcluidos());
        devDois.progredir();
        System.out.println("Conteudos Concluidos"+ devDois.getConteudosConcluidos());
        devDois.progredir();
        System.out.println("Conteudos Concluidos"+ devDois.getConteudosConcluidos());
        System.out.println(devDois.getNome()+" Xp adquirido : "+ devDois.calcularXp());

    }
}