package panel;

import javax.swing.JOptionPane;

public class MenuPanelSeleccion {
    public static void main(String[] args) {
        String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Menu", "Seleccione una opción",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada != null) {
            switch (opcionSeleccionada) {
                case "Conversor de Moneda":
                	InsertarValorConvertir.mostrar();
                    break;
                case "Conversor de Temperatura":
                    // Lógica para el conversor de temperatura
                    System.out.println("Has seleccionado el Conversor de Temperatura");
                    break;
                default:
                    break;
            }
        }
    }
}
