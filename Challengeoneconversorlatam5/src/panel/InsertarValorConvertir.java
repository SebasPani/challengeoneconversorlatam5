package panel;

import javax.swing.JOptionPane;

public class InsertarValorConvertir {
	private boolean estado = false;
	private double valor = 0;
	private boolean excepcion = false;
	
    public boolean getEstado() {
		return estado;
	}
    public boolean getExcepcion() {
		return excepcion;
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
        	this.excepcion = true;
        	int option = JOptionPane.showOptionDialog(null, "Valor no válido",
                    "Panel de Mensaje", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    new Object[]{"OK"}, null);

            if (option == JOptionPane.OK_OPTION) {
            	mostrar();
            }
        	//JOptionPane.showMessageDialog(null, "Valor no válido");     
        }
    }
}