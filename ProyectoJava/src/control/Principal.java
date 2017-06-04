package control;

import java.awt.EventQueue;

import javax.swing.UIManager;

import controlUI.controlPrincipal;


public class Principal {

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controlPrincipal frame = new controlPrincipal();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
	}
	
	
}
