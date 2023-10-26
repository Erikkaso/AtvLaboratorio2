package view;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PainelListaVendas extends JPanel{
	JTable tabela;
	JPanel painelFundo;
    JScrollPane barraRolagem;
	PainelListaVendas(){
		String [] colunas = {"Tipo", "Quantidade", "Preco Total"};
		
		Object [][] dados = {
				{"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
				{"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
				{"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"}
			};
		
		
		 painelFundo = new JPanel();
	        painelFundo.setLayout(new GridLayout(1, 1));
	        tabela = new JTable(dados, colunas);
	        barraRolagem = new JScrollPane(tabela);
	        painelFundo.add(barraRolagem);

	}
}
