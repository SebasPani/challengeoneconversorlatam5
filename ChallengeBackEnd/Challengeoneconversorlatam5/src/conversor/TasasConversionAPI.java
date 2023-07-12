package conversor;

import org.json.JSONObject;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


public class TasasConversionAPI {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        // Monedas de origen y destino
        String baseCurrency = "USD";
        String targetCurrency = "EUR";

        // Clave de acceso a la API
        String apiKey = "0e217c205c4132a39bab32a2"; // Reemplaza con tu clave de acceso

        // URL de la API
        String url = "https://v6.exchangeratesapi.io/api/latest?access_key=" + apiKey
                + "&base=" + baseCurrency + "&symbols=" + targetCurrency;

        Request request = new Request.Builder().url(url).build();

        try {
            Response response = client.newCall(request).execute();
            String jsonData = response.body().string();

            JSONObject jsonObject = new JSONObject(jsonData);
            double exchangeRate = jsonObject.getJSONObject("rates").getDouble(targetCurrency);

            System.out.println("La tasa de conversión de " + baseCurrency + " a " + targetCurrency + " es: " + exchangeRate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
