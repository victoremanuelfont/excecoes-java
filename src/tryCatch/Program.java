package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite nomes: ");
		try {
		String[] vect = sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vect[posicao]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: Foi digitado uma posição inexistente");
		}catch(InputMismatchException e) {
			System.out.println("Erro: Ao inves de digitar um numero, digitou uma letra");
		}
		
		System.out.println("Fim do programa");
		

	}

}
