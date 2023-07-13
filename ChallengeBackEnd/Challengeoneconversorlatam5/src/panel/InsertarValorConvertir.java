package panel;

import javax.swing.JOptionPane;

public class InsertarValorConvertir {
	private boolean estado = false;
	private double valor = 0;
	
    public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void mostrar() {
    
        String input = JOptionPane.showInputDialog(null, "Ingrese un valor numérico:");

        try {
            this.valor = Double.parseDouble(input);
            this.estado = true;
            //SeleccionDeConversion.mostrar();
            //JOptionPane.showMessageDialog(null, "Valor ingresado: " + valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El valor ingresado no es numérico");
        }
    }
}