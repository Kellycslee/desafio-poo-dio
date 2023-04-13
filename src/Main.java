import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescriçao("descrição curso java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescriçao("descrição cursos js");
        curso2.setCargaHorario(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescriçao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKelly = new Dev();
        devKelly.setNome("Kelly");
        devKelly.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Kelly" + devKelly.getConteudoInscritos());
        devKelly.progredir();
        devKelly.progredir();
        devKelly.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Kelly" + devKelly.getConteudoConcluidos());
        System.out.println("Conteudos Concluidos Kelly" + devKelly.getConteudoConcluidos());
        System.out.println("XP:" + devKelly.calcularTotalXp());


        System.out.println("-------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudoConcluidos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudoConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());


    }
    }