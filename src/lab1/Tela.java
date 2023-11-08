package lab1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela extends JPanel{
	
	public ListarClients listarClientes = new ListarClients(111, 173, 165);
	public MostrarRelatorio mostrarrelatorio = new MostrarRelatorio(111, 173, 165);
	public ListarVendas listarvendas = new ListarVendas(111, 173, 165);
	public RealizarVendas realizarvendas = new RealizarVendas(111, 173, 165);
	
	public Tela() {
		opcoes();
	}
	
	public void opcoes() {
	    
		realizarvendas.setPreferredSize(new Dimension(583, 520));
	    add(realizarvendas, BorderLayout.SOUTH);
	    
		listarvendas.setPreferredSize(new Dimension(590, 550));	
	    add(listarvendas, BorderLayout.SOUTH);
	    
	    mostrarrelatorio.setPreferredSize(new Dimension(590, 550));	
	    add(mostrarrelatorio, BorderLayout.SOUTH);
	    
	    listarClientes.setPreferredSize(new Dimension(590, 550));
	    add(listarClientes, BorderLayout.SOUTH);
	}
}
