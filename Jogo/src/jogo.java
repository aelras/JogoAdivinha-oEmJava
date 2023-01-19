import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class jogo {

	public static void main(String[] args) {
		
		PrintStream show = System.out;
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int opcao;
		int escolha_computador;
		int escolha_usuario;
		
		show.println("Olá! Qual é o seu nome?");
		String nome = scan.nextLine();
		show.println("Prazer em conhece-lo " + nome + "!");
		show.println(nome + " você quer jogar comigo ?");
		show.println("\nInforme o número da sua opção.\n1 ->\n2 ->");
		opcao = scan.nextInt();
		
		if(opcao == 2) {
			
			show.println("Que pena! mas tudo bem, fica pra proxima!");
		}else if(opcao == 1) {
			
			show.println("OK! o jogo é assim...");
			show.println("Eu vou escolher um número de 0 a 10 ...");
			show.println("Mas não vou falar para você qual foi ...");
			show.println("Se você conseguir adivinhar qual foi ...");
			show.println("Você será o vencedor!!");
			
			escolha_computador = gerador.nextInt(11); /* 11 pq o sistema entende começando do 0*/
			
			show.println("OK" + nome + ". Eu já escolhi! ");
			show.println("Agora tente adivinhar qual número foi que eu escolhi!");
			
			do {
				escolha_usuario = scan.nextInt();
				if(escolha_usuario != escolha_computador) {
					show.println("Resposta errada!!");
				}else {
					show.println("Parabéns, você acertou!!");
				}
				
			}while(escolha_computador != escolha_usuario);
		}
	}

}
