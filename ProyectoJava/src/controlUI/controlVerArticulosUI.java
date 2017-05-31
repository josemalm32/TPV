package controlUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VerArticulosUI;

@SuppressWarnings("serial")
public class controlVerArticulosUI extends VerArticulosUI{

	
	private controlSelecionaClienteUI controlSelecionaClienteUI; 
	private int ID;
	
	
	public controlVerArticulosUI() {
		super();
	
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlSelecionaClienteUI = new controlSelecionaClienteUI();
				}
		});
	}

	
	
	
	
	
	
	
}
