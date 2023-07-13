package com.main;

import conversor.TasasConversionAPI;
import panel.DeseaContinuar;
import panel.InsertarValorConvertir;
import panel.MenuPanelSeleccion;
import panel.SeleccionDeConversion;
import panel.ValorObtenido;

public class ClaseInicio {

	public static void main(String[] args) {
		double valor = 0;
		String base = "";
		String salida = "";
		double tasaConversion = 0;
		double convertido = 0;
		MenuPanelSeleccion menu1 = new MenuPanelSeleccion();
		menu1.iniciarPanelSeleccion();
		while (true) {
			if (menu1.getSeleccionConversor() == 1) {
				break;
			}
		}
		InsertarValorConvertir menu2 = new InsertarValorConvertir();
		menu2.mostrar();
		while (true) {
			if (menu2.getEstado() == true) {
				valor = menu2.getValor();
				break;
			}
		}
		SeleccionDeConversion menu3 = new SeleccionDeConversion();
		menu3.mostrar();
		while (true) {
			if (menu3.getEstado() == true) {
				base = menu3.getBase();
				salida = menu3.getaConvertir();
				break;
			}
		}
		TasasConversionAPI tasa = new TasasConversionAPI();
		tasaConversion = tasa.obtenerConversion(base, salida);
		convertido = tasaConversion * valor;
		ValorObtenido menu4 = new ValorObtenido(convertido, salida);
		menu4.mostrar();
		while (true) {
			if (menu4.getEstado() == true) {
				break;
			}
		}
		DeseaContinuar continuar = new DeseaContinuar();
		continuar.mostrar();
	}
}
