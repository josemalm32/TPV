package Vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SelecionaClienteUI extends JFrame {
	private JTable table;
	protected JButton btnNewButton;
	
	public SelecionaClienteUI() {
		setBounds(100, 100, 352, 494);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 52, 336, 377);
		getContentPane().add(table);
		
		JLabel lblSelecionaCliente = new JLabel("Seleciona Cliente");
		lblSelecionaCliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSelecionaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecionaCliente.setBounds(0, 11, 336, 36);
		getContentPane().add(lblSelecionaCliente);
		
		btnNewButton = new JButton("Selecionar");
		btnNewButton.setBounds(121, 430, 89, 34);
		getContentPane().add(btnNewButton);

	}
}
