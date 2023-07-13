package panel;

import javax.swing.JOptionPane;

public class SeleccionDeConversion {

	private String base = "ARG";
	private String aConvertir = "USD";
	private boolean estado = false;
	 public void mostrar() {
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
	                	//InsertarValorConvertir.mostrar();
	                    break;
	                case "Pesos a Euros":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                case "Pesos a Libras Esterlinas":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                case "Pesos a Yen Japonés":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                case "Pesos a Won sul-coreano":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                case "Dolares a Pesos":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                case "Euros a Pesos":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                case "Libras Esterlinas a Pesos":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                case "Yen Japonés a Pesos":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                case "Won sul-coreano a Pesos":
	                    // Lógica para el conversor de temperatura
	                    System.out.println("Has seleccionado el Conversor de Temperatura");
	                    break;
	                default:
	                    break;
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
