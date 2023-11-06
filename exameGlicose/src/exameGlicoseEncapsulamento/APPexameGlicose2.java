/*
  Implementa uma aplicação que realize as seguintes operações:
a) Receber, via teclado, os dados necessários para 3 objetos da classe criada no item
1. Cada objeto deve ser armazenado em objeto diferente.
b) Mostrar os dados dos objetos e o diagnóstico dos pacientes.
 */
package exameGlicoseEncapsulamento;

import java.util.Scanner;

public class APPexameGlicose2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
 
		//1 objeto 
		System.out.println("Digite o id do exame: ");
		int idExame = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Digite o nome do paciente: ");
		String nomePaciente = input.nextLine();
		
		System.out.println("Digite o nivel de glicose: ");
		int nivelGlicose = input.nextInt();
		
		ExameDeGlicose exameglicose1 = new ExameDeGlicose(idExame, nomePaciente,nivelGlicose);
		System.out.println("id do exame: " + exameglicose1.getIdExame());
		System.out.println("nome: " + exameglicose1.getNomePaciente());
		System.out.println("glicose: " + exameglicose1.getNivelGlicose());
		
		System.out.println("o diagnostico do paciente foi:\nGlicose: " + exameglicose1.obterDiagnostico());

		// 2 objeto		
		System.out.println("\nDigite o id do exame: ");
		idExame = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Digite o nome do paciente: ");
		nomePaciente = input.nextLine();
		
		System.out.println("Digite o nivel de glicose: ");
		nivelGlicose = input.nextInt();
		
		ExameDeGlicose exameglicose2 = new ExameDeGlicose(idExame, nomePaciente,nivelGlicose);
		
		System.out.println("id do exame: " + exameglicose2.getIdExame());
		System.out.println("nome: " + exameglicose2.getNomePaciente());
		System.out.println("glicose: " + exameglicose2.getNivelGlicose());
		
		System.out.println("o diagnostico do paciente foi:\nGlicose: " + exameglicose2.obterDiagnostico());

		
		// 3 objeto 
		System.out.println("\nDigite o id do exame: ");
		idExame = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Digite o nome do paciente: ");
		nomePaciente = input.nextLine();
		
		System.out.println("Digite o nivel de glicose: ");
		nivelGlicose = input.nextInt();
		
		ExameDeGlicose exameglicose3 = new ExameDeGlicose(idExame, nomePaciente,nivelGlicose);
		
		System.out.println("id do exame: " + exameglicose3.getIdExame());
		System.out.println("nome: " + exameglicose3.getNomePaciente());
		System.out.println("glicose: " + exameglicose3.getNivelGlicose());
		
		System.out.println("o diagnostico do paciente foi:\nGlicose: " + exameglicose3.obterDiagnostico());
		input.close();
		
	}

}
