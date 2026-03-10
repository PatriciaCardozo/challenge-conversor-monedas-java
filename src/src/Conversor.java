import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;

public class Conversor {

    private static final String API_KEY = "255e7bc526e4eeed2e6d5ae0";

    public void convertir(int opcion, double cantidad) {

        String url = "";
        String moneda = "";

        switch (opcion) {
            case 1:
                url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/ARS";
                moneda = "ARS";
                break;
            case 2:
                url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/ARS/USD";
                moneda = "USD";
                break;
            case 3:
                url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/BRL";
                moneda = "BRL";
                break;
            case 4:
                url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/BRL/USD";
                moneda = "USD";
                break;
            case 5:
                url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/COP";
                moneda = "COP";
                break;
            case 6:
                url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/COP/USD";
                moneda = "USD";
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        try {
            String respuesta = ApiClient.obtenerDatos(url);
            JsonObject json = JsonParser.parseString(respuesta).getAsJsonObject();
            double tasa = json.get("conversion_rate").getAsDouble();

            double resultado = cantidad * tasa;
            System.out.println("El valor convertido es: " + resultado + " " + moneda);

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
        }
    }
}
