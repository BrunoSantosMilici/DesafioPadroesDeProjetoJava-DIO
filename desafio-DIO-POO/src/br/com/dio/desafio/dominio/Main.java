package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setCargaHoraria(8);
		curso1.setDescricao("Neste curso voce irá aprender a linguagem de programacao Java, desde o básico até os níveis mais avançado");
		
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso POO");
		curso2.setCargaHoraria(5);
		curso2.setDescricao("Neste curso você irá aprender sobre POO");
		
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setData(LocalDate.now());
		mentoria1.setDescricao("Mentoria sobre a linguagem de programacao Java");
		
		//System.out.println(curso1);
		
		
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome(("Bootcamp Java Developer"));
		bootcamp.setDescricao("Descriçåo Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);	
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		Dev devBruno = new Dev();
		devBruno.setNome("Bruno");
		devBruno.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devBruno.getConteudosInscritos());
		
		System.out.println("--");
		
		devBruno.progredir();
		System.out.println("Conteúdos Inscritos" + devBruno.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos" + devBruno.getConteudosConcluidos());
		System.out.println("XP:" + devBruno.calcularXp());
		
		
		System.out.println("------------------------------");
		
		
		
		Dev devMario = new Dev();
		devBruno.setNome("Mario");
		devMario.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devMario.getConteudosInscritos());
		
		System.out.println("--");

		devMario.progredir();
		devMario.progredir();

		System.out.println("Conteúdos Inscritos" + devMario.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos" + devMario.getConteudosConcluidos());
		System.out.println("XP:" + devMario.calcularXp());

	}

}
