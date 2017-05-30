package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Vista.NuevoArticuloUI;
import Vista.PrincipalUI;

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
		
		
	}
	
	


}
