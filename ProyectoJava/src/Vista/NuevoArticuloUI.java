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
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;

public class NuevoArticuloUI extends JInternalFrame {
	protected JTextField idTexField;
	protected JTextField nombreText;
	protected JTextField PrecioText;
	protected JButton btnValidar;
	protected JTextPane DetallePane;
	
	public NuevoArticuloUI() {
		setTitle("Nuevo Articulo");
		setBounds(100, 100, 633, 435);
		getContentPane().setLayout(new MigLayout("", "[76px][161.00px][][][][][][][][][][][]", "[26px][][20px][23px][23px][20px][14px][][][][][][][][][][][][][]"));
		
		JLabel lblId = new JLabel("ID");
		getContentPane().add(lblId, "cell 0 1,alignx right,aligny center");
		
		idTexField = new JTextField();
		idTexField.setColumns(10);
		getContentPane().add(idTexField, "cell 1 1,growx,aligny center");
		
		JLabel lblAltaArticulos = new JLabel("Alta Articulos");
		lblAltaArticulos.setFont(new Font("Tahoma", Font.PLAIN, 42));
		getContentPane().add(lblAltaArticulos, "cell 10 1,alignx center");
		
		JLabel lblNombreArticulo = new JLabel("Nombre Articulo");
		getContentPane().add(lblNombreArticulo, "cell 0 2,alignx left,aligny center");
		
		nombreText = new JTextField();
		nombreText.setColumns(10);
		getContentPane().add(nombreText, "cell 1 2,growx,aligny bottom");
		
		JLabel lblPreciound = new JLabel("Precio/Und");
		getContentPane().add(lblPreciound, "cell 0 3,alignx right,aligny center");
		
		PrecioText = new JTextField();
		PrecioText.setColumns(10);
		getContentPane().add(PrecioText, "cell 1 3,growx,aligny top");
		
		btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btnValidar, "cell 7 3,alignx left,aligny top");
		
		JButton btnCancelar = new JButton("Cancelar");
		getContentPane().add(btnCancelar, "cell 10 3,alignx left,aligny top");
		
		JLabel lblDetalles = new JLabel("Detalles");
		getContentPane().add(lblDetalles, "cell 0 4,alignx right,aligny center");
		
		 DetallePane = new JTextPane();
		getContentPane().add(DetallePane, "cell 1 4 10 16,grow");

	}

}
