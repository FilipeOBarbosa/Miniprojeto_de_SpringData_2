package br.edu.dac.filipe.projetojpa;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.dac.filipe.projetojpa.controller.FazendeiroController;
import br.edu.dac.filipe.projetojpa.controller.PlantaController;
import br.edu.dac.filipe.projetojpa.model.entity.Fazendeiro;
import br.edu.dac.filipe.projetojpa.model.entity.Planta;

@SpringBootApplication
public class ProjetoJpaApplication implements CommandLineRunner {

	@Autowired
	private FazendeiroController fazendeiroController;
	
	@Autowired
	private PlantaController plantaController;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner leitor = new Scanner(System.in);
		boolean sair = false;
		while(sair == false) {
			System.out.print(" 1-criar fazendeiro\n 2-mostrar fazendeiros\n 3-alterar fazendeiro\n 4-mostrar plantas\n 0-sair:");
			int opcao = Integer.parseInt(leitor.nextLine());
			switch (opcao) {
			case 1: {
				System.out.print("cpf do fazendeiro:");
				String cpf = leitor.nextLine();
				System.out.print("nome do fazendeiro:");
				String nome = leitor.nextLine();
				System.out.print("idade do fazendeiro:");
				int idade = Integer.parseInt(leitor.nextLine());
				fazendeiroController.createFazendeiro(cpf, nome, idade);
				break;
			}
			case 2:{
				List<Fazendeiro> fazendeiros = fazendeiroController.list();
				for (Fazendeiro fazendeiro: fazendeiros) {
					System.out.println(fazendeiro.toString());
				}
				break;
			}
			case 3:{
				System.out.print("cpf do fazendeiro para atualizar:");
				String cpf = leitor.nextLine();
				fazendeiroController.atualizar(cpf);
				break;
			}
			case 4:{
				List<Planta> plantas = plantaController.list();
				for (Planta planta: plantas) {
					System.out.println(planta.toString());
				}
				break;
			}
			case 0:{
				sair = true;
				break;
			}
			}
		}

	}

}
