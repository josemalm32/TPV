package Modelo;

import java.io.Serializable;

public class Articulo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int ID;
	private String Nombre;
	private String Apellidos; 
	private float Precio;
	
	public Articulo(int iD, String nombre, String apellidos, float precio) {
		super();
		ID = iD;
		Nombre = nombre;
		Apellidos = apellidos;
		Precio = precio;
	}

	public int getID() {
		return ID;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public float getPrecio() {
		return Precio;
	}
}
