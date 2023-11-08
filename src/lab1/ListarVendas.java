package lab1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ListarVendas extends JPanel{
	private JLabel label;
	
	public ListarVendas(int r, int g, int b) {
		Color color = new Color(r,g,b);
		label = new JLabel();
		label.setFont(new Font("arial", Font.BOLD, 20));
		this.setBackground(color);
		
		label.setText("Coloque a tabela aqui com os dados da venda");
		add(label);
	}
}
