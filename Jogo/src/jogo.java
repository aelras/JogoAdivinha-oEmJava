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
		
		show.println("Ol�! Qual � o seu nome?");
		String nome = scan.nextLine();
		show.println("Prazer em conhece-lo " + nome + "!");
		show.println(nome + " voc� quer jogar comigo ?");
		show.println("\nInforme o n�mero da sua op��o.\n1 ->\n2 ->");
		opcao = scan.nextInt();
		
		if(opcao == 2) {
			
			show.println("Que pena! mas tudo bem, fica pra proxima!");
		}else if(opcao == 1) {
			
			show.println("OK! o jogo � assim...");
			show.println("Eu vou escolher um n�mero de 0 a 10 ...");
			show.println("Mas n�o vou falar para voc� qual foi ...");
			show.println("Se voc� conseguir adivinhar qual foi ...");
			show.println("Voc� ser� o vencedor!!");
			
			escolha_computador = gerador.nextInt(11); /* 11 pq o sistema entende come�ando do 0*/
			
			show.println("OK" + nome + ". Eu j� escolhi! ");
			show.println("Agora tente adivinhar qual n�mero foi que eu escolhi!");
			
			do {
				escolha_usuario = scan.nextInt();
				if(escolha_usuario != escolha_computador) {
					show.println("Resposta errada!!");
				}else {
					show.println("Parab�ns, voc� acertou!!");
				}
				
			}while(escolha_computador != escolha_usuario);
		}
	}

}
