import java.util.Scanner;

public class URI1066 {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor = 0;
        int impar = 0;
        int par   = 0;
        int positivo = 0;
        int negativo = 0;

        for(int i = 0; i < 5; i++){
            valor = teclado.nextInt();

            if(valor % 2 ==0){
                par++;
            }

            if(valor % 2 != 0){
                impar++;
            }

            if(valor > 0){
                positivo++;
            }

            if(valor < 0){
                negativo++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
    }
}