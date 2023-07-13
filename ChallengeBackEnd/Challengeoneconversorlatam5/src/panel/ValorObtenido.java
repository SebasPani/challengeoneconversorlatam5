package panel;

import javax.swing.JOptionPane;

public class ValorObtenido {

	private double valorObtenido;
	private String salida;
	private boolean estado = false;
	public ValorObtenido(double valor, String salida) {
		this.valorObtenido = valor;
		this.salida = salida;
	}
	public void mostrar() {
		int option = JOptionPane.showOptionDialog(null, "El valor de la conversión es: " + valorObtenido + " "
				+ salida,
                "Panel de Mensaje", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                new Object[]{"OK"}, null);

        if (option == JOptionPane.OK_OPTION) {
        	this.estado = true;
            //System.out.println("El usuario ha presionado OK");
        }
        }
	public boolean getEstado() {
		return this.estado;
	}
}
