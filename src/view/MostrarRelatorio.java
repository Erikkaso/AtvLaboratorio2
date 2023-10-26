package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarRelatorio implements ActionListener{

	private JanelaPrincipal frame;
	public MostrarRelatorio(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelVender.setVisible(false);
		frame.listaVendas.setVisible(false);
		frame.painelRelatorio.setVisible(true);
		frame.painelListarClientes.setVisible(false);
	}


}
