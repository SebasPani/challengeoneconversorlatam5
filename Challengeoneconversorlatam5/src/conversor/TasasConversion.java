package conversor;

import org.json.JSONObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class TasasConversion {
	private double tasaCambio;
	private double montoCambiado;

	public double obtenerConversion(String monedaBase, String monedaAConvertir, int opcion, double valor) {
		if (opcion == 1) {
			try {
				// String monedaBase = "USD";
				// String monedaAConvetir = "BOB";
				String apiKey = "8c6b917adff53df475b74bab87b90afda6504571";
				// double suma = 10.0;

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
					this.montoCambiado = tasaCambio * valor;
					// this.montoCambiado =
					// data.getJSONObject("rates").getJSONObject(monedaAConvertir).getDouble("rate_for_amount");
					// System.out.println(tasaCambio);
					// System.out.println(montoCambiado);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (opcion == 2) {
			if (monedaBase == "CEL" && monedaAConvertir == "FAH") {
				this.montoCambiado = valor * 1.8 + 32;
			}
			if (monedaBase == "CEL" && monedaAConvertir == "KEL") {
				this.montoCambiado = valor + 273.15;
			}
			if (monedaBase == "CEL" && monedaAConvertir == "RAN") {
				this.montoCambiado = (valor + 273.15) * 9 / 5;
			}
			if (monedaBase == "FAH" && monedaAConvertir == "CEL") {
				this.montoCambiado = (valor - 32) / 1.8;
			}
			if (monedaBase == "FAH" && monedaAConvertir == "KEL") {
				this.montoCambiado = (valor - 32) / 1.8 + 273.15;
			}
			if (monedaBase == "FAH" && monedaAConvertir == "RAN") {
				this.montoCambiado = (((valor - 32) / 1.8) + 273.15) * 9 / 5;
			}
			if (monedaBase == "KEL" && monedaAConvertir == "CEL") {
				this.montoCambiado = valor - 273.15;
			}
			if (monedaBase == "KEL" && monedaAConvertir == "FAH") {
				this.montoCambiado = (valor - 273.15) * 1.8 + 32;
			}
			if (monedaBase == "KEL" && monedaAConvertir == "RAN") {
				this.montoCambiado = valor * 9 / 5;
			}
			if (monedaBase == "RAN" && monedaAConvertir == "CEL") {
				this.montoCambiado = valor * 5 / 9 - 273.15;
			}
			if (monedaBase == "RAN" && monedaAConvertir == "FAH") {
				this.montoCambiado = (valor * 5 / 9 - 273.15) * 1.8 + 32;
			}
			if (monedaBase == "RAN" && monedaAConvertir == "KEL") {
				this.montoCambiado = valor * 5 / 9;
			}
		}
		return montoCambiado;
	}
}
