import java.util.Scanner;

public class URI1184 {
	
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);

		double m[][] = new double[12][12];
		double soma  = 0;
		double media = 0.0;
		int count = 0;
		char opcao;


		opcao = teclado.nextLine().charAt(0);

		for(int x = 0; x < 12; x++){
			for(int y = 0; y < 12; y++){
				m[x][y] = teclado.nextDouble();
			}
		}

		
		for(int x = 1; x < 12; x++){
			for(int y = 0; y < x; y++){
				soma += m[x][y];
				count++;
			}
		}

		media = soma / count;

		if(opcao == 'S'){
			System.out.printf("%.1f\n", soma);
		}else
			System.out.printf("%.1f\n", media);
		
	}
}