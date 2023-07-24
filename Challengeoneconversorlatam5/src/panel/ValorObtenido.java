package panel;

import java.text.DecimalFormat;

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
		DecimalFormat df = new DecimalFormat("#.###");
		String resultado = df.format(valorObtenido);
		int option = JOptionPane.showOptionDialog(null, "El valor de la conversión es: " + resultado + " "
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
