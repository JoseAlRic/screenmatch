public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "plus";

        if (fechaDeLanzamiento > 2022){
            System.out.println("Peliculas mas populares");
        }else{
            System.out.println("Peliculas que aun vale la pena ver");
        }
        if (incluidoEnElPlan || tipoDePlan.equals("plus")){
            System.out.println("Disfruta de tu pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
        if (incluidoEnElPlan && tipoDePlan.equals("plus")){
            System.out.println("Disfruta de tu pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
