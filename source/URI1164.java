import java.util.Scanner;

public class URI1164 {
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int qtdTestes;
		int x = 0;
		int i = 1;
		int soma = 0;

		qtdTestes = teclado.nextInt();

		while(qtdTestes > 0){
			x = teclado.nextInt();
			while(i < x){
				if(x % i == 0){
					soma += i;
				}
				i++;
			}

			if(soma == x){
				System.out.printf("%d eh perfeito\n", x);
			}else
				System.out.printf("%d nao eh perfeito\n", x);

			i = 1;
			soma = 0;

			qtdTestes--;
		
		}
		
	}
}