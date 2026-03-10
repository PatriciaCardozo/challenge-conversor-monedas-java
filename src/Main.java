import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        int opcion = 0;

        while(opcion != 7){

            System.out.println("*****************************");
            System.out.println("Sea bienvenido al conversor de monedas");
            System.out.println("1 - USD a ARS");
            System.out.println("2 - ARS a USD");
            System.out.println("3 - USD a BRL");
            System.out.println("4 - BRL a USD");
            System.out.println("5 - USD a COP");
            System.out.println("6 - COP a USD");
            System.out.println("7 - Salir");
            System.out.println("Seleccione una opción:");

            opcion = scanner.nextInt();

            if(opcion != 7){

                System.out.println("Ingrese la cantidad:");
                double cantidad = scanner.nextDouble();

                conversor.convertir(opcion, cantidad);
            }

        }

        System.out.println("Programa finalizado");

    }
}
