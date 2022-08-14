package app;

import java.util.Scanner;

import core.ContaBancaria;

public class Banco {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria conta = new ContaBancaria(1001,2,"Kathleen","123.543.654.-00", 100.00);
		
		do {
			
			System.out.println("1-deposito/2-saque/3-info/0-sair");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor que deseja depositar:");
				valor = teclado.nextDouble();
				conta.depositar(valor);
				break;
			case 2:
				System.out.println("Digiteo valor que deseja sacar:");
				valor = teclado.nextDouble();
				if(conta.sacar(valor)) {
					System.out.println("Saque efetuado:");
				}else {
					System.out.println("Saldo insuficiente:");
				}
				break;
			case 3:
				System.out.println("Informações"+conta.exibirDados());
				break;
			case 0:
				System.out.println("Obrigada pela preferencia volte sempre:");
				default:
					System.out.println("Opção invalida");
			}
		}while(opcao !=0);
		
		teclado.close();
	}
}
