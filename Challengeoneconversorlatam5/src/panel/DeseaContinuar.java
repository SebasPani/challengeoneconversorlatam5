package panel;

import javax.swing.JOptionPane;

public class DeseaContinuar {
	private int seleccion;
	private boolean estado = false;
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public int getSeleccion() {
		return this.seleccion;
	}
	public void mostrar() {
        Object[] opciones = {"Yes", "No", "Cancel"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Panel de Opciones",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (opcionSeleccionada) {
            case JOptionPane.YES_OPTION:
                this.seleccion = 0;
                this.estado = true;
                break;
            case JOptionPane.NO_OPTION:
            	this.seleccion = 1;
            	this.estado = true;
                break;
            case JOptionPane.CANCEL_OPTION:
                this.seleccion = 2;
                this.estado = true;
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
	}
}
