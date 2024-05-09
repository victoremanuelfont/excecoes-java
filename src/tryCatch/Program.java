package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		metodo1();

		System.out.println("Fim do programa");

	}

	public static void metodo1() {
		System.out.println("-------- Start Metodo1 ----------");
		metodo2();
		System.out.println("--------- Fim metodo1 -----------");
	}

	public static void metodo2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------- Start Metodo2 ----------");
		System.out.print("Digite nomes: ");
		try {
			String[] vect = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: Foi digitado uma posição inexistente");
			e.printStackTrace(); // Para mostrar o erro
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Erro: Ao inves de digitar um numero, digitou uma letra");
		}
		System.out.println("--------- Fim metodo2 -----------");
	}

	/*
	 * e.printStackTrace: No console, é mostrado:
	 * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	 * at tryCatch.Program.metodo2(Program.java:29) at
	 * tryCatch.Program.metodo1(Program.java:18) at
	 * tryCatch.Program.main(Program.java:10)
	 * 
	 * Aparece o erro (ArrayIndexOutOfBoundsException: Index 5 out of bounds for
	 * length 3). Program.metodo2(Program.java:29) = significa que o erro foi na
	 * linha 29, quando é perguntado a posição, como foi digitado "5" mas tinha só 3
	 * nomes digitados. Na classe "Program" no "metodo2" na linha "29" teve uma
	 * exceção. Mas o "metodo2" foi chamado pelo "metodo1", na classe "Program", na
	 * linha "18". E esse "metodo1" foi chamado pela "main", na linha "10".   
	 * 
	 * 
	 */

}
