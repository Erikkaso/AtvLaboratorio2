package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarListaVendas implements ActionListener{

	private JanelaPrincipal frame;
	public MostrarListaVendas(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelVender.setVisible(false);
		frame.listaVendas.setVisible(true);
		frame.painelRelatorio.setVisible(false);
		frame.painelListarClientes.setVisible(false);
	}


}
