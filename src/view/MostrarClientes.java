package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarClientes implements ActionListener{

	private JanelaPrincipal frame;
	public MostrarClientes(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelVender.setVisible(false);
		frame.listaVendas.setVisible(false);
		frame.painelRelatorio.setVisible(false);
		frame.painelListarClientes.setVisible(true);
	}


}
