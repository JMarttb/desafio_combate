package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion champion1, champion2;
		
		
		//Entradas campeão 1
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.println("Nome: ");
		String name1 = sc.nextLine();
		System.out.println("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.println("Ataque: ");
		int atk1 = sc.nextInt();
		System.out.println("Armadura: ");
		int arm1 = sc.nextInt();
		sc.nextLine(); // Consome a nova linha
		
		//entradas campeão2
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.println("Nome: ");
		String name2 = sc.nextLine();
		System.out.println("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.println("Ataque: ");
		int atk2 = sc.nextInt();
		System.out.println("Armadura: ");
		int arm2 = sc.nextInt();
		
		//instanciando os campeões com os dados de entrada
		champion1 = new Champion(name1, life1,atk1,arm1);
		champion2 = new Champion(name2, life2,atk2,arm2);

		System.out.println("Quantos turnos você deseja executar?");
		//máximo de turnos que vai acontecer, pode acabar antes
		int maxTurns = sc.nextInt();
		
		//turn é o turno atual
		for (int turn = 1; maxTurns >= turn; turn++) {
			if (!champion1.isAlive() || !champion2.isAlive()) {
				break;
			}
			
			//turnos de combate
			champion1.takeDamage(champion2.getAttack());
			champion2.takeDamage(champion1.getAttack());
			
			//resultado do turno atual
			System.out.println("Resultado do turno " + turn +":");
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();
			
			if (!champion1.isAlive() || !champion2.isAlive()) {
				break;
			}

		}

		System.out.println("FIM DO COMBATE");

		sc.close();
	}

}
