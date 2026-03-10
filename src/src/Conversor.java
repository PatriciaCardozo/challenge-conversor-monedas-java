public class Conversor {

    public void convertir(int opcion, double cantidad){

        double tasa = 0;
        String moneda = "";

        switch(opcion){

            case 1:
                tasa = 850;
                moneda = "ARS";
                break;

            case 2:
                tasa = 0.0012;
                moneda = "USD";
                break;

            case 3:
                tasa = 5.0;
                moneda = "BRL";
                break;

            case 4:
                tasa = 0.20;
                moneda = "USD";
                break;

            case 5:
                tasa = 4000;
                moneda = "COP";
                break;

            case 6:
                tasa = 0.00025;
                moneda = "USD";
                break;

            default:
                System.out.println("Opción inválida");
                return;
        }

        double resultado = cantidad * tasa;

        System.out.println("El valor convertido es: " + resultado + " " + moneda);

    }
}
