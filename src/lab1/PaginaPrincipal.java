package lab1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PaginaPrincipal extends JFrame{
	
	Display display = new Display(111, 173, 165);
	
	public PaginaPrincipal() {
		
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); 
		setLocationRelativeTo(null);
		setVisible(true);
		organizador();
	}
	
	public void organizador() {
		
		setLayout(new BorderLayout());
		
		display.setPreferredSize(new Dimension(600,600));	
	    add(display, BorderLayout.CENTER);
	}

}
