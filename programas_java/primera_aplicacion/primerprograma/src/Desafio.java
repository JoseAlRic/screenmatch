import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombreDelCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;


        System.out.println("++++++++++++++++++++++++++");

        System.out.println("\nNombre del Cliente: " + nombreDelCliente);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: $ " + saldo);

        System.out.println("\n++++++++++++++++++++++++++");

        String menu = """
                ++++ Escriba el numero de la opcion deseada
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion !=9 ){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es de: $ " + saldo);
                    break;
                case 2:
                    System.out.println("Cual es el valor que desea retirar");
                    double valorRetirar = teclado.nextDouble();
                    if (saldo > valorRetirar){
                        saldo -= valorRetirar;
                        System.out.println("El saldo actualizado es de: $" + saldo);
                    }else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que va ha depositar");
                    double valorDepositar = teclado.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("El saldo actualizado es de: $" + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
