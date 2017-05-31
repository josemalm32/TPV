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
			
				NuevoArticuloUI nuevoArticuloUI = new NuevoArticuloUI();
				nuevoArticuloUI.setResizable(false);
				nuevoArticuloUI.setClosable(true);
				 nuevoArticuloUI.pack();
				 desktopPane.add(nuevoArticuloUI);
				 nuevoArticuloUI.setVisible(true);
			}
		});
		
		
		mntmConsultarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlVerArticulosUI verArticulosUI = new controlVerArticulosUI();
				verArticulosUI.setResizable(false);
				verArticulosUI.setClosable(true);
				verArticulosUI.pack();
				 desktopPane.add(verArticulosUI);
				 verArticulosUI.setVisible(true);
			}
		});
		
		
		
		
	}
	
	



}
