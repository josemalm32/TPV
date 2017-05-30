package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.PrincipalUI;

public class controlPrincipal extends PrincipalUI {
	
	public controlPrincipal(){
		super();
		
		mntmAadirArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("Gauaya");
			}
		});
		
		
	}
	
	


}
