package control.logica;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Modelo.Articulo;
import Modelo.DAO;
import utiles.Constantes;
import utiles.Tipo;

public class GestorCRUDArticulos {

	private ArrayList<Articulo> listaArticulos;

	@SuppressWarnings("unchecked")
	public GestorCRUDArticulos() {
		if (new File("articulos.dat").exists()) {
			listaArticulos = (ArrayList<Articulo>) new DAO().leer("articulos.dat", true);
		} else {
			try {
				new File("articulos.dat").createNewFile();
				listaArticulos = new ArrayList<Articulo>();
			} catch (IOException e) {
				if (Constantes.errores) {
					System.out.println("No se ha podido crear el archivo");
				}
			}
		}
	}

	public ArrayList<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public int devuelveID() {
		return listaArticulos.size();
	}

	public boolean escribeObjeto(Articulo articulo) {
		listaArticulos.add(articulo);
		return new DAO().grabar(listaArticulos, Tipo.articulo.getRuta(), true);
	}

}
