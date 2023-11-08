package lab1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RealizarVendas extends JPanel{

	private JLabel nomeCliente;
	private JLabel numero;
	private JLabel queijo;
	private JLabel proteina;
	private JLabel adicionais;
	private JLabel bebida;
	private Botao realizarvenda;
	private JTextField nomeClienteCaixa;
	private JTextField numeroCaixa;
	private JComboBox queijoCaixa;
	private JComboBox proteinaCaixa;
	private JComboBox bebidaCaixa;
	private JPanel adicionaisCaixa;
	private JCheckBox maionese;
	private JCheckBox ketchup;
	private JCheckBox ovo;
	private JCheckBox batatapalha;
	private String [] queijos = {"Mussarela", "Prato", "Parmesão", "Coalho"};
	private String [] carnes = {"Salsicha", "Linguiça", "Frango", "Bacon"};
	private String [] bebidas = {"Coca-Cola", "Delrio", "Guaraná"};

	
	
	
	public RealizarVendas(int r, int g, int b) {
		setLayout(new GridLayout(7,2));
		Color color = new Color(r,g,b);
		this.setBackground(color);
		
		nomeCliente=new JLabel();
		numero=new JLabel();
		queijo=new JLabel();
		proteina=new JLabel();
		adicionais=new JLabel();
		bebida=new JLabel();
			
		nomeClienteCaixa=new JTextField();
		numeroCaixa=new JTextField();
		queijoCaixa=new JComboBox(queijos);
		proteinaCaixa=new JComboBox(carnes);
		bebidaCaixa=new JComboBox(bebidas);
		adicionaisCaixa=new JPanel();
		
		maionese=new JCheckBox("Maionese");
		ketchup=new JCheckBox("Ketchup");
		ovo=new JCheckBox("Ovo");
		batatapalha=new JCheckBox("Batata Palha");
		adicionaisCaixa.setLayout(new GridLayout(2,2));
		maionese.setBackground(color);
		ketchup.setBackground(color);
		ovo.setBackground(color);
		batatapalha.setBackground(color);
		adicionaisCaixa.add(maionese);
		adicionaisCaixa.add(ketchup);
		adicionaisCaixa.add(ovo);
		adicionaisCaixa.add(batatapalha);
		
		realizarvenda=new Botao("Realizar Venda");
		
		nomeCliente.setFont(new Font("arial", Font.BOLD, 15));
		numero.setFont(new Font("arial", Font.BOLD, 15));
		queijo.setFont(new Font("arial", Font.BOLD, 15));
		proteina.setFont(new Font("arial", Font.BOLD, 15));
		adicionais.setFont(new Font("arial", Font.BOLD, 15));
		bebida.setFont(new Font("arial", Font.BOLD, 15));
		
		nomeCliente.setText("Nome Cliente:");
		numero.setText("Número:");
		queijo.setText("Queijo:");
		proteina.setText("Proteína:");
		adicionais.setText("Adicionais:");
		bebida.setText("Bebida");
		
		add(nomeCliente);
		add(nomeClienteCaixa);
		add(numero);
		add(numeroCaixa);
		add(queijo);
		add(queijoCaixa);
		add(proteina);
		add(proteinaCaixa);
		add(adicionais);
		add(adicionaisCaixa);
		add(bebida);
		add(bebidaCaixa);
		add(realizarvenda);
	}
}
