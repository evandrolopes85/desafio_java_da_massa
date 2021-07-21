import java.util.Scanner;

public class URI1014 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		// Declarando variáveis
		int x;
		double y;
		double gasto;

		// Entrada de dados
		x = teclado.nextInt();
		y = teclado.nextDouble();

		// Processamento
		gasto = x / y;

		// Saída
		System.out.printf("%.3f km/l\n", gasto);
	}
}