package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MostrarVender implements ActionListener{

	private JanelaPrincipal frame;
	public MostrarVender(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelVender.setVisible(true);
		frame.listaVendas.setVisible(false);
		frame.painelRelatorio.setVisible(false);
		frame.painelListarClientes.setVisible(false);
	}

}
