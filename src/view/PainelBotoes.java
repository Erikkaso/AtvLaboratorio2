package view;

import java.awt.Color;

import javax.swing.JPanel;

public class PainelBotoes  extends JPanel{

	JanelaPrincipal janela; 
	
	public PainelBotoes(JanelaPrincipal janela) {
		this.janela = janela;
		criarBotoes();
		this.setBackground(Color.ORANGE);
	}

	private void criarBotoes() {
		Botao cadastrar = new Botao("Realizar Venda", Color.green);
		cadastrar.addActionListener(new MostrarVender(janela));
	
		Botao listar = new Botao("Listar Vendas", Color.gray);
		listar.addActionListener(new MostrarRelatorio(janela));
		
		Botao atualizar = new Botao("Mostrar Relatorio", Color.cyan);
		atualizar.addActionListener(new MostrarListaVendas(janela));
		
		Botao deletar = new Botao("Listar Clientes", Color.red);
		deletar.addActionListener(new MostrarClientes(janela));
		
		this.add(cadastrar);
		this.add(listar);
		this.add(atualizar);
		this.add(deletar);
		
	}
}
