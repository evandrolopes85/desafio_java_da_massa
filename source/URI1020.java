import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1020 {
 
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);

		int entrada = Integer.parseInt(teclado.nextLine());

		int anos = entrada / 365;
		int mes = (entrada % 365) / 30;
		int dia = (entrada % 365) % 30;

		System.out.println(anos + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
 
    }
 
}