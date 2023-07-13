package conversor;

import org.json.JSONObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class TasasConversionAPI {
	private double tasaCambio;
	public double obtenerConversion(String monedaBase, String monedaAConvertir) {
		try {
			//String monedaBase = "USD";
			//String monedaAConvetir = "BOB";
			String apiKey = "8c6b917adff53df475b74bab87b90afda6504571";
			//double suma = 10.0;

			String sitio = "https://api.getgeoapi.com/v2/currency/convert" + "?api_key=" + apiKey + "&from="
					+ monedaBase + "&to=" + monedaAConvertir + "&format=json";
			URL url = new URL(sitio);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			int codigoRespuesta = conn.getResponseCode();

			if (codigoRespuesta != 200) {
				throw new RuntimeException("HttpResponseCode: " + codigoRespuesta);
			} else {
				StringBuilder informacion = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());

				while (scanner.hasNext()) {
					informacion.append(scanner.nextLine());
				}

				scanner.close();
				
				JSONObject data = new JSONObject(informacion.toString());
				this.tasaCambio = data.getJSONObject("rates").getJSONObject(monedaAConvertir).getDouble("rate");
				//this.montoCambiado = data.getJSONObject("rates").getJSONObject(monedaAConvertir).getDouble("rate_for_amount");	
				//System.out.println(tasaCambio);
				//System.out.println(montoCambiado);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.tasaCambio;
	}
}
