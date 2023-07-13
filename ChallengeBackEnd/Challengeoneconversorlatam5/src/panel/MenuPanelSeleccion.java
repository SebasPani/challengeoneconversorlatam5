package panel;

import javax.swing.JOptionPane;

public class MenuPanelSeleccion {
    private int seleccionConversor = 0;
    public void iniciarPanelSeleccion() {
    	String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Menu", "Seleccione una opción",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada != null) {
            switch (opcionSeleccionada) {
                case "Conversor de Moneda":
                	setSeleccionConversor(1);
                    break;
                case "Conversor de Temperatura":
                    System.out.println("Has seleccionado el Conversor de Temperatura");
                    break;
                default:
                    break;
            }
        }
    }
	public int getSeleccionConversor() {
		return seleccionConversor;
	}
	public void setSeleccionConversor(int seleccionConversor) {
		this.seleccionConversor = seleccionConversor;
	}

}
