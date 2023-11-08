package lab1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MostrarRelatorio extends JPanel {
	
	private JLabel label;

		public MostrarRelatorio(int r, int g, int b) {
			Color color = new Color(r,g,b);
			label = new JLabel();
			label.setFont(new Font("arial", Font.BOLD, 20));
			this.setBackground(color);
			
			label.setText("Coloque aqui os relatórios de vendas");
			add(label);
		}
}
