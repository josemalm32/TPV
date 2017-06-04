package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;

import Modelo.Articulo;
import Vista.VerArticulosUI;
import control.logica.GestorCRUDArticulos;

@SuppressWarnings("serial")
public class controlVerArticulosUI extends VerArticulosUI{

	
	
	private int ID;
	
	
	public controlVerArticulosUI() {
		super();
		GestorCRUDArticulos gestorCRUDArticulos = new GestorCRUDArticulos();
		
		comboBox.setModel(new DefaultComboBoxModel<String>());
		for (Articulo item : gestorCRUDArticulos.getListaArticulos()) {
			comboBox.addItem(item.getID() + " - " +item.getNombre() + " - " + item.getPrecio());
		}
		
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
			Articulo articulo = gestorCRUDArticulos.getListaArticulos().get(comboBox.getSelectedIndex());

			textField.setText(String.valueOf(articulo.getID()));
			textField_1.setText(articulo.getNombre());
			textField_2.setText(String.valueOf(articulo.getPrecio()));	
			txtrS.setText(articulo.getDetalles());
			}
		});
		
		
	}

	
	
	
	
	
	
	
}
