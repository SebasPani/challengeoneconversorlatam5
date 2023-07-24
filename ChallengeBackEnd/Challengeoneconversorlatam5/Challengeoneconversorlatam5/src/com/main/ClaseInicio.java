package com.main;

import javax.swing.JOptionPane;

import conversor.TasasConversion;
import panel.DeseaContinuar;
import panel.InsertarValorConvertir;
import panel.MenuPanelSeleccion;
import panel.SeleccionDeConversion;
import panel.ValorObtenido;

public class ClaseInicio {

	public static void main(String[] args) {
		int conversor = 0;
		double valor = 0;
		String base = "";
		String salida = "";
		double tasaConversion = 0;
		double convertido = 0;
		int reinicio;
		MenuPanelSeleccion menu1 = new MenuPanelSeleccion();
		menu1.iniciarPanelSeleccion();
		while (true) {
			if (menu1.getEstado() == true) {
				conversor = menu1.getSeleccionConversor();
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
		menu3.mostrar(conversor);
		while (true) {
			if (menu3.getEstado() == true) {
				base = menu3.getBase();
				salida = menu3.getaConvertir();
				break;
			}
		}
		TasasConversion tasa = new TasasConversion();
		convertido = tasa.obtenerConversion(base, salida,conversor, valor);
		ValorObtenido menu4 = new ValorObtenido(convertido, salida);
		menu4.mostrar();
		while (true) {
			if (menu4.getEstado() == true) {
				break;
			}
		}
		DeseaContinuar continuar = new DeseaContinuar();
		continuar.mostrar();
		while (true) {
			if (continuar.getEstado() == true) {
				reinicio = continuar.getSeleccion();
				break;
			}
		}
		if (reinicio == 0) {
			main(null);
		} else {
			JOptionPane.showMessageDialog(null, "Programa Finalizado.");
		}

	}
}
