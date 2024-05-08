import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Por favor ingresa un número:"); // Con esta instrucción solicitammos al usuario que ingrese un número cualquiera.
        int numero = scanner.nextInt();
       
        int contador = 0;  // Este fragmento de código se encarga de contar cuántos dígitos tiene un número dado.
        int numeroTemp = numero;
        while (numeroTemp != 0) {
            numeroTemp /= 10;
            contador++;
        }
      
        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");  // Con esta instrucción se muestra el resultado.

        scanner.close();
    }
}
