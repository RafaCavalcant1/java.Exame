/*
 Implementa uma aplicação que realize as seguintes operações:
a) Receber, via teclado, os dados necessários para 3 objetos da classe criada no item
1. Os objetos devem ser armazenados em um array.
b) Mostrar os dados dos objetos e o diagnóstico dos pacientes.
 */
package exameGlicoseEncapsulamento;

import java.util.Scanner;

public class APPexameGlicose3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		ExameDeGlicose[] exameArray = new ExameDeGlicose [3];
		
		for (int i = 0; i < exameArray.length; i++) {
			System.out.println("Digite o id do exame: ");
			int idExame = input.nextInt();
			
			input.nextLine();
			
			System.out.println("Digite o nome do paciente: ");
			String nomePaciente = input.nextLine();
			
			System.out.println("Digite o nivel de glicose: ");
			int nivelGlicose = input.nextInt();
			
			ExameDeGlicose exameglicose1 = new ExameDeGlicose(idExame, nomePaciente,nivelGlicose);
		    
			exameArray[i] = exameglicose1;
		}
	
	
	for (int i = 0; i < exameArray.length; i++) {
		
		System.out.printf("\n exame %d\n" , (i+1));
		System.out.println("id do exame: " + exameArray[i].getIdExame());
		System.out.println("nome: " + exameArray[i].getNomePaciente());
		System.out.println("glicose: " + exameArray[i].getNivelGlicose());
		System.out.println("o diagnostico do paciente foi:\nGlicose: " + exameArray[i].obterDiagnostico());
	}

	input.close();
	}
}
