public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match ");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;


        double media = (8.2 + 6.8 + 9.8) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja y es la mejor pelicula del milenio
                que fue lanzada en:  
               """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);


    }
}