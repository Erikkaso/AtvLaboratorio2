package view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelVender extends JPanel {

	public PainelVender() {
	  criarFormularioCadastro();
	  this.setBackground(Color.LIGHT_GRAY);
	}

	private void criarFormularioCadastro() {
		JLabel nome  = new JLabel("Nome");
		JTextField caixaNome= new JTextField(6);
		
		JLabel matricula  = new JLabel("Matricula");
		JTextField caixMatricula= new JTextField(6);
		
		JLabel opQueijo  = new JLabel("Opcao de Queijo");
		String queijos[] = {"","Mussarela","Prato","Parmesao","Coalho"};
		JComboBox boxQueijo = new JComboBox(queijos);
		
		JLabel opProteina  = new JLabel("Opcao de Proteina");
		String proteinas[] = {"","Salsicha","Linguca","Frango","Bacon"};
		JComboBox boxProteina = new JComboBox(proteinas);
		
		JLabel opAdcionais  = new JLabel("Escolha os Adcionais");
		JCheckBox checkAdcionais = new JCheckBox();
		checkAdcionais.setText("maionese");
//		JCheckBox checkAdcionaais = new JCheckBox();
//		checkAdcionais.setText("m0");
//		JCheckBox checkAdcionafis = new JCheckBox();
//		checkAdcionais.setText("m");
//		
		JLabel opBebida  = new JLabel("Opcao de Bebida");
		String bebidas[] = {"","Coca Cola","Delrio","Suco do Chaves"};
		JComboBox boxBebida = new JComboBox(bebidas);
		
		Botao b= new Botao("Realizar Venda", Color.cyan);
		
		this.setLayout(new GridLayout(7,2));
		////
		this.add(nome);
		this.add(caixaNome);
		this.add(matricula);
		this.add(caixMatricula);
		this.add(opQueijo);
		this.add(boxQueijo);
		this.add(opProteina);
		this.add(boxProteina);
		this.add(opAdcionais);
		this.add(checkAdcionais);
//		this.add(checkAdcionaais);
//		this.add(checkAdcionafis);
		this.add(opBebida);
		this.add(boxBebida);
		this.add(b);
		
	}
}
