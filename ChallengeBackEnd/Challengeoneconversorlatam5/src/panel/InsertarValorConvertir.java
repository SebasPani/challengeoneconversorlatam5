package panel;

import javax.swing.JOptionPane;

public class InsertarValorConvertir {
    public static void mostrar() {
    
        String input = JOptionPane.showInputDialog(null, "Ingrese un valor numérico:");

        double valor;
        try {
            valor = Double.parseDouble(input);
            SeleccionDeConversion.mostrar();
            //JOptionPane.showMessageDialog(null, "Valor ingresado: " + valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El valor ingresado no es numérico");
        }
    }
}