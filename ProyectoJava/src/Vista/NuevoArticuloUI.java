package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class NuevoArticuloUI extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	public NuevoArticuloUI() {
		setTitle("Nuevo Articulo");
		setBounds(100, 100, 523, 360);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.gridwidth = 3;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 6;
		gbc_lblId.gridy = 3;
		getContentPane().add(lblId, gbc_lblId);
		
		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 9;
		gbc_textField.gridy = 3;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNombreArticulo = new JLabel("Nombre Articulo");
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.gridx = 7;
		gbc_lblNombreArticulo.gridy = 5;
		getContentPane().add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 7;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 9;
		gbc_textField_1.gridy = 5;
		getContentPane().add(textField_1, gbc_textField_1);
		
		JLabel lblPreciound = new JLabel("Precio/Und");
		GridBagConstraints gbc_lblPreciound = new GridBagConstraints();
		gbc_lblPreciound.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreciound.gridx = 7;
		gbc_lblPreciound.gridy = 7;
		getContentPane().add(lblPreciound, gbc_lblPreciound);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 5;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 11;
		gbc_textField_2.gridy = 7;
		getContentPane().add(textField_2, gbc_textField_2);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblDetalles = new JLabel("Detalles");
		GridBagConstraints gbc_lblDetalles = new GridBagConstraints();
		gbc_lblDetalles.insets = new Insets(0, 0, 5, 5);
		gbc_lblDetalles.gridx = 7;
		gbc_lblDetalles.gridy = 9;
		getContentPane().add(lblDetalles, gbc_lblDetalles);
		GridBagConstraints gbc_btnValidar = new GridBagConstraints();
		gbc_btnValidar.insets = new Insets(0, 0, 5, 5);
		gbc_btnValidar.gridx = 19;
		gbc_btnValidar.gridy = 13;
		getContentPane().add(btnValidar, gbc_btnValidar);

	}

}
