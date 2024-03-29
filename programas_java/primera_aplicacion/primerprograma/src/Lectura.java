import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechsDeLanzamiento = teclado.nextInt();
        System.out.println("Por ultimo, dale una nota");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechsDeLanzamiento);
        System.out.println(nota);
    }
}
