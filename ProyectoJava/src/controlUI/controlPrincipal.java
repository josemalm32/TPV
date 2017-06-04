package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Vista.NuevoArticuloUI;
import Vista.PrincipalUI;
import Vista.VerArticulosUI;

public class controlPrincipal extends PrincipalUI {
	
	public controlPrincipal(){
		super();
		
		
		mntmAadirArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlNuevoArticuloUI nuevoArticuloUI = new controlNuevoArticuloUI();
				nuevoArticuloUI.setResizable(true);
				nuevoArticuloUI.setClosable(true);
				 nuevoArticuloUI.pack();
				 desktopPane.add(nuevoArticuloUI);
				 nuevoArticuloUI.setVisible(true);
			}
		});
		
		
		mntmConsultarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlVerArticulosUI verArticulosUI = new controlVerArticulosUI();
				verArticulosUI.setResizable(true);
				verArticulosUI.setClosable(true);
				verArticulosUI.pack();
				 desktopPane.add(verArticulosUI);
				 verArticulosUI.setVisible(true);
			}
		});
		
		
		
		
	}
	
	



}
