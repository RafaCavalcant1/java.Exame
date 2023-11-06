/*
 Implementa uma aplicação que realize as seguintes operações:
a) Receber, via teclado, os dados necessários para um objeto da classe criada no
item 1.
b) Armazenar esses dados no objeto instanciado.
c) Mostrar os dados do objeto e o diagnóstico do paciente.
 */

package exameGlicoseEncapsulamento;

import java.util.Scanner;

public class APPexameGlicose1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
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
		
		
		input.close();
	}

}
