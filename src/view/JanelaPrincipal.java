package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JanelaPrincipal  extends JFrame{

//	public JPanel painelPrincipal;
	public PainelVender painelVender;
//	public JPanel painelListarVendas;
	public PainelListaVendas listaVendas;
	public JPanel painelRelatorio;
	public JPanel painelListarClientes;
	
	public JanelaPrincipal() {
		
		painelVender = new PainelVender();
		
		listaVendas = new PainelListaVendas();
		listaVendas.setBackground(Color.cyan);
		
		painelRelatorio = new JPanel();
		painelRelatorio.setBackground(Color.gray);
		
		painelListarClientes = new JPanel();
		painelListarClientes.setBackground(Color.red);
		
	    PainelBotoes painelBotoes = new PainelBotoes(this); 	
		
		this.setSize(600, 300);
		this.setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//		painelPrincipal = new JPanel();
//		painelPrincipal.setBackground(Color.BLACK);
//		painelPrincipal.setVisible(true);
//
		this.add(painelBotoes, BorderLayout.NORTH);
//
//		
//		this.add(painelPrincipal, BorderLayout.CENTER);
		painelVender.setVisible(false);
		
		
		JPanel painelGenerico = new JPanel();
		painelGenerico.add(painelVender);
		painelGenerico.add(listaVendas);
		painelGenerico.add(painelRelatorio);
		painelGenerico.add(painelListarClientes);
		
		this.add(painelGenerico, BorderLayout.CENTER);
		this.setVisible(true);
	}
	

}
