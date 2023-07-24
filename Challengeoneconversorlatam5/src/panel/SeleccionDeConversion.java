package panel;

import javax.swing.JOptionPane;

public class SeleccionDeConversion {

	private String base = "ARG";
	private String aConvertir = "USD";
	private boolean estado = false;
	 public void mostrar(int opcion) {
		 if (opcion == 1) {
			 	String[] opciones = { "Pesos a Dolares", "Pesos a Euros",
			 			"Pesos a Libras Esterlinas", "Pesos a Yen Japonés", "Pesos a Won sul-coreano",
			 			"Dolares a Pesos", "Euros a Pesos", "Libras Esterlinas a Pesos", "Yen Japonés a Pesos",
			 			"Won sul-coreano a Pesos"};

		        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Menu", "Seleccione una opción",
		                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

		        if (opcionSeleccionada != null) {
		            switch (opcionSeleccionada) {
		                case "Pesos a Dolares":
		                	this.base = "ARS";
		                	this.aConvertir = "USD";
		                	this.estado = true;
		                    break;
		                case "Pesos a Euros":
		                	this.base = "ARS";
		                	this.aConvertir = "EUR";
		                	this.estado = true;
		                    break;
		                case "Pesos a Libras Esterlinas":
		                	this.base = "ARS";
		                	this.aConvertir = "GBP";
		                	this.estado = true;
		                    break;
		                case "Pesos a Yen Japonés":
		                	this.base = "ARS";
		                	this.aConvertir = "JPY";
		                	this.estado = true;
		                    break;
		                case "Pesos a Won sul-coreano":
		                	this.base = "ARS";
		                	this.aConvertir = "KRW";
		                	this.estado = true;
		                    break;
		                case "Dolares a Pesos":
		                	this.base = "USD";
		                	this.aConvertir = "ARS";
		                	this.estado = true;
		                    break;
		                case "Euros a Pesos":
		                	this.base = "EUR";
		                	this.aConvertir = "ARS";
		                	this.estado = true;
		                    break;
		                case "Libras Esterlinas a Pesos":
		                	this.base = "GBP";
		                	this.aConvertir = "ARS";
		                	this.estado = true;
		                    break;
		                case "Yen Japonés a Pesos":
		                	this.base = "JPY";
		                	this.aConvertir = "ARS";
		                	this.estado = true;
		                    break;
		                case "Won sul-coreano a Pesos":
		                	this.base = "KRW";
		                	this.aConvertir = "ARS";
		                	this.estado = true;
		                    break;
		                default:
		                    break;
		            }
		        }
		 } else if(opcion == 2) {
			 	String[] opciones = { "Celcius a Fahrenheit", "Celcius a Kelvin",
			 			"Celcius a Rankine", "Fahrenheit a Celcius", "Fahrenheit a Kelvin",
			 			"Fahrenheit a Rankine", "Kelvin a Celcius", "Kelvin a Fahrenheit", "Kelvin a Rankine",
			 			"Rankine a Celcius", "Rankine a Fahrenheit", "Rankine a Kelvin"};

		        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Menu", "Seleccione una opción",
		                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

		        if (opcionSeleccionada != null) {
		            switch (opcionSeleccionada) {
		                case "Celcius a Fahrenheit":
		                	this.base = "CEL";
		                	this.aConvertir = "FAH";
		                	this.estado = true;
		                    break;
		                case "Celcius a Kelvin":
		                	this.base = "CEL";
		                	this.aConvertir = "KEL";
		                	this.estado = true;
		                    break;
		                case "Celcius a Rankine":
		                	this.base = "CEL";
		                	this.aConvertir = "RAN";
		                	this.estado = true;
		                    break;
		                case "Fahrenheit a Celcius":
		                	this.base = "FAH";
		                	this.aConvertir = "CEL";
		                	this.estado = true;
		                    break;
		                case "Fahrenheit a Kelvin":
		                	this.base = "FAH";
		                	this.aConvertir = "KEL";
		                	this.estado = true;
		                    break;
		                case "Fahrenheit a Rankine":
		                	this.base = "FAH";
		                	this.aConvertir = "RAN";
		                	this.estado = true;
		                    break;
		                case "Kelvin a Celcius":
		                	this.base = "KEL";
		                	this.aConvertir = "CEL";
		                	this.estado = true;
		                    break;
		                case "Kelvin a Fahrenheit":
		                	this.base = "KEL";
		                	this.aConvertir = "FAH";
		                	this.estado = true;
		                    break;
		                case "Kelvin a Rankine":
		                	this.base = "KEL";
		                	this.aConvertir = "RAN";
		                	this.estado = true;
		                    break;
		                case "Rankine a Celcius":
		                	this.base = "RAN";
		                	this.aConvertir = "CEL";
		                	this.estado = true;
		                    break;
		                case "Rankine a Fahrenheit":
		                	this.base = "RAN";
		                	this.aConvertir = "FAH";
		                	this.estado = true;
		                    break;
		                case "Rankine a Kelvin":
		                	this.base = "RAN";
		                	this.aConvertir = "KEL";
		                	this.estado = true;
		                    break;
		                default:
		                    break;
		            }
		        }
		 }

	    }
	public boolean getEstado() {
		return this.estado;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getaConvertir() {
		return aConvertir;
	}
	public void setaConvertir(String aConvertir) {
		this.aConvertir = aConvertir;
	}
}
