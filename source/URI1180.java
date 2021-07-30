import java.util.Scanner;

public class URI1180 {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int n;
        int x[];
        int menorValor = 1000;
        int posicao = 0;

        n = teclado.nextInt();
        x = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = teclado.nextInt();

            if(x[i] < menorValor){
                menorValor = x[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);

    }
}