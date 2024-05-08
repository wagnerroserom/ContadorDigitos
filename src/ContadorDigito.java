
	import java.util.Scanner;

	public class ContadorDigito {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Con esta instrucción solicitammos al usuario que ingrese un número cualquiera.
	        System.out.println("Por favor ingresa un número:");
	        int numero = scanner.nextInt();

	        // Este fragmento de código se encarga de contar cuántos dígitos tiene un número dado.
	        int contador = 0;
	        int numeroTemp = numero;
	        while (numeroTemp != 0) {
	            numeroTemp /= 10;
	            contador++;
	        }

	        // Con esta instrucción se muestra el resultado
	        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");

	        scanner.close();
	    }
	}
