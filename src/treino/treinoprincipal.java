package treino;

import java.util.Scanner;

import treino2.funcionario;

public class treinoprincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		funcionario x, y;
		x = new funcionario ();
		y = new funcionario ();
		
		
		System.out.println("Qual seu nome ? ");
		x.nome = sc.next();
		System.out.println("Qual sua idade? ");
		x.idade = sc.nextInt();
		System.out.println("Qual sua profissao? ");
		x.profissao = sc.next();
		System.out.println("Qual seu nome ? ");
		y.nome = sc.next();
		System.out.println("Qual sua idade? ");
		y.idade = sc.nextInt();
		System.out.println("Qual sua profissao? ");
		y.profissao = sc.next();
		
		System.out.println(x.nome + " , " + x.idade + " , " + x.profissao);
		System.out.println(y.nome + " , " + y.idade + " , " + y.profissao);

		
		sc.close();
	}

}
