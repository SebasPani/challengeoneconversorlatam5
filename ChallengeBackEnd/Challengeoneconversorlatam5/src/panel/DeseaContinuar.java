package panel;

import javax.swing.JOptionPane;

public class DeseaContinuar {
	public void mostrar() {
        Object[] opciones = {"Yes", "No", "Cancel"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Panel de Opciones",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (opcionSeleccionada) {
            case JOptionPane.YES_OPTION:
                // Opción Yes seleccionada
                System.out.println("Realizando una nueva conversión...");
                // Aquí puedes llamar a tus funciones para realizar una nueva conversión
                break;
            case JOptionPane.NO_OPTION:
                // Opción No seleccionada
                System.out.println("Programa Finalizado");
                break;
            case JOptionPane.CANCEL_OPTION:
                // Opción Cancel seleccionada
                System.out.println("Programa Finalizado");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
	}
}
