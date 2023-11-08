package lab1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.css.RGBColor;

public class Display extends JPanel implements ActionListener{
	
	Tela tela = new Tela();
	
	public Display(int r, int g, int b) {
		Color color = new Color(r,g,b);
		this.setBackground(color);
		
		add(criarBotao("Realizar Venda"));
		add(criarBotao("Listar Vendas"));
		add(criarBotao("Mostrar Relatório"));
		add(criarBotao("Listar Clientes"));
		tela.setPreferredSize(new Dimension(600,600));	
	    add(tela, BorderLayout.SOUTH);
	}
	
	public Botao criarBotao(String texto) {

		Botao b = new Botao(texto);
		b.addActionListener(this);
		return b;
	}
	
	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();
		
		if(b.getText().equals("Realizar Venda")) {
		    tela.realizarvendas.setVisible(true);
		    tela.listarvendas.setVisible(false);
		    tela.mostrarrelatorio.setVisible(false);
		    tela.listarClientes.setVisible(false);
		}else if(b.getText().equals("Listar Vendas")) {
			tela.realizarvendas.setVisible(false);
		    tela.listarvendas.setVisible(true);
		    tela.mostrarrelatorio.setVisible(false);
		    tela.listarClientes.setVisible(false);
		}else if(b.getText().equals("Mostrar Relatório")){
			tela.realizarvendas.setVisible(false);
		    tela.listarvendas.setVisible(false);
		    tela.mostrarrelatorio.setVisible(true);
		    tela.listarClientes.setVisible(false);
		}else if(b.getText().equals("Listar Clientes")) {
			tela.realizarvendas.setVisible(false);
		    tela.listarvendas.setVisible(false);
		    tela.mostrarrelatorio.setVisible(false);
		    tela.listarClientes.setVisible(true);
		}   
	}
}
