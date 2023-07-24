package panel;

import javax.swing.JOptionPane;

public class MenuPanelSeleccion {
    private int seleccionConversor = 0;
    private boolean estado = false;
    public void iniciarPanelSeleccion() {
    	String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Menu", "Seleccione una opción",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada != null) {
            switch (opcionSeleccionada) {
                case "Conversor de Moneda":
                	this.estado = true;
                	setSeleccionConversor(1);
                    break;
                case "Conversor de Temperatura":
                	this.estado = true;
                	setSeleccionConversor(2);
                    break;
                default:
                    break;
            }
        }
    }
    public boolean getEstado() {
    	return this.estado;
    }
	public int getSeleccionConversor() {
		return seleccionConversor;
	}
	public void setSeleccionConversor(int seleccionConversor) {
		this.seleccionConversor = seleccionConversor;
	}

}
